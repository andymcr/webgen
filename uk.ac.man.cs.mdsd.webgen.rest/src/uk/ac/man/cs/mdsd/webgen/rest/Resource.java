/**
 */
package uk.ac.man.cs.mdsd.webgen.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.rest.Resource#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.rest.Resource#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.rest.Resource#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.rest.WebGenRestPackage#getResource()
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
	 * @see uk.ac.man.cs.mdsd.webgen.rest.WebGenRestPackage#getResource_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.rest.Resource#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.rest.WebGenRestPackage#getResource_Selections()
	 * @model
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.rest.WebGenRestPackage#getResource_Operations()
	 * @model
	 * @generated
	 */
	EList<BusinessOperation> getOperations();

} // Resource
