/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelectTargetImpl.java,v 1.2 2010/03/25 23:53:51 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.SelectTarget;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.SelectTargetImpl#getSelectionFeature <em>Selection Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SelectTargetImpl extends EObjectImpl implements SelectTarget {
	/**
	 * The cached value of the '{@link #getSelectionFeature() <em>Selection Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFeature()
	 * @generated
	 * @ordered
	 */
	protected Attribute selectionFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SELECT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSelectionFeature() {
		if (selectionFeature != null && selectionFeature.eIsProxy()) {
			InternalEObject oldSelectionFeature = (InternalEObject)selectionFeature;
			selectionFeature = (Attribute)eResolveProxy(oldSelectionFeature);
			if (selectionFeature != oldSelectionFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SELECT_TARGET__SELECTION_FEATURE, oldSelectionFeature, selectionFeature));
			}
		}
		return selectionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSelectionFeature() {
		return selectionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionFeature(Attribute newSelectionFeature) {
		Attribute oldSelectionFeature = selectionFeature;
		selectionFeature = newSelectionFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SELECT_TARGET__SELECTION_FEATURE, oldSelectionFeature, selectionFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURE:
				setSelectionFeature((Attribute)newValue);
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
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURE:
				setSelectionFeature((Attribute)null);
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
			case WebsitePackage.SELECT_TARGET__SELECTION_FEATURE:
				return selectionFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectTargetImpl
