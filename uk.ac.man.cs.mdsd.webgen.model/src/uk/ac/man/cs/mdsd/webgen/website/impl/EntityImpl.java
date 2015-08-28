/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.16 2014/01/30 16:43:49 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.LinkedList;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EntityOrViewImpl implements Entity {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityFeature> features;

	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAssociation> associationEnds;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Feature>(Feature.class, this, WebsitePackage.ENTITY__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<EntityFeature>(EntityFeature.class, this, WebsitePackage.ENTITY__FEATURES, WebsitePackage.ENTITY_FEATURE__PARENT_ENTITY);
		}
		return features;
	}

	/**
	 * @generated NOT
	 */
	public List<EntityFeature> getAllFeatures() {
		final List<EntityFeature> features = new LinkedList<EntityFeature>(getFeatures());
		for (EntityAssociation end : getAssociationEnds()) {
			if (end.getBidirectional()) {
				features.add(end);
			}
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityAssociation> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectWithInverseResolvingEList<EntityAssociation>(EntityAssociation.class, this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY);
		}
		return associationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENTITY__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnds()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.ENTITY__FEATURES:
				return getFeatures();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return getAssociationEnds();
			case WebsitePackage.ENTITY__TABLE_NAME:
				return getTableName();
			case WebsitePackage.ENTITY__KEYS:
				return getKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EntityFeature>)newValue);
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends EntityAssociation>)newValue);
				return;
			case WebsitePackage.ENTITY__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case WebsitePackage.ENTITY__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Feature>)newValue);
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
			case WebsitePackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				return;
			case WebsitePackage.ENTITY__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY__KEYS:
				getKeys().clear();
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
			case WebsitePackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case WebsitePackage.ENTITY__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
			case WebsitePackage.ENTITY__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case WebsitePackage.ENTITY__KEYS:
				return keys != null && !keys.isEmpty();
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
		result.append(" (tableName: ");
		result.append(tableName);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
