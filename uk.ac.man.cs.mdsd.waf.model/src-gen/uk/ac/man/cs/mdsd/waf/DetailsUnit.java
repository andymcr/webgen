/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDetailsUnit()
 * @model
 * @generated
 */
public interface DetailsUnit extends DataUnit, SingletonUnit, SelectableUnit {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDetailsUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDetailsUnit_OmitFieldLabels()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

} // DetailsUnit
