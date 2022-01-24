// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.util.Context;

/** Samples for Servers Restart. */
public final class ServersRestartSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/stable/2017-12-01/examples/ServerRestart.json
     */
    /**
     * Sample code: ServerRestart.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void serverRestart(com.azure.resourcemanager.postgresql.PostgreSqlManager manager) {
        manager.servers().restart("TestGroup", "testserver", Context.NONE);
    }
}