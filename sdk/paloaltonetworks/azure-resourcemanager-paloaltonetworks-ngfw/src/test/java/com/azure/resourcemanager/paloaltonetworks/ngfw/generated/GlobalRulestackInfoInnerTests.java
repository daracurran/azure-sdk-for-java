// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.GlobalRulestackInfoInner;
import org.junit.jupiter.api.Assertions;

public final class GlobalRulestackInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GlobalRulestackInfoInner model =
            BinaryData.fromString("{\"azureId\":\"ssnrbgye\"}").toObject(GlobalRulestackInfoInner.class);
        Assertions.assertEquals("ssnrbgye", model.azureId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GlobalRulestackInfoInner model = new GlobalRulestackInfoInner().withAzureId("ssnrbgye");
        model = BinaryData.fromObject(model).toObject(GlobalRulestackInfoInner.class);
        Assertions.assertEquals("ssnrbgye", model.azureId());
    }
}
