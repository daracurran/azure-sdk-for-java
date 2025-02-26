// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;

/** The metadata related to a Service Bus namespace. */
@JacksonXmlRootElement(
        localName = "NamespaceInfo",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class NamespaceProperties {
    /*
     * Alias for the geo-disaster recovery Service Bus namespace.
     */
    @JacksonXmlProperty(
            localName = "Alias",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String alias;

    /*
     * The exact time the namespace was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedTime",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdTime;

    /*
     * The SKU for the messaging entity.
     */
    @JacksonXmlProperty(
            localName = "MessagingSKU",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private MessagingSku messagingSku;

    /*
     * The number of messaging units allocated to the namespace.
     */
    @JacksonXmlProperty(
            localName = "MessagingUnits",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private Integer messagingUnits;

    /*
     * The exact time the namespace was last modified.
     */
    @JacksonXmlProperty(
            localName = "ModifiedTime",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime modifiedTime;

    /*
     * Name of the namespace
     */
    @JacksonXmlProperty(
            localName = "Name",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String name;

    /*
     * The type of entities the namespace can contain.
     */
    @JacksonXmlProperty(
            localName = "NamespaceType",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private NamespaceType namespaceType;

    /** Creates an instance of NamespaceProperties class. */
    public NamespaceProperties() {}

    /**
     * Get the alias property: Alias for the geo-disaster recovery Service Bus namespace.
     *
     * @return the alias value.
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * Set the alias property: Alias for the geo-disaster recovery Service Bus namespace.
     *
     * @param alias the alias value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the createdTime property: The exact time the namespace was created.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: The exact time the namespace was created.
     *
     * @param createdTime the createdTime value to set.
     * @return the NamespaceProperties object itself.
     */
    NamespaceProperties setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the messagingSku property: The SKU for the messaging entity.
     *
     * @return the messagingSku value.
     */
    public MessagingSku getMessagingSku() {
        return this.messagingSku;
    }

    /**
     * Set the messagingSku property: The SKU for the messaging entity.
     *
     * @param messagingSku the messagingSku value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setMessagingSku(MessagingSku messagingSku) {
        this.messagingSku = messagingSku;
        return this;
    }

    /**
     * Get the messagingUnits property: The number of messaging units allocated to the namespace.
     *
     * @return the messagingUnits value.
     */
    public Integer getMessagingUnits() {
        return this.messagingUnits;
    }

    /**
     * Set the messagingUnits property: The number of messaging units allocated to the namespace.
     *
     * @param messagingUnits the messagingUnits value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setMessagingUnits(Integer messagingUnits) {
        this.messagingUnits = messagingUnits;
        return this;
    }

    /**
     * Get the modifiedTime property: The exact time the namespace was last modified.
     *
     * @return the modifiedTime value.
     */
    public OffsetDateTime getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set the modifiedTime property: The exact time the namespace was last modified.
     *
     * @param modifiedTime the modifiedTime value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get the name property: Name of the namespace.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the namespace.
     *
     * @param name the name value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespaceType property: The type of entities the namespace can contain.
     *
     * @return the namespaceType value.
     */
    public NamespaceType getNamespaceType() {
        return this.namespaceType;
    }

    /**
     * Set the namespaceType property: The type of entities the namespace can contain.
     *
     * @param namespaceType the namespaceType value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties setNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }
}
