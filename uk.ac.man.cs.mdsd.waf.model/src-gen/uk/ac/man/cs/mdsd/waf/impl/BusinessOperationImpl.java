/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.orm.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.waf.BusinessOperation;
import uk.ac.man.cs.mdsd.waf.OperationResultTypes;
import uk.ac.man.cs.mdsd.waf.Service;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.BusinessOperationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.BusinessOperationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.BusinessOperationImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.BusinessOperationImpl#getResultMimeType <em>Result Mime Type</em>}</li>
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
		return WafPackage.Literals.BUSINESS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getPartOf() {
		if (eContainerFeatureID() != WafPackage.BUSINESS_OPERATION__PART_OF) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetPartOf() {
		if (eContainerFeatureID() != WafPackage.BUSINESS_OPERATION__PART_OF) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Service newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WafPackage.BUSINESS_OPERATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(Service newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WafPackage.BUSINESS_OPERATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WafPackage.SERVICE__OPERATIONS, Service.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.BUSINESS_OPERATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Service>(Service.class, this, WafPackage.BUSINESS_OPERATION__USES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.BUSINESS_OPERATION__RESULT_TYPE, oldResultType, resultType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.BUSINESS_OPERATION__RESULT_MIME_TYPE, oldResultMimeType, resultMimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.BUSINESS_OPERATION__PART_OF:
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WafPackage.SERVICE__OPERATIONS, Service.class, msgs);
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
			case WafPackage.BUSINESS_OPERATION__USES:
				return getUses();
			case WafPackage.BUSINESS_OPERATION__RESULT_TYPE:
				return getResultType();
			case WafPackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
				setPartOf((Service)newValue);
				return;
			case WafPackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Service>)newValue);
				return;
			case WafPackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType((OperationResultTypes)newValue);
				return;
			case WafPackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
				setPartOf((Service)null);
				return;
			case WafPackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				return;
			case WafPackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType(RESULT_TYPE_EDEFAULT);
				return;
			case WafPackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
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
			case WafPackage.BUSINESS_OPERATION__PART_OF:
				return basicGetPartOf() != null;
			case WafPackage.BUSINESS_OPERATION__USES:
				return uses != null && !uses.isEmpty();
			case WafPackage.BUSINESS_OPERATION__RESULT_TYPE:
				return resultType != RESULT_TYPE_EDEFAULT;
			case WafPackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
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
