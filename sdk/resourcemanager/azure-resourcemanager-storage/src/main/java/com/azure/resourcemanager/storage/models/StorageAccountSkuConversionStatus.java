// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This defines the sku conversion status object for asynchronous sku conversions. */
@Fluent
public final class StorageAccountSkuConversionStatus {
    /*
     * This property indicates the current sku conversion status.
     */
    @JsonProperty(value = "skuConversionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SkuConversionStatus skuConversionStatus;

    /*
     * This property represents the target sku name to which the account sku is
     * being converted asynchronously.
     */
    @JsonProperty(value = "targetSkuName")
    private SkuName targetSkuName;

    /*
     * This property represents the sku conversion start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /*
     * This property represents the sku conversion end time.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private String endTime;

    /**
     * Get the skuConversionStatus property: This property indicates the current sku conversion status.
     *
     * @return the skuConversionStatus value.
     */
    public SkuConversionStatus skuConversionStatus() {
        return this.skuConversionStatus;
    }

    /**
     * Get the targetSkuName property: This property represents the target sku name to which the account sku is being
     * converted asynchronously.
     *
     * @return the targetSkuName value.
     */
    public SkuName targetSkuName() {
        return this.targetSkuName;
    }

    /**
     * Set the targetSkuName property: This property represents the target sku name to which the account sku is being
     * converted asynchronously.
     *
     * @param targetSkuName the targetSkuName value to set.
     * @return the StorageAccountSkuConversionStatus object itself.
     */
    public StorageAccountSkuConversionStatus withTargetSkuName(SkuName targetSkuName) {
        this.targetSkuName = targetSkuName;
        return this;
    }

    /**
     * Get the startTime property: This property represents the sku conversion start time.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: This property represents the sku conversion end time.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}