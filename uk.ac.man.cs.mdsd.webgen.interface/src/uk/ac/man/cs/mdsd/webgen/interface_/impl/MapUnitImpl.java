/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.interface_.MapUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;
import uk.ac.man.cs.mdsd.webgen.persistence.LocationAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.MapUnitImpl#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapUnitImpl extends EditUnitImpl implements MapUnit {
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView selectionType;

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
	protected Label placeName;

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
		return WebGenInterfacePackage.Literals.MAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSelectionType() {
		if (selectionType != null && selectionType.eIsProxy()) {
			InternalEObject oldSelectionType = (InternalEObject)selectionType;
			selectionType = (EntityOrView)eResolveProxy(oldSelectionType);
			if (selectionType != oldSelectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
			}
		}
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(EntityOrView newSelectionType) {
		EntityOrView oldSelectionType = selectionType;
		selectionType = newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL, oldDefaultZoomLevel, defaultZoomLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.MAP_UNIT__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getPlaceName() {
		if (placeName != null && placeName.eIsProxy()) {
			InternalEObject oldPlaceName = (InternalEObject)placeName;
			placeName = (Label)eResolveProxy(oldPlaceName);
			if (placeName != oldPlaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
			}
		}
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetPlaceName() {
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceName(Label newPlaceName) {
		Label oldPlaceName = placeName;
		placeName = newPlaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE:
				if (resolve) return getSelectionType();
				return basicGetSelectionType();
			case WebGenInterfacePackage.MAP_UNIT__READ_ONLY:
				return isReadOnly();
			case WebGenInterfacePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return getDefaultZoomLevel();
			case WebGenInterfacePackage.MAP_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebGenInterfacePackage.MAP_UNIT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case WebGenInterfacePackage.MAP_UNIT__PLACE_NAME:
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
			case WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)newValue);
				return;
			case WebGenInterfacePackage.MAP_UNIT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WebGenInterfacePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel((Integer)newValue);
				return;
			case WebGenInterfacePackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebGenInterfacePackage.MAP_UNIT__LOCATION:
				setLocation((LocationAttribute)newValue);
				return;
			case WebGenInterfacePackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((Label)newValue);
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
			case WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)null);
				return;
			case WebGenInterfacePackage.MAP_UNIT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WebGenInterfacePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel(DEFAULT_ZOOM_LEVEL_EDEFAULT);
				return;
			case WebGenInterfacePackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebGenInterfacePackage.MAP_UNIT__LOCATION:
				setLocation((LocationAttribute)null);
				return;
			case WebGenInterfacePackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((Label)null);
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
			case WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE:
				return selectionType != null;
			case WebGenInterfacePackage.MAP_UNIT__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WebGenInterfacePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return defaultZoomLevel != DEFAULT_ZOOM_LEVEL_EDEFAULT;
			case WebGenInterfacePackage.MAP_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebGenInterfacePackage.MAP_UNIT__LOCATION:
				return location != null;
			case WebGenInterfacePackage.MAP_UNIT__PLACE_NAME:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE: return WebGenInterfacePackage.SELECTABLE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WebGenInterfacePackage.SELECTABLE_UNIT__SELECTION_TYPE: return WebGenInterfacePackage.MAP_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
