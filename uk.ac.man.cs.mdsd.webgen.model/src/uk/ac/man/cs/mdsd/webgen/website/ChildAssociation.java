/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildAssociation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildAssociation()
 * @model
 * @generated
 */
public interface ChildAssociation extends ChildFeature, PathAssociationElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\t\'\'\r\nelse if association.oclIsKindOf(EntityAssociation) then\r\n\tassociation.oclAsType(EntityAssociation).name\r\nelse if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\tassociation.oclAsType(EncapsulatedAssociation).name\r\nelse\r\n\tassociation.oclAsType(ViewAssociation).name \r\nendif endif endif\r\n'"
	 * @generated
	 */
	String getName();

} // ChildAssociation
