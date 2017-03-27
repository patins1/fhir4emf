/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.CommunicationRequestRequester;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RequestPriority;
import org.hl7.fhir.RequestStatus;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.RequestPriorityImplAdapter;
import org.hl7.fhir.jaxb.RequestStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getReasonReference <em>Reason Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "CommunicationRequest", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.CommunicationRequest")
public class CommunicationRequestImpl extends DomainResourceImpl implements CommunicationRequest {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getBasedOn() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOn;

	/**
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> replaces;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier groupIdentifier;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RequestStatus status;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> category;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected RequestPriority priority;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> medium;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> recipient;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> topic;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Reference context;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationRequestPayload> payload;

	/**
	 * The cached value of the '{@link #getOccurrenceDateTime() <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime occurrenceDateTime;

	/**
	 * The cached value of the '{@link #getOccurrencePeriod() <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period occurrencePeriod;

	/**
	 * The cached value of the '{@link #getAuthoredOn() <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime authoredOn;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Reference sender;

	/**
	 * The cached value of the '{@link #getRequester() <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequester()
	 * @generated
	 * @ordered
	 */
	protected CommunicationRequestRequester requester;

	/**
	 * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCode;

	/**
	 * The cached value of the '{@link #getReasonReference() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReference;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunicationRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getBasedOn() {
		if (basedOn == null) {
			basedOn = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__BASED_ON);
		}
		return basedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupIdentifier(Identifier newGroupIdentifier, NotificationChain msgs) {
		Identifier oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER, oldGroupIdentifier, newGroupIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(Identifier newGroupIdentifier) {
		if (newGroupIdentifier != groupIdentifier) {
			NotificationChain msgs = null;
			if (groupIdentifier != null)
				msgs = ((InternalEObject)groupIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			if (newGroupIdentifier != null)
				msgs = ((InternalEObject)newGroupIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER, null, msgs);
			msgs = basicSetGroupIdentifier(newGroupIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER, newGroupIdentifier, newGroupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(RequestStatusImplAdapter.class)
	@XmlElement(required = true)
	public RequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(RequestStatus newStatus, NotificationChain msgs) {
		RequestStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(RequestStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(RequestPriorityImplAdapter.class)
	public RequestPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(RequestPriority newPriority, NotificationChain msgs) {
		RequestPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(RequestPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getRecipient() {
		if (recipient == null) {
			recipient = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__RECIPIENT);
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Reference newContext, NotificationChain msgs) {
		Reference oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Reference newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CommunicationRequestPayload> getPayload() {
		if (payload == null) {
			payload = new EObjectContainmentEList<CommunicationRequestPayload>(CommunicationRequestPayload.class, this, FhirPackage.COMMUNICATION_REQUEST__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getOccurrenceDateTime() {
		return occurrenceDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceDateTime(DateTime newOccurrenceDateTime, NotificationChain msgs) {
		DateTime oldOccurrenceDateTime = occurrenceDateTime;
		occurrenceDateTime = newOccurrenceDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME, oldOccurrenceDateTime, newOccurrenceDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceDateTime(DateTime newOccurrenceDateTime) {
		if (newOccurrenceDateTime != occurrenceDateTime) {
			NotificationChain msgs = null;
			if (occurrenceDateTime != null)
				msgs = ((InternalEObject)occurrenceDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			if (newOccurrenceDateTime != null)
				msgs = ((InternalEObject)newOccurrenceDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME, null, msgs);
			msgs = basicSetOccurrenceDateTime(newOccurrenceDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME, newOccurrenceDateTime, newOccurrenceDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getOccurrencePeriod() {
		return occurrencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencePeriod(Period newOccurrencePeriod, NotificationChain msgs) {
		Period oldOccurrencePeriod = occurrencePeriod;
		occurrencePeriod = newOccurrencePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD, oldOccurrencePeriod, newOccurrencePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrencePeriod(Period newOccurrencePeriod) {
		if (newOccurrencePeriod != occurrencePeriod) {
			NotificationChain msgs = null;
			if (occurrencePeriod != null)
				msgs = ((InternalEObject)occurrencePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			if (newOccurrencePeriod != null)
				msgs = ((InternalEObject)newOccurrencePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD, null, msgs);
			msgs = basicSetOccurrencePeriod(newOccurrencePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD, newOccurrencePeriod, newOccurrencePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getAuthoredOn() {
		return authoredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoredOn(DateTime newAuthoredOn, NotificationChain msgs) {
		DateTime oldAuthoredOn = authoredOn;
		authoredOn = newAuthoredOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON, oldAuthoredOn, newAuthoredOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoredOn(DateTime newAuthoredOn) {
		if (newAuthoredOn != authoredOn) {
			NotificationChain msgs = null;
			if (authoredOn != null)
				msgs = ((InternalEObject)authoredOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON, null, msgs);
			if (newAuthoredOn != null)
				msgs = ((InternalEObject)newAuthoredOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON, null, msgs);
			msgs = basicSetAuthoredOn(newAuthoredOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON, newAuthoredOn, newAuthoredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Reference newSender, NotificationChain msgs) {
		Reference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Reference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequestRequester getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(CommunicationRequestRequester newRequester, NotificationChain msgs) {
		CommunicationRequestRequester oldRequester = requester;
		requester = newRequester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTER, oldRequester, newRequester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequester(CommunicationRequestRequester newRequester) {
		if (newRequester != requester) {
			NotificationChain msgs = null;
			if (requester != null)
				msgs = ((InternalEObject)requester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTER, null, msgs);
			if (newRequester != null)
				msgs = ((InternalEObject)newRequester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTER, null, msgs);
			msgs = basicSetRequester(newRequester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTER, newRequester, newRequester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getReasonCode() {
		if (reasonCode == null) {
			reasonCode = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__REASON_CODE);
		}
		return reasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getReasonReference() {
		if (reasonReference == null) {
			reasonReference = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE);
		}
		return reasonReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.COMMUNICATION_REQUEST__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__BASED_ON:
				return ((InternalEList<?>)getBasedOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REPLACES:
				return ((InternalEList<?>)getReplaces()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER:
				return basicSetGroupIdentifier(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return ((InternalEList<?>)getRecipient()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__CONTEXT:
				return basicSetContext(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return ((InternalEList<?>)getPayload()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME:
				return basicSetOccurrenceDateTime(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD:
				return basicSetOccurrencePeriod(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON:
				return basicSetAuthoredOn(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return basicSetSender(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REASON_CODE:
				return ((InternalEList<?>)getReasonCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReference()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COMMUNICATION_REQUEST__BASED_ON:
				return getBasedOn();
			case FhirPackage.COMMUNICATION_REQUEST__REPLACES:
				return getReplaces();
			case FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER:
				return getGroupIdentifier();
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return getCategory();
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return getMedium();
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return getSubject();
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return getRecipient();
			case FhirPackage.COMMUNICATION_REQUEST__TOPIC:
				return getTopic();
			case FhirPackage.COMMUNICATION_REQUEST__CONTEXT:
				return getContext();
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return getPayload();
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME:
				return getOccurrenceDateTime();
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD:
				return getOccurrencePeriod();
			case FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON:
				return getAuthoredOn();
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return getSender();
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.COMMUNICATION_REQUEST__REASON_CODE:
				return getReasonCode();
			case FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE:
				return getReasonReference();
			case FhirPackage.COMMUNICATION_REQUEST__NOTE:
				return getNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				getBasedOn().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((RequestStatus)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((RequestPriority)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipient().clear();
				getRecipient().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CONTEXT:
				setContext((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends CommunicationRequestPayload>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((CommunicationRequestRequester)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON_CODE:
				getReasonCode().clear();
				getReasonCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				getReasonReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__BASED_ON:
				getBasedOn().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REPLACES:
				getReplaces().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER:
				setGroupIdentifier((Identifier)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((RequestStatus)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				getCategory().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((RequestPriority)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				getMedium().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				getRecipient().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__TOPIC:
				getTopic().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CONTEXT:
				setContext((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				getPayload().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME:
				setOccurrenceDateTime((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD:
				setOccurrencePeriod((Period)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON:
				setAuthoredOn((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((CommunicationRequestRequester)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON_CODE:
				getReasonCode().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE:
				getReasonReference().clear();
				return;
			case FhirPackage.COMMUNICATION_REQUEST__NOTE:
				getNote().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__BASED_ON:
				return basedOn != null && !basedOn.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__GROUP_IDENTIFIER:
				return groupIdentifier != null;
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return status != null;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return category != null && !category.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.COMMUNICATION_REQUEST__MEDIUM:
				return medium != null && !medium.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__SUBJECT:
				return subject != null;
			case FhirPackage.COMMUNICATION_REQUEST__RECIPIENT:
				return recipient != null && !recipient.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__TOPIC:
				return topic != null && !topic.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__CONTEXT:
				return context != null;
			case FhirPackage.COMMUNICATION_REQUEST__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_DATE_TIME:
				return occurrenceDateTime != null;
			case FhirPackage.COMMUNICATION_REQUEST__OCCURRENCE_PERIOD:
				return occurrencePeriod != null;
			case FhirPackage.COMMUNICATION_REQUEST__AUTHORED_ON:
				return authoredOn != null;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return sender != null;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.COMMUNICATION_REQUEST__REASON_CODE:
				return reasonCode != null && !reasonCode.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__REASON_REFERENCE:
				return reasonReference != null && !reasonReference.isEmpty();
			case FhirPackage.COMMUNICATION_REQUEST__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestImpl
