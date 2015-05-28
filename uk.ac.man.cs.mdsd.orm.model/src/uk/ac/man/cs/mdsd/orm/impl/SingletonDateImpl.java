/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonDateImpl.java,v 1.3 2013/12/17 13:57:24 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.orm.DateAttribute;
import uk.ac.man.cs.mdsd.orm.DateDetails;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.SingletonDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.SingletonDateImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingletonDateImpl extends SingletonAttributeImpl implements SingletonDate {
	/**
   * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
	protected static final DateDetails DETAILS_EDEFAULT = DateDetails.DATE_ONLY;
	/**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
	protected DateDetails details = DETAILS_EDEFAULT;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonDateImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.Literals.SINGLETON_DATE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DateDetails getDetails() {
    return details;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDetails(DateDetails newDetails) {
    DateDetails oldDetails = details;
    details = newDetails == null ? DETAILS_EDEFAULT : newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SINGLETON_DATE__DETAILS, oldDetails, details));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case OrmPackage.SINGLETON_DATE__DETAILS:
        return getDetails();
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
    switch (featureID)
    {
      case OrmPackage.SINGLETON_DATE__DETAILS:
        setDetails((DateDetails)newValue);
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
    switch (featureID)
    {
      case OrmPackage.SINGLETON_DATE__DETAILS:
        setDetails(DETAILS_EDEFAULT);
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
    switch (featureID)
    {
      case OrmPackage.SINGLETON_DATE__DETAILS:
        return details != DETAILS_EDEFAULT;
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
    if (baseClass == DateAttribute.class)
    {
      switch (derivedFeatureID)
      {
        case OrmPackage.SINGLETON_DATE__DETAILS: return OrmPackage.DATE_ATTRIBUTE__DETAILS;
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
    if (baseClass == DateAttribute.class)
    {
      switch (baseFeatureID)
      {
        case OrmPackage.DATE_ATTRIBUTE__DETAILS: return OrmPackage.SINGLETON_DATE__DETAILS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (details: ");
    result.append(details);
    result.append(')');
    return result.toString();
  }

} //SingletonDateImpl
