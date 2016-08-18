/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#isShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#isTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit()
 * @model abstract="true"
 * @generated
 */
public interface ImageUnit extends DynamicUnit {

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_DefaultSelection()
	 * @model
	 * @generated
	 */
	Selection getDefaultSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getDefaultSelection <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' reference.
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Image Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Property</em>' reference.
	 * @see #setImageProperty(ImageAttribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ImageProperty()
	 * @model required="true"
	 * @generated
	 */
	ImageAttribute getImageProperty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageProperty <em>Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Property</em>' reference.
	 * @see #getImageProperty()
	 * @generated
	 */
	void setImageProperty(ImageAttribute value);

	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ShowTime()
	 * @model
	 * @generated
	 */
	boolean isShowTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#isShowTime <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Time</em>' attribute.
	 * @see #isShowTime()
	 * @generated
	 */
	void setShowTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_TransitionTime()
	 * @model
	 * @generated
	 */
	boolean isTransitionTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#isTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #isTransitionTime()
	 * @generated
	 */
	void setTransitionTime(boolean value);
} // ImageUnit
