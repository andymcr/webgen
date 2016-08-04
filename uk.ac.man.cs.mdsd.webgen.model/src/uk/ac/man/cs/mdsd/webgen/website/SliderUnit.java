/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.SliderUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.SliderUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSliderUnit()
 * @model
 * @generated
 */
public interface SliderUnit extends ImageUnit {

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,slider_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSliderUnit_StyleClass()
	 * @model default="unit,slider_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.SliderUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"slider_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getSliderUnit_ContentClass()
	 * @model default="slider_content" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.SliderUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);
} // SliderUnit
