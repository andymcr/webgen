/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.UnitChildElement;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Child Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitChildElementImpl#getServiceFeature <em>Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitChildElementImpl extends UnitChildFeatureImpl implements UnitChildElement {
	/**
	 * The cached value of the '{@link #getServiceFeature() <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement serviceFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitChildElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.UNIT_CHILD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getServiceFeature() {
		if (serviceFeature != null && serviceFeature.eIsProxy()) {
			InternalEObject oldServiceFeature = (InternalEObject)serviceFeature;
			serviceFeature = (ServiceEntityElement)eResolveProxy(oldServiceFeature);
			if (serviceFeature != oldServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
			}
		}
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetServiceFeature() {
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFeature(ServiceEntityElement newServiceFeature) {
		ServiceEntityElement oldServiceFeature = serviceFeature;
		serviceFeature = newServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE:
				if (resolve) return getServiceFeature();
				return basicGetServiceFeature();
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
			case WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE:
				setServiceFeature((ServiceEntityElement)newValue);
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
			case WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE:
				setServiceFeature((ServiceEntityElement)null);
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
			case WebsitePackage.UNIT_CHILD_ELEMENT__SERVICE_FEATURE:
				return serviceFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitChildElementImpl
