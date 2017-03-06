/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getDestination <em>Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getUriElement <em>Uri Element</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDeleteAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyDeleteSingletons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyDeleteSingletons='if usedBy.oclIsKindOf(UnitElement) then\r\n\tlet attribute : persistence::Attribute\r\n\t\t= usedBy.oclAsType(UnitElement).attribute\r\n\t\tin if attribute.oclIsKindOf(persistence::EntityAttribute) then\r\n\t\t\t\tattribute.oclAsType(persistence::EntityAttribute).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tattribute.oclAsType(persistence::EncapsulatedAttribute).cardinality <> persistence::Cardinality::Many\r\n\t\t\tendif\r\nelse if usedBy.oclIsKindOf(UnitAssociation) then\r\n\tlet association : persistence::Association\r\n\t\t= usedBy.oclAsType(UnitAssociation).association\r\n\t\tin if association.oclIsKindOf(persistence::EntityAssociation) then\r\n\t\t\t\tassociation.oclAsType(persistence::EntityAssociation).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse if association.oclIsKindOf(persistence::EncapsulatedAssociation) then\r\n\t\t\t\tassociation.oclAsType(persistence::EncapsulatedAssociation).cardinality <> persistence::Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n\t\t\tendif endif\r\nelse\r\n\tusedBy.oclIsKindOf(CollectionUnit)\r\nendif endif\r\n'"
 * @generated
 */
public interface DeleteAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Page)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDeleteAction_Destination()
	 * @model
	 * @generated
	 */
	Page getDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Page value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDeleteAction_ConfirmMessage()
	 * @model
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDeleteAction_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DeleteAction#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

} // DeleteAction
