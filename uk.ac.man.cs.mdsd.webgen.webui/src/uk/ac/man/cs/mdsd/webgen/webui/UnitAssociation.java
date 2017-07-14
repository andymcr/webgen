/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getAjaxOptionsList <em>Ajax Options List</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionValidChoice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionValidChoice='not selection.oclIsUndefined() implies\r\n\tdisplayedOn.pageDisplayedOn.webUI.services.services\r\n\t\t->select(s : service::Service | not s.serves.oclIsUndefined())\r\n\t\t->select(s : service::Service | s.serves = targetEntity)\r\n\t\t->collect(s : service::Service | s.selections)\r\n\t\t->includes(selection)'"
 * @generated
 */
public interface UnitAssociation extends UnitFeature, UnitContainer, AssociationReference {
	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\r\n\tlet entities : OrderedSet(persistence::EntityOrView)\r\n\t\t= if displayedOn.oclIsKindOf(SingletonUnit) then\r\n\t\t\t\tOrderedSet{displayedOn.oclAsType(SingletonUnit).contentType}\r\n\t\t\telse if displayedOn.oclIsKindOf(CollectionUnit) then\r\n\t\t\t\tdisplayedOn.oclAsType(CollectionUnit).contentType\r\n\t\t\telse\r\n\t\t\t\tOrderedSet{}\r\n\t\t\tendif endif\r\n\t\tin entities->collect(e | e.associations)->includes(association)'"
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\tassociation.oclAsType(persistence::EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EntityOrView getTargetEntity();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Ajax Options List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Options List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Options List</em>' reference.
	 * @see #setAjaxOptionsList(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUnitAssociation_AjaxOptionsList()
	 * @model
	 * @generated
	 */
	Selection getAjaxOptionsList();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.UnitAssociation#getAjaxOptionsList <em>Ajax Options List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Options List</em>' reference.
	 * @see #getAjaxOptionsList()
	 * @generated
	 */
	void setAjaxOptionsList(Selection value);

} // UnitAssociation
