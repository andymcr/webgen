/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl;
import uk.ac.man.cs.mdsd.webgen.website.ImageFilter;
import uk.ac.man.cs.mdsd.webgen.website.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Manipulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageManipulationImpl#getJpegQuality <em>Jpeg Quality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageManipulationImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageManipulationImpl extends NamedElementImpl implements ImageManipulation {
	/**
	 * The default value of the '{@link #getJpegQuality() <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpegQuality()
	 * @generated
	 * @ordered
	 */
	protected static final int JPEG_QUALITY_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getJpegQuality() <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpegQuality()
	 * @generated
	 * @ordered
	 */
	protected int jpegQuality = JPEG_QUALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageFilter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageManipulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.IMAGE_MANIPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJpegQuality() {
		return jpegQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJpegQuality(int newJpegQuality) {
		int oldJpegQuality = jpegQuality;
		jpegQuality = newJpegQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_MANIPULATION__JPEG_QUALITY, oldJpegQuality, jpegQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ImageFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<ImageFilter>(ImageFilter.class, this, WebsitePackage.IMAGE_MANIPULATION__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.IMAGE_MANIPULATION__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				return getJpegQuality();
			case WebsitePackage.IMAGE_MANIPULATION__FILTERS:
				return getFilters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				setJpegQuality((Integer)newValue);
				return;
			case WebsitePackage.IMAGE_MANIPULATION__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends ImageFilter>)newValue);
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
			case WebsitePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				setJpegQuality(JPEG_QUALITY_EDEFAULT);
				return;
			case WebsitePackage.IMAGE_MANIPULATION__FILTERS:
				getFilters().clear();
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
			case WebsitePackage.IMAGE_MANIPULATION__JPEG_QUALITY:
				return jpegQuality != JPEG_QUALITY_EDEFAULT;
			case WebsitePackage.IMAGE_MANIPULATION__FILTERS:
				return filters != null && !filters.isEmpty();
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
		result.append(" (jpegQuality: ");
		result.append(jpegQuality);
		result.append(')');
		return result.toString();
	}

} //ImageManipulationImpl
