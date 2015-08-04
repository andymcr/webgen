/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.MenuIncludedElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Included Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MenuIncludedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MenuIncludedElementImpl#getServiceElement <em>Service Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuIncludedElementImpl extends MenuIncludedFeatureImpl implements MenuIncludedElement {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.MENU_INCLUDED_ELEMENT__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getServiceElement() <em>Service Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceElement()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement serviceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuIncludedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.MENU_INCLUDED_ELEMENT;
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
	public ServiceEntityElement getServiceElement() {
		if (serviceElement != null && serviceElement.eIsProxy()) {
			InternalEObject oldServiceElement = (InternalEObject)serviceElement;
			serviceElement = (ServiceEntityElement)eResolveProxy(oldServiceElement);
			if (serviceElement != oldServiceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT, oldServiceElement, serviceElement));
			}
		}
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetServiceElement() {
		return serviceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceElement(ServiceEntityElement newServiceElement) {
		ServiceEntityElement oldServiceElement = serviceElement;
		serviceElement = newServiceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT, oldServiceElement, serviceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.MENU_INCLUDED_ELEMENT__NAME:
				return getName();
			case WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT:
				if (resolve) return getServiceElement();
				return basicGetServiceElement();
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
			case WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT:
				setServiceElement((ServiceEntityElement)newValue);
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
			case WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT:
				setServiceElement((ServiceEntityElement)null);
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
			case WebsitePackage.MENU_INCLUDED_ELEMENT__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.MENU_INCLUDED_ELEMENT__SERVICE_ELEMENT:
				return serviceElement != null;
		}
		return super.eIsSet(featureID);
	}

} //MenuIncludedElementImpl
