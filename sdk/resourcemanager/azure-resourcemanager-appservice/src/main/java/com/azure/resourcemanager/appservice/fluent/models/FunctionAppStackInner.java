// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.FunctionAppMajorVersion;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.StackPreferredOs;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Function App Stack. */
@Fluent
public final class FunctionAppStackInner extends ProxyOnlyResource {
    /*
     * Function App stack location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * FunctionAppStack resource specific properties
     */
    @JsonProperty(value = "properties")
    private FunctionAppStackProperties innerProperties;

    /** Creates an instance of FunctionAppStackInner class. */
    public FunctionAppStackInner() {
    }

    /**
     * Get the location property: Function App stack location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: FunctionAppStack resource specific properties.
     *
     * @return the innerProperties value.
     */
    private FunctionAppStackProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FunctionAppStackInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the displayText property: Function App stack (display only).
     *
     * @return the displayText value.
     */
    public String displayText() {
        return this.innerProperties() == null ? null : this.innerProperties().displayText();
    }

    /**
     * Get the value property: Function App stack name.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Get the majorVersions property: List of major versions available.
     *
     * @return the majorVersions value.
     */
    public List<FunctionAppMajorVersion> majorVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().majorVersions();
    }

    /**
     * Get the preferredOs property: Function App stack preferred OS.
     *
     * @return the preferredOs value.
     */
    public StackPreferredOs preferredOs() {
        return this.innerProperties() == null ? null : this.innerProperties().preferredOs();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
