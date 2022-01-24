// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Data connector requirements properties. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = DataConnectorsCheckRequirements.class)
@JsonTypeName("DataConnectorsCheckRequirements")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureActiveDirectory", value = AadCheckRequirements.class),
    @JsonSubTypes.Type(name = "AzureAdvancedThreatProtection", value = AatpCheckRequirements.class),
    @JsonSubTypes.Type(name = "AzureSecurityCenter", value = AscCheckRequirements.class),
    @JsonSubTypes.Type(name = "AmazonWebServicesCloudTrail", value = AwsCloudTrailCheckRequirements.class),
    @JsonSubTypes.Type(name = "AmazonWebServicesS3", value = AwsS3CheckRequirements.class),
    @JsonSubTypes.Type(name = "Dynamics365", value = Dynamics365CheckRequirements.class),
    @JsonSubTypes.Type(name = "MicrosoftCloudAppSecurity", value = McasCheckRequirements.class),
    @JsonSubTypes.Type(name = "MicrosoftDefenderAdvancedThreatProtection", value = MdatpCheckRequirements.class),
    @JsonSubTypes.Type(name = "MicrosoftThreatIntelligence", value = MstiCheckRequirements.class),
    @JsonSubTypes.Type(name = "MicrosoftThreatProtection", value = MtpCheckRequirements.class),
    @JsonSubTypes.Type(name = "OfficeATP", value = OfficeAtpCheckRequirements.class),
    @JsonSubTypes.Type(name = "OfficeIRM", value = OfficeIrmCheckRequirements.class),
    @JsonSubTypes.Type(name = "ThreatIntelligence", value = TICheckRequirements.class),
    @JsonSubTypes.Type(name = "ThreatIntelligenceTaxii", value = TiTaxiiCheckRequirements.class)
})
@Immutable
public class DataConnectorsCheckRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataConnectorsCheckRequirements.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}