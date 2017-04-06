/**
 */
package uk.ac.man.cs.mdsd.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.api.API#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.api.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.api.ApiPackage#getAPI_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // API
