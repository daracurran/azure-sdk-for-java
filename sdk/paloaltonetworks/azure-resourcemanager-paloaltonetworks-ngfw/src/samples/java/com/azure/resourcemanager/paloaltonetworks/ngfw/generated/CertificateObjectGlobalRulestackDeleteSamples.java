// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for CertificateObjectGlobalRulestack Delete. */
public final class CertificateObjectGlobalRulestackDeleteSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectGlobalRulestack_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks().delete("praval", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectGlobalRulestack_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectGlobalRulestack_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectGlobalRulestackDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectGlobalRulestacks().delete("praval", "armid1", com.azure.core.util.Context.NONE);
    }
}
