/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.expression.Predicate;

import uk.ac.man.cs.mdsd.service.BusinessOperation;

import uk.ac.man.cs.mdsd.waf.FeatureSupportAction;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Support Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FeatureSupportActionImpl#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureSupportActionImpl extends InlineActionImpl implements FeatureSupportAction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected BusinessOperation operation;

	/**
	 * The default value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected String confirmMessage = CONFIRM_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected String requiresRole = REQUIRES_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnableWhen() <em>Enable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate enableWhen;

	/**
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSupportActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.FEATURE_SUPPORT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (BusinessOperation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.FEATURE_SUPPORT_ACTION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(BusinessOperation newOperation) {
		BusinessOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfirmMessage() {
		return confirmMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmMessage(String newConfirmMessage) {
		String oldConfirmMessage = confirmMessage;
		confirmMessage = newConfirmMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE, oldConfirmMessage, confirmMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiresRole() {
		return requiresRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRole(String newRequiresRole) {
		String oldRequiresRole = requiresRole;
		requiresRole = newRequiresRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__REQUIRES_ROLE, oldRequiresRole, requiresRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getEnableWhen() {
		return enableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableWhen(Predicate newEnableWhen, NotificationChain msgs) {
		Predicate oldEnableWhen = enableWhen;
		enableWhen = newEnableWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN, oldEnableWhen, newEnableWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableWhen(Predicate newEnableWhen) {
		if (newEnableWhen != enableWhen) {
			NotificationChain msgs = null;
			if (enableWhen != null)
				msgs = ((InternalEObject)enableWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN, null, msgs);
			if (newEnableWhen != null)
				msgs = ((InternalEObject)newEnableWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN, null, msgs);
			msgs = basicSetEnableWhen(newEnableWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN, newEnableWhen, newEnableWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(String newFileExtension) {
		String oldFileExtension = fileExtension;
		fileExtension = newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FEATURE_SUPPORT_ACTION__FILE_EXTENSION, oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN:
				return basicSetEnableWhen(null, msgs);
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
			case WafPackage.FEATURE_SUPPORT_ACTION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case WafPackage.FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE:
				return getConfirmMessage();
			case WafPackage.FEATURE_SUPPORT_ACTION__REQUIRES_ROLE:
				return getRequiresRole();
			case WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN:
				return getEnableWhen();
			case WafPackage.FEATURE_SUPPORT_ACTION__FILE_EXTENSION:
				return getFileExtension();
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
			case WafPackage.FEATURE_SUPPORT_ACTION__OPERATION:
				setOperation((BusinessOperation)newValue);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE:
				setConfirmMessage((String)newValue);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__REQUIRES_ROLE:
				setRequiresRole((String)newValue);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN:
				setEnableWhen((Predicate)newValue);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__FILE_EXTENSION:
				setFileExtension((String)newValue);
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
			case WafPackage.FEATURE_SUPPORT_ACTION__OPERATION:
				setOperation((BusinessOperation)null);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE:
				setConfirmMessage(CONFIRM_MESSAGE_EDEFAULT);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__REQUIRES_ROLE:
				setRequiresRole(REQUIRES_ROLE_EDEFAULT);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN:
				setEnableWhen((Predicate)null);
				return;
			case WafPackage.FEATURE_SUPPORT_ACTION__FILE_EXTENSION:
				setFileExtension(FILE_EXTENSION_EDEFAULT);
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
			case WafPackage.FEATURE_SUPPORT_ACTION__OPERATION:
				return operation != null;
			case WafPackage.FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE:
				return CONFIRM_MESSAGE_EDEFAULT == null ? confirmMessage != null : !CONFIRM_MESSAGE_EDEFAULT.equals(confirmMessage);
			case WafPackage.FEATURE_SUPPORT_ACTION__REQUIRES_ROLE:
				return REQUIRES_ROLE_EDEFAULT == null ? requiresRole != null : !REQUIRES_ROLE_EDEFAULT.equals(requiresRole);
			case WafPackage.FEATURE_SUPPORT_ACTION__ENABLE_WHEN:
				return enableWhen != null;
			case WafPackage.FEATURE_SUPPORT_ACTION__FILE_EXTENSION:
				return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null : !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
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
		result.append(" (confirmMessage: ");
		result.append(confirmMessage);
		result.append(", requiresRole: ");
		result.append(requiresRole);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(')');
		return result.toString();
	}

} //FeatureSupportActionImpl
