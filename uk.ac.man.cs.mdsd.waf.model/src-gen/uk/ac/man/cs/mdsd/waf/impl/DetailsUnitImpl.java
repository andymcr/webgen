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

import uk.ac.man.cs.mdsd.waf.DetailsUnit;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectableUnit;
import uk.ac.man.cs.mdsd.waf.SingletonUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Details Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.DetailsUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailsUnitImpl extends DataUnitImpl implements DetailsUnit {
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView contentType;

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
	public EntityOrView getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (EntityOrView)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.DETAILS_UNIT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(EntityOrView newContentType) {
		EntityOrView oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.DETAILS_UNIT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getSelectors() {
		if (selectors == null) {
			selectors = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.DETAILS_UNIT__SELECTORS, WafPackage.SELECT_ACTION__TARGET);
		}
		return selectors;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.DETAILS_UNIT__SELECTORS:
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
			case WafPackage.DETAILS_UNIT__SELECTORS:
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
			case WafPackage.DETAILS_UNIT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case WafPackage.DETAILS_UNIT__SELECTORS:
				return getSelectors();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WafPackage.DETAILS_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)newValue);
				return;
			case WafPackage.DETAILS_UNIT__SELECTORS:
				getSelectors().clear();
				getSelectors().addAll((Collection<? extends SelectAction>)newValue);
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
			case WafPackage.DETAILS_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)null);
				return;
			case WafPackage.DETAILS_UNIT__SELECTORS:
				getSelectors().clear();
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
			case WafPackage.DETAILS_UNIT__CONTENT_TYPE:
				return contentType != null;
			case WafPackage.DETAILS_UNIT__SELECTORS:
				return selectors != null && !selectors.isEmpty();
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SingletonUnit.class) {
			switch (derivedFeatureID) {
				case WafPackage.DETAILS_UNIT__CONTENT_TYPE: return WafPackage.SINGLETON_UNIT__CONTENT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WafPackage.DETAILS_UNIT__SELECTORS: return WafPackage.SELECTABLE_UNIT__SELECTORS;
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
		if (baseClass == SingletonUnit.class) {
			switch (baseFeatureID) {
				case WafPackage.SINGLETON_UNIT__CONTENT_TYPE: return WafPackage.DETAILS_UNIT__CONTENT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WafPackage.SELECTABLE_UNIT__SELECTORS: return WafPackage.DETAILS_UNIT__SELECTORS;
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
		result.append(" (omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(')');
		return result.toString();
	}

} //DetailsUnitImpl
