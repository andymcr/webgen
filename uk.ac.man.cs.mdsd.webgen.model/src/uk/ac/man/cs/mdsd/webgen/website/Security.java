/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Security#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Security#getUserKey <em>User Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Security#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSecurity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='userKeyFromUser userKeyRequiredAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL userKeyFromUser='not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n\tuser.features->includes(userKey)' userKeyRequiredAttribute='not userKey.oclIsUndefined() implies\r\n\tif userKey.oclIsTypeOf(EncapsulatedAttribute) then\r\n\t\tuserKey.oclAsType(EncapsulatedAttribute).cardinality = Cardinality::Required\r\n\telse\r\n\t\tuserKey.oclAsType(EntityAttribute).cardinality = Cardinality::Required\r\n\tendif'"
 * @generated
 */
public interface Security extends EObject {
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSecurity_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EntityOrView getUser();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Security#getUser <em>User</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSecurity_UserKey()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getUserKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Security#getUserKey <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Key</em>' reference.
	 * @see #getUserKey()
	 * @generated
	 */
	void setUserKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Authentication#getAuthenticates <em>Authenticates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSecurity_Authentication()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Authentication#getAuthenticates
	 * @model opposite="authenticates" containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Security#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

} // Security
