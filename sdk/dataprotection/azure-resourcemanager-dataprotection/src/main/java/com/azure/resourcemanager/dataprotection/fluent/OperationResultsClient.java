// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;
import com.azure.resourcemanager.dataprotection.models.OperationResultsGetResponse;

/** An instance of this class provides access to all the operations defined in OperationResultsClient. */
public interface OperationResultsClient {
    /**
     * Gets the operation status for a resource.
     *
     * <p>Gets the operation result for a resource.
     *
     * @param operationId The operationId parameter.
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResultsGetResponse getWithResponse(String operationId, String location, Context context);

    /**
     * Gets the operation status for a resource.
     *
     * <p>Gets the operation result for a resource.
     *
     * @param operationId The operationId parameter.
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationJobExtendedInfoInner get(String operationId, String location);
}
