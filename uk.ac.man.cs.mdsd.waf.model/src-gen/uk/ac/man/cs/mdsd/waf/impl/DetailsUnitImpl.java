/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.DetailsUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailsUnitImpl extends DataUnitImpl implements DetailsUnit {
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
	 * The default value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_FIELD_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitFieldLabels = OMIT_FIELD_LABELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.DETAILS_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY, oldOnlyDisplayWhenNotEmpty, onlyDisplayWhenNotEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitFieldLabels() {
		return omitFieldLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitFieldLabels(boolean newOmitFieldLabels) {
		boolean oldOmitFieldLabels = omitFieldLabels;
		omitFieldLabels = newOmitFieldLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS, oldOmitFieldLabels, omitFieldLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return isOnlyDisplayWhenNotEmpty();
			case WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
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
			case WafPackage.DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty((Boolean)newValue);
				return;
			case WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels((Boolean)newValue);
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
			case WafPackage.DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty(ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT);
				return;
			case WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels(OMIT_FIELD_LABELS_EDEFAULT);
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
			case WafPackage.DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return onlyDisplayWhenNotEmpty != ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;
			case WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
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
		result.append(", omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(')');
		return result.toString();
	}

} //DetailsUnitImpl
