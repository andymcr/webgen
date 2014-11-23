/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenFeatureImpl.java,v 1.8 2014/01/25 17:38:12 andy Exp $
 */
package uk.ac.man.cs.mdsd.genorm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.genorm.GenEntity;
import uk.ac.man.cs.mdsd.genorm.GenFeature;
import uk.ac.man.cs.mdsd.genorm.GenOrmPackage;
import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.genorm.impl.GenFeatureImpl#getGenParentEntity <em>Gen Parent Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GenFeatureImpl extends NamedElementImpl implements GenFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenOrmPackage.Literals.GEN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenEntity getGenParentEntity() {
		if (eContainerFeatureID() != GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY) return null;
		return (GenEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenParentEntity(GenEntity newGenParentEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenParentEntity, GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenParentEntity(GenEntity newGenParentEntity) {
		if (newGenParentEntity != eInternalContainer() || (eContainerFeatureID() != GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY && newGenParentEntity != null)) {
			if (EcoreUtil.isAncestor(this, newGenParentEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenParentEntity != null)
				msgs = ((InternalEObject)newGenParentEntity).eInverseAdd(this, GenOrmPackage.GEN_ENTITY__GEN_FEATURES, GenEntity.class, msgs);
			msgs = basicSetGenParentEntity(newGenParentEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY, newGenParentEntity, newGenParentEntity));
	}

	public void reconcile(final GenFeature oldGenFeature) {
		reconcileSettings(oldGenFeature);
	}

	protected void reconcileSettings(final GenFeature oldGenFeature) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenParentEntity((GenEntity)otherEnd, msgs);
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
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				return basicSetGenParentEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				return eInternalContainer().eInverseRemove(this, GenOrmPackage.GEN_ENTITY__GEN_FEATURES, GenEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				return getGenParentEntity();
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
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				setGenParentEntity((GenEntity)newValue);
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
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				setGenParentEntity((GenEntity)null);
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
			case GenOrmPackage.GEN_FEATURE__GEN_PARENT_ENTITY:
				return getGenParentEntity() != null;
		}
		return super.eIsSet(featureID);
	}

} //GenFeatureImpl
