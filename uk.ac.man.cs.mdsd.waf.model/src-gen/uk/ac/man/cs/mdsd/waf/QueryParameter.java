/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

import uk.ac.man.cs.mdsd.service.FormalParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getFormal <em>Formal</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQueryParameter()
 * @model
 * @generated
 */
public interface QueryParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(FormalParameter)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQueryParameter_Formal()
	 * @model required="true"
	 * @generated
	 */
	FormalParameter getFormal();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(FormalParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQueryParameter_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.QueryParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // QueryParameter
