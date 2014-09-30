/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonAssociationImpl.java,v 1.5 2011/03/31 18:12:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.SingletonAssociation;
import uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonAssociationImpl#getAssociationRelationship <em>Association Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingletonAssociationImpl extends AssociationImpl implements SingletonAssociation {
	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationRelationship() <em>Association Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final SingletonAssociationRelationships ASSOCIATION_RELATIONSHIP_EDEFAULT = SingletonAssociationRelationships.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getAssociationRelationship() <em>Association Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRelationship()
	 * @generated
	 * @ordered
	 */
	protected SingletonAssociationRelationships associationRelationship = ASSOCIATION_RELATIONSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.SINGLETON_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_ASSOCIATION__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonAssociationRelationships getAssociationRelationship() {
		return associationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationRelationship(SingletonAssociationRelationships newAssociationRelationship) {
		SingletonAssociationRelationships oldAssociationRelationship = associationRelationship;
		associationRelationship = newAssociationRelationship == null ? ASSOCIATION_RELATIONSHIP_EDEFAULT : newAssociationRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP, oldAssociationRelationship, associationRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.SINGLETON_ASSOCIATION__REQUIRED:
				return isRequired();
			case OrmPackage.SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
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
			case OrmPackage.SINGLETON_ASSOCIATION__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case OrmPackage.SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
				setAssociationRelationship((SingletonAssociationRelationships)newValue);
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
			case OrmPackage.SINGLETON_ASSOCIATION__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case OrmPackage.SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
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
			case OrmPackage.SINGLETON_ASSOCIATION__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case OrmPackage.SINGLETON_ASSOCIATION__ASSOCIATION_RELATIONSHIP:
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
		result.append(" (required: ");
		result.append(required);
		result.append(", associationRelationship: ");
		result.append(associationRelationship);
		result.append(')');
		return result.toString();
	}

} //SingletonAssociationImpl
