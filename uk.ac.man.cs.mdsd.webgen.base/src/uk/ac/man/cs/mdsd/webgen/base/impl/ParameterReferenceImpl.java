/**
 */
package uk.ac.man.cs.mdsd.webgen.base.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.base.ParameterReference;
import uk.ac.man.cs.mdsd.webgen.base.SelectionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.base.impl.ParameterReferenceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterReferenceImpl extends MinimalEObjectImpl.Container implements ParameterReference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected SelectionParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.PARAMETER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (SelectionParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.PARAMETER_REFERENCE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(SelectionParameter newParameter) {
		SelectionParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.PARAMETER_REFERENCE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.PARAMETER_REFERENCE__NAME:
				return getName();
			case BasePackage.PARAMETER_REFERENCE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case BasePackage.PARAMETER_REFERENCE__PARAMETER:
				setParameter((SelectionParameter)newValue);
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
			case BasePackage.PARAMETER_REFERENCE__PARAMETER:
				setParameter((SelectionParameter)null);
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
			case BasePackage.PARAMETER_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BasePackage.PARAMETER_REFERENCE__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterReferenceImpl
