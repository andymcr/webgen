/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmModelImpl.java,v 1.4 2013/06/08 06:31:28 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.DataType;
import uk.ac.man.cs.mdsd.orm.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.OrmModel;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.OrmTechnologies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl#getCollectionTypes <em>Collection Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.OrmModelImpl#getOrmTechnology <em>Orm Technology</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrmModelImpl extends EObjectImpl implements OrmModel {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getCollectionTypes() <em>Collection Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionType> collectionTypes;

	/**
	 * The default value of the '{@link #getDatabaseTechnology() <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseTechnologies DATABASE_TECHNOLOGY_EDEFAULT = DatabaseTechnologies.MY_SQL;

	/**
	 * The cached value of the '{@link #getDatabaseTechnology() <em>Database Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseTechnology()
	 * @generated
	 * @ordered
	 */
	protected DatabaseTechnologies databaseTechnology = DATABASE_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final OrmTechnologies ORM_TECHNOLOGY_EDEFAULT = OrmTechnologies.JPA;

	/**
	 * The cached value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected OrmTechnologies ormTechnology = ORM_TECHNOLOGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrmModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ORM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionType> getCollectionTypes() {
		if (collectionTypes == null) {
			collectionTypes = new EObjectContainmentEList<CollectionType>(CollectionType.class, this, OrmPackage.ORM_MODEL__COLLECTION_TYPES);
		}
		return collectionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseTechnologies getDatabaseTechnology() {
		return databaseTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseTechnology(DatabaseTechnologies newDatabaseTechnology) {
		DatabaseTechnologies oldDatabaseTechnology = databaseTechnology;
		databaseTechnology = newDatabaseTechnology == null ? DATABASE_TECHNOLOGY_EDEFAULT : newDatabaseTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY, oldDatabaseTechnology, databaseTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTechnologies getOrmTechnology() {
		return ormTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmTechnology(OrmTechnologies newOrmTechnology) {
		OrmTechnologies oldOrmTechnology = ormTechnology;
		ormTechnology = newOrmTechnology == null ? ORM_TECHNOLOGY_EDEFAULT : newOrmTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ORM_MODEL__ORM_TECHNOLOGY, oldOrmTechnology, ormTechnology));
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
			case OrmPackage.ORM_MODEL__ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntities()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, OrmPackage.ORM_MODEL__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, OrmPackage.ORM_MODEL__ENTITIES, OrmPackage.ENTITY__PART_OF);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ORM_MODEL__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case OrmPackage.ORM_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
				return ((InternalEList<?>)getCollectionTypes()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ORM_MODEL__DATA_TYPES:
				return getDataTypes();
			case OrmPackage.ORM_MODEL__ENTITIES:
				return getEntities();
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
				return getCollectionTypes();
			case OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY:
				return getDatabaseTechnology();
			case OrmPackage.ORM_MODEL__ORM_TECHNOLOGY:
				return getOrmTechnology();
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
			case OrmPackage.ORM_MODEL__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case OrmPackage.ORM_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
				getCollectionTypes().clear();
				getCollectionTypes().addAll((Collection<? extends CollectionType>)newValue);
				return;
			case OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY:
				setDatabaseTechnology((DatabaseTechnologies)newValue);
				return;
			case OrmPackage.ORM_MODEL__ORM_TECHNOLOGY:
				setOrmTechnology((OrmTechnologies)newValue);
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
			case OrmPackage.ORM_MODEL__DATA_TYPES:
				getDataTypes().clear();
				return;
			case OrmPackage.ORM_MODEL__ENTITIES:
				getEntities().clear();
				return;
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
				getCollectionTypes().clear();
				return;
			case OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY:
				setDatabaseTechnology(DATABASE_TECHNOLOGY_EDEFAULT);
				return;
			case OrmPackage.ORM_MODEL__ORM_TECHNOLOGY:
				setOrmTechnology(ORM_TECHNOLOGY_EDEFAULT);
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
			case OrmPackage.ORM_MODEL__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case OrmPackage.ORM_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
				return collectionTypes != null && !collectionTypes.isEmpty();
			case OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY:
				return databaseTechnology != DATABASE_TECHNOLOGY_EDEFAULT;
			case OrmPackage.ORM_MODEL__ORM_TECHNOLOGY:
				return ormTechnology != ORM_TECHNOLOGY_EDEFAULT;
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
		result.append(" (databaseTechnology: ");
		result.append(databaseTechnology);
		result.append(", ormTechnology: ");
		result.append(ormTechnology);
		result.append(')');
		return result.toString();
	}

} //OrmModelImpl
