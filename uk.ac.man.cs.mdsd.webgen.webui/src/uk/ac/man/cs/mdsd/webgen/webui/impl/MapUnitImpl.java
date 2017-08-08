/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute;

import uk.ac.man.cs.mdsd.webgen.webui.MapUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.MapUnitImpl#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapUnitImpl extends EditUnitImpl implements MapUnit {
	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_ZOOM_LEVEL_EDEFAULT = 12;

	/**
	 * The cached value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected int defaultZoomLevel = DEFAULT_ZOOM_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,map_unit";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationAttribute location;

	/**
	 * The cached value of the '{@link #getPlaceName() <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceName()
	 * @generated
	 * @ordered
	 */
	protected Attribute placeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.MAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.MAP_UNIT__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultZoomLevel() {
		return defaultZoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultZoomLevel(int newDefaultZoomLevel) {
		int oldDefaultZoomLevel = defaultZoomLevel;
		defaultZoomLevel = newDefaultZoomLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL, oldDefaultZoomLevel, defaultZoomLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.MAP_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAttribute getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (LocationAttribute)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.MAP_UNIT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAttribute basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationAttribute newLocation) {
		LocationAttribute oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.MAP_UNIT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getPlaceName() {
		if (placeName != null && placeName.eIsProxy()) {
			InternalEObject oldPlaceName = (InternalEObject)placeName;
			placeName = (Attribute)eResolveProxy(oldPlaceName);
			if (placeName != oldPlaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
			}
		}
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetPlaceName() {
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceName(Attribute newPlaceName) {
		Attribute oldPlaceName = placeName;
		placeName = newPlaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.MAP_UNIT__READ_ONLY:
				return isReadOnly();
			case WebuiPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return getDefaultZoomLevel();
			case WebuiPackage.MAP_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebuiPackage.MAP_UNIT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case WebuiPackage.MAP_UNIT__PLACE_NAME:
				if (resolve) return getPlaceName();
				return basicGetPlaceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.MAP_UNIT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WebuiPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel((Integer)newValue);
				return;
			case WebuiPackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebuiPackage.MAP_UNIT__LOCATION:
				setLocation((LocationAttribute)newValue);
				return;
			case WebuiPackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebuiPackage.MAP_UNIT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WebuiPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel(DEFAULT_ZOOM_LEVEL_EDEFAULT);
				return;
			case WebuiPackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.MAP_UNIT__LOCATION:
				setLocation((LocationAttribute)null);
				return;
			case WebuiPackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebuiPackage.MAP_UNIT__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WebuiPackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return defaultZoomLevel != DEFAULT_ZOOM_LEVEL_EDEFAULT;
			case WebuiPackage.MAP_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebuiPackage.MAP_UNIT__LOCATION:
				return location != null;
			case WebuiPackage.MAP_UNIT__PLACE_NAME:
				return placeName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(", defaultZoomLevel: ");
		result.append(defaultZoomLevel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //MapUnitImpl
