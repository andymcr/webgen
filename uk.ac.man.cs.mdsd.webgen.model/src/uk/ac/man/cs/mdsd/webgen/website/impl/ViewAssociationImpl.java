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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.base.impl.NamedDisplayElementImpl;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isSerializationExpose <em>Serialization Expose</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getSourceEntityX <em>Source Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetEntityX <em>Target Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getCardinality <em>Cardinality</em>}</li>
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
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY_X__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ASSOCIATION__SOURCE_ENTITY_X).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getTargetEntityX() <em>Target Entity X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntityX()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY_X__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.ASSOCIATION__TARGET_ENTITY_X).getSettingDelegate();
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
		return WebsitePackage.Literals.VIEW_ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD, oldCollectionAllowAdd, collectionAllowAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE, oldCollectionAllowRemove, collectionAllowRemove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE, oldNullDisplayValue, nullDisplayValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS, oldFooterClass, footerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE, oldSerializationExpose, serializationExpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.VIEW_ASSOCIATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__PART_OF, newPartOf, newPartOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY, WebsitePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
		}
		return encapsulatedBy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH, oldSerializationMaxDepth, serializationMaxDepth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
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
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.VIEW__VIEW_FEATURES, View.class, msgs);
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
			case WebsitePackage.VIEW_ASSOCIATION__TITLE:
				return getTitle();
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD:
				return isCollectionAllowAdd();
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE:
				return isCollectionAllowRemove();
			case WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				return getNullDisplayValue();
			case WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				return getSerializationGroups();
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE:
				return isSerializationExpose();
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf();
			case WebsitePackage.VIEW_ASSOCIATION__PSEUDO:
				return isPseudo();
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X:
				if (resolve) return getSourceEntityX();
				return basicGetSourceEntityX();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X:
				if (resolve) return getTargetEntityX();
				return basicGetTargetEntityX();
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return getSerializationMaxDepth();
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
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
			case WebsitePackage.VIEW_ASSOCIATION__TITLE:
				setTitle((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				setNullDisplayValue((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends String>)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE:
				setSerializationExpose((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PSEUDO:
				setPseudo((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth((Integer)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
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
			case WebsitePackage.VIEW_ASSOCIATION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD:
				setCollectionAllowAdd(COLLECTION_ALLOW_ADD_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE:
				setCollectionAllowRemove(COLLECTION_ALLOW_REMOVE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				setNullDisplayValue(NULL_DISPLAY_VALUE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE:
				setSerializationExpose(SERIALIZATION_EXPOSE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth(SERIALIZATION_MAX_DEPTH_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				setOpposite((EncapsulatedAssociation)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
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
			case WebsitePackage.VIEW_ASSOCIATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD:
				return collectionAllowAdd != COLLECTION_ALLOW_ADD_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE:
				return collectionAllowRemove != COLLECTION_ALLOW_REMOVE_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE:
				return NULL_DISPLAY_VALUE_EDEFAULT == null ? nullDisplayValue != null : !NULL_DISPLAY_VALUE_EDEFAULT.equals(nullDisplayValue);
			case WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE:
				return serializationExpose != SERIALIZATION_EXPOSE_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.VIEW_ASSOCIATION__PSEUDO:
				return pseudo != PSEUDO_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X:
				return SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X:
				return TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return serializationMaxDepth != SERIALIZATION_MAX_DEPTH_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__OPPOSITE:
				return opposite != null;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
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
				case WebsitePackage.VIEW_ASSOCIATION__TITLE: return WebsitePackage.FEATURE__TITLE;
				case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD: return WebsitePackage.FEATURE__COLLECTION_ALLOW_ADD;
				case WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE: return WebsitePackage.FEATURE__COLLECTION_ALLOW_REMOVE;
				case WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE: return WebsitePackage.FEATURE__NULL_DISPLAY_VALUE;
				case WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY: return WebsitePackage.FEATURE__ENCODE_URI_KEY;
				case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS: return WebsitePackage.FEATURE__SERIALIZATION_GROUPS;
				case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE: return WebsitePackage.FEATURE__SERIALIZATION_EXPOSE;
				case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS: return WebsitePackage.FEATURE__HEADER_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS: return WebsitePackage.FEATURE__DISPLAY_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS: return WebsitePackage.FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__PART_OF: return WebsitePackage.VIEW_FEATURE__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__PSEUDO: return WebsitePackage.ASSOCIATION__PSEUDO;
				case WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS: return WebsitePackage.ASSOCIATION__INPUT_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X: return WebsitePackage.ASSOCIATION__SOURCE_ENTITY_X;
				case WebsitePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X: return WebsitePackage.ASSOCIATION__TARGET_ENTITY_X;
				case WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH: return WebsitePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
				case WebsitePackage.FEATURE__TITLE: return WebsitePackage.VIEW_ASSOCIATION__TITLE;
				case WebsitePackage.FEATURE__COLLECTION_ALLOW_ADD: return WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_ADD;
				case WebsitePackage.FEATURE__COLLECTION_ALLOW_REMOVE: return WebsitePackage.VIEW_ASSOCIATION__COLLECTION_ALLOW_REMOVE;
				case WebsitePackage.FEATURE__NULL_DISPLAY_VALUE: return WebsitePackage.VIEW_ASSOCIATION__NULL_DISPLAY_VALUE;
				case WebsitePackage.FEATURE__ENCODE_URI_KEY: return WebsitePackage.VIEW_ASSOCIATION__ENCODE_URI_KEY;
				case WebsitePackage.FEATURE__SERIALIZATION_GROUPS: return WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_GROUPS;
				case WebsitePackage.FEATURE__SERIALIZATION_EXPOSE: return WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_EXPOSE;
				case WebsitePackage.FEATURE__HEADER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS;
				case WebsitePackage.FEATURE__DISPLAY_CLASS: return WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS;
				case WebsitePackage.FEATURE__FOOTER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.VIEW_FEATURE__PART_OF: return WebsitePackage.VIEW_ASSOCIATION__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ASSOCIATION__PSEUDO: return WebsitePackage.VIEW_ASSOCIATION__PSEUDO;
				case WebsitePackage.ASSOCIATION__ENCAPSULATED_BY: return WebsitePackage.VIEW_ASSOCIATION__ENCAPSULATED_BY;
				case WebsitePackage.ASSOCIATION__INPUT_CLASS: return WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS;
				case WebsitePackage.ASSOCIATION__SOURCE_ENTITY_X: return WebsitePackage.VIEW_ASSOCIATION__SOURCE_ENTITY_X;
				case WebsitePackage.ASSOCIATION__TARGET_ENTITY_X: return WebsitePackage.VIEW_ASSOCIATION__TARGET_ENTITY_X;
				case WebsitePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH: return WebsitePackage.VIEW_ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
