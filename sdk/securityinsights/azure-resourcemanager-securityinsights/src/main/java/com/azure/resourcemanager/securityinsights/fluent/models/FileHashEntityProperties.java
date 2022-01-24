// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.azure.resourcemanager.securityinsights.models.FileHashAlgorithm;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FileHash entity property bag. */
@Immutable
public final class FileHashEntityProperties extends EntityCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileHashEntityProperties.class);

    /*
     * The hash algorithm type.
     */
    @JsonProperty(value = "algorithm", access = JsonProperty.Access.WRITE_ONLY)
    private FileHashAlgorithm algorithm;

    /*
     * The file hash value.
     */
    @JsonProperty(value = "hashValue", access = JsonProperty.Access.WRITE_ONLY)
    private String hashValue;

    /**
     * Get the algorithm property: The hash algorithm type.
     *
     * @return the algorithm value.
     */
    public FileHashAlgorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Get the hashValue property: The file hash value.
     *
     * @return the hashValue value.
     */
    public String hashValue() {
        return this.hashValue;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}