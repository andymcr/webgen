/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import uk.ac.man.cs.mdsd.criteria.Order;
import uk.ac.man.cs.mdsd.criteria.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getParameters <em>Parameters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getJoins <em>Joins</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getLimit <em>Limit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Selection#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(Service)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_UsedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Service#getSelections
	 * @model opposite="selections" required="true" transient="false"
	 * @generated
	 */
	Service getUsedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getUsedBy <em>Used By</em>}' container reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Distinct()
	 * @model
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Fields()
	 * @model
	 * @generated
	 */
	List<Feature> getFields();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.SelectionParameter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.SelectionParameter#getFormalFor <em>Formal For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Parameters()
	 * @see uk.ac.man.cs.mdsd.webgen.website.SelectionParameter#getFormalFor
	 * @model opposite="formalFor" containment="true"
	 * @generated
	 */
	List<SelectionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Joins()
	 * @model
	 * @generated
	 */
	List<Association> getJoins();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Predicate)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Filter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Predicate getFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Predicate value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.criteria.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Ordering()
	 * @model containment="true"
	 * @generated
	 */
	List<Order> getOrdering();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Limit()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSelection_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Selection#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // Selection
