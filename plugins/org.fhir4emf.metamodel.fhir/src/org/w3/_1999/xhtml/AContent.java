/**
 */
package org.w3._1999.xhtml;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._1999.xhtml.jaxb.AContentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AContent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *       a elements use "Inline" excluding a
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.AContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getI <em>I</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getB <em>B</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.AContent#getSup <em>Sup</em>}</li>
 * </ul>
 *
 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent()
 * @model extendedMetaData="name='a.content' kind='mixed'"
 * @generated
 */
@XmlJavaTypeAdapter(AContentImplAdapter.class)
public interface AContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.BrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       forced line break
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<BrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.SpanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Bdo</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.BdoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       I18N BiDi over-ride
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bdo</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Bdo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bdo' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<BdoType> getBdo();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Map()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.ImgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<ImgType> getImg();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.TtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       fixed pitch font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<TtType> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.IType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       italic font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<IType> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.BType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bold font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<BType> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.BigType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bigger font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<BigType> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.SmallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       smaller font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<SmallType> getSmall();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.EmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<EmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.StrongType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       strong emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<StrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.DfnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       definitional
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<DfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       program code
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.QType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       inlined quote
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<QType> getQ();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.SampType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       sample
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<SampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.KbdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       something user would type
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<KbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.VarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       variable
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<VarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.CiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       citation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<CiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.AbbrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       abbreviation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<AbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.AcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       acronym
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<AcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.SubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       subscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<SubType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._1999.xhtml.SupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       superscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.w3._1999.xhtml.XhtmlPackage#getAContent_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	List<SupType> getSup();

} // AContent
