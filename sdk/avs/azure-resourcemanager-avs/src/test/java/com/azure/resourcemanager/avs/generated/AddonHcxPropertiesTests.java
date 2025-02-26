// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.AddonHcxProperties;
import org.junit.jupiter.api.Assertions;

public final class AddonHcxPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AddonHcxProperties model =
            BinaryData
                .fromString("{\"addonType\":\"HCX\",\"offer\":\"tedltmmj\",\"provisioningState\":\"Succeeded\"}")
                .toObject(AddonHcxProperties.class);
        Assertions.assertEquals("tedltmmj", model.offer());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AddonHcxProperties model = new AddonHcxProperties().withOffer("tedltmmj");
        model = BinaryData.fromObject(model).toObject(AddonHcxProperties.class);
        Assertions.assertEquals("tedltmmj", model.offer());
    }
}
