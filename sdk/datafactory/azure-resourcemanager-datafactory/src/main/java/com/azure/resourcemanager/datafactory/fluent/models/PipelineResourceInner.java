// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Pipeline resource type. */
@Fluent
public final class PipelineResourceInner extends SubResource {
    /*
     * Properties of the pipeline.
     */
    @JsonProperty(value = "properties", required = true)
    private Pipeline innerProperties = new Pipeline();

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Pipeline resource type.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of PipelineResourceInner class. */
    public PipelineResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of the pipeline.
     *
     * @return the innerProperties value.
     */
    private Pipeline innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the additionalProperties property: Pipeline resource type.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Pipeline resource type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public PipelineResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the description property: The description of the pipeline.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the pipeline.
     *
     * @param description the description value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the activities property: List of activities in pipeline.
     *
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.innerProperties() == null ? null : this.innerProperties().activities();
    }

    /**
     * Set the activities property: List of activities in pipeline.
     *
     * @param activities the activities value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withActivities(List<Activity> activities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withActivities(activities);
        return this;
    }

    /**
     * Get the parameters property: List of parameters for pipeline.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterSpecification> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: List of parameters for pipeline.
     *
     * @param parameters the parameters value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withParameters(Map<String, ParameterSpecification> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the variables property: List of variables for pipeline.
     *
     * @return the variables value.
     */
    public Map<String, VariableSpecification> variables() {
        return this.innerProperties() == null ? null : this.innerProperties().variables();
    }

    /**
     * Set the variables property: List of variables for pipeline.
     *
     * @param variables the variables value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withVariables(Map<String, VariableSpecification> variables) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withVariables(variables);
        return this;
    }

    /**
     * Get the concurrency property: The max number of concurrent runs for the pipeline.
     *
     * @return the concurrency value.
     */
    public Integer concurrency() {
        return this.innerProperties() == null ? null : this.innerProperties().concurrency();
    }

    /**
     * Set the concurrency property: The max number of concurrent runs for the pipeline.
     *
     * @param concurrency the concurrency value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withConcurrency(Integer concurrency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withConcurrency(concurrency);
        return this;
    }

    /**
     * Get the annotations property: List of tags that can be used for describing the Pipeline.
     *
     * @return the annotations value.
     */
    public List<Object> annotations() {
        return this.innerProperties() == null ? null : this.innerProperties().annotations();
    }

    /**
     * Set the annotations property: List of tags that can be used for describing the Pipeline.
     *
     * @param annotations the annotations value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withAnnotations(List<Object> annotations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withAnnotations(annotations);
        return this;
    }

    /**
     * Get the runDimensions property: Dimensions emitted by Pipeline.
     *
     * @return the runDimensions value.
     */
    public Map<String, Object> runDimensions() {
        return this.innerProperties() == null ? null : this.innerProperties().runDimensions();
    }

    /**
     * Set the runDimensions property: Dimensions emitted by Pipeline.
     *
     * @param runDimensions the runDimensions value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withRunDimensions(Map<String, Object> runDimensions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withRunDimensions(runDimensions);
        return this;
    }

    /**
     * Get the folder property: The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
     * level.
     *
     * @return the folder value.
     */
    public PipelineFolder folder() {
        return this.innerProperties() == null ? null : this.innerProperties().folder();
    }

    /**
     * Set the folder property: The folder that this Pipeline is in. If not specified, Pipeline will appear at the root
     * level.
     *
     * @param folder the folder value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withFolder(PipelineFolder folder) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withFolder(folder);
        return this;
    }

    /**
     * Get the policy property: Pipeline Policy.
     *
     * @return the policy value.
     */
    public PipelinePolicy policy() {
        return this.innerProperties() == null ? null : this.innerProperties().policy();
    }

    /**
     * Set the policy property: Pipeline Policy.
     *
     * @param policy the policy value to set.
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withPolicy(PipelinePolicy policy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Pipeline();
        }
        this.innerProperties().withPolicy(policy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model PipelineResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PipelineResourceInner.class);
}
