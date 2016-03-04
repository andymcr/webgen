/**
 */
package uk.ac.man.cs.mdsd.waf;

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
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises <em>Authorises</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication()
 * @model abstract="true"
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Authorises</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorises</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorises</em>' container reference.
	 * @see #setAuthorises(WafModel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication_Authorises()
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication
	 * @model opposite="authentication" required="true" transient="false"
	 * @generated
	 */
	WafModel getAuthorises();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises <em>Authorises</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorises</em>' container reference.
	 * @see #getAuthorises()
	 * @generated
	 */
	void setAuthorises(WafModel value);

	/**
	 * Returns the value of the '<em><b>Login Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Label</em>' attribute.
	 * @see #setLoginLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication_LoginLabel()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLoginLabel <em>Login Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Label</em>' attribute.
	 * @see #getLoginLabel()
	 * @generated
	 */
	void setLoginLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logout Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Label</em>' attribute.
	 * @see #setLogoutLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAuthentication_LogoutLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Authentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);

} // Authentication
