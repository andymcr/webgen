/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.webgen.website.IncludedFeature;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.ServiceViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getOppositeService <em>Opposite Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceViewAssociationImpl#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceViewAssociationImpl extends NamedElementImpl implements ServiceViewAssociation {
	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForcedValue() <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression forcedValue;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

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
	protected ServiceViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SERVICE_VIEW_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isRequired() {
//		return getCardinality() == Cardinality.REQUIRED;
// TODO
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getForcedValue() {
		return forcedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForcedValue(Expression newForcedValue, NotificationChain msgs) {
		Expression oldForcedValue = forcedValue;
		forcedValue = newForcedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE, oldForcedValue, newForcedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForcedValue(Expression newForcedValue) {
		if (newForcedValue != forcedValue) {
			NotificationChain msgs = null;
			if (forcedValue != null)
				msgs = ((InternalEObject)forcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE, null, msgs);
			if (newForcedValue != null)
				msgs = ((InternalEObject)newForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE, null, msgs);
			msgs = basicSetForcedValue(newForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE, newForcedValue, newForcedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS, oldDisplayClass, displayClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Service newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Service newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.SERVICE__FEATURES, Service.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT, oldDateFormat, dateFormat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE, oldOppositeService, oppositeService));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE, oldOppositeFeature, oppositeFeature));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((Service)otherEnd, msgs);
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				return basicSetPartOf(null, msgs);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE:
				return basicSetForcedValue(null, msgs);
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.SERVICE__FEATURES, Service.class, msgs);
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				return getPartOf();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				return getDateFormat();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				if (resolve) return getOppositeService();
				return basicGetOppositeService();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL:
				return getDisplayLabel();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED:
				return isRequired();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE:
				return getForcedValue();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER:
				return getFooter();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				setPartOf((Service)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE:
				setForcedValue((Expression)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER:
				setFooter((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				setPartOf((Service)null);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				setOppositeService((Service)null);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION:
				setSelection((Selection)null);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE:
				setForcedValue((Expression)null);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
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
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE:
				return oppositeService != null;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION:
				return selection != null;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE:
				return forcedValue != null;
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_FEATURE:
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
		if (baseClass == ServiceFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF: return WebsitePackage.SERVICE_FEATURE__PART_OF;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT: return WebsitePackage.SERVICE_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == ServiceAssociation.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE: return WebsitePackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION: return WebsitePackage.SERVICE_ASSOCIATION__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IncludedFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL: return WebsitePackage.INCLUDED_FEATURE__DISPLAY_LABEL;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED: return WebsitePackage.INCLUDED_FEATURE__REQUIRED;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE: return WebsitePackage.INCLUDED_FEATURE__FORCED_VALUE;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER: return WebsitePackage.INCLUDED_FEATURE__FOOTER;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS: return WebsitePackage.INCLUDED_FEATURE__HEADER_CLASS;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS: return WebsitePackage.INCLUDED_FEATURE__INPUT_CLASS;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS: return WebsitePackage.INCLUDED_FEATURE__DISPLAY_CLASS;
				case WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS: return WebsitePackage.INCLUDED_FEATURE__FOOTER_CLASS;
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
		if (baseClass == ServiceFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SERVICE_FEATURE__PART_OF: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__PART_OF;
				case WebsitePackage.SERVICE_FEATURE__DATE_FORMAT: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == ServiceAssociation.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SERVICE_ASSOCIATION__OPPOSITE_SERVICE: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__OPPOSITE_SERVICE;
				case WebsitePackage.SERVICE_ASSOCIATION__SELECTION: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == IncludedFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INCLUDED_FEATURE__DISPLAY_LABEL: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_LABEL;
				case WebsitePackage.INCLUDED_FEATURE__REQUIRED: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__REQUIRED;
				case WebsitePackage.INCLUDED_FEATURE__FORCED_VALUE: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__FORCED_VALUE;
				case WebsitePackage.INCLUDED_FEATURE__FOOTER: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER;
				case WebsitePackage.INCLUDED_FEATURE__HEADER_CLASS: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__HEADER_CLASS;
				case WebsitePackage.INCLUDED_FEATURE__INPUT_CLASS: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__INPUT_CLASS;
				case WebsitePackage.INCLUDED_FEATURE__DISPLAY_CLASS: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__DISPLAY_CLASS;
				case WebsitePackage.INCLUDED_FEATURE__FOOTER_CLASS: return WebsitePackage.SERVICE_VIEW_ASSOCIATION__FOOTER_CLASS;
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
		result.append(" (dateFormat: ");
		result.append(dateFormat);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", required: ");
		result.append(required);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //ServiceViewAssociationImpl
