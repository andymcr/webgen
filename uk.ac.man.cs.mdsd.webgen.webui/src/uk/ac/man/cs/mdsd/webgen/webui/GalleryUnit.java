/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import uk.ac.man.cs.mdsd.webgen.image.ImageManipulation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gallery Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGalleryUnit()
 * @model
 * @generated
 */
public interface GalleryUnit extends ImageUnit {
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGalleryUnit_FullSizeFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getFullSizeFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Size Filter</em>' reference.
	 * @see #getFullSizeFilter()
	 * @generated
	 */
	void setFullSizeFilter(ImageManipulation value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,gallery_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGalleryUnit_StyleClass()
	 * @model default="unit,gallery_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"gallery_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getGalleryUnit_ContentClass()
	 * @model default="gallery_content" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.GalleryUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // GalleryUnit
