/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditUnitImpl.java,v 1.8 2013/12/19 13:02:16 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.website.EditUnit;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EditUnitImpl#isCustomiseValues <em>Customise Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EditUnitImpl extends DynamicUnitImpl implements EditUnit {
	/**
	 * The cached value of the '{@link #getConfirmDestination() <em>Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmDestination()
	 * @generated
	 * @ordered
	 */
	protected Page confirmDestination;

	/**
	 * The default value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String confirmLabel = CONFIRM_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCancelDestination() <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected Page cancelDestination;

	/**
	 * The default value of the '{@link #getCancelLabel() <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelLabel() <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected String cancelLabel = CANCEL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "input_form,framed";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomiseValues() <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMISE_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomiseValues() <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseValues()
	 * @generated
	 * @ordered
	 */
	protected boolean customiseValues = CUSTOMISE_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.EDIT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getConfirmDestination() {
		if (confirmDestination != null && confirmDestination.eIsProxy()) {
			InternalEObject oldConfirmDestination = (InternalEObject)confirmDestination;
			confirmDestination = (Page)eResolveProxy(oldConfirmDestination);
			if (confirmDestination != oldConfirmDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
			}
		}
		return confirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetConfirmDestination() {
		return confirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmDestination(Page newConfirmDestination) {
		Page oldConfirmDestination = confirmDestination;
		confirmDestination = newConfirmDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfirmLabel() {
		return confirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmLabel(String newConfirmLabel) {
		String oldConfirmLabel = confirmLabel;
		confirmLabel = newConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CONFIRM_LABEL, oldConfirmLabel, confirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getCancelDestination() {
		if (cancelDestination != null && cancelDestination.eIsProxy()) {
			InternalEObject oldCancelDestination = (InternalEObject)cancelDestination;
			cancelDestination = (Page)eResolveProxy(oldCancelDestination);
			if (cancelDestination != oldCancelDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
			}
		}
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetCancelDestination() {
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelDestination(Page newCancelDestination) {
		Page oldCancelDestination = cancelDestination;
		cancelDestination = newCancelDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCancelLabel() {
		return cancelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelLabel(String newCancelLabel) {
		String oldCancelLabel = cancelLabel;
		cancelLabel = newCancelLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CANCEL_LABEL, oldCancelLabel, cancelLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomiseValues() {
		return customiseValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomiseValues(boolean newCustomiseValues) {
		boolean oldCustomiseValues = customiseValues;
		customiseValues = newCustomiseValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.EDIT_UNIT__CUSTOMISE_VALUES, oldCustomiseValues, customiseValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION:
				if (resolve) return getConfirmDestination();
				return basicGetConfirmDestination();
			case WebsitePackage.EDIT_UNIT__CONFIRM_LABEL:
				return getConfirmLabel();
			case WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebsitePackage.EDIT_UNIT__CANCEL_LABEL:
				return getCancelLabel();
			case WebsitePackage.EDIT_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebsitePackage.EDIT_UNIT__CUSTOMISE_VALUES:
				return isCustomiseValues();
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
			case WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)newValue);
				return;
			case WebsitePackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel((String)newValue);
				return;
			case WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)newValue);
				return;
			case WebsitePackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel((String)newValue);
				return;
			case WebsitePackage.EDIT_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
				return;
			case WebsitePackage.EDIT_UNIT__CUSTOMISE_VALUES:
				setCustomiseValues((Boolean)newValue);
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
			case WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)null);
				return;
			case WebsitePackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel(CONFIRM_LABEL_EDEFAULT);
				return;
			case WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)null);
				return;
			case WebsitePackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel(CANCEL_LABEL_EDEFAULT);
				return;
			case WebsitePackage.EDIT_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.EDIT_UNIT__CUSTOMISE_VALUES:
				setCustomiseValues(CUSTOMISE_VALUES_EDEFAULT);
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
			case WebsitePackage.EDIT_UNIT__CONFIRM_DESTINATION:
				return confirmDestination != null;
			case WebsitePackage.EDIT_UNIT__CONFIRM_LABEL:
				return CONFIRM_LABEL_EDEFAULT == null ? confirmLabel != null : !CONFIRM_LABEL_EDEFAULT.equals(confirmLabel);
			case WebsitePackage.EDIT_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebsitePackage.EDIT_UNIT__CANCEL_LABEL:
				return CANCEL_LABEL_EDEFAULT == null ? cancelLabel != null : !CANCEL_LABEL_EDEFAULT.equals(cancelLabel);
			case WebsitePackage.EDIT_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebsitePackage.EDIT_UNIT__CUSTOMISE_VALUES:
				return customiseValues != CUSTOMISE_VALUES_EDEFAULT;
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
		result.append(" (confirmLabel: ");
		result.append(confirmLabel);
		result.append(", cancelLabel: ");
		result.append(cancelLabel);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(", customiseValues: ");
		result.append(customiseValues);
		result.append(')');
		return result.toString();
	}

} //EditUnitImpl
