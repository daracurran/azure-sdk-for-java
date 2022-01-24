// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for Constant69. */
public enum Constant69 {
    /** Enum value Activity. */
    ACTIVITY("Activity");

    /** The actual serialized value for a Constant69 instance. */
    private final String value;

    Constant69(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Constant69 instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Constant69 object, or null if unable to parse.
     */
    @JsonCreator
    public static Constant69 fromString(String value) {
        Constant69[] items = Constant69.values();
        for (Constant69 item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}