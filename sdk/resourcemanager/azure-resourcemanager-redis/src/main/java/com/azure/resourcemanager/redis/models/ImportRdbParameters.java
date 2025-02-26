// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for Redis import operation. */
@Fluent
public final class ImportRdbParameters {
    /*
     * File format.
     */
    @JsonProperty(value = "format")
    private String format;

    /*
     * files to import.
     */
    @JsonProperty(value = "files", required = true)
    private List<String> files;

    /*
     * Preferred auth method to communicate to storage account used for data archive, specify SAS or ManagedIdentity,
     * default value is SAS
     */
    @JsonProperty(value = "preferred-data-archive-auth-method")
    private String preferredDataArchiveAuthMethod;

    /** Creates an instance of ImportRdbParameters class. */
    public ImportRdbParameters() {
    }

    /**
     * Get the format property: File format.
     *
     * @return the format value.
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format property: File format.
     *
     * @param format the format value to set.
     * @return the ImportRdbParameters object itself.
     */
    public ImportRdbParameters withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get the files property: files to import.
     *
     * @return the files value.
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files property: files to import.
     *
     * @param files the files value to set.
     * @return the ImportRdbParameters object itself.
     */
    public ImportRdbParameters withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the preferredDataArchiveAuthMethod property: Preferred auth method to communicate to storage account used for
     * data archive, specify SAS or ManagedIdentity, default value is SAS.
     *
     * @return the preferredDataArchiveAuthMethod value.
     */
    public String preferredDataArchiveAuthMethod() {
        return this.preferredDataArchiveAuthMethod;
    }

    /**
     * Set the preferredDataArchiveAuthMethod property: Preferred auth method to communicate to storage account used for
     * data archive, specify SAS or ManagedIdentity, default value is SAS.
     *
     * @param preferredDataArchiveAuthMethod the preferredDataArchiveAuthMethod value to set.
     * @return the ImportRdbParameters object itself.
     */
    public ImportRdbParameters withPreferredDataArchiveAuthMethod(String preferredDataArchiveAuthMethod) {
        this.preferredDataArchiveAuthMethod = preferredDataArchiveAuthMethod;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (files() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property files in model ImportRdbParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImportRdbParameters.class);
}
