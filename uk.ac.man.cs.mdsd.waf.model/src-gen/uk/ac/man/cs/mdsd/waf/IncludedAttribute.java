/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.orm.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IncludedAttribute extends IncludedFeature {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#getAttribute <em>Attribute</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAttribute_ObfuscateFormFields()
	 * @model unique="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIncludedAttribute_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IncludedAttribute#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

} // IncludedAttribute
