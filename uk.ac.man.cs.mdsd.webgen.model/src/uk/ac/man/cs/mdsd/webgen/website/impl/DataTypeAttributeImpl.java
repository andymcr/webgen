/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.website.DataType;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeAttribute;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeAttributeImpl#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeAttributeImpl extends AttributeImpl implements DataTypeAttribute {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

	/**
	 * The default value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentType()
	 * @generated
	 * @ordered
	 */
	protected String persistentType = PERSISTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmType()
	 * @generated
	 * @ordered
	 */
	protected static final String ORM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmType()
	 * @generated
	 * @ordered
	 */
	protected String ormType = ORM_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.DATA_TYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistentType() {
		return persistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentType(String newPersistentType) {
		String oldPersistentType = persistentType;
		persistentType = newPersistentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE, oldPersistentType, persistentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrmType() {
		return ormType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmType(String newOrmType) {
		String oldOrmType = ormType;
		ormType = newOrmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__ORM_TYPE, oldOrmType, ormType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS, oldObfuscateFormFields, obfuscateFormFields));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE, oldCaseInsensitive, caseInsensitive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_ATTRIBUTE__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE:
				return getPersistentType();
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ORM_TYPE:
				return getOrmType();
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
				return isObfuscateFormFields();
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE:
				return isCaseInsensitive();
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ENCRYPT:
				return isEncrypt();
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
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE:
				setPersistentType((String)newValue);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ORM_TYPE:
				setOrmType((String)newValue);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields((Boolean)newValue);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE:
				setCaseInsensitive((Boolean)newValue);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ENCRYPT:
				setEncrypt((Boolean)newValue);
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
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE:
				setPersistentType(PERSISTENT_TYPE_EDEFAULT);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ORM_TYPE:
				setOrmType(ORM_TYPE_EDEFAULT);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields(OBFUSCATE_FORM_FIELDS_EDEFAULT);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE:
				setCaseInsensitive(CASE_INSENSITIVE_EDEFAULT);
				return;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ENCRYPT:
				setEncrypt(ENCRYPT_EDEFAULT);
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
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__DATA_TYPE:
				return dataType != null;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE:
				return PERSISTENT_TYPE_EDEFAULT == null ? persistentType != null : !PERSISTENT_TYPE_EDEFAULT.equals(persistentType);
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ORM_TYPE:
				return ORM_TYPE_EDEFAULT == null ? ormType != null : !ORM_TYPE_EDEFAULT.equals(ormType);
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
				return obfuscateFormFields != OBFUSCATE_FORM_FIELDS_EDEFAULT;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE:
				return caseInsensitive != CASE_INSENSITIVE_EDEFAULT;
			case WebsitePackage.DATA_TYPE_ATTRIBUTE__ENCRYPT:
				return encrypt != ENCRYPT_EDEFAULT;
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
		result.append(" (persistentType: ");
		result.append(persistentType);
		result.append(", ormType: ");
		result.append(ormType);
		result.append(", obfuscateFormFields: ");
		result.append(obfuscateFormFields);
		result.append(", caseInsensitive: ");
		result.append(caseInsensitive);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(')');
		return result.toString();
	}

} //DataTypeAttributeImpl
