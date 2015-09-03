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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.InlineAction;
import uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.website.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.UnitTitle;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#isAutofocus <em>Autofocus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitAssociationImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitAssociationImpl extends IncludedAssociationImpl implements UnitAssociation {
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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyDisplayWhenNotEmpty() <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyDisplayWhenNotEmpty = ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionDisplayOption() <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionDisplayOptions COLLECTION_DISPLAY_OPTION_EDEFAULT = CollectionDisplayOptions.LINE_DIRECTION;

	/**
	 * The cached value of the '{@link #getCollectionDisplayOption() <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected CollectionDisplayOptions collectionDisplayOption = COLLECTION_DISPLAY_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumDisplaySize() <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplaySize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_DISPLAY_SIZE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaximumDisplaySize() <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplaySize()
	 * @generated
	 * @ordered
	 */
	protected int maximumDisplaySize = MAXIMUM_DISPLAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOFOCUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected boolean autofocus = AUTOFOCUS_EDEFAULT;

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
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitTitle> filters;

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
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebsitePackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebsitePackage.UNIT_ASSOCIATION__ACTIONS, WebsitePackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyDisplayWhenNotEmpty() {
		return onlyDisplayWhenNotEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyDisplayWhenNotEmpty(boolean newOnlyDisplayWhenNotEmpty) {
		boolean oldOnlyDisplayWhenNotEmpty = onlyDisplayWhenNotEmpty;
		onlyDisplayWhenNotEmpty = newOnlyDisplayWhenNotEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY, oldOnlyDisplayWhenNotEmpty, onlyDisplayWhenNotEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionDisplayOptions getCollectionDisplayOption() {
		return collectionDisplayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionDisplayOption(CollectionDisplayOptions newCollectionDisplayOption) {
		CollectionDisplayOptions oldCollectionDisplayOption = collectionDisplayOption;
		collectionDisplayOption = newCollectionDisplayOption == null ? COLLECTION_DISPLAY_OPTION_EDEFAULT : newCollectionDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION, oldCollectionDisplayOption, collectionDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumDisplaySize() {
		return maximumDisplaySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDisplaySize(int newMaximumDisplaySize) {
		int oldMaximumDisplaySize = maximumDisplaySize;
		maximumDisplaySize = newMaximumDisplaySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE, oldMaximumDisplaySize, maximumDisplaySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutofocus() {
		return autofocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutofocus(boolean newAutofocus) {
		boolean oldAutofocus = autofocus;
		autofocus = newAutofocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS, oldAutofocus, autofocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void basicSetAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		// eContainer may be undefined when loading resource
		if ((newAssociation != null) && (eContainer() != null)) {
			if (newAssociation instanceof ViewAssociation) {
				setUseAssociationSource(true);
			} else {
				final EntityAssociation entityAssociation = (EntityAssociation) newAssociation;
				final UnitSource source = getDisplayedOn().getSource();
				if (source instanceof Service) {
					final List<EntityOrView> serviceSource = new LinkedList<EntityOrView>();
					serviceSource.addAll(((Service) source).getEncapsulates());
					if (serviceSource.contains(entityAssociation.getParentEntity())) {
						if (!serviceSource.contains(entityAssociation.getTargetEntity())) {
							setUseAssociationSource(true);
						}
					} else {
						if (serviceSource.contains(entityAssociation.getTargetEntity())) {
							setUseAssociationSource(false);
						}
					}
					
				} else if (source instanceof View) {
					setUseAssociationSource(true);
				} else {
					setUseAssociationSource(
						entityAssociation.getParentEntity().equals((Entity) source));
				}
				
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ASSOCIATION__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAssociation(Association newFeature) {
		basicSetAssociation(newFeature);
		// eContainer may be undefined when loading resource
		if ((newFeature != null) && (eContainer() != null)) {
			final UnitSource source = ((DynamicUnit) eContainer()).getSource();
			if (source instanceof Service) {
				for (ServiceFeature feature : ((Service) source).getFeatures()) {
					if (feature instanceof ServiceAssociation) {
						final ServiceAssociation association = (ServiceAssociation) feature;
						if (newFeature.equals(association.getAssociation())) {
							basicSetServiceFeature(association);
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
		if (serviceFeature != null) {
			basicSetAssociation(serviceFeature.getAssociation());
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
	public List<UnitTitle> getFilters() {
		if (filters == null) {
			filters = new EObjectResolvingEList<UnitTitle>(UnitTitle.class, this, WebsitePackage.UNIT_ASSOCIATION__FILTERS);
		}
		return filters;
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((DynamicUnit)otherEnd, msgs);
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				return getDisplayedOn();
			case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT:
				return getDateFormat();
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				return getActions();
			case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return isOnlyDisplayWhenNotEmpty();
			case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION:
				return getCollectionDisplayOption();
			case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE:
				return getMaximumDisplaySize();
			case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS:
				return isAutofocus();
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
			case WebsitePackage.UNIT_ASSOCIATION__FILTERS:
				return getFilters();
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty((Boolean)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize((Integer)newValue);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS:
				setAutofocus((Boolean)newValue);
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
			case WebsitePackage.UNIT_ASSOCIATION__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends UnitTitle>)newValue);
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				getActions().clear();
				return;
			case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty(ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption(COLLECTION_DISPLAY_OPTION_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize(MAXIMUM_DISPLAY_SIZE_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS:
				setAutofocus(AUTOFOCUS_EDEFAULT);
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
			case WebsitePackage.UNIT_ASSOCIATION__FILTERS:
				getFilters().clear();
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
			case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebsitePackage.UNIT_ASSOCIATION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return onlyDisplayWhenNotEmpty != ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;
			case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION:
				return collectionDisplayOption != COLLECTION_DISPLAY_OPTION_EDEFAULT;
			case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE:
				return maximumDisplaySize != MAXIMUM_DISPLAY_SIZE_EDEFAULT;
			case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS:
				return autofocus != AUTOFOCUS_EDEFAULT;
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
			case WebsitePackage.UNIT_ASSOCIATION__FILTERS:
				return filters != null && !filters.isEmpty();
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
		if (baseClass == UnitField.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON: return WebsitePackage.UNIT_FIELD__DISPLAYED_ON;
				case WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT: return WebsitePackage.UNIT_FIELD__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ASSOCIATION__ACTIONS: return WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS;
				default: return -1;
			}
		}
		if (baseClass == UnitFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY: return WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY;
				case WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION: return WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION;
				case WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE: return WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE;
				case WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS: return WebsitePackage.UNIT_FEATURE__AUTOFOCUS;
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
		if (baseClass == UnitField.class) {
			switch (baseFeatureID) {
				case WebsitePackage.UNIT_FIELD__DISPLAYED_ON: return WebsitePackage.UNIT_ASSOCIATION__DISPLAYED_ON;
				case WebsitePackage.UNIT_FIELD__DATE_FORMAT: return WebsitePackage.UNIT_ASSOCIATION__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebsitePackage.UNIT_ASSOCIATION__ACTIONS;
				default: return -1;
			}
		}
		if (baseClass == UnitFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY: return WebsitePackage.UNIT_ASSOCIATION__ONLY_DISPLAY_WHEN_NOT_EMPTY;
				case WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION: return WebsitePackage.UNIT_ASSOCIATION__COLLECTION_DISPLAY_OPTION;
				case WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE: return WebsitePackage.UNIT_ASSOCIATION__MAXIMUM_DISPLAY_SIZE;
				case WebsitePackage.UNIT_FEATURE__AUTOFOCUS: return WebsitePackage.UNIT_ASSOCIATION__AUTOFOCUS;
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
		result.append(", onlyDisplayWhenNotEmpty: ");
		result.append(onlyDisplayWhenNotEmpty);
		result.append(", collectionDisplayOption: ");
		result.append(collectionDisplayOption);
		result.append(", maximumDisplaySize: ");
		result.append(maximumDisplaySize);
		result.append(", autofocus: ");
		result.append(autofocus);
		result.append(')');
		return result.toString();
	}

} //UnitAssociationImpl
