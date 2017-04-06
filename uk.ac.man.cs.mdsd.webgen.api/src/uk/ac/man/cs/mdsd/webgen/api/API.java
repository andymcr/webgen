/**
 */
package uk.ac.man.cs.mdsd.webgen.api;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.API#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(Resource)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getAPI_Resources()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResources();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.API#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Resource value);

} // API
