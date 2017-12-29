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
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageIndexUnit#getColumnClass <em>Column Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageIndexUnit()
 * @model
 * @generated
 */
public interface ImageIndexUnit extends ImageUnit, InlineActionContainer {
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

} // ImageIndexUnit
