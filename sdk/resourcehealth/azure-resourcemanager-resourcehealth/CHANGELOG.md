# Release History

## 1.1.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0 (2022-12-09)

- Azure Resource Manager ResourceHealth client library for Java. This package contains Microsoft Azure SDK for ResourceHealth Management SDK. The Resource Health Client. Package tag package-2020-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.AvailabilityStatusPropertiesRecentlyResolved` was modified

* `unavailabilitySummary()` was removed
* `unavailableOccurredTime()` was removed
* `withUnavailableOccurredTime(java.time.OffsetDateTime)` was removed
* `withUnavailabilitySummary(java.lang.String)` was removed

#### `models.AvailabilityStatusProperties` was modified

* `withOccurredTime(java.time.OffsetDateTime)` was removed
* `occurredTime()` was removed

### Features Added

#### `ResourceHealthManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.AvailabilityStatusPropertiesRecentlyResolved` was modified

* `withUnavailableSummary(java.lang.String)` was added
* `withUnavailableOccuredTime(java.time.OffsetDateTime)` was added
* `unavailableSummary()` was added
* `unavailableOccuredTime()` was added

#### `models.AvailabilityStatusProperties` was modified

* `withOccuredTime(java.time.OffsetDateTime)` was added
* `occuredTime()` was added

#### `ResourceHealthManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

## 1.0.0-beta.2 (2022-03-29)

- Azure Resource Manager ResourceHealth client library for Java. This package contains Microsoft Azure SDK for ResourceHealth Management SDK. The Resource Health Client. Package tag package-2020-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.EmergingIssuesGetResult` was removed

* `models.EventsOperations` was removed

* `models.EventLevelValues` was removed

* `models.SeverityValues` was removed

* `models.StageValues` was removed

* `models.ImpactedRegion` was removed

* `models.Impact` was removed

* `models.EventTypeValues` was removed

* `models.EventPropertiesRecommendedActions` was removed

* `models.StatusActiveEvent` was removed

* `models.MetadataEntity` was removed

* `models.LinkTypeValues` was removed

* `models.StatusBanner` was removed

* `models.EventPropertiesRecommendedActionsItem` was removed

* `models.Events` was removed

* `models.ImpactedServiceRegion` was removed

* `models.LevelValues` was removed

* `models.EmergingIssueListResult` was removed

* `models.Faq` was removed

* `models.EventStatusValues` was removed

* `models.EventSourceValues` was removed

* `models.Link` was removed

* `models.Scenario` was removed

* `models.EmergingIssueImpact` was removed

* `models.LinkDisplayText` was removed

* `models.Update` was removed

* `models.EventPropertiesArticle` was removed

* `models.Event` was removed

* `models.MetadataSupportedValueDetail` was removed

* `models.EmergingIssues` was removed

#### `ResourceHealthManager` was modified

* `emergingIssues()` was removed
* `eventsOperations()` was removed

### Features Added

#### `models.AvailabilityStatusProperties` was modified

* `withTitle(java.lang.String)` was added
* `title()` was added

#### `ResourceHealthManager$Configurable` was modified

* `withScope(java.lang.String)` was added

## 1.0.0-beta.1 (2021-04-08)

- Azure Resource Manager ResourceHealth client library for Java. This package contains Microsoft Azure SDK for ResourceHealth Management SDK. The Resource Health Client. Package tag package-2018-07-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
