/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedElementImpl.java,v 1.8 2013/04/23 10:31:54 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.ac.man.cs.mdsd.webgen.website.NamedElement;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.NamedElementImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.NamedElementImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends EObjectImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLETON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected String singletonName = SINGLETON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLURALISED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected String pluralisedName = PLURALISED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingletonName() {
		return singletonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonName(String newSingletonName) {
		String oldSingletonName = singletonName;
		singletonName = newSingletonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.NAMED_ELEMENT__SINGLETON_NAME, oldSingletonName, singletonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluralisedName() {
		return pluralisedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralisedName(String newPluralisedName) {
		String oldPluralisedName = pluralisedName;
		pluralisedName = newPluralisedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.NAMED_ELEMENT__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.NAMED_ELEMENT__NAME:
				return getName();
			case WebsitePackage.NAMED_ELEMENT__SINGLETON_NAME:
				return getSingletonName();
			case WebsitePackage.NAMED_ELEMENT__PLURALISED_NAME:
				return getPluralisedName();
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
			case WebsitePackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case WebsitePackage.NAMED_ELEMENT__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case WebsitePackage.NAMED_ELEMENT__PLURALISED_NAME:
				setPluralisedName((String)newValue);
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
			case WebsitePackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebsitePackage.NAMED_ELEMENT__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case WebsitePackage.NAMED_ELEMENT__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
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
			case WebsitePackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebsitePackage.NAMED_ELEMENT__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case WebsitePackage.NAMED_ELEMENT__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
