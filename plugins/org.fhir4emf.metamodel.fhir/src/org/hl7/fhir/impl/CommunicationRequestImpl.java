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

import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRequestedOn <em>Requested On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getScheduledDateTime <em>Scheduled Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getScheduledPeriod <em>Scheduled Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestImpl#getReason <em>Reason</em>}</li>
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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept priority;

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
	 * The cached value of the '{@link #getRequestedOn() <em>Requested On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime requestedOn;

	/**
	 * The cached value of the '{@link #getScheduledDateTime() <em>Scheduled Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime scheduledDateTime;

	/**
	 * The cached value of the '{@link #getScheduledPeriod() <em>Scheduled Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period scheduledPeriod;

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
	protected Reference requester;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reason;

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
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	@XmlElement(required = true)
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
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
	public void setStatus(Code newStatus) {
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
	public CodeableConcept getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(CodeableConcept newPriority, NotificationChain msgs) {
		CodeableConcept oldPriority = priority;
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
	public void setPriority(CodeableConcept newPriority) {
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
	public DateTime getRequestedOn() {
		return requestedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestedOn(DateTime newRequestedOn, NotificationChain msgs) {
		DateTime oldRequestedOn = requestedOn;
		requestedOn = newRequestedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON, oldRequestedOn, newRequestedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedOn(DateTime newRequestedOn) {
		if (newRequestedOn != requestedOn) {
			NotificationChain msgs = null;
			if (requestedOn != null)
				msgs = ((InternalEObject)requestedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON, null, msgs);
			if (newRequestedOn != null)
				msgs = ((InternalEObject)newRequestedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON, null, msgs);
			msgs = basicSetRequestedOn(newRequestedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON, newRequestedOn, newRequestedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getScheduledDateTime() {
		return scheduledDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledDateTime(DateTime newScheduledDateTime, NotificationChain msgs) {
		DateTime oldScheduledDateTime = scheduledDateTime;
		scheduledDateTime = newScheduledDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME, oldScheduledDateTime, newScheduledDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDateTime(DateTime newScheduledDateTime) {
		if (newScheduledDateTime != scheduledDateTime) {
			NotificationChain msgs = null;
			if (scheduledDateTime != null)
				msgs = ((InternalEObject)scheduledDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME, null, msgs);
			if (newScheduledDateTime != null)
				msgs = ((InternalEObject)newScheduledDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME, null, msgs);
			msgs = basicSetScheduledDateTime(newScheduledDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME, newScheduledDateTime, newScheduledDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getScheduledPeriod() {
		return scheduledPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledPeriod(Period newScheduledPeriod, NotificationChain msgs) {
		Period oldScheduledPeriod = scheduledPeriod;
		scheduledPeriod = newScheduledPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD, oldScheduledPeriod, newScheduledPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledPeriod(Period newScheduledPeriod) {
		if (newScheduledPeriod != scheduledPeriod) {
			NotificationChain msgs = null;
			if (scheduledPeriod != null)
				msgs = ((InternalEObject)scheduledPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD, null, msgs);
			if (newScheduledPeriod != null)
				msgs = ((InternalEObject)newScheduledPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD, null, msgs);
			msgs = basicSetScheduledPeriod(newScheduledPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD, newScheduledPeriod, newScheduledPeriod));
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
	public Reference getRequester() {
		return requester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequester(Reference newRequester, NotificationChain msgs) {
		Reference oldRequester = requester;
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
	public void setRequester(Reference newRequester) {
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
	public List<CodeableConcept> getReason() {
		if (reason == null) {
			reason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.COMMUNICATION_REQUEST__REASON);
		}
		return reason;
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
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				return basicSetRequestedOn(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME:
				return basicSetScheduledDateTime(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD:
				return basicSetScheduledPeriod(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return basicSetSender(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return basicSetRequester(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return ((InternalEList<?>)getReason()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return getStatus();
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return getPriority();
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return getCategory();
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
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				return getRequestedOn();
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME:
				return getScheduledDateTime();
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD:
				return getScheduledPeriod();
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return getSender();
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return getRequester();
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return getReason();
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
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				setRequestedOn((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Reference)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				getReason().clear();
				getReason().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				setPriority((CodeableConcept)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				getCategory().clear();
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
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				setRequestedOn((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME:
				setScheduledDateTime((DateTime)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD:
				setScheduledPeriod((Period)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				setSender((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				setRequester((Reference)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				getReason().clear();
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
			case FhirPackage.COMMUNICATION_REQUEST__STATUS:
				return status != null;
			case FhirPackage.COMMUNICATION_REQUEST__PRIORITY:
				return priority != null;
			case FhirPackage.COMMUNICATION_REQUEST__CATEGORY:
				return category != null && !category.isEmpty();
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
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTED_ON:
				return requestedOn != null;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_DATE_TIME:
				return scheduledDateTime != null;
			case FhirPackage.COMMUNICATION_REQUEST__SCHEDULED_PERIOD:
				return scheduledPeriod != null;
			case FhirPackage.COMMUNICATION_REQUEST__SENDER:
				return sender != null;
			case FhirPackage.COMMUNICATION_REQUEST__REQUESTER:
				return requester != null;
			case FhirPackage.COMMUNICATION_REQUEST__REASON:
				return reason != null && !reason.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestImpl
