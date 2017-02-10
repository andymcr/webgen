/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.webgen.core.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.Filter#getParameters <em>Parameters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.Filter#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.interface_.FilterParameter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.interface_.FilterParameter#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getFilter_Parameters()
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.FilterParameter#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<FilterParameter> getParameters();

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
	 * @see uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage#getFilter_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.interface_.Filter#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

} // Filter
