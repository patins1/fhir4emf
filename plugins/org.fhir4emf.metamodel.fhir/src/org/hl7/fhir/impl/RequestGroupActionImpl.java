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
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Range;
import org.hl7.fhir.Reference;
import org.hl7.fhir.RelatedArtifact;
import org.hl7.fhir.RequestGroupAction;
import org.hl7.fhir.RequestGroupCondition;
import org.hl7.fhir.RequestGroupRelatedAction;
import org.hl7.fhir.Timing;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.DateTimeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Group Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getRelatedAction <em>Related Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTimingDuration <em>Timing Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTimingRange <em>Timing Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getSelectionBehavior <em>Selection Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getRequiredBehavior <em>Required Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getPrecheckBehavior <em>Precheck Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getCardinalityBehavior <em>Cardinality Behavior</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.RequestGroupActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "RequestGroupAction", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.RequestGroupAction")
public class RequestGroupActionImpl extends BackboneElementImpl implements RequestGroupAction {
	/**
	 * The cached value of the '{@link #getActionIdentifier() <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier actionIdentifier;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String textEquivalent;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> code;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedArtifact> documentation;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupCondition> condition;

	/**
	 * The cached value of the '{@link #getRelatedAction() <em>Related Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupRelatedAction> relatedAction;

	/**
	 * The cached value of the '{@link #getTimingDateTime() <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime timingDateTime;

	/**
	 * The cached value of the '{@link #getTimingPeriod() <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period timingPeriod;

	/**
	 * The cached value of the '{@link #getTimingDuration() <em>Timing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration timingDuration;

	/**
	 * The cached value of the '{@link #getTimingRange() <em>Timing Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingRange()
	 * @generated
	 * @ordered
	 */
	protected Range timingRange;

	/**
	 * The cached value of the '{@link #getTimingTiming() <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing timingTiming;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> participant;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getGroupingBehavior() <em>Grouping Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code groupingBehavior;

	/**
	 * The cached value of the '{@link #getSelectionBehavior() <em>Selection Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code selectionBehavior;

	/**
	 * The cached value of the '{@link #getRequiredBehavior() <em>Required Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code requiredBehavior;

	/**
	 * The cached value of the '{@link #getPrecheckBehavior() <em>Precheck Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecheckBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code precheckBehavior;

	/**
	 * The cached value of the '{@link #getCardinalityBehavior() <em>Cardinality Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityBehavior()
	 * @generated
	 * @ordered
	 */
	protected Code cardinalityBehavior;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Reference resource;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestGroupAction> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestGroupActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getRequestGroupAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getActionIdentifier() {
		return actionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionIdentifier(Identifier newActionIdentifier, NotificationChain msgs) {
		Identifier oldActionIdentifier = actionIdentifier;
		actionIdentifier = newActionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, oldActionIdentifier, newActionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionIdentifier(Identifier newActionIdentifier) {
		if (newActionIdentifier != actionIdentifier) {
			NotificationChain msgs = null;
			if (actionIdentifier != null)
				msgs = ((InternalEObject)actionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, null, msgs);
			if (newActionIdentifier != null)
				msgs = ((InternalEObject)newActionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, null, msgs);
			msgs = basicSetActionIdentifier(newActionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER, newActionIdentifier, newActionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(org.hl7.fhir.String newTextEquivalent, NotificationChain msgs) {
		org.hl7.fhir.String oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(org.hl7.fhir.String newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.REQUEST_GROUP_ACTION__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<RelatedArtifact> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<RelatedArtifact>(RelatedArtifact.class, this, FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<RequestGroupCondition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<RequestGroupCondition>(RequestGroupCondition.class, this, FhirPackage.REQUEST_GROUP_ACTION__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<RequestGroupRelatedAction> getRelatedAction() {
		if (relatedAction == null) {
			relatedAction = new EObjectContainmentEList<RequestGroupRelatedAction>(RequestGroupRelatedAction.class, this, FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION);
		}
		return relatedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(DateTimeImplAdapter.class)
	public DateTime getTimingDateTime() {
		return timingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDateTime(DateTime newTimingDateTime, NotificationChain msgs) {
		DateTime oldTimingDateTime = timingDateTime;
		timingDateTime = newTimingDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME, oldTimingDateTime, newTimingDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDateTime(DateTime newTimingDateTime) {
		if (newTimingDateTime != timingDateTime) {
			NotificationChain msgs = null;
			if (timingDateTime != null)
				msgs = ((InternalEObject)timingDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME, null, msgs);
			if (newTimingDateTime != null)
				msgs = ((InternalEObject)newTimingDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME, null, msgs);
			msgs = basicSetTimingDateTime(newTimingDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME, newTimingDateTime, newTimingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getTimingPeriod() {
		return timingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingPeriod(Period newTimingPeriod, NotificationChain msgs) {
		Period oldTimingPeriod = timingPeriod;
		timingPeriod = newTimingPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD, oldTimingPeriod, newTimingPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingPeriod(Period newTimingPeriod) {
		if (newTimingPeriod != timingPeriod) {
			NotificationChain msgs = null;
			if (timingPeriod != null)
				msgs = ((InternalEObject)timingPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD, null, msgs);
			if (newTimingPeriod != null)
				msgs = ((InternalEObject)newTimingPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD, null, msgs);
			msgs = basicSetTimingPeriod(newTimingPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD, newTimingPeriod, newTimingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimingDuration() {
		return timingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingDuration(Duration newTimingDuration, NotificationChain msgs) {
		Duration oldTimingDuration = timingDuration;
		timingDuration = newTimingDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION, oldTimingDuration, newTimingDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingDuration(Duration newTimingDuration) {
		if (newTimingDuration != timingDuration) {
			NotificationChain msgs = null;
			if (timingDuration != null)
				msgs = ((InternalEObject)timingDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION, null, msgs);
			if (newTimingDuration != null)
				msgs = ((InternalEObject)newTimingDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION, null, msgs);
			msgs = basicSetTimingDuration(newTimingDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION, newTimingDuration, newTimingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getTimingRange() {
		return timingRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingRange(Range newTimingRange, NotificationChain msgs) {
		Range oldTimingRange = timingRange;
		timingRange = newTimingRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE, oldTimingRange, newTimingRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingRange(Range newTimingRange) {
		if (newTimingRange != timingRange) {
			NotificationChain msgs = null;
			if (timingRange != null)
				msgs = ((InternalEObject)timingRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE, null, msgs);
			if (newTimingRange != null)
				msgs = ((InternalEObject)newTimingRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE, null, msgs);
			msgs = basicSetTimingRange(newTimingRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE, newTimingRange, newTimingRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getTimingTiming() {
		return timingTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingTiming(Timing newTimingTiming, NotificationChain msgs) {
		Timing oldTimingTiming = timingTiming;
		timingTiming = newTimingTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING, oldTimingTiming, newTimingTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimingTiming(Timing newTimingTiming) {
		if (newTimingTiming != timingTiming) {
			NotificationChain msgs = null;
			if (timingTiming != null)
				msgs = ((InternalEObject)timingTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING, null, msgs);
			if (newTimingTiming != null)
				msgs = ((InternalEObject)newTimingTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING, null, msgs);
			msgs = basicSetTimingTiming(newTimingTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING, newTimingTiming, newTimingTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getGroupingBehavior() {
		return groupingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupingBehavior(Code newGroupingBehavior, NotificationChain msgs) {
		Code oldGroupingBehavior = groupingBehavior;
		groupingBehavior = newGroupingBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, oldGroupingBehavior, newGroupingBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingBehavior(Code newGroupingBehavior) {
		if (newGroupingBehavior != groupingBehavior) {
			NotificationChain msgs = null;
			if (groupingBehavior != null)
				msgs = ((InternalEObject)groupingBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, null, msgs);
			if (newGroupingBehavior != null)
				msgs = ((InternalEObject)newGroupingBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, null, msgs);
			msgs = basicSetGroupingBehavior(newGroupingBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR, newGroupingBehavior, newGroupingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getSelectionBehavior() {
		return selectionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBehavior(Code newSelectionBehavior, NotificationChain msgs) {
		Code oldSelectionBehavior = selectionBehavior;
		selectionBehavior = newSelectionBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, oldSelectionBehavior, newSelectionBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBehavior(Code newSelectionBehavior) {
		if (newSelectionBehavior != selectionBehavior) {
			NotificationChain msgs = null;
			if (selectionBehavior != null)
				msgs = ((InternalEObject)selectionBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, null, msgs);
			if (newSelectionBehavior != null)
				msgs = ((InternalEObject)newSelectionBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, null, msgs);
			msgs = basicSetSelectionBehavior(newSelectionBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR, newSelectionBehavior, newSelectionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getRequiredBehavior() {
		return requiredBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBehavior(Code newRequiredBehavior, NotificationChain msgs) {
		Code oldRequiredBehavior = requiredBehavior;
		requiredBehavior = newRequiredBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, oldRequiredBehavior, newRequiredBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBehavior(Code newRequiredBehavior) {
		if (newRequiredBehavior != requiredBehavior) {
			NotificationChain msgs = null;
			if (requiredBehavior != null)
				msgs = ((InternalEObject)requiredBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			if (newRequiredBehavior != null)
				msgs = ((InternalEObject)newRequiredBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, null, msgs);
			msgs = basicSetRequiredBehavior(newRequiredBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR, newRequiredBehavior, newRequiredBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getPrecheckBehavior() {
		return precheckBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecheckBehavior(Code newPrecheckBehavior, NotificationChain msgs) {
		Code oldPrecheckBehavior = precheckBehavior;
		precheckBehavior = newPrecheckBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, oldPrecheckBehavior, newPrecheckBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecheckBehavior(Code newPrecheckBehavior) {
		if (newPrecheckBehavior != precheckBehavior) {
			NotificationChain msgs = null;
			if (precheckBehavior != null)
				msgs = ((InternalEObject)precheckBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			if (newPrecheckBehavior != null)
				msgs = ((InternalEObject)newPrecheckBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, null, msgs);
			msgs = basicSetPrecheckBehavior(newPrecheckBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR, newPrecheckBehavior, newPrecheckBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getCardinalityBehavior() {
		return cardinalityBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityBehavior(Code newCardinalityBehavior, NotificationChain msgs) {
		Code oldCardinalityBehavior = cardinalityBehavior;
		cardinalityBehavior = newCardinalityBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, oldCardinalityBehavior, newCardinalityBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityBehavior(Code newCardinalityBehavior) {
		if (newCardinalityBehavior != cardinalityBehavior) {
			NotificationChain msgs = null;
			if (cardinalityBehavior != null)
				msgs = ((InternalEObject)cardinalityBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			if (newCardinalityBehavior != null)
				msgs = ((InternalEObject)newCardinalityBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, null, msgs);
			msgs = basicSetCardinalityBehavior(newCardinalityBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR, newCardinalityBehavior, newCardinalityBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Reference newResource, NotificationChain msgs) {
		Reference oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Reference newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.REQUEST_GROUP_ACTION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.REQUEST_GROUP_ACTION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<RequestGroupAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<RequestGroupAction>(RequestGroupAction.class, this, FhirPackage.REQUEST_GROUP_ACTION__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				return basicSetActionIdentifier(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return ((InternalEList<?>)getRelatedAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME:
				return basicSetTimingDateTime(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD:
				return basicSetTimingPeriod(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION:
				return basicSetTimingDuration(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE:
				return basicSetTimingRange(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING:
				return basicSetTimingTiming(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				return basicSetGroupingBehavior(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				return basicSetSelectionBehavior(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				return basicSetRequiredBehavior(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				return basicSetPrecheckBehavior(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				return basicSetCardinalityBehavior(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				return getActionIdentifier();
			case FhirPackage.REQUEST_GROUP_ACTION__LABEL:
				return getLabel();
			case FhirPackage.REQUEST_GROUP_ACTION__TITLE:
				return getTitle();
			case FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				return getDescription();
			case FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				return getTextEquivalent();
			case FhirPackage.REQUEST_GROUP_ACTION__CODE:
				return getCode();
			case FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.REQUEST_GROUP_ACTION__CONDITION:
				return getCondition();
			case FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return getRelatedAction();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME:
				return getTimingDateTime();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD:
				return getTimingPeriod();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION:
				return getTimingDuration();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE:
				return getTimingRange();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING:
				return getTimingTiming();
			case FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				return getParticipant();
			case FhirPackage.REQUEST_GROUP_ACTION__TYPE:
				return getType();
			case FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				return getGroupingBehavior();
			case FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				return getSelectionBehavior();
			case FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				return getRequiredBehavior();
			case FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				return getPrecheckBehavior();
			case FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				return getCardinalityBehavior();
			case FhirPackage.REQUEST_GROUP_ACTION__RESOURCE:
				return getResource();
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION:
				return getAction();
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
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends RelatedArtifact>)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends RequestGroupCondition>)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				getRelatedAction().clear();
				getRelatedAction().addAll((Collection<? extends RequestGroupRelatedAction>)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD:
				setTimingPeriod((Period)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION:
				setTimingDuration((Duration)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE:
				setTimingRange((Range)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING:
				setTimingTiming((Timing)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__RESOURCE:
				setResource((Reference)newValue);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends RequestGroupAction>)newValue);
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
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				setActionIdentifier((Identifier)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				setTextEquivalent((org.hl7.fhir.String)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CODE:
				getCode().clear();
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				getRelatedAction().clear();
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME:
				setTimingDateTime((DateTime)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD:
				setTimingPeriod((Period)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION:
				setTimingDuration((Duration)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE:
				setTimingRange((Range)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING:
				setTimingTiming((Timing)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				setGroupingBehavior((Code)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				setSelectionBehavior((Code)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				setRequiredBehavior((Code)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				setPrecheckBehavior((Code)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				setCardinalityBehavior((Code)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__RESOURCE:
				setResource((Reference)null);
				return;
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION:
				getAction().clear();
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
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION_IDENTIFIER:
				return actionIdentifier != null;
			case FhirPackage.REQUEST_GROUP_ACTION__LABEL:
				return label != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TITLE:
				return title != null;
			case FhirPackage.REQUEST_GROUP_ACTION__DESCRIPTION:
				return description != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TEXT_EQUIVALENT:
				return textEquivalent != null;
			case FhirPackage.REQUEST_GROUP_ACTION__CODE:
				return code != null && !code.isEmpty();
			case FhirPackage.REQUEST_GROUP_ACTION__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case FhirPackage.REQUEST_GROUP_ACTION__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.REQUEST_GROUP_ACTION__RELATED_ACTION:
				return relatedAction != null && !relatedAction.isEmpty();
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DATE_TIME:
				return timingDateTime != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_PERIOD:
				return timingPeriod != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_DURATION:
				return timingDuration != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_RANGE:
				return timingRange != null;
			case FhirPackage.REQUEST_GROUP_ACTION__TIMING_TIMING:
				return timingTiming != null;
			case FhirPackage.REQUEST_GROUP_ACTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.REQUEST_GROUP_ACTION__TYPE:
				return type != null;
			case FhirPackage.REQUEST_GROUP_ACTION__GROUPING_BEHAVIOR:
				return groupingBehavior != null;
			case FhirPackage.REQUEST_GROUP_ACTION__SELECTION_BEHAVIOR:
				return selectionBehavior != null;
			case FhirPackage.REQUEST_GROUP_ACTION__REQUIRED_BEHAVIOR:
				return requiredBehavior != null;
			case FhirPackage.REQUEST_GROUP_ACTION__PRECHECK_BEHAVIOR:
				return precheckBehavior != null;
			case FhirPackage.REQUEST_GROUP_ACTION__CARDINALITY_BEHAVIOR:
				return cardinalityBehavior != null;
			case FhirPackage.REQUEST_GROUP_ACTION__RESOURCE:
				return resource != null;
			case FhirPackage.REQUEST_GROUP_ACTION__ACTION:
				return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestGroupActionImpl
