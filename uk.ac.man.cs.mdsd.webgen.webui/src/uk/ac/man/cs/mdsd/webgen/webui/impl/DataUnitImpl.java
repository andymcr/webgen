/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

import uk.ac.man.cs.mdsd.webgen.webui.DataUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.DataUnitImpl#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Label title;

	/**
	 * The default value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyDisplayWhenNotEmpty = ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;

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
		return WebuiPackage.Literals.DATA_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.DATA_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DATA_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Label)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.DATA_UNIT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Label newTitle) {
		Label oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DATA_UNIT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyDisplayWhenNotEmpty() {
		return onlyDisplayWhenNotEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyDisplayWhenNotEmpty(boolean newOnlyDisplayWhenNotEmpty) {
		boolean oldOnlyDisplayWhenNotEmpty = onlyDisplayWhenNotEmpty;
		onlyDisplayWhenNotEmpty = newOnlyDisplayWhenNotEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY, oldOnlyDisplayWhenNotEmpty, onlyDisplayWhenNotEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.DATA_UNIT__DEFAULT_SELECTION:
				if (resolve) return getDefaultSelection();
				return basicGetDefaultSelection();
			case WebuiPackage.DATA_UNIT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return isOnlyDisplayWhenNotEmpty();
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
			case WebuiPackage.DATA_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)newValue);
				return;
			case WebuiPackage.DATA_UNIT__TITLE:
				setTitle((Label)newValue);
				return;
			case WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty((Boolean)newValue);
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
			case WebuiPackage.DATA_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)null);
				return;
			case WebuiPackage.DATA_UNIT__TITLE:
				setTitle((Label)null);
				return;
			case WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty(ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT);
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
			case WebuiPackage.DATA_UNIT__DEFAULT_SELECTION:
				return defaultSelection != null;
			case WebuiPackage.DATA_UNIT__TITLE:
				return title != null;
			case WebuiPackage.DATA_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return onlyDisplayWhenNotEmpty != ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;
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
		result.append(" (onlyDisplayWhenNotEmpty: ");
		result.append(onlyDisplayWhenNotEmpty);
		result.append(')');
		return result.toString();
	}

} //DataUnitImpl
