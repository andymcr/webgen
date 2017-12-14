/**
 */
package uk.ac.man.cs.mdsd.webgen.image;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thumbnail Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getWidth <em>Width</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getHeight <em>Height</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getThumbnailFilter()
 * @model
 * @generated
 */
public interface ThumbnailFilter extends ImageFilter {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getThumbnailFilter_Width()
	 * @model default="-1"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getThumbnailFilter_Height()
	 * @model default="-1"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes
	 * @see #setMode(ThumbnailModes)
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getThumbnailFilter_Mode()
	 * @model
	 * @generated
	 */
	ThumbnailModes getMode();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.ThumbnailFilter#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.image.ThumbnailModes
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ThumbnailModes value);

} // ThumbnailFilter
