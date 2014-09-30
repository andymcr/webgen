/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionElementImpl.java,v 1.3 2013/04/23 16:50:15 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.CollectionElement;
import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionElementImpl#getCollectionType <em>Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionElementImpl extends CollectionAttributeImpl implements CollectionElement {
	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected CollectionType collectionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.COLLECTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType getCollectionType() {
		if (collectionType != null && collectionType.eIsProxy()) {
			InternalEObject oldCollectionType = (InternalEObject)collectionType;
			collectionType = (CollectionType)eResolveProxy(oldCollectionType);
			if (collectionType != oldCollectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE, oldCollectionType, collectionType));
			}
		}
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType basicGetCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(CollectionType newCollectionType) {
		CollectionType oldCollectionType = collectionType;
		collectionType = newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE:
				if (resolve) return getCollectionType();
				return basicGetCollectionType();
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
			case OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE:
				setCollectionType((CollectionType)newValue);
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
			case OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE:
				setCollectionType((CollectionType)null);
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
			case OrmPackage.COLLECTION_ELEMENT__COLLECTION_TYPE:
				return collectionType != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionElementImpl
