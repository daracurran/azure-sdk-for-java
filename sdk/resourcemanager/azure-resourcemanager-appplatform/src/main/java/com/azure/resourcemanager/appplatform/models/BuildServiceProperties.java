// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build service resource properties payload. */
@Fluent
public final class BuildServiceProperties {
    /*
     * The installed KPack version in this build service.
     */
    @JsonProperty(value = "kPackVersion")
    private String kPackVersion;

    /*
     * Provisioning state of the KPack build result
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BuildServiceProvisioningState provisioningState;

    /*
     * The runtime resource configuration of this build service.
     */
    @JsonProperty(value = "resourceRequests")
    private BuildServicePropertiesResourceRequests resourceRequests;

    /**
     * Get the kPackVersion property: The installed KPack version in this build service.
     *
     * @return the kPackVersion value.
     */
    public String kPackVersion() {
        return this.kPackVersion;
    }

    /**
     * Set the kPackVersion property: The installed KPack version in this build service.
     *
     * @param kPackVersion the kPackVersion value to set.
     * @return the BuildServiceProperties object itself.
     */
    public BuildServiceProperties withKPackVersion(String kPackVersion) {
        this.kPackVersion = kPackVersion;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the KPack build result.
     *
     * @return the provisioningState value.
     */
    public BuildServiceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceRequests property: The runtime resource configuration of this build service.
     *
     * @return the resourceRequests value.
     */
    public BuildServicePropertiesResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Set the resourceRequests property: The runtime resource configuration of this build service.
     *
     * @param resourceRequests the resourceRequests value to set.
     * @return the BuildServiceProperties object itself.
     */
    public BuildServiceProperties withResourceRequests(BuildServicePropertiesResourceRequests resourceRequests) {
        this.resourceRequests = resourceRequests;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
    }
}
