/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.EndpointStatusImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The status of the endpoint
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EndpointStatus#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEndpointStatus()
 * @model extendedMetaData="name='EndpointStatus' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(EndpointStatusImplAdapter.class)
public interface EndpointStatus extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.EndpointStatusList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.EndpointStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(EndpointStatusList)
	 * @see org.hl7.fhir.FhirPackage#getEndpointStatus_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	EndpointStatusList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EndpointStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.EndpointStatusList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EndpointStatusList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.EndpointStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(EndpointStatusList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.EndpointStatus#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(EndpointStatusList)
	 * @generated
	 */
	boolean isSetValue();

} // EndpointStatus
