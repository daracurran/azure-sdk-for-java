// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AutomationInner;

/** Resource collection API of Automations. */
public interface Automations {
    /**
     * Lists all the security automations in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security automations for the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Automation> list();

    /**
     * Lists all the security automations in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security automations for the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Automation> list(Context context);

    /**
     * Lists all the security automations in the specified resource group. Use the 'nextLink' property in the response
     * to get the next page of security automations for the specified resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Automation> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the security automations in the specified resource group. Use the 'nextLink' property in the response
     * to get the next page of security automations for the specified resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Automation> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves information about the model of a security automation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    Response<Automation> getByResourceGroupWithResponse(
        String resourceGroupName, String automationName, Context context);

    /**
     * Retrieves information about the model of a security automation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource.
     */
    Automation getByResourceGroup(String resourceGroupName, String automationName);

    /**
     * Deletes a security automation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String automationName, Context context);

    /**
     * Deletes a security automation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String automationName);

    /**
     * Validates the security automation model before create or update. Any validation errors are returned to the
     * client.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation model state property bag along with {@link Response}.
     */
    Response<AutomationValidationStatus> validateWithResponse(
        String resourceGroupName, String automationName, AutomationInner automation, Context context);

    /**
     * Validates the security automation model before create or update. Any validation errors are returned to the
     * client.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation model state property bag.
     */
    AutomationValidationStatus validate(String resourceGroupName, String automationName, AutomationInner automation);

    /**
     * Retrieves information about the model of a security automation.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    Automation getById(String id);

    /**
     * Retrieves information about the model of a security automation.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    Response<Automation> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a security automation.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a security automation.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Automation resource.
     *
     * @param name resource name.
     * @return the first stage of the new Automation definition.
     */
    Automation.DefinitionStages.Blank define(String name);
}
