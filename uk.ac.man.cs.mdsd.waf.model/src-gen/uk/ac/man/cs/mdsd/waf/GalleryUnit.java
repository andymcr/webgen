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
 *   <li>{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getGalleryUnit()
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

	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getGalleryUnit_ShowTime()
	 * @model unique="false"
	 * @generated
	 */
	int getShowTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getShowTime <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Time</em>' attribute.
	 * @see #getShowTime()
	 * @generated
	 */
	void setShowTime(int value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getGalleryUnit_TransitionTime()
	 * @model unique="false"
	 * @generated
	 */
	int getTransitionTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.GalleryUnit#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(int value);

} // GalleryUnit
