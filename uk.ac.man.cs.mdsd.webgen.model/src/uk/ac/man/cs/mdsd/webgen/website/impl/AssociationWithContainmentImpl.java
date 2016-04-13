/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationWithContainmentImpl.java,v 1.1 2011/03/26 09:48:54 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association With Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationWithContainmentImpl#isSourceVisble <em>Source Visble</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationWithContainmentImpl extends EntityAssociationImpl implements AssociationWithContainment {
	/**
	 * The default value of the '{@link #isSourceVisble() <em>Source Visble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceVisble()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_VISBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isSourceVisble() <em>Source Visble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceVisble()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceVisble = SOURCE_VISBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationWithContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ASSOCIATION_WITH_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceVisble() {
		return sourceVisble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVisble(boolean newSourceVisble) {
		boolean oldSourceVisble = sourceVisble;
		sourceVisble = newSourceVisble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISBLE, oldSourceVisble, sourceVisble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISBLE:
				return isSourceVisble();
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISBLE:
				setSourceVisble((Boolean)newValue);
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISBLE:
				setSourceVisble(SOURCE_VISBLE_EDEFAULT);
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISBLE:
				return sourceVisble != SOURCE_VISBLE_EDEFAULT;
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
		result.append(" (sourceVisble: ");
		result.append(sourceVisble);
		result.append(')');
		return result.toString();
	}

} //AssociationWithContainmentImpl
