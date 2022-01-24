// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.MetadataPropertiesPatch;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

/** Metadata patch request body. */
@Fluent
public final class MetadataPatch extends ResourceWithEtag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetadataPatch.class);

    /*
     * Metadata patch request body
     */
    @JsonProperty(value = "properties")
    private MetadataPropertiesPatch innerProperties;

    /**
     * Get the innerProperties property: Metadata patch request body.
     *
     * @return the innerProperties value.
     */
    private MetadataPropertiesPatch innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MetadataPatch withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the contentId property: Static ID for the content. Used to identify dependencies and content from solutions
     * or community. Hard-coded/static for out of the box content and solutions. Dynamic for user-created. This is the
     * resource name.
     *
     * @return the contentId value.
     */
    public String contentId() {
        return this.innerProperties() == null ? null : this.innerProperties().contentId();
    }

    /**
     * Set the contentId property: Static ID for the content. Used to identify dependencies and content from solutions
     * or community. Hard-coded/static for out of the box content and solutions. Dynamic for user-created. This is the
     * resource name.
     *
     * @param contentId the contentId value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withContentId(String contentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withContentId(contentId);
        return this;
    }

    /**
     * Get the parentId property: Full parent resource ID of the content item the metadata is for. This is the full
     * resource ID including the scope (subscription and resource group).
     *
     * @return the parentId value.
     */
    public String parentId() {
        return this.innerProperties() == null ? null : this.innerProperties().parentId();
    }

    /**
     * Set the parentId property: Full parent resource ID of the content item the metadata is for. This is the full
     * resource ID including the scope (subscription and resource group).
     *
     * @param parentId the parentId value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withParentId(String parentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withParentId(parentId);
        return this;
    }

    /**
     * Get the version property: Version of the content. Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0,
     * 1.0.0.0), following ARM template best practices. Can also be any string, but then we cannot guarantee any version
     * checks.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: Version of the content. Default and recommended format is numeric (e.g. 1, 1.0, 1.0.0,
     * 1.0.0.0), following ARM template best practices. Can also be any string, but then we cannot guarantee any version
     * checks.
     *
     * @param version the version value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the kind property: The kind of content the metadata is for.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.innerProperties() == null ? null : this.innerProperties().kind();
    }

    /**
     * Set the kind property: The kind of content the metadata is for.
     *
     * @param kind the kind value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withKind(Kind kind) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withKind(kind);
        return this;
    }

    /**
     * Get the source property: Source of the content. This is where/how it was created.
     *
     * @return the source value.
     */
    public MetadataSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source of the content. This is where/how it was created.
     *
     * @param source the source value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withSource(MetadataSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the author property: The creator of the content item.
     *
     * @return the author value.
     */
    public MetadataAuthor author() {
        return this.innerProperties() == null ? null : this.innerProperties().author();
    }

    /**
     * Set the author property: The creator of the content item.
     *
     * @param author the author value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withAuthor(MetadataAuthor author) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withAuthor(author);
        return this;
    }

    /**
     * Get the support property: Support information for the metadata - type, name, contact information.
     *
     * @return the support value.
     */
    public MetadataSupport support() {
        return this.innerProperties() == null ? null : this.innerProperties().support();
    }

    /**
     * Set the support property: Support information for the metadata - type, name, contact information.
     *
     * @param support the support value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withSupport(MetadataSupport support) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withSupport(support);
        return this;
    }

    /**
     * Get the dependencies property: Dependencies for the content item, what other content items it requires to work.
     * Can describe more complex dependencies using a recursive/nested structure. For a single dependency an
     * id/kind/version can be supplied or operator/criteria for complex formats.
     *
     * @return the dependencies value.
     */
    public MetadataDependencies dependencies() {
        return this.innerProperties() == null ? null : this.innerProperties().dependencies();
    }

    /**
     * Set the dependencies property: Dependencies for the content item, what other content items it requires to work.
     * Can describe more complex dependencies using a recursive/nested structure. For a single dependency an
     * id/kind/version can be supplied or operator/criteria for complex formats.
     *
     * @param dependencies the dependencies value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withDependencies(MetadataDependencies dependencies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withDependencies(dependencies);
        return this;
    }

    /**
     * Get the categories property: Categories for the solution content item.
     *
     * @return the categories value.
     */
    public MetadataCategories categories() {
        return this.innerProperties() == null ? null : this.innerProperties().categories();
    }

    /**
     * Set the categories property: Categories for the solution content item.
     *
     * @param categories the categories value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withCategories(MetadataCategories categories) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withCategories(categories);
        return this;
    }

    /**
     * Get the providers property: Providers for the solution content item.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.innerProperties() == null ? null : this.innerProperties().providers();
    }

    /**
     * Set the providers property: Providers for the solution content item.
     *
     * @param providers the providers value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withProviders(List<String> providers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withProviders(providers);
        return this;
    }

    /**
     * Get the firstPublishDate property: first publish date solution content item.
     *
     * @return the firstPublishDate value.
     */
    public LocalDate firstPublishDate() {
        return this.innerProperties() == null ? null : this.innerProperties().firstPublishDate();
    }

    /**
     * Set the firstPublishDate property: first publish date solution content item.
     *
     * @param firstPublishDate the firstPublishDate value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withFirstPublishDate(LocalDate firstPublishDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withFirstPublishDate(firstPublishDate);
        return this;
    }

    /**
     * Get the lastPublishDate property: last publish date for the solution content item.
     *
     * @return the lastPublishDate value.
     */
    public LocalDate lastPublishDate() {
        return this.innerProperties() == null ? null : this.innerProperties().lastPublishDate();
    }

    /**
     * Set the lastPublishDate property: last publish date for the solution content item.
     *
     * @param lastPublishDate the lastPublishDate value to set.
     * @return the MetadataPatch object itself.
     */
    public MetadataPatch withLastPublishDate(LocalDate lastPublishDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MetadataPropertiesPatch();
        }
        this.innerProperties().withLastPublishDate(lastPublishDate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}