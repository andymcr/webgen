/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.website.ImageAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#isShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#isTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImageUnitImpl extends DynamicUnitImpl implements ImageUnit {
	/**
	 * The cached value of the '{@link #getDefaultSelection() <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection defaultSelection;

	/**
	 * The cached value of the '{@link #getImageProperty() <em>Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageProperty()
	 * @generated
	 * @ordered
	 */
	protected ImageAttribute imageProperty;
	/**
	 * The default value of the '{@link #isShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TIME_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTime()
	 * @generated
	 * @ordered
	 */
	protected boolean showTime = SHOW_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #isTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITION_TIME_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected boolean transitionTime = TRANSITION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.IMAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getDefaultSelection() {
		if (defaultSelection != null && defaultSelection.eIsProxy()) {
			InternalEObject oldDefaultSelection = (InternalEObject)defaultSelection;
			defaultSelection = (Selection)eResolveProxy(oldDefaultSelection);
			if (defaultSelection != oldDefaultSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
			}
		}
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetDefaultSelection() {
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSelection(Selection newDefaultSelection) {
		Selection oldDefaultSelection = defaultSelection;
		defaultSelection = newDefaultSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAttribute getImageProperty() {
		if (imageProperty != null && imageProperty.eIsProxy()) {
			InternalEObject oldImageProperty = (InternalEObject)imageProperty;
			imageProperty = (ImageAttribute)eResolveProxy(oldImageProperty);
			if (imageProperty != oldImageProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY, oldImageProperty, imageProperty));
			}
		}
		return imageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAttribute basicGetImageProperty() {
		return imageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageProperty(ImageAttribute newImageProperty) {
		ImageAttribute oldImageProperty = imageProperty;
		imageProperty = newImageProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY, oldImageProperty, imageProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowTime() {
		return showTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTime(boolean newShowTime) {
		boolean oldShowTime = showTime;
		showTime = newShowTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__SHOW_TIME, oldShowTime, showTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitionTime() {
		return transitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTime(boolean newTransitionTime) {
		boolean oldTransitionTime = transitionTime;
		transitionTime = newTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				if (resolve) return getDefaultSelection();
				return basicGetDefaultSelection();
			case WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY:
				if (resolve) return getImageProperty();
				return basicGetImageProperty();
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				return isShowTime();
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				return isTransitionTime();
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
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY:
				setImageProperty((ImageAttribute)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				setShowTime((Boolean)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				setTransitionTime((Boolean)newValue);
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
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)null);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY:
				setImageProperty((ImageAttribute)null);
				return;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				setShowTime(SHOW_TIME_EDEFAULT);
				return;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				setTransitionTime(TRANSITION_TIME_EDEFAULT);
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
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				return defaultSelection != null;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PROPERTY:
				return imageProperty != null;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				return showTime != SHOW_TIME_EDEFAULT;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				return transitionTime != TRANSITION_TIME_EDEFAULT;
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
		result.append(" (showTime: ");
		result.append(showTime);
		result.append(", transitionTime: ");
		result.append(transitionTime);
		result.append(')');
		return result.toString();
	}

} //ImageUnitImpl
