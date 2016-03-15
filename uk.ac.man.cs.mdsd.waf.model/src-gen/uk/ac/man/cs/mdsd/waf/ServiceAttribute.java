/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.orm.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute()
 * @model
 * @generated
 */
public interface ServiceAttribute extends ServiceFeature {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_InterfaceType()
	 * @model unique="false"
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getInterfaceType <em>Interface Type</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_Placeholder()
	 * @model unique="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getPlaceholder <em>Placeholder</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_ValidationPattern()
	 * @model unique="false"
	 * @generated
	 */
	String getValidationPattern();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getValidationPattern <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Pattern</em>' attribute.
	 * @see #getValidationPattern()
	 * @generated
	 */
	void setValidationPattern(String value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_DateFormat()
	 * @model unique="false"
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_ObfuscateFormFields()
	 * @model unique="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #isObfuscateFormFields()
	 * @generated
	 */
	void setObfuscateFormFields(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttribute_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttribute#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

} // ServiceAttribute
