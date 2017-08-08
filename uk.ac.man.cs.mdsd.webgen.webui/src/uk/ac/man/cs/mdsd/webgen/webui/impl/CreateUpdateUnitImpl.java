/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.ac.man.cs.mdsd.webgen.webui.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl#getClearLabel <em>Clear Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.CreateUpdateUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateUpdateUnitImpl extends EditUnitImpl implements CreateUpdateUnit {
	/**
	 * The default value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected String createUriElement = CREATE_URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected String clearLabel = CLEAR_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,create_unit,update_unit";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CREATE_UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateUriElement() {
		return createUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateUriElement(String newCreateUriElement) {
		String oldCreateUriElement = createUriElement;
		createUriElement = newCreateUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT, oldCreateUriElement, createUriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClearLabel() {
		return clearLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearLabel(String newClearLabel) {
		String oldClearLabel = clearLabel;
		clearLabel = newClearLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL, oldClearLabel, clearLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return getCreateUriElement();
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return getClearLabel();
			case WebuiPackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
				return getStyleClass();
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
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement((String)newValue);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel((String)newValue);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement(CREATE_URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel(CLEAR_LABEL_EDEFAULT);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return CREATE_URI_ELEMENT_EDEFAULT == null ? createUriElement != null : !CREATE_URI_ELEMENT_EDEFAULT.equals(createUriElement);
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return CLEAR_LABEL_EDEFAULT == null ? clearLabel != null : !CLEAR_LABEL_EDEFAULT.equals(clearLabel);
			case WebuiPackage.CREATE_UPDATE_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
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
		result.append(" (createUriElement: ");
		result.append(createUriElement);
		result.append(", clearLabel: ");
		result.append(clearLabel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //CreateUpdateUnitImpl
