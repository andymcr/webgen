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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getSourceEntityX <em>Source Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetEntityX <em>Target Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#isTargetPrimaryKey <em>Target Primary Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetColumnName <em>Target Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EntityAssociationImpl#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityAssociationImpl extends EntityFeatureImpl implements EntityAssociation {
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
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationKey> keys;

	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

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
	 * The default value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIVOT_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected String pivotTableName = PIVOT_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String targetFeatureName = TARGET_FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetPrimaryKey() <em>Target Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetPrimaryKey() <em>Target Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean targetPrimaryKey = TARGET_PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected String targetColumnName = TARGET_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayLabel = TARGET_DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String targetHeaderClass = TARGET_HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_INPUT_CLASS_EDEFAULT = "input_association";

	/**
	 * The cached value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected String targetInputClass = TARGET_INPUT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayClass = TARGET_DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String targetFooterClass = TARGET_FOOTER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ENTITY_ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH, oldSerializationMaxDepth, serializationMaxDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationKey> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentWithInverseEList<AssociationKey>(AssociationKey.class, this, PersistencePackage.ENTITY_ASSOCIATION__KEYS, PersistencePackage.ASSOCIATION_KEY__KEY_FOR);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTargetEntity() {
		if (targetEntity != null && targetEntity.eIsProxy()) {
			InternalEObject oldTargetEntity = (InternalEObject)targetEntity;
			targetEntity = (Entity)eResolveProxy(oldTargetEntity);
			if (targetEntity != oldTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, oldTargetEntity, targetEntity));
			}
		}
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEntity(Entity newTargetEntity, NotificationChain msgs) {
		Entity oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEntity(Entity newTargetEntity) {
		if (newTargetEntity != targetEntity) {
			NotificationChain msgs = null;
			if (targetEntity != null)
				msgs = ((InternalEObject)targetEntity).eInverseRemove(this, PersistencePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
			if (newTargetEntity != null)
				msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, PersistencePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
			msgs = basicSetTargetEntity(newTargetEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, newTargetEntity, newTargetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPivotTableName() {
		return pivotTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPivotTableName(String newPivotTableName) {
		String oldPivotTableName = pivotTableName;
		pivotTableName = newPivotTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME, oldPivotTableName, pivotTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFeatureName() {
		return targetFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeatureName(String newTargetFeatureName) {
		String oldTargetFeatureName = targetFeatureName;
		targetFeatureName = newTargetFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME, oldTargetFeatureName, targetFeatureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetPrimaryKey() {
		return targetPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPrimaryKey(boolean newTargetPrimaryKey) {
		boolean oldTargetPrimaryKey = targetPrimaryKey;
		targetPrimaryKey = newTargetPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY, oldTargetPrimaryKey, targetPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetColumnName() {
		return targetColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetColumnName(String newTargetColumnName) {
		String oldTargetColumnName = targetColumnName;
		targetColumnName = newTargetColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_COLUMN_NAME, oldTargetColumnName, targetColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayLabel() {
		return targetDisplayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayLabel(String newTargetDisplayLabel) {
		String oldTargetDisplayLabel = targetDisplayLabel;
		targetDisplayLabel = newTargetDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL, oldTargetDisplayLabel, targetDisplayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHeaderClass() {
		return targetHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHeaderClass(String newTargetHeaderClass) {
		String oldTargetHeaderClass = targetHeaderClass;
		targetHeaderClass = newTargetHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS, oldTargetHeaderClass, targetHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetInputClass() {
		return targetInputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInputClass(String newTargetInputClass) {
		String oldTargetInputClass = targetInputClass;
		targetInputClass = newTargetInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS, oldTargetInputClass, targetInputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayClass() {
		return targetDisplayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayClass(String newTargetDisplayClass) {
		String oldTargetDisplayClass = targetDisplayClass;
		targetDisplayClass = newTargetDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS, oldTargetDisplayClass, targetDisplayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFooterClass() {
		return targetFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFooterClass(String newTargetFooterClass) {
		String oldTargetFooterClass = targetFooterClass;
		targetFooterClass = newTargetFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS, oldTargetFooterClass, targetFooterClass));
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
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulatedBy()).basicAdd(otherEnd, msgs);
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeys()).basicAdd(otherEnd, msgs);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				if (targetEntity != null)
					msgs = ((InternalEObject)targetEntity).eInverseRemove(this, PersistencePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
				return basicSetTargetEntity((Entity)otherEnd, msgs);
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
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<?>)getEncapsulatedBy()).basicRemove(otherEnd, msgs);
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				return basicSetTargetEntity(null, msgs);
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
			case PersistencePackage.ENTITY_ASSOCIATION__PSEUDO:
				return isPseudo();
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case PersistencePackage.ENTITY_ASSOCIATION__SOURCE_ENTITY_X:
				if (resolve) return getSourceEntityX();
				return basicGetSourceEntityX();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY_X:
				if (resolve) return getTargetEntityX();
				return basicGetTargetEntityX();
			case PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return getSerializationMaxDepth();
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				return getKeys();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case PersistencePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				return isBidirectional();
			case PersistencePackage.ENTITY_ASSOCIATION__UNIQUE:
				return isUnique();
			case PersistencePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				return getPivotTableName();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				return getTargetFeatureName();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY:
				return isTargetPrimaryKey();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_COLUMN_NAME:
				return getTargetColumnName();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return getTargetDisplayLabel();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				return getTargetHeaderClass();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				return getTargetInputClass();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return getTargetDisplayClass();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				return getTargetFooterClass();
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
			case PersistencePackage.ENTITY_ASSOCIATION__PSEUDO:
				setPseudo((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth((Integer)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends AssociationKey>)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				setTargetEntity((Entity)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY:
				setTargetPrimaryKey((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_COLUMN_NAME:
				setTargetColumnName((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass((String)newValue);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass((String)newValue);
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
			case PersistencePackage.ENTITY_ASSOCIATION__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth(SERIALIZATION_MAX_DEPTH_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				getKeys().clear();
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				setTargetEntity((Entity)null);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName(PIVOT_TABLE_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName(TARGET_FEATURE_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY:
				setTargetPrimaryKey(TARGET_PRIMARY_KEY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_COLUMN_NAME:
				setTargetColumnName(TARGET_COLUMN_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel(TARGET_DISPLAY_LABEL_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass(TARGET_HEADER_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass(TARGET_INPUT_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass(TARGET_DISPLAY_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass(TARGET_FOOTER_CLASS_EDEFAULT);
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
			case PersistencePackage.ENTITY_ASSOCIATION__PSEUDO:
				return pseudo != PSEUDO_EDEFAULT;
			case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case PersistencePackage.ENTITY_ASSOCIATION__SOURCE_ENTITY_X:
				return SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY_X:
				return TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return serializationMaxDepth != SERIALIZATION_MAX_DEPTH_EDEFAULT;
			case PersistencePackage.ENTITY_ASSOCIATION__KEYS:
				return keys != null && !keys.isEmpty();
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				return targetEntity != null;
			case PersistencePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case PersistencePackage.ENTITY_ASSOCIATION__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case PersistencePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				return PIVOT_TABLE_NAME_EDEFAULT == null ? pivotTableName != null : !PIVOT_TABLE_NAME_EDEFAULT.equals(pivotTableName);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				return TARGET_FEATURE_NAME_EDEFAULT == null ? targetFeatureName != null : !TARGET_FEATURE_NAME_EDEFAULT.equals(targetFeatureName);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY:
				return targetPrimaryKey != TARGET_PRIMARY_KEY_EDEFAULT;
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_COLUMN_NAME:
				return TARGET_COLUMN_NAME_EDEFAULT == null ? targetColumnName != null : !TARGET_COLUMN_NAME_EDEFAULT.equals(targetColumnName);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return TARGET_DISPLAY_LABEL_EDEFAULT == null ? targetDisplayLabel != null : !TARGET_DISPLAY_LABEL_EDEFAULT.equals(targetDisplayLabel);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				return TARGET_HEADER_CLASS_EDEFAULT == null ? targetHeaderClass != null : !TARGET_HEADER_CLASS_EDEFAULT.equals(targetHeaderClass);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				return TARGET_INPUT_CLASS_EDEFAULT == null ? targetInputClass != null : !TARGET_INPUT_CLASS_EDEFAULT.equals(targetInputClass);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return TARGET_DISPLAY_CLASS_EDEFAULT == null ? targetDisplayClass != null : !TARGET_DISPLAY_CLASS_EDEFAULT.equals(targetDisplayClass);
			case PersistencePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				return TARGET_FOOTER_CLASS_EDEFAULT == null ? targetFooterClass != null : !TARGET_FOOTER_CLASS_EDEFAULT.equals(targetFooterClass);
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
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case PersistencePackage.ENTITY_ASSOCIATION__PSEUDO: return PersistencePackage.ASSOCIATION__PSEUDO;
				case PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS: return PersistencePackage.ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.ENTITY_ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case PersistencePackage.ASSOCIATION__PSEUDO: return PersistencePackage.ENTITY_ASSOCIATION__PSEUDO;
				case PersistencePackage.ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.ENTITY_ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.ASSOCIATION__INPUT_CLASS: return PersistencePackage.ENTITY_ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.ENTITY_ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.ENTITY_ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.ENTITY_ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
		result.append(" (pseudo: ");
		result.append(pseudo);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", serializationMaxDepth: ");
		result.append(serializationMaxDepth);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", unique: ");
		result.append(unique);
		result.append(", pivotTableName: ");
		result.append(pivotTableName);
		result.append(", targetFeatureName: ");
		result.append(targetFeatureName);
		result.append(", targetPrimaryKey: ");
		result.append(targetPrimaryKey);
		result.append(", targetColumnName: ");
		result.append(targetColumnName);
		result.append(", targetDisplayLabel: ");
		result.append(targetDisplayLabel);
		result.append(", targetHeaderClass: ");
		result.append(targetHeaderClass);
		result.append(", targetInputClass: ");
		result.append(targetInputClass);
		result.append(", targetDisplayClass: ");
		result.append(targetDisplayClass);
		result.append(", targetFooterClass: ");
		result.append(targetFooterClass);
		result.append(')');
		return result.toString();
	}

} //EntityAssociationImpl
