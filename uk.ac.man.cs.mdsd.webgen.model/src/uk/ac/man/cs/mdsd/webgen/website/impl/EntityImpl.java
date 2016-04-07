/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.16 2014/01/30 16:43:49 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getEntityFeatures <em>Entity Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getAssociationEnds <em>Association Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EntityOrViewImpl implements Entity {
	/**
	 * The cached value of the '{@link #getEntityFeatures() <em>Entity Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityFeature> entityFeatures;

	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAssociation> associationEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityFeature> getEntityFeatures() {
		if (entityFeatures == null) {
			entityFeatures = new EObjectContainmentWithInverseEList<EntityFeature>(EntityFeature.class, this, WebsitePackage.ENTITY__ENTITY_FEATURES, WebsitePackage.ENTITY_FEATURE__PART_OF);
		}
		return entityFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityAssociation> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectWithInverseResolvingEList<EntityAssociation>(EntityAssociation.class, this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY);
		}
		return associationEnds;
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityFeatures()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnds()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				return ((InternalEList<?>)getEntityFeatures()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				return getEntityFeatures();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return getAssociationEnds();
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				getEntityFeatures().clear();
				getEntityFeatures().addAll((Collection<? extends EntityFeature>)newValue);
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends EntityAssociation>)newValue);
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				getEntityFeatures().clear();
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
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
			case WebsitePackage.ENTITY__ENTITY_FEATURES:
				return entityFeatures != null && !entityFeatures.isEmpty();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
