/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LoginUnit#getLogoutUriElement <em>Logout Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.LoginUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLoginUnit()
 * @model
 * @generated
 */
public interface LoginUnit extends AuthenticationUnit, ControlUnit {

	/**
	 * Returns the value of the '<em><b>Logout Uri Element</b></em>' attribute.
	 * The default value is <code>"\"logout\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Uri Element</em>' attribute.
	 * @see #setLogoutUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLoginUnit_LogoutUriElement()
	 * @model default="\"logout\""
	 * @generated
	 */
	String getLogoutUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LoginUnit#getLogoutUriElement <em>Logout Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Uri Element</em>' attribute.
	 * @see #getLogoutUriElement()
	 * @generated
	 */
	void setLogoutUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,login_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getLoginUnit_StyleClass()
	 * @model default="unit,login_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.LoginUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);
} // LoginUnit
