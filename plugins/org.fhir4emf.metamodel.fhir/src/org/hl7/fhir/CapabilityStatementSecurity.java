/**
 */
package org.hl7.fhir;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.hl7.fhir.jaxb.CapabilityStatementSecurityImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSecurity#getCors <em>Cors</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSecurity#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSecurity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementSecurity#getCertificate <em>Certificate</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSecurity()
 * @model extendedMetaData="name='CapabilityStatement.Security' kind='elementOnly'"
 * @generated
 */
@XmlJavaTypeAdapter(CapabilityStatementSecurityImplAdapter.class)
public interface CapabilityStatementSecurity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Cors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Server adds CORS headers when responding to requests - this enables javascript applications to use the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cors</em>' containment reference.
	 * @see #setCors(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSecurity_Cors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cors' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getCors();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementSecurity#getCors <em>Cors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cors</em>' containment reference.
	 * @see #getCors()
	 * @generated
	 */
	void setCors(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of security services that are supported/required by the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSecurity_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CodeableConcept> getService();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General description of how security works.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSecurity_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementSecurity#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CapabilityStatementCertificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificates associated with security profiles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCapabilityStatementSecurity_Certificate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certificate' namespace='##targetNamespace'"
	 * @generated
	 */
	List<CapabilityStatementCertificate> getCertificate();

} // CapabilityStatementSecurity
