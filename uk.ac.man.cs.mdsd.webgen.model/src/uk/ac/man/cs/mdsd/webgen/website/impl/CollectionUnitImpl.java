/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.man.cs.mdsd.webgen.website.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getContainingFeature <em>Containing Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollectionUnitImpl extends SelectableUnitImpl implements CollectionUnit {
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
	 * The cached value of the '{@link #getContainingFeature() <em>Containing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature containingFeature;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.COLLECTION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityOrView> getContentType() {
		if (contentType == null) {
			contentType = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE);
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getContainingFeature() {
		if (containingFeature != null && containingFeature.eIsProxy()) {
			InternalEObject oldContainingFeature = (InternalEObject)containingFeature;
			containingFeature = (Feature)eResolveProxy(oldContainingFeature);
			if (containingFeature != oldContainingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
			}
		}
		return containingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetContainingFeature() {
		return containingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingFeature(Feature newContainingFeature) {
		Feature oldContainingFeature = containingFeature;
		containingFeature = newContainingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE, oldContainingFeature, containingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.COLLECTION_UNIT__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE:
				return getContentType();
			case WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE:
				if (resolve) return getContainingFeature();
				return basicGetContainingFeature();
			case WebsitePackage.COLLECTION_UNIT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE:
				getContentType().clear();
				getContentType().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE:
				setContainingFeature((Feature)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__SELECTION:
				setSelection((Selection)newValue);
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
			case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE:
				getContentType().clear();
				return;
			case WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE:
				setContainingFeature((Feature)null);
				return;
			case WebsitePackage.COLLECTION_UNIT__SELECTION:
				setSelection((Selection)null);
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
			case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE:
				return contentType != null && !contentType.isEmpty();
			case WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE:
				return containingFeature != null;
			case WebsitePackage.COLLECTION_UNIT__SELECTION:
				return selection != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionUnitImpl
