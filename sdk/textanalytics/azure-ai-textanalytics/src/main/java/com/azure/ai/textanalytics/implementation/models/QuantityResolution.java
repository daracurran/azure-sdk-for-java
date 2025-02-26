// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents resolutions for quantities. */
@Fluent
public class QuantityResolution {
    /*
     * The numeric value that the extracted text denotes.
     */
    @JsonProperty(value = "value", required = true)
    private double value;

    /** Creates an instance of QuantityResolution class. */
    public QuantityResolution() {}

    /**
     * Get the value property: The numeric value that the extracted text denotes.
     *
     * @return the value value.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Set the value property: The numeric value that the extracted text denotes.
     *
     * @param value the value value to set.
     * @return the QuantityResolution object itself.
     */
    public QuantityResolution setValue(double value) {
        this.value = value;
        return this;
    }
}
