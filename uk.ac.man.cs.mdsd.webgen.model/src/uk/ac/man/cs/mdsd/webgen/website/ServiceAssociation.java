/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionFromCorrectService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionFromCorrectService='not selection.oclIsUndefined() and not association.oclIsUndefined() implies\r\n\tlet entityOrView : EntityOrView\r\n\t\t= if association.oclIsTypeOf(ViewAssociation) then\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).partOf\r\n\t\t\telse if useAssociationSource then\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\t\tendif endif\r\n\tin entityOrView.servedBy->collect(s | s.selections)->includes(selection)'"
 * @generated
 */
public interface ServiceAssociation extends IncludedAssociation, ServiceFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\t\'\'\r\nelse if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\tassociation.oclAsType(EncapsulatedAssociation).name\r\nelse if association.oclIsTypeOf(ViewAssociation) then\r\n\tif useAssociationSource then\r\n\t\tassociation.oclAsType(ViewAssociation).name\r\n\telse\r\n\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\tendif\r\nelse if useAssociationSource then\r\n\tassociation.oclAsType(EntityAssociation).name\r\nelse\r\n\tassociation.oclAsType(EntityAssociation).targetFeatureName \r\nendif endif endif endif\r\n'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedFeature_Required()
	 * @model ordered="false"
	 * @generated NOT
	 */
	boolean isRequired();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceAssociation_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // ServiceAssociation
