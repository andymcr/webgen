/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRegistrationUnit()
 * @model
 * @generated
 */
public interface RegistrationUnit extends AuthenticationUnit, ControlUnit {
	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,register_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getRegistrationUnit_StyleClass()
	 * @model default="unit,register_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.RegistrationUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // RegistrationUnit
