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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;
import uk.ac.man.cs.mdsd.webgen.persistence.View;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewFeatureImpl extends MinimalEObjectImpl.Container implements ViewFeature {
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
	 * The default value of the '{@link #isCollectionUiAllowAdd() <em>Collection Ui Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_UI_ALLOW_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionUiAllowAdd() <em>Collection Ui Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionUiAllowAdd = COLLECTION_UI_ALLOW_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionUiAllowRemove() <em>Collection Ui Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_UI_ALLOW_REMOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionUiAllowRemove() <em>Collection Ui Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionUiAllowRemove = COLLECTION_UI_ALLOW_REMOVE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.VIEW_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_ADD, oldCollectionOrmAllowAdd, collectionOrmAllowAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_REMOVE, oldCollectionOrmAllowRemove, collectionOrmAllowRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionUiAllowAdd() {
		return collectionUiAllowAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionUiAllowAdd(boolean newCollectionUiAllowAdd) {
		boolean oldCollectionUiAllowAdd = collectionUiAllowAdd;
		collectionUiAllowAdd = newCollectionUiAllowAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_ADD, oldCollectionUiAllowAdd, collectionUiAllowAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectionUiAllowRemove() {
		return collectionUiAllowRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionUiAllowRemove(boolean newCollectionUiAllowRemove) {
		boolean oldCollectionUiAllowRemove = collectionUiAllowRemove;
		collectionUiAllowRemove = newCollectionUiAllowRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_REMOVE, oldCollectionUiAllowRemove, collectionUiAllowRemove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE, oldNullDisplayValue, nullDisplayValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != PersistencePackage.VIEW_FEATURE__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, PersistencePackage.VIEW_FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.VIEW_FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, PersistencePackage.VIEW__VIEW_FEATURES, View.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
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
			case PersistencePackage.VIEW_FEATURE__PART_OF:
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
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.VIEW__VIEW_FEATURES, View.class, msgs);
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
			case PersistencePackage.VIEW_FEATURE__TITLE:
				return getTitle();
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return isCollectionOrmAllowAdd();
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return isCollectionOrmAllowRemove();
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_ADD:
				return isCollectionUiAllowAdd();
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				return isCollectionUiAllowRemove();
			case PersistencePackage.VIEW_FEATURE__PLACEHOLDER:
				return getPlaceholder();
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				return getNullDisplayValue();
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case PersistencePackage.VIEW_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case PersistencePackage.VIEW_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case PersistencePackage.VIEW_FEATURE__FOOTER_CLASS:
				return getFooterClass();
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				return getPartOf();
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
			case PersistencePackage.VIEW_FEATURE__TITLE:
				setTitle((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				setNullDisplayValue((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				setPartOf((View)newValue);
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
			case PersistencePackage.VIEW_FEATURE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd(COLLECTION_ORM_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove(COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd(COLLECTION_UI_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove(COLLECTION_UI_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				setNullDisplayValue(NULL_DISPLAY_VALUE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case PersistencePackage.VIEW_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				setPartOf((View)null);
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
			case PersistencePackage.VIEW_FEATURE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return collectionOrmAllowAdd != COLLECTION_ORM_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return collectionOrmAllowRemove != COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_ADD:
				return collectionUiAllowAdd != COLLECTION_UI_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				return collectionUiAllowRemove != COLLECTION_UI_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				return NULL_DISPLAY_VALUE_EDEFAULT == null ? nullDisplayValue != null : !NULL_DISPLAY_VALUE_EDEFAULT.equals(nullDisplayValue);
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case PersistencePackage.VIEW_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case PersistencePackage.VIEW_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case PersistencePackage.VIEW_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case PersistencePackage.VIEW_FEATURE__PART_OF:
				return getPartOf() != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", collectionOrmAllowAdd: ");
		result.append(collectionOrmAllowAdd);
		result.append(", collectionOrmAllowRemove: ");
		result.append(collectionOrmAllowRemove);
		result.append(", collectionUiAllowAdd: ");
		result.append(collectionUiAllowAdd);
		result.append(", collectionUiAllowRemove: ");
		result.append(collectionUiAllowRemove);
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
		result.append(')');
		return result.toString();
	}

} //ViewFeatureImpl
