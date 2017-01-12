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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				if (resolve) return getFullSizeFilter();
				return basicGetFullSizeFilter();
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
		}
		return super.eIsSet(featureID);
	}

} //GalleryUnitImpl
