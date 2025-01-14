// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import java.util.Arrays;

/** Samples for SupportTickets Create. */
public final class SupportTicketsCreateSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSqlDatawarehouseQuotaTicketForDTUs.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for DTUs for Azure Synapse Analytics.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForDTUsForAzureSynapseAnalytics(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/sql_datawarehouse_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("DTUs")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"ServerName\":\"testserver\",\"NewLimit\":54000}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBatchQuotaTicketForSpecificBatchAccountForActiveJobs.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Active Jobs and Job Schedules for a Batch account.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForActiveJobsAndJobSchedulesForABatchAccount(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/batch_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Account")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"AccountName\":\"test\",\"NewLimit\":200,\"Type\":\"Jobs\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateMachineLearningQuotaTicketForLowPriorityCores.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Low-priority cores for Machine Learning service.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForLowPriorityCoresForMachineLearningService(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/machine_learning_service_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("BatchAml")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"NewLimit\":200,\"Type\":\"LowPriority\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBatchQuotaTicketForSubscription.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Batch accounts for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForBatchAccountsForASubscription(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/batch_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Subscription")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"NewLimit\":200,\"Type\":\"Account\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSqlDatabaseQuotaTicketForDTUs.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for DTUs for SQL Database.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForDTUsForSQLDatabase(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/sql_database_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("DTUs")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"ServerName\":\"testserver\",\"NewLimit\":54000}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateGenericQuotaTicket.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for services that do not require additional details in the
     * quotaTicketDetails object.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void
        createATicketToRequestQuotaIncreaseForServicesThatDoNotRequireAdditionalDetailsInTheQuotaTicketDetailsObject(
            com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("Increase the maximum throughput per container limit to 10000 for account foo bar")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/cosmosdb_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBatchQuotaTicketForSpecificBatchAccountForLowPriorityCores.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Low-priority cores for a Batch account.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForLowPriorityCoresForABatchAccount(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/batch_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Account")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload(
                                        "{\"AccountName\":\"test\",\"NewLimit\":200,\"Type\":\"LowPriority\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSqlManagedInstanceQuotaTicket.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Azure SQL managed instance.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForAzureSQLManagedInstance(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/sql_managedinstance_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("SQLMI")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"NewLimit\":200, \"Metadata\":null, \"Type\":\"vCore\"}"),
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"NewLimit\":200, \"Metadata\":null, \"Type\":\"Subnet\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBatchQuotaTicketForSpecificBatchAccountForPools.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Pools for a Batch account.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForPoolsForABatchAccount(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/batch_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Account")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"AccountName\":\"test\",\"NewLimit\":200,\"Type\":\"Pools\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBatchQuotaTicketForSpecificBatchAccountForDedicatedCores.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for specific VM family cores for a Batch account.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForSpecificVMFamilyCoresForABatchAccount(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/batch_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Account")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload(
                                        "{\"AccountName\":\"test\",\"VMFamily\":\"standardA0_A7Family\",\"NewLimit\":200,\"Type\":\"Dedicated\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSqlDatabaseQuotaTicketForServers.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Servers for SQL Database.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForServersForSQLDatabase(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/sql_database_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Servers")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays.asList(new QuotaChangeRequest().withRegion("EastUS").withPayload("{\"NewLimit\":200}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateBillingSupportTicketForSubscription.json
     */
    /**
     * Sample code: Create a ticket for Billing related issues.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketForBillingRelatedIssues(com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/billing_service_guid/problemClassifications/billing_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/billing_service_guid")
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSubMgmtSupportTicketForSubscription.json
     */
    /**
     * Sample code: Create a ticket for Subscription Management related issues.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketForSubscriptionManagementRelatedIssues(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/subscription_management_service_guid/problemClassifications/subscription_management_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/subscription_management_service_guid")
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateTechnicalSupportTicketForSubscription.json
     */
    /**
     * Sample code: Create a ticket for Technical issue related to a specific resource.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketForTechnicalIssueRelatedToASpecificResource(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/virtual_machine_running_linux_service_guid/problemClassifications/problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/cddd3eb5-1830-b494-44fd-782f691479dc")
            .withTechnicalTicketDetails(
                new TechnicalTicketDetails()
                    .withResourceId(
                        "/subscriptions/subid/resourceGroups/test/providers/Microsoft.Compute/virtualMachines/testserver"))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateMachineLearningQuotaTicketForDedicatedCores.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for specific VM family cores for Machine Learning service.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForSpecificVMFamilyCoresForMachineLearningService(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/machine_learning_service_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("BatchAml")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload(
                                        "{\"VMFamily\":\"standardA0_A7Family\",\"NewLimit\":200,\"Type\":\"Dedicated\"}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateSqlDatawarehouseQuotaTicketForServers.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Servers for Azure Synapse Analytics.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForServersForAzureSynapseAnalytics(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/sql_datawarehouse_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestSubType("Servers")
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays.asList(new QuotaChangeRequest().withRegion("EastUS").withPayload("{\"NewLimit\":200}"))))
            .create();
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CreateCoresQuotaTicketForSubscription.json
     */
    /**
     * Sample code: Create a ticket to request Quota increase for Compute VM Cores.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void createATicketToRequestQuotaIncreaseForComputeVMCores(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .define("testticket")
            .withDescription("my description")
            .withProblemClassificationId(
                "/providers/Microsoft.Support/services/quota_service_guid/problemClassifications/cores_problemClassification_guid")
            .withSeverity(SeverityLevel.MODERATE)
            .withContactDetails(
                new ContactProfile()
                    .withFirstName("abc")
                    .withLastName("xyz")
                    .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                    .withPrimaryEmailAddress("abc@contoso.com")
                    .withPreferredTimeZone("Pacific Standard Time")
                    .withCountry("usa")
                    .withPreferredSupportLanguage("en-US"))
            .withTitle("my title")
            .withServiceId("/providers/Microsoft.Support/services/quota_service_guid")
            .withQuotaTicketDetails(
                new QuotaTicketDetails()
                    .withQuotaChangeRequestVersion("1.0")
                    .withQuotaChangeRequests(
                        Arrays
                            .asList(
                                new QuotaChangeRequest()
                                    .withRegion("EastUS")
                                    .withPayload("{\"SKU\":\"DSv3 Series\",\"NewLimit\":104}"))))
            .create();
    }
}
