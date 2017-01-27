/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.webgen.website.ChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ChildFeatureImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChildFeatureImpl extends EObjectImpl implements ChildFeature {
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
	protected ChildFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.CHILD_FEATURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.CHILD_FEATURE__PART_OF, oldPartOf, partOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.CHILD_FEATURE__PART_OF, oldPartOf, partOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.CHILD_FEATURE__PART_OF:
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
			case WebsitePackage.CHILD_FEATURE__PART_OF:
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
			case WebsitePackage.CHILD_FEATURE__PART_OF:
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
			case WebsitePackage.CHILD_FEATURE__PART_OF:
				return partOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildFeatureImpl
