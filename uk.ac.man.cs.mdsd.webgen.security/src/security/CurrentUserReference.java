/**
 */
package security;

import uk.ac.man.cs.mdsd.webgen.expression.Variable;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current User Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.CurrentUserReference#getUserModel <em>User Model</em>}</li>
 * </ul>
 *
 * @see security.SecurityPackage#getCurrentUserReference()
 * @model
 * @generated
 */
public interface CurrentUserReference extends Variable {
	/**
	 * Returns the value of the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Model</em>' reference.
	 * @see #isSetUserModel()
	 * @see security.SecurityPackage#getCurrentUserReference_UserModel()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EntityOrView getUserModel();

	/**
	 * Returns whether the value of the '{@link security.CurrentUserReference#getUserModel <em>User Model</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Model</em>' reference is set.
	 * @see #getUserModel()
	 * @generated
	 */
	boolean isSetUserModel();

} // CurrentUserReference
