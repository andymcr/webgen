/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceImpl.java,v 1.14 2014/03/04 19:42:24 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeatureReference;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceImpl#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceImpl#getSelections <em>Selections</em>}</li>
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
		return WebsitePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityOrView> getEncapsulates() {
		if (encapsulates == null) {
			encapsulates = new EObjectWithInverseResolvingEList.ManyInverse<EntityOrView>(EntityOrView.class, this, WebsitePackage.SERVICE__ENCAPSULATES, WebsitePackage.ENTITY_OR_VIEW__SERVED_BY);
		}
		return encapsulates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, WebsitePackage.SERVICE__SELECTIONS, WebsitePackage.SELECTION__USED_BY);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ServiceFeature>(ServiceFeature.class, this, WebsitePackage.SERVICE__FEATURES, WebsitePackage.SERVICE_FEATURE__PART_OF);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceFeatureReference> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<ServiceFeatureReference>(ServiceFeatureReference.class, this, WebsitePackage.SERVICE__KEYS);
		}
		return keys;
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulates()).basicAdd(otherEnd, msgs);
			case WebsitePackage.SERVICE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case WebsitePackage.SERVICE__SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelections()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				return ((InternalEList<?>)getEncapsulates()).basicRemove(otherEnd, msgs);
			case WebsitePackage.SERVICE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WebsitePackage.SERVICE__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
			case WebsitePackage.SERVICE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				return getEncapsulates();
			case WebsitePackage.SERVICE__FEATURES:
				return getFeatures();
			case WebsitePackage.SERVICE__KEYS:
				return getKeys();
			case WebsitePackage.SERVICE__SELECTIONS:
				return getSelections();
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				getEncapsulates().clear();
				getEncapsulates().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.SERVICE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ServiceFeature>)newValue);
				return;
			case WebsitePackage.SERVICE__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends ServiceFeatureReference>)newValue);
				return;
			case WebsitePackage.SERVICE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				getEncapsulates().clear();
				return;
			case WebsitePackage.SERVICE__FEATURES:
				getFeatures().clear();
				return;
			case WebsitePackage.SERVICE__KEYS:
				getKeys().clear();
				return;
			case WebsitePackage.SERVICE__SELECTIONS:
				getSelections().clear();
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
			case WebsitePackage.SERVICE__ENCAPSULATES:
				return encapsulates != null && !encapsulates.isEmpty();
			case WebsitePackage.SERVICE__FEATURES:
				return features != null && !features.isEmpty();
			case WebsitePackage.SERVICE__KEYS:
				return keys != null && !keys.isEmpty();
			case WebsitePackage.SERVICE__SELECTIONS:
				return selections != null && !selections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
