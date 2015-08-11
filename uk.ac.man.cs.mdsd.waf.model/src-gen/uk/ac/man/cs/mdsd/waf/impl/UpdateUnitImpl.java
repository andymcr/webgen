/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectTarget;
import uk.ac.man.cs.mdsd.waf.ServiceEntityElement;
import uk.ac.man.cs.mdsd.waf.UpdateUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl#getTargettingActions <em>Targetting Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.UpdateUnitImpl#getSelectionFeature <em>Selection Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateUnitImpl extends EditUnitImpl implements UpdateUnit {
	/**
	 * The cached value of the '{@link #getTargettingActions() <em>Targetting Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargettingActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectAction> targettingActions;

	/**
	 * The cached value of the '{@link #getSelectionFeature() <em>Selection Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement selectionFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getTargettingActions() {
		if (targettingActions == null) {
			targettingActions = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS, WafPackage.SELECT_ACTION__TARGET);
		}
		return targettingActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement getSelectionFeature() {
		if (selectionFeature != null && selectionFeature.eIsProxy()) {
			InternalEObject oldSelectionFeature = (InternalEObject)selectionFeature;
			selectionFeature = (ServiceEntityElement)eResolveProxy(oldSelectionFeature);
			if (selectionFeature != oldSelectionFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.UPDATE_UNIT__SELECTION_FEATURE, oldSelectionFeature, selectionFeature));
			}
		}
		return selectionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetSelectionFeature() {
		return selectionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionFeature(ServiceEntityElement newSelectionFeature) {
		ServiceEntityElement oldSelectionFeature = selectionFeature;
		selectionFeature = newSelectionFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.UPDATE_UNIT__SELECTION_FEATURE, oldSelectionFeature, selectionFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargettingActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				return ((InternalEList<?>)getTargettingActions()).basicRemove(otherEnd, msgs);
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
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				return getTargettingActions();
			case WafPackage.UPDATE_UNIT__SELECTION_FEATURE:
				if (resolve) return getSelectionFeature();
				return basicGetSelectionFeature();
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
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				getTargettingActions().addAll((Collection<? extends SelectAction>)newValue);
				return;
			case WafPackage.UPDATE_UNIT__SELECTION_FEATURE:
				setSelectionFeature((ServiceEntityElement)newValue);
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
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				getTargettingActions().clear();
				return;
			case WafPackage.UPDATE_UNIT__SELECTION_FEATURE:
				setSelectionFeature((ServiceEntityElement)null);
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
			case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS:
				return targettingActions != null && !targettingActions.isEmpty();
			case WafPackage.UPDATE_UNIT__SELECTION_FEATURE:
				return selectionFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SelectTarget.class) {
			switch (derivedFeatureID) {
				case WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS: return WafPackage.SELECT_TARGET__TARGETTING_ACTIONS;
				case WafPackage.UPDATE_UNIT__SELECTION_FEATURE: return WafPackage.SELECT_TARGET__SELECTION_FEATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SelectTarget.class) {
			switch (baseFeatureID) {
				case WafPackage.SELECT_TARGET__TARGETTING_ACTIONS: return WafPackage.UPDATE_UNIT__TARGETTING_ACTIONS;
				case WafPackage.SELECT_TARGET__SELECTION_FEATURE: return WafPackage.UPDATE_UNIT__SELECTION_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UpdateUnitImpl
