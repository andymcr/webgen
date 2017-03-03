/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.webgen.expression.Predicate;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Label;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

import uk.ac.man.cs.mdsd.webgen.webui.EditUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.EditUnitImpl#isCustomiseValues <em>Customise Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EditUnitImpl extends DynamicUnitImpl implements EditUnit {
	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView contentType;

	/**
	 * The cached value of the '{@link #getDefaultSelection() <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection defaultSelection;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Label title;

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
	protected static final String CONTENT_CLASS_EDEFAULT = "edit_content,framed";

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
		return WebuiPackage.Literals.EDIT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (EntityOrView)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(EntityOrView newContentType) {
		EntityOrView oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getDefaultSelection() {
		if (defaultSelection != null && defaultSelection.eIsProxy()) {
			InternalEObject oldDefaultSelection = (InternalEObject)defaultSelection;
			defaultSelection = (Selection)eResolveProxy(oldDefaultSelection);
			if (defaultSelection != oldDefaultSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
			}
		}
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetDefaultSelection() {
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSelection(Selection newDefaultSelection) {
		Selection oldDefaultSelection = defaultSelection;
		defaultSelection = newDefaultSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Label)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Label newTitle) {
		Label oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__TITLE, oldTitle, title));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__ENABLE_WHEN, oldEnableWhen, newEnableWhen);
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
				msgs = ((InternalEObject)enableWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__ENABLE_WHEN, null, msgs);
			if (newEnableWhen != null)
				msgs = ((InternalEObject)newEnableWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__ENABLE_WHEN, null, msgs);
			msgs = basicSetEnableWhen(newEnableWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__ENABLE_WHEN, newEnableWhen, newEnableWhen));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_LABEL, oldConfirmLabel, confirmLabel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_LABEL, oldCancelLabel, cancelLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES, oldCustomiseValues, customiseValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.EDIT_UNIT__ENABLE_WHEN:
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
			case WebuiPackage.EDIT_UNIT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION:
				if (resolve) return getDefaultSelection();
				return basicGetDefaultSelection();
			case WebuiPackage.EDIT_UNIT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case WebuiPackage.EDIT_UNIT__ENABLE_WHEN:
				return getEnableWhen();
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				if (resolve) return getConfirmDestination();
				return basicGetConfirmDestination();
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				return getConfirmLabel();
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				return getCancelLabel();
			case WebuiPackage.EDIT_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
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
			case WebuiPackage.EDIT_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__TITLE:
				setTitle((Label)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__ENABLE_WHEN:
				setEnableWhen((Predicate)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
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
			case WebuiPackage.EDIT_UNIT__CONTENT_TYPE:
				setContentType((EntityOrView)null);
				return;
			case WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)null);
				return;
			case WebuiPackage.EDIT_UNIT__TITLE:
				setTitle((Label)null);
				return;
			case WebuiPackage.EDIT_UNIT__ENABLE_WHEN:
				setEnableWhen((Predicate)null);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)null);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel(CONFIRM_LABEL_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)null);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel(CANCEL_LABEL_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
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
			case WebuiPackage.EDIT_UNIT__CONTENT_TYPE:
				return contentType != null;
			case WebuiPackage.EDIT_UNIT__DEFAULT_SELECTION:
				return defaultSelection != null;
			case WebuiPackage.EDIT_UNIT__TITLE:
				return title != null;
			case WebuiPackage.EDIT_UNIT__ENABLE_WHEN:
				return enableWhen != null;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				return confirmDestination != null;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				return CONFIRM_LABEL_EDEFAULT == null ? confirmLabel != null : !CONFIRM_LABEL_EDEFAULT.equals(confirmLabel);
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				return CANCEL_LABEL_EDEFAULT == null ? cancelLabel != null : !CANCEL_LABEL_EDEFAULT.equals(cancelLabel);
			case WebuiPackage.EDIT_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SingletonUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.EDIT_UNIT__CONTENT_TYPE: return WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE;
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
		if (baseClass == SingletonUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.SINGLETON_UNIT__CONTENT_TYPE: return WebuiPackage.EDIT_UNIT__CONTENT_TYPE;
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
