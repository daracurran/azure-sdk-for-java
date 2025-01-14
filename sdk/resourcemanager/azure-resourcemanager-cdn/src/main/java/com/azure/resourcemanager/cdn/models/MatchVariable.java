// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The name of the condition for the delivery rule. */
public final class MatchVariable extends ExpandableStringEnum<MatchVariable> {
    /** Static value RemoteAddress for MatchVariable. */
    public static final MatchVariable REMOTE_ADDRESS = fromString("RemoteAddress");

    /** Static value RequestMethod for MatchVariable. */
    public static final MatchVariable REQUEST_METHOD = fromString("RequestMethod");

    /** Static value QueryString for MatchVariable. */
    public static final MatchVariable QUERY_STRING = fromString("QueryString");

    /** Static value PostArgs for MatchVariable. */
    public static final MatchVariable POST_ARGS = fromString("PostArgs");

    /** Static value RequestUri for MatchVariable. */
    public static final MatchVariable REQUEST_URI = fromString("RequestUri");

    /** Static value RequestHeader for MatchVariable. */
    public static final MatchVariable REQUEST_HEADER = fromString("RequestHeader");

    /** Static value RequestBody for MatchVariable. */
    public static final MatchVariable REQUEST_BODY = fromString("RequestBody");

    /** Static value RequestScheme for MatchVariable. */
    public static final MatchVariable REQUEST_SCHEME = fromString("RequestScheme");

    /** Static value UrlPath for MatchVariable. */
    public static final MatchVariable URL_PATH = fromString("UrlPath");

    /** Static value UrlFileExtension for MatchVariable. */
    public static final MatchVariable URL_FILE_EXTENSION = fromString("UrlFileExtension");

    /** Static value UrlFileName for MatchVariable. */
    public static final MatchVariable URL_FILE_NAME = fromString("UrlFileName");

    /** Static value HttpVersion for MatchVariable. */
    public static final MatchVariable HTTP_VERSION = fromString("HttpVersion");

    /** Static value Cookies for MatchVariable. */
    public static final MatchVariable COOKIES = fromString("Cookies");

    /** Static value IsDevice for MatchVariable. */
    public static final MatchVariable IS_DEVICE = fromString("IsDevice");

    /** Static value SocketAddr for MatchVariable. */
    public static final MatchVariable SOCKET_ADDR = fromString("SocketAddr");

    /** Static value ClientPort for MatchVariable. */
    public static final MatchVariable CLIENT_PORT = fromString("ClientPort");

    /** Static value ServerPort for MatchVariable. */
    public static final MatchVariable SERVER_PORT = fromString("ServerPort");

    /** Static value HostName for MatchVariable. */
    public static final MatchVariable HOST_NAME = fromString("HostName");

    /** Static value SslProtocol for MatchVariable. */
    public static final MatchVariable SSL_PROTOCOL = fromString("SslProtocol");

    /**
     * Creates or finds a MatchVariable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MatchVariable.
     */
    @JsonCreator
    public static MatchVariable fromString(String name) {
        return fromString(name, MatchVariable.class);
    }

    /**
     * Gets known MatchVariable values.
     *
     * @return known MatchVariable values.
     */
    public static Collection<MatchVariable> values() {
        return values(MatchVariable.class);
    }
}
