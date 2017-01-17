/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Attribute;
import uk.ac.man.cs.mdsd.orm.SingletonLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.MapUnit#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.MapUnit#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.MapUnit#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMapUnit()
 * @model
 * @generated
 */
public interface MapUnit extends EditUnit, SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMapUnit_ReadOnly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.MapUnit#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Zoom Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Zoom Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #setDefaultZoomLevel(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMapUnit_DefaultZoomLevel()
	 * @model unique="false"
	 * @generated
	 */
	int getDefaultZoomLevel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getDefaultZoomLevel <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Zoom Level</em>' attribute.
	 * @see #getDefaultZoomLevel()
	 * @generated
	 */
	void setDefaultZoomLevel(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(SingletonLocation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMapUnit_Location()
	 * @model required="true"
	 * @generated
	 */
	SingletonLocation getLocation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(SingletonLocation value);

	/**
	 * Returns the value of the '<em><b>Place Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Name</em>' reference.
	 * @see #setPlaceName(Attribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getMapUnit_PlaceName()
	 * @model
	 * @generated
	 */
	Attribute getPlaceName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.MapUnit#getPlaceName <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Name</em>' reference.
	 * @see #getPlaceName()
	 * @generated
	 */
	void setPlaceName(Attribute value);

} // MapUnit
