/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.GalleryUnit;
import uk.ac.man.cs.mdsd.webgen.website.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gallery Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.GalleryUnitImpl#getFullSizeFilter <em>Full Size Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.GalleryUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.GalleryUnitImpl#getContentClass <em>Content Class</em>}</li>
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
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,gallery_unit";

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
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "gallery_content";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

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
		return WebsitePackage.Literals.GALLERY_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER, oldFullSizeFilter, fullSizeFilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER, oldFullSizeFilter, fullSizeFilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.GALLERY_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.GALLERY_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				if (resolve) return getFullSizeFilter();
				return basicGetFullSizeFilter();
			case WebsitePackage.GALLERY_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebsitePackage.GALLERY_UNIT__CONTENT_CLASS:
				return getContentClass();
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
			case WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				setFullSizeFilter((ImageManipulation)newValue);
				return;
			case WebsitePackage.GALLERY_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebsitePackage.GALLERY_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
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
			case WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				setFullSizeFilter((ImageManipulation)null);
				return;
			case WebsitePackage.GALLERY_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebsitePackage.GALLERY_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
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
			case WebsitePackage.GALLERY_UNIT__FULL_SIZE_FILTER:
				return fullSizeFilter != null;
			case WebsitePackage.GALLERY_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebsitePackage.GALLERY_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
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
		result.append(" (styleClass: ");
		result.append(styleClass);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(')');
		return result.toString();
	}

} //GalleryUnitImpl
