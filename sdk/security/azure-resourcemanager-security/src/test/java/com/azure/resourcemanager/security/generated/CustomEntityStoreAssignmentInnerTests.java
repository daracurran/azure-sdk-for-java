// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.CustomEntityStoreAssignmentInner;
import org.junit.jupiter.api.Assertions;

public final class CustomEntityStoreAssignmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEntityStoreAssignmentInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"principal\":\"ipjoxzjnchgejs\",\"entityStoreDatabaseLink\":\"dmailzydehojw\"},\"id\":\"ahuxinpm\",\"name\":\"njaqwixjspro\",\"type\":\"vcputegj\"}")
                .toObject(CustomEntityStoreAssignmentInner.class);
        Assertions.assertEquals("ipjoxzjnchgejs", model.principal());
        Assertions.assertEquals("dmailzydehojw", model.entityStoreDatabaseLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEntityStoreAssignmentInner model =
            new CustomEntityStoreAssignmentInner()
                .withPrincipal("ipjoxzjnchgejs")
                .withEntityStoreDatabaseLink("dmailzydehojw");
        model = BinaryData.fromObject(model).toObject(CustomEntityStoreAssignmentInner.class);
        Assertions.assertEquals("ipjoxzjnchgejs", model.principal());
        Assertions.assertEquals("dmailzydehojw", model.entityStoreDatabaseLink());
    }
}
