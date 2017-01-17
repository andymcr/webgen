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

import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.waf.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectableUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.CreateUpdateUnitImpl#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateUpdateUnitImpl extends EditUnitImpl implements CreateUpdateUnit {
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
	 * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectAction> selectors;

	/**
	 * The default value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected String createUriElement = CREATE_URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected String clearLabel = CLEAR_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.CREATE_UPDATE_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getSelectors() {
		if (selectors == null) {
			selectors = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.CREATE_UPDATE_UNIT__SELECTORS, WafPackage.SELECT_ACTION__TARGET);
		}
		return selectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateUriElement() {
		return createUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateUriElement(String newCreateUriElement) {
		String oldCreateUriElement = createUriElement;
		createUriElement = newCreateUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT, oldCreateUriElement, createUriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClearLabel() {
		return clearLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearLabel(String newClearLabel) {
		String oldClearLabel = clearLabel;
		clearLabel = newClearLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL, oldClearLabel, clearLabel));
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectors()).basicAdd(otherEnd, msgs);
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				return ((InternalEList<?>)getSelectors()).basicRemove(otherEnd, msgs);
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				if (resolve) return getSelectionType();
				return basicGetSelectionType();
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				return getSelectors();
			case WafPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return getCreateUriElement();
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return getClearLabel();
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)newValue);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				getSelectors().clear();
				getSelectors().addAll((Collection<? extends SelectAction>)newValue);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement((String)newValue);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel((String)newValue);
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)null);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				getSelectors().clear();
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement(CREATE_URI_ELEMENT_EDEFAULT);
				return;
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel(CLEAR_LABEL_EDEFAULT);
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
			case WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE:
				return selectionType != null;
			case WafPackage.CREATE_UPDATE_UNIT__SELECTORS:
				return selectors != null && !selectors.isEmpty();
			case WafPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return CREATE_URI_ELEMENT_EDEFAULT == null ? createUriElement != null : !CREATE_URI_ELEMENT_EDEFAULT.equals(createUriElement);
			case WafPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return CLEAR_LABEL_EDEFAULT == null ? clearLabel != null : !CLEAR_LABEL_EDEFAULT.equals(clearLabel);
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
				case WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE: return WafPackage.SELECTABLE_UNIT__SELECTION_TYPE;
				case WafPackage.CREATE_UPDATE_UNIT__SELECTORS: return WafPackage.SELECTABLE_UNIT__SELECTORS;
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
				case WafPackage.SELECTABLE_UNIT__SELECTION_TYPE: return WafPackage.CREATE_UPDATE_UNIT__SELECTION_TYPE;
				case WafPackage.SELECTABLE_UNIT__SELECTORS: return WafPackage.CREATE_UPDATE_UNIT__SELECTORS;
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
		result.append(" (createUriElement: ");
		result.append(createUriElement);
		result.append(", clearLabel: ");
		result.append(clearLabel);
		result.append(')');
		return result.toString();
	}

} //CreateUpdateUnitImpl
