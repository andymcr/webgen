/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataUnitImpl.java,v 1.14 2014/07/10 08:11:26 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.website.DataUnit;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.UnitTitle;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataUnitImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataUnitImpl#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataUnitImpl extends DynamicUnitImpl implements DataUnit {
	/**
	 * The cached value of the '{@link #getDefaultSelection() <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection defaultSelection;
	/**
	 * The cached value of the '{@link #getDynamicTitle() <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicTitle()
	 * @generated
	 * @ordered
	 */
	protected UnitTitle dynamicTitle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.DATA_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getDefaultSelection() {
		if (defaultSelection != null && defaultSelection.eIsProxy()) {
			InternalEObject oldDefaultSelection = (InternalEObject)defaultSelection;
			defaultSelection = (Selection)eResolveProxy(oldDefaultSelection);
			if (defaultSelection != oldDefaultSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.DATA_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
			}
		}
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetDefaultSelection() {
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSelection(Selection newDefaultSelection) {
		Selection oldDefaultSelection = defaultSelection;
		defaultSelection = newDefaultSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTitle getDynamicTitle() {
		if (dynamicTitle != null && dynamicTitle.eIsProxy()) {
			InternalEObject oldDynamicTitle = (InternalEObject)dynamicTitle;
			dynamicTitle = (UnitTitle)eResolveProxy(oldDynamicTitle);
			if (dynamicTitle != oldDynamicTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.DATA_UNIT__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
			}
		}
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTitle basicGetDynamicTitle() {
		return dynamicTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicTitle(UnitTitle newDynamicTitle) {
		UnitTitle oldDynamicTitle = dynamicTitle;
		dynamicTitle = newDynamicTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_UNIT__DYNAMIC_TITLE, oldDynamicTitle, dynamicTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.DATA_UNIT__DEFAULT_SELECTION:
				if (resolve) return getDefaultSelection();
				return basicGetDefaultSelection();
			case WebsitePackage.DATA_UNIT__DYNAMIC_TITLE:
				if (resolve) return getDynamicTitle();
				return basicGetDynamicTitle();
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
			case WebsitePackage.DATA_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)newValue);
				return;
			case WebsitePackage.DATA_UNIT__DYNAMIC_TITLE:
				setDynamicTitle((UnitTitle)newValue);
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
			case WebsitePackage.DATA_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)null);
				return;
			case WebsitePackage.DATA_UNIT__DYNAMIC_TITLE:
				setDynamicTitle((UnitTitle)null);
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
			case WebsitePackage.DATA_UNIT__DEFAULT_SELECTION:
				return defaultSelection != null;
			case WebsitePackage.DATA_UNIT__DYNAMIC_TITLE:
				return dynamicTitle != null;
		}
		return super.eIsSet(featureID);
	}

} //DataUnitImpl
