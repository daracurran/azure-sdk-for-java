// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimIdListResultInner;
import com.azure.resourcemanager.mobilenetwork.models.SimIdListResult;
import java.util.Collections;
import java.util.List;

public final class SimIdListResultImpl implements SimIdListResult {
    private SimIdListResultInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    SimIdListResultImpl(
        SimIdListResultInner innerObject, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SubResource> value() {
        List<SubResource> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public SimIdListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}