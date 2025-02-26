// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpandControlsEnum. */
public final class ExpandControlsEnum extends ExpandableStringEnum<ExpandControlsEnum> {
    /** Static value definition for ExpandControlsEnum. */
    public static final ExpandControlsEnum DEFINITION = fromString("definition");

    /**
     * Creates a new instance of ExpandControlsEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpandControlsEnum() {
    }

    /**
     * Creates or finds a ExpandControlsEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpandControlsEnum.
     */
    @JsonCreator
    public static ExpandControlsEnum fromString(String name) {
        return fromString(name, ExpandControlsEnum.class);
    }

    /**
     * Gets known ExpandControlsEnum values.
     *
     * @return known ExpandControlsEnum values.
     */
    public static Collection<ExpandControlsEnum> values() {
        return values(ExpandControlsEnum.class);
    }
}
