/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.MedicationRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getMedicationReference <em>Medication Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getDosageInstruction <em>Dosage Instruction</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getDetectedIssue <em>Detected Issue</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequest#getEventHistory <em>Event History</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicationRequest()
 * @model extendedMetaData="name='MedicationRequest' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(MedicationRequestImplAdapter.class)
public interface MedicationRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This records identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. For example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records must be tracked through an entire system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol or definition followed by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getDefinition();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan or request that is fulfilled in whole or in part by this medication request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Identifier</em>' containment reference.
	 * @see #setGroupIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_GroupIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getGroupIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getGroupIdentifier <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' containment reference.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code specifying the current state of the order.  Generally this will be active or completed state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(MedicationRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MedicationRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the request is a proposal, plan, or an original order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(MedicationRequestIntent)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Intent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intent' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestIntent getIntent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(MedicationRequestIntent value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of medication order and where the medication is expected to be consumed or administered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly the Medication Request should be addressed with respect to other requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(MedicationRequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(MedicationRequestPriority value);

	/**
	 * Returns the value of the '<em><b>Medication Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications. (choose any one of medication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #setMedicationCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_MedicationCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMedicationCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getMedicationCodeableConcept <em>Medication Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Codeable Concept</em>' containment reference.
	 * @see #getMedicationCodeableConcept()
	 * @generated
	 */
	void setMedicationCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Medication Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the medication being requested. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications. (choose any one of medication*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Reference</em>' containment reference.
	 * @see #setMedicationReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_MedicationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='medicationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMedicationReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getMedicationReference <em>Medication Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Reference</em>' containment reference.
	 * @see #getMedicationReference()
	 * @generated
	 */
	void setMedicationReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing the person or set of individuals to whom the medication will be given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to an encounter, or episode of care, that identifies the particular occurrence or set occurrences of contact between patient and health care provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Reference value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Include additional information (for example, patient height and weight) that supports the ordering of the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date (and perhaps time) when the prescription was initially written or authored on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, organization or device that initiated the request and has responsibility for its activation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(MedicationRequestRequester)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestRequester getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(MedicationRequestRequester value);

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Recorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recorder' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRecorder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(Reference value);

	/**
	 * Returns the value of the '<em><b>Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason or the indication for ordering the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_ReasonCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonCode' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getReasonCode();

	/**
	 * Returns the value of the '<em><b>Reason Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition or observation that supports why the medication was ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_ReasonReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reasonReference' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getReasonReference();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra information about the prescription that could not be conveyed by the other attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Annotation> getNote();

	/**
	 * Returns the value of the '<em><b>Dosage Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Dosage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the medication is to be used by the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dosage Instruction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_DosageInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dosageInstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Dosage> getDosageInstruction();

	/**
	 * Returns the value of the '<em><b>Dispense Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispense Request</em>' containment reference.
	 * @see #setDispenseRequest(MedicationRequestDispenseRequest)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_DispenseRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dispenseRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestDispenseRequest getDispenseRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getDispenseRequest <em>Dispense Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense Request</em>' containment reference.
	 * @see #getDispenseRequest()
	 * @generated
	 */
	void setDispenseRequest(MedicationRequestDispenseRequest value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference.
	 * @see #setSubstitution(MedicationRequestSubstitution)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationRequestSubstitution getSubstitution();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getSubstitution <em>Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution</em>' containment reference.
	 * @see #getSubstitution()
	 * @generated
	 */
	void setSubstitution(MedicationRequestSubstitution value);

	/**
	 * Returns the value of the '<em><b>Prior Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to a resource representing an earlier order related order or prescription.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #setPriorPrescription(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_PriorPrescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priorPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPriorPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequest#getPriorPrescription <em>Prior Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Prescription</em>' containment reference.
	 * @see #getPriorPrescription()
	 * @generated
	 */
	void setPriorPrescription(Reference value);

	/**
	 * Returns the value of the '<em><b>Detected Issue</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected Issue</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_DetectedIssue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detectedIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getDetectedIssue();

	/**
	 * Returns the value of the '<em><b>Event History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicationRequest_EventHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eventHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Reference> getEventHistory();

} // MedicationRequest
