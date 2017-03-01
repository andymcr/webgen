/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;
import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Filter#getFilterFor <em>Filter For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Filter#getParameters <em>Parameters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Filter#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Filter For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter For</em>' container reference.
	 * @see #setFilterFor(CollectionUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilter_FilterFor()
	 * @see uk.ac.man.cs.mdsd.webgen.website.CollectionUnit#getFilters
	 * @model opposite="filters" required="true" transient="false"
	 * @generated
	 */
	CollectionUnit getFilterFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Filter#getFilterFor <em>Filter For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter For</em>' container reference.
	 * @see #getFilterFor()
	 * @generated
	 */
	void setFilterFor(CollectionUnit value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilter_Parameters()
	 * @see uk.ac.man.cs.mdsd.webgen.website.FilterParameter#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	List<FilterParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFilter_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Filter#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // Filter
