/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.waf.DynamicUnit;
import uk.ac.man.cs.mdsd.waf.Selection;
import uk.ac.man.cs.mdsd.waf.Service;
import uk.ac.man.cs.mdsd.waf.ServiceFeature;
import uk.ac.man.cs.mdsd.waf.ServiceFeatureReference;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ServiceImpl#getAccessedBy <em>Accessed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getEncapsulates() <em>Encapsulates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulates()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> encapsulates;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFeature> features;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFeatureReference> keys;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

	/**
	 * The cached value of the '{@link #getAccessedBy() <em>Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicUnit> accessedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOrView> getEncapsulates() {
		if (encapsulates == null) {
			encapsulates = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WafPackage.SERVICE__ENCAPSULATES);
		}
		return encapsulates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ServiceFeature>(ServiceFeature.class, this, WafPackage.SERVICE__FEATURES, WafPackage.SERVICE_FEATURE__PART_OF);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceFeatureReference> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<ServiceFeatureReference>(ServiceFeatureReference.class, this, WafPackage.SERVICE__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentEList<Selection>(Selection.class, this, WafPackage.SERVICE__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicUnit> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectWithInverseResolvingEList<DynamicUnit>(DynamicUnit.class, this, WafPackage.SERVICE__ACCESSED_BY, WafPackage.DYNAMIC_UNIT__SERVICE);
		}
		return accessedBy;
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
			case WafPackage.SERVICE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case WafPackage.SERVICE__ACCESSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessedBy()).basicAdd(otherEnd, msgs);
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
			case WafPackage.SERVICE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case WafPackage.SERVICE__ACCESSED_BY:
				return ((InternalEList<?>)getAccessedBy()).basicRemove(otherEnd, msgs);
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
			case WafPackage.SERVICE__ENCAPSULATES:
				return getEncapsulates();
			case WafPackage.SERVICE__FEATURES:
				return getFeatures();
			case WafPackage.SERVICE__KEYS:
				return getKeys();
			case WafPackage.SERVICE__SELECTIONS:
				return getSelections();
			case WafPackage.SERVICE__ACCESSED_BY:
				return getAccessedBy();
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
			case WafPackage.SERVICE__ENCAPSULATES:
				getEncapsulates().clear();
				getEncapsulates().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WafPackage.SERVICE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ServiceFeature>)newValue);
				return;
			case WafPackage.SERVICE__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends ServiceFeatureReference>)newValue);
				return;
			case WafPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case WafPackage.SERVICE__ACCESSED_BY:
				getAccessedBy().clear();
				getAccessedBy().addAll((Collection<? extends DynamicUnit>)newValue);
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
			case WafPackage.SERVICE__ENCAPSULATES:
				getEncapsulates().clear();
				return;
			case WafPackage.SERVICE__FEATURES:
				getFeatures().clear();
				return;
			case WafPackage.SERVICE__KEYS:
				getKeys().clear();
				return;
			case WafPackage.SERVICE__SELECTIONS:
				getSelections().clear();
				return;
			case WafPackage.SERVICE__ACCESSED_BY:
				getAccessedBy().clear();
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
			case WafPackage.SERVICE__ENCAPSULATES:
				return encapsulates != null && !encapsulates.isEmpty();
			case WafPackage.SERVICE__FEATURES:
				return features != null && !features.isEmpty();
			case WafPackage.SERVICE__KEYS:
				return keys != null && !keys.isEmpty();
			case WafPackage.SERVICE__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case WafPackage.SERVICE__ACCESSED_BY:
				return accessedBy != null && !accessedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
