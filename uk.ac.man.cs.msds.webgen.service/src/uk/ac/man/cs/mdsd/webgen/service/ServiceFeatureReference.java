/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import uk.ac.man.cs.mdsd.webgen.expression.Variable;

import uk.ac.man.cs.mdsd.webgen.persistence.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.ServiceFeatureReference#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.ServiceFeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getServiceFeatureReference()
 * @model
 * @generated
 */
public interface ServiceFeatureReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getServiceFeatureReference_Name()
	 * @model default="" unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif feature.oclIsKindOf(persistence::EntityFeature) then\r\n\t\tfeature.oclAsType(persistence::EntityFeature).name\r\n\telse if feature.oclIsKindOf(persistence::EncapsulatedAttribute) then\r\n\t\tfeature.oclAsType(persistence::EncapsulatedAttribute).name\r\n\telse if feature.oclIsKindOf(persistence::EncapsulatedAssociation) then\r\n\t\tfeature.oclAsType(persistence::EncapsulatedAssociation).name\r\n\telse\r\n\t\tfeature.oclAsType(persistence::ViewAssociation).name\r\n\tendif endif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.ServiceFeatureReference#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

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
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getServiceFeatureReference_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.ServiceFeatureReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // ServiceFeatureReference
