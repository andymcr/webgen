/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.Cardinality;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Without Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithoutContainmentImpl#isTargetUnique <em>Target Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationWithoutContainmentImpl extends EntityAssociationImpl implements AssociationWithoutContainment {
	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality TARGET_CARDINALITY_EDEFAULT = Cardinality.REQUIRED;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean targetUnique = TARGET_UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationWithoutContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(Cardinality newTargetCardinality) {
		Cardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetUnique() {
		return targetUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUnique(boolean newTargetUnique) {
		boolean oldTargetUnique = targetUnique;
		targetUnique = newTargetUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE, oldTargetUnique, targetUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				return getTargetCardinality();
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				return isTargetUnique();
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
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)newValue);
				return;
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				setTargetUnique((Boolean)newValue);
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
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				setTargetUnique(TARGET_UNIQUE_EDEFAULT);
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
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				return targetUnique != TARGET_UNIQUE_EDEFAULT;
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
		result.append(" (targetCardinality: ");
		result.append(targetCardinality);
		result.append(", targetUnique: ");
		result.append(targetUnique);
		result.append(')');
		return result.toString();
	}

} //AssociationWithoutContainmentImpl
