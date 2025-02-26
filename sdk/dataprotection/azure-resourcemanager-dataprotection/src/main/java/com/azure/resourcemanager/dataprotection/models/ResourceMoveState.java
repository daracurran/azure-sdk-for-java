// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Resource move state for backup vault. */
public final class ResourceMoveState extends ExpandableStringEnum<ResourceMoveState> {
    /** Static value Unknown for ResourceMoveState. */
    public static final ResourceMoveState UNKNOWN = fromString("Unknown");

    /** Static value InProgress for ResourceMoveState. */
    public static final ResourceMoveState IN_PROGRESS = fromString("InProgress");

    /** Static value PrepareFailed for ResourceMoveState. */
    public static final ResourceMoveState PREPARE_FAILED = fromString("PrepareFailed");

    /** Static value CommitFailed for ResourceMoveState. */
    public static final ResourceMoveState COMMIT_FAILED = fromString("CommitFailed");

    /** Static value Failed for ResourceMoveState. */
    public static final ResourceMoveState FAILED = fromString("Failed");

    /** Static value PrepareTimedout for ResourceMoveState. */
    public static final ResourceMoveState PREPARE_TIMEDOUT = fromString("PrepareTimedout");

    /** Static value CommitTimedout for ResourceMoveState. */
    public static final ResourceMoveState COMMIT_TIMEDOUT = fromString("CommitTimedout");

    /** Static value CriticalFailure for ResourceMoveState. */
    public static final ResourceMoveState CRITICAL_FAILURE = fromString("CriticalFailure");

    /** Static value PartialSuccess for ResourceMoveState. */
    public static final ResourceMoveState PARTIAL_SUCCESS = fromString("PartialSuccess");

    /** Static value MoveSucceeded for ResourceMoveState. */
    public static final ResourceMoveState MOVE_SUCCEEDED = fromString("MoveSucceeded");

    /**
     * Creates a new instance of ResourceMoveState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceMoveState() {
    }

    /**
     * Creates or finds a ResourceMoveState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceMoveState.
     */
    @JsonCreator
    public static ResourceMoveState fromString(String name) {
        return fromString(name, ResourceMoveState.class);
    }

    /**
     * Gets known ResourceMoveState values.
     *
     * @return known ResourceMoveState values.
     */
    public static Collection<ResourceMoveState> values() {
        return values(ResourceMoveState.class);
    }
}
