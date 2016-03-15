/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature()
 * @model
 * @generated
 */
public interface ServiceFeature extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Service#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_PartOf()
	 * @see uk.ac.man.cs.mdsd.waf.Service#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Service getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Service value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_Cardinality()
	 * @model unique="false"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Value</em>' containment reference.
	 * @see #setForcedValue(Expression)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_ForcedValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getForcedValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getForcedValue <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced Value</em>' containment reference.
	 * @see #getForcedValue()
	 * @generated
	 */
	void setForcedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_Footer()
	 * @model unique="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_HeaderClass()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_InputClass()
	 * @model unique="false"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_DisplayClass()
	 * @model unique="false"
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_FooterClass()
	 * @model unique="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // ServiceFeature
