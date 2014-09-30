/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationWithoutContainmentImpl.java,v 1.2 2012/02/16 15:48:50 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Without Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationWithoutContainmentImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationWithoutContainmentImpl#getTargetUnique <em>Target Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationWithoutContainmentImpl extends AssociationImpl implements AssociationWithoutContainment {
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
	 * The default value of the '{@link #getTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TARGET_UNIQUE_EDEFAULT = Boolean.TRUE;
	/**
	 * The cached value of the '{@link #getTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean targetUnique = TARGET_UNIQUE_EDEFAULT;

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
		return WebsitePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTargetUnique() {
		return targetUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUnique(Boolean newTargetUnique) {
		Boolean oldTargetUnique = targetUnique;
		targetUnique = newTargetUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE, oldTargetUnique, targetUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				return getTargetCardinality();
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				return getTargetUnique();
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
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
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
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
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
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE:
				return TARGET_UNIQUE_EDEFAULT == null ? targetUnique != null : !TARGET_UNIQUE_EDEFAULT.equals(targetUnique);
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
