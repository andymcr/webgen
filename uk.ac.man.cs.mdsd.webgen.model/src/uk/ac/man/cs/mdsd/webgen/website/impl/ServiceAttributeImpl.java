/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeAttribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.ViewAttribute;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ServiceAttributeImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceAttributeImpl extends IncludedElementImpl implements ServiceAttribute {
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
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebsitePackage.Literals.SERVICE_ATTRIBUTE__NAME).getSettingDelegate();

	/**
	 * The default value of the '{@link #isCaseInsensitive() <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseInsensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_INSENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaseInsensitive() <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseInsensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean caseInsensitive = CASE_INSENSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypt = ENCRYPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected String interfaceType = INTERFACE_TYPE_EDEFAULT;

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
	protected ServiceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SERVICE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFeature(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		final Cardinality cardinality = newAttribute instanceof ViewAttribute
			? ((ViewAttribute) newAttribute).getCardinality()
			: ((EntityAttribute) newAttribute).getCardinality();
		setRequired(isRequired()
			|| (newAttribute != null) && (cardinality == Cardinality.REQUIRED));
		setObfuscateFormFields(isObfuscateFormFields()
			|| (newAttribute != null)
				&& (newAttribute instanceof DataTypeAttribute)
				&& ((DataTypeAttribute) newAttribute).isObfuscateFormFields());
		setCaseInsensitive(isCaseInsensitive()
			|| (newAttribute != null)
				&& (newAttribute instanceof DataTypeAttribute)
				&& ((DataTypeAttribute) newAttribute).isCaseInsensitive());
		setEncrypt(isEncrypt()
			|| (newAttribute != null)
				&& (newAttribute instanceof DataTypeAttribute)
				&& ((DataTypeAttribute) newAttribute).isEncrypt());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INCLUDED_ELEMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.SERVICE_ATTRIBUTE__PART_OF) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Service newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.SERVICE_ATTRIBUTE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Service newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.SERVICE_ATTRIBUTE__PART_OF && newPartOf != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__PART_OF, newPartOf, newPartOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT, oldDateFormat, dateFormat));
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
	public boolean isCaseInsensitive() {
		return caseInsensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseInsensitive(boolean newCaseInsensitive) {
		boolean oldCaseInsensitive = caseInsensitive;
		caseInsensitive = newCaseInsensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__CASE_INSENSITIVE, oldCaseInsensitive, caseInsensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncrypt() {
		return encrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncrypt(boolean newEncrypt) {
		boolean oldEncrypt = encrypt;
		encrypt = newEncrypt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceType(String newInterfaceType) {
		String oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.SERVICE_ATTRIBUTE__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
				return getPartOf();
			case WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT:
				return getDateFormat();
			case WebsitePackage.SERVICE_ATTRIBUTE__NAME:
				return getName();
			case WebsitePackage.SERVICE_ATTRIBUTE__CASE_INSENSITIVE:
				return isCaseInsensitive();
			case WebsitePackage.SERVICE_ATTRIBUTE__ENCRYPT:
				return isEncrypt();
			case WebsitePackage.SERVICE_ATTRIBUTE__INTERFACE_TYPE:
				return getInterfaceType();
			case WebsitePackage.SERVICE_ATTRIBUTE__PLACEHOLDER:
				return getPlaceholder();
			case WebsitePackage.SERVICE_ATTRIBUTE__VALIDATION_PATTERN:
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
				setPartOf((Service)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__CASE_INSENSITIVE:
				setCaseInsensitive((Boolean)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__ENCRYPT:
				setEncrypt((Boolean)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__INTERFACE_TYPE:
				setInterfaceType((String)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__VALIDATION_PATTERN:
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
				setPartOf((Service)null);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__CASE_INSENSITIVE:
				setCaseInsensitive(CASE_INSENSITIVE_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__ENCRYPT:
				setEncrypt(ENCRYPT_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case WebsitePackage.SERVICE_ATTRIBUTE__VALIDATION_PATTERN:
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
			case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebsitePackage.SERVICE_ATTRIBUTE__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebsitePackage.SERVICE_ATTRIBUTE__CASE_INSENSITIVE:
				return caseInsensitive != CASE_INSENSITIVE_EDEFAULT;
			case WebsitePackage.SERVICE_ATTRIBUTE__ENCRYPT:
				return encrypt != ENCRYPT_EDEFAULT;
			case WebsitePackage.SERVICE_ATTRIBUTE__INTERFACE_TYPE:
				return INTERFACE_TYPE_EDEFAULT == null ? interfaceType != null : !INTERFACE_TYPE_EDEFAULT.equals(interfaceType);
			case WebsitePackage.SERVICE_ATTRIBUTE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case WebsitePackage.SERVICE_ATTRIBUTE__VALIDATION_PATTERN:
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
		if (baseClass == ServiceFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.SERVICE_ATTRIBUTE__PART_OF: return WebsitePackage.SERVICE_FEATURE__PART_OF;
				case WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT: return WebsitePackage.SERVICE_FEATURE__DATE_FORMAT;
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
				case WebsitePackage.SERVICE_FEATURE__PART_OF: return WebsitePackage.SERVICE_ATTRIBUTE__PART_OF;
				case WebsitePackage.SERVICE_FEATURE__DATE_FORMAT: return WebsitePackage.SERVICE_ATTRIBUTE__DATE_FORMAT;
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
		result.append(", caseInsensitive: ");
		result.append(caseInsensitive);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(", interfaceType: ");
		result.append(interfaceType);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(')');
		return result.toString();
	}

} //ServiceAttributeImpl
