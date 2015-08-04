/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.ControlUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.LoginUnit;
import uk.ac.man.cs.mdsd.webgen.website.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.website.NamedElement;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getErrorClass <em>Error Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getSubmitLabel <em>Submit Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getLayoutClass <em>Layout Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.LoginUnitImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginUnitImpl extends EObjectImpl implements LoginUnit {
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
	 * The default value of the '{@link #getOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OMIT_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOmitCaption() <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitCaption()
	 * @generated
	 * @ordered
	 */
	protected Boolean omitCaption = OMIT_CAPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UnitSource source;

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
	 * The default value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYOUT_CLASS_EDEFAULT = "control_form";

	/**
	 * The cached value of the '{@link #getLayoutClass() <em>Layout Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutClass()
	 * @generated
	 * @ordered
	 */
	protected String layoutClass = LAYOUT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,login_unit,framed";

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
	protected LoginUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.LOGIN_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitContainer getDisplayedOn() {
		if (eContainerFeatureID() != WebsitePackage.LOGIN_UNIT__DISPLAYED_ON) return null;
		return (UnitContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(UnitContainer newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebsitePackage.LOGIN_UNIT__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedOn(UnitContainer newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.LOGIN_UNIT__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebsitePackage.UNIT_CONTAINER__UNITS, UnitContainer.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY, oldPurposeSummary, purposeSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOmitCaption() {
		return omitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitCaption(Boolean newOmitCaption) {
		Boolean oldOmitCaption = omitCaption;
		omitCaption = newOmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__OMIT_CAPTION, oldOmitCaption, omitCaption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__CAPTION_CLASS, oldCaptionClass, captionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UnitSource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOGIN_UNIT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitSource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UnitSource newSource) {
		UnitSource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UnitField> getDisplayFields() {
		if (displayFields == null) {
			displayFields = new EObjectContainmentWithInverseEList<UnitField>(UnitField.class, this, WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS, WebsitePackage.UNIT_FIELD__DISPLAYED_ON);
		}
		return displayFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UnitSupportAction> getSupportActions() {
		if (supportActions == null) {
			supportActions = new EObjectContainmentEList<UnitSupportAction>(UnitSupportAction.class, this, WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__HEADER, oldHeader, header));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__FOOTER, oldFooter, footer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__CONTROL_CLASS, oldControlClass, controlClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__FOOTER_CLASS, oldFooterClass, footerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__ERROR_CLASS, oldErrorClass, errorClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL, oldSubmitLabel, submitLabel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__CANCEL_LABEL, oldCancelLabel, cancelLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayoutClass() {
		return layoutClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutClass(String newLayoutClass) {
		String oldLayoutClass = layoutClass;
		layoutClass = newLayoutClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS, oldLayoutClass, layoutClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.LOGIN_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
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
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((UnitContainer)otherEnd, msgs);
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
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
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<?>)getDisplayFields()).basicRemove(otherEnd, msgs);
			case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS:
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
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.UNIT_CONTAINER__UNITS, UnitContainer.class, msgs);
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
			case WebsitePackage.LOGIN_UNIT__NAME:
				return getName();
			case WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL:
				return getDisplayLabel();
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				return getDisplayedOn();
			case WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY:
				return getPurposeSummary();
			case WebsitePackage.LOGIN_UNIT__OMIT_CAPTION:
				return getOmitCaption();
			case WebsitePackage.LOGIN_UNIT__CAPTION_CLASS:
				return getCaptionClass();
			case WebsitePackage.LOGIN_UNIT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
				return getDisplayFields();
			case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS:
				return getSupportActions();
			case WebsitePackage.LOGIN_UNIT__HEADER:
				return getHeader();
			case WebsitePackage.LOGIN_UNIT__FOOTER:
				return getFooter();
			case WebsitePackage.LOGIN_UNIT__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.LOGIN_UNIT__CONTROL_CLASS:
				return getControlClass();
			case WebsitePackage.LOGIN_UNIT__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.LOGIN_UNIT__ERROR_CLASS:
				return getErrorClass();
			case WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL:
				return getSubmitLabel();
			case WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebsitePackage.LOGIN_UNIT__CANCEL_LABEL:
				return getCancelLabel();
			case WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS:
				return getLayoutClass();
			case WebsitePackage.LOGIN_UNIT__STYLE_CLASS:
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
			case WebsitePackage.LOGIN_UNIT__NAME:
				setName((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				setDisplayedOn((UnitContainer)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__OMIT_CAPTION:
				setOmitCaption((Boolean)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__CAPTION_CLASS:
				setCaptionClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__SOURCE:
				setSource((UnitSource)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				getDisplayFields().addAll((Collection<? extends UnitField>)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				getSupportActions().addAll((Collection<? extends UnitSupportAction>)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__HEADER:
				setHeader((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__FOOTER:
				setFooter((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__CONTROL_CLASS:
				setControlClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__ERROR_CLASS:
				setErrorClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL:
				setSubmitLabel((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__CANCEL_LABEL:
				setCancelLabel((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS:
				setLayoutClass((String)newValue);
				return;
			case WebsitePackage.LOGIN_UNIT__STYLE_CLASS:
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
			case WebsitePackage.LOGIN_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				setDisplayedOn((UnitContainer)null);
				return;
			case WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY:
				setPurposeSummary(PURPOSE_SUMMARY_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__OMIT_CAPTION:
				setOmitCaption(OMIT_CAPTION_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__CAPTION_CLASS:
				setCaptionClass(CAPTION_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__SOURCE:
				setSource((UnitSource)null);
				return;
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				return;
			case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS:
				getSupportActions().clear();
				return;
			case WebsitePackage.LOGIN_UNIT__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__CONTROL_CLASS:
				setControlClass(CONTROL_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__ERROR_CLASS:
				setErrorClass(ERROR_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL:
				setSubmitLabel(SUBMIT_LABEL_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)null);
				return;
			case WebsitePackage.LOGIN_UNIT__CANCEL_LABEL:
				setCancelLabel(CANCEL_LABEL_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS:
				setLayoutClass(LAYOUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.LOGIN_UNIT__STYLE_CLASS:
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
			case WebsitePackage.LOGIN_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY:
				return PURPOSE_SUMMARY_EDEFAULT == null ? purposeSummary != null : !PURPOSE_SUMMARY_EDEFAULT.equals(purposeSummary);
			case WebsitePackage.LOGIN_UNIT__OMIT_CAPTION:
				return OMIT_CAPTION_EDEFAULT == null ? omitCaption != null : !OMIT_CAPTION_EDEFAULT.equals(omitCaption);
			case WebsitePackage.LOGIN_UNIT__CAPTION_CLASS:
				return CAPTION_CLASS_EDEFAULT == null ? captionClass != null : !CAPTION_CLASS_EDEFAULT.equals(captionClass);
			case WebsitePackage.LOGIN_UNIT__SOURCE:
				return source != null;
			case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS:
				return displayFields != null && !displayFields.isEmpty();
			case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS:
				return supportActions != null && !supportActions.isEmpty();
			case WebsitePackage.LOGIN_UNIT__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebsitePackage.LOGIN_UNIT__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebsitePackage.LOGIN_UNIT__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.LOGIN_UNIT__CONTROL_CLASS:
				return CONTROL_CLASS_EDEFAULT == null ? controlClass != null : !CONTROL_CLASS_EDEFAULT.equals(controlClass);
			case WebsitePackage.LOGIN_UNIT__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.LOGIN_UNIT__ERROR_CLASS:
				return ERROR_CLASS_EDEFAULT == null ? errorClass != null : !ERROR_CLASS_EDEFAULT.equals(errorClass);
			case WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL:
				return SUBMIT_LABEL_EDEFAULT == null ? submitLabel != null : !SUBMIT_LABEL_EDEFAULT.equals(submitLabel);
			case WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebsitePackage.LOGIN_UNIT__CANCEL_LABEL:
				return CANCEL_LABEL_EDEFAULT == null ? cancelLabel != null : !CANCEL_LABEL_EDEFAULT.equals(cancelLabel);
			case WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS:
				return LAYOUT_CLASS_EDEFAULT == null ? layoutClass != null : !LAYOUT_CLASS_EDEFAULT.equals(layoutClass);
			case WebsitePackage.LOGIN_UNIT__STYLE_CLASS:
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
				case WebsitePackage.LOGIN_UNIT__NAME: return WebsitePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL: return WebsitePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ContentUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.LOGIN_UNIT__DISPLAYED_ON: return WebsitePackage.CONTENT_UNIT__DISPLAYED_ON;
				case WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY: return WebsitePackage.CONTENT_UNIT__PURPOSE_SUMMARY;
				case WebsitePackage.LOGIN_UNIT__OMIT_CAPTION: return WebsitePackage.CONTENT_UNIT__OMIT_CAPTION;
				case WebsitePackage.LOGIN_UNIT__CAPTION_CLASS: return WebsitePackage.CONTENT_UNIT__CAPTION_CLASS;
				default: return -1;
			}
		}
		if (baseClass == DynamicUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.LOGIN_UNIT__SOURCE: return WebsitePackage.DYNAMIC_UNIT__SOURCE;
				case WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS: return WebsitePackage.DYNAMIC_UNIT__DISPLAY_FIELDS;
				case WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS: return WebsitePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS;
				case WebsitePackage.LOGIN_UNIT__HEADER: return WebsitePackage.DYNAMIC_UNIT__HEADER;
				case WebsitePackage.LOGIN_UNIT__FOOTER: return WebsitePackage.DYNAMIC_UNIT__FOOTER;
				case WebsitePackage.LOGIN_UNIT__HEADER_CLASS: return WebsitePackage.DYNAMIC_UNIT__HEADER_CLASS;
				case WebsitePackage.LOGIN_UNIT__CONTROL_CLASS: return WebsitePackage.DYNAMIC_UNIT__CONTROL_CLASS;
				case WebsitePackage.LOGIN_UNIT__FOOTER_CLASS: return WebsitePackage.DYNAMIC_UNIT__FOOTER_CLASS;
				case WebsitePackage.LOGIN_UNIT__ERROR_CLASS: return WebsitePackage.DYNAMIC_UNIT__ERROR_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ControlUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL: return WebsitePackage.CONTROL_UNIT__SUBMIT_LABEL;
				case WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION: return WebsitePackage.CONTROL_UNIT__CANCEL_DESTINATION;
				case WebsitePackage.LOGIN_UNIT__CANCEL_LABEL: return WebsitePackage.CONTROL_UNIT__CANCEL_LABEL;
				case WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS: return WebsitePackage.CONTROL_UNIT__LAYOUT_CLASS;
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
				case WebsitePackage.NAMED_ELEMENT__NAME: return WebsitePackage.LOGIN_UNIT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (baseFeatureID) {
				case WebsitePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL: return WebsitePackage.LOGIN_UNIT__DISPLAY_LABEL;
				default: return -1;
			}
		}
		if (baseClass == ContentUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.CONTENT_UNIT__DISPLAYED_ON: return WebsitePackage.LOGIN_UNIT__DISPLAYED_ON;
				case WebsitePackage.CONTENT_UNIT__PURPOSE_SUMMARY: return WebsitePackage.LOGIN_UNIT__PURPOSE_SUMMARY;
				case WebsitePackage.CONTENT_UNIT__OMIT_CAPTION: return WebsitePackage.LOGIN_UNIT__OMIT_CAPTION;
				case WebsitePackage.CONTENT_UNIT__CAPTION_CLASS: return WebsitePackage.LOGIN_UNIT__CAPTION_CLASS;
				default: return -1;
			}
		}
		if (baseClass == DynamicUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.DYNAMIC_UNIT__SOURCE: return WebsitePackage.LOGIN_UNIT__SOURCE;
				case WebsitePackage.DYNAMIC_UNIT__DISPLAY_FIELDS: return WebsitePackage.LOGIN_UNIT__DISPLAY_FIELDS;
				case WebsitePackage.DYNAMIC_UNIT__SUPPORT_ACTIONS: return WebsitePackage.LOGIN_UNIT__SUPPORT_ACTIONS;
				case WebsitePackage.DYNAMIC_UNIT__HEADER: return WebsitePackage.LOGIN_UNIT__HEADER;
				case WebsitePackage.DYNAMIC_UNIT__FOOTER: return WebsitePackage.LOGIN_UNIT__FOOTER;
				case WebsitePackage.DYNAMIC_UNIT__HEADER_CLASS: return WebsitePackage.LOGIN_UNIT__HEADER_CLASS;
				case WebsitePackage.DYNAMIC_UNIT__CONTROL_CLASS: return WebsitePackage.LOGIN_UNIT__CONTROL_CLASS;
				case WebsitePackage.DYNAMIC_UNIT__FOOTER_CLASS: return WebsitePackage.LOGIN_UNIT__FOOTER_CLASS;
				case WebsitePackage.DYNAMIC_UNIT__ERROR_CLASS: return WebsitePackage.LOGIN_UNIT__ERROR_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ControlUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.CONTROL_UNIT__SUBMIT_LABEL: return WebsitePackage.LOGIN_UNIT__SUBMIT_LABEL;
				case WebsitePackage.CONTROL_UNIT__CANCEL_DESTINATION: return WebsitePackage.LOGIN_UNIT__CANCEL_DESTINATION;
				case WebsitePackage.CONTROL_UNIT__CANCEL_LABEL: return WebsitePackage.LOGIN_UNIT__CANCEL_LABEL;
				case WebsitePackage.CONTROL_UNIT__LAYOUT_CLASS: return WebsitePackage.LOGIN_UNIT__LAYOUT_CLASS;
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
		result.append(", purposeSummary: ");
		result.append(purposeSummary);
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
		result.append(", layoutClass: ");
		result.append(layoutClass);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //LoginUnitImpl
