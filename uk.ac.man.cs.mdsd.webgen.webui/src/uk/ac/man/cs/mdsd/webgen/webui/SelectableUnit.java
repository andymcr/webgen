/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selectable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit#getSelectionType <em>Selection Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSelectableUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SelectableUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Type</em>' reference.
	 * @see #setSelectionType(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSelectableUnit_SelectionType()
	 * @model
	 * @generated
	 */
	EntityOrView getSelectionType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit#getSelectionType <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' reference.
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(EntityOrView value);

} // SelectableUnit
