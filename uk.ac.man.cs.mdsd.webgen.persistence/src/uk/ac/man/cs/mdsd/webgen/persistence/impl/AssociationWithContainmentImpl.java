/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association With Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.AssociationWithContainmentImpl#isSourceVisible <em>Source Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationWithContainmentImpl extends EntityAssociationImpl implements AssociationWithContainment {
	/**
	 * The default value of the '{@link #isSourceVisible() <em>Source Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSourceVisible() <em>Source Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceVisible = SOURCE_VISIBLE_EDEFAULT;

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
		return PersistencePackage.Literals.ASSOCIATION_WITH_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceVisible() {
		return sourceVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVisible(boolean newSourceVisible) {
		boolean oldSourceVisible = sourceVisible;
		sourceVisible = newSourceVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE, oldSourceVisible, sourceVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
				return isSourceVisible();
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
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
				setSourceVisible((Boolean)newValue);
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
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
				setSourceVisible(SOURCE_VISIBLE_EDEFAULT);
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
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
				return sourceVisible != SOURCE_VISIBLE_EDEFAULT;
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
		result.append(" (sourceVisible: ");
		result.append(sourceVisible);
		result.append(')');
		return result.toString();
	}

} //AssociationWithContainmentImpl
