/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getDynamicLabel <em>Dynamic Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyForceSingletonValues selectionFromCorrectService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='not feature.oclIsUndefined() implies\r\n\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\tfeature.cardinality = Cardinality::Required implies required\r\n\telse\r\n\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\trequired\r\n\t\telse\r\n\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required implies required\r\n\t\tendif\r\n\tendif' canOnlyForceSingletonValues='not feature.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\tfeature.cardinality <> Cardinality::Many\r\n\telse\r\n\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\ttrue\r\n\t\telse\r\n\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n\t\tendif\r\n\tendif' selectionFromCorrectService='if selection.oclIsUndefined() then\r\n\ttrue\r\nelse if feature.oclIsUndefined() then\r\n\ttrue\r\nelse\r\n\tlet target : Entity\r\n\t\t= if partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\t\t\tfeature.targetEntity\r\n\t\t\telse\r\n\t\t\t\tfeature.parentEntity\r\n\t\t\tendif\r\n\tin target.servedBy->collect(s | s.selections)->includes(selection)\r\nendif endif'"
 * @generated
 */
public interface ServiceEntityAssociation extends ServiceEntityFeature, ServiceAssociation, IncludedAssociation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() or partOf.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\tfeature.name\r\n\telse\r\n\t\tfeature.targetFeatureName \r\nendif endif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Label</em>' reference.
	 * @see #setDynamicLabel(ModelLabel)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_DynamicLabel()
	 * @model
	 * @generated
	 */
	ModelLabel getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabel value);

} // ServiceEntityAssociation
