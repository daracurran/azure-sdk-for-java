// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.ActionResponseInner;
import com.azure.resourcemanager.securityinsights.models.ActionRequest;

/** An instance of this class provides access to all the operations defined in ActionsClient. */
public interface ActionsClient {
    /**
     * Gets all actions of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all actions of alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionResponseInner> listByAlertRule(String resourceGroupName, String workspaceName, String ruleId);

    /**
     * Gets all actions of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all actions of alert rule.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ActionResponseInner> listByAlertRule(
        String resourceGroupName, String workspaceName, String ruleId, Context context);

    /**
     * Gets the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the action of alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActionResponseInner get(String resourceGroupName, String workspaceName, String ruleId, String actionId);

    /**
     * Gets the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the action of alert rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActionResponseInner> getWithResponse(
        String resourceGroupName, String workspaceName, String ruleId, String actionId, Context context);

    /**
     * Creates or updates the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @param action The action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return action for alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ActionResponseInner createOrUpdate(
        String resourceGroupName, String workspaceName, String ruleId, String actionId, ActionRequest action);

    /**
     * Creates or updates the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @param action The action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return action for alert rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ActionResponseInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String ruleId,
        String actionId,
        ActionRequest action,
        Context context);

    /**
     * Delete the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String ruleId, String actionId);

    /**
     * Delete the action of alert rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param ruleId Alert rule ID.
     * @param actionId Action ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String ruleId, String actionId, Context context);
}