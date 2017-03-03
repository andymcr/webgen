/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

import uk.ac.man.cs.mdsd.webgen.webui.AssociationReference;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPath;
import uk.ac.man.cs.mdsd.webgen.webui.ChildPathAssociation;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Path Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ChildPathAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildPathAssociationImpl extends ChildPathImpl implements ChildPathAssociation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #isIsSourceAssociation() <em>Is Source Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SOURCE_ASSOCIATION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildPathAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CHILD_PATH_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
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
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, WebuiPackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, WebuiPackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSourceAssociation() {
		// TODO: implement this method to return the 'Is Source Association' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSourceEntity() {
		EntityOrView sourceEntity = basicGetSourceEntity();
		return sourceEntity != null && sourceEntity.eIsProxy() ? (EntityOrView)eResolveProxy((InternalEObject)sourceEntity) : sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSourceEntity() {
		// TODO: implement this method to return the 'Source Entity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getTargetEntity() {
		EntityOrView targetEntity = basicGetTargetEntity();
		return targetEntity != null && targetEntity.eIsProxy() ? (EntityOrView)eResolveProxy((InternalEObject)targetEntity) : targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetTargetEntity() {
		// TODO: implement this method to return the 'Target Entity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				if (childFeature != null)
					msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, null, msgs);
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				return getName();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__TARGET_ENTITY:
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((Label)newValue);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((Label)null);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				return valueDisplay != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation() != IS_SOURCE_ASSOCIATION_EDEFAULT;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__SOURCE_ENTITY:
				return basicGetSourceEntity() != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__TARGET_ENTITY:
				return basicGetTargetEntity() != null;
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
				case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME: return WebuiPackage.ASSOCIATION_REFERENCE__NAME;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION: return WebuiPackage.ASSOCIATION_REFERENCE__ASSOCIATION;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY: return WebuiPackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE: return WebuiPackage.ASSOCIATION_REFERENCE__CHILD_FEATURE;
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
				case WebuiPackage.ASSOCIATION_REFERENCE__NAME: return WebuiPackage.CHILD_PATH_ASSOCIATION__NAME;
				case WebuiPackage.ASSOCIATION_REFERENCE__ASSOCIATION: return WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION;
				case WebuiPackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY: return WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY;
				case WebuiPackage.ASSOCIATION_REFERENCE__CHILD_FEATURE: return WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChildPathAssociationImpl
