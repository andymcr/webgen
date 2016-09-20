/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.waf.SelectEntityOrView;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.SelectEntityOrViewImpl#getEntityOrView <em>Entity Or View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectEntityOrViewImpl extends SelectFieldImpl implements SelectEntityOrView {
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
	protected SelectEntityOrViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.SELECT_ENTITY_OR_VIEW;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW, oldEntityOrView, entityOrView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW, oldEntityOrView, entityOrView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW:
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
			case WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW:
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
			case WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW:
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
			case WafPackage.SELECT_ENTITY_OR_VIEW__ENTITY_OR_VIEW:
				return entityOrView != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectEntityOrViewImpl
