/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDetailsUnit()
 * @model
 * @generated
 */
public interface DetailsUnit extends DataUnit, SingletonUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Display When Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #setOnlyDisplayWhenNotEmpty(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDetailsUnit_OnlyDisplayWhenNotEmpty()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOnlyDisplayWhenNotEmpty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DetailsUnit#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 */
	void setOnlyDisplayWhenNotEmpty(boolean value);

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
