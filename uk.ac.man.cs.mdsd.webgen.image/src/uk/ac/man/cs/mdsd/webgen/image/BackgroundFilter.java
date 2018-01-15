/**
 */
package uk.ac.man.cs.mdsd.webgen.image;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getColor <em>Color</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getWidth <em>Width</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getHeight <em>Height</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getBackgroundFilter()
 * @model
 * @generated
 */
public interface BackgroundFilter extends ImageFilter {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"#fff"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getBackgroundFilter_Color()
	 * @model default="#fff"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getBackgroundFilter_Width()
	 * @model default="-1"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getWidth <em>Width</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getBackgroundFilter_Height()
	 * @model default="-1"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"Center"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions
	 * @see #setPosition(BackgroundPositions)
	 * @see uk.ac.man.cs.mdsd.webgen.image.ImagePackage#getBackgroundFilter_Position()
	 * @model default="Center"
	 * @generated
	 */
	BackgroundPositions getPosition();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.image.BackgroundFilter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.image.BackgroundPositions
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BackgroundPositions value);

} // BackgroundFilter
