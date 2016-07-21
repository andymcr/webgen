/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends Path {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif feature.oclIsKindOf(EntityFeature) then\r\n\t\tfeature.oclAsType(EntityFeature).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\tfeature.oclAsType(EncapsulatedAttribute).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\tfeature.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tfeature.oclAsType(ViewAssociation).name\r\n\tendif endif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureReference
