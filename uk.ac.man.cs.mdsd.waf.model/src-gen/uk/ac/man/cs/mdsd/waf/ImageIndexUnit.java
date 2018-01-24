/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getSizeClass <em>Size Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit()
 * @model
 * @generated
 */
public interface ImageIndexUnit extends ImageUnit, InlineActionContainer {
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_OmitFieldLabels()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Title</em>' attribute.
	 * @see #setOverlayTitle(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_OverlayTitle()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOverlayTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Title</em>' attribute.
	 * @see #isOverlayTitle()
	 * @generated
	 */
	void setOverlayTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Class</em>' attribute.
	 * @see #setColumnClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_ColumnClass()
	 * @model unique="false"
	 * @generated
	 */
	String getColumnClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Class</em>' attribute.
	 * @see #getColumnClass()
	 * @generated
	 */
	void setColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Size Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Class</em>' attribute.
	 * @see #setSizeClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit_SizeClass()
	 * @model unique="false"
	 * @generated
	 */
	String getSizeClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getSizeClass <em>Size Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Class</em>' attribute.
	 * @see #getSizeClass()
	 * @generated
	 */
	void setSizeClass(String value);

} // ImageIndexUnit
