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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Cardinality;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;
import uk.ac.man.cs.mdsd.webgen.persistence.View;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getSourceEntityX <em>Source Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getTargetEntityX <em>Target Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.ViewAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewAssociationImpl extends NamedDisplayElementImpl implements ViewAssociation {
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
	 * The default value of the '{@link #isPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPseudo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PSEUDO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPseudo()
	 * @generated
	 * @ordered
	 */
	protected boolean pseudo = PSEUDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEncapsulatedBy() <em>Encapsulated By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<EncapsulatedAssociation> encapsulatedBy;

	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSourceEntityX() <em>Source Entity X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntityX()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY_X__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ASSOCIATION__SOURCE_ENTITY_X).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntityX() <em>Target Entity X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntityX()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY_X__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ASSOCIATION__TARGET_ENTITY_X).getSettingDelegate();

	/**
	 * The default value of the '{@link #getSerializationMaxDepth() <em>Serialization Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationMaxDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int SERIALIZATION_MAX_DEPTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSerializationMaxDepth() <em>Serialization Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationMaxDepth()
	 * @generated
	 * @ordered
	 */
	protected int serializationMaxDepth = SERIALIZATION_MAX_DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected EncapsulatedAssociation opposite;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.VIEW_ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD, oldCollectionOrmAllowAdd, collectionOrmAllowAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE, oldCollectionOrmAllowRemove, collectionOrmAllowRemove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD, oldCollectionUiAllowAdd, collectionUiAllowAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE, oldCollectionUiAllowRemove, collectionUiAllowRemove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE, oldNullDisplayValue, nullDisplayValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != PersistencePackage.VIEW_ASSOCIATION__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, PersistencePackage.VIEW_ASSOCIATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.VIEW_ASSOCIATION__PART_OF && newPartOf != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPseudo() {
		return pseudo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudo(boolean newPseudo) {
		boolean oldPseudo = pseudo;
		pseudo = newPseudo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
		}
		return encapsulatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSourceEntityX() {
		return (EntityOrView)SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSourceEntityX() {
		return (EntityOrView)SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getTargetEntityX() {
		return (EntityOrView)TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetTargetEntityX() {
		return (EntityOrView)TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSerializationMaxDepth() {
		return serializationMaxDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializationMaxDepth(int newSerializationMaxDepth) {
		int oldSerializationMaxDepth = serializationMaxDepth;
		serializationMaxDepth = newSerializationMaxDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH, oldSerializationMaxDepth, serializationMaxDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (EncapsulatedAssociation)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(EncapsulatedAssociation newOpposite) {
		EncapsulatedAssociation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.VIEW_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
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
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulatedBy()).basicAdd(otherEnd, msgs);
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
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<?>)getEncapsulatedBy()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
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
			case PersistencePackage.VIEW_ASSOCIATION__TITLE:
				return getTitle();
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD:
				return isCollectionOrmAllowAdd();
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE:
				return isCollectionOrmAllowRemove();
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD:
				return isCollectionUiAllowAdd();
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE:
				return isCollectionUiAllowRemove();
			case PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER:
				return getPlaceholder();
			case PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				return getNullDisplayValue();
			case PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return getHeaderClass();
			case PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return getDisplayClass();
			case PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return getFooterClass();
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf();
			case PersistencePackage.VIEW_ASSOCIATION__PSEUDO:
				return isPseudo();
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case PersistencePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X:
				if (resolve) return getSourceEntityX();
				return basicGetSourceEntityX();
			case PersistencePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X:
				if (resolve) return getTargetEntityX();
				return basicGetTargetEntityX();
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return getSerializationMaxDepth();
			case PersistencePackage.VIEW_ASSOCIATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case PersistencePackage.VIEW_ASSOCIATION__CARDINALITY:
				return getCardinality();
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
			case PersistencePackage.VIEW_ASSOCIATION__TITLE:
				setTitle((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				setNullDisplayValue((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PSEUDO:
				setPseudo((Boolean)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth((Integer)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)newValue);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case PersistencePackage.VIEW_ASSOCIATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd(COLLECTION_ORM_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove(COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd(COLLECTION_UI_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove(COLLECTION_UI_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				setNullDisplayValue(NULL_DISPLAY_VALUE_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)null);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth(SERIALIZATION_MAX_DEPTH_EDEFAULT);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)null);
				return;
			case PersistencePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case PersistencePackage.VIEW_ASSOCIATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD:
				return collectionOrmAllowAdd != COLLECTION_ORM_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE:
				return collectionOrmAllowRemove != COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD:
				return collectionUiAllowAdd != COLLECTION_UI_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE:
				return collectionUiAllowRemove != COLLECTION_UI_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				return NULL_DISPLAY_VALUE_EDEFAULT == null ? nullDisplayValue != null : !NULL_DISPLAY_VALUE_EDEFAULT.equals(nullDisplayValue);
			case PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case PersistencePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf() != null;
			case PersistencePackage.VIEW_ASSOCIATION__PSEUDO:
				return pseudo != PSEUDO_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case PersistencePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X:
				return SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X:
				return TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return serializationMaxDepth != SERIALIZATION_MAX_DEPTH_EDEFAULT;
			case PersistencePackage.VIEW_ASSOCIATION__OPPOSITE:
				return opposite != null;
			case PersistencePackage.VIEW_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
				case PersistencePackage.VIEW_ASSOCIATION__TITLE: return PersistencePackage.FEATURE__TITLE;
				case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD: return PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD;
				case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE: return PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE;
				case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD: return PersistencePackage.FEATURE__COLLECTION_UI_ALLOW_ADD;
				case PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE: return PersistencePackage.FEATURE__COLLECTION_UI_ALLOW_REMOVE;
				case PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER: return PersistencePackage.FEATURE__PLACEHOLDER;
				case PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE: return PersistencePackage.FEATURE__NULL_DISPLAY_VALUE;
				case PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY: return PersistencePackage.FEATURE__ENCODE_URI_KEY;
				case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS: return PersistencePackage.FEATURE__SERIALIZATION_GROUPS;
				case PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS: return PersistencePackage.FEATURE__HEADER_CLASS;
				case PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS: return PersistencePackage.FEATURE__DISPLAY_CLASS;
				case PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS: return PersistencePackage.FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (derivedFeatureID) {
				case PersistencePackage.VIEW_ASSOCIATION__PART_OF: return PersistencePackage.VIEW_FEATURE__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case PersistencePackage.VIEW_ASSOCIATION__PSEUDO: return PersistencePackage.ASSOCIATION__PSEUDO;
				case PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS: return PersistencePackage.ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
				case PersistencePackage.FEATURE__TITLE: return PersistencePackage.VIEW_ASSOCIATION__TITLE;
				case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD: return PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_ADD;
				case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE: return PersistencePackage.VIEW_ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE;
				case PersistencePackage.FEATURE__COLLECTION_UI_ALLOW_ADD: return PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_ADD;
				case PersistencePackage.FEATURE__COLLECTION_UI_ALLOW_REMOVE: return PersistencePackage.VIEW_ASSOCIATION__COLLECTION_UI_ALLOW_REMOVE;
				case PersistencePackage.FEATURE__PLACEHOLDER: return PersistencePackage.VIEW_ASSOCIATION__PLACEHOLDER;
				case PersistencePackage.FEATURE__NULL_DISPLAY_VALUE: return PersistencePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE;
				case PersistencePackage.FEATURE__ENCODE_URI_KEY: return PersistencePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY;
				case PersistencePackage.FEATURE__SERIALIZATION_GROUPS: return PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS;
				case PersistencePackage.FEATURE__HEADER_CLASS: return PersistencePackage.VIEW_ASSOCIATION__HEADER_CLASS;
				case PersistencePackage.FEATURE__DISPLAY_CLASS: return PersistencePackage.VIEW_ASSOCIATION__DISPLAY_CLASS;
				case PersistencePackage.FEATURE__FOOTER_CLASS: return PersistencePackage.VIEW_ASSOCIATION__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (baseFeatureID) {
				case PersistencePackage.VIEW_FEATURE__PART_OF: return PersistencePackage.VIEW_ASSOCIATION__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case PersistencePackage.ASSOCIATION__PSEUDO: return PersistencePackage.VIEW_ASSOCIATION__PSEUDO;
				case PersistencePackage.ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.ASSOCIATION__INPUT_CLASS: return PersistencePackage.VIEW_ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
		result.append(", pseudo: ");
		result.append(pseudo);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", serializationMaxDepth: ");
		result.append(serializationMaxDepth);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //ViewAssociationImpl
