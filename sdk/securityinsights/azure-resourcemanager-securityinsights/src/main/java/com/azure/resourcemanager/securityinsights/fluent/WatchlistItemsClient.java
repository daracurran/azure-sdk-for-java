// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.WatchlistItemInner;

/** An instance of this class provides access to all the operations defined in WatchlistItemsClient. */
public interface WatchlistItemsClient {
    /**
     * Gets all watchlist Items.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all watchlist Items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WatchlistItemInner> list(String resourceGroupName, String workspaceName, String watchlistAlias);

    /**
     * Gets all watchlist Items.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all watchlist Items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WatchlistItemInner> list(
        String resourceGroupName, String workspaceName, String watchlistAlias, Context context);

    /**
     * Gets a watchlist, without its watchlist items.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a watchlist, without its watchlist items.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WatchlistItemInner get(
        String resourceGroupName, String workspaceName, String watchlistAlias, String watchlistItemId);

    /**
     * Gets a watchlist, without its watchlist items.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a watchlist, without its watchlist items along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WatchlistItemInner> getWithResponse(
        String resourceGroupName, String workspaceName, String watchlistAlias, String watchlistItemId, Context context);

    /**
     * Delete a watchlist item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String watchlistAlias, String watchlistItemId);

    /**
     * Delete a watchlist item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String watchlistAlias, String watchlistItemId, Context context);

    /**
     * Creates or updates a watchlist item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @param watchlistItem The watchlist item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Watchlist item in Azure Security Insights.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WatchlistItemInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String watchlistAlias,
        String watchlistItemId,
        WatchlistItemInner watchlistItem);

    /**
     * Creates or updates a watchlist item.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param watchlistAlias Watchlist Alias.
     * @param watchlistItemId Watchlist Item Id (GUID).
     * @param watchlistItem The watchlist item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Watchlist item in Azure Security Insights along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WatchlistItemInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String watchlistAlias,
        String watchlistItemId,
        WatchlistItemInner watchlistItem,
        Context context);
}