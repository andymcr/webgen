/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.interface_.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitField;
import uk.ac.man.cs.mdsd.webgen.interface_.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.interface_.WebGenInterfacePackage;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.interface_.impl.DynamicUnitImpl#getErrorClass <em>Error Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicUnitImpl extends ContentUnitImpl implements DynamicUnit {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> entities;

	/**
	 * The cached value of the '{@link #getDisplayFields() <em>Display Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFields()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitField> displayFields;

	/**
	 * The cached value of the '{@link #getSupportActions() <em>Support Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitSupportAction> supportActions;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = "unit_header";

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_CLASS_EDEFAULT = "unit_control";

	/**
	 * The cached value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected String controlClass = CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = "unit_footer";

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorClass() <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CLASS_EDEFAULT = "error";

	/**
	 * The cached value of the '{@link #getErrorClass() <em>Error Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorClass()
	 * @generated
	 * @ordered
	 */
	protected String errorClass = ERROR_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebGenInterfacePackage.Literals.DYNAMIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOrView> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebGenInterfacePackage.DYNAMIC_UNIT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitField> getDisplayFields() {
		if (displayFields == null) {
			displayFields = new EObjectContainmentWithInverseEList<UnitField>(UnitField.class, this, WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS, WebGenInterfacePackage.UNIT_FIELD__DISPLAYED_ON);
		}
		return displayFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitSupportAction> getSupportActions() {
		if (supportActions == null) {
			supportActions = new EObjectContainmentEList<UnitSupportAction>(UnitSupportAction.class, this, WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS);
		}
		return supportActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlClass() {
		return controlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlClass(String newControlClass) {
		String oldControlClass = controlClass;
		controlClass = newControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__CONTROL_CLASS, oldControlClass, controlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorClass() {
		return errorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorClass(String newErrorClass) {
		String oldErrorClass = errorClass;
		errorClass = newErrorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebGenInterfacePackage.DYNAMIC_UNIT__ERROR_CLASS, oldErrorClass, errorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayFields()).basicAdd(otherEnd, msgs);
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
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<?>)getDisplayFields()).basicRemove(otherEnd, msgs);
			case WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return ((InternalEList<?>)getSupportActions()).basicRemove(otherEnd, msgs);
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
			case WebGenInterfacePackage.DYNAMIC_UNIT__ENTITIES:
				return getEntities();
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return getDisplayFields();
			case WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return getSupportActions();
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER:
				return getHeader();
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER:
				return getFooter();
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER_CLASS:
				return getHeaderClass();
			case WebGenInterfacePackage.DYNAMIC_UNIT__CONTROL_CLASS:
				return getControlClass();
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER_CLASS:
				return getFooterClass();
			case WebGenInterfacePackage.DYNAMIC_UNIT__ERROR_CLASS:
				return getErrorClass();
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
			case WebGenInterfacePackage.DYNAMIC_UNIT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				getDisplayFields().addAll((Collection<? extends UnitField>)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				getSupportActions().addAll((Collection<? extends UnitSupportAction>)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER:
				setHeader((String)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER:
				setFooter((String)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__CONTROL_CLASS:
				setControlClass((String)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__ERROR_CLASS:
				setErrorClass((String)newValue);
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
			case WebGenInterfacePackage.DYNAMIC_UNIT__ENTITIES:
				getEntities().clear();
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__CONTROL_CLASS:
				setControlClass(CONTROL_CLASS_EDEFAULT);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebGenInterfacePackage.DYNAMIC_UNIT__ERROR_CLASS:
				setErrorClass(ERROR_CLASS_EDEFAULT);
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
			case WebGenInterfacePackage.DYNAMIC_UNIT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case WebGenInterfacePackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return displayFields != null && !displayFields.isEmpty();
			case WebGenInterfacePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS:
				return supportActions != null && !supportActions.isEmpty();
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebGenInterfacePackage.DYNAMIC_UNIT__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebGenInterfacePackage.DYNAMIC_UNIT__CONTROL_CLASS:
				return CONTROL_CLASS_EDEFAULT == null ? controlClass != null : !CONTROL_CLASS_EDEFAULT.equals(controlClass);
			case WebGenInterfacePackage.DYNAMIC_UNIT__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebGenInterfacePackage.DYNAMIC_UNIT__ERROR_CLASS:
				return ERROR_CLASS_EDEFAULT == null ? errorClass != null : !ERROR_CLASS_EDEFAULT.equals(errorClass);
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
		result.append(" (header: ");
		result.append(header);
		result.append(", footer: ");
		result.append(footer);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", controlClass: ");
		result.append(controlClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", errorClass: ");
		result.append(errorClass);
		result.append(')');
		return result.toString();
	}

} //DynamicUnitImpl
