// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxFrontendIpConfiguration;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAddress;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAllocationMethod;
import com.azure.resourcemanager.nginx.models.NginxPublicIpAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxFrontendIpConfigurationTests {
    @Test
    public void testDeserialize() {
        NginxFrontendIpConfiguration model =
            BinaryData
                .fromString(
                    "{\"publicIPAddresses\":[{\"id\":\"kirsoodqxhc\"},{\"id\":\"nohjt\"},{\"id\":\"whdsoifiyip\"}],\"privateIPAddresses\":[{\"privateIPAddress\":\"wpgrjbzno\",\"privateIPAllocationMethod\":\"Dynamic\",\"subnetId\":\"vsnb\"},{\"privateIPAddress\":\"qabnmoc\",\"privateIPAllocationMethod\":\"Static\",\"subnetId\":\"hurzafblj\"}]}")
                .toObject(NginxFrontendIpConfiguration.class);
        Assertions.assertEquals("kirsoodqxhc", model.publicIpAddresses().get(0).id());
        Assertions.assertEquals("wpgrjbzno", model.privateIpAddresses().get(0).privateIpAddress());
        Assertions
            .assertEquals(
                NginxPrivateIpAllocationMethod.DYNAMIC, model.privateIpAddresses().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("vsnb", model.privateIpAddresses().get(0).subnetId());
    }

    @Test
    public void testSerialize() {
        NginxFrontendIpConfiguration model =
            new NginxFrontendIpConfiguration()
                .withPublicIpAddresses(
                    Arrays
                        .asList(
                            new NginxPublicIpAddress().withId("kirsoodqxhc"),
                            new NginxPublicIpAddress().withId("nohjt"),
                            new NginxPublicIpAddress().withId("whdsoifiyip")))
                .withPrivateIpAddresses(
                    Arrays
                        .asList(
                            new NginxPrivateIpAddress()
                                .withPrivateIpAddress("wpgrjbzno")
                                .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.DYNAMIC)
                                .withSubnetId("vsnb"),
                            new NginxPrivateIpAddress()
                                .withPrivateIpAddress("qabnmoc")
                                .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.STATIC)
                                .withSubnetId("hurzafblj")));
        model = BinaryData.fromObject(model).toObject(NginxFrontendIpConfiguration.class);
        Assertions.assertEquals("kirsoodqxhc", model.publicIpAddresses().get(0).id());
        Assertions.assertEquals("wpgrjbzno", model.privateIpAddresses().get(0).privateIpAddress());
        Assertions
            .assertEquals(
                NginxPrivateIpAllocationMethod.DYNAMIC, model.privateIpAddresses().get(0).privateIpAllocationMethod());
        Assertions.assertEquals("vsnb", model.privateIpAddresses().get(0).subnetId());
    }
}
