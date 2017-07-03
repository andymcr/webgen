/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends NamedDisplayElement, FormalParameterList {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Predicate)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getFilter_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Predicate getCondition();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getFilter_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' container reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getFilter_Selection()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Selection#getFilters
	 * @model opposite="filters" transient="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getSelection <em>Selection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' container reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // Filter
