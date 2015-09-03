/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.website.UnitTitle;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAttributeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAttributeImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAttributeImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityAttributeImpl extends EntityFeatureImpl implements EntityAttribute {
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
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY_ATTRIBUTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE:
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
			case WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER:
				return getPlaceholder();
			case WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN:
				return getValidationPattern();
			case WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
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
			case WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN:
				setValidationPattern((String)newValue);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Expression)newValue);
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
			case WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN:
				setValidationPattern(VALIDATION_PATTERN_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Expression)null);
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
			case WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN:
				return VALIDATION_PATTERN_EDEFAULT == null ? validationPattern != null : !VALIDATION_PATTERN_EDEFAULT.equals(validationPattern);
			case WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.ENTITY_ATTRIBUTE__DEFAULT_VALUE:
				return defaultValue != null;
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
		if (baseClass == UnitTitle.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER: return WebsitePackage.ATTRIBUTE__PLACEHOLDER;
				case WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN: return WebsitePackage.ATTRIBUTE__VALIDATION_PATTERN;
				case WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS: return WebsitePackage.ATTRIBUTE__INPUT_CLASS;
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
		if (baseClass == UnitTitle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Attribute.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ATTRIBUTE__PLACEHOLDER: return WebsitePackage.ENTITY_ATTRIBUTE__PLACEHOLDER;
				case WebsitePackage.ATTRIBUTE__VALIDATION_PATTERN: return WebsitePackage.ENTITY_ATTRIBUTE__VALIDATION_PATTERN;
				case WebsitePackage.ATTRIBUTE__INPUT_CLASS: return WebsitePackage.ENTITY_ATTRIBUTE__INPUT_CLASS;
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
		result.append(" (placeholder: ");
		result.append(placeholder);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(')');
		return result.toString();
	}

} //EntityAttributeImpl
