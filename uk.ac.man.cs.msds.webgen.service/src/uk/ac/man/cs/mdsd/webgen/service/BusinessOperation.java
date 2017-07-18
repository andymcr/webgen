/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation#getResultType <em>Result Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getBusinessOperation()
 * @model
 * @generated
 */
public interface BusinessOperation extends NamedElement, FormalParameterList {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getBusinessOperation_Uses()
	 * @model
	 * @generated
	 */
	EList<Service> getUses();

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.service.OperationResultTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.service.OperationResultTypes
	 * @see #setResultType(OperationResultTypes)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getBusinessOperation_ResultType()
	 * @model required="true"
	 * @generated
	 */
	OperationResultTypes getResultType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.service.OperationResultTypes
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(OperationResultTypes value);

	/**
	 * Returns the value of the '<em><b>Result Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Mime Type</em>' attribute.
	 * @see #setResultMimeType(String)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getBusinessOperation_ResultMimeType()
	 * @model
	 * @generated
	 */
	String getResultMimeType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Mime Type</em>' attribute.
	 * @see #getResultMimeType()
	 * @generated
	 */
	void setResultMimeType(String value);

} // BusinessOperation
