// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationEligibilityResultsInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResults;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEligibilityResultsProperties;

public final class ReplicationEligibilityResultsImpl implements ReplicationEligibilityResults {
    private ReplicationEligibilityResultsInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    ReplicationEligibilityResultsImpl(
        ReplicationEligibilityResultsInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String id() {
        return this.innerModel().id();
    }

    public ReplicationEligibilityResultsProperties properties() {
        return this.innerModel().properties();
    }

    public ReplicationEligibilityResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
