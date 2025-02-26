// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for PrefixListLocalRulestack Delete. */
public final class PrefixListLocalRulestackDeleteSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PrefixListLocalRulestack_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrefixListLocalRulestack_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListLocalRulestackDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListLocalRulestacks().delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PrefixListLocalRulestack_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrefixListLocalRulestack_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void prefixListLocalRulestackDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.prefixListLocalRulestacks().delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }
}
