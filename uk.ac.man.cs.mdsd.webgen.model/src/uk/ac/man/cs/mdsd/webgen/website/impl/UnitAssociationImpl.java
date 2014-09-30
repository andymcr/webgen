/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getDynamicLabel <em>Dynamic Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitAssociationImpl extends UnitFeatureImpl implements UnitAssociation {
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
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentUnit> units;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.UNIT_ASSOCIATION__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getServiceFeature() <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceAssociation serviceFeature;

	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected UnitChildFeature childFeature;

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
	 * The cached value of the '{@link #getDynamicLabel() <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel dynamicLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.UNIT_ASSOCIATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ASSOCIATION__FEATURE, oldFeature, feature));
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
	public void basicSetFeature(Association newFeature) {
		Association oldFeature = feature;
		feature = newFeature;
		// eContainer may be undefined when loading resource
		if ((newFeature != null) && (eContainer() != null)) {
			final List<Entity> entities = new LinkedList<Entity>();
			final UnitSource source = ((DynamicUnit) eContainer()).getSource();
			if (source instanceof Service) {
				entities.addAll(((Service) source).getEncapsulates());
			} else {
				entities.add((Entity) source);
			}
			boolean featureRequired;
			if (entities.contains(newFeature.getParentEntity())) {
				featureRequired = newFeature.getCardinality() == Cardinality.REQUIRED;
			} else {
				if (newFeature instanceof AssociationWithContainment) {
					featureRequired = true;
				} else {
					featureRequired = ((AssociationWithoutContainment) newFeature).getTargetCardinality() == Cardinality.REQUIRED;
				}
			}
			setRequired(isRequired() || featureRequired);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeature(Association newFeature) {
		basicSetFeature(newFeature);
		// eContainer may be undefined when loading resource
		if ((newFeature != null) && (eContainer() != null)) {
			final UnitSource source = ((DynamicUnit) eContainer()).getSource();
			if (source instanceof Service) {
				for (ServiceFeature includedFeature : ((Service) source).getFeatures()) {
					if (includedFeature instanceof ServiceEntityAssociation) {
						final ServiceEntityAssociation includedAssociation
							= (ServiceEntityAssociation) includedFeature;
						if (newFeature.equals(includedAssociation.getFeature())) {
							basicSetServiceFeature(includedAssociation);
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ContentUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<ContentUnit>(ContentUnit.class, this, WebsitePackage.UNIT_ASSOCIATION__UNITS, WebsitePackage.CONTENT_UNIT__DISPLAYED_ON);
		}
		return units;
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
	public ServiceAssociation getServiceFeature() {
		if (serviceFeature != null && serviceFeature.eIsProxy()) {
			InternalEObject oldServiceFeature = (InternalEObject)serviceFeature;
			serviceFeature = (ServiceAssociation)eResolveProxy(oldServiceFeature);
			if (serviceFeature != oldServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
			}
		}
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAssociation basicGetServiceFeature() {
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void basicSetServiceFeature(ServiceAssociation newServiceFeature) {
		ServiceFeature oldServiceFeature = serviceFeature;
		serviceFeature = newServiceFeature;
		setRequired(isRequired()
			|| serviceFeature != null && serviceFeature.isRequired());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setServiceFeature(ServiceAssociation newServiceFeature) {
		basicSetServiceFeature(newServiceFeature);
		if ((serviceFeature != null) && (serviceFeature instanceof ServiceEntityAssociation)) {
			basicSetFeature(((ServiceEntityAssociation) serviceFeature).getFeature());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitChildFeature getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(UnitChildFeature newChildFeature, NotificationChain msgs) {
		UnitChildFeature oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildFeature(UnitChildFeature newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ASSOCIATION__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__SELECTION, oldSelection, selection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL, oldDynamicLabel, dynamicLabel));
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
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
			case WebsitePackage.UNIT_ASSOCIATION__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				return getUnits();
			case WebsitePackage.UNIT_ASSOCIATION__NAME:
				return getName();
			case WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				if (resolve) return getServiceFeature();
				return basicGetServiceFeature();
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebsitePackage.UNIT_ASSOCIATION__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				if (resolve) return getDynamicLabel();
				return basicGetDynamicLabel();
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
			case WebsitePackage.UNIT_ASSOCIATION__FEATURE:
				setFeature((Association)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends ContentUnit>)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				setServiceFeature((ServiceAssociation)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((UnitChildFeature)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)newValue);
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
			case WebsitePackage.UNIT_ASSOCIATION__FEATURE:
				setFeature((Association)null);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				getUnits().clear();
				return;
			case WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				setServiceFeature((ServiceAssociation)null);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((UnitChildFeature)null);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__SELECTION:
				setSelection((Selection)null);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				setDynamicLabel((ModelLabel)null);
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
			case WebsitePackage.UNIT_ASSOCIATION__FEATURE:
				return feature != null;
			case WebsitePackage.UNIT_ASSOCIATION__UNITS:
				return units != null && !units.isEmpty();
			case WebsitePackage.UNIT_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.UNIT_ASSOCIATION__SERVICE_FEATURE:
				return serviceFeature != null;
			case WebsitePackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebsitePackage.UNIT_ASSOCIATION__SELECTION:
				return selection != null;
			case WebsitePackage.UNIT_ASSOCIATION__DYNAMIC_LABEL:
				return dynamicLabel != null;
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
		if (baseClass == IncludedAssociation.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ASSOCIATION__FEATURE: return WebsitePackage.INCLUDED_ASSOCIATION__FEATURE;
				default: return -1;
			}
		}
		if (baseClass == UnitContainer.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ASSOCIATION__UNITS: return WebsitePackage.UNIT_CONTAINER__UNITS;
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
		if (baseClass == IncludedAssociation.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INCLUDED_ASSOCIATION__FEATURE: return WebsitePackage.UNIT_ASSOCIATION__FEATURE;
				default: return -1;
			}
		}
		if (baseClass == UnitContainer.class) {
			switch (baseFeatureID) {
				case WebsitePackage.UNIT_CONTAINER__UNITS: return WebsitePackage.UNIT_ASSOCIATION__UNITS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UnitAssociationImpl
