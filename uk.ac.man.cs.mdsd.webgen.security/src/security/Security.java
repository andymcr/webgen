/**
 */
package security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.Security#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @see security.SecurityPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link security.Authentication#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' reference.
	 * @see #setAuthentication(Authentication)
	 * @see security.SecurityPackage#getSecurity_Authentication()
	 * @see security.Authentication#getSecurity
	 * @model opposite="security"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link security.Security#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);
} // Security