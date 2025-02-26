// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the current state of an existing Private Link Service connection to the Azure Private Endpoint. */
@Fluent
public final class PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState {
    /*
     * Status of the the private link service connection. Can be Pending,
     * Approved, Rejected, or Disconnected.
     */
    @JsonProperty(value = "status")
    private PrivateLinkServiceConnectionStatus status;

    /*
     * The description for the private link service connection state.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A description of any extra actions that may be required.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get the status property: Status of the the private link service connection. Can be Pending, Approved, Rejected,
     * or Disconnected.
     *
     * @return the status value.
     */
    public PrivateLinkServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the the private link service connection. Can be Pending, Approved, Rejected,
     * or Disconnected.
     *
     * @param status the status value to set.
     * @return the PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState object itself.
     */
    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState withStatus(
        PrivateLinkServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The description for the private link service connection state.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the private link service connection state.
     *
     * @param description the description value to set.
     * @return the PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState object itself.
     */
    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: A description of any extra actions that may be required.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: A description of any extra actions that may be required.
     *
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState object itself.
     */
    public PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionState withActionsRequired(
        String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
