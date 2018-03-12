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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Cardinality;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;
import uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#isCustomiseSet <em>Customise Set</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityFeatureImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityFeatureImpl extends NamedDisplayElementImpl implements EntityFeature {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionOrmAllowAdd() <em>Collection Orm Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ORM_ALLOW_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionOrmAllowAdd() <em>Collection Orm Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionOrmAllowAdd = COLLECTION_ORM_ALLOW_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionOrmAllowRemove() <em>Collection Orm Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionOrmAllowRemove() <em>Collection Orm Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionOrmAllowRemove = COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullDisplayValue() <em>Null Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_DISPLAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullDisplayValue() <em>Null Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String nullDisplayValue = NULL_DISPLAY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCODE_URI_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected boolean encodeUriKey = ENCODE_URI_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializationGroup> serializationGroups;

	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomiseSet() <em>Customise Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMISE_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomiseSet() <em>Customise Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseSet()
	 * @generated
	 * @ordered
	 */
	protected boolean customiseSet = CUSTOMISE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooleanIsHasChoice() <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 * @ordered
	 */
	protected static final isHasChoices BOOLEAN_IS_HAS_CHOICE_EDEFAULT = isHasChoices.IS_A;

	/**
	 * The cached value of the '{@link #getBooleanIsHasChoice() <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 * @ordered
	 */
	protected isHasChoices booleanIsHasChoice = BOOLEAN_IS_HAS_CHOICE_EDEFAULT;

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
	protected EntityFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ENTITY_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionOrmAllowAdd() {
		return collectionOrmAllowAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionOrmAllowAdd(boolean newCollectionOrmAllowAdd) {
		boolean oldCollectionOrmAllowAdd = collectionOrmAllowAdd;
		collectionOrmAllowAdd = newCollectionOrmAllowAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD, oldCollectionOrmAllowAdd, collectionOrmAllowAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionOrmAllowRemove() {
		return collectionOrmAllowRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionOrmAllowRemove(boolean newCollectionOrmAllowRemove) {
		boolean oldCollectionOrmAllowRemove = collectionOrmAllowRemove;
		collectionOrmAllowRemove = newCollectionOrmAllowRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE, oldCollectionOrmAllowRemove, collectionOrmAllowRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNullDisplayValue() {
		return nullDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDisplayValue(String newNullDisplayValue) {
		String oldNullDisplayValue = nullDisplayValue;
		nullDisplayValue = newNullDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE, oldNullDisplayValue, nullDisplayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncodeUriKey() {
		return encodeUriKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeUriKey(boolean newEncodeUriKey) {
		boolean oldEncodeUriKey = encodeUriKey;
		encodeUriKey = newEncodeUriKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getPartOf() {
		if (eContainerFeatureID() != PersistencePackage.ENTITY_FEATURE__PART_OF) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Entity newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, PersistencePackage.ENTITY_FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Entity newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.ENTITY_FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, PersistencePackage.ENTITY__ENTITY_FEATURES, Entity.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomiseSet() {
		return customiseSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomiseSet(boolean newCustomiseSet) {
		boolean oldCustomiseSet = customiseSet;
		customiseSet = newCustomiseSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__CUSTOMISE_SET, oldCustomiseSet, customiseSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isHasChoices getBooleanIsHasChoice() {
		return booleanIsHasChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanIsHasChoice(isHasChoices newBooleanIsHasChoice) {
		isHasChoices oldBooleanIsHasChoice = booleanIsHasChoice;
		booleanIsHasChoice = newBooleanIsHasChoice == null ? BOOLEAN_IS_HAS_CHOICE_EDEFAULT : newBooleanIsHasChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE, oldBooleanIsHasChoice, booleanIsHasChoice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__SINGLETON_NAME, oldSingletonName, singletonName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__PLURALISED_NAME, oldPluralisedName, pluralisedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_FEATURE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((Entity)otherEnd, msgs);
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
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.ENTITY__ENTITY_FEATURES, Entity.class, msgs);
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
			case PersistencePackage.ENTITY_FEATURE__TITLE:
				return getTitle();
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return isCollectionOrmAllowAdd();
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return isCollectionOrmAllowRemove();
			case PersistencePackage.ENTITY_FEATURE__PLACEHOLDER:
				return getPlaceholder();
			case PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE:
				return getNullDisplayValue();
			case PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case PersistencePackage.ENTITY_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				return getPartOf();
			case PersistencePackage.ENTITY_FEATURE__CARDINALITY:
				return getCardinality();
			case PersistencePackage.ENTITY_FEATURE__ORDERED:
				return isOrdered();
			case PersistencePackage.ENTITY_FEATURE__PRIMARY_KEY:
				return isPrimaryKey();
			case PersistencePackage.ENTITY_FEATURE__DERIVED:
				return isDerived();
			case PersistencePackage.ENTITY_FEATURE__CUSTOMISE_SET:
				return isCustomiseSet();
			case PersistencePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return getBooleanIsHasChoice();
			case PersistencePackage.ENTITY_FEATURE__SINGLETON_NAME:
				return getSingletonName();
			case PersistencePackage.ENTITY_FEATURE__PLURALISED_NAME:
				return getPluralisedName();
			case PersistencePackage.ENTITY_FEATURE__COLUMN_NAME:
				return getColumnName();
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
			case PersistencePackage.ENTITY_FEATURE__TITLE:
				setTitle((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE:
				setNullDisplayValue((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				setPartOf((Entity)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__CUSTOMISE_SET:
				setCustomiseSet((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice((isHasChoices)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__PLURALISED_NAME:
				setPluralisedName((String)newValue);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLUMN_NAME:
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
			case PersistencePackage.ENTITY_FEATURE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd(COLLECTION_ORM_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove(COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE:
				setNullDisplayValue(NULL_DISPLAY_VALUE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case PersistencePackage.ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				setPartOf((Entity)null);
				return;
			case PersistencePackage.ENTITY_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__CUSTOMISE_SET:
				setCustomiseSet(CUSTOMISE_SET_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice(BOOLEAN_IS_HAS_CHOICE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_FEATURE__COLUMN_NAME:
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
			case PersistencePackage.ENTITY_FEATURE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return collectionOrmAllowAdd != COLLECTION_ORM_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return collectionOrmAllowRemove != COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE:
				return NULL_DISPLAY_VALUE_EDEFAULT == null ? nullDisplayValue != null : !NULL_DISPLAY_VALUE_EDEFAULT.equals(nullDisplayValue);
			case PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case PersistencePackage.ENTITY_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case PersistencePackage.ENTITY_FEATURE__PART_OF:
				return getPartOf() != null;
			case PersistencePackage.ENTITY_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__CUSTOMISE_SET:
				return customiseSet != CUSTOMISE_SET_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return booleanIsHasChoice != BOOLEAN_IS_HAS_CHOICE_EDEFAULT;
			case PersistencePackage.ENTITY_FEATURE__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case PersistencePackage.ENTITY_FEATURE__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
			case PersistencePackage.ENTITY_FEATURE__COLUMN_NAME:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case PersistencePackage.ENTITY_FEATURE__TITLE: return PersistencePackage.FEATURE__TITLE;
				case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD: return PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD;
				case PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE: return PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE;
				case PersistencePackage.ENTITY_FEATURE__PLACEHOLDER: return PersistencePackage.FEATURE__PLACEHOLDER;
				case PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE: return PersistencePackage.FEATURE__NULL_DISPLAY_VALUE;
				case PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY: return PersistencePackage.FEATURE__ENCODE_URI_KEY;
				case PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS: return PersistencePackage.FEATURE__SERIALIZATION_GROUPS;
				case PersistencePackage.ENTITY_FEATURE__HEADER_CLASS: return PersistencePackage.FEATURE__HEADER_CLASS;
				case PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS: return PersistencePackage.FEATURE__DISPLAY_CLASS;
				case PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS: return PersistencePackage.FEATURE__FOOTER_CLASS;
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
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case PersistencePackage.FEATURE__TITLE: return PersistencePackage.ENTITY_FEATURE__TITLE;
				case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD: return PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_ADD;
				case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE: return PersistencePackage.ENTITY_FEATURE__COLLECTION_ORM_ALLOW_REMOVE;
				case PersistencePackage.FEATURE__PLACEHOLDER: return PersistencePackage.ENTITY_FEATURE__PLACEHOLDER;
				case PersistencePackage.FEATURE__NULL_DISPLAY_VALUE: return PersistencePackage.ENTITY_FEATURE__NULL_DISPLAY_VALUE;
				case PersistencePackage.FEATURE__ENCODE_URI_KEY: return PersistencePackage.ENTITY_FEATURE__ENCODE_URI_KEY;
				case PersistencePackage.FEATURE__SERIALIZATION_GROUPS: return PersistencePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS;
				case PersistencePackage.FEATURE__HEADER_CLASS: return PersistencePackage.ENTITY_FEATURE__HEADER_CLASS;
				case PersistencePackage.FEATURE__DISPLAY_CLASS: return PersistencePackage.ENTITY_FEATURE__DISPLAY_CLASS;
				case PersistencePackage.FEATURE__FOOTER_CLASS: return PersistencePackage.ENTITY_FEATURE__FOOTER_CLASS;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", collectionOrmAllowAdd: ");
		result.append(collectionOrmAllowAdd);
		result.append(", collectionOrmAllowRemove: ");
		result.append(collectionOrmAllowRemove);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", nullDisplayValue: ");
		result.append(nullDisplayValue);
		result.append(", encodeUriKey: ");
		result.append(encodeUriKey);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", derived: ");
		result.append(derived);
		result.append(", customiseSet: ");
		result.append(customiseSet);
		result.append(", booleanIsHasChoice: ");
		result.append(booleanIsHasChoice);
		result.append(", singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //EntityFeatureImpl
