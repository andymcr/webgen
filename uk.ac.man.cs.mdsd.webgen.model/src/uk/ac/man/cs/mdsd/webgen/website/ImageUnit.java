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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getTitleFeature <em>Title Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getThumbWidth <em>Thumb Width</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getThumbHeight <em>Thumb Height</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageWidth <em>Image Width</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageHeight <em>Image Height</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getTransitionTime <em>Transition Time</em>}</li>
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
	 * Returns the value of the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #setImagePathFeature(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ImagePathFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getImagePathFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #getImagePathFeature()
	 * @generated
	 */
	void setImagePathFeature(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Title Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Feature</em>' containment reference.
	 * @see #setTitleFeature(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_TitleFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getTitleFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getTitleFeature <em>Title Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Feature</em>' containment reference.
	 * @see #getTitleFeature()
	 * @generated
	 */
	void setTitleFeature(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Image Path</em>' attribute.
	 * @see #setMissingImagePath(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_MissingImagePath()
	 * @model
	 * @generated
	 */
	String getMissingImagePath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Image Path</em>' attribute.
	 * @see #getMissingImagePath()
	 * @generated
	 */
	void setMissingImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Thumb Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumb Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumb Width</em>' attribute.
	 * @see #setThumbWidth(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ThumbWidth()
	 * @model default="-1"
	 * @generated
	 */
	int getThumbWidth();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getThumbWidth <em>Thumb Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumb Width</em>' attribute.
	 * @see #getThumbWidth()
	 * @generated
	 */
	void setThumbWidth(int value);

	/**
	 * Returns the value of the '<em><b>Thumb Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumb Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumb Height</em>' attribute.
	 * @see #setThumbHeight(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ThumbHeight()
	 * @model default="-1"
	 * @generated
	 */
	int getThumbHeight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getThumbHeight <em>Thumb Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumb Height</em>' attribute.
	 * @see #getThumbHeight()
	 * @generated
	 */
	void setThumbHeight(int value);

	/**
	 * Returns the value of the '<em><b>Image Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Width</em>' attribute.
	 * @see #setImageWidth(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ImageWidth()
	 * @model default="-1"
	 * @generated
	 */
	int getImageWidth();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageWidth <em>Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Width</em>' attribute.
	 * @see #getImageWidth()
	 * @generated
	 */
	void setImageWidth(int value);

	/**
	 * Returns the value of the '<em><b>Image Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Height</em>' attribute.
	 * @see #setImageHeight(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ImageHeight()
	 * @model default="-1"
	 * @generated
	 */
	int getImageHeight();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getImageHeight <em>Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Height</em>' attribute.
	 * @see #getImageHeight()
	 * @generated
	 */
	void setImageHeight(int value);

	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_ShowTime()
	 * @model default="-1"
	 * @generated
	 */
	int getShowTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getShowTime <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Time</em>' attribute.
	 * @see #getShowTime()
	 * @generated
	 */
	void setShowTime(int value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getImageUnit_TransitionTime()
	 * @model default="-1"
	 * @generated
	 */
	int getTransitionTime();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ImageUnit#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(int value);
} // ImageUnit
