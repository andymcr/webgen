/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.InlineAction;
import uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.website.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitFeatureImpl#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitFeatureImpl extends IncludedFeatureImpl implements UnitFeature {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.UNIT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebsitePackage.UNIT_FEATURE__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebsitePackage.UNIT_FEATURE__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.UNIT_FEATURE__DISPLAYED_ON && newDisplayedOn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebsitePackage.UNIT_FEATURE__ACTIONS, WebsitePackage.INLINE_ACTION__USED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY, oldOnlyDisplayWhenNotEmpty, onlyDisplayWhenNotEmpty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION, oldCollectionDisplayOption, collectionDisplayOption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE, oldMaximumDisplaySize, maximumDisplaySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_FEATURE__AUTOFOCUS, oldAutofocus, autofocus));
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((DynamicUnit)otherEnd, msgs);
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				return getDisplayedOn();
			case WebsitePackage.UNIT_FEATURE__DATE_FORMAT:
				return getDateFormat();
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				return getActions();
			case WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return isOnlyDisplayWhenNotEmpty();
			case WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION:
				return getCollectionDisplayOption();
			case WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				return getMaximumDisplaySize();
			case WebsitePackage.UNIT_FEATURE__AUTOFOCUS:
				return isAutofocus();
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty((Boolean)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize((Integer)newValue);
				return;
			case WebsitePackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus((Boolean)newValue);
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WebsitePackage.UNIT_FEATURE__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				return;
			case WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				setOnlyDisplayWhenNotEmpty(ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT);
				return;
			case WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption(COLLECTION_DISPLAY_OPTION_EDEFAULT);
				return;
			case WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize(MAXIMUM_DISPLAY_SIZE_EDEFAULT);
				return;
			case WebsitePackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus(AUTOFOCUS_EDEFAULT);
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
			case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebsitePackage.UNIT_FEATURE__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebsitePackage.UNIT_FEATURE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebsitePackage.UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY:
				return onlyDisplayWhenNotEmpty != ONLY_DISPLAY_WHEN_NOT_EMPTY_EDEFAULT;
			case WebsitePackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION:
				return collectionDisplayOption != COLLECTION_DISPLAY_OPTION_EDEFAULT;
			case WebsitePackage.UNIT_FEATURE__MAXIMUM_DISPLAY_SIZE:
				return maximumDisplaySize != MAXIMUM_DISPLAY_SIZE_EDEFAULT;
			case WebsitePackage.UNIT_FEATURE__AUTOFOCUS:
				return autofocus != AUTOFOCUS_EDEFAULT;
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
				case WebsitePackage.UNIT_FEATURE__DISPLAYED_ON: return WebsitePackage.UNIT_FIELD__DISPLAYED_ON;
				case WebsitePackage.UNIT_FEATURE__DATE_FORMAT: return WebsitePackage.UNIT_FIELD__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_FEATURE__ACTIONS: return WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS;
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
				case WebsitePackage.UNIT_FIELD__DISPLAYED_ON: return WebsitePackage.UNIT_FEATURE__DISPLAYED_ON;
				case WebsitePackage.UNIT_FIELD__DATE_FORMAT: return WebsitePackage.UNIT_FEATURE__DATE_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebsitePackage.UNIT_FEATURE__ACTIONS;
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

} //UnitFeatureImpl
