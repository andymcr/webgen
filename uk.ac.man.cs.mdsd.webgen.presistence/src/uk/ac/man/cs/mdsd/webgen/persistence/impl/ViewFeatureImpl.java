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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewFeatureImpl#isSerializationExpose <em>Serialization Expose</em>}</li>
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_ADD, oldCollectionAllowAdd, collectionAllowAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_REMOVE, oldCollectionAllowRemove, collectionAllowRemove));
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
	public EList<String> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EDataTypeUniqueEList<String>(String.class, this, PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE, oldSerializationExpose, serializationExpose));
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
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_ADD:
				return isCollectionAllowAdd();
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_REMOVE:
				return isCollectionAllowRemove();
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				return getNullDisplayValue();
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				return isSerializationExpose();
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
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				setNullDisplayValue((String)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends String>)newValue);
				return;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose((Boolean)newValue);
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
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd(COLLECTION_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove(COLLECTION_ALLOW_REMOVE_EDEFAULT);
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
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				setSerializationExpose(SERIALIZATION_EXPOSE_EDEFAULT);
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
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_ADD:
				return collectionAllowAdd != COLLECTION_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__COLLECTION_ALLOW_REMOVE:
				return collectionAllowRemove != COLLECTION_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__NULL_DISPLAY_VALUE:
				return NULL_DISPLAY_VALUE_EDEFAULT == null ? nullDisplayValue != null : !NULL_DISPLAY_VALUE_EDEFAULT.equals(nullDisplayValue);
			case PersistencePackage.VIEW_FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case PersistencePackage.VIEW_FEATURE__SERIALIZATION_EXPOSE:
				return serializationExpose != SERIALIZATION_EXPOSE_EDEFAULT;
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
		result.append(", collectionAllowAdd: ");
		result.append(collectionAllowAdd);
		result.append(", collectionAllowRemove: ");
		result.append(collectionAllowRemove);
		result.append(", nullDisplayValue: ");
		result.append(nullDisplayValue);
		result.append(", encodeUriKey: ");
		result.append(encodeUriKey);
		result.append(", serializationGroups: ");
		result.append(serializationGroups);
		result.append(", serializationExpose: ");
		result.append(serializationExpose);
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
