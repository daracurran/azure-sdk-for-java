// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupDetailsInner;
import com.azure.resourcemanager.netapp.models.ApplicationType;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import com.azure.resourcemanager.netapp.models.VolumeGroupVolumeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeGroupDetailsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeGroupDetailsInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"euyowqkd\",\"id\":\"t\",\"name\":\"ib\",\"type\":\"cgpik\",\"properties\":{\"provisioningState\":\"mejzanlfzxia\",\"groupMetaData\":{\"groupDescription\":\"bzonok\",\"applicationType\":\"SAP-HANA\",\"applicationIdentifier\":\"q\",\"globalPlacementRules\":[],\"deploymentSpecId\":\"zpfrla\",\"volumesCount\":4530556699982687099},\"volumes\":[{\"name\":\"ylwbtlhflsjcdhsz\",\"tags\":{},\"id\":\"pwp\",\"type\":\"jvfbgofelja\"},{\"name\":\"ueluqhhahhxvrhmz\",\"tags\":{},\"id\":\"nalghfkvtvsexso\",\"type\":\"wpjgwws\"}]}}")
                .toObject(VolumeGroupDetailsInner.class);
        Assertions.assertEquals("euyowqkd", model.location());
        Assertions.assertEquals("bzonok", model.groupMetadata().groupDescription());
        Assertions.assertEquals(ApplicationType.SAP_HANA, model.groupMetadata().applicationType());
        Assertions.assertEquals("q", model.groupMetadata().applicationIdentifier());
        Assertions.assertEquals("zpfrla", model.groupMetadata().deploymentSpecId());
        Assertions.assertEquals("ylwbtlhflsjcdhsz", model.volumes().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeGroupDetailsInner model =
            new VolumeGroupDetailsInner()
                .withLocation("euyowqkd")
                .withGroupMetadata(
                    new VolumeGroupMetadata()
                        .withGroupDescription("bzonok")
                        .withApplicationType(ApplicationType.SAP_HANA)
                        .withApplicationIdentifier("q")
                        .withGlobalPlacementRules(Arrays.asList())
                        .withDeploymentSpecId("zpfrla"))
                .withVolumes(
                    Arrays
                        .asList(
                            new VolumeGroupVolumeProperties().withName("ylwbtlhflsjcdhsz").withTags(mapOf()),
                            new VolumeGroupVolumeProperties().withName("ueluqhhahhxvrhmz").withTags(mapOf())));
        model = BinaryData.fromObject(model).toObject(VolumeGroupDetailsInner.class);
        Assertions.assertEquals("euyowqkd", model.location());
        Assertions.assertEquals("bzonok", model.groupMetadata().groupDescription());
        Assertions.assertEquals(ApplicationType.SAP_HANA, model.groupMetadata().applicationType());
        Assertions.assertEquals("q", model.groupMetadata().applicationIdentifier());
        Assertions.assertEquals("zpfrla", model.groupMetadata().deploymentSpecId());
        Assertions.assertEquals("ylwbtlhflsjcdhsz", model.volumes().get(0).name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
