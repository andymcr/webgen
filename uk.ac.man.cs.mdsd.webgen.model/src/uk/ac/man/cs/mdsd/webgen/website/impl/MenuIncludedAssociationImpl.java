/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.MenuIncludedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Included Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MenuIncludedAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MenuIncludedAssociationImpl#getServiceAssociation <em>Service Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuIncludedAssociationImpl extends MenuIncludedFeatureImpl implements MenuIncludedAssociation {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.MENU_INCLUDED_ASSOCIATION__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getServiceAssociation() <em>Service Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAssociation()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityAssociation serviceAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuIncludedAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.MENU_INCLUDED_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityAssociation getServiceAssociation() {
		if (serviceAssociation != null && serviceAssociation.eIsProxy()) {
			InternalEObject oldServiceAssociation = (InternalEObject)serviceAssociation;
			serviceAssociation = (ServiceEntityAssociation)eResolveProxy(oldServiceAssociation);
			if (serviceAssociation != oldServiceAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION, oldServiceAssociation, serviceAssociation));
			}
		}
		return serviceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityAssociation basicGetServiceAssociation() {
		return serviceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceAssociation(ServiceEntityAssociation newServiceAssociation) {
		ServiceEntityAssociation oldServiceAssociation = serviceAssociation;
		serviceAssociation = newServiceAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION, oldServiceAssociation, serviceAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__NAME:
				return getName();
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION:
				if (resolve) return getServiceAssociation();
				return basicGetServiceAssociation();
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
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION:
				setServiceAssociation((ServiceEntityAssociation)newValue);
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
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION:
				setServiceAssociation((ServiceEntityAssociation)null);
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
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.MENU_INCLUDED_ASSOCIATION__SERVICE_ASSOCIATION:
				return serviceAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //MenuIncludedAssociationImpl
