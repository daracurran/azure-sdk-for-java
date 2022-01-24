// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.ThreatIntelligenceIndicatorsOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceInformationInner;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceIndicatorsOperations;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ThreatIntelligenceIndicatorsOperationsImpl implements ThreatIntelligenceIndicatorsOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThreatIntelligenceIndicatorsOperationsImpl.class);

    private final ThreatIntelligenceIndicatorsOperationsClient innerClient;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    public ThreatIntelligenceIndicatorsOperationsImpl(
        ThreatIntelligenceIndicatorsOperationsClient innerClient,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ThreatIntelligenceInformation> list(String resourceGroupName, String workspaceName) {
        PagedIterable<ThreatIntelligenceInformationInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new ThreatIntelligenceInformationImpl(inner1, this.manager()));
    }

    public PagedIterable<ThreatIntelligenceInformation> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context) {
        PagedIterable<ThreatIntelligenceInformationInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, filter, orderby, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new ThreatIntelligenceInformationImpl(inner1, this.manager()));
    }

    private ThreatIntelligenceIndicatorsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}