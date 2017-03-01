/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathAssociation#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathAssociation()
 * @model
 * @generated
 */
public interface ChildPathAssociation extends ChildPath, AssociationReference {
	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\r\n\tif partOf.oclIsTypeOf(UnitAssociation) then\r\n\t\tpartOf.oclAsType(UnitAssociation).targetEntity.associations->includes(association)\r\n\telse if partOf.oclIsTypeOf(FeaturePathAssociation) then\r\n\t\tpartOf.oclAsType(FeaturePathAssociation).targetEntity.associations->includes(association)\r\n\telse\r\n\t\tpartOf.oclAsType(ChildPathAssociation).targetEntity.associations->includes(association)\r\n\tendif endif'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathAssociation_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EntityOrView getSourceEntity();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getChildPathAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EntityOrView getTargetEntity();

} // ChildPathAssociation
