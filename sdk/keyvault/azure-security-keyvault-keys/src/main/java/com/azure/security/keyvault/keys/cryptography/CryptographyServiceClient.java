// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.cryptography.implementation.CryptographyService;
import com.azure.security.keyvault.keys.cryptography.implementation.KeyOperationParameters;
import com.azure.security.keyvault.keys.cryptography.implementation.KeyOperationResult;
import com.azure.security.keyvault.keys.cryptography.implementation.KeySignRequest;
import com.azure.security.keyvault.keys.cryptography.implementation.KeyVerifyRequest;
import com.azure.security.keyvault.keys.cryptography.implementation.KeyWrapUnwrapRequest;
import com.azure.security.keyvault.keys.cryptography.implementation.SecretKey;
import com.azure.security.keyvault.keys.cryptography.implementation.SecretRequestAttributes;
import com.azure.security.keyvault.keys.cryptography.implementation.SecretRequestParameters;
import com.azure.security.keyvault.keys.cryptography.models.DecryptParameters;
import com.azure.security.keyvault.keys.cryptography.models.DecryptResult;
import com.azure.security.keyvault.keys.cryptography.models.EncryptParameters;
import com.azure.security.keyvault.keys.cryptography.models.EncryptResult;
import com.azure.security.keyvault.keys.cryptography.models.EncryptionAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignResult;
import com.azure.security.keyvault.keys.cryptography.models.SignatureAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.UnwrapResult;
import com.azure.security.keyvault.keys.cryptography.models.VerifyResult;
import com.azure.security.keyvault.keys.cryptography.models.WrapResult;
import com.azure.security.keyvault.keys.models.JsonWebKey;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyType;
import com.azure.security.keyvault.keys.models.KeyVaultKey;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

class CryptographyServiceClient {
    private static final ClientLogger LOGGER = new ClientLogger(CryptographyServiceClient.class);
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final CryptographyService service;
    private final String keyId;

    private String keyName;
    private String vaultUrl;
    private String version;

    static final String ACCEPT_LANGUAGE = "en-US";
    static final String CONTENT_TYPE_HEADER_VALUE = "application/json";

    final String apiVersion;

    CryptographyServiceClient(String keyId, CryptographyService service, CryptographyServiceVersion serviceVersion) {
        Objects.requireNonNull(keyId);
        unpackId(keyId);

        this.keyId = keyId;
        this.service = service;
        apiVersion = serviceVersion.getVersion();
    }

    String getVaultUrl() {
        return vaultUrl;
    }

    Mono<Response<KeyVaultKey>> getKey(Context context) {
        if (version == null) {
            version = "";
        }

        return getKey(keyName, version, context);
    }

    private Mono<Response<KeyVaultKey>> getKey(String name, String version, Context context) {
        context = context == null ? Context.NONE : context;

        return service.getKey(vaultUrl, name, version, apiVersion, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Retrieving key - {}", name))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved key - {}", response.getValue().getName()))
            .doOnError(error -> LOGGER.warning("Failed to get key - {}", name, error));
    }

    Mono<Response<JsonWebKey>> getSecretKey(Context context) {
        return service.getSecret(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE,
                context)
            .doOnRequest(ignored -> LOGGER.verbose("Retrieving key - {}", keyName))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved key - {}", response.getValue().getName()))
            .doOnError(error -> LOGGER.warning("Failed to get key - {}", keyName, error))
            .flatMap((stringResponse -> {
                try {
                    return Mono.just(new SimpleResponse<>(stringResponse.getRequest(),
                        stringResponse.getStatusCode(),
                        stringResponse.getHeaders(), transformSecretKey(stringResponse.getValue())));
                } catch (JsonProcessingException e) {
                    return Mono.error(e);
                }
            }));
    }

    Mono<Response<SecretKey>> setSecretKey(SecretKey secret, Context context) {
        Objects.requireNonNull(secret, "The Secret input parameter cannot be null.");

        SecretRequestParameters parameters = new SecretRequestParameters()
            .setValue(secret.getValue())
            .setTags(secret.getProperties().getTags())
            .setContentType(secret.getProperties().getContentType())
            .setSecretAttributes(new SecretRequestAttributes(secret.getProperties()));
        context = context == null ? Context.NONE : context;

        return service.setSecret(vaultUrl, secret.getName(), apiVersion, ACCEPT_LANGUAGE, parameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Setting secret - {}", secret.getName()))
            .doOnSuccess(response -> LOGGER.verbose("Set secret - {}", response.getValue().getName()))
            .doOnError(error -> LOGGER.warning("Failed to set secret - {}", secret.getName(), error));
    }

    JsonWebKey transformSecretKey(SecretKey secretKey) throws JsonProcessingException {
        ObjectNode rootNode = MAPPER.createObjectNode();
        ArrayNode a = MAPPER.createArrayNode();

        a.add(KeyOperation.WRAP_KEY.toString());
        a.add(KeyOperation.UNWRAP_KEY.toString());
        a.add(KeyOperation.ENCRYPT.toString());
        a.add(KeyOperation.DECRYPT.toString());

        rootNode.put("k", Base64.getUrlDecoder().decode(secretKey.getValue()));
        rootNode.put("kid", this.keyId);
        rootNode.put("kty", KeyType.OCT.toString());
        rootNode.set("key_ops", a);

        return MAPPER.treeToValue(rootNode, JsonWebKey.class);
    }

    Mono<EncryptResult> encrypt(EncryptionAlgorithm algorithm, byte[] plaintext, Context context) {
        Objects.requireNonNull(algorithm, "'algorithm' cannot be null.");
        Objects.requireNonNull(plaintext, "'plaintext' cannot be null.");

        KeyOperationParameters parameters = new KeyOperationParameters()
            .setAlgorithm(algorithm)
            .setValue(plaintext);
        context = context == null ? Context.NONE : context;

        return encrypt(parameters, context);
    }

    Mono<EncryptResult> encrypt(EncryptParameters encryptParameters, Context context) {
        Objects.requireNonNull(encryptParameters, "'encryptParameters' cannot be null.");

        KeyOperationParameters parameters = new KeyOperationParameters()
            .setAlgorithm(encryptParameters.getAlgorithm())
            .setValue(encryptParameters.getPlainText())
            .setIv(encryptParameters.getIv())
            .setAdditionalAuthenticatedData(encryptParameters.getAdditionalAuthenticatedData());
        context = context == null ? Context.NONE : context;

        return encrypt(parameters, context);
    }

    private Mono<EncryptResult> encrypt(KeyOperationParameters keyOperationParameters, Context context) {
        EncryptionAlgorithm algorithm = keyOperationParameters.getAlgorithm();
        context = context == null ? Context.NONE : context;

        return service.encrypt(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, keyOperationParameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Encrypting content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved encrypted content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to encrypt content with algorithm - {}", algorithm, error))
            .map(keyOperationResultResponse -> {
                KeyOperationResult keyOperationResult = keyOperationResultResponse.getValue();

                return new EncryptResult(keyOperationResult.getResult(), algorithm, keyId,
                    keyOperationResult.getIv(), keyOperationResult.getAuthenticationTag(),
                    keyOperationResult.getAdditionalAuthenticatedData());
            });
    }

    Mono<DecryptResult> decrypt(EncryptionAlgorithm algorithm, byte[] ciphertext, Context context) {
        Objects.requireNonNull(algorithm, "'algorithm' cannot be null.");
        Objects.requireNonNull(ciphertext, "'ciphertext' cannot be null.");

        KeyOperationParameters parameters = new KeyOperationParameters()
            .setAlgorithm(algorithm)
            .setValue(ciphertext);
        context = context == null ? Context.NONE : context;

        return decrypt(parameters, context);
    }

    Mono<DecryptResult> decrypt(DecryptParameters decryptParameters, Context context) {
        Objects.requireNonNull(decryptParameters, "'decryptParameters' cannot be null.");

        KeyOperationParameters parameters = new KeyOperationParameters()
            .setAlgorithm(decryptParameters.getAlgorithm())
            .setValue(decryptParameters.getCipherText())
            .setIv(decryptParameters.getIv())
            .setAdditionalAuthenticatedData(decryptParameters.getAdditionalAuthenticatedData())
            .setAuthenticationTag(decryptParameters.getAuthenticationTag());
        context = context == null ? Context.NONE : context;

        return decrypt(parameters, context);
    }

    private Mono<DecryptResult> decrypt(KeyOperationParameters keyOperationParameters, Context context) {
        Objects.requireNonNull(keyOperationParameters, "'decryptParameters' cannot be null.");

        EncryptionAlgorithm algorithm = keyOperationParameters.getAlgorithm();
        context = context == null ? Context.NONE : context;

        return service.decrypt(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, keyOperationParameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Decrypting content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved decrypted content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to decrypt content with algorithm - {}", algorithm, error))
            .flatMap(keyOperationResultResponse -> Mono.just(
                new DecryptResult(keyOperationResultResponse.getValue().getResult(), algorithm, keyId)));
    }

    Mono<SignResult> sign(SignatureAlgorithm algorithm, byte[] digest, Context context) {
        KeySignRequest parameters = new KeySignRequest()
            .setAlgorithm(algorithm)
            .setValue(digest);
        context = context == null ? Context.NONE : context;

        return service.sign(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, parameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Signing content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved signed content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to sign content with algorithm - {}", algorithm, error))
            .flatMap(keyOperationResultResponse ->
                Mono.just(new SignResult(keyOperationResultResponse.getValue().getResult(), algorithm, keyId)));
    }

    Mono<VerifyResult> verify(SignatureAlgorithm algorithm, byte[] digest, byte[] signature, Context context) {
        KeyVerifyRequest parameters = new KeyVerifyRequest()
            .setAlgorithm(algorithm)
            .setDigest(digest)
            .setSignature(signature);
        context = context == null ? Context.NONE : context;

        return service.verify(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, parameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Verifying content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved verified content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to verify content with algorithm - {}", algorithm, error))
            .flatMap(response -> Mono.just(new VerifyResult(response.getValue().getValue(), algorithm, keyId)));
    }

    Mono<WrapResult> wrapKey(KeyWrapAlgorithm algorithm, byte[] key, Context context) {
        KeyWrapUnwrapRequest parameters = new KeyWrapUnwrapRequest()
            .setAlgorithm(algorithm)
            .setValue(key);
        context = context == null ? Context.NONE : context;

        return service.wrapKey(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, parameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Wrapping key content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved wrapped key content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to verify content with algorithm - {}", algorithm, error))
            .flatMap(keyOperationResultResponse ->
                Mono.just(new WrapResult(keyOperationResultResponse.getValue().getResult(), algorithm, keyId)));
    }

    Mono<UnwrapResult> unwrapKey(KeyWrapAlgorithm algorithm, byte[] encryptedKey, Context context) {
        KeyWrapUnwrapRequest parameters = new KeyWrapUnwrapRequest()
            .setAlgorithm(algorithm)
            .setValue(encryptedKey);
        context = context == null ? Context.NONE : context;

        return service.unwrapKey(vaultUrl, keyName, version, apiVersion, ACCEPT_LANGUAGE, parameters,
                CONTENT_TYPE_HEADER_VALUE, context)
            .doOnRequest(ignored -> LOGGER.verbose("Unwrapping key content with algorithm - {}", algorithm))
            .doOnSuccess(response -> LOGGER.verbose("Retrieved unwrapped key content with algorithm - {}", algorithm))
            .doOnError(error -> LOGGER.warning("Failed to unwrap key content with algorithm - {}", algorithm, error))
            .flatMap(response -> Mono.just(new UnwrapResult(response.getValue().getResult(), algorithm, keyId)));
    }


    Mono<SignResult> signData(SignatureAlgorithm algorithm, byte[] data, Context context) {
        try {
            HashAlgorithm hashAlgorithm = SignatureHashResolver.DEFAULT.get(algorithm);
            MessageDigest md = MessageDigest.getInstance(hashAlgorithm.toString());
            md.update(data);
            byte[] digest = md.digest();

            return sign(algorithm, digest, context);
        } catch (NoSuchAlgorithmException e) {
            return Mono.error(e);
        }
    }

    Mono<VerifyResult> verifyData(SignatureAlgorithm algorithm, byte[] data, byte[] signature, Context context) {
        try {
            HashAlgorithm hashAlgorithm = SignatureHashResolver.DEFAULT.get(algorithm);
            MessageDigest md = MessageDigest.getInstance(hashAlgorithm.toString());
            md.update(data);
            byte[] digest = md.digest();

            return verify(algorithm, digest, signature, context);
        } catch (NoSuchAlgorithmException e) {
            return Mono.error(e);
        }
    }

    private void unpackId(String keyId) {
        if (keyId != null && keyId.length() > 0) {
            try {
                URL url = new URL(keyId);
                String[] tokens = url.getPath().split("/");
                this.vaultUrl = url.getProtocol() + "://" + url.getHost();

                if (url.getPort() != -1) {
                    this.vaultUrl += ":" + url.getPort();
                }

                this.keyName = (tokens.length >= 3 ? tokens[2] : null);
                this.version = (tokens.length >= 4 ? tokens[3] : "");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
