/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityOrViewImpl#isSerializationExcludeAll <em>Serialization Exclude All</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityOrViewImpl extends ClassifierImpl implements EntityOrView {
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
	 * The default value of the '{@link #getAutoKeyName() <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_NAME_EDEFAULT = "id";

	/**
	 * The cached value of the '{@link #getAutoKeyName() <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyName()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyName = AUTO_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoKeyPersistentType() <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_PERSISTENT_TYPE_EDEFAULT = "integer";

	/**
	 * The cached value of the '{@link #getAutoKeyPersistentType() <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyPersistentType = AUTO_KEY_PERSISTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoKeyGenerationStrategy() <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_GENERATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoKeyGenerationStrategy() <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyGenerationStrategy = AUTO_KEY_GENERATION_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServedBy() <em>Served By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> servedBy;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLabel> labels;

	/**
	 * The cached setting delegate for the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FEATURES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENTITY_OR_VIEW__FEATURES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllFeatures() <em>All Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFeatures()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_FEATURES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENTITY_OR_VIEW__ALL_FEATURES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ATTRIBUTES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENTITY_OR_VIEW__ATTRIBUTES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociations() <em>Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENTITY_OR_VIEW__ASSOCIATIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAssociations() <em>All Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ENTITY_OR_VIEW__ALL_ASSOCIATIONS).getSettingDelegate();

	/**
	 * The default value of the '{@link #isSerializationExcludeAll() <em>Serialization Exclude All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExcludeAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZATION_EXCLUDE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSerializationExcludeAll() <em>Serialization Exclude All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExcludeAll()
	 * @generated
	 * @ordered
	 */
	protected boolean serializationExcludeAll = SERIALIZATION_EXCLUDE_ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityOrViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY_OR_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_OR_VIEW__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyName() {
		return autoKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyName(String newAutoKeyName) {
		String oldAutoKeyName = autoKeyName;
		autoKeyName = newAutoKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME, oldAutoKeyName, autoKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyPersistentType() {
		return autoKeyPersistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyPersistentType(String newAutoKeyPersistentType) {
		String oldAutoKeyPersistentType = autoKeyPersistentType;
		autoKeyPersistentType = newAutoKeyPersistentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE, oldAutoKeyPersistentType, autoKeyPersistentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyGenerationStrategy() {
		return autoKeyGenerationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyGenerationStrategy(String newAutoKeyGenerationStrategy) {
		String oldAutoKeyGenerationStrategy = autoKeyGenerationStrategy;
		autoKeyGenerationStrategy = newAutoKeyGenerationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY, oldAutoKeyGenerationStrategy, autoKeyGenerationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Service> getServedBy() {
		if (servedBy == null) {
			servedBy = new EObjectWithInverseResolvingEList<Service>(Service.class, this, WebsitePackage.ENTITY_OR_VIEW__SERVED_BY, WebsitePackage.SERVICE__SERVES);
		}
		return servedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ModelLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<ModelLabel>(ModelLabel.class, this, WebsitePackage.ENTITY_OR_VIEW__LABELS, WebsitePackage.MODEL_LABEL__LABEL_FOR);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Feature> getFeatures() {
		return (List<Feature>)FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Feature> getAllFeatures() {
		return (List<Feature>)ALL_FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Attribute> getAttributes() {
		return (List<Attribute>)ATTRIBUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Association> getAssociations() {
		return (List<Association>)ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Association> getAllAssociations() {
		return (List<Association>)ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializationExcludeAll() {
		return serializationExcludeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializationExcludeAll(boolean newSerializationExcludeAll) {
		boolean oldSerializationExcludeAll = serializationExcludeAll;
		serializationExcludeAll = newSerializationExcludeAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL, oldSerializationExcludeAll, serializationExcludeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Feature> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Feature>(Feature.class, this, WebsitePackage.ENTITY_OR_VIEW__KEYS);
		}
		return keys;
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServedBy()).basicAdd(otherEnd, msgs);
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return ((InternalEList<?>)getServedBy()).basicRemove(otherEnd, msgs);
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.ENTITY_OR_VIEW__KEYS:
				return getKeys();
			case WebsitePackage.ENTITY_OR_VIEW__TABLE_NAME:
				return getTableName();
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				return getAutoKeyName();
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				return getAutoKeyPersistentType();
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				return getAutoKeyGenerationStrategy();
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return getServedBy();
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				return getLabels();
			case WebsitePackage.ENTITY_OR_VIEW__FEATURES:
				return getFeatures();
			case WebsitePackage.ENTITY_OR_VIEW__ALL_FEATURES:
				return getAllFeatures();
			case WebsitePackage.ENTITY_OR_VIEW__ATTRIBUTES:
				return getAttributes();
			case WebsitePackage.ENTITY_OR_VIEW__ASSOCIATIONS:
				return getAssociations();
			case WebsitePackage.ENTITY_OR_VIEW__ALL_ASSOCIATIONS:
				return getAllAssociations();
			case WebsitePackage.ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL:
				return isSerializationExcludeAll();
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
			case WebsitePackage.ENTITY_OR_VIEW__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Feature>)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				setAutoKeyName((String)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType((String)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy((String)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				getServedBy().clear();
				getServedBy().addAll((Collection<? extends Service>)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends ModelLabel>)newValue);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL:
				setSerializationExcludeAll((Boolean)newValue);
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
			case WebsitePackage.ENTITY_OR_VIEW__KEYS:
				getKeys().clear();
				return;
			case WebsitePackage.ENTITY_OR_VIEW__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				setAutoKeyName(AUTO_KEY_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType(AUTO_KEY_PERSISTENT_TYPE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy(AUTO_KEY_GENERATION_STRATEGY_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				getServedBy().clear();
				return;
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				getLabels().clear();
				return;
			case WebsitePackage.ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL:
				setSerializationExcludeAll(SERIALIZATION_EXCLUDE_ALL_EDEFAULT);
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
			case WebsitePackage.ENTITY_OR_VIEW__KEYS:
				return keys != null && !keys.isEmpty();
			case WebsitePackage.ENTITY_OR_VIEW__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				return AUTO_KEY_NAME_EDEFAULT == null ? autoKeyName != null : !AUTO_KEY_NAME_EDEFAULT.equals(autoKeyName);
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				return AUTO_KEY_PERSISTENT_TYPE_EDEFAULT == null ? autoKeyPersistentType != null : !AUTO_KEY_PERSISTENT_TYPE_EDEFAULT.equals(autoKeyPersistentType);
			case WebsitePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				return AUTO_KEY_GENERATION_STRATEGY_EDEFAULT == null ? autoKeyGenerationStrategy != null : !AUTO_KEY_GENERATION_STRATEGY_EDEFAULT.equals(autoKeyGenerationStrategy);
			case WebsitePackage.ENTITY_OR_VIEW__SERVED_BY:
				return servedBy != null && !servedBy.isEmpty();
			case WebsitePackage.ENTITY_OR_VIEW__LABELS:
				return labels != null && !labels.isEmpty();
			case WebsitePackage.ENTITY_OR_VIEW__FEATURES:
				return FEATURES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENTITY_OR_VIEW__ALL_FEATURES:
				return ALL_FEATURES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENTITY_OR_VIEW__ATTRIBUTES:
				return ATTRIBUTES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENTITY_OR_VIEW__ASSOCIATIONS:
				return ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENTITY_OR_VIEW__ALL_ASSOCIATIONS:
				return ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL:
				return serializationExcludeAll != SERIALIZATION_EXCLUDE_ALL_EDEFAULT;
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
		result.append(", autoKeyName: ");
		result.append(autoKeyName);
		result.append(", autoKeyPersistentType: ");
		result.append(autoKeyPersistentType);
		result.append(", autoKeyGenerationStrategy: ");
		result.append(autoKeyGenerationStrategy);
		result.append(", serializationExcludeAll: ");
		result.append(serializationExcludeAll);
		result.append(')');
		return result.toString();
	}

} //EntityOrViewImpl
