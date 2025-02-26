// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The connection state of a managed private endpoint. */
@Immutable
public final class ConnectionStateProperties {
    /*
     * The actions required on the managed private endpoint
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /*
     * The managed private endpoint description
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The approval status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of ConnectionStateProperties class. */
    public ConnectionStateProperties() {
    }

    /**
     * Get the actionsRequired property: The actions required on the managed private endpoint.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Get the description property: The managed private endpoint description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the status property: The approval status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
