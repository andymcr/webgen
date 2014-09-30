/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionAssociationImpl.java,v 1.5 2011/03/31 18:12:20 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.CollectionAssociation;
import uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships;
import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionAssociationImpl#getAssociationRelationship <em>Association Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionAssociationImpl extends AssociationImpl implements CollectionAssociation {
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
	 * The default value of the '{@link #getAssociationRelationship() <em>Association Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionAssociationRelationships ASSOCIATION_RELATIONSHIP_EDEFAULT = CollectionAssociationRelationships.ONE_TO_MANY;

	/**
	 * The cached value of the '{@link #getAssociationRelationship() <em>Association Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRelationship()
	 * @generated
	 * @ordered
	 */
	protected CollectionAssociationRelationships associationRelationship = ASSOCIATION_RELATIONSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.COLLECTION_ASSOCIATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE, oldCollectionType, collectionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAssociationRelationships getAssociationRelationship() {
		return associationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationRelationship(CollectionAssociationRelationships newAssociationRelationship) {
		CollectionAssociationRelationships oldAssociationRelationship = associationRelationship;
		associationRelationship = newAssociationRelationship == null ? ASSOCIATION_RELATIONSHIP_EDEFAULT : newAssociationRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP, oldAssociationRelationship, associationRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE:
				if (resolve) return getCollectionType();
				return basicGetCollectionType();
			case OrmPackage.COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
				return getAssociationRelationship();
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
			case OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE:
				setCollectionType((CollectionType)newValue);
				return;
			case OrmPackage.COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
				setAssociationRelationship((CollectionAssociationRelationships)newValue);
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
			case OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE:
				setCollectionType((CollectionType)null);
				return;
			case OrmPackage.COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
				setAssociationRelationship(ASSOCIATION_RELATIONSHIP_EDEFAULT);
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
			case OrmPackage.COLLECTION_ASSOCIATION__COLLECTION_TYPE:
				return collectionType != null;
			case OrmPackage.COLLECTION_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
				return associationRelationship != ASSOCIATION_RELATIONSHIP_EDEFAULT;
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
		result.append(" (associationRelationship: ");
		result.append(associationRelationship);
		result.append(')');
		return result.toString();
	}

} //CollectionAssociationImpl
