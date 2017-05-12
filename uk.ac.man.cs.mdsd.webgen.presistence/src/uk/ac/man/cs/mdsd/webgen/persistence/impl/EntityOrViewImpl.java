/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.base.impl.ClassifierImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#isImplementsUserInterface <em>Implements User Interface</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityOrViewImpl#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityOrViewImpl extends ClassifierImpl implements EntityOrView {
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
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> unique;

	/**
	 * The cached value of the '{@link #getContainerUnique() <em>Container Unique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerUnique()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> containerUnique;

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
	protected EStructuralFeature.Internal.SettingDelegate FEATURES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY_OR_VIEW__FEATURES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllFeatures() <em>All Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFeatures()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_FEATURES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY_OR_VIEW__ALL_FEATURES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ATTRIBUTES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY_OR_VIEW__ATTRIBUTES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociations() <em>Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY_OR_VIEW__ASSOCIATIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAssociations() <em>All Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY_OR_VIEW__ALL_ASSOCIATIONS).getSettingDelegate();

	/**
	 * The default value of the '{@link #isImplementsUserInterface() <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsUserInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTS_USER_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplementsUserInterface() <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsUserInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean implementsUserInterface = IMPLEMENTS_USER_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowFormTypeCustomisation() <em>Allow Form Type Customisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFormTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowFormTypeCustomisation() <em>Allow Form Type Customisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFormTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFormTypeCustomisation = ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT;

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
		return PersistencePackage.Literals.ENTITY_OR_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__SINGLETON_NAME, oldSingletonName, singletonName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.ENTITY_OR_VIEW__KEYS);
		}
		return keys;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__TABLE_NAME, oldTableName, tableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME, oldAutoKeyName, autoKeyName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE, oldAutoKeyPersistentType, autoKeyPersistentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY, oldAutoKeyGenerationStrategy, autoKeyGenerationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getUnique() {
		if (unique == null) {
			unique = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.ENTITY_OR_VIEW__UNIQUE);
		}
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getContainerUnique() {
		if (containerUnique == null) {
			containerUnique = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.ENTITY_OR_VIEW__CONTAINER_UNIQUE);
		}
		return containerUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<ModelLabel>(ModelLabel.class, this, PersistencePackage.ENTITY_OR_VIEW__LABELS, PersistencePackage.MODEL_LABEL__LABEL_FOR);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>)FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getAllFeatures() {
		return (EList<Feature>)ALL_FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)ATTRIBUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAssociations() {
		return (EList<Association>)ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAllAssociations() {
		return (EList<Association>)ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplementsUserInterface() {
		return implementsUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsUserInterface(boolean newImplementsUserInterface) {
		boolean oldImplementsUserInterface = implementsUserInterface;
		implementsUserInterface = newImplementsUserInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE, oldImplementsUserInterface, implementsUserInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowFormTypeCustomisation() {
		return allowFormTypeCustomisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowFormTypeCustomisation(boolean newAllowFormTypeCustomisation) {
		boolean oldAllowFormTypeCustomisation = allowFormTypeCustomisation;
		allowFormTypeCustomisation = newAllowFormTypeCustomisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION, oldAllowFormTypeCustomisation, allowFormTypeCustomisation));
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
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
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
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
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
			case PersistencePackage.ENTITY_OR_VIEW__SINGLETON_NAME:
				return getSingletonName();
			case PersistencePackage.ENTITY_OR_VIEW__PLURALISED_NAME:
				return getPluralisedName();
			case PersistencePackage.ENTITY_OR_VIEW__KEYS:
				return getKeys();
			case PersistencePackage.ENTITY_OR_VIEW__TABLE_NAME:
				return getTableName();
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				return getAutoKeyName();
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				return getAutoKeyPersistentType();
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				return getAutoKeyGenerationStrategy();
			case PersistencePackage.ENTITY_OR_VIEW__UNIQUE:
				return getUnique();
			case PersistencePackage.ENTITY_OR_VIEW__CONTAINER_UNIQUE:
				return getContainerUnique();
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
				return getLabels();
			case PersistencePackage.ENTITY_OR_VIEW__FEATURES:
				return getFeatures();
			case PersistencePackage.ENTITY_OR_VIEW__ALL_FEATURES:
				return getAllFeatures();
			case PersistencePackage.ENTITY_OR_VIEW__ATTRIBUTES:
				return getAttributes();
			case PersistencePackage.ENTITY_OR_VIEW__ASSOCIATIONS:
				return getAssociations();
			case PersistencePackage.ENTITY_OR_VIEW__ALL_ASSOCIATIONS:
				return getAllAssociations();
			case PersistencePackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE:
				return isImplementsUserInterface();
			case PersistencePackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION:
				return isAllowFormTypeCustomisation();
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
			case PersistencePackage.ENTITY_OR_VIEW__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__PLURALISED_NAME:
				setPluralisedName((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				setAutoKeyName((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy((String)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__UNIQUE:
				getUnique().clear();
				getUnique().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__CONTAINER_UNIQUE:
				getContainerUnique().clear();
				getContainerUnique().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends ModelLabel>)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE:
				setImplementsUserInterface((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION:
				setAllowFormTypeCustomisation((Boolean)newValue);
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
			case PersistencePackage.ENTITY_OR_VIEW__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__KEYS:
				getKeys().clear();
				return;
			case PersistencePackage.ENTITY_OR_VIEW__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				setAutoKeyName(AUTO_KEY_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType(AUTO_KEY_PERSISTENT_TYPE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy(AUTO_KEY_GENERATION_STRATEGY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__UNIQUE:
				getUnique().clear();
				return;
			case PersistencePackage.ENTITY_OR_VIEW__CONTAINER_UNIQUE:
				getContainerUnique().clear();
				return;
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
				getLabels().clear();
				return;
			case PersistencePackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE:
				setImplementsUserInterface(IMPLEMENTS_USER_INTERFACE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION:
				setAllowFormTypeCustomisation(ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT);
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
			case PersistencePackage.ENTITY_OR_VIEW__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case PersistencePackage.ENTITY_OR_VIEW__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
			case PersistencePackage.ENTITY_OR_VIEW__KEYS:
				return keys != null && !keys.isEmpty();
			case PersistencePackage.ENTITY_OR_VIEW__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_NAME:
				return AUTO_KEY_NAME_EDEFAULT == null ? autoKeyName != null : !AUTO_KEY_NAME_EDEFAULT.equals(autoKeyName);
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE:
				return AUTO_KEY_PERSISTENT_TYPE_EDEFAULT == null ? autoKeyPersistentType != null : !AUTO_KEY_PERSISTENT_TYPE_EDEFAULT.equals(autoKeyPersistentType);
			case PersistencePackage.ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY:
				return AUTO_KEY_GENERATION_STRATEGY_EDEFAULT == null ? autoKeyGenerationStrategy != null : !AUTO_KEY_GENERATION_STRATEGY_EDEFAULT.equals(autoKeyGenerationStrategy);
			case PersistencePackage.ENTITY_OR_VIEW__UNIQUE:
				return unique != null && !unique.isEmpty();
			case PersistencePackage.ENTITY_OR_VIEW__CONTAINER_UNIQUE:
				return containerUnique != null && !containerUnique.isEmpty();
			case PersistencePackage.ENTITY_OR_VIEW__LABELS:
				return labels != null && !labels.isEmpty();
			case PersistencePackage.ENTITY_OR_VIEW__FEATURES:
				return FEATURES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_OR_VIEW__ALL_FEATURES:
				return ALL_FEATURES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_OR_VIEW__ATTRIBUTES:
				return ATTRIBUTES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_OR_VIEW__ASSOCIATIONS:
				return ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_OR_VIEW__ALL_ASSOCIATIONS:
				return ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE:
				return implementsUserInterface != IMPLEMENTS_USER_INTERFACE_EDEFAULT;
			case PersistencePackage.ENTITY_OR_VIEW__ALLOW_FORM_TYPE_CUSTOMISATION:
				return allowFormTypeCustomisation != ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT;
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
		result.append(" (singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", autoKeyName: ");
		result.append(autoKeyName);
		result.append(", autoKeyPersistentType: ");
		result.append(autoKeyPersistentType);
		result.append(", autoKeyGenerationStrategy: ");
		result.append(autoKeyGenerationStrategy);
		result.append(", implementsUserInterface: ");
		result.append(implementsUserInterface);
		result.append(", allowFormTypeCustomisation: ");
		result.append(allowFormTypeCustomisation);
		result.append(')');
		return result.toString();
	}

} //EntityOrViewImpl
