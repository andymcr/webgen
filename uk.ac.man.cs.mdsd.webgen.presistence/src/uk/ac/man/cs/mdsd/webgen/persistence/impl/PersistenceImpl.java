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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getOrmTechnology <em>Orm Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabaseTechnology <em>Database Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabasePrefix <em>Database Prefix</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabaseHost <em>Database Host</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabasePort <em>Database Port</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabaseUsername <em>Database Username</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#getDatabasePassword <em>Database Password</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#isTimestampCreation <em>Timestamp Creation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceImpl#isTimestampUpdates <em>Timestamp Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistenceImpl extends MinimalEObjectImpl.Container implements Persistence {
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
	 * The default value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabasePrefix() <em>Database Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePrefix()
	 * @generated
	 * @ordered
	 */
	protected String databasePrefix = DATABASE_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_HOST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabaseHost() <em>Database Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseHost()
	 * @generated
	 * @ordered
	 */
	protected String databaseHost = DATABASE_HOST_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabasePort() <em>Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabasePort() <em>Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected String databasePort = DATABASE_PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabaseUsername() <em>Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String databaseUsername = DATABASE_USERNAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatabasePassword() <em>Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String databasePassword = DATABASE_PASSWORD_EDEFAULT;
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
	public String getDatabasePrefix() {
		return databasePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePrefix(String newDatabasePrefix) {
		String oldDatabasePrefix = databasePrefix;
		databasePrefix = newDatabasePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_PREFIX, oldDatabasePrefix, databasePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseHost() {
		return databaseHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseHost(String newDatabaseHost) {
		String oldDatabaseHost = databaseHost;
		databaseHost = newDatabaseHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_HOST, oldDatabaseHost, databaseHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePort() {
		return databasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePort(String newDatabasePort) {
		String oldDatabasePort = databasePort;
		databasePort = newDatabasePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_PORT, oldDatabasePort, databasePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseUsername() {
		return databaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseUsername(String newDatabaseUsername) {
		String oldDatabaseUsername = databaseUsername;
		databaseUsername = newDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_USERNAME, oldDatabaseUsername, databaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasePassword(String newDatabasePassword) {
		String oldDatabasePassword = databasePassword;
		databasePassword = newDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE__DATABASE_PASSWORD, oldDatabasePassword, databasePassword));
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
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				return getDataTypes();
			case PersistencePackage.PERSISTENCE__ENTITIES:
				return getEntities();
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				return getOrmTechnology();
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				return getDatabaseTechnology();
			case PersistencePackage.PERSISTENCE__DATABASE_PREFIX:
				return getDatabasePrefix();
			case PersistencePackage.PERSISTENCE__DATABASE_HOST:
				return getDatabaseHost();
			case PersistencePackage.PERSISTENCE__DATABASE_NAME:
				return getDatabaseName();
			case PersistencePackage.PERSISTENCE__DATABASE_PORT:
				return getDatabasePort();
			case PersistencePackage.PERSISTENCE__DATABASE_USERNAME:
				return getDatabaseUsername();
			case PersistencePackage.PERSISTENCE__DATABASE_PASSWORD:
				return getDatabasePassword();
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
			case PersistencePackage.PERSISTENCE__DATABASE_PREFIX:
				setDatabasePrefix((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_HOST:
				setDatabaseHost((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_PORT:
				setDatabasePort((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_USERNAME:
				setDatabaseUsername((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_PASSWORD:
				setDatabasePassword((String)newValue);
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
			case PersistencePackage.PERSISTENCE__DATABASE_PREFIX:
				setDatabasePrefix(DATABASE_PREFIX_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_HOST:
				setDatabaseHost(DATABASE_HOST_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_PORT:
				setDatabasePort(DATABASE_PORT_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_USERNAME:
				setDatabaseUsername(DATABASE_USERNAME_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE__DATABASE_PASSWORD:
				setDatabasePassword(DATABASE_PASSWORD_EDEFAULT);
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
			case PersistencePackage.PERSISTENCE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
			case PersistencePackage.PERSISTENCE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case PersistencePackage.PERSISTENCE__ORM_TECHNOLOGY:
				return ormTechnology != ORM_TECHNOLOGY_EDEFAULT;
			case PersistencePackage.PERSISTENCE__DATABASE_TECHNOLOGY:
				return databaseTechnology != DATABASE_TECHNOLOGY_EDEFAULT;
			case PersistencePackage.PERSISTENCE__DATABASE_PREFIX:
				return DATABASE_PREFIX_EDEFAULT == null ? databasePrefix != null : !DATABASE_PREFIX_EDEFAULT.equals(databasePrefix);
			case PersistencePackage.PERSISTENCE__DATABASE_HOST:
				return DATABASE_HOST_EDEFAULT == null ? databaseHost != null : !DATABASE_HOST_EDEFAULT.equals(databaseHost);
			case PersistencePackage.PERSISTENCE__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case PersistencePackage.PERSISTENCE__DATABASE_PORT:
				return DATABASE_PORT_EDEFAULT == null ? databasePort != null : !DATABASE_PORT_EDEFAULT.equals(databasePort);
			case PersistencePackage.PERSISTENCE__DATABASE_USERNAME:
				return DATABASE_USERNAME_EDEFAULT == null ? databaseUsername != null : !DATABASE_USERNAME_EDEFAULT.equals(databaseUsername);
			case PersistencePackage.PERSISTENCE__DATABASE_PASSWORD:
				return DATABASE_PASSWORD_EDEFAULT == null ? databasePassword != null : !DATABASE_PASSWORD_EDEFAULT.equals(databasePassword);
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
		result.append(", databasePrefix: ");
		result.append(databasePrefix);
		result.append(", databaseHost: ");
		result.append(databaseHost);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databasePort: ");
		result.append(databasePort);
		result.append(", databaseUsername: ");
		result.append(databaseUsername);
		result.append(", databasePassword: ");
		result.append(databasePassword);
		result.append(", timestampCreation: ");
		result.append(timestampCreation);
		result.append(", timestampUpdates: ");
		result.append(timestampUpdates);
		result.append(')');
		return result.toString();
	}

} //PersistenceImpl
