/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeImpl.java,v 1.4 2011/03/31 18:12:19 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.orm.Attribute;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AttributeImpl#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.AttributeImpl#getOrmType <em>Orm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeImpl extends FeatureImpl implements Attribute {
	/**
   * The default value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPersistentType()
   * @generated
   * @ordered
   */
	protected static final String PERSISTENT_TYPE_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPersistentType()
   * @generated
   * @ordered
   */
	protected String persistentType = PERSISTENT_TYPE_EDEFAULT;
	/**
   * The default value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrmType()
   * @generated
   * @ordered
   */
	protected static final String ORM_TYPE_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOrmType()
   * @generated
   * @ordered
   */
	protected String ormType = ORM_TYPE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AttributeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return OrmPackage.Literals.ATTRIBUTE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPersistentType() {
    return persistentType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPersistentType(String newPersistentType) {
    String oldPersistentType = persistentType;
    persistentType = newPersistentType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ATTRIBUTE__PERSISTENT_TYPE, oldPersistentType, persistentType));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getOrmType() {
    return ormType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setOrmType(String newOrmType) {
    String oldOrmType = ormType;
    ormType = newOrmType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ATTRIBUTE__ORM_TYPE, oldOrmType, ormType));
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
      case OrmPackage.ATTRIBUTE__PERSISTENT_TYPE:
        return getPersistentType();
      case OrmPackage.ATTRIBUTE__ORM_TYPE:
        return getOrmType();
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
      case OrmPackage.ATTRIBUTE__PERSISTENT_TYPE:
        setPersistentType((String)newValue);
        return;
      case OrmPackage.ATTRIBUTE__ORM_TYPE:
        setOrmType((String)newValue);
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
      case OrmPackage.ATTRIBUTE__PERSISTENT_TYPE:
        setPersistentType(PERSISTENT_TYPE_EDEFAULT);
        return;
      case OrmPackage.ATTRIBUTE__ORM_TYPE:
        setOrmType(ORM_TYPE_EDEFAULT);
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
      case OrmPackage.ATTRIBUTE__PERSISTENT_TYPE:
        return PERSISTENT_TYPE_EDEFAULT == null ? persistentType != null : !PERSISTENT_TYPE_EDEFAULT.equals(persistentType);
      case OrmPackage.ATTRIBUTE__ORM_TYPE:
        return ORM_TYPE_EDEFAULT == null ? ormType != null : !ORM_TYPE_EDEFAULT.equals(ormType);
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
    result.append(" (persistentType: ");
    result.append(persistentType);
    result.append(", ormType: ");
    result.append(ormType);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
