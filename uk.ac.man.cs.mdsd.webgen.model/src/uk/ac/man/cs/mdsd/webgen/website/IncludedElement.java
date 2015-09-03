/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.criteria.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyGiveDefaultValueForSingletons canOnlyForceSingletonValues'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='not attribute.oclIsUndefined() implies\r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).cardinality = Cardinality::Required implies required\r\n\telse\r\n\t\tattribute.oclAsType(ViewAttribute).cardinality = Cardinality::Required implies required\r\n\tendif' canOnlyGiveDefaultValueForSingletons='not attribute.oclIsUndefined() and not defaultValue.oclIsUndefined() implies\r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tattribute.oclAsType(ViewAttribute).cardinality <> Cardinality::Many\r\n\tendif' canOnlyForceSingletonValues='not attribute.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tattribute.oclAsType(ViewAttribute).cardinality <> Cardinality::Many\r\n\tendif'"
 * @generated
 */
public interface IncludedElement extends IncludedFeature {

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement_ObfuscateFormFields()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
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
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);
} // IncludedElement
