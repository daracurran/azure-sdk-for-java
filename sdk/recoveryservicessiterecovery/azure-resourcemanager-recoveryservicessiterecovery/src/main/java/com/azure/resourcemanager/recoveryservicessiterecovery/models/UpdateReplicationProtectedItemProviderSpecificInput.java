// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Update replication protected item provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = UpdateReplicationProtectedItemProviderSpecificInput.class)
@JsonTypeName("UpdateApplianceForReplicationProtectedItemProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmUpdateApplianceForReplicationProtectedItemInput.class)
})
@Immutable
public class UpdateReplicationProtectedItemProviderSpecificInput {
    /** Creates an instance of UpdateReplicationProtectedItemProviderSpecificInput class. */
    public UpdateReplicationProtectedItemProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
