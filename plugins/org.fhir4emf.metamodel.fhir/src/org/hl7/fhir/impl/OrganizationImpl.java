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

import org.hl7.fhir.Address;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Organization;
import org.hl7.fhir.OrganizationContact;
import org.hl7.fhir.Reference;
import org.hl7.fhir.jaxb.BooleanImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.OrganizationImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "Organization", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.Organization")
public class OrganizationImpl extends DomainResourceImpl implements Organization {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean active;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> alias;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> address;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Reference partOf;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationContact> contact;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ORGANIZATION__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(BooleanImplAdapter.class)
	public org.hl7.fhir.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.hl7.fhir.Boolean newActive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(org.hl7.fhir.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ORGANIZATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement
	public List<org.hl7.fhir.String> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.ORGANIZATION__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.ORGANIZATION__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Address> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<Address>(Address.class, this, FhirPackage.ORGANIZATION__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Reference newPartOf, NotificationChain msgs) {
		Reference oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__PART_OF, oldPartOf, newPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Reference newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__PART_OF, null, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ORGANIZATION__PART_OF, null, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ORGANIZATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<OrganizationContact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<OrganizationContact>(OrganizationContact.class, this, FhirPackage.ORGANIZATION__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<Reference> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.ORGANIZATION__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ORGANIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__ACTIVE:
				return basicSetActive(null, msgs);
			case FhirPackage.ORGANIZATION__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ORGANIZATION__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case FhirPackage.ORGANIZATION__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case FhirPackage.ORGANIZATION__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ORGANIZATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ORGANIZATION__ACTIVE:
				return getActive();
			case FhirPackage.ORGANIZATION__TYPE:
				return getType();
			case FhirPackage.ORGANIZATION__NAME:
				return getName();
			case FhirPackage.ORGANIZATION__ALIAS:
				return getAlias();
			case FhirPackage.ORGANIZATION__TELECOM:
				return getTelecom();
			case FhirPackage.ORGANIZATION__ADDRESS:
				return getAddress();
			case FhirPackage.ORGANIZATION__PART_OF:
				return getPartOf();
			case FhirPackage.ORGANIZATION__CONTACT:
				return getContact();
			case FhirPackage.ORGANIZATION__ENDPOINT:
				return getEndpoint();
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
			case FhirPackage.ORGANIZATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ORGANIZATION__ACTIVE:
				setActive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ORGANIZATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ORGANIZATION__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ORGANIZATION__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.ORGANIZATION__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.ORGANIZATION__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends Address>)newValue);
				return;
			case FhirPackage.ORGANIZATION__PART_OF:
				setPartOf((Reference)newValue);
				return;
			case FhirPackage.ORGANIZATION__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends OrganizationContact>)newValue);
				return;
			case FhirPackage.ORGANIZATION__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.ORGANIZATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ORGANIZATION__ACTIVE:
				setActive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ORGANIZATION__TYPE:
				getType().clear();
				return;
			case FhirPackage.ORGANIZATION__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ORGANIZATION__ALIAS:
				getAlias().clear();
				return;
			case FhirPackage.ORGANIZATION__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.ORGANIZATION__ADDRESS:
				getAddress().clear();
				return;
			case FhirPackage.ORGANIZATION__PART_OF:
				setPartOf((Reference)null);
				return;
			case FhirPackage.ORGANIZATION__CONTACT:
				getContact().clear();
				return;
			case FhirPackage.ORGANIZATION__ENDPOINT:
				getEndpoint().clear();
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
			case FhirPackage.ORGANIZATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ORGANIZATION__ACTIVE:
				return active != null;
			case FhirPackage.ORGANIZATION__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.ORGANIZATION__NAME:
				return name != null;
			case FhirPackage.ORGANIZATION__ALIAS:
				return alias != null && !alias.isEmpty();
			case FhirPackage.ORGANIZATION__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.ORGANIZATION__ADDRESS:
				return address != null && !address.isEmpty();
			case FhirPackage.ORGANIZATION__PART_OF:
				return partOf != null;
			case FhirPackage.ORGANIZATION__CONTACT:
				return contact != null && !contact.isEmpty();
			case FhirPackage.ORGANIZATION__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
