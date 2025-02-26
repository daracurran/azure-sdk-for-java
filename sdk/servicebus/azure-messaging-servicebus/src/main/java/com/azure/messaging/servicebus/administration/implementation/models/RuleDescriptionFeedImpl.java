// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/** Response from listing Service Bus rules. */
@JacksonXmlRootElement(localName = "feed", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class RuleDescriptionFeedImpl {

    /*
     * URL of the list rules query.
     */
    @JacksonXmlProperty(localName = "id", namespace = "http://www.w3.org/2005/Atom")
    private String id;

    /*
     * The entity type for the feed.
     */
    @JsonProperty(value = "title")
    private Object title;

    /*
     * Datetime of the query.
     */
    @JacksonXmlProperty(localName = "updated", namespace = "http://www.w3.org/2005/Atom")
    private OffsetDateTime updated;

    /*
     * Links to paginated response.
     */
    @JsonProperty("link")
    private List<ResponseLinkImpl> link = new ArrayList<>();

    /*
     * Rules entries.
     */
    @JsonProperty("entry")
    private List<RuleDescriptionEntryImpl> entry = new ArrayList<>();

    /** Creates an instance of RuleDescriptionFeed class. */
    public RuleDescriptionFeedImpl() {}

    /**
     * Get the id property: URL of the list rules query.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: URL of the list rules query.
     *
     * @param id the id value to set.
     * @return the RuleDescriptionFeed object itself.
     */
    public RuleDescriptionFeedImpl setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: The entity type for the feed.
     *
     * @return the title value.
     */
    public Object getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The entity type for the feed.
     *
     * @param title the title value to set.
     * @return the RuleDescriptionFeed object itself.
     */
    public RuleDescriptionFeedImpl setTitle(Object title) {
        this.title = title;
        return this;
    }

    /**
     * Get the updated property: Datetime of the query.
     *
     * @return the updated value.
     */
    public OffsetDateTime getUpdated() {
        return this.updated;
    }

    /**
     * Set the updated property: Datetime of the query.
     *
     * @param updated the updated value to set.
     * @return the RuleDescriptionFeed object itself.
     */
    public RuleDescriptionFeedImpl setUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the link property: Links to paginated response.
     *
     * @return the link value.
     */
    public List<ResponseLinkImpl> getLink() {
        return this.link;
    }

    /**
     * Set the link property: Links to paginated response.
     *
     * @param link the link value to set.
     * @return the RuleDescriptionFeed object itself.
     */
    public RuleDescriptionFeedImpl setLink(List<ResponseLinkImpl> link) {
        this.link = link;
        return this;
    }

    /**
     * Get the entry property: Rules entries.
     *
     * @return the entry value.
     */
    public List<RuleDescriptionEntryImpl> getEntry() {
        return this.entry;
    }

    /**
     * Set the entry property: Rules entries.
     *
     * @param entry the entry value to set.
     * @return the RuleDescriptionFeed object itself.
     */
    public RuleDescriptionFeedImpl setEntry(List<RuleDescriptionEntryImpl> entry) {
        this.entry = entry;
        return this;
    }
}
