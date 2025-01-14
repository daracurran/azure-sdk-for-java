// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.elastic.models.LogRules;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoringTagRulesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoringTagRulesInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Canceled\",\"logRules\":{\"sendAadLogs\":true,\"sendSubscriptionLogs\":true,\"sendActivityLogs\":true,\"filteringTags\":[]}},\"id\":\"rjb\",\"name\":\"norcjxvsnbyxqab\",\"type\":\"mocpc\"}")
                .toObject(MonitoringTagRulesInner.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(true, model.properties().logRules().sendAadLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendActivityLogs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoringTagRulesInner model =
            new MonitoringTagRulesInner()
                .withProperties(
                    new MonitoringTagRulesProperties()
                        .withProvisioningState(ProvisioningState.CANCELED)
                        .withLogRules(
                            new LogRules()
                                .withSendAadLogs(true)
                                .withSendSubscriptionLogs(true)
                                .withSendActivityLogs(true)
                                .withFilteringTags(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(MonitoringTagRulesInner.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(true, model.properties().logRules().sendAadLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(true, model.properties().logRules().sendActivityLogs());
    }
}
