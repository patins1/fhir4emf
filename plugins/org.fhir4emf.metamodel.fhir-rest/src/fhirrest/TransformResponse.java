/**
 */
package fhirrest;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import fhirrest.jaxb.TransformResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhirrest.TransformResponse#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see fhirrest.FhirrestPackage#getTransformResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TransformResponseImplAdapter.class)
public interface TransformResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see fhirrest.FhirrestPackage#getTransformResponse_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link fhirrest.TransformResponse#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // TransformResponse
