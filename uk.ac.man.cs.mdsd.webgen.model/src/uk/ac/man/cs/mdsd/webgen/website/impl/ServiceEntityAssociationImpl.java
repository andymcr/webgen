/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#isUseFeatureSource <em>Use Feature Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceEntityAssociationImpl#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceEntityAssociationImpl extends ServiceEntityFeatureImpl implements ServiceEntityAssociation {
	/**
	 * The cached value of the '{@link #getOppositeService() <em>Opposite Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeService()
	 * @generated
	 * @ordered
	 */
	protected Service oppositeService;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Association feature;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDynamicLabel() <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel dynamicLabel;

	/**
	 * The default value of the '{@link #isUseFeatureSource() <em>Use Feature Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFeatureSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FEATURE_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFeatureSource() <em>Use Feature Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFeatureSource()
	 * @generated
	 * @ordered
	 */
	protected boolean useFeatureSource = USE_FEATURE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeFeature() <em>Opposite Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceAssociation oppositeFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEntityAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SERVICE_ENTITY_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getOppositeService() {
		if (oppositeService != null && oppositeService.eIsProxy()) {
			InternalEObject oldOppositeService = (InternalEObject)oppositeService;
			oppositeService = (Service)eResolveProxy(oldOppositeService);
			if (oppositeService != oldOppositeService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
			}
		}
		return oppositeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetOppositeService() {
		return oppositeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOppositeService(Service newOppositeService) {
		Service oldOppositeService = oppositeService;
		oppositeService = newOppositeService;
		if ((getOppositeFeature() != null) && (oppositeService != null)
				&& !oppositeService.getFeatures().contains(getOppositeFeature())) {
			setOppositeFeature(null);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation getOppositeFeature() {
		if (oppositeFeature != null && oppositeFeature.eIsProxy()) {
			InternalEObject oldOppositeFeature = (InternalEObject)oppositeFeature;
			oppositeFeature = (ServiceAssociation)eResolveProxy(oldOppositeFeature);
			if (oppositeFeature != oldOppositeFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
			}
		}
		return oppositeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation basicGetOppositeFeature() {
		return oppositeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOppositeFeature(ServiceAssociation newOppositeFeature) {
		ServiceAssociation oldOppositeFeature = oppositeFeature;
		oppositeFeature = newOppositeFeature;
		if (oppositeFeature != null) {
			if (getOppositeService() == null) {
				setOppositeService(oppositeFeature.getPartOf());
			} else {
				if (!getOppositeService().equals(oppositeFeature.getPartOf())) {
					setOppositeService(oppositeFeature.getPartOf());
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Association)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeature(Association newFeature) {
		Association oldFeature = feature;
		feature = newFeature;
		// eContainer may be undefined when loading resource (used by getPartOf)
		if ((newFeature != null) && (eContainer() != null)) {
			if (getPartOf().getEncapsulates().contains(newFeature.getParentEntity())) {
				if (!getPartOf().getEncapsulates().contains(newFeature.getTargetEntity())) {
					setUseFeatureSource(true);
				}
			} else {
				if (getPartOf().getEncapsulates().contains(newFeature.getTargetEntity())) {
					setUseFeatureSource(false);
				}
			}
		}
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE, oldFeature, feature));
		}

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
	public ModelLabel getDynamicLabel() {
		if (dynamicLabel != null && dynamicLabel.eIsProxy()) {
			InternalEObject oldDynamicLabel = (InternalEObject)dynamicLabel;
			dynamicLabel = (ModelLabel)eResolveProxy(oldDynamicLabel);
			if (dynamicLabel != oldDynamicLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
			}
		}
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel basicGetDynamicLabel() {
		return dynamicLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicLabel(ModelLabel newDynamicLabel) {
		ModelLabel oldDynamicLabel = dynamicLabel;
		dynamicLabel = newDynamicLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFeatureSource() {
		return useFeatureSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUseFeatureSource(boolean newUseFeatureSource) {
		boolean oldUseFeatureSource = useFeatureSource;
		useFeatureSource = newUseFeatureSource;
		boolean featureRequired;
		if (useFeatureSource) {
			featureRequired = getFeature().getCardinality() == Cardinality.REQUIRED;
		} else {
			if (getFeature() instanceof AssociationWithContainment) {
				featureRequired = true;
			} else {
				featureRequired = ((AssociationWithoutContainment) getFeature()).getTargetCardinality() == Cardinality.REQUIRED;
			}
		}
		setRequired(isRequired() || featureRequired);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE, oldUseFeatureSource, useFeatureSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				if (resolve) return getOppositeService();
				return basicGetOppositeService();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__NAME:
				return getName();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL:
				if (resolve) return getDynamicLabel();
				return basicGetDynamicLabel();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE:
				return isUseFeatureSource();
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				if (resolve) return getOppositeFeature();
				return basicGetOppositeFeature();
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
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)newValue);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				setFeature((Association)newValue);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)newValue);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE:
				setUseFeatureSource((Boolean)newValue);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)newValue);
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
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)null);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION:
				setSelection((Selection)null);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				setFeature((Association)null);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)null);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE:
				setUseFeatureSource(USE_FEATURE_SOURCE_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				setOppositeFeature((ServiceAssociation)null);
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
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE:
				return oppositeService != null;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION:
				return selection != null;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE:
				return feature != null;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__DYNAMIC_LABEL:
				return dynamicLabel != null;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__USE_FEATURE_SOURCE:
				return useFeatureSource != USE_FEATURE_SOURCE_EDEFAULT;
			case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_FEATURE:
				return oppositeFeature != null;
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
		if (baseClass == ServiceAssociation.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE: return WebsitePackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE;
				case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION: return WebsitePackage.SERVICE_ASSOCIATION__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IncludedAssociation.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE: return WebsitePackage.INCLUDED_ASSOCIATION__FEATURE;
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
		if (baseClass == ServiceAssociation.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE: return WebsitePackage.SERVICE_ENTITY_ASSOCIATION__OPPOSITE_SERVICE;
				case WebsitePackage.SERVICE_ASSOCIATION__SELECTION: return WebsitePackage.SERVICE_ENTITY_ASSOCIATION__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IncludedAssociation.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INCLUDED_ASSOCIATION__FEATURE: return WebsitePackage.SERVICE_ENTITY_ASSOCIATION__FEATURE;
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
		result.append(" (useFeatureSource: ");
		result.append(useFeatureSource);
		result.append(')');
		return result.toString();
	}

} //ServiceEntityAssociationImpl
