/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit()
 * @model abstract="true"
 * @generated
 */
public interface DataUnit extends DynamicUnit {
	/**
	 * Returns the value of the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Selection</em>' reference.
	 * @see #setDefaultSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit_DefaultSelection()
	 * @model
	 * @generated
	 */
	Selection getDefaultSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDefaultSelection <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' reference.
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Title</em>' reference.
	 * @see #setDynamicTitle(UnitTitle)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataUnit_DynamicTitle()
	 * @model
	 * @generated
	 */
	UnitTitle getDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataUnit#getDynamicTitle <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Title</em>' reference.
	 * @see #getDynamicTitle()
	 * @generated
	 */
	void setDynamicTitle(UnitTitle value);

} // DataUnit
