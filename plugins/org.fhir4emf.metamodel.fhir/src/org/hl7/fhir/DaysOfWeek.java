/**
 */
package org.hl7.fhir;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.DaysOfWeekImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Days Of Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The days of the week.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DaysOfWeek#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDaysOfWeek()
 * @model extendedMetaData="name='DaysOfWeek' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(DaysOfWeekImplAdapter.class)
public interface DaysOfWeek extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.DaysOfWeekList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DaysOfWeekList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(DaysOfWeekList)
	 * @see org.hl7.fhir.FhirPackage#getDaysOfWeek_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	DaysOfWeekList getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DaysOfWeek#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.DaysOfWeekList
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DaysOfWeekList value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.DaysOfWeek#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(DaysOfWeekList)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.DaysOfWeek#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(DaysOfWeekList)
	 * @generated
	 */
	boolean isSetValue();

} // DaysOfWeek
