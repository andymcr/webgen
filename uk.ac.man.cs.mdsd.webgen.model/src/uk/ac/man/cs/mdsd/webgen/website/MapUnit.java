/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getLocation2 <em>Location2</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getPlaceName <em>Place Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getPlaceName2 <em>Place Name2</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit()
 * @model
 * @generated
 */
public interface MapUnit extends EditUnit, Selectable {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_ReadOnly()
	 * @model default="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Zoom Level</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Zoom Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #setDefaultZoomLevel(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_DefaultZoomLevel()
	 * @model default="12"
	 * @generated
	 */
	int getDefaultZoomLevel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #getDefaultZoomLevel()
	 * @generated
	 */
	void setDefaultZoomLevel(int value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,map_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_StyleClass()
	 * @model default="unit,map_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Name</em>' reference.
	 * @see #setPlaceName(ServiceAttribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_PlaceName()
	 * @model
	 * @generated
	 */
	ServiceAttribute getPlaceName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getPlaceName <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Name</em>' reference.
	 * @see #getPlaceName()
	 * @generated
	 */
	void setPlaceName(ServiceAttribute value);

	/**
	 * Returns the value of the '<em><b>Place Name2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Name2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Name2</em>' reference.
	 * @see #setPlaceName2(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_PlaceName2()
	 * @model
	 * @generated
	 */
	Attribute getPlaceName2();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getPlaceName2 <em>Place Name2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Name2</em>' reference.
	 * @see #getPlaceName2()
	 * @generated
	 */
	void setPlaceName2(Attribute value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(ServiceAttribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_Location()
	 * @model required="true"
	 * @generated
	 */
	ServiceAttribute getLocation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ServiceAttribute value);

	/**
	 * Returns the value of the '<em><b>Location2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location2</em>' reference.
	 * @see #setLocation2(LocationAttribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getMapUnit_Location2()
	 * @model required="true"
	 * @generated
	 */
	LocationAttribute getLocation2();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.MapUnit#getLocation2 <em>Location2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location2</em>' reference.
	 * @see #getLocation2()
	 * @generated
	 */
	void setLocation2(LocationAttribute value);

} // MapUnit
