// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Details for log generated during copy. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "copyLogDetailsType",
    defaultImpl = CopyLogDetails.class)
@JsonTypeName("CopyLogDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataBox", value = DataBoxAccountCopyLogDetails.class),
    @JsonSubTypes.Type(name = "DataBoxDisk", value = DataBoxDiskCopyLogDetails.class),
    @JsonSubTypes.Type(name = "DataBoxHeavy", value = DataBoxHeavyAccountCopyLogDetails.class)
})
@Immutable
public class CopyLogDetails {
    /** Creates an instance of CopyLogDetails class. */
    public CopyLogDetails() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
