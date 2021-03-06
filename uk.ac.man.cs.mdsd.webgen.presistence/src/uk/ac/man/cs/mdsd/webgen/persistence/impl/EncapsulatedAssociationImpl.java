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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Cardinality;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#isPseudo <em>Pseudo</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getEncapsulatedBy <em>Encapsulated By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getSourceEntityX <em>Source Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getTargetEntityX <em>Target Entity X</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getSerializationMaxDepth <em>Serialization Max Depth</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getEncapsulatedTarget <em>Encapsulated Target</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.impl.EncapsulatedAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncapsulatedAssociationImpl extends EncapsulatedFeatureImpl implements EncapsulatedAssociation {
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
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getEncapsulatedTarget() <em>Encapsulated Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedTarget()
	 * @generated
	 * @ordered
	 */
	protected EncapsulatedAssociation encapsulatedTarget;

	/**
	 * The cached setting delegate for the '{@link #isIsSourceAssociation() <em>Is Source Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CARDINALITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__CARDINALITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ENCAPSULATED_ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncapsulatedAssociation> getEncapsulatedBy() {
		if (encapsulatedBy == null) {
			encapsulatedBy = new EObjectWithInverseResolvingEList<EncapsulatedAssociation>(EncapsulatedAssociation.class, this, PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH, oldSerializationMaxDepth, serializationMaxDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, PersistencePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, PersistencePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation getEncapsulatedTarget() {
		if (encapsulatedTarget != null && encapsulatedTarget.eIsProxy()) {
			InternalEObject oldEncapsulatedTarget = (InternalEObject)encapsulatedTarget;
			encapsulatedTarget = (EncapsulatedAssociation)eResolveProxy(oldEncapsulatedTarget);
			if (encapsulatedTarget != oldEncapsulatedTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET, oldEncapsulatedTarget, encapsulatedTarget));
			}
		}
		return encapsulatedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedAssociation basicGetEncapsulatedTarget() {
		return encapsulatedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulatedTarget(EncapsulatedAssociation newEncapsulatedTarget) {
		EncapsulatedAssociation oldEncapsulatedTarget = encapsulatedTarget;
		encapsulatedTarget = newEncapsulatedTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET, oldEncapsulatedTarget, encapsulatedTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSourceAssociation() {
		return (Boolean)IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return (Cardinality)CARDINALITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		CARDINALITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSourceEntity() {
		return (Entity)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		return (Entity)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTargetEntity() {
		return (Entity)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return (Entity)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEncapsulatedBy()).basicAdd(otherEnd, msgs);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, PersistencePackage.ASSOCIATION__ENCAPSULATED_BY, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return ((InternalEList<?>)getEncapsulatedBy()).basicRemove(otherEnd, msgs);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				return basicSetAssociation(null, msgs);
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO:
				return isPseudo();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return getEncapsulatedBy();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY_X:
				if (resolve) return getSourceEntityX();
				return basicGetSourceEntityX();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY_X:
				if (resolve) return getTargetEntityX();
				return basicGetTargetEntityX();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return getSerializationMaxDepth();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__NAME:
				return getName();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				if (resolve) return getEncapsulatedTarget();
				return basicGetEncapsulatedTarget();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO:
				setPseudo((Boolean)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				getEncapsulatedBy().addAll((Collection<? extends EncapsulatedAssociation>)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth((Integer)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				setEncapsulatedTarget((EncapsulatedAssociation)newValue);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO:
				setPseudo(PSEUDO_EDEFAULT);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				getEncapsulatedBy().clear();
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				setSerializationMaxDepth(SERIALIZATION_MAX_DEPTH_EDEFAULT);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				setEncapsulatedTarget((EncapsulatedAssociation)null);
				return;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				CARDINALITY__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO:
				return pseudo != PSEUDO_EDEFAULT;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY:
				return encapsulatedBy != null && !encapsulatedBy.isEmpty();
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY_X:
				return SOURCE_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY_X:
				return TARGET_ENTITY_X__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH:
				return serializationMaxDepth != SERIALIZATION_MAX_DEPTH_EDEFAULT;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ASSOCIATION:
				return association != null;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET:
				return encapsulatedTarget != null;
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__CARDINALITY:
				return CARDINALITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY:
				return SOURCE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY:
				return TARGET_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO: return PersistencePackage.ASSOCIATION__PSEUDO;
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS: return PersistencePackage.ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
				case PersistencePackage.ASSOCIATION__PSEUDO: return PersistencePackage.ENCAPSULATED_ASSOCIATION__PSEUDO;
				case PersistencePackage.ASSOCIATION__ENCAPSULATED_BY: return PersistencePackage.ENCAPSULATED_ASSOCIATION__ENCAPSULATED_BY;
				case PersistencePackage.ASSOCIATION__INPUT_CLASS: return PersistencePackage.ENCAPSULATED_ASSOCIATION__INPUT_CLASS;
				case PersistencePackage.ASSOCIATION__SOURCE_ENTITY_X: return PersistencePackage.ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY_X;
				case PersistencePackage.ASSOCIATION__TARGET_ENTITY_X: return PersistencePackage.ENCAPSULATED_ASSOCIATION__TARGET_ENTITY_X;
				case PersistencePackage.ASSOCIATION__SERIALIZATION_MAX_DEPTH: return PersistencePackage.ENCAPSULATED_ASSOCIATION__SERIALIZATION_MAX_DEPTH;
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
		result.append(')');
		return result.toString();
	}

} //EncapsulatedAssociationImpl
