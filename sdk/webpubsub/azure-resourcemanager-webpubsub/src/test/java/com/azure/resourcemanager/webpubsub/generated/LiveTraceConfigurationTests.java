// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.LiveTraceCategory;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiveTraceConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveTraceConfiguration model =
            BinaryData
                .fromString(
                    "{\"enabled\":\"mkfssxqukkfplgm\",\"categories\":[{\"name\":\"kjz\",\"enabled\":\"es\"},{\"name\":\"vlopwiyighx\",\"enabled\":\"dwzbaiue\"},{\"name\":\"a\",\"enabled\":\"nyqupedeojnabck\"}]}")
                .toObject(LiveTraceConfiguration.class);
        Assertions.assertEquals("mkfssxqukkfplgm", model.enabled());
        Assertions.assertEquals("kjz", model.categories().get(0).name());
        Assertions.assertEquals("es", model.categories().get(0).enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveTraceConfiguration model =
            new LiveTraceConfiguration()
                .withEnabled("mkfssxqukkfplgm")
                .withCategories(
                    Arrays
                        .asList(
                            new LiveTraceCategory().withName("kjz").withEnabled("es"),
                            new LiveTraceCategory().withName("vlopwiyighx").withEnabled("dwzbaiue"),
                            new LiveTraceCategory().withName("a").withEnabled("nyqupedeojnabck")));
        model = BinaryData.fromObject(model).toObject(LiveTraceConfiguration.class);
        Assertions.assertEquals("mkfssxqukkfplgm", model.enabled());
        Assertions.assertEquals("kjz", model.categories().get(0).name());
        Assertions.assertEquals("es", model.categories().get(0).enabled());
    }
}
