/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

import uk.ac.man.cs.mdsd.webgen.webui.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.webui.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.UpdateUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateUnitImpl extends EditUnitImpl implements UpdateUnit {
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView selectionType;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,update_unit";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

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
		return WebuiPackage.Literals.UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSelectionType() {
		if (selectionType != null && selectionType.eIsProxy()) {
			InternalEObject oldSelectionType = (InternalEObject)selectionType;
			selectionType = (EntityOrView)eResolveProxy(oldSelectionType);
			if (selectionType != oldSelectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
			}
		}
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(EntityOrView newSelectionType) {
		EntityOrView oldSelectionType = selectionType;
		selectionType = newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UPDATE_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.UPDATE_UNIT__SELECTION_TYPE:
				if (resolve) return getSelectionType();
				return basicGetSelectionType();
			case WebuiPackage.UPDATE_UNIT__STYLE_CLASS:
				return getStyleClass();
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
			case WebuiPackage.UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)newValue);
				return;
			case WebuiPackage.UPDATE_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case WebuiPackage.UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)null);
				return;
			case WebuiPackage.UPDATE_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case WebuiPackage.UPDATE_UNIT__SELECTION_TYPE:
				return selectionType != null;
			case WebuiPackage.UPDATE_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
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
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UPDATE_UNIT__SELECTION_TYPE: return WebuiPackage.SELECTABLE_UNIT__SELECTION_TYPE;
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
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.SELECTABLE_UNIT__SELECTION_TYPE: return WebuiPackage.UPDATE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //UpdateUnitImpl
