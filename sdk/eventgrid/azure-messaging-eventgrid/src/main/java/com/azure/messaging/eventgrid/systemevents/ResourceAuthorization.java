// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The details of the authorization for the resource. */
@Fluent
public final class ResourceAuthorization {
    /*
     * The scope of the authorization.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The action being requested.
     */
    @JsonProperty(value = "action")
    private String action;

    /*
     * The evidence for the authorization.
     */
    @JsonProperty(value = "evidence")
    private Map<String, String> evidence;

    /** Creates an instance of ResourceAuthorization class. */
    public ResourceAuthorization() {}

    /**
     * Get the scope property: The scope of the authorization.
     *
     * @return the scope value.
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the authorization.
     *
     * @param scope the scope value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the action property: The action being requested.
     *
     * @return the action value.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action being requested.
     *
     * @param action the action value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the evidence property: The evidence for the authorization.
     *
     * @return the evidence value.
     */
    public Map<String, String> getEvidence() {
        return this.evidence;
    }

    /**
     * Set the evidence property: The evidence for the authorization.
     *
     * @param evidence the evidence value to set.
     * @return the ResourceAuthorization object itself.
     */
    public ResourceAuthorization setEvidence(Map<String, String> evidence) {
        this.evidence = evidence;
        return this;
    }
}
