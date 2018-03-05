/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.base.DataType;
import uk.ac.man.cs.mdsd.webgen.persistence.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.OrmTechnologies;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#isTimestampCreation <em>Timestamp Creation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#isTimestampUpdates <em>Timestamp Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistenceImpl extends MinimalEObjectImpl.Container implements Persistence {
	/**
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializationGroup> serializationGroups;
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
	protected EList<EntityOrView> entities;

	/**
	 * The default value of the '{@link #getOrmTechnology() <em>Orm Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final OrmTechnologies ORM_TECHNOLOGY_EDEFAULT = OrmTechnologies.KOHANA;
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
	 * The default value of the '{@link #isTimestampCreation() <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_CREATION_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isTimestampCreation() <em>Timestamp Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean timestampCreation = TIMESTAMP_CREATION_EDEFAULT;
	/**
	 * The default value of the '{@link #isTimestampUpdates() <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampUpdates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_UPDATES_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isTimestampUpdates() <em>Timestamp Updates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestampUpdates()
	 * @generated
	 * @ordered
	 */
	protected boolean timestampUpdates = TIMESTAMP_UPDATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PERSISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectContainmentEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, PersistencePackage.PERSISTENCE__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOrView> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<EntityOrView>(EntityOrView.class, this, PersistencePackage.PERSISTENCE__ENTITIES);
		}
		return entities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY, oldOrmTechnology, ormTechnology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY, oldDatabaseTechnology, databaseTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestampCreation() {
		return timestampCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampCreation(boolean newTimestampCreation) {
		boolean oldTimestampCreation = timestampCreation;
		timestampCreation = newTimestampCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION, oldTimestampCreation, timestampCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestampUpdates() {
		return timestampUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampUpdates(boolean newTimestampUpdates) {
		boolean oldTimestampUpdates = timestampUpdates;
		timestampUpdates = newTimestampUpdates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES, oldTimestampUpdates, timestampUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
				return ((InternalEList<?>)getSerializationGroups()).basicRemove(otherEnd, msgs);
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case PersistencePackage.PERSISTENCE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				return getDataTypes();
			case PersistencePackage.PERSISTENCE__ENTITIES:
				return getEntities();
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				return getOrmTechnology();
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				return getDatabaseTechnology();
			case PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION:
				return isTimestampCreation();
			case PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES:
				return isTimestampUpdates();
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
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case PersistencePackage.PERSISTENCE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				setOrmTechnology((OrmTechnologies)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				setDatabaseTechnology((DatabaseTechnologies)newValue);
				return;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION:
				setTimestampCreation((Boolean)newValue);
				return;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES:
				setTimestampUpdates((Boolean)newValue);
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
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				getDataTypes().clear();
				return;
			case PersistencePackage.PERSISTENCE__ENTITIES:
				getEntities().clear();
				return;
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				setOrmTechnology(ORM_TECHNOLOGY_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				setDatabaseTechnology(DATABASE_TECHNOLOGY_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION:
				setTimestampCreation(TIMESTAMP_CREATION_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES:
				setTimestampUpdates(TIMESTAMP_UPDATES_EDEFAULT);
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
			case PersistencePackage.PERSISTENCE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case PersistencePackage.PERSISTENCE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				return ormTechnology != ORM_TECHNOLOGY_EDEFAULT;
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				return databaseTechnology != DATABASE_TECHNOLOGY_EDEFAULT;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_CREATION:
				return timestampCreation != TIMESTAMP_CREATION_EDEFAULT;
			case PersistencePackage.PERSISTENCE__TIMESTAMP_UPDATES:
				return timestampUpdates != TIMESTAMP_UPDATES_EDEFAULT;
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
		result.append(" (ormTechnology: ");
		result.append(ormTechnology);
		result.append(", databaseTechnology: ");
		result.append(databaseTechnology);
		result.append(", timestampCreation: ");
		result.append(timestampCreation);
		result.append(", timestampUpdates: ");
		result.append(timestampUpdates);
		result.append(')');
		return result.toString();
	}

} //PersistenceImpl
