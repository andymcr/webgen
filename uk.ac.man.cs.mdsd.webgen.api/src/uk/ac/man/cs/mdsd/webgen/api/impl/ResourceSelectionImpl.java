/**
 */
package uk.ac.man.cs.mdsd.webgen.api.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.webgen.api.ApiPackage;
import uk.ac.man.cs.mdsd.webgen.api.Resource;
import uk.ac.man.cs.mdsd.webgen.api.ResourceSelection;

import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;

import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl#getDefaultSerializationGroups <em>Default Serialization Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceSelectionImpl extends MinimalEObjectImpl.Container implements ResourceSelection {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ApiPackage.Literals.RESOURCE_SELECTION__NAME).getSettingDelegate();

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
	 * The cached value of the '{@link #getDefaultSerializationGroups() <em>Default Serialization Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializationGroup> defaultSerializationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApiPackage.Literals.RESOURCE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParentResource() {
		if (eContainerFeatureID() != ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResource(Resource newParentResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResource, ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResource(Resource newParentResource) {
		if (newParentResource != eInternalContainer() || (eContainerFeatureID() != ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE && newParentResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResource != null)
				msgs = ((InternalEObject)newParentResource).eInverseAdd(this, ApiPackage.RESOURCE__SELECTIONS, Resource.class, msgs);
			msgs = basicSetParentResource(newParentResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE, newParentResource, newParentResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiPackage.RESOURCE_SELECTION__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE_SELECTION__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE_SELECTION__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getDefaultSerializationGroups() {
		if (defaultSerializationGroups == null) {
			defaultSerializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, ApiPackage.RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS);
		}
		return defaultSerializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResource((Resource)otherEnd, msgs);
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				return basicSetParentResource(null, msgs);
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				return eInternalContainer().eInverseRemove(this, ApiPackage.RESOURCE__SELECTIONS, Resource.class, msgs);
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				return getParentResource();
			case ApiPackage.RESOURCE_SELECTION__NAME:
				return getName();
			case ApiPackage.RESOURCE_SELECTION__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case ApiPackage.RESOURCE_SELECTION__URI_ELEMENT:
				return getUriElement();
			case ApiPackage.RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS:
				return getDefaultSerializationGroups();
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				setParentResource((Resource)newValue);
				return;
			case ApiPackage.RESOURCE_SELECTION__SELECTION:
				setSelection((Selection)newValue);
				return;
			case ApiPackage.RESOURCE_SELECTION__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case ApiPackage.RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS:
				getDefaultSerializationGroups().clear();
				getDefaultSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				setParentResource((Resource)null);
				return;
			case ApiPackage.RESOURCE_SELECTION__SELECTION:
				setSelection((Selection)null);
				return;
			case ApiPackage.RESOURCE_SELECTION__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case ApiPackage.RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS:
				getDefaultSerializationGroups().clear();
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
			case ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE:
				return getParentResource() != null;
			case ApiPackage.RESOURCE_SELECTION__NAME:
				return isSetName();
			case ApiPackage.RESOURCE_SELECTION__SELECTION:
				return selection != null;
			case ApiPackage.RESOURCE_SELECTION__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case ApiPackage.RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS:
				return defaultSerializationGroups != null && !defaultSerializationGroups.isEmpty();
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
		result.append(" (uriElement: ");
		result.append(uriElement);
		result.append(')');
		return result.toString();
	}

} //ResourceSelectionImpl
