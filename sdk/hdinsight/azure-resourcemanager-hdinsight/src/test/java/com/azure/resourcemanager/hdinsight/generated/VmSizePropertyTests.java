// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.VmSizeProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VmSizePropertyTests {
    @Test
    public void testDeserialize() {
        VmSizeProperty model =
            BinaryData
                .fromString(
                    "{\"name\":\"gj\",\"cores\":1622767746,\"dataDiskStorageTier\":\"knnqvsaznq\",\"label\":\"orudsgsa\",\"maxDataDiskCount\":947177728054345704,\"memoryInMb\":6438368271325429857,\"supportedByVirtualMachines\":true,\"supportedByWebWorkerRoles\":true,\"virtualMachineResourceDiskSizeInMb\":6483951652276472612,\"webWorkerResourceDiskSizeInMb\":5024506491069436029}")
                .toObject(VmSizeProperty.class);
        Assertions.assertEquals("gj", model.name());
        Assertions.assertEquals(1622767746, model.cores());
        Assertions.assertEquals("knnqvsaznq", model.dataDiskStorageTier());
        Assertions.assertEquals("orudsgsa", model.label());
        Assertions.assertEquals(947177728054345704L, model.maxDataDiskCount());
        Assertions.assertEquals(6438368271325429857L, model.memoryInMb());
        Assertions.assertEquals(true, model.supportedByVirtualMachines());
        Assertions.assertEquals(true, model.supportedByWebWorkerRoles());
        Assertions.assertEquals(6483951652276472612L, model.virtualMachineResourceDiskSizeInMb());
        Assertions.assertEquals(5024506491069436029L, model.webWorkerResourceDiskSizeInMb());
    }

    @Test
    public void testSerialize() {
        VmSizeProperty model =
            new VmSizeProperty()
                .withName("gj")
                .withCores(1622767746)
                .withDataDiskStorageTier("knnqvsaznq")
                .withLabel("orudsgsa")
                .withMaxDataDiskCount(947177728054345704L)
                .withMemoryInMb(6438368271325429857L)
                .withSupportedByVirtualMachines(true)
                .withSupportedByWebWorkerRoles(true)
                .withVirtualMachineResourceDiskSizeInMb(6483951652276472612L)
                .withWebWorkerResourceDiskSizeInMb(5024506491069436029L);
        model = BinaryData.fromObject(model).toObject(VmSizeProperty.class);
        Assertions.assertEquals("gj", model.name());
        Assertions.assertEquals(1622767746, model.cores());
        Assertions.assertEquals("knnqvsaznq", model.dataDiskStorageTier());
        Assertions.assertEquals("orudsgsa", model.label());
        Assertions.assertEquals(947177728054345704L, model.maxDataDiskCount());
        Assertions.assertEquals(6438368271325429857L, model.memoryInMb());
        Assertions.assertEquals(true, model.supportedByVirtualMachines());
        Assertions.assertEquals(true, model.supportedByWebWorkerRoles());
        Assertions.assertEquals(6483951652276472612L, model.virtualMachineResourceDiskSizeInMb());
        Assertions.assertEquals(5024506491069436029L, model.webWorkerResourceDiskSizeInMb());
    }
}
