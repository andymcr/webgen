/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.webui.ImageIndexUnit;
import uk.ac.man.cs.mdsd.webgen.webui.InlineAction;
import uk.ac.man.cs.mdsd.webgen.webui.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Index Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#isEnableImageEnlargement <em>Enable Image Enlargement</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.impl.ImageIndexUnitImpl#getCardClass <em>Card Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageIndexUnitImpl extends ImageUnitImpl implements ImageIndexUnit {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #isOverlayTitle() <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlayTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERLAY_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverlayTitle() <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlayTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean overlayTitle = OVERLAY_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableImageEnlargement() <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableImageEnlargement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_IMAGE_ENLARGEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableImageEnlargement() <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableImageEnlargement()
	 * @generated
	 * @ordered
	 */
	protected boolean enableImageEnlargement = ENABLE_IMAGE_ENLARGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_FIELD_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitFieldLabels = OMIT_FIELD_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverlaySingleSelectAction() <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverlaySingleSelectAction() <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 * @ordered
	 */
	protected boolean overlaySingleSelectAction = OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRevealUntruncatedContent() <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVEAL_UNTRUNCATED_CONTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRevealUntruncatedContent() <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 * @ordered
	 */
	protected boolean revealUntruncatedContent = REVEAL_UNTRUNCATED_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,image_index_unit";

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
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "row";

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
	 * The default value of the '{@link #getColumnClass() <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnClass()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_CLASS_EDEFAULT = "col s12 m6 l3";

	/**
	 * The cached value of the '{@link #getColumnClass() <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnClass()
	 * @generated
	 * @ordered
	 */
	protected String columnClass = COLUMN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_CLASS_EDEFAULT = "card";

	/**
	 * The cached value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected String cardClass = CARD_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageIndexUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.IMAGE_INDEX_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS, WebuiPackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitFieldLabels() {
		return omitFieldLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitFieldLabels(boolean newOmitFieldLabels) {
		boolean oldOmitFieldLabels = omitFieldLabels;
		omitFieldLabels = newOmitFieldLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS, oldOmitFieldLabels, omitFieldLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverlaySingleSelectAction() {
		return overlaySingleSelectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlaySingleSelectAction(boolean newOverlaySingleSelectAction) {
		boolean oldOverlaySingleSelectAction = overlaySingleSelectAction;
		overlaySingleSelectAction = newOverlaySingleSelectAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION, oldOverlaySingleSelectAction, overlaySingleSelectAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRevealUntruncatedContent() {
		return revealUntruncatedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevealUntruncatedContent(boolean newRevealUntruncatedContent) {
		boolean oldRevealUntruncatedContent = revealUntruncatedContent;
		revealUntruncatedContent = newRevealUntruncatedContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__REVEAL_UNTRUNCATED_CONTENT, oldRevealUntruncatedContent, revealUntruncatedContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverlayTitle() {
		return overlayTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlayTitle(boolean newOverlayTitle) {
		boolean oldOverlayTitle = overlayTitle;
		overlayTitle = newOverlayTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_TITLE, oldOverlayTitle, overlayTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableImageEnlargement() {
		return enableImageEnlargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableImageEnlargement(boolean newEnableImageEnlargement) {
		boolean oldEnableImageEnlargement = enableImageEnlargement;
		enableImageEnlargement = newEnableImageEnlargement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__ENABLE_IMAGE_ENLARGEMENT, oldEnableImageEnlargement, enableImageEnlargement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnClass() {
		return columnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnClass(String newColumnClass) {
		String oldColumnClass = columnClass;
		columnClass = newColumnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__COLUMN_CLASS, oldColumnClass, columnClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardClass() {
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardClass(String newCardClass) {
		String oldCardClass = cardClass;
		cardClass = newCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.IMAGE_INDEX_UNIT__CARD_CLASS, oldCardClass, cardClass));
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				return getActions();
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_TITLE:
				return isOverlayTitle();
			case WebuiPackage.IMAGE_INDEX_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				return isEnableImageEnlargement();
			case WebuiPackage.IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return isOverlaySingleSelectAction();
			case WebuiPackage.IMAGE_INDEX_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				return isRevealUntruncatedContent();
			case WebuiPackage.IMAGE_INDEX_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebuiPackage.IMAGE_INDEX_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebuiPackage.IMAGE_INDEX_UNIT__COLUMN_CLASS:
				return getColumnClass();
			case WebuiPackage.IMAGE_INDEX_UNIT__CARD_CLASS:
				return getCardClass();
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_TITLE:
				setOverlayTitle((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				setEnableImageEnlargement((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				setRevealUntruncatedContent((Boolean)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__COLUMN_CLASS:
				setColumnClass((String)newValue);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__CARD_CLASS:
				setCardClass((String)newValue);
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				getActions().clear();
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_TITLE:
				setOverlayTitle(OVERLAY_TITLE_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				setEnableImageEnlargement(ENABLE_IMAGE_ENLARGEMENT_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels(OMIT_FIELD_LABELS_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction(OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				setRevealUntruncatedContent(REVEAL_UNTRUNCATED_CONTENT_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__COLUMN_CLASS:
				setColumnClass(COLUMN_CLASS_EDEFAULT);
				return;
			case WebuiPackage.IMAGE_INDEX_UNIT__CARD_CLASS:
				setCardClass(CARD_CLASS_EDEFAULT);
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
			case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_TITLE:
				return overlayTitle != OVERLAY_TITLE_EDEFAULT;
			case WebuiPackage.IMAGE_INDEX_UNIT__ENABLE_IMAGE_ENLARGEMENT:
				return enableImageEnlargement != ENABLE_IMAGE_ENLARGEMENT_EDEFAULT;
			case WebuiPackage.IMAGE_INDEX_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
			case WebuiPackage.IMAGE_INDEX_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return overlaySingleSelectAction != OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;
			case WebuiPackage.IMAGE_INDEX_UNIT__REVEAL_UNTRUNCATED_CONTENT:
				return revealUntruncatedContent != REVEAL_UNTRUNCATED_CONTENT_EDEFAULT;
			case WebuiPackage.IMAGE_INDEX_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebuiPackage.IMAGE_INDEX_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebuiPackage.IMAGE_INDEX_UNIT__COLUMN_CLASS:
				return COLUMN_CLASS_EDEFAULT == null ? columnClass != null : !COLUMN_CLASS_EDEFAULT.equals(columnClass);
			case WebuiPackage.IMAGE_INDEX_UNIT__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
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
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS: return WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS;
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
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebuiPackage.IMAGE_INDEX_UNIT__ACTIONS;
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
		result.append(" (overlayTitle: ");
		result.append(overlayTitle);
		result.append(", enableImageEnlargement: ");
		result.append(enableImageEnlargement);
		result.append(", omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(", overlaySingleSelectAction: ");
		result.append(overlaySingleSelectAction);
		result.append(", revealUntruncatedContent: ");
		result.append(revealUntruncatedContent);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(", columnClass: ");
		result.append(columnClass);
		result.append(", cardClass: ");
		result.append(cardClass);
		result.append(')');
		return result.toString();
	}

} //ImageIndexUnitImpl
