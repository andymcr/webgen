/**
 */
package uk.ac.man.cs.mdsd.webgen.service.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.service.OperationResultTypes;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.BusinessOperationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.BusinessOperationImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.BusinessOperationImpl#getResultMimeType <em>Result Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessOperationImpl extends NamedElementImpl implements BusinessOperation {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> uses;

	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationResultTypes RESULT_TYPE_EDEFAULT = OperationResultTypes.NONE;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected OperationResultTypes resultType = RESULT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultMimeType() <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultMimeType() <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMimeType()
	 * @generated
	 * @ordered
	 */
	protected String resultMimeType = RESULT_MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.BUSINESS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.BUSINESS_OPERATION__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationResultTypes getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(OperationResultTypes newResultType) {
		OperationResultTypes oldResultType = resultType;
		resultType = newResultType == null ? RESULT_TYPE_EDEFAULT : newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.BUSINESS_OPERATION__RESULT_TYPE, oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultMimeType() {
		return resultMimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultMimeType(String newResultMimeType) {
		String oldResultMimeType = resultMimeType;
		resultMimeType = newResultMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE, oldResultMimeType, resultMimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.BUSINESS_OPERATION__USES:
				return getUses();
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				return getResultType();
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				return getResultMimeType();
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
			case ServicePackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType((OperationResultTypes)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				setResultMimeType((String)newValue);
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
			case ServicePackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType(RESULT_TYPE_EDEFAULT);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				setResultMimeType(RESULT_MIME_TYPE_EDEFAULT);
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
			case ServicePackage.BUSINESS_OPERATION__USES:
				return uses != null && !uses.isEmpty();
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				return resultType != RESULT_TYPE_EDEFAULT;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				return RESULT_MIME_TYPE_EDEFAULT == null ? resultMimeType != null : !RESULT_MIME_TYPE_EDEFAULT.equals(resultMimeType);
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
		result.append(" (resultType: ");
		result.append(resultType);
		result.append(", resultMimeType: ");
		result.append(resultMimeType);
		result.append(')');
		return result.toString();
	}

} //BusinessOperationImpl
