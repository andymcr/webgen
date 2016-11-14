/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.expression.Expression;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getMustMatch <em>Must Match</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInputClass <em>Input Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField()
 * @model abstract="true"
 * @generated
 */
public interface InterfaceField extends NamedElement, UnitField {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Must Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Match</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Match</em>' reference.
	 * @see #setMustMatch(UnitField)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_MustMatch()
	 * @model
	 * @generated
	 */
	UnitField getMustMatch();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getMustMatch <em>Must Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Match</em>' reference.
	 * @see #getMustMatch()
	 * @generated
	 */
	void setMustMatch(UnitField value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_InterfaceType()
	 * @model unique="false"
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_Placeholder()
	 * @model unique="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Pattern</em>' attribute.
	 * @see #setValidationPattern(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_ValidationPattern()
	 * @model unique="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getInterfaceField_InputClass()
	 * @model unique="false"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.InterfaceField#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

} // InterfaceField
