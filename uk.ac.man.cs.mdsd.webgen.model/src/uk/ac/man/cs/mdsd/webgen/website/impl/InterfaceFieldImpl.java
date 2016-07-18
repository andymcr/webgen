/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.InterfaceField;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getMustMatch <em>Must Match</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.InterfaceFieldImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceFieldImpl extends NamedDisplayElementImpl implements InterfaceField {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMustMatch() <em>Must Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustMatch()
	 * @generated
	 * @ordered
	 */
	protected UnitField mustMatch;

	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = "input_attribute";

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
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected String validationPattern = VALIDATION_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.INTERFACE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON && newDisplayedOn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION, oldCollectionDisplayOption, collectionDisplayOption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE, oldMaximumDisplaySize, maximumDisplaySize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField getMustMatch() {
		if (mustMatch != null && mustMatch.eIsProxy()) {
			InternalEObject oldMustMatch = (InternalEObject)mustMatch;
			mustMatch = (UnitField)eResolveProxy(oldMustMatch);
			if (mustMatch != oldMustMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.INTERFACE_FIELD__MUST_MATCH, oldMustMatch, mustMatch));
			}
		}
		return mustMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitField basicGetMustMatch() {
		return mustMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustMatch(UnitField newMustMatch) {
		UnitField oldMustMatch = mustMatch;
		mustMatch = newMustMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__MUST_MATCH, oldMustMatch, mustMatch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationPattern() {
		return validationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationPattern(String newValidationPattern) {
		String oldValidationPattern = validationPattern;
		validationPattern = newValidationPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INTERFACE_FIELD__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((DynamicUnit)otherEnd, msgs);
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				return getDisplayedOn();
			case WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				return getCollectionDisplayOption();
			case WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE:
				return getMaximumDisplaySize();
			case WebsitePackage.INTERFACE_FIELD__DATE_FORMAT:
				return getDateFormat();
			case WebsitePackage.INTERFACE_FIELD__REQUIRED:
				return isRequired();
			case WebsitePackage.INTERFACE_FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case WebsitePackage.INTERFACE_FIELD__MUST_MATCH:
				if (resolve) return getMustMatch();
				return basicGetMustMatch();
			case WebsitePackage.INTERFACE_FIELD__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.INTERFACE_FIELD__PLACEHOLDER:
				return getPlaceholder();
			case WebsitePackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				return getValidationPattern();
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize((Integer)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__MUST_MATCH:
				setMustMatch((UnitField)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case WebsitePackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				setValidationPattern((String)newValue);
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption(COLLECTION_DISPLAY_OPTION_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE:
				setMaximumDisplaySize(MAXIMUM_DISPLAY_SIZE_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__MUST_MATCH:
				setMustMatch((UnitField)null);
				return;
			case WebsitePackage.INTERFACE_FIELD__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case WebsitePackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				setValidationPattern(VALIDATION_PATTERN_EDEFAULT);
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
			case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				return collectionDisplayOption != COLLECTION_DISPLAY_OPTION_EDEFAULT;
			case WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE:
				return maximumDisplaySize != MAXIMUM_DISPLAY_SIZE_EDEFAULT;
			case WebsitePackage.INTERFACE_FIELD__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebsitePackage.INTERFACE_FIELD__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WebsitePackage.INTERFACE_FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case WebsitePackage.INTERFACE_FIELD__MUST_MATCH:
				return mustMatch != null;
			case WebsitePackage.INTERFACE_FIELD__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.INTERFACE_FIELD__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case WebsitePackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				return VALIDATION_PATTERN_EDEFAULT == null ? validationPattern != null : !VALIDATION_PATTERN_EDEFAULT.equals(validationPattern);
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
				case WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON: return WebsitePackage.UNIT_FIELD__DISPLAYED_ON;
				case WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION: return WebsitePackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION;
				case WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE: return WebsitePackage.UNIT_FIELD__MAXIMUM_DISPLAY_SIZE;
				case WebsitePackage.INTERFACE_FIELD__DATE_FORMAT: return WebsitePackage.UNIT_FIELD__DATE_FORMAT;
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
				case WebsitePackage.UNIT_FIELD__DISPLAYED_ON: return WebsitePackage.INTERFACE_FIELD__DISPLAYED_ON;
				case WebsitePackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION: return WebsitePackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;
				case WebsitePackage.UNIT_FIELD__MAXIMUM_DISPLAY_SIZE: return WebsitePackage.INTERFACE_FIELD__MAXIMUM_DISPLAY_SIZE;
				case WebsitePackage.UNIT_FIELD__DATE_FORMAT: return WebsitePackage.INTERFACE_FIELD__DATE_FORMAT;
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
		result.append(" (collectionDisplayOption: ");
		result.append(collectionDisplayOption);
		result.append(", maximumDisplaySize: ");
		result.append(maximumDisplaySize);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", required: ");
		result.append(required);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(')');
		return result.toString();
	}

} //InterfaceFieldImpl
