/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_;

import uk.ac.man.cs.mdsd.webgen.persistence.Feature;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.DynamicMenu#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.DynamicMenu#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getDynamicMenu()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustSelectSingleton titleFromSelectResult canOnlyTitleWithSingletons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL mustSelectSingleton='not selection.oclIsUndefined() implies selection.limit = 1' titleFromSelectResult\040='not title.oclIsUndefined() and not entityOrView.oclIsUndefined() implies\r\n\tentityOrView.features->includes(title)' canOnlyTitleWithSingletons='not title.oclIsUndefined() implies\r\n\tif title.oclIsKindOf(EntityFeature) then\r\n\t\ttitle.oclAsType(EntityFeature).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\ttitle.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tfalse\r\n\tendif endif endif'"
 * @generated
 */
public interface DynamicMenu extends Menu {
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
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getDynamicMenu_Selection()
	 * @model required="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.interface_.DynamicMenu#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(Feature)
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getDynamicMenu_Title()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.interface_.DynamicMenu#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Feature value);

} // DynamicMenu
