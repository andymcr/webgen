/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.ChildAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ChildAssociationImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildAssociationImpl extends FeaturePathAssociationImpl implements ChildAssociation {
	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected FeaturePathAssociation partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.CHILD_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePathAssociation getPartOf() {
		if (partOf != null && partOf.eIsProxy()) {
			InternalEObject oldPartOf = (InternalEObject)partOf;
			partOf = (FeaturePathAssociation)eResolveProxy(oldPartOf);
			if (partOf != oldPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.CHILD_ASSOCIATION__PART_OF, oldPartOf, partOf));
			}
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePathAssociation basicGetPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(FeaturePathAssociation newPartOf) {
		FeaturePathAssociation oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_ASSOCIATION__PART_OF, oldPartOf, partOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.CHILD_ASSOCIATION__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
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
			case WebsitePackage.CHILD_ASSOCIATION__PART_OF:
				setPartOf((FeaturePathAssociation)newValue);
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
			case WebsitePackage.CHILD_ASSOCIATION__PART_OF:
				setPartOf((FeaturePathAssociation)null);
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
			case WebsitePackage.CHILD_ASSOCIATION__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ChildFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.CHILD_ASSOCIATION__PART_OF: return WebsitePackage.CHILD_FEATURE__PART_OF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ChildFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.CHILD_FEATURE__PART_OF: return WebsitePackage.CHILD_ASSOCIATION__PART_OF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChildAssociationImpl
