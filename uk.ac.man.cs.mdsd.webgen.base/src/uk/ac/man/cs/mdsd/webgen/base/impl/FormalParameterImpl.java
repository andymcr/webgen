/**
 */
package uk.ac.man.cs.mdsd.webgen.base.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.base.DataType;
import uk.ac.man.cs.mdsd.webgen.base.FormalParameter;
import uk.ac.man.cs.mdsd.webgen.base.FormalParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl#getFormalFor <em>Formal For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.FormalParameterImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalParameterImpl extends NamedElementImpl implements FormalParameter {
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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
		return BasePackage.Literals.FORMAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameterList getFormalFor() {
		if (eContainerFeatureID() != BasePackage.FORMAL_PARAMETER__FORMAL_FOR) return null;
		return (FormalParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalFor(FormalParameterList newFormalFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormalFor, BasePackage.FORMAL_PARAMETER__FORMAL_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalFor(FormalParameterList newFormalFor) {
		if (newFormalFor != eInternalContainer() || (eContainerFeatureID() != BasePackage.FORMAL_PARAMETER__FORMAL_FOR && newFormalFor != null)) {
			if (EcoreUtil.isAncestor(this, newFormalFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormalFor != null)
				msgs = ((InternalEObject)newFormalFor).eInverseAdd(this, BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS, FormalParameterList.class, msgs);
			msgs = basicSetFormalFor(newFormalFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.FORMAL_PARAMETER__FORMAL_FOR, newFormalFor, newFormalFor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.FORMAL_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.FORMAL_PARAMETER__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.FORMAL_PARAMETER__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.FORMAL_PARAMETER__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.FORMAL_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormalFor((FormalParameterList)otherEnd, msgs);
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				return basicSetFormalFor(null, msgs);
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				return eInternalContainer().eInverseRemove(this, BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS, FormalParameterList.class, msgs);
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				return getFormalFor();
			case BasePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case BasePackage.FORMAL_PARAMETER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case BasePackage.FORMAL_PARAMETER__PLACEHOLDER:
				return getPlaceholder();
			case BasePackage.FORMAL_PARAMETER__DESCRIPTION:
				return getDescription();
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				setFormalFor((FormalParameterList)newValue);
				return;
			case BasePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case BasePackage.FORMAL_PARAMETER__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case BasePackage.FORMAL_PARAMETER__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case BasePackage.FORMAL_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				setFormalFor((FormalParameterList)null);
				return;
			case BasePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case BasePackage.FORMAL_PARAMETER__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case BasePackage.FORMAL_PARAMETER__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case BasePackage.FORMAL_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case BasePackage.FORMAL_PARAMETER__FORMAL_FOR:
				return getFormalFor() != null;
			case BasePackage.FORMAL_PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case BasePackage.FORMAL_PARAMETER__DATA_TYPE:
				return dataType != null;
			case BasePackage.FORMAL_PARAMETER__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case BasePackage.FORMAL_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FormalParameterImpl
