/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.BusinessOperation#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getBusinessOperation()
 * @model
 * @generated
 */
public interface BusinessOperation extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.OperationResultTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.OperationResultTypes
	 * @see #setResultType(OperationResultTypes)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getBusinessOperation_ResultType()
	 * @model required="true"
	 * @generated
	 */
	OperationResultTypes getResultType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.BusinessOperation#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.OperationResultTypes
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(OperationResultTypes value);
} // BusinessOperation
