/**
 */
package uk.ac.man.cs.mdsd.webgen.security;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Security#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getSecurity_Authentication()
	 * @see uk.ac.man.cs.mdsd.webgen.security.Authentication#getSecurity
	 * @model opposite="security" containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Security#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

} // Security
