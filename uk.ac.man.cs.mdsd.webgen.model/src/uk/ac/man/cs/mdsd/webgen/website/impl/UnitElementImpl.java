/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeAttribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.IncludedElement;
import uk.ac.man.cs.mdsd.webgen.website.IncludedFeature;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitElement;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.UnitElementImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitElementImpl extends UnitFeatureImpl implements UnitElement {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Attribute feature;

	/**
	 * The default value of the '{@link #isObfuscateFormFields() <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateFormFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBFUSCATE_FORM_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObfuscateFormFields() <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObfuscateFormFields()
	 * @generated
	 * @ordered
	 */
	protected boolean obfuscateFormFields = OBFUSCATE_FORM_FIELDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValue;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.UNIT_ELEMENT__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getServiceFeature() <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceEntityElement serviceFeature;

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
	protected UnitElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.UNIT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Attribute)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ELEMENT__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void basicSetFeature(Attribute newFeature) {
		Attribute oldFeature = feature;
		feature = newFeature;
		setRequired(isRequired()
			|| (newFeature != null) && newFeature.getCardinality() == Cardinality.REQUIRED);
		setObfuscateFormFields(isObfuscateFormFields()
			|| (newFeature != null)
				&& (newFeature instanceof DataTypeAttribute)
				&& ((DataTypeAttribute) newFeature).isObfuscateFormFields());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeature(Attribute newFeature) {
		basicSetFeature(newFeature);
		// eContainer may be undefined when loading resource
		if ((newFeature != null) && (eContainer() != null)) {
			final UnitSource source = ((DynamicUnit) eContainer()).getSource();
			if (source instanceof Service) {
				for (ServiceFeature includedFeature : ((Service) source).getFeatures()) {
					if (includedFeature instanceof ServiceEntityElement) {
						final ServiceEntityElement includedElement
							= (ServiceEntityElement) includedFeature;
						if (newFeature.equals(includedElement.getFeature())) {
							basicSetServiceFeature(includedElement);
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
	public boolean isObfuscateFormFields() {
		return obfuscateFormFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObfuscateFormFields(boolean newObfuscateFormFields) {
		boolean oldObfuscateFormFields = obfuscateFormFields;
		obfuscateFormFields = newObfuscateFormFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS, oldObfuscateFormFields, obfuscateFormFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(Expression newDefaultValue, NotificationChain msgs) {
		Expression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Expression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
	public ServiceEntityElement getServiceFeature() {
		if (serviceFeature != null && serviceFeature.eIsProxy()) {
			InternalEObject oldServiceFeature = (InternalEObject)serviceFeature;
			serviceFeature = (ServiceEntityElement)eResolveProxy(oldServiceFeature);
			if (serviceFeature != oldServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
			}
		}
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityElement basicGetServiceFeature() {
		return serviceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void basicSetServiceFeature(ServiceEntityElement newServiceFeature) {
		IncludedFeature oldServiceFeature = serviceFeature;
		serviceFeature = newServiceFeature;
		setRequired(isRequired()
			|| serviceFeature != null && serviceFeature.isRequired());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE, oldServiceFeature, serviceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setServiceFeature(ServiceEntityElement newServiceFeature) {
		basicSetServiceFeature(newServiceFeature);
		if (serviceFeature != null) {
			basicSetFeature(serviceFeature.getFeature());
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.UNIT_ELEMENT__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case WebsitePackage.UNIT_ELEMENT__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS:
				return isObfuscateFormFields();
			case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE:
				return getDefaultValue();
			case WebsitePackage.UNIT_ELEMENT__NAME:
				return getName();
			case WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE:
				if (resolve) return getServiceFeature();
				return basicGetServiceFeature();
			case WebsitePackage.UNIT_ELEMENT__PLACEHOLDER:
				return getPlaceholder();
			case WebsitePackage.UNIT_ELEMENT__VALIDATION_PATTERN:
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
			case WebsitePackage.UNIT_ELEMENT__FEATURE:
				setFeature((Attribute)newValue);
				return;
			case WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields((Boolean)newValue);
				return;
			case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE:
				setDefaultValue((Expression)newValue);
				return;
			case WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE:
				setServiceFeature((ServiceEntityElement)newValue);
				return;
			case WebsitePackage.UNIT_ELEMENT__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case WebsitePackage.UNIT_ELEMENT__VALIDATION_PATTERN:
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
			case WebsitePackage.UNIT_ELEMENT__FEATURE:
				setFeature((Attribute)null);
				return;
			case WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields(OBFUSCATE_FORM_FIELDS_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE:
				setDefaultValue((Expression)null);
				return;
			case WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE:
				setServiceFeature((ServiceEntityElement)null);
				return;
			case WebsitePackage.UNIT_ELEMENT__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case WebsitePackage.UNIT_ELEMENT__VALIDATION_PATTERN:
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
			case WebsitePackage.UNIT_ELEMENT__FEATURE:
				return feature != null;
			case WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS:
				return obfuscateFormFields != OBFUSCATE_FORM_FIELDS_EDEFAULT;
			case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE:
				return defaultValue != null;
			case WebsitePackage.UNIT_ELEMENT__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.UNIT_ELEMENT__SERVICE_FEATURE:
				return serviceFeature != null;
			case WebsitePackage.UNIT_ELEMENT__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case WebsitePackage.UNIT_ELEMENT__VALIDATION_PATTERN:
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
		if (baseClass == IncludedElement.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.UNIT_ELEMENT__FEATURE: return WebsitePackage.INCLUDED_ELEMENT__FEATURE;
				case WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS: return WebsitePackage.INCLUDED_ELEMENT__OBFUSCATE_FORM_FIELDS;
				case WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE: return WebsitePackage.INCLUDED_ELEMENT__DEFAULT_VALUE;
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
		if (baseClass == IncludedElement.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INCLUDED_ELEMENT__FEATURE: return WebsitePackage.UNIT_ELEMENT__FEATURE;
				case WebsitePackage.INCLUDED_ELEMENT__OBFUSCATE_FORM_FIELDS: return WebsitePackage.UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS;
				case WebsitePackage.INCLUDED_ELEMENT__DEFAULT_VALUE: return WebsitePackage.UNIT_ELEMENT__DEFAULT_VALUE;
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
		result.append(" (obfuscateFormFields: ");
		result.append(obfuscateFormFields);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(')');
		return result.toString();
	}

} //UnitElementImpl
