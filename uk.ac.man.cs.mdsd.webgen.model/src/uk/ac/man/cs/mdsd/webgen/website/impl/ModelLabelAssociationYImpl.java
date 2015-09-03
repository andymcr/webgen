/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociationY;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelY;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Label Association Y</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ModelLabelAssociationYImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ModelLabelAssociationYImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ModelLabelAssociationYImpl#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ModelLabelAssociationYImpl#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelLabelAssociationYImpl extends ModelLabelFeatureYImpl implements ModelLabelAssociationY {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.MODEL_LABEL_ASSOCIATION_Y__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EntityAssociation association;

	/**
	 * The cached value of the '{@link #getDynamicLabel() <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabelY dynamicLabel;

	/**
	 * The default value of the '{@link #isUseAssociationSource() <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAssociationSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ASSOCIATION_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAssociationSource() <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAssociationSource()
	 * @generated
	 * @ordered
	 */
	protected boolean useAssociationSource = USE_ASSOCIATION_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelAssociationYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.MODEL_LABEL_ASSOCIATION_Y;
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
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociation getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (EntityAssociation)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociation basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociation(EntityAssociation newAssociation) {
		EntityAssociation oldAssociation = association;
		association = newAssociation;
		// eContainer may be undefined when loading resource (used by getPartOf)
		if ((newAssociation != null) && (eContainer() != null)) {
			if (newAssociation instanceof EntityAssociation) {
				final EntityAssociation entityAssociation = (EntityAssociation) newAssociation;
				if (getPartOf().getLabelFor().equals(entityAssociation.getParentEntity())) {
					setUseAssociationSource(true);
				} else if (getPartOf().getLabelFor().equals(entityAssociation.getTargetEntity())) {
					setUseAssociationSource(false);
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelY getDynamicLabel() {
		if (dynamicLabel != null && dynamicLabel.eIsProxy()) {
			InternalEObject oldDynamicLabel = (InternalEObject)dynamicLabel;
			dynamicLabel = (ModelLabelY)eResolveProxy(oldDynamicLabel);
			if (dynamicLabel != oldDynamicLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
			}
		}
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelY basicGetDynamicLabel() {
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicLabel(ModelLabelY newDynamicLabel) {
		ModelLabelY oldDynamicLabel = dynamicLabel;
		dynamicLabel = newDynamicLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAssociationSource() {
		return useAssociationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseAssociationSource(boolean newUseAssociationSource) {
		boolean oldUseAssociationSource = useAssociationSource;
		useAssociationSource = newUseAssociationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__USE_ASSOCIATION_SOURCE, oldUseAssociationSource, useAssociationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__NAME:
				return getName();
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL:
				if (resolve) return getDynamicLabel();
				return basicGetDynamicLabel();
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__USE_ASSOCIATION_SOURCE:
				return isUseAssociationSource();
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
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__NAME:
				setName((String)newValue);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION:
				setAssociation((EntityAssociation)newValue);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabelY)newValue);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource((Boolean)newValue);
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
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION:
				setAssociation((EntityAssociation)null);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabelY)null);
				return;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__USE_ASSOCIATION_SOURCE:
				setUseAssociationSource(USE_ASSOCIATION_SOURCE_EDEFAULT);
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
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__ASSOCIATION:
				return association != null;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__DYNAMIC_LABEL:
				return dynamicLabel != null;
			case WebsitePackage.MODEL_LABEL_ASSOCIATION_Y__USE_ASSOCIATION_SOURCE:
				return useAssociationSource != USE_ASSOCIATION_SOURCE_EDEFAULT;
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
		result.append(" (useAssociationSource: ");
		result.append(useAssociationSource);
		result.append(')');
		return result.toString();
	}

} //ModelLabelAssociationYImpl
