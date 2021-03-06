/**
 */
package uk.ac.man.cs.mdsd.webgen.service;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

import uk.ac.man.cs.mdsd.webgen.expression.Predicate;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getJoins <em>Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getFilters <em>Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getLimit <em>Limit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getSelectPath <em>Select Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends NamedElement, FormalParameterList {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Service#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(Service)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_UsedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Service#getSelections
	 * @model opposite="selections" required="true" transient="false"
	 * @generated
	 */
	Service getUsedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getUsedBy <em>Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' container reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(Service value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distinct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Distinct()
	 * @model
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Fields()
	 * @model
	 * @generated
	 */
	EList<Feature> getFields();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Joins()
	 * @model
	 * @generated
	 */
	EList<Association> getJoins();

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
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Predicate getCondition();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Filter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.service.Filter#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Filters()
	 * @see uk.ac.man.cs.mdsd.webgen.service.Filter#getSelection
	 * @model opposite="selection" containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Ordering()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrdering();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_Limit()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Select Path</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Path</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_SelectPath()
	 * @model
	 * @generated
	 */
	EList<EntityAssociation> getSelectPath();

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
	 * @see uk.ac.man.cs.mdsd.webgen.service.ServicePackage#getSelection_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.service.Selection#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

} // Selection
