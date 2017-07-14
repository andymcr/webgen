/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getConstants <em>Constants</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getServes <em>Serves</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getFindAll <em>Find All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getFindOne <em>Find One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Service#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Constant}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Constant#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_Constants()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Constant#getDefinedBy
	 * @model opposite="definedBy" containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * Returns the value of the '<em><b>Serves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' reference.
	 * @see #setServes(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_Serves()
	 * @model
	 * @generated
	 */
	EntityOrView getServes();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Service#getServes <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' reference.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Selection}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_Selections()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Selection#getUsedBy
	 * @model opposite="usedBy" containment="true"
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Find All</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find All</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find All</em>' reference.
	 * @see #setFindAll(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_FindAll()
	 * @model
	 * @generated
	 */
	Selection getFindAll();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Service#getFindAll <em>Find All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find All</em>' reference.
	 * @see #getFindAll()
	 * @generated
	 */
	void setFindAll(Selection value);

	/**
	 * Returns the value of the '<em><b>Find One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find One</em>' reference.
	 * @see #setFindOne(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_FindOne()
	 * @model
	 * @generated
	 */
	Selection getFindOne();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Service#getFindOne <em>Find One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find One</em>' reference.
	 * @see #getFindOne()
	 * @generated
	 */
	void setFindOne(Selection value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getService_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessOperation> getOperations();

} // Service
