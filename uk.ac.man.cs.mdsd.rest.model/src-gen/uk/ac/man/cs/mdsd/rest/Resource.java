/**
 */
package uk.ac.man.cs.mdsd.rest;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.rest.Resource#getEntityOrView <em>Entity Or View</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.rest.RestPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Or View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Or View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Or View</em>' reference.
	 * @see #setEntityOrView(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.rest.RestPackage#getResource_EntityOrView()
	 * @model
	 * @generated
	 */
	EntityOrView getEntityOrView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.rest.Resource#getEntityOrView <em>Entity Or View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Or View</em>' reference.
	 * @see #getEntityOrView()
	 * @generated
	 */
	void setEntityOrView(EntityOrView value);

} // Resource
