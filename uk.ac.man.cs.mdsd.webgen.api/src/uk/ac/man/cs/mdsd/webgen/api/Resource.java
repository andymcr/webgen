/**
 */
package uk.ac.man.cs.mdsd.webgen.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportFindAll <em>Support Find All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportFindOne <em>Support Find One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getChildResources <em>Child Resources</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Support Find All</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Find All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Find All</em>' attribute.
	 * @see #setSupportFindAll(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_SupportFindAll()
	 * @model default="true"
	 * @generated
	 */
	boolean isSupportFindAll();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportFindAll <em>Support Find All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Find All</em>' attribute.
	 * @see #isSupportFindAll()
	 * @generated
	 */
	void setSupportFindAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Support Find One</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Find One</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Find One</em>' attribute.
	 * @see #setSupportFindOne(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_SupportFindOne()
	 * @model default="true"
	 * @generated
	 */
	boolean isSupportFindOne();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportFindOne <em>Support Find One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Find One</em>' attribute.
	 * @see #isSupportFindOne()
	 * @generated
	 */
	void setSupportFindOne(boolean value);

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Selection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_Selections()
	 * @model
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Child Resources</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.api.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Resources</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_ChildResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getChildResources();

} // Resource
