/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.TestScriptRule3ImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Rule3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptRule3#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptRule3#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestScriptRule3()
 * @model extendedMetaData="name='TestScript.Rule3' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(TestScriptRule3ImplAdapter.class)
public interface TestScriptRule3 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Rule Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the referenced rule within the external ruleset template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Id</em>' containment reference.
	 * @see #setRuleId(Id)
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule3_RuleId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruleId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getRuleId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptRule3#getRuleId <em>Rule Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Id</em>' containment reference.
	 * @see #getRuleId()
	 * @generated
	 */
	void setRuleId(Id value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestScriptParam3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each rule template can take one or more parameters for rule evaluation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestScriptRule3_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	List<TestScriptParam3> getParam();

} // TestScriptRule3
