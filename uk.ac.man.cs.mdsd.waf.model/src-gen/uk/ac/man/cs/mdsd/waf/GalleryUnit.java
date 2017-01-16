/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gallery Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getGalleryUnit()
 * @model
 * @generated
 */
public interface GalleryUnit extends ImageUnit, Selectable {
	/**
	 * Returns the value of the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Size Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Size Filter</em>' reference.
	 * @see #setFullSizeFilter(ImageManipulation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getGalleryUnit_FullSizeFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getFullSizeFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Size Filter</em>' reference.
	 * @see #getFullSizeFilter()
	 * @generated
	 */
	void setFullSizeFilter(ImageManipulation value);

} // GalleryUnit
