/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getEntityOrView <em>Entity Or View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDynamicMenu()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='entriesMustBeFromSource onlyIncludeFeaturesOnce mustSelectSingleton titleFromEntityOrView canOnlyTitleWithSingletons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL entriesMustBeFromSource='true' onlyIncludeFeaturesOnce='true' mustSelectSingleton='not selection.oclIsUndefined() implies selection.limit = 1' titleFromEntityOrView='not title.oclIsUndefined() and not entityOrView.oclIsUndefined() implies\r\n\tentityOrView.features->includes(title)' canOnlyTitleWithSingletons='not title.oclIsUndefined() implies\r\n\tif title.oclIsKindOf(EntityFeature) then\r\n\t\ttitle.oclAsType(EntityFeature).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\ttitle.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tfalse\r\n\tendif endif endif'"
 * @generated
 */
public interface DynamicMenu extends GlobalMenu {
	/**
	 * Returns the value of the '<em><b>Entity Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Or View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Or View</em>' reference.
	 * @see #setEntityOrView(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDynamicMenu_EntityOrView()
	 * @model required="true"
	 * @generated
	 */
	EntityOrView getEntityOrView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getEntityOrView <em>Entity Or View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Or View</em>' reference.
	 * @see #getEntityOrView()
	 * @generated
	 */
	void setEntityOrView(EntityOrView value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDynamicMenu_Selection()
	 * @model required="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getSelection <em>Selection</em>}' reference.
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
	 * @see #setTitle(Label)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getDynamicMenu_Title()
	 * @model ordered="false"
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

} // DynamicMenu