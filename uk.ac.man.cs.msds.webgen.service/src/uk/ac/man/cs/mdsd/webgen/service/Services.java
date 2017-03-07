/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Services#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject {

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getServices_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();
} // Services
