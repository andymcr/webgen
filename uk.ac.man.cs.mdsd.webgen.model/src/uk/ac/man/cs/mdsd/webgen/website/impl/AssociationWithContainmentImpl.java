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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationWithContainmentImpl#isSourceVisible <em>Source Visible</em>}</li>
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
		return WebsitePackage.Literals.ASSOCIATION_WITH_CONTAINMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE, oldSourceVisible, sourceVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
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
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE:
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
