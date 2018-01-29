/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.GalleryUnit;
import uk.ac.man.cs.mdsd.waf.ImageManipulation;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gallery Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl#getFullSizeFilter <em>Full Size Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.GalleryUnitImpl#getTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GalleryUnitImpl extends ImageUnitImpl implements GalleryUnit {
	/**
	 * The cached value of the '{@link #getFullSizeFilter() <em>Full Size Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSizeFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation fullSizeFilter;

	/**
	 * The default value of the '{@link #getShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOW_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowTime()
	 * @generated
	 * @ordered
	 */
	protected int showTime = SHOW_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSITION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected int transitionTime = TRANSITION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalleryUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.GALLERY_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation getFullSizeFilter() {
		if (fullSizeFilter != null && fullSizeFilter.eIsProxy()) {
			InternalEObject oldFullSizeFilter = (InternalEObject)fullSizeFilter;
			fullSizeFilter = (ImageManipulation)eResolveProxy(oldFullSizeFilter);
			if (fullSizeFilter != oldFullSizeFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER, oldFullSizeFilter, fullSizeFilter));
			}
		}
		return fullSizeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetFullSizeFilter() {
		return fullSizeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullSizeFilter(ImageManipulation newFullSizeFilter) {
		ImageManipulation oldFullSizeFilter = fullSizeFilter;
		fullSizeFilter = newFullSizeFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER, oldFullSizeFilter, fullSizeFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShowTime() {
		return showTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTime(int newShowTime) {
		int oldShowTime = showTime;
		showTime = newShowTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.GALLERY_UNIT__SHOW_TIME, oldShowTime, showTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransitionTime() {
		return transitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTime(int newTransitionTime) {
		int oldTransitionTime = transitionTime;
		transitionTime = newTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.GALLERY_UNIT__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				if (resolve) return getFullSizeFilter();
				return basicGetFullSizeFilter();
			case WafPackage.GALLERY_UNIT__SHOW_TIME:
				return getShowTime();
			case WafPackage.GALLERY_UNIT__TRANSITION_TIME:
				return getTransitionTime();
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
			case WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				setFullSizeFilter((ImageManipulation)newValue);
				return;
			case WafPackage.GALLERY_UNIT__SHOW_TIME:
				setShowTime((Integer)newValue);
				return;
			case WafPackage.GALLERY_UNIT__TRANSITION_TIME:
				setTransitionTime((Integer)newValue);
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
			case WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				setFullSizeFilter((ImageManipulation)null);
				return;
			case WafPackage.GALLERY_UNIT__SHOW_TIME:
				setShowTime(SHOW_TIME_EDEFAULT);
				return;
			case WafPackage.GALLERY_UNIT__TRANSITION_TIME:
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
			case WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				return fullSizeFilter != null;
			case WafPackage.GALLERY_UNIT__SHOW_TIME:
				return showTime != SHOW_TIME_EDEFAULT;
			case WafPackage.GALLERY_UNIT__TRANSITION_TIME:
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

} //GalleryUnitImpl
