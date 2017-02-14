/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Feature;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

import uk.ac.man.cs.mdsd.webgen.webui.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.webui.WebGenWebUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DynamicMenuImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicMenuImpl extends MenuImpl implements DynamicMenu {
	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Feature title;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenWebUIPackage.Literals.DYNAMIC_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenWebUIPackage.DYNAMIC_MENU__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.DYNAMIC_MENU__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Feature)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenWebUIPackage.DYNAMIC_MENU__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Feature newTitle) {
		Feature oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenWebUIPackage.DYNAMIC_MENU__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebGenWebUIPackage.DYNAMIC_MENU__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebGenWebUIPackage.DYNAMIC_MENU__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
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
			case WebGenWebUIPackage.DYNAMIC_MENU__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WebGenWebUIPackage.DYNAMIC_MENU__TITLE:
				setTitle((Feature)newValue);
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
			case WebGenWebUIPackage.DYNAMIC_MENU__SELECTION:
				setSelection((Selection)null);
				return;
			case WebGenWebUIPackage.DYNAMIC_MENU__TITLE:
				setTitle((Feature)null);
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
			case WebGenWebUIPackage.DYNAMIC_MENU__SELECTION:
				return selection != null;
			case WebGenWebUIPackage.DYNAMIC_MENU__TITLE:
				return title != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicMenuImpl
