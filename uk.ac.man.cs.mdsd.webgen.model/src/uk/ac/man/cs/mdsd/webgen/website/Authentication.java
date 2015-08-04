/**
 * <copyright>
 * </copyright>
 *
 * $Id: Authentication.java,v 1.5 2013/04/23 10:31:55 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getAuthenticates <em>Authenticates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAuthentication()
 * @model abstract="true"
 * @generated
 */
public interface Authentication extends EObject {

	/**
	 * Returns the value of the '<em><b>Authenticates</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticates</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticates</em>' container reference.
	 * @see #setAuthenticates(WebsiteProperties)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAuthentication_Authenticates()
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties#getAuthentication
	 * @model opposite="authentication" required="true" transient="false"
	 * @generated
	 */
	WebsiteProperties getAuthenticates();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getAuthenticates <em>Authenticates</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticates</em>' container reference.
	 * @see #getAuthenticates()
	 * @generated
	 */
	void setAuthenticates(WebsiteProperties value);

	/**
	 * Returns the value of the '<em><b>Login Label</b></em>' attribute.
	 * The default value is <code>"Login"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Label</em>' attribute.
	 * @see #setLoginLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAuthentication_LoginLabel()
	 * @model default="Login" ordered="false"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getLoginLabel <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Label</em>' attribute.
	 * @see #getLoginLabel()
	 * @generated
	 */
	void setLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logout Label</b></em>' attribute.
	 * The default value is <code>"Logout"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Label</em>' attribute.
	 * @see #setLogoutLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAuthentication_LogoutLabel()
	 * @model default="Logout" ordered="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);
} // Authentication
