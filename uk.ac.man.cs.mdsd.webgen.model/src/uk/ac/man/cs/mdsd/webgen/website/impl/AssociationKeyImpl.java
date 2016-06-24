/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationKey;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationKeyImpl#getKeyFor <em>Key For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationKeyImpl#getKey <em>Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.AssociationKeyImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationKeyImpl extends EObjectImpl implements AssociationKey {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute key;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ASSOCIATION_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociation getKeyFor() {
		if (eContainerFeatureID() != WebsitePackage.ASSOCIATION_KEY__KEY_FOR) return null;
		return (EntityAssociation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyFor(EntityAssociation newKeyFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newKeyFor, WebsitePackage.ASSOCIATION_KEY__KEY_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyFor(EntityAssociation newKeyFor) {
		if (newKeyFor != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.ASSOCIATION_KEY__KEY_FOR && newKeyFor != null)) {
			if (EcoreUtil.isAncestor(this, newKeyFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newKeyFor != null)
				msgs = ((InternalEObject)newKeyFor).eInverseAdd(this, WebsitePackage.ENTITY_ASSOCIATION__KEYS, EntityAssociation.class, msgs);
			msgs = basicSetKeyFor(newKeyFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_KEY__KEY_FOR, newKeyFor, newKeyFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Attribute)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.ASSOCIATION_KEY__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Attribute newKey) {
		Attribute oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_KEY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ASSOCIATION_KEY__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetKeyFor((EntityAssociation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				return basicSetKeyFor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.ENTITY_ASSOCIATION__KEYS, EntityAssociation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				return getKeyFor();
			case WebsitePackage.ASSOCIATION_KEY__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case WebsitePackage.ASSOCIATION_KEY__COLUMN_NAME:
				return getColumnName();
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
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				setKeyFor((EntityAssociation)newValue);
				return;
			case WebsitePackage.ASSOCIATION_KEY__KEY:
				setKey((Attribute)newValue);
				return;
			case WebsitePackage.ASSOCIATION_KEY__COLUMN_NAME:
				setColumnName((String)newValue);
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
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				setKeyFor((EntityAssociation)null);
				return;
			case WebsitePackage.ASSOCIATION_KEY__KEY:
				setKey((Attribute)null);
				return;
			case WebsitePackage.ASSOCIATION_KEY__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
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
			case WebsitePackage.ASSOCIATION_KEY__KEY_FOR:
				return getKeyFor() != null;
			case WebsitePackage.ASSOCIATION_KEY__KEY:
				return key != null;
			case WebsitePackage.ASSOCIATION_KEY__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
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
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //AssociationKeyImpl
