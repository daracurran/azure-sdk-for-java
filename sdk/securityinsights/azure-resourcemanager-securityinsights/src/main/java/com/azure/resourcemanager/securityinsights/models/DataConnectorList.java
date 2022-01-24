// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.DataConnectorInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List all the data connectors. */
@Fluent
public final class DataConnectorList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataConnectorList.class);

    /*
     * URL to fetch the next set of data connectors.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of data connectors.
     */
    @JsonProperty(value = "value", required = true)
    private List<DataConnectorInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of data connectors.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of data connectors.
     *
     * @return the value value.
     */
    public List<DataConnectorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of data connectors.
     *
     * @param value the value value to set.
     * @return the DataConnectorList object itself.
     */
    public DataConnectorList withValue(List<DataConnectorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model DataConnectorList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}