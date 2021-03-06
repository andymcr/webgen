/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUpdateUnit()
 * @model
 * @generated
 */
public interface UpdateUnit extends EditUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>On Save Continue Editing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Save Continue Editing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #setOnSaveContinueEditing(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUpdateUnit_OnSaveContinueEditing()
	 * @model default="false"
	 * @generated
	 */
	boolean isOnSaveContinueEditing();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#isOnSaveContinueEditing <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Save Continue Editing</em>' attribute.
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 */
	void setOnSaveContinueEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,update_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getUpdateUnit_StyleClass()
	 * @model default="unit,update_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // UpdateUnit
