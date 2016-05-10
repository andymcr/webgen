/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getResultType <em>Result Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getBusinessOperation()
 * @model
 * @generated
 */
public interface BusinessOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getBusinessOperation_PartOf()
	 * @see uk.ac.man.cs.mdsd.waf.Service#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Service getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Service value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.OperationResultTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.OperationResultTypes
	 * @see #setResultType(OperationResultTypes)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getBusinessOperation_ResultType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	OperationResultTypes getResultType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.OperationResultTypes
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getBusinessOperation_ResultMimeType()
	 * @model unique="false"
	 * @generated
	 */
	String getResultMimeType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Mime Type</em>' attribute.
	 * @see #getResultMimeType()
	 * @generated
	 */
	void setResultMimeType(String value);

} // BusinessOperation
