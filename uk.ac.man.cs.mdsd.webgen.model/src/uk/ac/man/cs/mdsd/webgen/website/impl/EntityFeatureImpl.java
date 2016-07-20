/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.isHasChoices;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isSerializationExpose <em>Serialization Expose</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityFeatureImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityFeatureImpl extends NamedDisplayElementImpl implements EntityFeature {
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
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serializationGroups;

	/**
	 * The default value of the '{@link #isSerializationExpose() <em>Serialization Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExpose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERIALIZATION_EXPOSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSerializationExpose() <em>Serialization Expose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSerializationExpose()
	 * @generated
	 * @ordered
	 */
	protected boolean serializationExpose = SERIALIZATION_EXPOSE_EDEFAULT;

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
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

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
	 * The default value of the '{@link #isCollectionAllowAdd() <em>Collection Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ALLOW_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionAllowAdd() <em>Collection Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionAllowAdd = COLLECTION_ALLOW_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionAllowRemove() <em>Collection Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ALLOW_REMOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionAllowRemove() <em>Collection Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionAllowRemove = COLLECTION_ALLOW_REMOVE_EDEFAULT;

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
		return WebsitePackage.Literals.ENTITY_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__COLUMN_NAME, oldColumnName, columnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__UNIQUE, oldUnique, unique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__ORDERED, oldOrdered, ordered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE, oldBooleanIsHasChoice, booleanIsHasChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionAllowAdd() {
		return collectionAllowAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionAllowAdd(boolean newCollectionAllowAdd) {
		boolean oldCollectionAllowAdd = collectionAllowAdd;
		collectionAllowAdd = newCollectionAllowAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_ADD, oldCollectionAllowAdd, collectionAllowAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionAllowRemove() {
		return collectionAllowRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionAllowRemove(boolean newCollectionAllowRemove) {
		boolean oldCollectionAllowRemove = collectionAllowRemove;
		collectionAllowRemove = newCollectionAllowRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE, oldCollectionAllowRemove, collectionAllowRemove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSerializationExpose() {
		return serializationExpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializationExpose(boolean newSerializationExpose) {
		boolean oldSerializationExpose = serializationExpose;
		serializationExpose = newSerializationExpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE, oldSerializationExpose, serializationExpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.ENTITY_FEATURE__PART_OF) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Entity newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.ENTITY_FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Entity newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.ENTITY_FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.ENTITY__ENTITY_FEATURES, Entity.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
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
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
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
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.ENTITY__ENTITY_FEATURES, Entity.class, msgs);
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
			case WebsitePackage.ENTITY_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE:
				return isSerializationExpose();
			case WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
				return getPartOf();
			case WebsitePackage.ENTITY_FEATURE__CARDINALITY:
				return getCardinality();
			case WebsitePackage.ENTITY_FEATURE__UNIQUE:
				return isUnique();
			case WebsitePackage.ENTITY_FEATURE__ORDERED:
				return isOrdered();
			case WebsitePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return getBooleanIsHasChoice();
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_ADD:
				return isCollectionAllowAdd();
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE:
				return isCollectionAllowRemove();
			case WebsitePackage.ENTITY_FEATURE__COLUMN_NAME:
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
			case WebsitePackage.ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends String>)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
				setPartOf((Entity)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice((isHasChoices)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLUMN_NAME:
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
			case WebsitePackage.ENTITY_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose(SERIALIZATION_EXPOSE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
				setPartOf((Entity)null);
				return;
			case WebsitePackage.ENTITY_FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice(BOOLEAN_IS_HAS_CHOICE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd(COLLECTION_ALLOW_ADD_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove(COLLECTION_ALLOW_REMOVE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_FEATURE__COLUMN_NAME:
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
			case WebsitePackage.ENTITY_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE:
				return serializationExpose != SERIALIZATION_EXPOSE_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.ENTITY_FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return booleanIsHasChoice != BOOLEAN_IS_HAS_CHOICE_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_ADD:
				return collectionAllowAdd != COLLECTION_ALLOW_ADD_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__COLLECTION_ALLOW_REMOVE:
				return collectionAllowRemove != COLLECTION_ALLOW_REMOVE_EDEFAULT;
			case WebsitePackage.ENTITY_FEATURE__COLUMN_NAME:
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
				case WebsitePackage.ENTITY_FEATURE__HEADER_CLASS: return WebsitePackage.FEATURE__HEADER_CLASS;
				case WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS: return WebsitePackage.FEATURE__DISPLAY_CLASS;
				case WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS: return WebsitePackage.FEATURE__FOOTER_CLASS;
				case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS: return WebsitePackage.FEATURE__SERIALIZATION_GROUPS;
				case WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE: return WebsitePackage.FEATURE__SERIALIZATION_EXPOSE;
				case WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY: return WebsitePackage.FEATURE__ENCODE_URI_KEY;
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
				case WebsitePackage.FEATURE__HEADER_CLASS: return WebsitePackage.ENTITY_FEATURE__HEADER_CLASS;
				case WebsitePackage.FEATURE__DISPLAY_CLASS: return WebsitePackage.ENTITY_FEATURE__DISPLAY_CLASS;
				case WebsitePackage.FEATURE__FOOTER_CLASS: return WebsitePackage.ENTITY_FEATURE__FOOTER_CLASS;
				case WebsitePackage.FEATURE__SERIALIZATION_GROUPS: return WebsitePackage.ENTITY_FEATURE__SERIALIZATION_GROUPS;
				case WebsitePackage.FEATURE__SERIALIZATION_EXPOSE: return WebsitePackage.ENTITY_FEATURE__SERIALIZATION_EXPOSE;
				case WebsitePackage.FEATURE__ENCODE_URI_KEY: return WebsitePackage.ENTITY_FEATURE__ENCODE_URI_KEY;
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
		result.append(" (headerClass: ");
		result.append(headerClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", serializationGroups: ");
		result.append(serializationGroups);
		result.append(", serializationExpose: ");
		result.append(serializationExpose);
		result.append(", encodeUriKey: ");
		result.append(encodeUriKey);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", unique: ");
		result.append(unique);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", booleanIsHasChoice: ");
		result.append(booleanIsHasChoice);
		result.append(", collectionAllowAdd: ");
		result.append(collectionAllowAdd);
		result.append(", collectionAllowRemove: ");
		result.append(collectionAllowRemove);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //EntityFeatureImpl
