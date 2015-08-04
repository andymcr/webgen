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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getFeature <em>Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyGiveDefaultValueForSingletons canOnlyForceSingletonValues'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='not feature.oclIsUndefined()\r\n\timplies feature.cardinality = Cardinality::Required implies required' canOnlyGiveDefaultValueForSingletons='not feature.oclIsUndefined() and not defaultValue.oclIsUndefined()\r\n\timplies feature.cardinality <> Cardinality::Many' canOnlyForceSingletonValues='not feature.oclIsUndefined() and not forcedValue.oclIsUndefined()\r\n\timplies feature.cardinality <> Cardinality::Many'"
 * @generated
 */
public interface IncludedElement extends IncludedFeature {

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedElement_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Attribute value);

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
