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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportGetAll <em>Support Get All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportGetOne <em>Support Get One</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if service.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tservice.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Support Get All</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Get All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Get All</em>' attribute.
	 * @see #setSupportGetAll(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_SupportGetAll()
	 * @model default="true"
	 * @generated
	 */
	boolean isSupportGetAll();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportGetAll <em>Support Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Get All</em>' attribute.
	 * @see #isSupportGetAll()
	 * @generated
	 */
	void setSupportGetAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Support Get One</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Get One</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Get One</em>' attribute.
	 * @see #setSupportGetOne(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.api.ApiPackage#getResource_SupportGetOne()
	 * @model default="true"
	 * @generated
	 */
	boolean isSupportGetOne();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isSupportGetOne <em>Support Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Get One</em>' attribute.
	 * @see #isSupportGetOne()
	 * @generated
	 */
	void setSupportGetOne(boolean value);

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
