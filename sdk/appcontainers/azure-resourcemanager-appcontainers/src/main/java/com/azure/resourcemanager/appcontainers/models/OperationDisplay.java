// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation display payload. */
@Fluent
public final class OperationDisplay {
    /*
     * Resource provider of the operation
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource of the operation
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Localized friendly name for the operation
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Localized friendly description for the operation
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: Resource provider of the operation.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Resource provider of the operation.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource of the operation.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource of the operation.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Localized friendly name for the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Localized friendly name for the operation.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Localized friendly description for the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Localized friendly description for the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
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