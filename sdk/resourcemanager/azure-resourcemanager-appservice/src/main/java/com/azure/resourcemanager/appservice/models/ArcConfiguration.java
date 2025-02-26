// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ArcConfiguration model. */
@Fluent
public final class ArcConfiguration {
    /*
     * The artifactsStorageType property.
     */
    @JsonProperty(value = "artifactsStorageType")
    private StorageType artifactsStorageType;

    /*
     * The artifactStorageClassName property.
     */
    @JsonProperty(value = "artifactStorageClassName")
    private String artifactStorageClassName;

    /*
     * The artifactStorageMountPath property.
     */
    @JsonProperty(value = "artifactStorageMountPath")
    private String artifactStorageMountPath;

    /*
     * The artifactStorageNodeName property.
     */
    @JsonProperty(value = "artifactStorageNodeName")
    private String artifactStorageNodeName;

    /*
     * The artifactStorageAccessMode property.
     */
    @JsonProperty(value = "artifactStorageAccessMode")
    private String artifactStorageAccessMode;

    /*
     * The frontEndServiceConfiguration property.
     */
    @JsonProperty(value = "frontEndServiceConfiguration")
    private FrontEndConfiguration frontEndServiceConfiguration;

    /*
     * The kubeConfig property.
     */
    @JsonProperty(value = "kubeConfig")
    private String kubeConfig;

    /** Creates an instance of ArcConfiguration class. */
    public ArcConfiguration() {
    }

    /**
     * Get the artifactsStorageType property: The artifactsStorageType property.
     *
     * @return the artifactsStorageType value.
     */
    public StorageType artifactsStorageType() {
        return this.artifactsStorageType;
    }

    /**
     * Set the artifactsStorageType property: The artifactsStorageType property.
     *
     * @param artifactsStorageType the artifactsStorageType value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactsStorageType(StorageType artifactsStorageType) {
        this.artifactsStorageType = artifactsStorageType;
        return this;
    }

    /**
     * Get the artifactStorageClassName property: The artifactStorageClassName property.
     *
     * @return the artifactStorageClassName value.
     */
    public String artifactStorageClassName() {
        return this.artifactStorageClassName;
    }

    /**
     * Set the artifactStorageClassName property: The artifactStorageClassName property.
     *
     * @param artifactStorageClassName the artifactStorageClassName value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageClassName(String artifactStorageClassName) {
        this.artifactStorageClassName = artifactStorageClassName;
        return this;
    }

    /**
     * Get the artifactStorageMountPath property: The artifactStorageMountPath property.
     *
     * @return the artifactStorageMountPath value.
     */
    public String artifactStorageMountPath() {
        return this.artifactStorageMountPath;
    }

    /**
     * Set the artifactStorageMountPath property: The artifactStorageMountPath property.
     *
     * @param artifactStorageMountPath the artifactStorageMountPath value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageMountPath(String artifactStorageMountPath) {
        this.artifactStorageMountPath = artifactStorageMountPath;
        return this;
    }

    /**
     * Get the artifactStorageNodeName property: The artifactStorageNodeName property.
     *
     * @return the artifactStorageNodeName value.
     */
    public String artifactStorageNodeName() {
        return this.artifactStorageNodeName;
    }

    /**
     * Set the artifactStorageNodeName property: The artifactStorageNodeName property.
     *
     * @param artifactStorageNodeName the artifactStorageNodeName value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageNodeName(String artifactStorageNodeName) {
        this.artifactStorageNodeName = artifactStorageNodeName;
        return this;
    }

    /**
     * Get the artifactStorageAccessMode property: The artifactStorageAccessMode property.
     *
     * @return the artifactStorageAccessMode value.
     */
    public String artifactStorageAccessMode() {
        return this.artifactStorageAccessMode;
    }

    /**
     * Set the artifactStorageAccessMode property: The artifactStorageAccessMode property.
     *
     * @param artifactStorageAccessMode the artifactStorageAccessMode value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withArtifactStorageAccessMode(String artifactStorageAccessMode) {
        this.artifactStorageAccessMode = artifactStorageAccessMode;
        return this;
    }

    /**
     * Get the frontEndServiceConfiguration property: The frontEndServiceConfiguration property.
     *
     * @return the frontEndServiceConfiguration value.
     */
    public FrontEndConfiguration frontEndServiceConfiguration() {
        return this.frontEndServiceConfiguration;
    }

    /**
     * Set the frontEndServiceConfiguration property: The frontEndServiceConfiguration property.
     *
     * @param frontEndServiceConfiguration the frontEndServiceConfiguration value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withFrontEndServiceConfiguration(FrontEndConfiguration frontEndServiceConfiguration) {
        this.frontEndServiceConfiguration = frontEndServiceConfiguration;
        return this;
    }

    /**
     * Get the kubeConfig property: The kubeConfig property.
     *
     * @return the kubeConfig value.
     */
    public String kubeConfig() {
        return this.kubeConfig;
    }

    /**
     * Set the kubeConfig property: The kubeConfig property.
     *
     * @param kubeConfig the kubeConfig value to set.
     * @return the ArcConfiguration object itself.
     */
    public ArcConfiguration withKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontEndServiceConfiguration() != null) {
            frontEndServiceConfiguration().validate();
        }
    }
}
