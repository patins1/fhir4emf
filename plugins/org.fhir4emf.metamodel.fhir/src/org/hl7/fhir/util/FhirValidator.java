/**
 */
package org.hl7.fhir.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.AccountStatusList;
import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.ActionCardinalityBehaviorList;
import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.ActionConditionKindList;
import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.ActionGroupingBehaviorList;
import org.hl7.fhir.ActionList;
import org.hl7.fhir.ActionListList;
import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.ActionParticipantTypeList;
import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.ActionPrecheckBehaviorList;
import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.ActionRelationshipTypeList;
import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.ActionRequiredBehaviorList;
import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.ActionSelectionBehaviorList;
import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.ActivityDefinitionCategoryList;
import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.Address;
import org.hl7.fhir.AddressType;
import org.hl7.fhir.AddressTypeList;
import org.hl7.fhir.AddressUse;
import org.hl7.fhir.AddressUseList;
import org.hl7.fhir.AdministrativeGender;
import org.hl7.fhir.AdministrativeGenderList;
import org.hl7.fhir.AdverseEvent;
import org.hl7.fhir.AdverseEventCategory;
import org.hl7.fhir.AdverseEventCategoryList;
import org.hl7.fhir.AdverseEventCausality;
import org.hl7.fhir.AdverseEventCausalityList;
import org.hl7.fhir.AdverseEventSuspectEntity;
import org.hl7.fhir.Age;
import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.AggregationModeList;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.AllergyIntoleranceClinicalStatus;
import org.hl7.fhir.AllergyIntoleranceClinicalStatusList;
import org.hl7.fhir.AllergyIntoleranceCriticality;
import org.hl7.fhir.AllergyIntoleranceCriticalityList;
import org.hl7.fhir.AllergyIntoleranceReaction;
import org.hl7.fhir.AllergyIntoleranceSeverity;
import org.hl7.fhir.AllergyIntoleranceSeverityList;
import org.hl7.fhir.AllergyIntoleranceType;
import org.hl7.fhir.AllergyIntoleranceTypeList;
import org.hl7.fhir.AllergyIntoleranceVerificationStatus;
import org.hl7.fhir.AllergyIntoleranceVerificationStatusList;
import org.hl7.fhir.Annotation;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.AppointmentStatusList;
import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionDirectionTypeList;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionOperatorTypeList;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.AssertionResponseTypesList;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.AuditEventActionList;
import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.AuditEventAgentNetworkTypeList;
import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.AuditEventOutcomeList;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.BackboneElement;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.BindingStrengthList;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleType;
import org.hl7.fhir.BundleTypeList;
import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.CapabilityStatementCertificate;
import org.hl7.fhir.CapabilityStatementDocument;
import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.CapabilityStatementEvent;
import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.CapabilityStatementInteraction1;
import org.hl7.fhir.CapabilityStatementKind;
import org.hl7.fhir.CapabilityStatementKindList;
import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.CapabilityStatementRest;
import org.hl7.fhir.CapabilityStatementSearchParam;
import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.CapabilityStatementSoftware;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.CarePlanActivity;
import org.hl7.fhir.CarePlanActivityStatus;
import org.hl7.fhir.CarePlanActivityStatusList;
import org.hl7.fhir.CarePlanDetail;
import org.hl7.fhir.CarePlanIntent;
import org.hl7.fhir.CarePlanIntentList;
import org.hl7.fhir.CarePlanStatus;
import org.hl7.fhir.CarePlanStatusList;
import org.hl7.fhir.CareTeam;
import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.CareTeamStatusList;
import org.hl7.fhir.Catalog;
import org.hl7.fhir.CatalogDocument;
import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.CatalogRelatedItem;
import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.ChargeItemParticipant;
import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.ChargeItemStatusList;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.ClaimCareTeam;
import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimInformation;
import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.ClinicalImpressionFinding;
import org.hl7.fhir.ClinicalImpressionInvestigation;
import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.ClinicalImpressionStatusList;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeSystem;
import org.hl7.fhir.CodeSystemConcept;
import org.hl7.fhir.CodeSystemContentMode;
import org.hl7.fhir.CodeSystemContentModeList;
import org.hl7.fhir.CodeSystemDesignation;
import org.hl7.fhir.CodeSystemFilter;
import org.hl7.fhir.CodeSystemHierarchyMeaning;
import org.hl7.fhir.CodeSystemHierarchyMeaningList;
import org.hl7.fhir.CodeSystemProperty;
import org.hl7.fhir.CodeSystemProperty1;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.CompartmentTypeList;
import org.hl7.fhir.CompositeMeasureScoring;
import org.hl7.fhir.CompositeMeasureScoringList;
import org.hl7.fhir.Composition;
import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttestationModeList;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.CompositionSection;
import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.CompositionStatusList;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapElement;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapEquivalenceList;
import org.hl7.fhir.ConceptMapGroup;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.Condition;
import org.hl7.fhir.ConditionEvidence;
import org.hl7.fhir.ConditionStage;
import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.ConditionVerificationStatusList;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConditionalDeleteStatusList;
import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.ConditionalReadStatusList;
import org.hl7.fhir.Consent;
import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.ConsentActor1;
import org.hl7.fhir.ConsentData;
import org.hl7.fhir.ConsentData1;
import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.ConsentDataMeaningList;
import org.hl7.fhir.ConsentExcept;
import org.hl7.fhir.ConsentExceptType;
import org.hl7.fhir.ConsentExceptTypeList;
import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.ConsentStatusList;
import org.hl7.fhir.ConstraintSeverity;
import org.hl7.fhir.ConstraintSeverityList;
import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.ContactPointSystemList;
import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.ContactPointUseList;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.ContentTypeList;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.Contributor;
import org.hl7.fhir.ContributorType;
import org.hl7.fhir.ContributorTypeList;
import org.hl7.fhir.Count;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.CoverageGrouping;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.DataElementMapping;
import org.hl7.fhir.DataElementStringency;
import org.hl7.fhir.DataElementStringencyList;
import org.hl7.fhir.DataRequirement;
import org.hl7.fhir.DataRequirementCodeFilter;
import org.hl7.fhir.DataRequirementDateFilter;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.DaysOfWeekList;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.DetectedIssue;
import org.hl7.fhir.DetectedIssueMitigation;
import org.hl7.fhir.DetectedIssueSeverity;
import org.hl7.fhir.DetectedIssueSeverityList;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.DeviceMetricCalibrationStateList;
import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.DeviceMetricCalibrationTypeList;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricCategoryList;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricColorList;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.DeviceMetricOperationalStatusList;
import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.DeviceRequestRequester;
import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.DeviceStatusList;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DiagnosticReportImage;
import org.hl7.fhir.DiagnosticReportPerformer;
import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.DiagnosticReportStatusList;
import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.DigitalMediaTypeList;
import org.hl7.fhir.Distance;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.DocumentManifestRelated;
import org.hl7.fhir.DocumentMode;
import org.hl7.fhir.DocumentModeList;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.DocumentReferenceStatusList;
import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.DocumentRelationshipTypeList;
import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.DomainResource;
import org.hl7.fhir.DosageInstruction;
import org.hl7.fhir.Duration;
import org.hl7.fhir.Element;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.ElementDefinitionSlicing;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.EligibilityResponseFinancial;
import org.hl7.fhir.EligibilityResponseInsurance;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EncounterClassHistory;
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.EncounterLocationStatusList;
import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.EncounterStatusHistory;
import org.hl7.fhir.EncounterStatusList;
import org.hl7.fhir.Endpoint;
import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.EndpointStatusList;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.EpisodeOfCareStatusHistory;
import org.hl7.fhir.EpisodeOfCareStatusList;
import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.EventCapabilityModeList;
import org.hl7.fhir.EventTiming;
import org.hl7.fhir.EventTimingList;
import org.hl7.fhir.ExpansionProfile;
import org.hl7.fhir.ExpansionProfileDesignation;
import org.hl7.fhir.ExpansionProfileDesignation1;
import org.hl7.fhir.ExpansionProfileDesignation2;
import org.hl7.fhir.ExpansionProfileExclude;
import org.hl7.fhir.ExpansionProfileExcludedSystem;
import org.hl7.fhir.ExpansionProfileFixedVersion;
import org.hl7.fhir.ExpansionProfileInclude;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.ExplanationOfBenefitAccident;
import org.hl7.fhir.ExplanationOfBenefitAddItem;
import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.ExplanationOfBenefitCareTeam;
import org.hl7.fhir.ExplanationOfBenefitDetail;
import org.hl7.fhir.ExplanationOfBenefitDetail1;
import org.hl7.fhir.ExplanationOfBenefitDiagnosis;
import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.ExplanationOfBenefitInformation;
import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.ExplanationOfBenefitItem;
import org.hl7.fhir.ExplanationOfBenefitPayee;
import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.ExplanationOfBenefitProcedure;
import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.ExplanationOfBenefitRelated;
import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.ExplanationOfBenefitStatusList;
import org.hl7.fhir.ExplanationOfBenefitSubDetail;
import org.hl7.fhir.Extension;
import org.hl7.fhir.ExtensionContext;
import org.hl7.fhir.ExtensionContextList;
import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FamilyHistoryStatusList;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FamilyMemberHistoryCondition;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.FilterOperator;
import org.hl7.fhir.FilterOperatorList;
import org.hl7.fhir.Flag;
import org.hl7.fhir.FlagStatus;
import org.hl7.fhir.FlagStatusList;
import org.hl7.fhir.Goal;
import org.hl7.fhir.GoalStatus;
import org.hl7.fhir.GoalStatusList;
import org.hl7.fhir.GoalTarget;
import org.hl7.fhir.Group;
import org.hl7.fhir.GroupCharacteristic;
import org.hl7.fhir.GroupMember;
import org.hl7.fhir.GroupType;
import org.hl7.fhir.GroupTypeList;
import org.hl7.fhir.GuidanceResponse;
import org.hl7.fhir.GuidanceResponseStatus;
import org.hl7.fhir.GuidanceResponseStatusList;
import org.hl7.fhir.GuideDependencyType;
import org.hl7.fhir.GuideDependencyTypeList;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.GuidePageKindList;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.HTTPVerbList;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.HealthcareServiceAvailableTime;
import org.hl7.fhir.HealthcareServiceNotAvailable;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.IdentifierUse;
import org.hl7.fhir.IdentifierUseList;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.IdentityAssuranceLevelList;
import org.hl7.fhir.ImagingManifest;
import org.hl7.fhir.ImagingManifestInstance;
import org.hl7.fhir.ImagingManifestSeries;
import org.hl7.fhir.ImagingManifestStudy;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.ImagingStudySeries;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationExplanation;
import org.hl7.fhir.ImmunizationReaction;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.ImmunizationRecommendationProtocol;
import org.hl7.fhir.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.ImmunizationVaccinationProtocol;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.ImplementationGuideDependency;
import org.hl7.fhir.ImplementationGuideGlobal;
import org.hl7.fhir.ImplementationGuidePackage;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ImplementationGuideResource;
import org.hl7.fhir.InstanceAvailability;
import org.hl7.fhir.InstanceAvailabilityList;
import org.hl7.fhir.Instant;
import org.hl7.fhir.IssueSeverity;
import org.hl7.fhir.IssueSeverityList;
import org.hl7.fhir.IssueType;
import org.hl7.fhir.IssueTypeList;
import org.hl7.fhir.Library;
import org.hl7.fhir.LinkType;
import org.hl7.fhir.LinkTypeList;
import org.hl7.fhir.Linkage;
import org.hl7.fhir.LinkageItem;
import org.hl7.fhir.LinkageType;
import org.hl7.fhir.LinkageTypeList;
import org.hl7.fhir.List;
import org.hl7.fhir.ListEntry;
import org.hl7.fhir.ListMode;
import org.hl7.fhir.ListModeList;
import org.hl7.fhir.ListStatus;
import org.hl7.fhir.ListStatusList;
import org.hl7.fhir.Location;
import org.hl7.fhir.LocationMode;
import org.hl7.fhir.LocationModeList;
import org.hl7.fhir.LocationPosition;
import org.hl7.fhir.LocationStatus;
import org.hl7.fhir.LocationStatusList;
import org.hl7.fhir.Markdown;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.MeasmntPrincipleList;
import org.hl7.fhir.Measure;
import org.hl7.fhir.MeasureDataUsage;
import org.hl7.fhir.MeasureDataUsageList;
import org.hl7.fhir.MeasureGroup;
import org.hl7.fhir.MeasurePopulation;
import org.hl7.fhir.MeasurePopulationType;
import org.hl7.fhir.MeasurePopulationTypeList;
import org.hl7.fhir.MeasureReport;
import org.hl7.fhir.MeasureReportGroup;
import org.hl7.fhir.MeasureReportGroup1;
import org.hl7.fhir.MeasureReportGroup2;
import org.hl7.fhir.MeasureReportPopulation;
import org.hl7.fhir.MeasureReportPopulation1;
import org.hl7.fhir.MeasureReportStatus;
import org.hl7.fhir.MeasureReportStatusList;
import org.hl7.fhir.MeasureReportStratifier;
import org.hl7.fhir.MeasureReportSupplementalData;
import org.hl7.fhir.MeasureReportType;
import org.hl7.fhir.MeasureReportTypeList;
import org.hl7.fhir.MeasureScoring;
import org.hl7.fhir.MeasureScoringList;
import org.hl7.fhir.MeasureStratifier;
import org.hl7.fhir.MeasureSupplementalData;
import org.hl7.fhir.MeasureType;
import org.hl7.fhir.MeasureTypeList;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.MedicationAdministrationPerformer;
import org.hl7.fhir.MedicationAdministrationStatus;
import org.hl7.fhir.MedicationAdministrationStatusList;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationContent;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationDispensePerformer;
import org.hl7.fhir.MedicationDispenseStatus;
import org.hl7.fhir.MedicationDispenseStatusList;
import org.hl7.fhir.MedicationDispenseSubstitution;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationPackage;
import org.hl7.fhir.MedicationProduct;
import org.hl7.fhir.MedicationRequest;
import org.hl7.fhir.MedicationRequestDispenseRequest;
import org.hl7.fhir.MedicationRequestIntent;
import org.hl7.fhir.MedicationRequestIntentList;
import org.hl7.fhir.MedicationRequestPriority;
import org.hl7.fhir.MedicationRequestPriorityList;
import org.hl7.fhir.MedicationRequestRequester;
import org.hl7.fhir.MedicationRequestStatus;
import org.hl7.fhir.MedicationRequestStatusList;
import org.hl7.fhir.MedicationRequestSubstitution;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MedicationStatementStatus;
import org.hl7.fhir.MedicationStatementStatusList;
import org.hl7.fhir.MedicationStatementTaken;
import org.hl7.fhir.MedicationStatementTakenList;
import org.hl7.fhir.MedicationStatus;
import org.hl7.fhir.MedicationStatusList;
import org.hl7.fhir.MessageDefinition;
import org.hl7.fhir.MessageDefinitionAllowedResponse;
import org.hl7.fhir.MessageDefinitionFocus;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.MessageHeaderDestination;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.MessageHeaderSource;
import org.hl7.fhir.MessageSignificanceCategory;
import org.hl7.fhir.MessageSignificanceCategoryList;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Money;
import org.hl7.fhir.NameUse;
import org.hl7.fhir.NameUseList;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NamingSystemIdentifierType;
import org.hl7.fhir.NamingSystemIdentifierTypeList;
import org.hl7.fhir.NamingSystemType;
import org.hl7.fhir.NamingSystemTypeList;
import org.hl7.fhir.NamingSystemUniqueId;
import org.hl7.fhir.Narrative;
import org.hl7.fhir.NarrativeStatus;
import org.hl7.fhir.NarrativeStatusList;
import org.hl7.fhir.NoteType;
import org.hl7.fhir.NoteTypeList;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderAdministration;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderStatusList;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.NutritionOrderTexture;
import org.hl7.fhir.Observation;
import org.hl7.fhir.ObservationComponent;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.ObservationRelated;
import org.hl7.fhir.ObservationRelationshipType;
import org.hl7.fhir.ObservationRelationshipTypeList;
import org.hl7.fhir.ObservationStatus;
import org.hl7.fhir.ObservationStatusList;
import org.hl7.fhir.Oid;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationDefinitionBinding;
import org.hl7.fhir.OperationDefinitionOverload;
import org.hl7.fhir.OperationDefinitionParameter;
import org.hl7.fhir.OperationKind;
import org.hl7.fhir.OperationKindList;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.OperationOutcomeIssue;
import org.hl7.fhir.OperationParameterUse;
import org.hl7.fhir.OperationParameterUseList;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.ParameterDefinition;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.ParametersParameter;
import org.hl7.fhir.ParticipantRequired;
import org.hl7.fhir.ParticipantRequiredList;
import org.hl7.fhir.ParticipationStatus;
import org.hl7.fhir.ParticipationStatusList;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PatientAnimal;
import org.hl7.fhir.PatientCommunication;
import org.hl7.fhir.PatientContact;
import org.hl7.fhir.PatientLink;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationProcessNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Person;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.PlanDefinition;
import org.hl7.fhir.PlanDefinitionActionDefinition;
import org.hl7.fhir.PlanDefinitionCondition;
import org.hl7.fhir.PlanDefinitionDynamicValue;
import org.hl7.fhir.PlanDefinitionRelatedAction;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.PractitionerQualification;
import org.hl7.fhir.PractitionerRole;
import org.hl7.fhir.PractitionerRole1;
import org.hl7.fhir.PractitionerRoleAvailableTime;
import org.hl7.fhir.PractitionerRoleNotAvailable;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureFocalDevice;
import org.hl7.fhir.ProcedurePerformer;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcedureRequestRequester;
import org.hl7.fhir.ProcedureStatus;
import org.hl7.fhir.ProcedureStatusList;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.ProcessResponseProcessNote;
import org.hl7.fhir.PropertyRepresentation;
import org.hl7.fhir.PropertyRepresentationList;
import org.hl7.fhir.PropertyType;
import org.hl7.fhir.PropertyTypeList;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.ProvenanceAgent;
import org.hl7.fhir.ProvenanceEntity;
import org.hl7.fhir.ProvenanceEntityRole;
import org.hl7.fhir.ProvenanceEntityRoleList;
import org.hl7.fhir.PublicationStatus;
import org.hl7.fhir.PublicationStatusList;
import org.hl7.fhir.QualityType;
import org.hl7.fhir.QualityTypeList;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.QuantityComparator;
import org.hl7.fhir.QuantityComparatorList;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireEnableWhen;
import org.hl7.fhir.QuestionnaireItem;
import org.hl7.fhir.QuestionnaireItemType;
import org.hl7.fhir.QuestionnaireItemTypeList;
import org.hl7.fhir.QuestionnaireOption;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.QuestionnaireResponseAnswer;
import org.hl7.fhir.QuestionnaireResponseItem;
import org.hl7.fhir.QuestionnaireResponseStatus;
import org.hl7.fhir.QuestionnaireResponseStatusList;
import org.hl7.fhir.QuestionnaireStatus;
import org.hl7.fhir.QuestionnaireStatusList;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ReferenceHandlingPolicy;
import org.hl7.fhir.ReferenceHandlingPolicyList;
import org.hl7.fhir.ReferenceVersionRules;
import org.hl7.fhir.ReferenceVersionRulesList;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.ReferralRequestStatus;
import org.hl7.fhir.ReferralRequestStatusList;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RelatedArtifactType;
import org.hl7.fhir.RelatedArtifactTypeList;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RemittanceOutcome;
import org.hl7.fhir.RemittanceOutcomeList;
import org.hl7.fhir.RepositoryType;
import org.hl7.fhir.RepositoryTypeList;
import org.hl7.fhir.RequestGroup;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.ResearchStudy;
import org.hl7.fhir.ResearchStudyArm;
import org.hl7.fhir.ResearchStudyStatus;
import org.hl7.fhir.ResearchStudyStatusList;
import org.hl7.fhir.ResearchSubject;
import org.hl7.fhir.ResearchSubjectStatus;
import org.hl7.fhir.ResearchSubjectStatusList;
import org.hl7.fhir.Resource;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.ResourceVersionPolicy;
import org.hl7.fhir.ResourceVersionPolicyList;
import org.hl7.fhir.ResponseType;
import org.hl7.fhir.ResponseTypeList;
import org.hl7.fhir.RestfulCapabilityMode;
import org.hl7.fhir.RestfulCapabilityModeList;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.RiskAssessmentPrediction;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.SampledDataDataType;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchComparator;
import org.hl7.fhir.SearchComparatorList;
import org.hl7.fhir.SearchEntryMode;
import org.hl7.fhir.SearchEntryModeList;
import org.hl7.fhir.SearchModifierCode;
import org.hl7.fhir.SearchModifierCodeList;
import org.hl7.fhir.SearchParamType;
import org.hl7.fhir.SearchParamTypeList;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.SearchParameterComponent;
import org.hl7.fhir.Sequence;
import org.hl7.fhir.SequenceQuality;
import org.hl7.fhir.SequenceReferenceSeq;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.SequenceType;
import org.hl7.fhir.SequenceTypeList;
import org.hl7.fhir.SequenceVariant;
import org.hl7.fhir.ServiceDefinition;
import org.hl7.fhir.Signature;
import org.hl7.fhir.SlicingRules;
import org.hl7.fhir.SlicingRulesList;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;
import org.hl7.fhir.SlotStatusList;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.SpecimenCollection;
import org.hl7.fhir.SpecimenContainer;
import org.hl7.fhir.SpecimenProcessing;
import org.hl7.fhir.SpecimenStatus;
import org.hl7.fhir.SpecimenStatusList;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionDifferential;
import org.hl7.fhir.StructureDefinitionKind;
import org.hl7.fhir.StructureDefinitionKindList;
import org.hl7.fhir.StructureDefinitionMapping;
import org.hl7.fhir.StructureDefinitionSnapshot;
import org.hl7.fhir.StructureMap;
import org.hl7.fhir.StructureMapContextType;
import org.hl7.fhir.StructureMapContextTypeList;
import org.hl7.fhir.StructureMapDependent;
import org.hl7.fhir.StructureMapGroup;
import org.hl7.fhir.StructureMapGroupTypeMode;
import org.hl7.fhir.StructureMapGroupTypeModeList;
import org.hl7.fhir.StructureMapInput;
import org.hl7.fhir.StructureMapInputMode;
import org.hl7.fhir.StructureMapInputModeList;
import org.hl7.fhir.StructureMapModelMode;
import org.hl7.fhir.StructureMapModelModeList;
import org.hl7.fhir.StructureMapParameter;
import org.hl7.fhir.StructureMapRule;
import org.hl7.fhir.StructureMapSource;
import org.hl7.fhir.StructureMapSourceListMode;
import org.hl7.fhir.StructureMapSourceListModeList;
import org.hl7.fhir.StructureMapStructure;
import org.hl7.fhir.StructureMapTarget;
import org.hl7.fhir.StructureMapTargetListMode;
import org.hl7.fhir.StructureMapTargetListModeList;
import org.hl7.fhir.StructureMapTransform;
import org.hl7.fhir.StructureMapTransformList;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.SubscriptionChannel;
import org.hl7.fhir.SubscriptionChannelType;
import org.hl7.fhir.SubscriptionChannelTypeList;
import org.hl7.fhir.SubscriptionStatus;
import org.hl7.fhir.SubscriptionStatusList;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SubstanceIngredient;
import org.hl7.fhir.SubstanceInstance;
import org.hl7.fhir.SubstanceStatus;
import org.hl7.fhir.SubstanceStatusList;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyDeliveryStatus;
import org.hl7.fhir.SupplyDeliveryStatusList;
import org.hl7.fhir.SupplyDeliverySuppliedItem;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.SupplyRequestStatus;
import org.hl7.fhir.SupplyRequestStatusList;
import org.hl7.fhir.SupplyRequestWhen;
import org.hl7.fhir.SystemRestfulInteraction;
import org.hl7.fhir.SystemRestfulInteractionList;
import org.hl7.fhir.SystemVersionProcessingMode;
import org.hl7.fhir.SystemVersionProcessingModeList;
import org.hl7.fhir.Task;
import org.hl7.fhir.TaskInput;
import org.hl7.fhir.TaskOutput;
import org.hl7.fhir.TaskRequester;
import org.hl7.fhir.TaskRestriction;
import org.hl7.fhir.TaskStatus;
import org.hl7.fhir.TaskStatusList;
import org.hl7.fhir.TestReport;
import org.hl7.fhir.TestReportAction;
import org.hl7.fhir.TestReportAction1;
import org.hl7.fhir.TestReportAction2;
import org.hl7.fhir.TestReportActionResult;
import org.hl7.fhir.TestReportActionResultList;
import org.hl7.fhir.TestReportAssert;
import org.hl7.fhir.TestReportOperation;
import org.hl7.fhir.TestReportParticipant;
import org.hl7.fhir.TestReportParticipantType;
import org.hl7.fhir.TestReportParticipantTypeList;
import org.hl7.fhir.TestReportResult;
import org.hl7.fhir.TestReportResultList;
import org.hl7.fhir.TestReportSetup;
import org.hl7.fhir.TestReportStatus;
import org.hl7.fhir.TestReportStatusList;
import org.hl7.fhir.TestReportTeardown;
import org.hl7.fhir.TestReportTest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.TestScriptAction;
import org.hl7.fhir.TestScriptAction1;
import org.hl7.fhir.TestScriptAction2;
import org.hl7.fhir.TestScriptAssert;
import org.hl7.fhir.TestScriptCapability;
import org.hl7.fhir.TestScriptDestination;
import org.hl7.fhir.TestScriptFixture;
import org.hl7.fhir.TestScriptLink;
import org.hl7.fhir.TestScriptMetadata;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptOrigin;
import org.hl7.fhir.TestScriptParam;
import org.hl7.fhir.TestScriptParam1;
import org.hl7.fhir.TestScriptParam2;
import org.hl7.fhir.TestScriptParam3;
import org.hl7.fhir.TestScriptRequestHeader;
import org.hl7.fhir.TestScriptRule;
import org.hl7.fhir.TestScriptRule1;
import org.hl7.fhir.TestScriptRule2;
import org.hl7.fhir.TestScriptRule3;
import org.hl7.fhir.TestScriptRuleset;
import org.hl7.fhir.TestScriptRuleset1;
import org.hl7.fhir.TestScriptSetup;
import org.hl7.fhir.TestScriptTeardown;
import org.hl7.fhir.TestScriptTest;
import org.hl7.fhir.TestScriptVariable;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.TimingRepeat;
import org.hl7.fhir.TriggerDefinition;
import org.hl7.fhir.TriggerType;
import org.hl7.fhir.TriggerTypeList;
import org.hl7.fhir.TypeDerivationRule;
import org.hl7.fhir.TypeDerivationRuleList;
import org.hl7.fhir.TypeRestfulInteraction;
import org.hl7.fhir.TypeRestfulInteractionList;
import org.hl7.fhir.UnitsOfTime;
import org.hl7.fhir.UnitsOfTimeList;
import org.hl7.fhir.UnknownContentCode;
import org.hl7.fhir.UnknownContentCodeList;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.UsageContext;
import org.hl7.fhir.Use;
import org.hl7.fhir.UseList;
import org.hl7.fhir.Uuid;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetContains;
import org.hl7.fhir.ValueSetDesignation;
import org.hl7.fhir.ValueSetExpansion;
import org.hl7.fhir.ValueSetFilter;
import org.hl7.fhir.ValueSetInclude;
import org.hl7.fhir.ValueSetParameter;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionBaseList;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionEyesList;
import org.hl7.fhir.VisionPrescription;
import org.hl7.fhir.VisionPrescriptionDispense;
import org.hl7.fhir.XPathUsageType;
import org.hl7.fhir.XPathUsageTypeList;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage
 * @generated
 */
public class FhirValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FhirValidator INSTANCE = new FhirValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.fhir";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FhirPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FhirPackage.ACCOUNT:
				return validateAccount((Account)value, diagnostics, context);
			case FhirPackage.ACCOUNT_GUARANTOR:
				return validateAccountGuarantor((AccountGuarantor)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS:
				return validateAccountStatus((AccountStatus)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR:
				return validateActionCardinalityBehavior((ActionCardinalityBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND:
				return validateActionConditionKind((ActionConditionKind)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR:
				return validateActionGroupingBehavior((ActionGroupingBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_LIST:
				return validateActionList((ActionList)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE:
				return validateActionParticipantType((ActionParticipantType)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR:
				return validateActionPrecheckBehavior((ActionPrecheckBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE:
				return validateActionRelationshipType((ActionRelationshipType)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR:
				return validateActionRequiredBehavior((ActionRequiredBehavior)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR:
				return validateActionSelectionBehavior((ActionSelectionBehavior)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION:
				return validateActivityDefinition((ActivityDefinition)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY:
				return validateActivityDefinitionCategory((ActivityDefinitionCategory)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_DYNAMIC_VALUE:
				return validateActivityDefinitionDynamicValue((ActivityDefinitionDynamicValue)value, diagnostics, context);
			case FhirPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE:
				return validateAddressUse((AddressUse)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER:
				return validateAdministrativeGender((AdministrativeGender)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT:
				return validateAdverseEvent((AdverseEvent)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CATEGORY:
				return validateAdverseEventCategory((AdverseEventCategory)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY:
				return validateAdverseEventCausality((AdverseEventCausality)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_SUSPECT_ENTITY:
				return validateAdverseEventSuspectEntity((AdverseEventSuspectEntity)value, diagnostics, context);
			case FhirPackage.AGE:
				return validateAge((Age)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE:
				return validateAggregationMode((AggregationMode)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS:
				return validateAllergyIntoleranceClinicalStatus((AllergyIntoleranceClinicalStatus)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY:
				return validateAllergyIntoleranceCriticality((AllergyIntoleranceCriticality)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_REACTION:
				return validateAllergyIntoleranceReaction((AllergyIntoleranceReaction)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY:
				return validateAllergyIntoleranceSeverity((AllergyIntoleranceSeverity)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE:
				return validateAllergyIntoleranceType((AllergyIntoleranceType)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS:
				return validateAllergyIntoleranceVerificationStatus((AllergyIntoleranceVerificationStatus)value, diagnostics, context);
			case FhirPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case FhirPackage.APPOINTMENT:
				return validateAppointment((Appointment)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_PARTICIPANT:
				return validateAppointmentParticipant((AppointmentParticipant)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_RESPONSE:
				return validateAppointmentResponse((AppointmentResponse)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS:
				return validateAppointmentStatus((AppointmentStatus)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE:
				return validateAssertionDirectionType((AssertionDirectionType)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE:
				return validateAssertionOperatorType((AssertionOperatorType)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES:
				return validateAssertionResponseTypes((AssertionResponseTypes)value, diagnostics, context);
			case FhirPackage.ATTACHMENT:
				return validateAttachment((Attachment)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT:
				return validateAuditEvent((AuditEvent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION:
				return validateAuditEventAction((AuditEventAction)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT:
				return validateAuditEventAgent((AuditEventAgent)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE:
				return validateAuditEventAgentNetworkType((AuditEventAgentNetworkType)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_DETAIL:
				return validateAuditEventDetail((AuditEventDetail)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ENTITY:
				return validateAuditEventEntity((AuditEventEntity)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_NETWORK:
				return validateAuditEventNetwork((AuditEventNetwork)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME:
				return validateAuditEventOutcome((AuditEventOutcome)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_SOURCE:
				return validateAuditEventSource((AuditEventSource)value, diagnostics, context);
			case FhirPackage.BACKBONE_ELEMENT:
				return validateBackboneElement((BackboneElement)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case FhirPackage.BASIC:
				return validateBasic((Basic)value, diagnostics, context);
			case FhirPackage.BINARY:
				return validateBinary((Binary)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH:
				return validateBindingStrength((BindingStrength)value, diagnostics, context);
			case FhirPackage.BODY_SITE:
				return validateBodySite((BodySite)value, diagnostics, context);
			case FhirPackage.BOOLEAN:
				return validateBoolean((org.hl7.fhir.Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case FhirPackage.BUNDLE_ENTRY:
				return validateBundleEntry((BundleEntry)value, diagnostics, context);
			case FhirPackage.BUNDLE_LINK:
				return validateBundleLink((BundleLink)value, diagnostics, context);
			case FhirPackage.BUNDLE_REQUEST:
				return validateBundleRequest((BundleRequest)value, diagnostics, context);
			case FhirPackage.BUNDLE_RESPONSE:
				return validateBundleResponse((BundleResponse)value, diagnostics, context);
			case FhirPackage.BUNDLE_SEARCH:
				return validateBundleSearch((BundleSearch)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE:
				return validateBundleType((BundleType)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT:
				return validateCapabilityStatement((CapabilityStatement)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_CERTIFICATE:
				return validateCapabilityStatementCertificate((CapabilityStatementCertificate)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_DOCUMENT:
				return validateCapabilityStatementDocument((CapabilityStatementDocument)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_ENDPOINT:
				return validateCapabilityStatementEndpoint((CapabilityStatementEndpoint)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_EVENT:
				return validateCapabilityStatementEvent((CapabilityStatementEvent)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_IMPLEMENTATION:
				return validateCapabilityStatementImplementation((CapabilityStatementImplementation)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION:
				return validateCapabilityStatementInteraction((CapabilityStatementInteraction)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_INTERACTION1:
				return validateCapabilityStatementInteraction1((CapabilityStatementInteraction1)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND:
				return validateCapabilityStatementKind((CapabilityStatementKind)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_MESSAGING:
				return validateCapabilityStatementMessaging((CapabilityStatementMessaging)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_OPERATION:
				return validateCapabilityStatementOperation((CapabilityStatementOperation)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_RESOURCE:
				return validateCapabilityStatementResource((CapabilityStatementResource)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_REST:
				return validateCapabilityStatementRest((CapabilityStatementRest)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SEARCH_PARAM:
				return validateCapabilityStatementSearchParam((CapabilityStatementSearchParam)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SECURITY:
				return validateCapabilityStatementSecurity((CapabilityStatementSecurity)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_SOFTWARE:
				return validateCapabilityStatementSoftware((CapabilityStatementSoftware)value, diagnostics, context);
			case FhirPackage.CARE_PLAN:
				return validateCarePlan((CarePlan)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY:
				return validateCarePlanActivity((CarePlanActivity)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS:
				return validateCarePlanActivityStatus((CarePlanActivityStatus)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_DETAIL:
				return validateCarePlanDetail((CarePlanDetail)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT:
				return validateCarePlanIntent((CarePlanIntent)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS:
				return validateCarePlanStatus((CarePlanStatus)value, diagnostics, context);
			case FhirPackage.CARE_TEAM:
				return validateCareTeam((CareTeam)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_PARTICIPANT:
				return validateCareTeamParticipant((CareTeamParticipant)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS:
				return validateCareTeamStatus((CareTeamStatus)value, diagnostics, context);
			case FhirPackage.CATALOG:
				return validateCatalog((Catalog)value, diagnostics, context);
			case FhirPackage.CATALOG_DOCUMENT:
				return validateCatalogDocument((CatalogDocument)value, diagnostics, context);
			case FhirPackage.CATALOG_ENTRY:
				return validateCatalogEntry((CatalogEntry)value, diagnostics, context);
			case FhirPackage.CATALOG_RELATED_ITEM:
				return validateCatalogRelatedItem((CatalogRelatedItem)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM:
				return validateChargeItem((ChargeItem)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_PARTICIPANT:
				return validateChargeItemParticipant((ChargeItemParticipant)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS:
				return validateChargeItemStatus((ChargeItemStatus)value, diagnostics, context);
			case FhirPackage.CLAIM:
				return validateClaim((Claim)value, diagnostics, context);
			case FhirPackage.CLAIM_ACCIDENT:
				return validateClaimAccident((ClaimAccident)value, diagnostics, context);
			case FhirPackage.CLAIM_CARE_TEAM:
				return validateClaimCareTeam((ClaimCareTeam)value, diagnostics, context);
			case FhirPackage.CLAIM_DETAIL:
				return validateClaimDetail((ClaimDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_DIAGNOSIS:
				return validateClaimDiagnosis((ClaimDiagnosis)value, diagnostics, context);
			case FhirPackage.CLAIM_INFORMATION:
				return validateClaimInformation((ClaimInformation)value, diagnostics, context);
			case FhirPackage.CLAIM_INSURANCE:
				return validateClaimInsurance((ClaimInsurance)value, diagnostics, context);
			case FhirPackage.CLAIM_ITEM:
				return validateClaimItem((ClaimItem)value, diagnostics, context);
			case FhirPackage.CLAIM_PAYEE:
				return validateClaimPayee((ClaimPayee)value, diagnostics, context);
			case FhirPackage.CLAIM_PROCEDURE:
				return validateClaimProcedure((ClaimProcedure)value, diagnostics, context);
			case FhirPackage.CLAIM_RELATED:
				return validateClaimRelated((ClaimRelated)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE:
				return validateClaimResponse((ClaimResponse)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM:
				return validateClaimResponseAddItem((ClaimResponseAddItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ADJUDICATION:
				return validateClaimResponseAdjudication((ClaimResponseAdjudication)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL:
				return validateClaimResponseDetail((ClaimResponseDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_DETAIL1:
				return validateClaimResponseDetail1((ClaimResponseDetail1)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ERROR:
				return validateClaimResponseError((ClaimResponseError)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_INSURANCE:
				return validateClaimResponseInsurance((ClaimResponseInsurance)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_ITEM:
				return validateClaimResponseItem((ClaimResponseItem)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_PAYMENT:
				return validateClaimResponsePayment((ClaimResponsePayment)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_PROCESS_NOTE:
				return validateClaimResponseProcessNote((ClaimResponseProcessNote)value, diagnostics, context);
			case FhirPackage.CLAIM_RESPONSE_SUB_DETAIL:
				return validateClaimResponseSubDetail((ClaimResponseSubDetail)value, diagnostics, context);
			case FhirPackage.CLAIM_SUB_DETAIL:
				return validateClaimSubDetail((ClaimSubDetail)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION:
				return validateClinicalImpression((ClinicalImpression)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_FINDING:
				return validateClinicalImpressionFinding((ClinicalImpressionFinding)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_INVESTIGATION:
				return validateClinicalImpressionInvestigation((ClinicalImpressionInvestigation)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS:
				return validateClinicalImpressionStatus((ClinicalImpressionStatus)value, diagnostics, context);
			case FhirPackage.CODE:
				return validateCode((Code)value, diagnostics, context);
			case FhirPackage.CODEABLE_CONCEPT:
				return validateCodeableConcept((CodeableConcept)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM:
				return validateCodeSystem((CodeSystem)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONCEPT:
				return validateCodeSystemConcept((CodeSystemConcept)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE:
				return validateCodeSystemContentMode((CodeSystemContentMode)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_DESIGNATION:
				return validateCodeSystemDesignation((CodeSystemDesignation)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_FILTER:
				return validateCodeSystemFilter((CodeSystemFilter)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING:
				return validateCodeSystemHierarchyMeaning((CodeSystemHierarchyMeaning)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY:
				return validateCodeSystemProperty((CodeSystemProperty)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_PROPERTY1:
				return validateCodeSystemProperty1((CodeSystemProperty1)value, diagnostics, context);
			case FhirPackage.CODING:
				return validateCoding((Coding)value, diagnostics, context);
			case FhirPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_PAYLOAD:
				return validateCommunicationPayload((CommunicationPayload)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST:
				return validateCommunicationRequest((CommunicationRequest)value, diagnostics, context);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD:
				return validateCommunicationRequestPayload((CommunicationRequestPayload)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION:
				return validateCompartmentDefinition((CompartmentDefinition)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_DEFINITION_RESOURCE:
				return validateCompartmentDefinitionResource((CompartmentDefinitionResource)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE:
				return validateCompartmentType((CompartmentType)value, diagnostics, context);
			case FhirPackage.COMPOSITE_MEASURE_SCORING:
				return validateCompositeMeasureScoring((CompositeMeasureScoring)value, diagnostics, context);
			case FhirPackage.COMPOSITION:
				return validateComposition((Composition)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE:
				return validateCompositionAttestationMode((CompositionAttestationMode)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTER:
				return validateCompositionAttester((CompositionAttester)value, diagnostics, context);
			case FhirPackage.COMPOSITION_EVENT:
				return validateCompositionEvent((CompositionEvent)value, diagnostics, context);
			case FhirPackage.COMPOSITION_SECTION:
				return validateCompositionSection((CompositionSection)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS:
				return validateCompositionStatus((CompositionStatus)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP:
				return validateConceptMap((ConceptMap)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_DEPENDS_ON:
				return validateConceptMapDependsOn((ConceptMapDependsOn)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_ELEMENT:
				return validateConceptMapElement((ConceptMapElement)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE:
				return validateConceptMapEquivalence((ConceptMapEquivalence)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_GROUP:
				return validateConceptMapGroup((ConceptMapGroup)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_TARGET:
				return validateConceptMapTarget((ConceptMapTarget)value, diagnostics, context);
			case FhirPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS:
				return validateConditionalDeleteStatus((ConditionalDeleteStatus)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS:
				return validateConditionalReadStatus((ConditionalReadStatus)value, diagnostics, context);
			case FhirPackage.CONDITION_EVIDENCE:
				return validateConditionEvidence((ConditionEvidence)value, diagnostics, context);
			case FhirPackage.CONDITION_STAGE:
				return validateConditionStage((ConditionStage)value, diagnostics, context);
			case FhirPackage.CONDITION_VERIFICATION_STATUS:
				return validateConditionVerificationStatus((ConditionVerificationStatus)value, diagnostics, context);
			case FhirPackage.CONSENT:
				return validateConsent((Consent)value, diagnostics, context);
			case FhirPackage.CONSENT_ACTOR:
				return validateConsentActor((ConsentActor)value, diagnostics, context);
			case FhirPackage.CONSENT_ACTOR1:
				return validateConsentActor1((ConsentActor1)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA:
				return validateConsentData((ConsentData)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA1:
				return validateConsentData1((ConsentData1)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING:
				return validateConsentDataMeaning((ConsentDataMeaning)value, diagnostics, context);
			case FhirPackage.CONSENT_EXCEPT:
				return validateConsentExcept((ConsentExcept)value, diagnostics, context);
			case FhirPackage.CONSENT_EXCEPT_TYPE:
				return validateConsentExceptType((ConsentExceptType)value, diagnostics, context);
			case FhirPackage.CONSENT_STATUS:
				return validateConsentStatus((ConsentStatus)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY:
				return validateConstraintSeverity((ConstraintSeverity)value, diagnostics, context);
			case FhirPackage.CONTACT_DETAIL:
				return validateContactDetail((ContactDetail)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT:
				return validateContactPoint((ContactPoint)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM:
				return validateContactPointSystem((ContactPointSystem)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE:
				return validateContactPointUse((ContactPointUse)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE:
				return validateContentType((ContentType)value, diagnostics, context);
			case FhirPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case FhirPackage.CONTRACT_AGENT:
				return validateContractAgent((ContractAgent)value, diagnostics, context);
			case FhirPackage.CONTRACT_AGENT1:
				return validateContractAgent1((ContractAgent1)value, diagnostics, context);
			case FhirPackage.CONTRACT_FRIENDLY:
				return validateContractFriendly((ContractFriendly)value, diagnostics, context);
			case FhirPackage.CONTRACT_LEGAL:
				return validateContractLegal((ContractLegal)value, diagnostics, context);
			case FhirPackage.CONTRACT_RULE:
				return validateContractRule((ContractRule)value, diagnostics, context);
			case FhirPackage.CONTRACT_SIGNER:
				return validateContractSigner((ContractSigner)value, diagnostics, context);
			case FhirPackage.CONTRACT_TERM:
				return validateContractTerm((ContractTerm)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM:
				return validateContractValuedItem((ContractValuedItem)value, diagnostics, context);
			case FhirPackage.CONTRACT_VALUED_ITEM1:
				return validateContractValuedItem1((ContractValuedItem1)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR:
				return validateContributor((Contributor)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE:
				return validateContributorType((ContributorType)value, diagnostics, context);
			case FhirPackage.COUNT:
				return validateCount((Count)value, diagnostics, context);
			case FhirPackage.COVERAGE:
				return validateCoverage((Coverage)value, diagnostics, context);
			case FhirPackage.COVERAGE_GROUPING:
				return validateCoverageGrouping((CoverageGrouping)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT:
				return validateDataElement((DataElement)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_MAPPING:
				return validateDataElementMapping((DataElementMapping)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_STRINGENCY:
				return validateDataElementStringency((DataElementStringency)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT:
				return validateDataRequirement((DataRequirement)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_CODE_FILTER:
				return validateDataRequirementCodeFilter((DataRequirementCodeFilter)value, diagnostics, context);
			case FhirPackage.DATA_REQUIREMENT_DATE_FILTER:
				return validateDataRequirementDateFilter((DataRequirementDateFilter)value, diagnostics, context);
			case FhirPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case FhirPackage.DATE_TIME:
				return validateDateTime((DateTime)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK:
				return validateDaysOfWeek((DaysOfWeek)value, diagnostics, context);
			case FhirPackage.DECIMAL:
				return validateDecimal((Decimal)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE:
				return validateDetectedIssue((DetectedIssue)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_MITIGATION:
				return validateDetectedIssueMitigation((DetectedIssueMitigation)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY:
				return validateDetectedIssueSeverity((DetectedIssueSeverity)value, diagnostics, context);
			case FhirPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT:
				return validateDeviceComponent((DeviceComponent)value, diagnostics, context);
			case FhirPackage.DEVICE_COMPONENT_PRODUCTION_SPECIFICATION:
				return validateDeviceComponentProductionSpecification((DeviceComponentProductionSpecification)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC:
				return validateDeviceMetric((DeviceMetric)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION:
				return validateDeviceMetricCalibration((DeviceMetricCalibration)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE:
				return validateDeviceMetricCalibrationState((DeviceMetricCalibrationState)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE:
				return validateDeviceMetricCalibrationType((DeviceMetricCalibrationType)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY:
				return validateDeviceMetricCategory((DeviceMetricCategory)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR:
				return validateDeviceMetricColor((DeviceMetricColor)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS:
				return validateDeviceMetricOperationalStatus((DeviceMetricOperationalStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_REQUEST:
				return validateDeviceRequest((DeviceRequest)value, diagnostics, context);
			case FhirPackage.DEVICE_REQUEST_REQUESTER:
				return validateDeviceRequestRequester((DeviceRequestRequester)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS:
				return validateDeviceStatus((DeviceStatus)value, diagnostics, context);
			case FhirPackage.DEVICE_USE_STATEMENT:
				return validateDeviceUseStatement((DeviceUseStatement)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT:
				return validateDiagnosticReport((DiagnosticReport)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_IMAGE:
				return validateDiagnosticReportImage((DiagnosticReportImage)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_PERFORMER:
				return validateDiagnosticReportPerformer((DiagnosticReportPerformer)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS:
				return validateDiagnosticReportStatus((DiagnosticReportStatus)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE:
				return validateDigitalMediaType((DigitalMediaType)value, diagnostics, context);
			case FhirPackage.DISTANCE:
				return validateDistance((Distance)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST:
				return validateDocumentManifest((DocumentManifest)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT:
				return validateDocumentManifestContent((DocumentManifestContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MANIFEST_RELATED:
				return validateDocumentManifestRelated((DocumentManifestRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE:
				return validateDocumentMode((DocumentMode)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE:
				return validateDocumentReference((DocumentReference)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTENT:
				return validateDocumentReferenceContent((DocumentReferenceContent)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_CONTEXT:
				return validateDocumentReferenceContext((DocumentReferenceContext)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATED:
				return validateDocumentReferenceRelated((DocumentReferenceRelated)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_RELATES_TO:
				return validateDocumentReferenceRelatesTo((DocumentReferenceRelatesTo)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS:
				return validateDocumentReferenceStatus((DocumentReferenceStatus)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE:
				return validateDocumentRelationshipType((DocumentRelationshipType)value, diagnostics, context);
			case FhirPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FhirPackage.DOMAIN_RESOURCE:
				return validateDomainResource((DomainResource)value, diagnostics, context);
			case FhirPackage.DOSAGE_INSTRUCTION:
				return validateDosageInstruction((DosageInstruction)value, diagnostics, context);
			case FhirPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case FhirPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION:
				return validateElementDefinition((ElementDefinition)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BASE:
				return validateElementDefinitionBase((ElementDefinitionBase)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_BINDING:
				return validateElementDefinitionBinding((ElementDefinitionBinding)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_CONSTRAINT:
				return validateElementDefinitionConstraint((ElementDefinitionConstraint)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_EXAMPLE:
				return validateElementDefinitionExample((ElementDefinitionExample)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_MAPPING:
				return validateElementDefinitionMapping((ElementDefinitionMapping)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_SLICING:
				return validateElementDefinitionSlicing((ElementDefinitionSlicing)value, diagnostics, context);
			case FhirPackage.ELEMENT_DEFINITION_TYPE:
				return validateElementDefinitionType((ElementDefinitionType)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_REQUEST:
				return validateEligibilityRequest((EligibilityRequest)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE:
				return validateEligibilityResponse((EligibilityResponse)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_BENEFIT_BALANCE:
				return validateEligibilityResponseBenefitBalance((EligibilityResponseBenefitBalance)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_ERROR:
				return validateEligibilityResponseError((EligibilityResponseError)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_FINANCIAL:
				return validateEligibilityResponseFinancial((EligibilityResponseFinancial)value, diagnostics, context);
			case FhirPackage.ELIGIBILITY_RESPONSE_INSURANCE:
				return validateEligibilityResponseInsurance((EligibilityResponseInsurance)value, diagnostics, context);
			case FhirPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_CLASS_HISTORY:
				return validateEncounterClassHistory((EncounterClassHistory)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION:
				return validateEncounterHospitalization((EncounterHospitalization)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS:
				return validateEncounterLocationStatus((EncounterLocationStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS:
				return validateEncounterStatus((EncounterStatus)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_HISTORY:
				return validateEncounterStatusHistory((EncounterStatusHistory)value, diagnostics, context);
			case FhirPackage.ENDPOINT:
				return validateEndpoint((Endpoint)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS:
				return validateEndpointStatus((EndpointStatus)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_REQUEST:
				return validateEnrollmentRequest((EnrollmentRequest)value, diagnostics, context);
			case FhirPackage.ENROLLMENT_RESPONSE:
				return validateEnrollmentResponse((EnrollmentResponse)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE:
				return validateEpisodeOfCare((EpisodeOfCare)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS:
				return validateEpisodeOfCareStatus((EpisodeOfCareStatus)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_HISTORY:
				return validateEpisodeOfCareStatusHistory((EpisodeOfCareStatusHistory)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE:
				return validateEventCapabilityMode((EventCapabilityMode)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING:
				return validateEventTiming((EventTiming)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE:
				return validateExpansionProfile((ExpansionProfile)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION:
				return validateExpansionProfileDesignation((ExpansionProfileDesignation)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION1:
				return validateExpansionProfileDesignation1((ExpansionProfileDesignation1)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_DESIGNATION2:
				return validateExpansionProfileDesignation2((ExpansionProfileDesignation2)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_EXCLUDE:
				return validateExpansionProfileExclude((ExpansionProfileExclude)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_EXCLUDED_SYSTEM:
				return validateExpansionProfileExcludedSystem((ExpansionProfileExcludedSystem)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_FIXED_VERSION:
				return validateExpansionProfileFixedVersion((ExpansionProfileFixedVersion)value, diagnostics, context);
			case FhirPackage.EXPANSION_PROFILE_INCLUDE:
				return validateExpansionProfileInclude((ExpansionProfileInclude)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT:
				return validateExplanationOfBenefit((ExplanationOfBenefit)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ACCIDENT:
				return validateExplanationOfBenefitAccident((ExplanationOfBenefitAccident)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADD_ITEM:
				return validateExplanationOfBenefitAddItem((ExplanationOfBenefitAddItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ADJUDICATION:
				return validateExplanationOfBenefitAdjudication((ExplanationOfBenefitAdjudication)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_BENEFIT_BALANCE:
				return validateExplanationOfBenefitBenefitBalance((ExplanationOfBenefitBenefitBalance)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM:
				return validateExplanationOfBenefitCareTeam((ExplanationOfBenefitCareTeam)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL:
				return validateExplanationOfBenefitDetail((ExplanationOfBenefitDetail)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DETAIL1:
				return validateExplanationOfBenefitDetail1((ExplanationOfBenefitDetail1)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_DIAGNOSIS:
				return validateExplanationOfBenefitDiagnosis((ExplanationOfBenefitDiagnosis)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_FINANCIAL:
				return validateExplanationOfBenefitFinancial((ExplanationOfBenefitFinancial)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_INFORMATION:
				return validateExplanationOfBenefitInformation((ExplanationOfBenefitInformation)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_INSURANCE:
				return validateExplanationOfBenefitInsurance((ExplanationOfBenefitInsurance)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_ITEM:
				return validateExplanationOfBenefitItem((ExplanationOfBenefitItem)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYEE:
				return validateExplanationOfBenefitPayee((ExplanationOfBenefitPayee)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PAYMENT:
				return validateExplanationOfBenefitPayment((ExplanationOfBenefitPayment)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCEDURE:
				return validateExplanationOfBenefitProcedure((ExplanationOfBenefitProcedure)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_PROCESS_NOTE:
				return validateExplanationOfBenefitProcessNote((ExplanationOfBenefitProcessNote)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_RELATED:
				return validateExplanationOfBenefitRelated((ExplanationOfBenefitRelated)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS:
				return validateExplanationOfBenefitStatus((ExplanationOfBenefitStatus)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_SUB_DETAIL:
				return validateExplanationOfBenefitSubDetail((ExplanationOfBenefitSubDetail)value, diagnostics, context);
			case FhirPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT:
				return validateExtensionContext((ExtensionContext)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS:
				return validateFamilyHistoryStatus((FamilyHistoryStatus)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY:
				return validateFamilyMemberHistory((FamilyMemberHistory)value, diagnostics, context);
			case FhirPackage.FAMILY_MEMBER_HISTORY_CONDITION:
				return validateFamilyMemberHistoryCondition((FamilyMemberHistoryCondition)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR:
				return validateFilterOperator((FilterOperator)value, diagnostics, context);
			case FhirPackage.FLAG:
				return validateFlag((Flag)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS:
				return validateFlagStatus((FlagStatus)value, diagnostics, context);
			case FhirPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS:
				return validateGoalStatus((GoalStatus)value, diagnostics, context);
			case FhirPackage.GOAL_TARGET:
				return validateGoalTarget((GoalTarget)value, diagnostics, context);
			case FhirPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case FhirPackage.GROUP_CHARACTERISTIC:
				return validateGroupCharacteristic((GroupCharacteristic)value, diagnostics, context);
			case FhirPackage.GROUP_MEMBER:
				return validateGroupMember((GroupMember)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE:
				return validateGuidanceResponse((GuidanceResponse)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS:
				return validateGuidanceResponseStatus((GuidanceResponseStatus)value, diagnostics, context);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE:
				return validateGuideDependencyType((GuideDependencyType)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_KIND:
				return validateGuidePageKind((GuidePageKind)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE:
				return validateHealthcareService((HealthcareService)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_AVAILABLE_TIME:
				return validateHealthcareServiceAvailableTime((HealthcareServiceAvailableTime)value, diagnostics, context);
			case FhirPackage.HEALTHCARE_SERVICE_NOT_AVAILABLE:
				return validateHealthcareServiceNotAvailable((HealthcareServiceNotAvailable)value, diagnostics, context);
			case FhirPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case FhirPackage.HUMAN_NAME:
				return validateHumanName((HumanName)value, diagnostics, context);
			case FhirPackage.ID:
				return validateId((Id)value, diagnostics, context);
			case FhirPackage.IDENTIFIER:
				return validateIdentifier((Identifier)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE:
				return validateIdentifierUse((IdentifierUse)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL:
				return validateIdentityAssuranceLevel((IdentityAssuranceLevel)value, diagnostics, context);
			case FhirPackage.IMAGING_MANIFEST:
				return validateImagingManifest((ImagingManifest)value, diagnostics, context);
			case FhirPackage.IMAGING_MANIFEST_INSTANCE:
				return validateImagingManifestInstance((ImagingManifestInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_MANIFEST_SERIES:
				return validateImagingManifestSeries((ImagingManifestSeries)value, diagnostics, context);
			case FhirPackage.IMAGING_MANIFEST_STUDY:
				return validateImagingManifestStudy((ImagingManifestStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY:
				return validateImagingStudy((ImagingStudy)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_INSTANCE:
				return validateImagingStudyInstance((ImagingStudyInstance)value, diagnostics, context);
			case FhirPackage.IMAGING_STUDY_SERIES:
				return validateImagingStudySeries((ImagingStudySeries)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_EXPLANATION:
				return validateImmunizationExplanation((ImmunizationExplanation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_REACTION:
				return validateImmunizationReaction((ImmunizationReaction)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION:
				return validateImmunizationRecommendation((ImmunizationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_DATE_CRITERION:
				return validateImmunizationRecommendationDateCriterion((ImmunizationRecommendationDateCriterion)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_PROTOCOL:
				return validateImmunizationRecommendationProtocol((ImmunizationRecommendationProtocol)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_RECOMMENDATION_RECOMMENDATION:
				return validateImmunizationRecommendationRecommendation((ImmunizationRecommendationRecommendation)value, diagnostics, context);
			case FhirPackage.IMMUNIZATION_VACCINATION_PROTOCOL:
				return validateImmunizationVaccinationProtocol((ImmunizationVaccinationProtocol)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE:
				return validateImplementationGuide((ImplementationGuide)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_DEPENDENCY:
				return validateImplementationGuideDependency((ImplementationGuideDependency)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_GLOBAL:
				return validateImplementationGuideGlobal((ImplementationGuideGlobal)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PACKAGE:
				return validateImplementationGuidePackage((ImplementationGuidePackage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE:
				return validateImplementationGuidePage((ImplementationGuidePage)value, diagnostics, context);
			case FhirPackage.IMPLEMENTATION_GUIDE_RESOURCE:
				return validateImplementationGuideResource((ImplementationGuideResource)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY:
				return validateInstanceAvailability((InstanceAvailability)value, diagnostics, context);
			case FhirPackage.INSTANT:
				return validateInstant((Instant)value, diagnostics, context);
			case FhirPackage.INTEGER:
				return validateInteger((org.hl7.fhir.Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY:
				return validateIssueSeverity((IssueSeverity)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE:
				return validateIssueType((IssueType)value, diagnostics, context);
			case FhirPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case FhirPackage.LINKAGE:
				return validateLinkage((Linkage)value, diagnostics, context);
			case FhirPackage.LINKAGE_ITEM:
				return validateLinkageItem((LinkageItem)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE:
				return validateLinkageType((LinkageType)value, diagnostics, context);
			case FhirPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case FhirPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FhirPackage.LIST_ENTRY:
				return validateListEntry((ListEntry)value, diagnostics, context);
			case FhirPackage.LIST_MODE:
				return validateListMode((ListMode)value, diagnostics, context);
			case FhirPackage.LIST_STATUS:
				return validateListStatus((ListStatus)value, diagnostics, context);
			case FhirPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE:
				return validateLocationMode((LocationMode)value, diagnostics, context);
			case FhirPackage.LOCATION_POSITION:
				return validateLocationPosition((LocationPosition)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS:
				return validateLocationStatus((LocationStatus)value, diagnostics, context);
			case FhirPackage.MARKDOWN:
				return validateMarkdown((Markdown)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE:
				return validateMeasmntPrinciple((MeasmntPrinciple)value, diagnostics, context);
			case FhirPackage.MEASURE:
				return validateMeasure((Measure)value, diagnostics, context);
			case FhirPackage.MEASURE_DATA_USAGE:
				return validateMeasureDataUsage((MeasureDataUsage)value, diagnostics, context);
			case FhirPackage.MEASURE_GROUP:
				return validateMeasureGroup((MeasureGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION:
				return validateMeasurePopulation((MeasurePopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION_TYPE:
				return validateMeasurePopulationType((MeasurePopulationType)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT:
				return validateMeasureReport((MeasureReport)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP:
				return validateMeasureReportGroup((MeasureReportGroup)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP1:
				return validateMeasureReportGroup1((MeasureReportGroup1)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_GROUP2:
				return validateMeasureReportGroup2((MeasureReportGroup2)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION:
				return validateMeasureReportPopulation((MeasureReportPopulation)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_POPULATION1:
				return validateMeasureReportPopulation1((MeasureReportPopulation1)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS:
				return validateMeasureReportStatus((MeasureReportStatus)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STRATIFIER:
				return validateMeasureReportStratifier((MeasureReportStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_SUPPLEMENTAL_DATA:
				return validateMeasureReportSupplementalData((MeasureReportSupplementalData)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE:
				return validateMeasureReportType((MeasureReportType)value, diagnostics, context);
			case FhirPackage.MEASURE_SCORING:
				return validateMeasureScoring((MeasureScoring)value, diagnostics, context);
			case FhirPackage.MEASURE_STRATIFIER:
				return validateMeasureStratifier((MeasureStratifier)value, diagnostics, context);
			case FhirPackage.MEASURE_SUPPLEMENTAL_DATA:
				return validateMeasureSupplementalData((MeasureSupplementalData)value, diagnostics, context);
			case FhirPackage.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case FhirPackage.MEDIA:
				return validateMedia((Media)value, diagnostics, context);
			case FhirPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION:
				return validateMedicationAdministration((MedicationAdministration)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE:
				return validateMedicationAdministrationDosage((MedicationAdministrationDosage)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_PERFORMER:
				return validateMedicationAdministrationPerformer((MedicationAdministrationPerformer)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS:
				return validateMedicationAdministrationStatus((MedicationAdministrationStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_BATCH:
				return validateMedicationBatch((MedicationBatch)value, diagnostics, context);
			case FhirPackage.MEDICATION_CONTENT:
				return validateMedicationContent((MedicationContent)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE:
				return validateMedicationDispense((MedicationDispense)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_PERFORMER:
				return validateMedicationDispensePerformer((MedicationDispensePerformer)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS:
				return validateMedicationDispenseStatus((MedicationDispenseStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_SUBSTITUTION:
				return validateMedicationDispenseSubstitution((MedicationDispenseSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_INGREDIENT:
				return validateMedicationIngredient((MedicationIngredient)value, diagnostics, context);
			case FhirPackage.MEDICATION_PACKAGE:
				return validateMedicationPackage((MedicationPackage)value, diagnostics, context);
			case FhirPackage.MEDICATION_PRODUCT:
				return validateMedicationProduct((MedicationProduct)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST:
				return validateMedicationRequest((MedicationRequest)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_DISPENSE_REQUEST:
				return validateMedicationRequestDispenseRequest((MedicationRequestDispenseRequest)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT:
				return validateMedicationRequestIntent((MedicationRequestIntent)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY:
				return validateMedicationRequestPriority((MedicationRequestPriority)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_REQUESTER:
				return validateMedicationRequestRequester((MedicationRequestRequester)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_STATUS:
				return validateMedicationRequestStatus((MedicationRequestStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_SUBSTITUTION:
				return validateMedicationRequestSubstitution((MedicationRequestSubstitution)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT:
				return validateMedicationStatement((MedicationStatement)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS:
				return validateMedicationStatementStatus((MedicationStatementStatus)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN:
				return validateMedicationStatementTaken((MedicationStatementTaken)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS:
				return validateMedicationStatus((MedicationStatus)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION:
				return validateMessageDefinition((MessageDefinition)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION_ALLOWED_RESPONSE:
				return validateMessageDefinitionAllowedResponse((MessageDefinitionAllowedResponse)value, diagnostics, context);
			case FhirPackage.MESSAGE_DEFINITION_FOCUS:
				return validateMessageDefinitionFocus((MessageDefinitionFocus)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER:
				return validateMessageHeader((MessageHeader)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_DESTINATION:
				return validateMessageHeaderDestination((MessageHeaderDestination)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_RESPONSE:
				return validateMessageHeaderResponse((MessageHeaderResponse)value, diagnostics, context);
			case FhirPackage.MESSAGE_HEADER_SOURCE:
				return validateMessageHeaderSource((MessageHeaderSource)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY:
				return validateMessageSignificanceCategory((MessageSignificanceCategory)value, diagnostics, context);
			case FhirPackage.META:
				return validateMeta((Meta)value, diagnostics, context);
			case FhirPackage.MONEY:
				return validateMoney((Money)value, diagnostics, context);
			case FhirPackage.NAME_USE:
				return validateNameUse((NameUse)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM:
				return validateNamingSystem((NamingSystem)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE:
				return validateNamingSystemIdentifierType((NamingSystemIdentifierType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE:
				return validateNamingSystemType((NamingSystemType)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_UNIQUE_ID:
				return validateNamingSystemUniqueId((NamingSystemUniqueId)value, diagnostics, context);
			case FhirPackage.NARRATIVE:
				return validateNarrative((Narrative)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS:
				return validateNarrativeStatus((NarrativeStatus)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER:
				return validateNutritionOrder((NutritionOrder)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ADMINISTRATION:
				return validateNutritionOrderAdministration((NutritionOrderAdministration)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA:
				return validateNutritionOrderEnteralFormula((NutritionOrderEnteralFormula)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_NUTRIENT:
				return validateNutritionOrderNutrient((NutritionOrderNutrient)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_ORAL_DIET:
				return validateNutritionOrderOralDiet((NutritionOrderOralDiet)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS:
				return validateNutritionOrderStatus((NutritionOrderStatus)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_SUPPLEMENT:
				return validateNutritionOrderSupplement((NutritionOrderSupplement)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_TEXTURE:
				return validateNutritionOrderTexture((NutritionOrderTexture)value, diagnostics, context);
			case FhirPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case FhirPackage.OBSERVATION_COMPONENT:
				return validateObservationComponent((ObservationComponent)value, diagnostics, context);
			case FhirPackage.OBSERVATION_REFERENCE_RANGE:
				return validateObservationReferenceRange((ObservationReferenceRange)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATED:
				return validateObservationRelated((ObservationRelated)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE:
				return validateObservationRelationshipType((ObservationRelationshipType)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS:
				return validateObservationStatus((ObservationStatus)value, diagnostics, context);
			case FhirPackage.OID:
				return validateOid((Oid)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION:
				return validateOperationDefinition((OperationDefinition)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_BINDING:
				return validateOperationDefinitionBinding((OperationDefinitionBinding)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_OVERLOAD:
				return validateOperationDefinitionOverload((OperationDefinitionOverload)value, diagnostics, context);
			case FhirPackage.OPERATION_DEFINITION_PARAMETER:
				return validateOperationDefinitionParameter((OperationDefinitionParameter)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND:
				return validateOperationKind((OperationKind)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME:
				return validateOperationOutcome((OperationOutcome)value, diagnostics, context);
			case FhirPackage.OPERATION_OUTCOME_ISSUE:
				return validateOperationOutcomeIssue((OperationOutcomeIssue)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE:
				return validateOperationParameterUse((OperationParameterUse)value, diagnostics, context);
			case FhirPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case FhirPackage.ORGANIZATION_CONTACT:
				return validateOrganizationContact((OrganizationContact)value, diagnostics, context);
			case FhirPackage.PARAMETER_DEFINITION:
				return validateParameterDefinition((ParameterDefinition)value, diagnostics, context);
			case FhirPackage.PARAMETERS:
				return validateParameters((Parameters)value, diagnostics, context);
			case FhirPackage.PARAMETERS_PARAMETER:
				return validateParametersParameter((ParametersParameter)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED:
				return validateParticipantRequired((ParticipantRequired)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS:
				return validateParticipationStatus((ParticipationStatus)value, diagnostics, context);
			case FhirPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case FhirPackage.PATIENT_ANIMAL:
				return validatePatientAnimal((PatientAnimal)value, diagnostics, context);
			case FhirPackage.PATIENT_COMMUNICATION:
				return validatePatientCommunication((PatientCommunication)value, diagnostics, context);
			case FhirPackage.PATIENT_CONTACT:
				return validatePatientContact((PatientContact)value, diagnostics, context);
			case FhirPackage.PATIENT_LINK:
				return validatePatientLink((PatientLink)value, diagnostics, context);
			case FhirPackage.PAYMENT_NOTICE:
				return validatePaymentNotice((PaymentNotice)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION:
				return validatePaymentReconciliation((PaymentReconciliation)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_DETAIL:
				return validatePaymentReconciliationDetail((PaymentReconciliationDetail)value, diagnostics, context);
			case FhirPackage.PAYMENT_RECONCILIATION_PROCESS_NOTE:
				return validatePaymentReconciliationProcessNote((PaymentReconciliationProcessNote)value, diagnostics, context);
			case FhirPackage.PERIOD:
				return validatePeriod((Period)value, diagnostics, context);
			case FhirPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case FhirPackage.PERSON_LINK:
				return validatePersonLink((PersonLink)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION:
				return validatePlanDefinition((PlanDefinition)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_ACTION_DEFINITION:
				return validatePlanDefinitionActionDefinition((PlanDefinitionActionDefinition)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_CONDITION:
				return validatePlanDefinitionCondition((PlanDefinitionCondition)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_DYNAMIC_VALUE:
				return validatePlanDefinitionDynamicValue((PlanDefinitionDynamicValue)value, diagnostics, context);
			case FhirPackage.PLAN_DEFINITION_RELATED_ACTION:
				return validatePlanDefinitionRelatedAction((PlanDefinitionRelatedAction)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT:
				return validatePositiveInt((PositiveInt)value, diagnostics, context);
			case FhirPackage.PRACTITIONER:
				return validatePractitioner((Practitioner)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_QUALIFICATION:
				return validatePractitionerQualification((PractitionerQualification)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE:
				return validatePractitionerRole((PractitionerRole)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE1:
				return validatePractitionerRole1((PractitionerRole1)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_AVAILABLE_TIME:
				return validatePractitionerRoleAvailableTime((PractitionerRoleAvailableTime)value, diagnostics, context);
			case FhirPackage.PRACTITIONER_ROLE_NOT_AVAILABLE:
				return validatePractitionerRoleNotAvailable((PractitionerRoleNotAvailable)value, diagnostics, context);
			case FhirPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case FhirPackage.PROCEDURE_FOCAL_DEVICE:
				return validateProcedureFocalDevice((ProcedureFocalDevice)value, diagnostics, context);
			case FhirPackage.PROCEDURE_PERFORMER:
				return validateProcedurePerformer((ProcedurePerformer)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST:
				return validateProcedureRequest((ProcedureRequest)value, diagnostics, context);
			case FhirPackage.PROCEDURE_REQUEST_REQUESTER:
				return validateProcedureRequestRequester((ProcedureRequestRequester)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS:
				return validateProcedureStatus((ProcedureStatus)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST:
				return validateProcessRequest((ProcessRequest)value, diagnostics, context);
			case FhirPackage.PROCESS_REQUEST_ITEM:
				return validateProcessRequestItem((ProcessRequestItem)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE:
				return validateProcessResponse((ProcessResponse)value, diagnostics, context);
			case FhirPackage.PROCESS_RESPONSE_PROCESS_NOTE:
				return validateProcessResponseProcessNote((ProcessResponseProcessNote)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION:
				return validatePropertyRepresentation((PropertyRepresentation)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case FhirPackage.PROVENANCE:
				return validateProvenance((Provenance)value, diagnostics, context);
			case FhirPackage.PROVENANCE_AGENT:
				return validateProvenanceAgent((ProvenanceAgent)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY:
				return validateProvenanceEntity((ProvenanceEntity)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE:
				return validateProvenanceEntityRole((ProvenanceEntityRole)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS:
				return validatePublicationStatus((PublicationStatus)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE:
				return validateQualityType((QualityType)value, diagnostics, context);
			case FhirPackage.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR:
				return validateQuantityComparator((QuantityComparator)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE:
				return validateQuestionnaire((Questionnaire)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ENABLE_WHEN:
				return validateQuestionnaireEnableWhen((QuestionnaireEnableWhen)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM:
				return validateQuestionnaireItem((QuestionnaireItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE:
				return validateQuestionnaireItemType((QuestionnaireItemType)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_OPTION:
				return validateQuestionnaireOption((QuestionnaireOption)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE:
				return validateQuestionnaireResponse((QuestionnaireResponse)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ANSWER:
				return validateQuestionnaireResponseAnswer((QuestionnaireResponseAnswer)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_ITEM:
				return validateQuestionnaireResponseItem((QuestionnaireResponseItem)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS:
				return validateQuestionnaireResponseStatus((QuestionnaireResponseStatus)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS:
				return validateQuestionnaireStatus((QuestionnaireStatus)value, diagnostics, context);
			case FhirPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case FhirPackage.RATIO:
				return validateRatio((Ratio)value, diagnostics, context);
			case FhirPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY:
				return validateReferenceHandlingPolicy((ReferenceHandlingPolicy)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES:
				return validateReferenceVersionRules((ReferenceVersionRules)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST:
				return validateReferralRequest((ReferralRequest)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST_STATUS:
				return validateReferralRequestStatus((ReferralRequestStatus)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT:
				return validateRelatedArtifact((RelatedArtifact)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE:
				return validateRelatedArtifactType((RelatedArtifactType)value, diagnostics, context);
			case FhirPackage.RELATED_PERSON:
				return validateRelatedPerson((RelatedPerson)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME:
				return validateRemittanceOutcome((RemittanceOutcome)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE:
				return validateRepositoryType((RepositoryType)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP:
				return validateRequestGroup((RequestGroup)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_ACTION:
				return validateRequestGroupAction((RequestGroupAction)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_CONDITION:
				return validateRequestGroupCondition((RequestGroupCondition)value, diagnostics, context);
			case FhirPackage.REQUEST_GROUP_RELATED_ACTION:
				return validateRequestGroupRelatedAction((RequestGroupRelatedAction)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY:
				return validateResearchStudy((ResearchStudy)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_ARM:
				return validateResearchStudyArm((ResearchStudyArm)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS:
				return validateResearchStudyStatus((ResearchStudyStatus)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT:
				return validateResearchSubject((ResearchSubject)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS:
				return validateResearchSubjectStatus((ResearchSubjectStatus)value, diagnostics, context);
			case FhirPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case FhirPackage.RESOURCE_CONTAINER:
				return validateResourceContainer((ResourceContainer)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY:
				return validateResourceVersionPolicy((ResourceVersionPolicy)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE:
				return validateResponseType((ResponseType)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE:
				return validateRestfulCapabilityMode((RestfulCapabilityMode)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT:
				return validateRiskAssessment((RiskAssessment)value, diagnostics, context);
			case FhirPackage.RISK_ASSESSMENT_PREDICTION:
				return validateRiskAssessmentPrediction((RiskAssessmentPrediction)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA:
				return validateSampledData((SampledData)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE:
				return validateSampledDataDataType((SampledDataDataType)value, diagnostics, context);
			case FhirPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR:
				return validateSearchComparator((SearchComparator)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE:
				return validateSearchEntryMode((SearchEntryMode)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE:
				return validateSearchModifierCode((SearchModifierCode)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER:
				return validateSearchParameter((SearchParameter)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAMETER_COMPONENT:
				return validateSearchParameterComponent((SearchParameterComponent)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE:
				return validateSearchParamType((SearchParamType)value, diagnostics, context);
			case FhirPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case FhirPackage.SEQUENCE_QUALITY:
				return validateSequenceQuality((SequenceQuality)value, diagnostics, context);
			case FhirPackage.SEQUENCE_REFERENCE_SEQ:
				return validateSequenceReferenceSeq((SequenceReferenceSeq)value, diagnostics, context);
			case FhirPackage.SEQUENCE_REPOSITORY:
				return validateSequenceRepository((SequenceRepository)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case FhirPackage.SEQUENCE_VARIANT:
				return validateSequenceVariant((SequenceVariant)value, diagnostics, context);
			case FhirPackage.SERVICE_DEFINITION:
				return validateServiceDefinition((ServiceDefinition)value, diagnostics, context);
			case FhirPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case FhirPackage.SLICING_RULES:
				return validateSlicingRules((SlicingRules)value, diagnostics, context);
			case FhirPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS:
				return validateSlotStatus((SlotStatus)value, diagnostics, context);
			case FhirPackage.SPECIMEN:
				return validateSpecimen((Specimen)value, diagnostics, context);
			case FhirPackage.SPECIMEN_COLLECTION:
				return validateSpecimenCollection((SpecimenCollection)value, diagnostics, context);
			case FhirPackage.SPECIMEN_CONTAINER:
				return validateSpecimenContainer((SpecimenContainer)value, diagnostics, context);
			case FhirPackage.SPECIMEN_PROCESSING:
				return validateSpecimenProcessing((SpecimenProcessing)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS:
				return validateSpecimenStatus((SpecimenStatus)value, diagnostics, context);
			case FhirPackage.STRING:
				return validateString((org.hl7.fhir.String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION:
				return validateStructureDefinition((StructureDefinition)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_DIFFERENTIAL:
				return validateStructureDefinitionDifferential((StructureDefinitionDifferential)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND:
				return validateStructureDefinitionKind((StructureDefinitionKind)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_MAPPING:
				return validateStructureDefinitionMapping((StructureDefinitionMapping)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_SNAPSHOT:
				return validateStructureDefinitionSnapshot((StructureDefinitionSnapshot)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP:
				return validateStructureMap((StructureMap)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE:
				return validateStructureMapContextType((StructureMapContextType)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_DEPENDENT:
				return validateStructureMapDependent((StructureMapDependent)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP:
				return validateStructureMapGroup((StructureMapGroup)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE:
				return validateStructureMapGroupTypeMode((StructureMapGroupTypeMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT:
				return validateStructureMapInput((StructureMapInput)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE:
				return validateStructureMapInputMode((StructureMapInputMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE:
				return validateStructureMapModelMode((StructureMapModelMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_PARAMETER:
				return validateStructureMapParameter((StructureMapParameter)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_RULE:
				return validateStructureMapRule((StructureMapRule)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE:
				return validateStructureMapSource((StructureMapSource)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE:
				return validateStructureMapSourceListMode((StructureMapSourceListMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_STRUCTURE:
				return validateStructureMapStructure((StructureMapStructure)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET:
				return validateStructureMapTarget((StructureMapTarget)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE:
				return validateStructureMapTargetListMode((StructureMapTargetListMode)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM:
				return validateStructureMapTransform((StructureMapTransform)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL:
				return validateSubscriptionChannel((SubscriptionChannel)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE:
				return validateSubscriptionChannelType((SubscriptionChannelType)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS:
				return validateSubscriptionStatus((SubscriptionStatus)value, diagnostics, context);
			case FhirPackage.SUBSTANCE:
				return validateSubstance((Substance)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INGREDIENT:
				return validateSubstanceIngredient((SubstanceIngredient)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_INSTANCE:
				return validateSubstanceInstance((SubstanceInstance)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_STATUS:
				return validateSubstanceStatus((SubstanceStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY:
				return validateSupplyDelivery((SupplyDelivery)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS:
				return validateSupplyDeliveryStatus((SupplyDeliveryStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_SUPPLIED_ITEM:
				return validateSupplyDeliverySuppliedItem((SupplyDeliverySuppliedItem)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST:
				return validateSupplyRequest((SupplyRequest)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS:
				return validateSupplyRequestStatus((SupplyRequestStatus)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_WHEN:
				return validateSupplyRequestWhen((SupplyRequestWhen)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION:
				return validateSystemRestfulInteraction((SystemRestfulInteraction)value, diagnostics, context);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE:
				return validateSystemVersionProcessingMode((SystemVersionProcessingMode)value, diagnostics, context);
			case FhirPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case FhirPackage.TASK_INPUT:
				return validateTaskInput((TaskInput)value, diagnostics, context);
			case FhirPackage.TASK_OUTPUT:
				return validateTaskOutput((TaskOutput)value, diagnostics, context);
			case FhirPackage.TASK_REQUESTER:
				return validateTaskRequester((TaskRequester)value, diagnostics, context);
			case FhirPackage.TASK_RESTRICTION:
				return validateTaskRestriction((TaskRestriction)value, diagnostics, context);
			case FhirPackage.TASK_STATUS:
				return validateTaskStatus((TaskStatus)value, diagnostics, context);
			case FhirPackage.TEST_REPORT:
				return validateTestReport((TestReport)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION:
				return validateTestReportAction((TestReportAction)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION1:
				return validateTestReportAction1((TestReportAction1)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION2:
				return validateTestReportAction2((TestReportAction2)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT:
				return validateTestReportActionResult((TestReportActionResult)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ASSERT:
				return validateTestReportAssert((TestReportAssert)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_OPERATION:
				return validateTestReportOperation((TestReportOperation)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT:
				return validateTestReportParticipant((TestReportParticipant)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE:
				return validateTestReportParticipantType((TestReportParticipantType)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT:
				return validateTestReportResult((TestReportResult)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_SETUP:
				return validateTestReportSetup((TestReportSetup)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS:
				return validateTestReportStatus((TestReportStatus)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_TEARDOWN:
				return validateTestReportTeardown((TestReportTeardown)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_TEST:
				return validateTestReportTest((TestReportTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT:
				return validateTestScript((TestScript)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION:
				return validateTestScriptAction((TestScriptAction)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION1:
				return validateTestScriptAction1((TestScriptAction1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ACTION2:
				return validateTestScriptAction2((TestScriptAction2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ASSERT:
				return validateTestScriptAssert((TestScriptAssert)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_CAPABILITY:
				return validateTestScriptCapability((TestScriptCapability)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_DESTINATION:
				return validateTestScriptDestination((TestScriptDestination)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_FIXTURE:
				return validateTestScriptFixture((TestScriptFixture)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_LINK:
				return validateTestScriptLink((TestScriptLink)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_METADATA:
				return validateTestScriptMetadata((TestScriptMetadata)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_OPERATION:
				return validateTestScriptOperation((TestScriptOperation)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_ORIGIN:
				return validateTestScriptOrigin((TestScriptOrigin)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM:
				return validateTestScriptParam((TestScriptParam)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM1:
				return validateTestScriptParam1((TestScriptParam1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM2:
				return validateTestScriptParam2((TestScriptParam2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_PARAM3:
				return validateTestScriptParam3((TestScriptParam3)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_REQUEST_HEADER:
				return validateTestScriptRequestHeader((TestScriptRequestHeader)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE:
				return validateTestScriptRule((TestScriptRule)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE1:
				return validateTestScriptRule1((TestScriptRule1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE2:
				return validateTestScriptRule2((TestScriptRule2)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULE3:
				return validateTestScriptRule3((TestScriptRule3)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULESET:
				return validateTestScriptRuleset((TestScriptRuleset)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_RULESET1:
				return validateTestScriptRuleset1((TestScriptRuleset1)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_SETUP:
				return validateTestScriptSetup((TestScriptSetup)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEARDOWN:
				return validateTestScriptTeardown((TestScriptTeardown)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_TEST:
				return validateTestScriptTest((TestScriptTest)value, diagnostics, context);
			case FhirPackage.TEST_SCRIPT_VARIABLE:
				return validateTestScriptVariable((TestScriptVariable)value, diagnostics, context);
			case FhirPackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case FhirPackage.TIMING:
				return validateTiming((Timing)value, diagnostics, context);
			case FhirPackage.TIMING_REPEAT:
				return validateTimingRepeat((TimingRepeat)value, diagnostics, context);
			case FhirPackage.TRIGGER_DEFINITION:
				return validateTriggerDefinition((TriggerDefinition)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE:
				return validateTypeDerivationRule((TypeDerivationRule)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION:
				return validateTypeRestfulInteraction((TypeRestfulInteraction)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME:
				return validateUnitsOfTime((UnitsOfTime)value, diagnostics, context);
			case FhirPackage.UNKNOWN_CONTENT_CODE:
				return validateUnknownContentCode((UnknownContentCode)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT:
				return validateUnsignedInt((UnsignedInt)value, diagnostics, context);
			case FhirPackage.URI:
				return validateUri((Uri)value, diagnostics, context);
			case FhirPackage.USAGE_CONTEXT:
				return validateUsageContext((UsageContext)value, diagnostics, context);
			case FhirPackage.USE:
				return validateUse((Use)value, diagnostics, context);
			case FhirPackage.UUID:
				return validateUuid((Uuid)value, diagnostics, context);
			case FhirPackage.VALUE_SET:
				return validateValueSet((ValueSet)value, diagnostics, context);
			case FhirPackage.VALUE_SET_COMPOSE:
				return validateValueSetCompose((ValueSetCompose)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONCEPT:
				return validateValueSetConcept((ValueSetConcept)value, diagnostics, context);
			case FhirPackage.VALUE_SET_CONTAINS:
				return validateValueSetContains((ValueSetContains)value, diagnostics, context);
			case FhirPackage.VALUE_SET_DESIGNATION:
				return validateValueSetDesignation((ValueSetDesignation)value, diagnostics, context);
			case FhirPackage.VALUE_SET_EXPANSION:
				return validateValueSetExpansion((ValueSetExpansion)value, diagnostics, context);
			case FhirPackage.VALUE_SET_FILTER:
				return validateValueSetFilter((ValueSetFilter)value, diagnostics, context);
			case FhirPackage.VALUE_SET_INCLUDE:
				return validateValueSetInclude((ValueSetInclude)value, diagnostics, context);
			case FhirPackage.VALUE_SET_PARAMETER:
				return validateValueSetParameter((ValueSetParameter)value, diagnostics, context);
			case FhirPackage.VISION_BASE:
				return validateVisionBase((VisionBase)value, diagnostics, context);
			case FhirPackage.VISION_EYES:
				return validateVisionEyes((VisionEyes)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION:
				return validateVisionPrescription((VisionPrescription)value, diagnostics, context);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE:
				return validateVisionPrescriptionDispense((VisionPrescriptionDispense)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE:
				return validateXPathUsageType((XPathUsageType)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_LIST:
				return validateAccountStatusList((AccountStatusList)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST:
				return validateActionCardinalityBehaviorList((ActionCardinalityBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND_LIST:
				return validateActionConditionKindList((ActionConditionKindList)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST:
				return validateActionGroupingBehaviorList((ActionGroupingBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_LIST_LIST:
				return validateActionListList((ActionListList)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST:
				return validateActionParticipantTypeList((ActionParticipantTypeList)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST:
				return validateActionPrecheckBehaviorList((ActionPrecheckBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST:
				return validateActionRelationshipTypeList((ActionRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST:
				return validateActionRequiredBehaviorList((ActionRequiredBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST:
				return validateActionSelectionBehaviorList((ActionSelectionBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST:
				return validateActivityDefinitionCategoryList((ActivityDefinitionCategoryList)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_LIST:
				return validateAddressTypeList((AddressTypeList)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_LIST:
				return validateAddressUseList((AddressUseList)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST:
				return validateAdministrativeGenderList((AdministrativeGenderList)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST:
				return validateAdverseEventCategoryList((AdverseEventCategoryList)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST:
				return validateAdverseEventCausalityList((AdverseEventCausalityList)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_LIST:
				return validateAggregationModeList((AggregationModeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST:
				return validateAllergyIntoleranceClinicalStatusList((AllergyIntoleranceClinicalStatusList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST:
				return validateAllergyIntoleranceCriticalityList((AllergyIntoleranceCriticalityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST:
				return validateAllergyIntoleranceSeverityList((AllergyIntoleranceSeverityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST:
				return validateAllergyIntoleranceTypeList((AllergyIntoleranceTypeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST:
				return validateAllergyIntoleranceVerificationStatusList((AllergyIntoleranceVerificationStatusList)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_LIST:
				return validateAppointmentStatusList((AppointmentStatusList)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST:
				return validateAssertionDirectionTypeList((AssertionDirectionTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST:
				return validateAssertionOperatorTypeList((AssertionOperatorTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST:
				return validateAssertionResponseTypesList((AssertionResponseTypesList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST:
				return validateAuditEventActionList((AuditEventActionList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST:
				return validateAuditEventAgentNetworkTypeList((AuditEventAgentNetworkTypeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST:
				return validateAuditEventOutcomeList((AuditEventOutcomeList)value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_LIST:
				return validateBindingStrengthList((BindingStrengthList)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_LIST:
				return validateBundleTypeList((BundleTypeList)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST:
				return validateCapabilityStatementKindList((CapabilityStatementKindList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST:
				return validateCarePlanActivityStatusList((CarePlanActivityStatusList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT_LIST:
				return validateCarePlanIntentList((CarePlanIntentList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS_LIST:
				return validateCarePlanStatusList((CarePlanStatusList)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS_LIST:
				return validateCareTeamStatusList((CareTeamStatusList)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST:
				return validateChargeItemStatusList((ChargeItemStatusList)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST:
				return validateClinicalImpressionStatusList((ClinicalImpressionStatusList)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST:
				return validateCodeSystemContentModeList((CodeSystemContentModeList)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST:
				return validateCodeSystemHierarchyMeaningList((CodeSystemHierarchyMeaningList)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE_LIST:
				return validateCompartmentTypeList((CompartmentTypeList)value, diagnostics, context);
			case FhirPackage.COMPOSITE_MEASURE_SCORING_LIST:
				return validateCompositeMeasureScoringList((CompositeMeasureScoringList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST:
				return validateCompositionAttestationModeList((CompositionAttestationModeList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_LIST:
				return validateCompositionStatusList((CompositionStatusList)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST:
				return validateConceptMapEquivalenceList((ConceptMapEquivalenceList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST:
				return validateConditionalDeleteStatusList((ConditionalDeleteStatusList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST:
				return validateConditionalReadStatusList((ConditionalReadStatusList)value, diagnostics, context);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST:
				return validateConditionVerificationStatusList((ConditionVerificationStatusList)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING_LIST:
				return validateConsentDataMeaningList((ConsentDataMeaningList)value, diagnostics, context);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST:
				return validateConsentExceptTypeList((ConsentExceptTypeList)value, diagnostics, context);
			case FhirPackage.CONSENT_STATUS_LIST:
				return validateConsentStatusList((ConsentStatusList)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST:
				return validateConstraintSeverityList((ConstraintSeverityList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST:
				return validateContactPointSystemList((ContactPointSystemList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_LIST:
				return validateContactPointUseList((ContactPointUseList)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE_LIST:
				return validateContentTypeList((ContentTypeList)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST:
				return validateContributorTypeList((ContributorTypeList)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST:
				return validateDataElementStringencyList((DataElementStringencyList)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_LIST:
				return validateDaysOfWeekList((DaysOfWeekList)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST:
				return validateDetectedIssueSeverityList((DetectedIssueSeverityList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST:
				return validateDeviceMetricCalibrationStateList((DeviceMetricCalibrationStateList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST:
				return validateDeviceMetricCalibrationTypeList((DeviceMetricCalibrationTypeList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST:
				return validateDeviceMetricCategoryList((DeviceMetricCategoryList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST:
				return validateDeviceMetricColorList((DeviceMetricColorList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST:
				return validateDeviceMetricOperationalStatusList((DeviceMetricOperationalStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS_LIST:
				return validateDeviceStatusList((DeviceStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST:
				return validateDiagnosticReportStatusList((DiagnosticReportStatusList)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST:
				return validateDigitalMediaTypeList((DigitalMediaTypeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_LIST:
				return validateDocumentModeList((DocumentModeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST:
				return validateDocumentReferenceStatusList((DocumentReferenceStatusList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST:
				return validateDocumentRelationshipTypeList((DocumentRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST:
				return validateEncounterLocationStatusList((EncounterLocationStatusList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_LIST:
				return validateEncounterStatusList((EncounterStatusList)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS_LIST:
				return validateEndpointStatusList((EndpointStatusList)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST:
				return validateEpisodeOfCareStatusList((EpisodeOfCareStatusList)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST:
				return validateEventCapabilityModeList((EventCapabilityModeList)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST:
				return validateEventTimingList((EventTimingList)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST:
				return validateExplanationOfBenefitStatusList((ExplanationOfBenefitStatusList)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_LIST:
				return validateExtensionContextList((ExtensionContextList)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST:
				return validateFamilyHistoryStatusList((FamilyHistoryStatusList)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_LIST:
				return validateFilterOperatorList((FilterOperatorList)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_LIST:
				return validateFlagStatusList((FlagStatusList)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS_LIST:
				return validateGoalStatusList((GoalStatusList)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_LIST:
				return validateGroupTypeList((GroupTypeList)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST:
				return validateGuidanceResponseStatusList((GuidanceResponseStatusList)value, diagnostics, context);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST:
				return validateGuideDependencyTypeList((GuideDependencyTypeList)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_KIND_LIST:
				return validateGuidePageKindList((GuidePageKindList)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_LIST:
				return validateHTTPVerbList((HTTPVerbList)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_LIST:
				return validateIdentifierUseList((IdentifierUseList)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST:
				return validateIdentityAssuranceLevelList((IdentityAssuranceLevelList)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST:
				return validateInstanceAvailabilityList((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_LIST:
				return validateIssueSeverityList((IssueSeverityList)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE_LIST:
				return validateIssueTypeList((IssueTypeList)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE_LIST:
				return validateLinkageTypeList((LinkageTypeList)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_LIST:
				return validateLinkTypeList((LinkTypeList)value, diagnostics, context);
			case FhirPackage.LIST_MODE_LIST:
				return validateListModeList((ListModeList)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_LIST:
				return validateListStatusList((ListStatusList)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_LIST:
				return validateLocationModeList((LocationModeList)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_LIST:
				return validateLocationStatusList((LocationStatusList)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST:
				return validateMeasmntPrincipleList((MeasmntPrincipleList)value, diagnostics, context);
			case FhirPackage.MEASURE_DATA_USAGE_LIST:
				return validateMeasureDataUsageList((MeasureDataUsageList)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST:
				return validateMeasurePopulationTypeList((MeasurePopulationTypeList)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST:
				return validateMeasureReportStatusList((MeasureReportStatusList)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST:
				return validateMeasureReportTypeList((MeasureReportTypeList)value, diagnostics, context);
			case FhirPackage.MEASURE_SCORING_LIST:
				return validateMeasureScoringList((MeasureScoringList)value, diagnostics, context);
			case FhirPackage.MEASURE_TYPE_LIST:
				return validateMeasureTypeList((MeasureTypeList)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST:
				return validateMedicationAdministrationStatusList((MedicationAdministrationStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST:
				return validateMedicationDispenseStatusList((MedicationDispenseStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST:
				return validateMedicationRequestIntentList((MedicationRequestIntentList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST:
				return validateMedicationRequestPriorityList((MedicationRequestPriorityList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST:
				return validateMedicationRequestStatusList((MedicationRequestStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST:
				return validateMedicationStatementStatusList((MedicationStatementStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST:
				return validateMedicationStatementTakenList((MedicationStatementTakenList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS_LIST:
				return validateMedicationStatusList((MedicationStatusList)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST:
				return validateMessageSignificanceCategoryList((MessageSignificanceCategoryList)value, diagnostics, context);
			case FhirPackage.NAME_USE_LIST:
				return validateNameUseList((NameUseList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST:
				return validateNamingSystemIdentifierTypeList((NamingSystemIdentifierTypeList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST:
				return validateNamingSystemTypeList((NamingSystemTypeList)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_LIST:
				return validateNarrativeStatusList((NarrativeStatusList)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_LIST:
				return validateNoteTypeList((NoteTypeList)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST:
				return validateNutritionOrderStatusList((NutritionOrderStatusList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST:
				return validateObservationRelationshipTypeList((ObservationRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_LIST:
				return validateObservationStatusList((ObservationStatusList)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_LIST:
				return validateOperationKindList((OperationKindList)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST:
				return validateOperationParameterUseList((OperationParameterUseList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST:
				return validateParticipantRequiredList((ParticipantRequiredList)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_LIST:
				return validateParticipationStatusList((ParticipationStatusList)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS_LIST:
				return validateProcedureStatusList((ProcedureStatusList)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST:
				return validatePropertyRepresentationList((PropertyRepresentationList)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE_LIST:
				return validatePropertyTypeList((PropertyTypeList)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST:
				return validateProvenanceEntityRoleList((ProvenanceEntityRoleList)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS_LIST:
				return validatePublicationStatusList((PublicationStatusList)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE_LIST:
				return validateQualityTypeList((QualityTypeList)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_LIST:
				return validateQuantityComparatorList((QuantityComparatorList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST:
				return validateQuestionnaireItemTypeList((QuestionnaireItemTypeList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST:
				return validateQuestionnaireResponseStatusList((QuestionnaireResponseStatusList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST:
				return validateQuestionnaireStatusList((QuestionnaireStatusList)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST:
				return validateReferenceHandlingPolicyList((ReferenceHandlingPolicyList)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST:
				return validateReferenceVersionRulesList((ReferenceVersionRulesList)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST_STATUS_LIST:
				return validateReferralRequestStatusList((ReferralRequestStatusList)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST:
				return validateRelatedArtifactTypeList((RelatedArtifactTypeList)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_LIST:
				return validateRemittanceOutcomeList((RemittanceOutcomeList)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE_LIST:
				return validateRepositoryTypeList((RepositoryTypeList)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST:
				return validateResearchStudyStatusList((ResearchStudyStatusList)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST:
				return validateResearchSubjectStatusList((ResearchSubjectStatusList)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST:
				return validateResourceVersionPolicyList((ResourceVersionPolicyList)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_LIST:
				return validateResponseTypeList((ResponseTypeList)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST:
				return validateRestfulCapabilityModeList((RestfulCapabilityModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR_LIST:
				return validateSearchComparatorList((SearchComparatorList)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST:
				return validateSearchEntryModeList((SearchEntryModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST:
				return validateSearchModifierCodeList((SearchModifierCodeList)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST:
				return validateSearchParamTypeList((SearchParamTypeList)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE_LIST:
				return validateSequenceTypeList((SequenceTypeList)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_LIST:
				return validateSlicingRulesList((SlicingRulesList)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_LIST:
				return validateSlotStatusList((SlotStatusList)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS_LIST:
				return validateSpecimenStatusList((SpecimenStatusList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST:
				return validateStructureDefinitionKindList((StructureDefinitionKindList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST:
				return validateStructureMapContextTypeList((StructureMapContextTypeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST:
				return validateStructureMapGroupTypeModeList((StructureMapGroupTypeModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST:
				return validateStructureMapInputModeList((StructureMapInputModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST:
				return validateStructureMapModelModeList((StructureMapModelModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST:
				return validateStructureMapSourceListModeList((StructureMapSourceListModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST:
				return validateStructureMapTargetListModeList((StructureMapTargetListModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST:
				return validateStructureMapTransformList((StructureMapTransformList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST:
				return validateSubscriptionChannelTypeList((SubscriptionChannelTypeList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST:
				return validateSubscriptionStatusList((SubscriptionStatusList)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_STATUS_LIST:
				return validateSubstanceStatusList((SubstanceStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST:
				return validateSupplyDeliveryStatusList((SupplyDeliveryStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST:
				return validateSupplyRequestStatusList((SupplyRequestStatusList)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST:
				return validateSystemRestfulInteractionList((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST:
				return validateSystemVersionProcessingModeList((SystemVersionProcessingModeList)value, diagnostics, context);
			case FhirPackage.TASK_STATUS_LIST:
				return validateTaskStatusList((TaskStatusList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST:
				return validateTestReportActionResultList((TestReportActionResultList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST:
				return validateTestReportParticipantTypeList((TestReportParticipantTypeList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT_LIST:
				return validateTestReportResultList((TestReportResultList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS_LIST:
				return validateTestReportStatusList((TestReportStatusList)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE_LIST:
				return validateTriggerTypeList((TriggerTypeList)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST:
				return validateTypeDerivationRuleList((TypeDerivationRuleList)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST:
				return validateTypeRestfulInteractionList((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST:
				return validateUnitsOfTimeList((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST:
				return validateUnknownContentCodeList((UnknownContentCodeList)value, diagnostics, context);
			case FhirPackage.USE_LIST:
				return validateUseList((UseList)value, diagnostics, context);
			case FhirPackage.VISION_BASE_LIST:
				return validateVisionBaseList((VisionBaseList)value, diagnostics, context);
			case FhirPackage.VISION_EYES_LIST:
				return validateVisionEyesList((VisionEyesList)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE_LIST:
				return validateXPathUsageTypeList((XPathUsageTypeList)value, diagnostics, context);
			case FhirPackage.ACCOUNT_STATUS_LIST_OBJECT:
				return validateAccountStatusListObject((AccountStatusList)value, diagnostics, context);
			case FhirPackage.ACTION_CARDINALITY_BEHAVIOR_LIST_OBJECT:
				return validateActionCardinalityBehaviorListObject((ActionCardinalityBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_CONDITION_KIND_LIST_OBJECT:
				return validateActionConditionKindListObject((ActionConditionKindList)value, diagnostics, context);
			case FhirPackage.ACTION_GROUPING_BEHAVIOR_LIST_OBJECT:
				return validateActionGroupingBehaviorListObject((ActionGroupingBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_LIST_LIST_OBJECT:
				return validateActionListListObject((ActionListList)value, diagnostics, context);
			case FhirPackage.ACTION_PARTICIPANT_TYPE_LIST_OBJECT:
				return validateActionParticipantTypeListObject((ActionParticipantTypeList)value, diagnostics, context);
			case FhirPackage.ACTION_PRECHECK_BEHAVIOR_LIST_OBJECT:
				return validateActionPrecheckBehaviorListObject((ActionPrecheckBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateActionRelationshipTypeListObject((ActionRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ACTION_REQUIRED_BEHAVIOR_LIST_OBJECT:
				return validateActionRequiredBehaviorListObject((ActionRequiredBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTION_SELECTION_BEHAVIOR_LIST_OBJECT:
				return validateActionSelectionBehaviorListObject((ActionSelectionBehaviorList)value, diagnostics, context);
			case FhirPackage.ACTIVITY_DEFINITION_CATEGORY_LIST_OBJECT:
				return validateActivityDefinitionCategoryListObject((ActivityDefinitionCategoryList)value, diagnostics, context);
			case FhirPackage.ADDRESS_TYPE_LIST_OBJECT:
				return validateAddressTypeListObject((AddressTypeList)value, diagnostics, context);
			case FhirPackage.ADDRESS_USE_LIST_OBJECT:
				return validateAddressUseListObject((AddressUseList)value, diagnostics, context);
			case FhirPackage.ADMINISTRATIVE_GENDER_LIST_OBJECT:
				return validateAdministrativeGenderListObject((AdministrativeGenderList)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CATEGORY_LIST_OBJECT:
				return validateAdverseEventCategoryListObject((AdverseEventCategoryList)value, diagnostics, context);
			case FhirPackage.ADVERSE_EVENT_CAUSALITY_LIST_OBJECT:
				return validateAdverseEventCausalityListObject((AdverseEventCausalityList)value, diagnostics, context);
			case FhirPackage.AGGREGATION_MODE_LIST_OBJECT:
				return validateAggregationModeListObject((AggregationModeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CLINICAL_STATUS_LIST_OBJECT:
				return validateAllergyIntoleranceClinicalStatusListObject((AllergyIntoleranceClinicalStatusList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_CRITICALITY_LIST_OBJECT:
				return validateAllergyIntoleranceCriticalityListObject((AllergyIntoleranceCriticalityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_SEVERITY_LIST_OBJECT:
				return validateAllergyIntoleranceSeverityListObject((AllergyIntoleranceSeverityList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_TYPE_LIST_OBJECT:
				return validateAllergyIntoleranceTypeListObject((AllergyIntoleranceTypeList)value, diagnostics, context);
			case FhirPackage.ALLERGY_INTOLERANCE_VERIFICATION_STATUS_LIST_OBJECT:
				return validateAllergyIntoleranceVerificationStatusListObject((AllergyIntoleranceVerificationStatusList)value, diagnostics, context);
			case FhirPackage.APPOINTMENT_STATUS_LIST_OBJECT:
				return validateAppointmentStatusListObject((AppointmentStatusList)value, diagnostics, context);
			case FhirPackage.ASSERTION_DIRECTION_TYPE_LIST_OBJECT:
				return validateAssertionDirectionTypeListObject((AssertionDirectionTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_OPERATOR_TYPE_LIST_OBJECT:
				return validateAssertionOperatorTypeListObject((AssertionOperatorTypeList)value, diagnostics, context);
			case FhirPackage.ASSERTION_RESPONSE_TYPES_LIST_OBJECT:
				return validateAssertionResponseTypesListObject((AssertionResponseTypesList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_ACTION_LIST_OBJECT:
				return validateAuditEventActionListObject((AuditEventActionList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_AGENT_NETWORK_TYPE_LIST_OBJECT:
				return validateAuditEventAgentNetworkTypeListObject((AuditEventAgentNetworkTypeList)value, diagnostics, context);
			case FhirPackage.AUDIT_EVENT_OUTCOME_LIST_OBJECT:
				return validateAuditEventOutcomeListObject((AuditEventOutcomeList)value, diagnostics, context);
			case FhirPackage.BASE64_BINARY_PRIMITIVE:
				return validateBase64BinaryPrimitive((byte[])value, diagnostics, context);
			case FhirPackage.BINDING_STRENGTH_LIST_OBJECT:
				return validateBindingStrengthListObject((BindingStrengthList)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE:
				return validateBooleanPrimitive((Boolean)value, diagnostics, context);
			case FhirPackage.BOOLEAN_PRIMITIVE_OBJECT:
				return validateBooleanPrimitiveObject((Boolean)value, diagnostics, context);
			case FhirPackage.BUNDLE_TYPE_LIST_OBJECT:
				return validateBundleTypeListObject((BundleTypeList)value, diagnostics, context);
			case FhirPackage.CAPABILITY_STATEMENT_KIND_LIST_OBJECT:
				return validateCapabilityStatementKindListObject((CapabilityStatementKindList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_ACTIVITY_STATUS_LIST_OBJECT:
				return validateCarePlanActivityStatusListObject((CarePlanActivityStatusList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_INTENT_LIST_OBJECT:
				return validateCarePlanIntentListObject((CarePlanIntentList)value, diagnostics, context);
			case FhirPackage.CARE_PLAN_STATUS_LIST_OBJECT:
				return validateCarePlanStatusListObject((CarePlanStatusList)value, diagnostics, context);
			case FhirPackage.CARE_TEAM_STATUS_LIST_OBJECT:
				return validateCareTeamStatusListObject((CareTeamStatusList)value, diagnostics, context);
			case FhirPackage.CHARGE_ITEM_STATUS_LIST_OBJECT:
				return validateChargeItemStatusListObject((ChargeItemStatusList)value, diagnostics, context);
			case FhirPackage.CLINICAL_IMPRESSION_STATUS_LIST_OBJECT:
				return validateClinicalImpressionStatusListObject((ClinicalImpressionStatusList)value, diagnostics, context);
			case FhirPackage.CODE_PRIMITIVE:
				return validateCodePrimitive((String)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_CONTENT_MODE_LIST_OBJECT:
				return validateCodeSystemContentModeListObject((CodeSystemContentModeList)value, diagnostics, context);
			case FhirPackage.CODE_SYSTEM_HIERARCHY_MEANING_LIST_OBJECT:
				return validateCodeSystemHierarchyMeaningListObject((CodeSystemHierarchyMeaningList)value, diagnostics, context);
			case FhirPackage.COMPARTMENT_TYPE_LIST_OBJECT:
				return validateCompartmentTypeListObject((CompartmentTypeList)value, diagnostics, context);
			case FhirPackage.COMPOSITE_MEASURE_SCORING_LIST_OBJECT:
				return validateCompositeMeasureScoringListObject((CompositeMeasureScoringList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_ATTESTATION_MODE_LIST_OBJECT:
				return validateCompositionAttestationModeListObject((CompositionAttestationModeList)value, diagnostics, context);
			case FhirPackage.COMPOSITION_STATUS_LIST_OBJECT:
				return validateCompositionStatusListObject((CompositionStatusList)value, diagnostics, context);
			case FhirPackage.CONCEPT_MAP_EQUIVALENCE_LIST_OBJECT:
				return validateConceptMapEquivalenceListObject((ConceptMapEquivalenceList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_DELETE_STATUS_LIST_OBJECT:
				return validateConditionalDeleteStatusListObject((ConditionalDeleteStatusList)value, diagnostics, context);
			case FhirPackage.CONDITIONAL_READ_STATUS_LIST_OBJECT:
				return validateConditionalReadStatusListObject((ConditionalReadStatusList)value, diagnostics, context);
			case FhirPackage.CONDITION_VERIFICATION_STATUS_LIST_OBJECT:
				return validateConditionVerificationStatusListObject((ConditionVerificationStatusList)value, diagnostics, context);
			case FhirPackage.CONSENT_DATA_MEANING_LIST_OBJECT:
				return validateConsentDataMeaningListObject((ConsentDataMeaningList)value, diagnostics, context);
			case FhirPackage.CONSENT_EXCEPT_TYPE_LIST_OBJECT:
				return validateConsentExceptTypeListObject((ConsentExceptTypeList)value, diagnostics, context);
			case FhirPackage.CONSENT_STATUS_LIST_OBJECT:
				return validateConsentStatusListObject((ConsentStatusList)value, diagnostics, context);
			case FhirPackage.CONSTRAINT_SEVERITY_LIST_OBJECT:
				return validateConstraintSeverityListObject((ConstraintSeverityList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_SYSTEM_LIST_OBJECT:
				return validateContactPointSystemListObject((ContactPointSystemList)value, diagnostics, context);
			case FhirPackage.CONTACT_POINT_USE_LIST_OBJECT:
				return validateContactPointUseListObject((ContactPointUseList)value, diagnostics, context);
			case FhirPackage.CONTENT_TYPE_LIST_OBJECT:
				return validateContentTypeListObject((ContentTypeList)value, diagnostics, context);
			case FhirPackage.CONTRIBUTOR_TYPE_LIST_OBJECT:
				return validateContributorTypeListObject((ContributorTypeList)value, diagnostics, context);
			case FhirPackage.DATA_ELEMENT_STRINGENCY_LIST_OBJECT:
				return validateDataElementStringencyListObject((DataElementStringencyList)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE:
				return validateDatePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_PRIMITIVE_BASE:
				return validateDatePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE:
				return validateDateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DATE_TIME_PRIMITIVE_BASE:
				return validateDateTimePrimitiveBase((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.DAYS_OF_WEEK_LIST_OBJECT:
				return validateDaysOfWeekListObject((DaysOfWeekList)value, diagnostics, context);
			case FhirPackage.DECIMAL_PRIMITIVE:
				return validateDecimalPrimitive((BigDecimal)value, diagnostics, context);
			case FhirPackage.DETECTED_ISSUE_SEVERITY_LIST_OBJECT:
				return validateDetectedIssueSeverityListObject((DetectedIssueSeverityList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_STATE_LIST_OBJECT:
				return validateDeviceMetricCalibrationStateListObject((DeviceMetricCalibrationStateList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CALIBRATION_TYPE_LIST_OBJECT:
				return validateDeviceMetricCalibrationTypeListObject((DeviceMetricCalibrationTypeList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_CATEGORY_LIST_OBJECT:
				return validateDeviceMetricCategoryListObject((DeviceMetricCategoryList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_COLOR_LIST_OBJECT:
				return validateDeviceMetricColorListObject((DeviceMetricColorList)value, diagnostics, context);
			case FhirPackage.DEVICE_METRIC_OPERATIONAL_STATUS_LIST_OBJECT:
				return validateDeviceMetricOperationalStatusListObject((DeviceMetricOperationalStatusList)value, diagnostics, context);
			case FhirPackage.DEVICE_STATUS_LIST_OBJECT:
				return validateDeviceStatusListObject((DeviceStatusList)value, diagnostics, context);
			case FhirPackage.DIAGNOSTIC_REPORT_STATUS_LIST_OBJECT:
				return validateDiagnosticReportStatusListObject((DiagnosticReportStatusList)value, diagnostics, context);
			case FhirPackage.DIGITAL_MEDIA_TYPE_LIST_OBJECT:
				return validateDigitalMediaTypeListObject((DigitalMediaTypeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_MODE_LIST_OBJECT:
				return validateDocumentModeListObject((DocumentModeList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_REFERENCE_STATUS_LIST_OBJECT:
				return validateDocumentReferenceStatusListObject((DocumentReferenceStatusList)value, diagnostics, context);
			case FhirPackage.DOCUMENT_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateDocumentRelationshipTypeListObject((DocumentRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_LOCATION_STATUS_LIST_OBJECT:
				return validateEncounterLocationStatusListObject((EncounterLocationStatusList)value, diagnostics, context);
			case FhirPackage.ENCOUNTER_STATUS_LIST_OBJECT:
				return validateEncounterStatusListObject((EncounterStatusList)value, diagnostics, context);
			case FhirPackage.ENDPOINT_STATUS_LIST_OBJECT:
				return validateEndpointStatusListObject((EndpointStatusList)value, diagnostics, context);
			case FhirPackage.EPISODE_OF_CARE_STATUS_LIST_OBJECT:
				return validateEpisodeOfCareStatusListObject((EpisodeOfCareStatusList)value, diagnostics, context);
			case FhirPackage.EVENT_CAPABILITY_MODE_LIST_OBJECT:
				return validateEventCapabilityModeListObject((EventCapabilityModeList)value, diagnostics, context);
			case FhirPackage.EVENT_TIMING_LIST_OBJECT:
				return validateEventTimingListObject((EventTimingList)value, diagnostics, context);
			case FhirPackage.EXPLANATION_OF_BENEFIT_STATUS_LIST_OBJECT:
				return validateExplanationOfBenefitStatusListObject((ExplanationOfBenefitStatusList)value, diagnostics, context);
			case FhirPackage.EXTENSION_CONTEXT_LIST_OBJECT:
				return validateExtensionContextListObject((ExtensionContextList)value, diagnostics, context);
			case FhirPackage.FAMILY_HISTORY_STATUS_LIST_OBJECT:
				return validateFamilyHistoryStatusListObject((FamilyHistoryStatusList)value, diagnostics, context);
			case FhirPackage.FILTER_OPERATOR_LIST_OBJECT:
				return validateFilterOperatorListObject((FilterOperatorList)value, diagnostics, context);
			case FhirPackage.FLAG_STATUS_LIST_OBJECT:
				return validateFlagStatusListObject((FlagStatusList)value, diagnostics, context);
			case FhirPackage.GOAL_STATUS_LIST_OBJECT:
				return validateGoalStatusListObject((GoalStatusList)value, diagnostics, context);
			case FhirPackage.GROUP_TYPE_LIST_OBJECT:
				return validateGroupTypeListObject((GroupTypeList)value, diagnostics, context);
			case FhirPackage.GUIDANCE_RESPONSE_STATUS_LIST_OBJECT:
				return validateGuidanceResponseStatusListObject((GuidanceResponseStatusList)value, diagnostics, context);
			case FhirPackage.GUIDE_DEPENDENCY_TYPE_LIST_OBJECT:
				return validateGuideDependencyTypeListObject((GuideDependencyTypeList)value, diagnostics, context);
			case FhirPackage.GUIDE_PAGE_KIND_LIST_OBJECT:
				return validateGuidePageKindListObject((GuidePageKindList)value, diagnostics, context);
			case FhirPackage.HTTP_VERB_LIST_OBJECT:
				return validateHTTPVerbListObject((HTTPVerbList)value, diagnostics, context);
			case FhirPackage.IDENTIFIER_USE_LIST_OBJECT:
				return validateIdentifierUseListObject((IdentifierUseList)value, diagnostics, context);
			case FhirPackage.IDENTITY_ASSURANCE_LEVEL_LIST_OBJECT:
				return validateIdentityAssuranceLevelListObject((IdentityAssuranceLevelList)value, diagnostics, context);
			case FhirPackage.ID_PRIMITIVE:
				return validateIdPrimitive((String)value, diagnostics, context);
			case FhirPackage.INSTANCE_AVAILABILITY_LIST_OBJECT:
				return validateInstanceAvailabilityListObject((InstanceAvailabilityList)value, diagnostics, context);
			case FhirPackage.INSTANT_PRIMITIVE:
				return validateInstantPrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE:
				return validateIntegerPrimitive((Integer)value, diagnostics, context);
			case FhirPackage.INTEGER_PRIMITIVE_OBJECT:
				return validateIntegerPrimitiveObject((Integer)value, diagnostics, context);
			case FhirPackage.ISSUE_SEVERITY_LIST_OBJECT:
				return validateIssueSeverityListObject((IssueSeverityList)value, diagnostics, context);
			case FhirPackage.ISSUE_TYPE_LIST_OBJECT:
				return validateIssueTypeListObject((IssueTypeList)value, diagnostics, context);
			case FhirPackage.LINKAGE_TYPE_LIST_OBJECT:
				return validateLinkageTypeListObject((LinkageTypeList)value, diagnostics, context);
			case FhirPackage.LINK_TYPE_LIST_OBJECT:
				return validateLinkTypeListObject((LinkTypeList)value, diagnostics, context);
			case FhirPackage.LIST_MODE_LIST_OBJECT:
				return validateListModeListObject((ListModeList)value, diagnostics, context);
			case FhirPackage.LIST_STATUS_LIST_OBJECT:
				return validateListStatusListObject((ListStatusList)value, diagnostics, context);
			case FhirPackage.LOCATION_MODE_LIST_OBJECT:
				return validateLocationModeListObject((LocationModeList)value, diagnostics, context);
			case FhirPackage.LOCATION_STATUS_LIST_OBJECT:
				return validateLocationStatusListObject((LocationStatusList)value, diagnostics, context);
			case FhirPackage.MARKDOWN_PRIMITIVE:
				return validateMarkdownPrimitive((String)value, diagnostics, context);
			case FhirPackage.MEASMNT_PRINCIPLE_LIST_OBJECT:
				return validateMeasmntPrincipleListObject((MeasmntPrincipleList)value, diagnostics, context);
			case FhirPackage.MEASURE_DATA_USAGE_LIST_OBJECT:
				return validateMeasureDataUsageListObject((MeasureDataUsageList)value, diagnostics, context);
			case FhirPackage.MEASURE_POPULATION_TYPE_LIST_OBJECT:
				return validateMeasurePopulationTypeListObject((MeasurePopulationTypeList)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_STATUS_LIST_OBJECT:
				return validateMeasureReportStatusListObject((MeasureReportStatusList)value, diagnostics, context);
			case FhirPackage.MEASURE_REPORT_TYPE_LIST_OBJECT:
				return validateMeasureReportTypeListObject((MeasureReportTypeList)value, diagnostics, context);
			case FhirPackage.MEASURE_SCORING_LIST_OBJECT:
				return validateMeasureScoringListObject((MeasureScoringList)value, diagnostics, context);
			case FhirPackage.MEASURE_TYPE_LIST_OBJECT:
				return validateMeasureTypeListObject((MeasureTypeList)value, diagnostics, context);
			case FhirPackage.MEDICATION_ADMINISTRATION_STATUS_LIST_OBJECT:
				return validateMedicationAdministrationStatusListObject((MedicationAdministrationStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_DISPENSE_STATUS_LIST_OBJECT:
				return validateMedicationDispenseStatusListObject((MedicationDispenseStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_INTENT_LIST_OBJECT:
				return validateMedicationRequestIntentListObject((MedicationRequestIntentList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_PRIORITY_LIST_OBJECT:
				return validateMedicationRequestPriorityListObject((MedicationRequestPriorityList)value, diagnostics, context);
			case FhirPackage.MEDICATION_REQUEST_STATUS_LIST_OBJECT:
				return validateMedicationRequestStatusListObject((MedicationRequestStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_STATUS_LIST_OBJECT:
				return validateMedicationStatementStatusListObject((MedicationStatementStatusList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATEMENT_TAKEN_LIST_OBJECT:
				return validateMedicationStatementTakenListObject((MedicationStatementTakenList)value, diagnostics, context);
			case FhirPackage.MEDICATION_STATUS_LIST_OBJECT:
				return validateMedicationStatusListObject((MedicationStatusList)value, diagnostics, context);
			case FhirPackage.MESSAGE_SIGNIFICANCE_CATEGORY_LIST_OBJECT:
				return validateMessageSignificanceCategoryListObject((MessageSignificanceCategoryList)value, diagnostics, context);
			case FhirPackage.NAME_USE_LIST_OBJECT:
				return validateNameUseListObject((NameUseList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_IDENTIFIER_TYPE_LIST_OBJECT:
				return validateNamingSystemIdentifierTypeListObject((NamingSystemIdentifierTypeList)value, diagnostics, context);
			case FhirPackage.NAMING_SYSTEM_TYPE_LIST_OBJECT:
				return validateNamingSystemTypeListObject((NamingSystemTypeList)value, diagnostics, context);
			case FhirPackage.NARRATIVE_STATUS_LIST_OBJECT:
				return validateNarrativeStatusListObject((NarrativeStatusList)value, diagnostics, context);
			case FhirPackage.NOTE_TYPE_LIST_OBJECT:
				return validateNoteTypeListObject((NoteTypeList)value, diagnostics, context);
			case FhirPackage.NUTRITION_ORDER_STATUS_LIST_OBJECT:
				return validateNutritionOrderStatusListObject((NutritionOrderStatusList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_RELATIONSHIP_TYPE_LIST_OBJECT:
				return validateObservationRelationshipTypeListObject((ObservationRelationshipTypeList)value, diagnostics, context);
			case FhirPackage.OBSERVATION_STATUS_LIST_OBJECT:
				return validateObservationStatusListObject((ObservationStatusList)value, diagnostics, context);
			case FhirPackage.OID_PRIMITIVE:
				return validateOidPrimitive((String)value, diagnostics, context);
			case FhirPackage.OPERATION_KIND_LIST_OBJECT:
				return validateOperationKindListObject((OperationKindList)value, diagnostics, context);
			case FhirPackage.OPERATION_PARAMETER_USE_LIST_OBJECT:
				return validateOperationParameterUseListObject((OperationParameterUseList)value, diagnostics, context);
			case FhirPackage.PARTICIPANT_REQUIRED_LIST_OBJECT:
				return validateParticipantRequiredListObject((ParticipantRequiredList)value, diagnostics, context);
			case FhirPackage.PARTICIPATION_STATUS_LIST_OBJECT:
				return validateParticipationStatusListObject((ParticipationStatusList)value, diagnostics, context);
			case FhirPackage.POSITIVE_INT_PRIMITIVE:
				return validatePositiveIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.PROCEDURE_STATUS_LIST_OBJECT:
				return validateProcedureStatusListObject((ProcedureStatusList)value, diagnostics, context);
			case FhirPackage.PROPERTY_REPRESENTATION_LIST_OBJECT:
				return validatePropertyRepresentationListObject((PropertyRepresentationList)value, diagnostics, context);
			case FhirPackage.PROPERTY_TYPE_LIST_OBJECT:
				return validatePropertyTypeListObject((PropertyTypeList)value, diagnostics, context);
			case FhirPackage.PROVENANCE_ENTITY_ROLE_LIST_OBJECT:
				return validateProvenanceEntityRoleListObject((ProvenanceEntityRoleList)value, diagnostics, context);
			case FhirPackage.PUBLICATION_STATUS_LIST_OBJECT:
				return validatePublicationStatusListObject((PublicationStatusList)value, diagnostics, context);
			case FhirPackage.QUALITY_TYPE_LIST_OBJECT:
				return validateQualityTypeListObject((QualityTypeList)value, diagnostics, context);
			case FhirPackage.QUANTITY_COMPARATOR_LIST_OBJECT:
				return validateQuantityComparatorListObject((QuantityComparatorList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_ITEM_TYPE_LIST_OBJECT:
				return validateQuestionnaireItemTypeListObject((QuestionnaireItemTypeList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_RESPONSE_STATUS_LIST_OBJECT:
				return validateQuestionnaireResponseStatusListObject((QuestionnaireResponseStatusList)value, diagnostics, context);
			case FhirPackage.QUESTIONNAIRE_STATUS_LIST_OBJECT:
				return validateQuestionnaireStatusListObject((QuestionnaireStatusList)value, diagnostics, context);
			case FhirPackage.REFERENCE_HANDLING_POLICY_LIST_OBJECT:
				return validateReferenceHandlingPolicyListObject((ReferenceHandlingPolicyList)value, diagnostics, context);
			case FhirPackage.REFERENCE_VERSION_RULES_LIST_OBJECT:
				return validateReferenceVersionRulesListObject((ReferenceVersionRulesList)value, diagnostics, context);
			case FhirPackage.REFERRAL_REQUEST_STATUS_LIST_OBJECT:
				return validateReferralRequestStatusListObject((ReferralRequestStatusList)value, diagnostics, context);
			case FhirPackage.RELATED_ARTIFACT_TYPE_LIST_OBJECT:
				return validateRelatedArtifactTypeListObject((RelatedArtifactTypeList)value, diagnostics, context);
			case FhirPackage.REMITTANCE_OUTCOME_LIST_OBJECT:
				return validateRemittanceOutcomeListObject((RemittanceOutcomeList)value, diagnostics, context);
			case FhirPackage.REPOSITORY_TYPE_LIST_OBJECT:
				return validateRepositoryTypeListObject((RepositoryTypeList)value, diagnostics, context);
			case FhirPackage.RESEARCH_STUDY_STATUS_LIST_OBJECT:
				return validateResearchStudyStatusListObject((ResearchStudyStatusList)value, diagnostics, context);
			case FhirPackage.RESEARCH_SUBJECT_STATUS_LIST_OBJECT:
				return validateResearchSubjectStatusListObject((ResearchSubjectStatusList)value, diagnostics, context);
			case FhirPackage.RESOURCE_VERSION_POLICY_LIST_OBJECT:
				return validateResourceVersionPolicyListObject((ResourceVersionPolicyList)value, diagnostics, context);
			case FhirPackage.RESPONSE_TYPE_LIST_OBJECT:
				return validateResponseTypeListObject((ResponseTypeList)value, diagnostics, context);
			case FhirPackage.RESTFUL_CAPABILITY_MODE_LIST_OBJECT:
				return validateRestfulCapabilityModeListObject((RestfulCapabilityModeList)value, diagnostics, context);
			case FhirPackage.SAMPLED_DATA_DATA_TYPE_PRIMITIVE:
				return validateSampledDataDataTypePrimitive((String)value, diagnostics, context);
			case FhirPackage.SEARCH_COMPARATOR_LIST_OBJECT:
				return validateSearchComparatorListObject((SearchComparatorList)value, diagnostics, context);
			case FhirPackage.SEARCH_ENTRY_MODE_LIST_OBJECT:
				return validateSearchEntryModeListObject((SearchEntryModeList)value, diagnostics, context);
			case FhirPackage.SEARCH_MODIFIER_CODE_LIST_OBJECT:
				return validateSearchModifierCodeListObject((SearchModifierCodeList)value, diagnostics, context);
			case FhirPackage.SEARCH_PARAM_TYPE_LIST_OBJECT:
				return validateSearchParamTypeListObject((SearchParamTypeList)value, diagnostics, context);
			case FhirPackage.SEQUENCE_TYPE_LIST_OBJECT:
				return validateSequenceTypeListObject((SequenceTypeList)value, diagnostics, context);
			case FhirPackage.SLICING_RULES_LIST_OBJECT:
				return validateSlicingRulesListObject((SlicingRulesList)value, diagnostics, context);
			case FhirPackage.SLOT_STATUS_LIST_OBJECT:
				return validateSlotStatusListObject((SlotStatusList)value, diagnostics, context);
			case FhirPackage.SPECIMEN_STATUS_LIST_OBJECT:
				return validateSpecimenStatusListObject((SpecimenStatusList)value, diagnostics, context);
			case FhirPackage.STRING_PRIMITIVE:
				return validateStringPrimitive((String)value, diagnostics, context);
			case FhirPackage.STRUCTURE_DEFINITION_KIND_LIST_OBJECT:
				return validateStructureDefinitionKindListObject((StructureDefinitionKindList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_CONTEXT_TYPE_LIST_OBJECT:
				return validateStructureMapContextTypeListObject((StructureMapContextTypeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_GROUP_TYPE_MODE_LIST_OBJECT:
				return validateStructureMapGroupTypeModeListObject((StructureMapGroupTypeModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_INPUT_MODE_LIST_OBJECT:
				return validateStructureMapInputModeListObject((StructureMapInputModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_MODEL_MODE_LIST_OBJECT:
				return validateStructureMapModelModeListObject((StructureMapModelModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_SOURCE_LIST_MODE_LIST_OBJECT:
				return validateStructureMapSourceListModeListObject((StructureMapSourceListModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TARGET_LIST_MODE_LIST_OBJECT:
				return validateStructureMapTargetListModeListObject((StructureMapTargetListModeList)value, diagnostics, context);
			case FhirPackage.STRUCTURE_MAP_TRANSFORM_LIST_OBJECT:
				return validateStructureMapTransformListObject((StructureMapTransformList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_CHANNEL_TYPE_LIST_OBJECT:
				return validateSubscriptionChannelTypeListObject((SubscriptionChannelTypeList)value, diagnostics, context);
			case FhirPackage.SUBSCRIPTION_STATUS_LIST_OBJECT:
				return validateSubscriptionStatusListObject((SubscriptionStatusList)value, diagnostics, context);
			case FhirPackage.SUBSTANCE_STATUS_LIST_OBJECT:
				return validateSubstanceStatusListObject((SubstanceStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_DELIVERY_STATUS_LIST_OBJECT:
				return validateSupplyDeliveryStatusListObject((SupplyDeliveryStatusList)value, diagnostics, context);
			case FhirPackage.SUPPLY_REQUEST_STATUS_LIST_OBJECT:
				return validateSupplyRequestStatusListObject((SupplyRequestStatusList)value, diagnostics, context);
			case FhirPackage.SYSTEM_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateSystemRestfulInteractionListObject((SystemRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.SYSTEM_VERSION_PROCESSING_MODE_LIST_OBJECT:
				return validateSystemVersionProcessingModeListObject((SystemVersionProcessingModeList)value, diagnostics, context);
			case FhirPackage.TASK_STATUS_LIST_OBJECT:
				return validateTaskStatusListObject((TaskStatusList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_ACTION_RESULT_LIST_OBJECT:
				return validateTestReportActionResultListObject((TestReportActionResultList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_PARTICIPANT_TYPE_LIST_OBJECT:
				return validateTestReportParticipantTypeListObject((TestReportParticipantTypeList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_RESULT_LIST_OBJECT:
				return validateTestReportResultListObject((TestReportResultList)value, diagnostics, context);
			case FhirPackage.TEST_REPORT_STATUS_LIST_OBJECT:
				return validateTestReportStatusListObject((TestReportStatusList)value, diagnostics, context);
			case FhirPackage.TIME_PRIMITIVE:
				return validateTimePrimitive((XMLGregorianCalendar)value, diagnostics, context);
			case FhirPackage.TRIGGER_TYPE_LIST_OBJECT:
				return validateTriggerTypeListObject((TriggerTypeList)value, diagnostics, context);
			case FhirPackage.TYPE_DERIVATION_RULE_LIST_OBJECT:
				return validateTypeDerivationRuleListObject((TypeDerivationRuleList)value, diagnostics, context);
			case FhirPackage.TYPE_RESTFUL_INTERACTION_LIST_OBJECT:
				return validateTypeRestfulInteractionListObject((TypeRestfulInteractionList)value, diagnostics, context);
			case FhirPackage.UNITS_OF_TIME_LIST_OBJECT:
				return validateUnitsOfTimeListObject((UnitsOfTimeList)value, diagnostics, context);
			case FhirPackage.UNKNOWN_CONTENT_CODE_LIST_OBJECT:
				return validateUnknownContentCodeListObject((UnknownContentCodeList)value, diagnostics, context);
			case FhirPackage.UNSIGNED_INT_PRIMITIVE:
				return validateUnsignedIntPrimitive((BigInteger)value, diagnostics, context);
			case FhirPackage.URI_PRIMITIVE:
				return validateUriPrimitive((String)value, diagnostics, context);
			case FhirPackage.USE_LIST_OBJECT:
				return validateUseListObject((UseList)value, diagnostics, context);
			case FhirPackage.UUID_PRIMITIVE:
				return validateUuidPrimitive((String)value, diagnostics, context);
			case FhirPackage.VISION_BASE_LIST_OBJECT:
				return validateVisionBaseListObject((VisionBaseList)value, diagnostics, context);
			case FhirPackage.VISION_EYES_LIST_OBJECT:
				return validateVisionEyesListObject((VisionEyesList)value, diagnostics, context);
			case FhirPackage.XPATH_USAGE_TYPE_LIST_OBJECT:
				return validateXPathUsageTypeListObject((XPathUsageTypeList)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccount(Account account, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(account, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountGuarantor(AccountGuarantor accountGuarantor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountGuarantor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatus(AccountStatus accountStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accountStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehavior(ActionCardinalityBehavior actionCardinalityBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionCardinalityBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKind(ActionConditionKind actionConditionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionConditionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehavior(ActionGroupingBehavior actionGroupingBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionGroupingBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionList(ActionList actionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantType(ActionParticipantType actionParticipantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionParticipantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehavior(ActionPrecheckBehavior actionPrecheckBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionPrecheckBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipType(ActionRelationshipType actionRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehavior(ActionRequiredBehavior actionRequiredBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionRequiredBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehavior(ActionSelectionBehavior actionSelectionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionSelectionBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinition(ActivityDefinition activityDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionCategory(ActivityDefinitionCategory activityDefinitionCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinitionCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionDynamicValue(ActivityDefinitionDynamicValue activityDefinitionDynamicValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityDefinitionDynamicValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUse(AddressUse addressUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGender(AdministrativeGender administrativeGender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(administrativeGender, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEvent(AdverseEvent adverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCategory(AdverseEventCategory adverseEventCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCausality(AdverseEventCausality adverseEventCausality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventCausality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventSuspectEntity(AdverseEventSuspectEntity adverseEventSuspectEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adverseEventSuspectEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAge(Age age, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(age, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationMode(AggregationMode aggregationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntolerance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceClinicalStatus(AllergyIntoleranceClinicalStatus allergyIntoleranceClinicalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceClinicalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticality(AllergyIntoleranceCriticality allergyIntoleranceCriticality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceCriticality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceReaction(AllergyIntoleranceReaction allergyIntoleranceReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverity(AllergyIntoleranceSeverity allergyIntoleranceSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceType(AllergyIntoleranceType allergyIntoleranceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceVerificationStatus(AllergyIntoleranceVerificationStatus allergyIntoleranceVerificationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allergyIntoleranceVerificationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentParticipant(AppointmentParticipant appointmentParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentResponse(AppointmentResponse appointmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatus(AppointmentStatus appointmentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointmentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionType(AssertionDirectionType assertionDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorType(AssertionOperatorType assertionOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypes(AssertionResponseTypes assertionResponseTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertionResponseTypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachment(Attachment attachment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEvent(AuditEvent auditEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAction(AuditEventAction auditEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgent(AuditEventAgent auditEventAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkType(AuditEventAgentNetworkType auditEventAgentNetworkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventAgentNetworkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventDetail(AuditEventDetail auditEventDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventEntity(AuditEventEntity auditEventEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventNetwork(AuditEventNetwork auditEventNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventNetwork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcome(AuditEventOutcome auditEventOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventSource(AuditEventSource auditEventSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditEventSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackboneElement(BackboneElement backboneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backboneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasic(Basic basic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinary(Binary binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrength(BindingStrength bindingStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingStrength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySite(BodySite bodySite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodySite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.hl7.fhir.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleEntry(BundleEntry bundleEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleLink(BundleLink bundleLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleRequest(BundleRequest bundleRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleResponse(BundleResponse bundleResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleSearch(BundleSearch bundleSearch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleSearch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleType(BundleType bundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatement(CapabilityStatement capabilityStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementCertificate(CapabilityStatementCertificate capabilityStatementCertificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementCertificate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementDocument(CapabilityStatementDocument capabilityStatementDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementEndpoint(CapabilityStatementEndpoint capabilityStatementEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementEndpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementEvent(CapabilityStatementEvent capabilityStatementEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementImplementation(CapabilityStatementImplementation capabilityStatementImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementInteraction(CapabilityStatementInteraction capabilityStatementInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementInteraction1(CapabilityStatementInteraction1 capabilityStatementInteraction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementInteraction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKind(CapabilityStatementKind capabilityStatementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementMessaging(CapabilityStatementMessaging capabilityStatementMessaging, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementMessaging, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementOperation(CapabilityStatementOperation capabilityStatementOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementResource(CapabilityStatementResource capabilityStatementResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementRest(CapabilityStatementRest capabilityStatementRest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementRest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSearchParam(CapabilityStatementSearchParam capabilityStatementSearchParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSearchParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSecurity(CapabilityStatementSecurity capabilityStatementSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSecurity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementSoftware(CapabilityStatementSoftware capabilityStatementSoftware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityStatementSoftware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlan(CarePlan carePlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivity(CarePlanActivity carePlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatus(CarePlanActivityStatus carePlanActivityStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanActivityStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanDetail(CarePlanDetail carePlanDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntent(CarePlanIntent carePlanIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatus(CarePlanStatus carePlanStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(carePlanStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeam(CareTeam careTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamParticipant(CareTeamParticipant careTeamParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeamParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatus(CareTeamStatus careTeamStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(careTeamStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogDocument(CatalogDocument catalogDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogEntry(CatalogEntry catalogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogRelatedItem(CatalogRelatedItem catalogRelatedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogRelatedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItem(ChargeItem chargeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemParticipant(ChargeItemParticipant chargeItemParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatus(ChargeItemStatus chargeItemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chargeItemStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaim(Claim claim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimAccident(ClaimAccident claimAccident, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimAccident, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimCareTeam(ClaimCareTeam claimCareTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimCareTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDetail(ClaimDetail claimDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimDiagnosis(ClaimDiagnosis claimDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimInformation(ClaimInformation claimInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimInsurance(ClaimInsurance claimInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimItem(ClaimItem claimItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimPayee(ClaimPayee claimPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimProcedure(ClaimProcedure claimProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimRelated(ClaimRelated claimRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponse(ClaimResponse claimResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAddItem(ClaimResponseAddItem claimResponseAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseAdjudication(ClaimResponseAdjudication claimResponseAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail(ClaimResponseDetail claimResponseDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseDetail1(ClaimResponseDetail1 claimResponseDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseError(ClaimResponseError claimResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseInsurance(ClaimResponseInsurance claimResponseInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseItem(ClaimResponseItem claimResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponsePayment(ClaimResponsePayment claimResponsePayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponsePayment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseProcessNote(ClaimResponseProcessNote claimResponseProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimResponseSubDetail(ClaimResponseSubDetail claimResponseSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimResponseSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSubDetail(ClaimSubDetail claimSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpression(ClinicalImpression clinicalImpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionFinding(ClinicalImpressionFinding clinicalImpressionFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionFinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionInvestigation(ClinicalImpressionInvestigation clinicalImpressionInvestigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionInvestigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatus(ClinicalImpressionStatus clinicalImpressionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalImpressionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeableConcept(CodeableConcept codeableConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeableConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystem(CodeSystem codeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemConcept(CodeSystemConcept codeSystemConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentMode(CodeSystemContentMode codeSystemContentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemContentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemDesignation(CodeSystemDesignation codeSystemDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemFilter(CodeSystemFilter codeSystemFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaning(CodeSystemHierarchyMeaning codeSystemHierarchyMeaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemHierarchyMeaning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty(CodeSystemProperty codeSystemProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemProperty1(CodeSystemProperty1 codeSystemProperty1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemProperty1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoding(Coding coding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPayload(CommunicationPayload communicationPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequest(CommunicationRequest communicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationRequestPayload(CommunicationRequestPayload communicationRequestPayload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationRequestPayload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinition(CompartmentDefinition compartmentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentDefinitionResource(CompartmentDefinitionResource compartmentDefinitionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentDefinitionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentType(CompartmentType compartmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compartmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMeasureScoring(CompositeMeasureScoring compositeMeasureScoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeMeasureScoring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationMode(CompositionAttestationMode compositionAttestationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttestationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttester(CompositionAttester compositionAttester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionAttester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionEvent(CompositionEvent compositionEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionSection(CompositionSection compositionSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatus(CompositionStatus compositionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMap(ConceptMap conceptMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapDependsOn(ConceptMapDependsOn conceptMapDependsOn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapDependsOn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapElement(ConceptMapElement conceptMapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalence(ConceptMapEquivalence conceptMapEquivalence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapEquivalence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapGroup(ConceptMapGroup conceptMapGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapTarget(ConceptMapTarget conceptMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatus(ConditionalDeleteStatus conditionalDeleteStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalDeleteStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatus(ConditionalReadStatus conditionalReadStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalReadStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEvidence(ConditionEvidence conditionEvidence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionEvidence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionStage(ConditionStage conditionStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionVerificationStatus(ConditionVerificationStatus conditionVerificationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionVerificationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent(Consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentActor(ConsentActor consentActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentActor1(ConsentActor1 consentActor1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentActor1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentData(ConsentData consentData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentData1(ConsentData1 consentData1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentData1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaning(ConsentDataMeaning consentDataMeaning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentDataMeaning, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentExcept(ConsentExcept consentExcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentExcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentExceptType(ConsentExceptType consentExceptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentExceptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentStatus(ConsentStatus consentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverity(ConstraintSeverity constraintSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactDetail(ContactDetail contactDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPoint(ContactPoint contactPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystem(ContactPointSystem contactPointSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUse(ContactPointUse contactPointUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactPointUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(ContentType contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAgent(ContractAgent contractAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractAgent1(ContractAgent1 contractAgent1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractAgent1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractFriendly(ContractFriendly contractFriendly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractFriendly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractLegal(ContractLegal contractLegal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractLegal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractRule(ContractRule contractRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractSigner(ContractSigner contractSigner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractSigner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractTerm(ContractTerm contractTerm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem(ContractValuedItem contractValuedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractValuedItem1(ContractValuedItem1 contractValuedItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contractValuedItem1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributor(Contributor contributor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorType(ContributorType contributorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCount(Count count, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(count, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverage(Coverage coverage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageGrouping(CoverageGrouping coverageGrouping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageGrouping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElement(DataElement dataElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementMapping(DataElementMapping dataElementMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementStringency(DataElementStringency dataElementStringency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataElementStringency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirement(DataRequirement dataRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementCodeFilter(DataRequirementCodeFilter dataRequirementCodeFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementCodeFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRequirementDateFilter(DataRequirementDateFilter dataRequirementDateFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRequirementDateFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(DateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeek(DaysOfWeek daysOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daysOfWeek, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(Decimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssue(DetectedIssue detectedIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueMitigation(DetectedIssueMitigation detectedIssueMitigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueMitigation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverity(DetectedIssueSeverity detectedIssueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectedIssueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponent(DeviceComponent deviceComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceComponentProductionSpecification(DeviceComponentProductionSpecification deviceComponentProductionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceComponentProductionSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetric(DeviceMetric deviceMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibration(DeviceMetricCalibration deviceMetricCalibration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationState(DeviceMetricCalibrationState deviceMetricCalibrationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationType(DeviceMetricCalibrationType deviceMetricCalibrationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCalibrationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategory(DeviceMetricCategory deviceMetricCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColor(DeviceMetricColor deviceMetricColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatus(DeviceMetricOperationalStatus deviceMetricOperationalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceMetricOperationalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRequest(DeviceRequest deviceRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceRequestRequester(DeviceRequestRequester deviceRequestRequester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceRequestRequester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatus(DeviceStatus deviceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceUseStatement(DeviceUseStatement deviceUseStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceUseStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReport(DiagnosticReport diagnosticReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportImage(DiagnosticReportImage diagnosticReportImage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportImage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportPerformer(DiagnosticReportPerformer diagnosticReportPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatus(DiagnosticReportStatus diagnosticReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaType(DigitalMediaType digitalMediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalMediaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(Distance distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifest(DocumentManifest documentManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestContent(DocumentManifestContent documentManifestContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentManifestRelated(DocumentManifestRelated documentManifestRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentManifestRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentMode(DocumentMode documentMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReference(DocumentReference documentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContent(DocumentReferenceContent documentReferenceContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceContext(DocumentReferenceContext documentReferenceContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelated(DocumentReferenceRelated documentReferenceRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceRelatesTo(DocumentReferenceRelatesTo documentReferenceRelatesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceRelatesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatus(DocumentReferenceStatus documentReferenceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferenceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipType(DocumentRelationshipType documentRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainResource(DomainResource domainResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDosageInstruction(DosageInstruction dosageInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dosageInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(duration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBase(ElementDefinitionBase elementDefinitionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionBinding(ElementDefinitionBinding elementDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionConstraint(ElementDefinitionConstraint elementDefinitionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionExample(ElementDefinitionExample elementDefinitionExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionMapping(ElementDefinitionMapping elementDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionSlicing(ElementDefinitionSlicing elementDefinitionSlicing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionSlicing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinitionType(ElementDefinitionType elementDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityRequest(EligibilityRequest eligibilityRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponse(EligibilityResponse eligibilityResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseBenefitBalance(EligibilityResponseBenefitBalance eligibilityResponseBenefitBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseBenefitBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseError(EligibilityResponseError eligibilityResponseError, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseError, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseFinancial(EligibilityResponseFinancial eligibilityResponseFinancial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseFinancial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEligibilityResponseInsurance(EligibilityResponseInsurance eligibilityResponseInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eligibilityResponseInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterClassHistory(EncounterClassHistory encounterClassHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterClassHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHospitalization(EncounterHospitalization encounterHospitalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterHospitalization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatus(EncounterLocationStatus encounterLocationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterLocationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatus(EncounterStatus encounterStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusHistory(EncounterStatusHistory encounterStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatus(EndpointStatus endpointStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentRequest(EnrollmentRequest enrollmentRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollmentResponse(EnrollmentResponse enrollmentResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollmentResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCare(EpisodeOfCare episodeOfCare, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCare, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatus(EpisodeOfCareStatus episodeOfCareStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusHistory(EpisodeOfCareStatusHistory episodeOfCareStatusHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(episodeOfCareStatusHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityMode(EventCapabilityMode eventCapabilityMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventCapabilityMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTiming(EventTiming eventTiming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventTiming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfile(ExpansionProfile expansionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation(ExpansionProfileDesignation expansionProfileDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation1(ExpansionProfileDesignation1 expansionProfileDesignation1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileDesignation2(ExpansionProfileDesignation2 expansionProfileDesignation2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileDesignation2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileExclude(ExpansionProfileExclude expansionProfileExclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileExclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileExcludedSystem(ExpansionProfileExcludedSystem expansionProfileExcludedSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileExcludedSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileFixedVersion(ExpansionProfileFixedVersion expansionProfileFixedVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileFixedVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionProfileInclude(ExpansionProfileInclude expansionProfileInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expansionProfileInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefit(ExplanationOfBenefit explanationOfBenefit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAccident(ExplanationOfBenefitAccident explanationOfBenefitAccident, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAccident, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAddItem(ExplanationOfBenefitAddItem explanationOfBenefitAddItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAddItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitAdjudication(ExplanationOfBenefitAdjudication explanationOfBenefitAdjudication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitAdjudication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitBenefitBalance(ExplanationOfBenefitBenefitBalance explanationOfBenefitBenefitBalance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitBenefitBalance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeam explanationOfBenefitCareTeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitCareTeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail(ExplanationOfBenefitDetail explanationOfBenefitDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDetail1(ExplanationOfBenefitDetail1 explanationOfBenefitDetail1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDetail1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitDiagnosis(ExplanationOfBenefitDiagnosis explanationOfBenefitDiagnosis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitDiagnosis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitFinancial(ExplanationOfBenefitFinancial explanationOfBenefitFinancial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitFinancial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitInformation(ExplanationOfBenefitInformation explanationOfBenefitInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitInsurance(ExplanationOfBenefitInsurance explanationOfBenefitInsurance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitInsurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitItem(ExplanationOfBenefitItem explanationOfBenefitItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitPayee(ExplanationOfBenefitPayee explanationOfBenefitPayee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitPayee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitPayment(ExplanationOfBenefitPayment explanationOfBenefitPayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitPayment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProcedure(ExplanationOfBenefitProcedure explanationOfBenefitProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitProcessNote(ExplanationOfBenefitProcessNote explanationOfBenefitProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitRelated(ExplanationOfBenefitRelated explanationOfBenefitRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatus(ExplanationOfBenefitStatus explanationOfBenefitStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitSubDetail(ExplanationOfBenefitSubDetail explanationOfBenefitSubDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explanationOfBenefitSubDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContext(ExtensionContext extensionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatus(FamilyHistoryStatus familyHistoryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyHistoryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistory(FamilyMemberHistory familyMemberHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMemberHistoryCondition(FamilyMemberHistoryCondition familyMemberHistoryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(familyMemberHistoryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperator(FilterOperator filterOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlag(Flag flag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatus(FlagStatus flagStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flagStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatus(GoalStatus goalStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalTarget(GoalTarget goalTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupCharacteristic(GroupCharacteristic groupCharacteristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupCharacteristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupMember(GroupMember groupMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponse(GuidanceResponse guidanceResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatus(GuidanceResponseStatus guidanceResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidanceResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideDependencyType(GuideDependencyType guideDependencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guideDependencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageKind(GuidePageKind guidePageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidePageKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareService(HealthcareService healthcareService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceAvailableTime(HealthcareServiceAvailableTime healthcareServiceAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareServiceNotAvailable(HealthcareServiceNotAvailable healthcareServiceNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthcareServiceNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpVerb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanName(HumanName humanName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(humanName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateId(Id id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(id, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(Identifier identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUse(IdentifierUse identifierUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifierUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevel(IdentityAssuranceLevel identityAssuranceLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityAssuranceLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingManifest(ImagingManifest imagingManifest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingManifest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingManifestInstance(ImagingManifestInstance imagingManifestInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingManifestInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingManifestSeries(ImagingManifestSeries imagingManifestSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingManifestSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingManifestStudy(ImagingManifestStudy imagingManifestStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingManifestStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudy(ImagingStudy imagingStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudyInstance(ImagingStudyInstance imagingStudyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudyInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingStudySeries(ImagingStudySeries imagingStudySeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingStudySeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationExplanation(ImmunizationExplanation immunizationExplanation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationExplanation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationReaction(ImmunizationReaction immunizationReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendation(ImmunizationRecommendation immunizationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationDateCriterion(ImmunizationRecommendationDateCriterion immunizationRecommendationDateCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationDateCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationProtocol(ImmunizationRecommendationProtocol immunizationRecommendationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationRecommendationRecommendation(ImmunizationRecommendationRecommendation immunizationRecommendationRecommendation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationRecommendationRecommendation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationVaccinationProtocol(ImmunizationVaccinationProtocol immunizationVaccinationProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(immunizationVaccinationProtocol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuide(ImplementationGuide implementationGuide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuide, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideDependency(ImplementationGuideDependency implementationGuideDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideGlobal(ImplementationGuideGlobal implementationGuideGlobal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideGlobal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePackage(ImplementationGuidePackage implementationGuidePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuidePage(ImplementationGuidePage implementationGuidePage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuidePage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationGuideResource(ImplementationGuideResource implementationGuideResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationGuideResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailability(InstanceAvailability instanceAvailability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceAvailability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstant(Instant instant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(org.hl7.fhir.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverity(IssueSeverity issueSeverity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueSeverity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(IssueType issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkage(Linkage linkage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageItem(LinkageItem linkageItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageType(LinkageType linkageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(list, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListEntry(ListEntry listEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListMode(ListMode listMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatus(ListStatus listStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationMode(LocationMode locationMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPosition(LocationPosition locationPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatus(LocationStatus locationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdown(Markdown markdown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markdown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrinciple(MeasmntPrinciple measmntPrinciple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measmntPrinciple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasure(Measure measure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureDataUsage(MeasureDataUsage measureDataUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureDataUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureGroup(MeasureGroup measureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulation(MeasurePopulation measurePopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulationType(MeasurePopulationType measurePopulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePopulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReport(MeasureReport measureReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup(MeasureReportGroup measureReportGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup1(MeasureReportGroup1 measureReportGroup1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportGroup2(MeasureReportGroup2 measureReportGroup2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportGroup2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation(MeasureReportPopulation measureReportPopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportPopulation1(MeasureReportPopulation1 measureReportPopulation1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportPopulation1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatus(MeasureReportStatus measureReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStratifier(MeasureReportStratifier measureReportStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportSupplementalData(MeasureReportSupplementalData measureReportSupplementalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportSupplementalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportType(MeasureReportType measureReportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureReportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureScoring(MeasureScoring measureScoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureScoring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureStratifier(MeasureStratifier measureStratifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureStratifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSupplementalData(MeasureSupplementalData measureSupplementalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureSupplementalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedia(Media media, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(media, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministration(MedicationAdministration medicationAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationDosage(MedicationAdministrationDosage medicationAdministrationDosage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationDosage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationPerformer(MedicationAdministrationPerformer medicationAdministrationPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationPerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatus(MedicationAdministrationStatus medicationAdministrationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationAdministrationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationBatch(MedicationBatch medicationBatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationBatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationContent(MedicationContent medicationContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispense(MedicationDispense medicationDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispensePerformer(MedicationDispensePerformer medicationDispensePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispensePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatus(MedicationDispenseStatus medicationDispenseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseSubstitution(MedicationDispenseSubstitution medicationDispenseSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationDispenseSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationIngredient(MedicationIngredient medicationIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationPackage(MedicationPackage medicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationProduct(MedicationProduct medicationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequest(MedicationRequest medicationRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestDispenseRequest(MedicationRequestDispenseRequest medicationRequestDispenseRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestDispenseRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntent(MedicationRequestIntent medicationRequestIntent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestIntent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestPriority(MedicationRequestPriority medicationRequestPriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestPriority, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestRequester(MedicationRequestRequester medicationRequestRequester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestRequester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestStatus(MedicationRequestStatus medicationRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestSubstitution(MedicationRequestSubstitution medicationRequestSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationRequestSubstitution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatement(MedicationStatement medicationStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatus(MedicationStatementStatus medicationStatementStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementTaken(MedicationStatementTaken medicationStatementTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatementTaken, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatus(MedicationStatus medicationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinition(MessageDefinition messageDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinitionAllowedResponse(MessageDefinitionAllowedResponse messageDefinitionAllowedResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinitionAllowedResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageDefinitionFocus(MessageDefinitionFocus messageDefinitionFocus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageDefinitionFocus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeader(MessageHeader messageHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderDestination(MessageHeaderDestination messageHeaderDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderResponse(MessageHeaderResponse messageHeaderResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageHeaderSource(MessageHeaderSource messageHeaderSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageHeaderSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategory(MessageSignificanceCategory messageSignificanceCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSignificanceCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeta(Meta meta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Money money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(money, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUse(NameUse nameUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystem(NamingSystem namingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierType(NamingSystemIdentifierType namingSystemIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemType(NamingSystemType namingSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemUniqueId(NamingSystemUniqueId namingSystemUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namingSystemUniqueId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrative(Narrative narrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatus(NarrativeStatus narrativeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrder(NutritionOrder nutritionOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderAdministration(NutritionOrderAdministration nutritionOrderAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderEnteralFormula(NutritionOrderEnteralFormula nutritionOrderEnteralFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderEnteralFormula, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderNutrient(NutritionOrderNutrient nutritionOrderNutrient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderNutrient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderOralDiet(NutritionOrderOralDiet nutritionOrderOralDiet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderOralDiet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatus(NutritionOrderStatus nutritionOrderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderSupplement(NutritionOrderSupplement nutritionOrderSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderTexture(NutritionOrderTexture nutritionOrderTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionOrderTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationComponent(ObservationComponent observationComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationReferenceRange(ObservationReferenceRange observationReferenceRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationReferenceRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelated(ObservationRelated observationRelated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelated, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipType(ObservationRelationshipType observationRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatus(ObservationStatus observationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(Oid oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinition(OperationDefinition operationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionBinding(OperationDefinitionBinding operationDefinitionBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionOverload(OperationDefinitionOverload operationDefinitionOverload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionOverload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDefinitionParameter(OperationDefinitionParameter operationDefinitionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDefinitionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKind(OperationKind operationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcome(OperationOutcome operationOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationOutcomeIssue(OperationOutcomeIssue operationOutcomeIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationOutcomeIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUse(OperationParameterUse operationParameterUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationContact(OrganizationContact organizationContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDefinition(ParameterDefinition parameterDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersParameter(ParametersParameter parametersParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequired(ParticipantRequired participantRequired, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRequired, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatus(ParticipationStatus participationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAnimal(PatientAnimal patientAnimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientAnimal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientCommunication(PatientCommunication patientCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientContact(PatientContact patientContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientLink(PatientLink patientLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentNotice(PaymentNotice paymentNotice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentNotice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliation(PaymentReconciliation paymentReconciliation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationDetail(PaymentReconciliationDetail paymentReconciliationDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentReconciliationProcessNote(PaymentReconciliationProcessNote paymentReconciliationProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentReconciliationProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(period, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonLink(PersonLink personLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinition(PlanDefinition planDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionActionDefinition(PlanDefinitionActionDefinition planDefinitionActionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionActionDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionCondition(PlanDefinitionCondition planDefinitionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionDynamicValue(PlanDefinitionDynamicValue planDefinitionDynamicValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionDynamicValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanDefinitionRelatedAction(PlanDefinitionRelatedAction planDefinitionRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planDefinitionRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(PositiveInt positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitioner(Practitioner practitioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitioner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerQualification(PractitionerQualification practitionerQualification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerQualification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRole(PractitionerRole practitionerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRole1(PractitionerRole1 practitionerRole1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRole1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleAvailableTime(PractitionerRoleAvailableTime practitionerRoleAvailableTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleAvailableTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePractitionerRoleNotAvailable(PractitionerRoleNotAvailable practitionerRoleNotAvailable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(practitionerRoleNotAvailable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureFocalDevice(ProcedureFocalDevice procedureFocalDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureFocalDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePerformer(ProcedurePerformer procedurePerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedurePerformer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequest(ProcedureRequest procedureRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureRequestRequester(ProcedureRequestRequester procedureRequestRequester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureRequestRequester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatus(ProcedureStatus procedureStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequest(ProcessRequest processRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessRequestItem(ProcessRequestItem processRequestItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processRequestItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponse(ProcessResponse processResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessResponseProcessNote(ProcessResponseProcessNote processResponseProcessNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processResponseProcessNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentation(PropertyRepresentation propertyRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenance(Provenance provenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAgent(ProvenanceAgent provenanceAgent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceAgent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntity(ProvenanceEntity provenanceEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRole(ProvenanceEntityRole provenanceEntityRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provenanceEntityRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatus(PublicationStatus publicationStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityType(QualityType qualityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparator(QuantityComparator quantityComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireEnableWhen(QuestionnaireEnableWhen questionnaireEnableWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireEnableWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItem(QuestionnaireItem questionnaireItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemType(QuestionnaireItemType questionnaireItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireOption(QuestionnaireOption questionnaireOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponse(QuestionnaireResponse questionnaireResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseAnswer(QuestionnaireResponseAnswer questionnaireResponseAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseItem(QuestionnaireResponseItem questionnaireResponseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatus(QuestionnaireResponseStatus questionnaireResponseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireResponseStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatus(QuestionnaireStatus questionnaireStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(questionnaireStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatio(Ratio ratio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratio, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicy(ReferenceHandlingPolicy referenceHandlingPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceHandlingPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRules(ReferenceVersionRules referenceVersionRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceVersionRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequest(ReferralRequest referralRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequestStatus(ReferralRequestStatus referralRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referralRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifact(RelatedArtifact relatedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactType(RelatedArtifactType relatedArtifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedArtifactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPerson(RelatedPerson relatedPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcome(RemittanceOutcome remittanceOutcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remittanceOutcome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryType(RepositoryType repositoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroup(RequestGroup requestGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupAction(RequestGroupAction requestGroupAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupCondition(RequestGroupCondition requestGroupCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestGroupRelatedAction(RequestGroupRelatedAction requestGroupRelatedAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestGroupRelatedAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudy(ResearchStudy researchStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyArm(ResearchStudyArm researchStudyArm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudyArm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatus(ResearchStudyStatus researchStudyStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchStudyStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubject(ResearchSubject researchSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatus(ResearchSubjectStatus researchSubjectStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(researchSubjectStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceContainer(ResourceContainer resourceContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicy(ResourceVersionPolicy resourceVersionPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseType(ResponseType responseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityMode(RestfulCapabilityMode restfulCapabilityMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restfulCapabilityMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessment(RiskAssessment riskAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRiskAssessmentPrediction(RiskAssessmentPrediction riskAssessmentPrediction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(riskAssessmentPrediction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledData(SampledData sampledData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataType(SampledDataDataType sampledDataDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampledDataDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparator(SearchComparator searchComparator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchComparator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryMode(SearchEntryMode searchEntryMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchEntryMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCode(SearchModifierCode searchModifierCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchModifierCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameter(SearchParameter searchParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParameterComponent(SearchParameterComponent searchParameterComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParameterComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamType(SearchParamType searchParamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(searchParamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceQuality(SequenceQuality sequenceQuality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceQuality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceReferenceSeq(SequenceReferenceSeq sequenceReferenceSeq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceReferenceSeq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRepository(SequenceRepository sequenceRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceVariant(SequenceVariant sequenceVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceVariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDefinition(ServiceDefinition serviceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRules(SlicingRules slicingRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slicingRules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatus(SlotStatus slotStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slotStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollection(SpecimenCollection specimenCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenContainer(SpecimenContainer specimenContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenProcessing(SpecimenProcessing specimenProcessing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenProcessing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatus(SpecimenStatus specimenStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(org.hl7.fhir.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinition(StructureDefinition structureDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionDifferential(StructureDefinitionDifferential structureDefinitionDifferential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionDifferential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKind(StructureDefinitionKind structureDefinitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionMapping(StructureDefinitionMapping structureDefinitionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionSnapshot(StructureDefinitionSnapshot structureDefinitionSnapshot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureDefinitionSnapshot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMap(StructureMap structureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextType(StructureMapContextType structureMapContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapDependent(StructureMapDependent structureMapDependent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapDependent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroup(StructureMapGroup structureMapGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeMode(StructureMapGroupTypeMode structureMapGroupTypeMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapGroupTypeMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInput(StructureMapInput structureMapInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputMode(StructureMapInputMode structureMapInputMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapInputMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelMode(StructureMapModelMode structureMapModelMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapModelMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapParameter(StructureMapParameter structureMapParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapRule(StructureMapRule structureMapRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSource(StructureMapSource structureMapSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListMode(StructureMapSourceListMode structureMapSourceListMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapSourceListMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapStructure(StructureMapStructure structureMapStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTarget(StructureMapTarget structureMapTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListMode(StructureMapTargetListMode structureMapTargetListMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTargetListMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransform(StructureMapTransform structureMapTransform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structureMapTransform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannel(SubscriptionChannel subscriptionChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelType(SubscriptionChannelType subscriptionChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatus(SubscriptionStatus subscriptionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscriptionStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstance(Substance substance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceIngredient(SubstanceIngredient substanceIngredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceIngredient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceInstance(SubstanceInstance substanceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceStatus(SubstanceStatus substanceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDelivery(SupplyDelivery supplyDelivery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDelivery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatus(SupplyDeliveryStatus supplyDeliveryStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliveryStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliverySuppliedItem(SupplyDeliverySuppliedItem supplyDeliverySuppliedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyDeliverySuppliedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequest(SupplyRequest supplyRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatus(SupplyRequestStatus supplyRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestWhen(SupplyRequestWhen supplyRequestWhen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplyRequestWhen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteraction(SystemRestfulInteraction systemRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemVersionProcessingMode(SystemVersionProcessingMode systemVersionProcessingMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemVersionProcessingMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskInput(TaskInput taskInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskOutput(TaskOutput taskOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskRequester(TaskRequester taskRequester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskRequester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskRestriction(TaskRestriction taskRestriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskRestriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatus(TaskStatus taskStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReport(TestReport testReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction(TestReportAction testReportAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction1(TestReportAction1 testReportAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAction2(TestReportAction2 testReportAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResult(TestReportActionResult testReportActionResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportActionResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportAssert(TestReportAssert testReportAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportOperation(TestReportOperation testReportOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipant(TestReportParticipant testReportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantType(TestReportParticipantType testReportParticipantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportParticipantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResult(TestReportResult testReportResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportSetup(TestReportSetup testReportSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatus(TestReportStatus testReportStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportStatus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportTeardown(TestReportTeardown testReportTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportTest(TestReportTest testReportTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReportTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScript(TestScript testScript, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScript, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction(TestScriptAction testScriptAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction1(TestScriptAction1 testScriptAction1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAction2(TestScriptAction2 testScriptAction2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAction2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptAssert(TestScriptAssert testScriptAssert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptAssert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptCapability(TestScriptCapability testScriptCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptDestination(TestScriptDestination testScriptDestination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptDestination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptFixture(TestScriptFixture testScriptFixture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptFixture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptLink(TestScriptLink testScriptLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptMetadata(TestScriptMetadata testScriptMetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptMetadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOperation(TestScriptOperation testScriptOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptOrigin(TestScriptOrigin testScriptOrigin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptOrigin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam(TestScriptParam testScriptParam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam1(TestScriptParam1 testScriptParam1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam2(TestScriptParam2 testScriptParam2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptParam3(TestScriptParam3 testScriptParam3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptParam3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRequestHeader(TestScriptRequestHeader testScriptRequestHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRequestHeader, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule(TestScriptRule testScriptRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule1(TestScriptRule1 testScriptRule1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule2(TestScriptRule2 testScriptRule2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRule3(TestScriptRule3 testScriptRule3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRule3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRuleset(TestScriptRuleset testScriptRuleset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRuleset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptRuleset1(TestScriptRuleset1 testScriptRuleset1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptRuleset1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptSetup(TestScriptSetup testScriptSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTeardown(TestScriptTeardown testScriptTeardown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTeardown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptTest(TestScriptTest testScriptTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScriptVariable(TestScriptVariable testScriptVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScriptVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiming(Timing timing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimingRepeat(TimingRepeat timingRepeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timingRepeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerDefinition(TriggerDefinition triggerDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRule(TypeDerivationRule typeDerivationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDerivationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteraction(TypeRestfulInteraction typeRestfulInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeRestfulInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTime(UnitsOfTime unitsOfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsOfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownContentCode(UnknownContentCode unknownContentCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownContentCode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedInt(UnsignedInt unsignedInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unsignedInt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(Uri uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uri, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageContext(UsageContext usageContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUse(Use use, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(use, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(Uuid uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSet(ValueSet valueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetCompose(ValueSetCompose valueSetCompose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetCompose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetConcept(ValueSetConcept valueSetConcept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetConcept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetContains(ValueSetContains valueSetContains, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetContains, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDesignation(ValueSetDesignation valueSetDesignation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDesignation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetExpansion(ValueSetExpansion valueSetExpansion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetExpansion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetFilter(ValueSetFilter valueSetFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetInclude(ValueSetInclude valueSetInclude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetInclude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetParameter(ValueSetParameter valueSetParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBase(VisionBase visionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyes(VisionEyes visionEyes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionEyes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescription(VisionPrescription visionPrescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionPrescriptionDispense(VisionPrescriptionDispense visionPrescriptionDispense, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(visionPrescriptionDispense, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageType(XPathUsageType xPathUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xPathUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusList(AccountStatusList accountStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehaviorList(ActionCardinalityBehaviorList actionCardinalityBehaviorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKindList(ActionConditionKindList actionConditionKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehaviorList(ActionGroupingBehaviorList actionGroupingBehaviorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionListList(ActionListList actionListList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantTypeList(ActionParticipantTypeList actionParticipantTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehaviorList(ActionPrecheckBehaviorList actionPrecheckBehaviorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipTypeList(ActionRelationshipTypeList actionRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehaviorList(ActionRequiredBehaviorList actionRequiredBehaviorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehaviorList(ActionSelectionBehaviorList actionSelectionBehaviorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionCategoryList(ActivityDefinitionCategoryList activityDefinitionCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeList(AddressTypeList addressTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseList(AddressUseList addressUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderList(AdministrativeGenderList administrativeGenderList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCategoryList(AdverseEventCategoryList adverseEventCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCausalityList(AdverseEventCausalityList adverseEventCausalityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeList(AggregationModeList aggregationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceClinicalStatusList(AllergyIntoleranceClinicalStatusList allergyIntoleranceClinicalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityList(AllergyIntoleranceCriticalityList allergyIntoleranceCriticalityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityList(AllergyIntoleranceSeverityList allergyIntoleranceSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeList(AllergyIntoleranceTypeList allergyIntoleranceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceVerificationStatusList(AllergyIntoleranceVerificationStatusList allergyIntoleranceVerificationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusList(AppointmentStatusList appointmentStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeList(AssertionDirectionTypeList assertionDirectionTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeList(AssertionOperatorTypeList assertionOperatorTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesList(AssertionResponseTypesList assertionResponseTypesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionList(AuditEventActionList auditEventActionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkTypeList(AuditEventAgentNetworkTypeList auditEventAgentNetworkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeList(AuditEventOutcomeList auditEventOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthList(BindingStrengthList bindingStrengthList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeList(BundleTypeList bundleTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKindList(CapabilityStatementKindList capabilityStatementKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusList(CarePlanActivityStatusList carePlanActivityStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntentList(CarePlanIntentList carePlanIntentList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatusList(CarePlanStatusList carePlanStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatusList(CareTeamStatusList careTeamStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatusList(ChargeItemStatusList chargeItemStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusList(ClinicalImpressionStatusList clinicalImpressionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentModeList(CodeSystemContentModeList codeSystemContentModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaningList(CodeSystemHierarchyMeaningList codeSystemHierarchyMeaningList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentTypeList(CompartmentTypeList compartmentTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMeasureScoringList(CompositeMeasureScoringList compositeMeasureScoringList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeList(CompositionAttestationModeList compositionAttestationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusList(CompositionStatusList compositionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceList(ConceptMapEquivalenceList conceptMapEquivalenceList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusList(ConditionalDeleteStatusList conditionalDeleteStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatusList(ConditionalReadStatusList conditionalReadStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionVerificationStatusList(ConditionVerificationStatusList conditionVerificationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaningList(ConsentDataMeaningList consentDataMeaningList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentExceptTypeList(ConsentExceptTypeList consentExceptTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentStatusList(ConsentStatusList consentStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityList(ConstraintSeverityList constraintSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemList(ContactPointSystemList contactPointSystemList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseList(ContactPointUseList contactPointUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeList(ContentTypeList contentTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorTypeList(ContributorTypeList contributorTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementStringencyList(DataElementStringencyList dataElementStringencyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekList(DaysOfWeekList daysOfWeekList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverityList(DetectedIssueSeverityList detectedIssueSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateList(DeviceMetricCalibrationStateList deviceMetricCalibrationStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeList(DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryList(DeviceMetricCategoryList deviceMetricCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorList(DeviceMetricColorList deviceMetricColorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusList(DeviceMetricOperationalStatusList deviceMetricOperationalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatusList(DeviceStatusList deviceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusList(DiagnosticReportStatusList diagnosticReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaTypeList(DigitalMediaTypeList digitalMediaTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeList(DocumentModeList documentModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusList(DocumentReferenceStatusList documentReferenceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeList(DocumentRelationshipTypeList documentRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusList(EncounterLocationStatusList encounterLocationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusList(EncounterStatusList encounterStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatusList(EndpointStatusList endpointStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusList(EpisodeOfCareStatusList episodeOfCareStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityModeList(EventCapabilityModeList eventCapabilityModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingList(EventTimingList eventTimingList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatusList(ExplanationOfBenefitStatusList explanationOfBenefitStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextList(ExtensionContextList extensionContextList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusList(FamilyHistoryStatusList familyHistoryStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorList(FilterOperatorList filterOperatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusList(FlagStatusList flagStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatusList(GoalStatusList goalStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeList(GroupTypeList groupTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatusList(GuidanceResponseStatusList guidanceResponseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideDependencyTypeList(GuideDependencyTypeList guideDependencyTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageKindList(GuidePageKindList guidePageKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbList(HTTPVerbList httpVerbList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseList(IdentifierUseList identifierUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelList(IdentityAssuranceLevelList identityAssuranceLevelList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityList(InstanceAvailabilityList instanceAvailabilityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityList(IssueSeverityList issueSeverityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueTypeList(IssueTypeList issueTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageTypeList(LinkageTypeList linkageTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeList(LinkTypeList linkTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeList(ListModeList listModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusList(ListStatusList listStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeList(LocationModeList locationModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusList(LocationStatusList locationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrincipleList(MeasmntPrincipleList measmntPrincipleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureDataUsageList(MeasureDataUsageList measureDataUsageList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulationTypeList(MeasurePopulationTypeList measurePopulationTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatusList(MeasureReportStatusList measureReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportTypeList(MeasureReportTypeList measureReportTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureScoringList(MeasureScoringList measureScoringList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureTypeList(MeasureTypeList measureTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatusList(MedicationAdministrationStatusList medicationAdministrationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusList(MedicationDispenseStatusList medicationDispenseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntentList(MedicationRequestIntentList medicationRequestIntentList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestPriorityList(MedicationRequestPriorityList medicationRequestPriorityList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestStatusList(MedicationRequestStatusList medicationRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusList(MedicationStatementStatusList medicationStatementStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementTakenList(MedicationStatementTakenList medicationStatementTakenList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusList(MedicationStatusList medicationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryList(MessageSignificanceCategoryList messageSignificanceCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseList(NameUseList nameUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeList(NamingSystemIdentifierTypeList namingSystemIdentifierTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeList(NamingSystemTypeList namingSystemTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusList(NarrativeStatusList narrativeStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeList(NoteTypeList noteTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatusList(NutritionOrderStatusList nutritionOrderStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipTypeList(ObservationRelationshipTypeList observationRelationshipTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusList(ObservationStatusList observationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindList(OperationKindList operationKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseList(OperationParameterUseList operationParameterUseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredList(ParticipantRequiredList participantRequiredList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusList(ParticipationStatusList participationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusList(ProcedureStatusList procedureStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationList(PropertyRepresentationList propertyRepresentationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeList(PropertyTypeList propertyTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleList(ProvenanceEntityRoleList provenanceEntityRoleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusList(PublicationStatusList publicationStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityTypeList(QualityTypeList qualityTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorList(QuantityComparatorList quantityComparatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemTypeList(QuestionnaireItemTypeList questionnaireItemTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatusList(QuestionnaireResponseStatusList questionnaireResponseStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatusList(QuestionnaireStatusList questionnaireStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicyList(ReferenceHandlingPolicyList referenceHandlingPolicyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRulesList(ReferenceVersionRulesList referenceVersionRulesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequestStatusList(ReferralRequestStatusList referralRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactTypeList(RelatedArtifactTypeList relatedArtifactTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeList(RemittanceOutcomeList remittanceOutcomeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryTypeList(RepositoryTypeList repositoryTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatusList(ResearchStudyStatusList researchStudyStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatusList(ResearchSubjectStatusList researchSubjectStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyList(ResourceVersionPolicyList resourceVersionPolicyList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeList(ResponseTypeList responseTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityModeList(RestfulCapabilityModeList restfulCapabilityModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparatorList(SearchComparatorList searchComparatorList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeList(SearchEntryModeList searchEntryModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeList(SearchModifierCodeList searchModifierCodeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeList(SearchParamTypeList searchParamTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeList(SequenceTypeList sequenceTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesList(SlicingRulesList slicingRulesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusList(SlotStatusList slotStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatusList(SpecimenStatusList specimenStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindList(StructureDefinitionKindList structureDefinitionKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextTypeList(StructureMapContextTypeList structureMapContextTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeModeList(StructureMapGroupTypeModeList structureMapGroupTypeModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputModeList(StructureMapInputModeList structureMapInputModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelModeList(StructureMapModelModeList structureMapModelModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListModeList(StructureMapSourceListModeList structureMapSourceListModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListModeList(StructureMapTargetListModeList structureMapTargetListModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransformList(StructureMapTransformList structureMapTransformList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeList(SubscriptionChannelTypeList subscriptionChannelTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusList(SubscriptionStatusList subscriptionStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceStatusList(SubstanceStatusList substanceStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusList(SupplyDeliveryStatusList supplyDeliveryStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusList(SupplyRequestStatusList supplyRequestStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionList(SystemRestfulInteractionList systemRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemVersionProcessingModeList(SystemVersionProcessingModeList systemVersionProcessingModeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatusList(TaskStatusList taskStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResultList(TestReportActionResultList testReportActionResultList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantTypeList(TestReportParticipantTypeList testReportParticipantTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResultList(TestReportResultList testReportResultList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatusList(TestReportStatusList testReportStatusList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeList(TriggerTypeList triggerTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRuleList(TypeDerivationRuleList typeDerivationRuleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionList(TypeRestfulInteractionList typeRestfulInteractionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeList(UnitsOfTimeList unitsOfTimeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownContentCodeList(UnknownContentCodeList unknownContentCodeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseList(UseList useList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseList(VisionBaseList visionBaseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesList(VisionEyesList visionEyesList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageTypeList(XPathUsageTypeList xPathUsageTypeList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountStatusListObject(AccountStatusList accountStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCardinalityBehaviorListObject(ActionCardinalityBehaviorList actionCardinalityBehaviorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionConditionKindListObject(ActionConditionKindList actionConditionKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupingBehaviorListObject(ActionGroupingBehaviorList actionGroupingBehaviorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionListListObject(ActionListList actionListListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionParticipantTypeListObject(ActionParticipantTypeList actionParticipantTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionPrecheckBehaviorListObject(ActionPrecheckBehaviorList actionPrecheckBehaviorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRelationshipTypeListObject(ActionRelationshipTypeList actionRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRequiredBehaviorListObject(ActionRequiredBehaviorList actionRequiredBehaviorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionSelectionBehaviorListObject(ActionSelectionBehaviorList actionSelectionBehaviorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityDefinitionCategoryListObject(ActivityDefinitionCategoryList activityDefinitionCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressTypeListObject(AddressTypeList addressTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressUseListObject(AddressUseList addressUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdministrativeGenderListObject(AdministrativeGenderList administrativeGenderListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCategoryListObject(AdverseEventCategoryList adverseEventCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdverseEventCausalityListObject(AdverseEventCausalityList adverseEventCausalityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationModeListObject(AggregationModeList aggregationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceClinicalStatusListObject(AllergyIntoleranceClinicalStatusList allergyIntoleranceClinicalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceCriticalityListObject(AllergyIntoleranceCriticalityList allergyIntoleranceCriticalityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceSeverityListObject(AllergyIntoleranceSeverityList allergyIntoleranceSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceTypeListObject(AllergyIntoleranceTypeList allergyIntoleranceTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceVerificationStatusListObject(AllergyIntoleranceVerificationStatusList allergyIntoleranceVerificationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointmentStatusListObject(AppointmentStatusList appointmentStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionDirectionTypeListObject(AssertionDirectionTypeList assertionDirectionTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionOperatorTypeListObject(AssertionOperatorTypeList assertionOperatorTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertionResponseTypesListObject(AssertionResponseTypesList assertionResponseTypesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventActionListObject(AuditEventActionList auditEventActionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventAgentNetworkTypeListObject(AuditEventAgentNetworkTypeList auditEventAgentNetworkTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditEventOutcomeListObject(AuditEventOutcomeList auditEventOutcomeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryPrimitive(byte[] base64BinaryPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingStrengthListObject(BindingStrengthList bindingStrengthListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitive(boolean booleanPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPrimitiveObject(Boolean booleanPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundleTypeListObject(BundleTypeList bundleTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityStatementKindListObject(CapabilityStatementKindList capabilityStatementKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanActivityStatusListObject(CarePlanActivityStatusList carePlanActivityStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanIntentListObject(CarePlanIntentList carePlanIntentListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanStatusListObject(CarePlanStatusList carePlanStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamStatusListObject(CareTeamStatusList careTeamStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChargeItemStatusListObject(ChargeItemStatusList chargeItemStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalImpressionStatusListObject(ClinicalImpressionStatusList clinicalImpressionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodePrimitive_Pattern(codePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodePrimitive_MinLength(codePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] CODE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+([\\s]?[^\\s]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_Pattern(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, CODE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Code Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodePrimitive_MinLength(String codePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codePrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getCodePrimitive(), codePrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemContentModeListObject(CodeSystemContentModeList codeSystemContentModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemHierarchyMeaningListObject(CodeSystemHierarchyMeaningList codeSystemHierarchyMeaningListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompartmentTypeListObject(CompartmentTypeList compartmentTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMeasureScoringListObject(CompositeMeasureScoringList compositeMeasureScoringListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionAttestationModeListObject(CompositionAttestationModeList compositionAttestationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionStatusListObject(CompositionStatusList compositionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptMapEquivalenceListObject(ConceptMapEquivalenceList conceptMapEquivalenceListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDeleteStatusListObject(ConditionalDeleteStatusList conditionalDeleteStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalReadStatusListObject(ConditionalReadStatusList conditionalReadStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionVerificationStatusListObject(ConditionVerificationStatusList conditionVerificationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentDataMeaningListObject(ConsentDataMeaningList consentDataMeaningListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentExceptTypeListObject(ConsentExceptTypeList consentExceptTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentStatusListObject(ConsentStatusList consentStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintSeverityListObject(ConstraintSeverityList constraintSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointSystemListObject(ContactPointSystemList contactPointSystemListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactPointUseListObject(ContactPointUseList contactPointUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypeListObject(ContentTypeList contentTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributorTypeListObject(ContributorTypeList contributorTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataElementStringencyListObject(DataElementStringencyList dataElementStringencyListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatePrimitive_Pattern(datePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitive_Pattern(XMLGregorianCalendar datePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDatePrimitive(), datePrimitive, DATE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatePrimitiveBase_MemberTypes(datePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePrimitiveBase_MemberTypes(XMLGregorianCalendar datePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(datePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(datePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(datePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateDateTimePrimitive_Pattern(dateTimePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00))?)?)?)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitive_Pattern(XMLGregorianCalendar dateTimePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDateTimePrimitive(), dateTimePrimitive, DATE_TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimePrimitiveBase_MemberTypes(dateTimePrimitiveBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Primitive Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrimitiveBase_MemberTypes(XMLGregorianCalendar dateTimePrimitiveBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYear(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDate(dateTimePrimitiveBase, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimePrimitiveBase)) {
				if (xmlTypeValidator.validateDateTime(dateTimePrimitiveBase, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaysOfWeekListObject(DaysOfWeekList daysOfWeekListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPrimitive_Pattern(decimalPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] DECIMAL_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Decimal Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPrimitive_Pattern(BigDecimal decimalPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getDecimalPrimitive(), decimalPrimitive, DECIMAL_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectedIssueSeverityListObject(DetectedIssueSeverityList detectedIssueSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationStateListObject(DeviceMetricCalibrationStateList deviceMetricCalibrationStateListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCalibrationTypeListObject(DeviceMetricCalibrationTypeList deviceMetricCalibrationTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricCategoryListObject(DeviceMetricCategoryList deviceMetricCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricColorListObject(DeviceMetricColorList deviceMetricColorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceMetricOperationalStatusListObject(DeviceMetricOperationalStatusList deviceMetricOperationalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceStatusListObject(DeviceStatusList deviceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticReportStatusListObject(DiagnosticReportStatusList diagnosticReportStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalMediaTypeListObject(DigitalMediaTypeList digitalMediaTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentModeListObject(DocumentModeList documentModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferenceStatusListObject(DocumentReferenceStatusList documentReferenceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRelationshipTypeListObject(DocumentRelationshipTypeList documentRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocationStatusListObject(EncounterLocationStatusList encounterLocationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterStatusListObject(EncounterStatusList encounterStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointStatusListObject(EndpointStatusList endpointStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeOfCareStatusListObject(EpisodeOfCareStatusList episodeOfCareStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCapabilityModeListObject(EventCapabilityModeList eventCapabilityModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTimingListObject(EventTimingList eventTimingListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplanationOfBenefitStatusListObject(ExplanationOfBenefitStatusList explanationOfBenefitStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionContextListObject(ExtensionContextList extensionContextListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryStatusListObject(FamilyHistoryStatusList familyHistoryStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterOperatorListObject(FilterOperatorList filterOperatorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagStatusListObject(FlagStatusList flagStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalStatusListObject(GoalStatusList goalStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupTypeListObject(GroupTypeList groupTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidanceResponseStatusListObject(GuidanceResponseStatusList guidanceResponseStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuideDependencyTypeListObject(GuideDependencyTypeList guideDependencyTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidePageKindListObject(GuidePageKindList guidePageKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerbListObject(HTTPVerbList httpVerbListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierUseListObject(IdentifierUseList identifierUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityAssuranceLevelListObject(IdentityAssuranceLevelList identityAssuranceLevelListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdPrimitive_Pattern(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MinLength(idPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdPrimitive_MaxLength(idPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] ID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9\\-\\.]{1,64}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_Pattern(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, ID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MinLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Id Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdPrimitive_MaxLength(String idPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = idPrimitive.length();
		boolean result = length <= 64;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(FhirPackage.eINSTANCE.getIdPrimitive(), idPrimitive, length, 64, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceAvailabilityListObject(InstanceAvailabilityList instanceAvailabilityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantPrimitive(XMLGregorianCalendar instantPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0]|([1-9][0-9]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitive_Pattern(int integerPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getIntegerPrimitive(), integerPrimitive, INTEGER_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPrimitiveObject(Integer integerPrimitiveObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerPrimitive_Pattern(integerPrimitiveObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueSeverityListObject(IssueSeverityList issueSeverityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueTypeListObject(IssueTypeList issueTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkageTypeListObject(LinkageTypeList linkageTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypeListObject(LinkTypeList linkTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListModeListObject(ListModeList listModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStatusListObject(ListStatusList listStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationModeListObject(LocationModeList locationModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationStatusListObject(LocationStatusList locationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkdownPrimitive_MinLength(markdownPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Markdown Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkdownPrimitive_MinLength(String markdownPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markdownPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getMarkdownPrimitive(), markdownPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasmntPrincipleListObject(MeasmntPrincipleList measmntPrincipleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureDataUsageListObject(MeasureDataUsageList measureDataUsageListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurePopulationTypeListObject(MeasurePopulationTypeList measurePopulationTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportStatusListObject(MeasureReportStatusList measureReportStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureReportTypeListObject(MeasureReportTypeList measureReportTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureScoringListObject(MeasureScoringList measureScoringListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureTypeListObject(MeasureTypeList measureTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationAdministrationStatusListObject(MedicationAdministrationStatusList medicationAdministrationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationDispenseStatusListObject(MedicationDispenseStatusList medicationDispenseStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestIntentListObject(MedicationRequestIntentList medicationRequestIntentListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestPriorityListObject(MedicationRequestPriorityList medicationRequestPriorityListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationRequestStatusListObject(MedicationRequestStatusList medicationRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementStatusListObject(MedicationStatementStatusList medicationStatementStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatementTakenListObject(MedicationStatementTakenList medicationStatementTakenListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusListObject(MedicationStatusList medicationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSignificanceCategoryListObject(MessageSignificanceCategoryList messageSignificanceCategoryListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameUseListObject(NameUseList nameUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemIdentifierTypeListObject(NamingSystemIdentifierTypeList namingSystemIdentifierTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingSystemTypeListObject(NamingSystemTypeList namingSystemTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeStatusListObject(NarrativeStatusList narrativeStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteTypeListObject(NoteTypeList noteTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionOrderStatusListObject(NutritionOrderStatusList nutritionOrderStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRelationshipTypeListObject(ObservationRelationshipTypeList observationRelationshipTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationStatusListObject(ObservationStatusList observationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOidPrimitive_Pattern(oidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateOidPrimitive_MinLength(oidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] OID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_Pattern(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, OID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Oid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOidPrimitive_MinLength(String oidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getOidPrimitive(), oidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationKindListObject(OperationKindList operationKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterUseListObject(OperationParameterUseList operationParameterUseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRequiredListObject(ParticipantRequiredList participantRequiredListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipationStatusListObject(ParticipationStatusList participationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveIntPrimitive_Pattern(positiveIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntPrimitive_Pattern(BigInteger positiveIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getPositiveIntPrimitive(), positiveIntPrimitive, POSITIVE_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureStatusListObject(ProcedureStatusList procedureStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyRepresentationListObject(PropertyRepresentationList propertyRepresentationListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeListObject(PropertyTypeList propertyTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceEntityRoleListObject(ProvenanceEntityRoleList provenanceEntityRoleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationStatusListObject(PublicationStatusList publicationStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityTypeListObject(QualityTypeList qualityTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityComparatorListObject(QuantityComparatorList quantityComparatorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireItemTypeListObject(QuestionnaireItemTypeList questionnaireItemTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseStatusListObject(QuestionnaireResponseStatusList questionnaireResponseStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireStatusListObject(QuestionnaireStatusList questionnaireStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceHandlingPolicyListObject(ReferenceHandlingPolicyList referenceHandlingPolicyListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceVersionRulesListObject(ReferenceVersionRulesList referenceVersionRulesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferralRequestStatusListObject(ReferralRequestStatusList referralRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedArtifactTypeListObject(RelatedArtifactTypeList relatedArtifactTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemittanceOutcomeListObject(RemittanceOutcomeList remittanceOutcomeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryTypeListObject(RepositoryTypeList repositoryTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchStudyStatusListObject(ResearchStudyStatusList researchStudyStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResearchSubjectStatusListObject(ResearchSubjectStatusList researchSubjectStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceVersionPolicyListObject(ResourceVersionPolicyList resourceVersionPolicyListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTypeListObject(ResponseTypeList responseTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestfulCapabilityModeListObject(RestfulCapabilityModeList restfulCapabilityModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSampledDataDataTypePrimitive_Pattern(sampledDataDataTypePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSampledDataDataTypePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((-{0,1}\\d*\\.{0,1}\\d+)|[EUL])( ((-{0,1}\\d*\\.{0,1}\\d+)|[EUL]))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Sampled Data Data Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledDataDataTypePrimitive_Pattern(String sampledDataDataTypePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getSampledDataDataTypePrimitive(), sampledDataDataTypePrimitive, SAMPLED_DATA_DATA_TYPE_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchComparatorListObject(SearchComparatorList searchComparatorListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchEntryModeListObject(SearchEntryModeList searchEntryModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchModifierCodeListObject(SearchModifierCodeList searchModifierCodeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSearchParamTypeListObject(SearchParamTypeList searchParamTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceTypeListObject(SequenceTypeList sequenceTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlicingRulesListObject(SlicingRulesList slicingRulesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotStatusListObject(SlotStatusList slotStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenStatusListObject(SpecimenStatusList specimenStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringPrimitive_MinLength(stringPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>String Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringPrimitive_MinLength(String stringPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = stringPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getStringPrimitive(), stringPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureDefinitionKindListObject(StructureDefinitionKindList structureDefinitionKindListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapContextTypeListObject(StructureMapContextTypeList structureMapContextTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapGroupTypeModeListObject(StructureMapGroupTypeModeList structureMapGroupTypeModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapInputModeListObject(StructureMapInputModeList structureMapInputModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapModelModeListObject(StructureMapModelModeList structureMapModelModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapSourceListModeListObject(StructureMapSourceListModeList structureMapSourceListModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTargetListModeListObject(StructureMapTargetListModeList structureMapTargetListModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructureMapTransformListObject(StructureMapTransformList structureMapTransformListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionChannelTypeListObject(SubscriptionChannelTypeList subscriptionChannelTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscriptionStatusListObject(SubscriptionStatusList subscriptionStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceStatusListObject(SubstanceStatusList substanceStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyDeliveryStatusListObject(SupplyDeliveryStatusList supplyDeliveryStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyRequestStatusListObject(SupplyRequestStatusList supplyRequestStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemRestfulInteractionListObject(SystemRestfulInteractionList systemRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemVersionProcessingModeListObject(SystemVersionProcessingModeList systemVersionProcessingModeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskStatusListObject(TaskStatusList taskStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportActionResultListObject(TestReportActionResultList testReportActionResultListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportParticipantTypeListObject(TestReportParticipantTypeList testReportParticipantTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportResultListObject(TestReportResultList testReportResultListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReportStatusListObject(TestReportStatusList testReportStatusListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePrimitive_Pattern(timePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimePrimitive_Pattern
	 */
	public static final  PatternMatcher [][] TIME_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitive_Pattern(XMLGregorianCalendar timePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getTimePrimitive(), timePrimitive, TIME_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeListObject(TriggerTypeList triggerTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDerivationRuleListObject(TypeDerivationRuleList typeDerivationRuleListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestfulInteractionListObject(TypeRestfulInteractionList typeRestfulInteractionListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsOfTimeListObject(UnitsOfTimeList unitsOfTimeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownContentCodeListObject(UnknownContentCodeList unknownContentCodeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(unsignedIntPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnsignedIntPrimitive_Pattern(unsignedIntPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0]|([1-9][0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Unsigned Int Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntPrimitive_Pattern(BigInteger unsignedIntPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUnsignedIntPrimitive(), unsignedIntPrimitive, UNSIGNED_INT_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriPrimitive(String uriPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseListObject(UseList useListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidPrimitive_Pattern(uuidPrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuidPrimitive_MinLength(uuidPrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidPrimitive_Pattern
	 */
	public static final  PatternMatcher [][] UUID_PRIMITIVE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_Pattern(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, UUID_PRIMITIVE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidPrimitive_MinLength(String uuidPrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuidPrimitive.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FhirPackage.eINSTANCE.getUuidPrimitive(), uuidPrimitive, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionBaseListObject(VisionBaseList visionBaseListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisionEyesListObject(VisionEyesList visionEyesListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathUsageTypeListObject(XPathUsageTypeList xPathUsageTypeListObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FhirValidator