/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.DataType;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeField;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeFieldImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeFieldImpl#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.DataTypeFieldImpl#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeFieldImpl extends InterfaceFieldImpl implements DataTypeField {
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
	protected DataTypeFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.DATA_TYPE_FIELD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS, oldObfuscateFormFields, obfuscateFormFields));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.DATA_TYPE_FIELD__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case WebsitePackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				return isObfuscateFormFields();
			case WebsitePackage.DATA_TYPE_FIELD__ENCRYPT:
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
			case WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case WebsitePackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields((Boolean)newValue);
				return;
			case WebsitePackage.DATA_TYPE_FIELD__ENCRYPT:
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
			case WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case WebsitePackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				setObfuscateFormFields(OBFUSCATE_FORM_FIELDS_EDEFAULT);
				return;
			case WebsitePackage.DATA_TYPE_FIELD__ENCRYPT:
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
			case WebsitePackage.DATA_TYPE_FIELD__DATA_TYPE:
				return dataType != null;
			case WebsitePackage.DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS:
				return obfuscateFormFields != OBFUSCATE_FORM_FIELDS_EDEFAULT;
			case WebsitePackage.DATA_TYPE_FIELD__ENCRYPT:
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
		result.append(" (obfuscateFormFields: ");
		result.append(obfuscateFormFields);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(')');
		return result.toString();
	}

} //DataTypeFieldImpl
