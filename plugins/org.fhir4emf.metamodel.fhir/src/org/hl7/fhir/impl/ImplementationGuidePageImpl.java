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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.ImplementationGuidePage;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.Uri;
import org.hl7.fhir.jaxb.CodeImplAdapter;
import org.hl7.fhir.jaxb.GuidePageKindImplAdapter;
import org.hl7.fhir.jaxb.ResourceTypeImplAdapter;
import org.hl7.fhir.jaxb.StringImplAdapter;
import org.hl7.fhir.jaxb.UriImplAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuidePageImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
@XmlType(name = "ImplementationGuidePage", namespace = "http://hl7.org/fhir")
@XmlRootElement(name = "fhir.ImplementationGuidePage")
public class ImplementationGuidePageImpl extends BackboneElementImpl implements ImplementationGuidePage {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GuidePageKind kind;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> type;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> package_;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Code format;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuidePage> page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuidePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuidePage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(UriImplAdapter.class)
	@XmlElement(required = true)
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement(required = true)
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(GuidePageKindImplAdapter.class)
	@XmlElement(required = true)
	public GuidePageKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(GuidePageKind newKind, NotificationChain msgs) {
		GuidePageKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(GuidePageKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(ResourceTypeImplAdapter.class)
	@XmlElement
	public List<ResourceType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(StringImplAdapter.class)
	@XmlElement
	public List<org.hl7.fhir.String> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlJavaTypeAdapter(CodeImplAdapter.class)
	public Code getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(Code newFormat, NotificationChain msgs) {
		Code oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT, oldFormat, newFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(Code newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT, newFormat, newFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	public List<ImplementationGuidePage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuidePage>(ImplementationGuidePage.class, this, FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT:
				return basicSetFormat(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE:
				return getSource();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return getTitle();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND:
				return getKind();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE:
				return getType();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE:
				return getPackage();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT:
				return getFormat();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return getPage();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE:
				setSource((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND:
				setKind((GuidePageKind)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT:
				setFormat((Code)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuidePage>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE:
				setSource((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND:
				setKind((GuidePageKind)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE:
				getType().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE:
				getPackage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT:
				setFormat((Code)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				getPage().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__SOURCE:
				return source != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TITLE:
				return title != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__KIND:
				return kind != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__FORMAT:
				return format != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_PAGE__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuidePageImpl
