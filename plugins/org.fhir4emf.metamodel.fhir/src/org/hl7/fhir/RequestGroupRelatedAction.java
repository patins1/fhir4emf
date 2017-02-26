/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.RequestGroupRelatedActionImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Group Related Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RequestGroupRelatedAction#getActionIdentifier <em>Action Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestGroupRelatedAction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestGroupRelatedAction#getOffsetDuration <em>Offset Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.RequestGroupRelatedAction#getOffsetRange <em>Offset Range</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getRequestGroupRelatedAction()
 * @model extendedMetaData="name='RequestGroup.RelatedAction' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(RequestGroupRelatedActionImplAdapter.class)
public interface RequestGroupRelatedAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Identifier</em>' containment reference.
	 * @see #setActionIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getRequestGroupRelatedAction_ActionIdentifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actionIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getActionIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestGroupRelatedAction#getActionIdentifier <em>Action Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Identifier</em>' containment reference.
	 * @see #getActionIdentifier()
	 * @generated
	 */
	void setActionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of this action to the related action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Code)
	 * @see org.hl7.fhir.FhirPackage#getRequestGroupRelatedAction_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestGroupRelatedAction#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Code value);

	/**
	 * Returns the value of the '<em><b>Offset Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Duration</em>' containment reference.
	 * @see #setOffsetDuration(Duration)
	 * @see org.hl7.fhir.FhirPackage#getRequestGroupRelatedAction_OffsetDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOffsetDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestGroupRelatedAction#getOffsetDuration <em>Offset Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Duration</em>' containment reference.
	 * @see #getOffsetDuration()
	 * @generated
	 */
	void setOffsetDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Offset Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before. (choose any one of offset*, but only one)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Range</em>' containment reference.
	 * @see #setOffsetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getRequestGroupRelatedAction_OffsetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getOffsetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequestGroupRelatedAction#getOffsetRange <em>Offset Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Range</em>' containment reference.
	 * @see #getOffsetRange()
	 * @generated
	 */
	void setOffsetRange(Range value);

} // RequestGroupRelatedAction