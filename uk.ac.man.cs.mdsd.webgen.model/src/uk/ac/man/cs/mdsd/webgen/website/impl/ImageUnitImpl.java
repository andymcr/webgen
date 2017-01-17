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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.ac.man.cs.mdsd.webgen.website.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.FeaturePath;
import uk.ac.man.cs.mdsd.webgen.website.ImageManipulation;
import uk.ac.man.cs.mdsd.webgen.website.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.website.SelectableUnit;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getTitleFeature <em>Title Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getImageFilter <em>Image Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ImageUnitImpl#getTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImageUnitImpl extends DynamicUnitImpl implements ImageUnit {
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView selectionType;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> contentType;

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
	 * The cached value of the '{@link #getImagePathFeature() <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath imagePathFeature;

	/**
	 * The cached value of the '{@link #getTitleFeature() <em>Title Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath titleFeature;

	/**
	 * The default value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected String missingImagePath = MISSING_IMAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageFilter() <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation imageFilter;

	/**
	 * The default value of the '{@link #getShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOW_TIME_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getShowTime() <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowTime()
	 * @generated
	 * @ordered
	 */
	protected int showTime = SHOW_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSITION_TIME_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected int transitionTime = TRANSITION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.IMAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getSelectionType() {
		if (selectionType != null && selectionType.eIsProxy()) {
			InternalEObject oldSelectionType = (InternalEObject)selectionType;
			selectionType = (EntityOrView)eResolveProxy(oldSelectionType);
			if (selectionType != oldSelectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.IMAGE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
			}
		}
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(EntityOrView newSelectionType) {
		EntityOrView oldSelectionType = selectionType;
		selectionType = newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityOrView> getContentType() {
		if (contentType == null) {
			contentType = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebsitePackage.IMAGE_UNIT__CONTENT_TYPE);
		}
		return contentType;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getImagePathFeature() {
		return imagePathFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePathFeature(FeaturePath newImagePathFeature, NotificationChain msgs) {
		FeaturePath oldImagePathFeature = imagePathFeature;
		imagePathFeature = newImagePathFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, oldImagePathFeature, newImagePathFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePathFeature(FeaturePath newImagePathFeature) {
		if (newImagePathFeature != imagePathFeature) {
			NotificationChain msgs = null;
			if (imagePathFeature != null)
				msgs = ((InternalEObject)imagePathFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			if (newImagePathFeature != null)
				msgs = ((InternalEObject)newImagePathFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			msgs = basicSetImagePathFeature(newImagePathFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, newImagePathFeature, newImagePathFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getTitleFeature() {
		return titleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleFeature(FeaturePath newTitleFeature, NotificationChain msgs) {
		FeaturePath oldTitleFeature = titleFeature;
		titleFeature = newTitleFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__TITLE_FEATURE, oldTitleFeature, newTitleFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFeature(FeaturePath newTitleFeature) {
		if (newTitleFeature != titleFeature) {
			NotificationChain msgs = null;
			if (titleFeature != null)
				msgs = ((InternalEObject)titleFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE_UNIT__TITLE_FEATURE, null, msgs);
			if (newTitleFeature != null)
				msgs = ((InternalEObject)newTitleFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.IMAGE_UNIT__TITLE_FEATURE, null, msgs);
			msgs = basicSetTitleFeature(newTitleFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__TITLE_FEATURE, newTitleFeature, newTitleFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissingImagePath() {
		return missingImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingImagePath(String newMissingImagePath) {
		String oldMissingImagePath = missingImagePath;
		missingImagePath = newMissingImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH, oldMissingImagePath, missingImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation getImageFilter() {
		if (imageFilter != null && imageFilter.eIsProxy()) {
			InternalEObject oldImageFilter = (InternalEObject)imageFilter;
			imageFilter = (ImageManipulation)eResolveProxy(oldImageFilter);
			if (imageFilter != oldImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
			}
		}
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetImageFilter() {
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageFilter(ImageManipulation newImageFilter) {
		ImageManipulation oldImageFilter = imageFilter;
		imageFilter = newImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShowTime() {
		return showTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTime(int newShowTime) {
		int oldShowTime = showTime;
		showTime = newShowTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__SHOW_TIME, oldShowTime, showTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransitionTime() {
		return transitionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTime(int newTransitionTime) {
		int oldTransitionTime = transitionTime;
		transitionTime = newTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.IMAGE_UNIT__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return basicSetImagePathFeature(null, msgs);
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
				return basicSetTitleFeature(null, msgs);
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
			case WebsitePackage.IMAGE_UNIT__SELECTION_TYPE:
				if (resolve) return getSelectionType();
				return basicGetSelectionType();
			case WebsitePackage.IMAGE_UNIT__CONTENT_TYPE:
				return getContentType();
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				if (resolve) return getDefaultSelection();
				return basicGetDefaultSelection();
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return getImagePathFeature();
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
				return getTitleFeature();
			case WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return getMissingImagePath();
			case WebsitePackage.IMAGE_UNIT__IMAGE_FILTER:
				if (resolve) return getImageFilter();
				return basicGetImageFilter();
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				return getShowTime();
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				return getTransitionTime();
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
			case WebsitePackage.IMAGE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__CONTENT_TYPE:
				getContentType().clear();
				getContentType().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
				setTitleFeature((FeaturePath)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath((String)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				setShowTime((Integer)newValue);
				return;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				setTransitionTime((Integer)newValue);
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
			case WebsitePackage.IMAGE_UNIT__SELECTION_TYPE:
				setSelectionType((EntityOrView)null);
				return;
			case WebsitePackage.IMAGE_UNIT__CONTENT_TYPE:
				getContentType().clear();
				return;
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				setDefaultSelection((Selection)null);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)null);
				return;
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
				setTitleFeature((FeaturePath)null);
				return;
			case WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath(MISSING_IMAGE_PATH_EDEFAULT);
				return;
			case WebsitePackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)null);
				return;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				setShowTime(SHOW_TIME_EDEFAULT);
				return;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				setTransitionTime(TRANSITION_TIME_EDEFAULT);
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
			case WebsitePackage.IMAGE_UNIT__SELECTION_TYPE:
				return selectionType != null;
			case WebsitePackage.IMAGE_UNIT__CONTENT_TYPE:
				return contentType != null && !contentType.isEmpty();
			case WebsitePackage.IMAGE_UNIT__DEFAULT_SELECTION:
				return defaultSelection != null;
			case WebsitePackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return imagePathFeature != null;
			case WebsitePackage.IMAGE_UNIT__TITLE_FEATURE:
				return titleFeature != null;
			case WebsitePackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return MISSING_IMAGE_PATH_EDEFAULT == null ? missingImagePath != null : !MISSING_IMAGE_PATH_EDEFAULT.equals(missingImagePath);
			case WebsitePackage.IMAGE_UNIT__IMAGE_FILTER:
				return imageFilter != null;
			case WebsitePackage.IMAGE_UNIT__SHOW_TIME:
				return showTime != SHOW_TIME_EDEFAULT;
			case WebsitePackage.IMAGE_UNIT__TRANSITION_TIME:
				return transitionTime != TRANSITION_TIME_EDEFAULT;
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
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.IMAGE_UNIT__SELECTION_TYPE: return WebsitePackage.SELECTABLE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CollectionUnit.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.IMAGE_UNIT__CONTENT_TYPE: return WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE;
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
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SELECTABLE_UNIT__SELECTION_TYPE: return WebsitePackage.IMAGE_UNIT__SELECTION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CollectionUnit.class) {
			switch (baseFeatureID) {
				case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE: return WebsitePackage.IMAGE_UNIT__CONTENT_TYPE;
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
		result.append(" (missingImagePath: ");
		result.append(missingImagePath);
		result.append(", showTime: ");
		result.append(showTime);
		result.append(", transitionTime: ");
		result.append(transitionTime);
		result.append(')');
		return result.toString();
	}

} //ImageUnitImpl
