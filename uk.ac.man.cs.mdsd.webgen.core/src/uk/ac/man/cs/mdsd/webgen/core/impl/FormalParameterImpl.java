/**
 */
package uk.ac.man.cs.mdsd.webgen.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.core.DataType;
import uk.ac.man.cs.mdsd.webgen.core.FormalParameter;
import uk.ac.man.cs.mdsd.webgen.core.FormalParameterList;
import uk.ac.man.cs.mdsd.webgen.core.WebGenCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.core.impl.FormalParameterImpl#getFormalFor <em>Formal For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.core.impl.FormalParameterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.core.impl.FormalParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalParameterImpl extends NamedElementImpl implements FormalParameter {
	/**
	 * The cached value of the '{@link #getFormalFor() <em>Formal For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalFor()
	 * @generated
	 * @ordered
	 */
	protected FormalParameterList formalFor;

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
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected uk.ac.man.cs.mdsd.webgen.expression.Literal defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenCorePackage.Literals.FORMAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterList getFormalFor() {
		if (formalFor != null && formalFor.eIsProxy()) {
			InternalEObject oldFormalFor = (InternalEObject)formalFor;
			formalFor = (FormalParameterList)eResolveProxy(oldFormalFor);
			if (formalFor != oldFormalFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR, oldFormalFor, formalFor));
			}
		}
		return formalFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterList basicGetFormalFor() {
		return formalFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalFor(FormalParameterList newFormalFor) {
		FormalParameterList oldFormalFor = formalFor;
		formalFor = newFormalFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR, oldFormalFor, formalFor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uk.ac.man.cs.mdsd.webgen.expression.Literal getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(uk.ac.man.cs.mdsd.webgen.expression.Literal newDefaultValue, NotificationChain msgs) {
		uk.ac.man.cs.mdsd.webgen.expression.Literal oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(uk.ac.man.cs.mdsd.webgen.expression.Literal newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
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
			case WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR:
				if (resolve) return getFormalFor();
				return basicGetFormalFor();
			case WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
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
			case WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR:
				setFormalFor((FormalParameterList)newValue);
				return;
			case WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((uk.ac.man.cs.mdsd.webgen.expression.Literal)newValue);
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
			case WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR:
				setFormalFor((FormalParameterList)null);
				return;
			case WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((uk.ac.man.cs.mdsd.webgen.expression.Literal)null);
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
			case WebGenCorePackage.FORMAL_PARAMETER__FORMAL_FOR:
				return formalFor != null;
			case WebGenCorePackage.FORMAL_PARAMETER__DATA_TYPE:
				return dataType != null;
			case WebGenCorePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //FormalParameterImpl
