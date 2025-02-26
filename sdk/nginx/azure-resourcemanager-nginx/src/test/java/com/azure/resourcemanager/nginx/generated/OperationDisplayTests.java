// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationDisplayTests {
    @Test
    public void testDeserialize() {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"ev\",\"resource\":\"ggzfbu\",\"operation\":\"mvfaxkffeiith\",\"description\":\"m\"}")
                .toObject(OperationDisplay.class);
        Assertions.assertEquals("ev", model.provider());
        Assertions.assertEquals("ggzfbu", model.resource());
        Assertions.assertEquals("mvfaxkffeiith", model.operation());
        Assertions.assertEquals("m", model.description());
    }

    @Test
    public void testSerialize() {
        OperationDisplay model =
            new OperationDisplay()
                .withProvider("ev")
                .withResource("ggzfbu")
                .withOperation("mvfaxkffeiith")
                .withDescription("m");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("ev", model.provider());
        Assertions.assertEquals("ggzfbu", model.resource());
        Assertions.assertEquals("mvfaxkffeiith", model.operation());
        Assertions.assertEquals("m", model.description());
    }
}
