/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.TestReportTeardownImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Report Teardown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestReport is a resource that includes summary information on the results of executing a TestScript.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestReportTeardown#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getTestReportTeardown()
 * @model extendedMetaData="name='TestReport.Teardown' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(TestReportTeardownImplAdapter.class)
public interface TestReportTeardown extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestReportAction2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The teardown action will only contain an operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getTestReportTeardown_Action()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	List<TestReportAction2> getAction();

} // TestReportTeardown
