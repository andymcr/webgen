/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Association Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PathAssociationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ChildFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildFeature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement_ChildFeature()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ChildFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	ChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildFeature value);

	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(UnitAssociation) then\r\n\tnot association.oclIsUndefined() implies\r\n\t\tself.oclAsType(UnitAssociation).displayedOn.entities->collect(eov | eov.associations)->includes(association)\r\nelse\r\n\tlet partOf : PathAssociationElement = self.oclAsType(ChildAssociation).partOf\r\n\t\tin not association.oclIsUndefined() implies\r\n\t\t\tif partOf.isSourceAssociation then\r\n\t\t\t\tpartOf.targetEntity.associations->includes(association)\r\n\t\t\telse\r\n\t\t\t\tpartOf.sourceEntity.associations->includes(association)\r\n\t\t\tendif\r\nendif'"
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement_SourceEntity()
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathAssociationElement_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EntityOrView getTargetEntity();

} // PathAssociationElement
