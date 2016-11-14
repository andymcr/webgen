/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Query#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Query#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQuery_Filter()
	 * @model required="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Query#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.QueryParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getQuery_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParameter> getParameters();

} // Query
