/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

import uk.ac.man.cs.mdsd.webgen.webui.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ControlUnit;
import uk.ac.man.cs.mdsd.webgen.webui.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.webui.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.webui.Page;
import uk.ac.man.cs.mdsd.webgen.webui.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.webui.UnitField;
import uk.ac.man.cs.mdsd.webgen.webui.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forgotten Password Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getPageDisplayedOn <em>Page Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getErrorClass <em>Error Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getSubmitLabel <em>Submit Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ForgottenPasswordUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForgottenPasswordUnitImpl extends MinimalEObjectImpl.Container implements ForgottenPasswordUnit {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_DEFAULT_URI_ELEMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreateDefaultUriElement() <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 * @ordered
	 */
	protected boolean createDefaultUriElement = CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;

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
	 * The default value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeSummary() <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeSummary()
	 * @generated
	 * @ordered
	 */
	protected String purposeSummary = PURPOSE_SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected String uriElement = URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected String alternative = ALTERNATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CAPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected boolean omitCaption = OMIT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_CLASS_EDEFAULT = "unit_caption";

	/**
	 * The cached value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String captionClass = CAPTION_CLASS_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPageDisplayedOn() <em>Page Displayed On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageDisplayedOn()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAGE_DISPLAYED_ON__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.CONTENT_UNIT__PAGE_DISPLAYED_ON).getSettingDelegate();

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
	 * The default value of the '{@link #getSubmitLabel() <em>Submit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMIT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitLabel() <em>Submit Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitLabel()
	 * @generated
	 * @ordered
	 */
	protected String submitLabel = SUBMIT_LABEL_EDEFAULT;

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
	protected static final String CONTENT_CLASS_EDEFAULT = "control_form";

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
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,forgotten_password_unit";

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
	protected ForgottenPasswordUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.FORGOTTEN_PASSWORD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitContainer getDisplayedOn() {
		if (eContainerFeatureID() != WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON) return null;
		return (UnitContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(UnitContainer newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(UnitContainer newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebuiPackage.UNIT_CONTAINER__UNITS, UnitContainer.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateDefaultUriElement() {
		return createDefaultUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateDefaultUriElement(boolean newCreateDefaultUriElement) {
		boolean oldCreateDefaultUriElement = createDefaultUriElement;
		createDefaultUriElement = newCreateDefaultUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT, oldCreateDefaultUriElement, createDefaultUriElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE, oldRequiresRole, requiresRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurposeSummary() {
		return purposeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurposeSummary(String newPurposeSummary) {
		String oldPurposeSummary = purposeSummary;
		purposeSummary = newPurposeSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY, oldPurposeSummary, purposeSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriElement() {
		return uriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriElement(String newUriElement) {
		String oldUriElement = uriElement;
		uriElement = newUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternative() {
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(String newAlternative) {
		String oldAlternative = alternative;
		alternative = newAlternative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE, oldAlternative, alternative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitCaption() {
		return omitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitCaption(boolean newOmitCaption) {
		boolean oldOmitCaption = omitCaption;
		omitCaption = newOmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION, oldOmitCaption, omitCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionClass() {
		return captionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionClass(String newCaptionClass) {
		String oldCaptionClass = captionClass;
		captionClass = newCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS, oldCaptionClass, captionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPageDisplayedOn() {
		return (Page)PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPageDisplayedOn() {
		return (Page)PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageDisplayedOn(Page newPageDisplayedOn) {
		PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPageDisplayedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOrView> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES);
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
			displayFields = new EObjectContainmentWithInverseEList<UnitField>(UnitField.class, this, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS, WebuiPackage.UNIT_FIELD__DISPLAYED_ON);
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
			supportActions = new EObjectContainmentEList<UnitSupportAction>(UnitSupportAction.class, this, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER, oldHeader, header));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS, oldControlClass, controlClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS, oldFooterClass, footerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS, oldErrorClass, errorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubmitLabel() {
		return submitLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitLabel(String newSubmitLabel) {
		String oldSubmitLabel = submitLabel;
		submitLabel = newSubmitLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL, oldSubmitLabel, submitLabel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL, oldCancelLabel, cancelLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((UnitContainer)otherEnd, msgs);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<?>)getDisplayFields()).basicRemove(otherEnd, msgs);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.UNIT_CONTAINER__UNITS, UnitContainer.class, msgs);
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME:
				return getName();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL:
				return getDisplayLabel();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				return getDisplayedOn();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return isCreateDefaultUriElement();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE:
				return getRequiresRole();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY:
				return getPurposeSummary();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT:
				return getUriElement();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE:
				return getAlternative();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION:
				return isOmitCaption();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS:
				return getCaptionClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON:
				if (resolve) return getPageDisplayedOn();
				return basicGetPageDisplayedOn();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES:
				return getEntities();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
				return getDisplayFields();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
				return getSupportActions();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER:
				return getHeader();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER:
				return getFooter();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS:
				return getHeaderClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS:
				return getControlClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS:
				return getFooterClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS:
				return getErrorClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL:
				return getSubmitLabel();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL:
				return getCancelLabel();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS:
				return getStyleClass();
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME:
				setName((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				setDisplayedOn((UnitContainer)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement((Boolean)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE:
				setRequiresRole((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE:
				setAlternative((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION:
				setOmitCaption((Boolean)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS:
				setCaptionClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON:
				setPageDisplayedOn((Page)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				getDisplayFields().addAll((Collection<? extends UnitField>)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				getSupportActions().addAll((Collection<? extends UnitSupportAction>)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER:
				setHeader((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS:
				setControlClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS:
				setErrorClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL:
				setSubmitLabel((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL:
				setCancelLabel((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS:
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				setDisplayedOn((UnitContainer)null);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				setCreateDefaultUriElement(CREATE_DEFAULT_URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE:
				setRequiresRole(REQUIRES_ROLE_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary(PURPOSE_SUMMARY_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE:
				setAlternative(ALTERNATIVE_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION:
				setOmitCaption(OMIT_CAPTION_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS:
				setCaptionClass(CAPTION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON:
				setPageDisplayedOn((Page)null);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES:
				getEntities().clear();
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS:
				setControlClass(CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS:
				setErrorClass(ERROR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL:
				setSubmitLabel(SUBMIT_LABEL_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)null);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL:
				setCancelLabel(CANCEL_LABEL_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS:
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
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT:
				return createDefaultUriElement != CREATE_DEFAULT_URI_ELEMENT_EDEFAULT;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE:
				return REQUIRES_ROLE_EDEFAULT == null ? requiresRole != null : !REQUIRES_ROLE_EDEFAULT.equals(requiresRole);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY:
				return PURPOSE_SUMMARY_EDEFAULT == null ? purposeSummary != null : !PURPOSE_SUMMARY_EDEFAULT.equals(purposeSummary);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE:
				return ALTERNATIVE_EDEFAULT == null ? alternative != null : !ALTERNATIVE_EDEFAULT.equals(alternative);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION:
				return omitCaption != OMIT_CAPTION_EDEFAULT;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS:
				return CAPTION_CLASS_EDEFAULT == null ? captionClass != null : !CAPTION_CLASS_EDEFAULT.equals(captionClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON:
				return PAGE_DISPLAYED_ON__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS:
				return displayFields != null && !displayFields.isEmpty();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS:
				return supportActions != null && !supportActions.isEmpty();
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS:
				return CONTROL_CLASS_EDEFAULT == null ? controlClass != null : !CONTROL_CLASS_EDEFAULT.equals(controlClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS:
				return ERROR_CLASS_EDEFAULT == null ? errorClass != null : !ERROR_CLASS_EDEFAULT.equals(errorClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL:
				return SUBMIT_LABEL_EDEFAULT == null ? submitLabel != null : !SUBMIT_LABEL_EDEFAULT.equals(submitLabel);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL:
				return CANCEL_LABEL_EDEFAULT == null ? cancelLabel != null : !CANCEL_LABEL_EDEFAULT.equals(cancelLabel);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME: return BasePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL: return BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ContentUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON: return WebuiPackage.CONTENT_UNIT__DISPLAYED_ON;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT: return WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE: return WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY: return WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT: return WebuiPackage.CONTENT_UNIT__URI_ELEMENT;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE: return WebuiPackage.CONTENT_UNIT__ALTERNATIVE;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION: return WebuiPackage.CONTENT_UNIT__OMIT_CAPTION;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS: return WebuiPackage.CONTENT_UNIT__CAPTION_CLASS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON: return WebuiPackage.CONTENT_UNIT__PAGE_DISPLAYED_ON;
				default: return -1;
			}
		}
		if (baseClass == DynamicUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES: return WebuiPackage.DYNAMIC_UNIT__ENTITIES;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS: return WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS: return WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER: return WebuiPackage.DYNAMIC_UNIT__HEADER;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER: return WebuiPackage.DYNAMIC_UNIT__FOOTER;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS: return WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS: return WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS: return WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS: return WebuiPackage.DYNAMIC_UNIT__ERROR_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ControlUnit.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL: return WebuiPackage.CONTROL_UNIT__SUBMIT_LABEL;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION: return WebuiPackage.CONTROL_UNIT__CANCEL_DESTINATION;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL: return WebuiPackage.CONTROL_UNIT__CANCEL_LABEL;
				case WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS: return WebuiPackage.CONTROL_UNIT__CONTENT_CLASS;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case BasePackage.NAMED_ELEMENT__NAME: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (baseFeatureID) {
				case BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ContentUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.CONTENT_UNIT__DISPLAYED_ON: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAYED_ON;
				case WebuiPackage.CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CREATE_DEFAULT_URI_ELEMENT;
				case WebuiPackage.CONTENT_UNIT__REQUIRES_ROLE: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__REQUIRES_ROLE;
				case WebuiPackage.CONTENT_UNIT__PURPOSE_SUMMARY: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PURPOSE_SUMMARY;
				case WebuiPackage.CONTENT_UNIT__URI_ELEMENT: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__URI_ELEMENT;
				case WebuiPackage.CONTENT_UNIT__ALTERNATIVE: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ALTERNATIVE;
				case WebuiPackage.CONTENT_UNIT__OMIT_CAPTION: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__OMIT_CAPTION;
				case WebuiPackage.CONTENT_UNIT__CAPTION_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CAPTION_CLASS;
				case WebuiPackage.CONTENT_UNIT__PAGE_DISPLAYED_ON: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__PAGE_DISPLAYED_ON;
				default: return -1;
			}
		}
		if (baseClass == DynamicUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.DYNAMIC_UNIT__ENTITIES: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ENTITIES;
				case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__DISPLAY_FIELDS;
				case WebuiPackage.DYNAMIC_UNIT__SUPPORT_ACTIONS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUPPORT_ACTIONS;
				case WebuiPackage.DYNAMIC_UNIT__HEADER: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER;
				case WebuiPackage.DYNAMIC_UNIT__FOOTER: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER;
				case WebuiPackage.DYNAMIC_UNIT__HEADER_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__HEADER_CLASS;
				case WebuiPackage.DYNAMIC_UNIT__CONTROL_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTROL_CLASS;
				case WebuiPackage.DYNAMIC_UNIT__FOOTER_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__FOOTER_CLASS;
				case WebuiPackage.DYNAMIC_UNIT__ERROR_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__ERROR_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ControlUnit.class) {
			switch (baseFeatureID) {
				case WebuiPackage.CONTROL_UNIT__SUBMIT_LABEL: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__SUBMIT_LABEL;
				case WebuiPackage.CONTROL_UNIT__CANCEL_DESTINATION: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_DESTINATION;
				case WebuiPackage.CONTROL_UNIT__CANCEL_LABEL: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CANCEL_LABEL;
				case WebuiPackage.CONTROL_UNIT__CONTENT_CLASS: return WebuiPackage.FORGOTTEN_PASSWORD_UNIT__CONTENT_CLASS;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", createDefaultUriElement: ");
		result.append(createDefaultUriElement);
		result.append(", requiresRole: ");
		result.append(requiresRole);
		result.append(", purposeSummary: ");
		result.append(purposeSummary);
		result.append(", uriElement: ");
		result.append(uriElement);
		result.append(", alternative: ");
		result.append(alternative);
		result.append(", omitCaption: ");
		result.append(omitCaption);
		result.append(", captionClass: ");
		result.append(captionClass);
		result.append(", header: ");
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
		result.append(", submitLabel: ");
		result.append(submitLabel);
		result.append(", cancelLabel: ");
		result.append(cancelLabel);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //ForgottenPasswordUnitImpl
