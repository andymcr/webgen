/**
 */
package uk.ac.man.cs.mdsd.webgen.security;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getSecurity <em>Security</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getUserKey <em>User Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getLoginLabel <em>Login Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getLogoutLabel <em>Logout Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='userKeyFromUser userKeyRequiredAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL userKeyFromUser='not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n\tuser.features-&gt;includes(userKey)' userKeyRequiredAttribute='not userKey.oclIsUndefined() implies\r\n\tif userKey.oclIsTypeOf(persistence::EncapsulatedAttribute) then\r\n\t\tuserKey.oclAsType(persistence::EncapsulatedAttribute).cardinality = persistence::Cardinality::Required\r\n\telse\r\n\t\tuserKey.oclAsType(persistence::EntityAttribute).cardinality = persistence::Cardinality::Required\r\n\tendif'"
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.security.Security#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' container reference.
	 * @see #setSecurity(Security)
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication_Security()
	 * @see uk.ac.man.cs.mdsd.webgen.security.Security#getAuthentication
	 * @model opposite="authentication" required="true" transient="false"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getSecurity <em>Security</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' container reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EntityOrView getUser();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Key</em>' reference.
	 * @see #setUserKey(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication_UserKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getUserKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getUserKey <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Key</em>' reference.
	 * @see #getUserKey()
	 * @generated
	 */
	void setUserKey(Attribute value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication_LoginLabel()
	 * @model default="Login" ordered="false"
	 * @generated
	 */
	String getLoginLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getLoginLabel <em>Login Label</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.security.SecurityPackage#getAuthentication_LogoutLabel()
	 * @model default="Logout" ordered="false"
	 * @generated
	 */
	String getLogoutLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.security.Authentication#getLogoutLabel <em>Logout Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Label</em>' attribute.
	 * @see #getLogoutLabel()
	 * @generated
	 */
	void setLogoutLabel(String value);

} // Authentication
