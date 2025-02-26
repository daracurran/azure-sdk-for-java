// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.generated;

/** Samples for FileSystems Delete. */
public final class FileSystemsDeleteSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to QumuloManager.
     */
    public static void fileSystemsDeleteMaximumSetGen(com.azure.resourcemanager.qumulo.QumuloManager manager) {
        manager.fileSystems().delete("rgQumulo", "nauwwbfoqehgbhdsmkewoboyxeqg", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to QumuloManager.
     */
    public static void fileSystemsDeleteMinimumSetGen(com.azure.resourcemanager.qumulo.QumuloManager manager) {
        manager.fileSystems().delete("rgQumulo", "nauwwbfoqehgbhdsmkewoboyxeqg", com.azure.core.util.Context.NONE);
    }
}
