/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.interface_.AssociationReference;
import uk.ac.man.cs.mdsd.webgen.interface_.ChildPath;
import uk.ac.man.cs.mdsd.webgen.interface_.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Path Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.FeaturePathAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePathAssociationImpl extends FeaturePathImpl implements FeaturePathAssociation {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebGenInterfacePackage.Literals.ASSOCIATION_REFERENCE__NAME).getSettingDelegate();

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
	 * The cached value of the '{@link #getValueDisplay() <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDisplay()
	 * @generated
	 * @ordered
	 */
	protected Label valueDisplay;

	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected ChildPath childFeature;

	/**
	 * The cached setting delegate for the '{@link #isIsSourceAssociation() <em>Is Source Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebGenInterfacePackage.Literals.FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebGenInterfacePackage.Literals.FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebGenInterfacePackage.Literals.FEATURE_PATH_ASSOCIATION__TARGET_ENTITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePathAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenInterfacePackage.Literals.FEATURE_PATH_ASSOCIATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getValueDisplay() {
		if (valueDisplay != null && valueDisplay.eIsProxy()) {
			InternalEObject oldValueDisplay = (InternalEObject)valueDisplay;
			valueDisplay = (Label)eResolveProxy(oldValueDisplay);
			if (valueDisplay != oldValueDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
			}
		}
		return valueDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetValueDisplay() {
		return valueDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDisplay(Label newValueDisplay) {
		Label oldValueDisplay = valueDisplay;
		valueDisplay = newValueDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPath getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(ChildPath newChildFeature, NotificationChain msgs) {
		ChildPath oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFeature(ChildPath newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, WebGenInterfacePackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, WebGenInterfacePackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
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
	public EntityOrView getSourceEntity() {
		return (EntityOrView)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSourceEntity() {
		return (EntityOrView)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getTargetEntity() {
		return (EntityOrView)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetTargetEntity() {
		return (EntityOrView)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				if (childFeature != null)
					msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE, null, msgs);
				return basicSetChildFeature((ChildPath)otherEnd, msgs);
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
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				return basicSetChildFeature(null, msgs);
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
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__NAME:
				return getName();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__TARGET_ENTITY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((Label)newValue);
				return;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildPath)newValue);
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
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((Label)null);
				return;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildPath)null);
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
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY:
				return valueDisplay != null;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__SOURCE_ENTITY:
				return SOURCE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__TARGET_ENTITY:
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
		if (baseClass == AssociationReference.class) {
			switch (derivedFeatureID) {
				case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__NAME: return WebGenInterfacePackage.ASSOCIATION_REFERENCE__NAME;
				case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION: return WebGenInterfacePackage.ASSOCIATION_REFERENCE__ASSOCIATION;
				case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY: return WebGenInterfacePackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY;
				case WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE: return WebGenInterfacePackage.ASSOCIATION_REFERENCE__CHILD_FEATURE;
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
		if (baseClass == AssociationReference.class) {
			switch (baseFeatureID) {
				case WebGenInterfacePackage.ASSOCIATION_REFERENCE__NAME: return WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__NAME;
				case WebGenInterfacePackage.ASSOCIATION_REFERENCE__ASSOCIATION: return WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__ASSOCIATION;
				case WebGenInterfacePackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY: return WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__VALUE_DISPLAY;
				case WebGenInterfacePackage.ASSOCIATION_REFERENCE__CHILD_FEATURE: return WebGenInterfacePackage.FEATURE_PATH_ASSOCIATION__CHILD_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeaturePathAssociationImpl
