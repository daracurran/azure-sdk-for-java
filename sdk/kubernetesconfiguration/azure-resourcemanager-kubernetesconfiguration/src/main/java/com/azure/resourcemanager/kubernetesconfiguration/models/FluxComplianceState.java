// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FluxComplianceState. */
public final class FluxComplianceState extends ExpandableStringEnum<FluxComplianceState> {
    /** Static value Compliant for FluxComplianceState. */
    public static final FluxComplianceState COMPLIANT = fromString("Compliant");

    /** Static value Non-Compliant for FluxComplianceState. */
    public static final FluxComplianceState NON_COMPLIANT = fromString("Non-Compliant");

    /** Static value Pending for FluxComplianceState. */
    public static final FluxComplianceState PENDING = fromString("Pending");

    /** Static value Suspended for FluxComplianceState. */
    public static final FluxComplianceState SUSPENDED = fromString("Suspended");

    /** Static value Unknown for FluxComplianceState. */
    public static final FluxComplianceState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a FluxComplianceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FluxComplianceState.
     */
    @JsonCreator
    public static FluxComplianceState fromString(String name) {
        return fromString(name, FluxComplianceState.class);
    }

    /** @return known FluxComplianceState values. */
    public static Collection<FluxComplianceState> values() {
        return values(FluxComplianceState.class);
    }
}
