/**
 */
package uk.ac.man.cs.mdsd.rest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.rest.Resource;
import uk.ac.man.cs.mdsd.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.rest.impl.ResourceImpl#getEntityOrView <em>Entity Or View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The cached value of the '{@link #getEntityOrView() <em>Entity Or View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityOrView()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView entityOrView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getEntityOrView() {
		if (entityOrView != null && entityOrView.eIsProxy()) {
			InternalEObject oldEntityOrView = (InternalEObject)entityOrView;
			entityOrView = (EntityOrView)eResolveProxy(oldEntityOrView);
			if (entityOrView != oldEntityOrView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestPackage.RESOURCE__ENTITY_OR_VIEW, oldEntityOrView, entityOrView));
			}
		}
		return entityOrView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetEntityOrView() {
		return entityOrView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityOrView(EntityOrView newEntityOrView) {
		EntityOrView oldEntityOrView = entityOrView;
		entityOrView = newEntityOrView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.RESOURCE__ENTITY_OR_VIEW, oldEntityOrView, entityOrView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.RESOURCE__ENTITY_OR_VIEW:
				if (resolve) return getEntityOrView();
				return basicGetEntityOrView();
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
			case RestPackage.RESOURCE__ENTITY_OR_VIEW:
				setEntityOrView((EntityOrView)newValue);
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
			case RestPackage.RESOURCE__ENTITY_OR_VIEW:
				setEntityOrView((EntityOrView)null);
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
			case RestPackage.RESOURCE__ENTITY_OR_VIEW:
				return entityOrView != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
