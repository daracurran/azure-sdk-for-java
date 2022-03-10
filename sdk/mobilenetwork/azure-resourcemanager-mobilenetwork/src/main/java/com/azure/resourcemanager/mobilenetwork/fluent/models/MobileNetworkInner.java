// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.PlmnId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Mobile network resource. */
@Fluent
public final class MobileNetworkInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MobileNetworkInner.class);

    /*
     * Mobile network properties.
     */
    @JsonProperty(value = "properties", required = true)
    private MobileNetworkPropertiesFormat innerProperties = new MobileNetworkPropertiesFormat();

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData innerSystemData;

    /**
     * Get the innerProperties property: Mobile network properties.
     *
     * @return the innerProperties value.
     */
    private MobileNetworkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

//    /**
//     * Get the innerSystemData property: Metadata pertaining to creation and last modification of the resource.
//     *
//     * @return the innerSystemData value.
//     */
//    private SystemData innerSystemData() {
//        return this.innerSystemData;
//    }

    /** {@inheritDoc} */
    @Override
    public MobileNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MobileNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the mobile network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. This is made up of the Mobile Country Code and Mobile Network Code, as defined in
     * https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be used for testing and the values 999-99
     * and 999-999 can be used on internal private networks.
     *
     * @return the publicLandMobileNetworkIdentifier value.
     */
    public PlmnId publicLandMobileNetworkIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().publicLandMobileNetworkIdentifier();
    }

    /**
     * Set the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. This is made up of the Mobile Country Code and Mobile Network Code, as defined in
     * https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be used for testing and the values 999-99
     * and 999-999 can be used on internal private networks.
     *
     * @param publicLandMobileNetworkIdentifier the publicLandMobileNetworkIdentifier value to set.
     * @return the MobileNetworkInner object itself.
     */
    public MobileNetworkInner withPublicLandMobileNetworkIdentifier(PlmnId publicLandMobileNetworkIdentifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MobileNetworkPropertiesFormat();
        }
        this.innerProperties().withPublicLandMobileNetworkIdentifier(publicLandMobileNetworkIdentifier);
        return this;
    }

    /**
     * Get the serviceKey property: The mobile network resource identifier.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceKey();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model MobileNetworkInner"));
        } else {
            innerProperties().validate();
        }
    }
}