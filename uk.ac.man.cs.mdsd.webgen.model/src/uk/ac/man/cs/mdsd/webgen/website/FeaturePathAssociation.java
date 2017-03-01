/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeaturePathAssociation()
 * @model
 * @generated
 */
public interface FeaturePathAssociation extends FeaturePath, AssociationReference {

	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeaturePathAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\r\n\tlet unit : DynamicUnit\r\n\t\t= self.eContainer().oclAsType(DynamicUnit)\r\n\t\tin let entities : OrderedSet(EntityOrView)\r\n\t\t\t= if unit.oclIsKindOf(SingletonUnit) then\r\n\t\t\t\t\tOrderedSet{unit.oclAsType(SingletonUnit).contentType}\r\n\t\t\t\telse if unit.oclIsKindOf(CollectionUnit) then\r\n\t\t\t\t\tunit.oclAsType(CollectionUnit).contentType\r\n\t\t\t\telse\r\n\t\t\t\t\tunit.entities\r\n\t\t\t\tendif endif\r\n\t\t\tin entities->collect(eov | eov.associations)->includes(association)'"
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeaturePathAssociation_SourceEntity()
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeaturePathAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EntityOrView getTargetEntity();
} // FeaturePathAssociation
