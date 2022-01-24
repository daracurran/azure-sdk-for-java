// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for SourceControlsOperation List. */
public final class SourceControlsOperationListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2021-09-01-preview/examples/sourcecontrols/GetSourceControls.json
     */
    /**
     * Sample code: Get all source controls.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllSourceControls(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.sourceControlsOperations().list("myRg", "myWorkspace", Context.NONE);
    }
}