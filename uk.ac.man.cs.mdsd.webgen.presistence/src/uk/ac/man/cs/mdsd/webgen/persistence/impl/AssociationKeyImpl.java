/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl#getKeyFor <em>Key For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationKeyImpl#getTargetColumnName <em>Target Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationKeyImpl extends MinimalEObjectImpl.Container implements AssociationKey {
	/**
	 * The cached value of the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected EntityFeature sourceFeature;

	/**
	 * The cached value of the '{@link #getTargetFeature() <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected EntityFeature targetFeature;

	/**
	 * The default value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected String targetColumnName = TARGET_COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ASSOCIATION_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociation getKeyFor() {
		if (eContainerFeatureID() != PersistencePackage.ASSOCIATION_KEY__KEY_FOR) return null;
		return (EntityAssociation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyFor(EntityAssociation newKeyFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newKeyFor, PersistencePackage.ASSOCIATION_KEY__KEY_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFor(EntityAssociation newKeyFor) {
		if (newKeyFor != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.ASSOCIATION_KEY__KEY_FOR && newKeyFor != null)) {
			if (EcoreUtil.isAncestor(this, newKeyFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newKeyFor != null)
				msgs = ((InternalEObject)newKeyFor).eInverseAdd(this, PersistencePackage.ENTITY_ASSOCIATION__KEYS, EntityAssociation.class, msgs);
			msgs = basicSetKeyFor(newKeyFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_KEY__KEY_FOR, newKeyFor, newKeyFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFeature getSourceFeature() {
		if (sourceFeature != null && sourceFeature.eIsProxy()) {
			InternalEObject oldSourceFeature = (InternalEObject)sourceFeature;
			sourceFeature = (EntityFeature)eResolveProxy(oldSourceFeature);
			if (sourceFeature != oldSourceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
			}
		}
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFeature basicGetSourceFeature() {
		return sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(EntityFeature newSourceFeature) {
		EntityFeature oldSourceFeature = sourceFeature;
		sourceFeature = newSourceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE, oldSourceFeature, sourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFeature getTargetFeature() {
		if (targetFeature != null && targetFeature.eIsProxy()) {
			InternalEObject oldTargetFeature = (InternalEObject)targetFeature;
			targetFeature = (EntityFeature)eResolveProxy(oldTargetFeature);
			if (targetFeature != oldTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE, oldTargetFeature, targetFeature));
			}
		}
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFeature basicGetTargetFeature() {
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeature(EntityFeature newTargetFeature) {
		EntityFeature oldTargetFeature = targetFeature;
		targetFeature = newTargetFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE, oldTargetFeature, targetFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetColumnName() {
		return targetColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetColumnName(String newTargetColumnName) {
		String oldTargetColumnName = targetColumnName;
		targetColumnName = newTargetColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME, oldTargetColumnName, targetColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetKeyFor((EntityAssociation)otherEnd, msgs);
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				return basicSetKeyFor(null, msgs);
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.ENTITY_ASSOCIATION__KEYS, EntityAssociation.class, msgs);
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				return getKeyFor();
			case PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE:
				if (resolve) return getTargetFeature();
				return basicGetTargetFeature();
			case PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME:
				return getTargetColumnName();
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				setKeyFor((EntityAssociation)newValue);
				return;
			case PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE:
				setSourceFeature((EntityFeature)newValue);
				return;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE:
				setTargetFeature((EntityFeature)newValue);
				return;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME:
				setTargetColumnName((String)newValue);
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				setKeyFor((EntityAssociation)null);
				return;
			case PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE:
				setSourceFeature((EntityFeature)null);
				return;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE:
				setTargetFeature((EntityFeature)null);
				return;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME:
				setTargetColumnName(TARGET_COLUMN_NAME_EDEFAULT);
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
			case PersistencePackage.ASSOCIATION_KEY__KEY_FOR:
				return getKeyFor() != null;
			case PersistencePackage.ASSOCIATION_KEY__SOURCE_FEATURE:
				return sourceFeature != null;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_FEATURE:
				return targetFeature != null;
			case PersistencePackage.ASSOCIATION_KEY__TARGET_COLUMN_NAME:
				return TARGET_COLUMN_NAME_EDEFAULT == null ? targetColumnName != null : !TARGET_COLUMN_NAME_EDEFAULT.equals(targetColumnName);
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
		result.append(" (targetColumnName: ");
		result.append(targetColumnName);
		result.append(')');
		return result.toString();
	}

} //AssociationKeyImpl
