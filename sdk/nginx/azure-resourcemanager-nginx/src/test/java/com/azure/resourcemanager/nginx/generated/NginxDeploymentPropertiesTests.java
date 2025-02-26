// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxDeploymentProperties;
import com.azure.resourcemanager.nginx.models.NginxFrontendIpConfiguration;
import com.azure.resourcemanager.nginx.models.NginxLogging;
import com.azure.resourcemanager.nginx.models.NginxNetworkInterfaceConfiguration;
import com.azure.resourcemanager.nginx.models.NginxNetworkProfile;
import com.azure.resourcemanager.nginx.models.NginxStorageAccount;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxDeploymentPropertiesTests {
    @Test
    public void testDeserialize() {
        NginxDeploymentProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"nginxVersion\":\"tbvpysszdnru\",\"managedResourceGroup\":\"guhmuouqfpr\",\"networkProfile\":{\"frontEndIPConfiguration\":{\"publicIPAddresses\":[],\"privateIPAddresses\":[]},\"networkInterfaceConfiguration\":{\"subnetId\":\"nwui\"}},\"ipAddress\":\"a\",\"enableDiagnosticsSupport\":true,\"logging\":{\"storageAccount\":{\"accountName\":\"uckyf\",\"containerName\":\"rfidfvzwdz\"}}}")
                .toObject(NginxDeploymentProperties.class);
        Assertions.assertEquals("guhmuouqfpr", model.managedResourceGroup());
        Assertions.assertEquals("nwui", model.networkProfile().networkInterfaceConfiguration().subnetId());
        Assertions.assertEquals(true, model.enableDiagnosticsSupport());
        Assertions.assertEquals("uckyf", model.logging().storageAccount().accountName());
        Assertions.assertEquals("rfidfvzwdz", model.logging().storageAccount().containerName());
    }

    @Test
    public void testSerialize() {
        NginxDeploymentProperties model =
            new NginxDeploymentProperties()
                .withManagedResourceGroup("guhmuouqfpr")
                .withNetworkProfile(
                    new NginxNetworkProfile()
                        .withFrontEndIpConfiguration(
                            new NginxFrontendIpConfiguration()
                                .withPublicIpAddresses(Arrays.asList())
                                .withPrivateIpAddresses(Arrays.asList()))
                        .withNetworkInterfaceConfiguration(
                            new NginxNetworkInterfaceConfiguration().withSubnetId("nwui")))
                .withEnableDiagnosticsSupport(true)
                .withLogging(
                    new NginxLogging()
                        .withStorageAccount(
                            new NginxStorageAccount().withAccountName("uckyf").withContainerName("rfidfvzwdz")));
        model = BinaryData.fromObject(model).toObject(NginxDeploymentProperties.class);
        Assertions.assertEquals("guhmuouqfpr", model.managedResourceGroup());
        Assertions.assertEquals("nwui", model.networkProfile().networkInterfaceConfiguration().subnetId());
        Assertions.assertEquals(true, model.enableDiagnosticsSupport());
        Assertions.assertEquals("uckyf", model.logging().storageAccount().accountName());
        Assertions.assertEquals("rfidfvzwdz", model.logging().storageAccount().containerName());
    }
}
