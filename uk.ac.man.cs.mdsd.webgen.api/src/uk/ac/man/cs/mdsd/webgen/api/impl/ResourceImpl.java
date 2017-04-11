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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.api.ApiPackage;
import uk.ac.man.cs.mdsd.webgen.api.Resource;

import uk.ac.man.cs.mdsd.webgen.api.ResourceSelection;
import uk.ac.man.cs.mdsd.webgen.persistence.SerializationGroup;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isEnableDefaultGetAll <em>Enable Default Get All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isEnableDefaultGetOne <em>Enable Default Get One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getGetAll <em>Get All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getGetOne <em>Get One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getDefaultSerializationGroups <em>Default Serialization Groups</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getChildResources <em>Child Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ApiPackage.Literals.RESOURCE__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

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
	 * The default value of the '{@link #isEnableDefaultGetAll() <em>Enable Default Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDefaultGetAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DEFAULT_GET_ALL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableDefaultGetAll() <em>Enable Default Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDefaultGetAll()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDefaultGetAll = ENABLE_DEFAULT_GET_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableDefaultGetOne() <em>Enable Default Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDefaultGetOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DEFAULT_GET_ONE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableDefaultGetOne() <em>Enable Default Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDefaultGetOne()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDefaultGetOne = ENABLE_DEFAULT_GET_ONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetAll() <em>Get All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAll()
	 * @generated
	 * @ordered
	 */
	protected Selection getAll;

	/**
	 * The cached value of the '{@link #getGetOne() <em>Get One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetOne()
	 * @generated
	 * @ordered
	 */
	protected Selection getOne;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceSelection> selections;

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
	 * The cached value of the '{@link #getChildResources() <em>Child Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> childResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApiPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParentResource() {
		if (eContainerFeatureID() != ApiPackage.RESOURCE__PARENT_RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentResource(Resource newParentResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentResource, ApiPackage.RESOURCE__PARENT_RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentResource(Resource newParentResource) {
		if (newParentResource != eInternalContainer() || (eContainerFeatureID() != ApiPackage.RESOURCE__PARENT_RESOURCE && newParentResource != null)) {
			if (EcoreUtil.isAncestor(this, newParentResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentResource != null)
				msgs = ((InternalEObject)newParentResource).eInverseAdd(this, ApiPackage.RESOURCE__CHILD_RESOURCES, Resource.class, msgs);
			msgs = basicSetParentResource(newParentResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__PARENT_RESOURCE, newParentResource, newParentResource));
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
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiPackage.RESOURCE__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__SERVICE, oldService, service));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableDefaultGetAll() {
		return enableDefaultGetAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableDefaultGetAll(boolean newEnableDefaultGetAll) {
		boolean oldEnableDefaultGetAll = enableDefaultGetAll;
		enableDefaultGetAll = newEnableDefaultGetAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL, oldEnableDefaultGetAll, enableDefaultGetAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableDefaultGetOne() {
		return enableDefaultGetOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableDefaultGetOne(boolean newEnableDefaultGetOne) {
		boolean oldEnableDefaultGetOne = enableDefaultGetOne;
		enableDefaultGetOne = newEnableDefaultGetOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE, oldEnableDefaultGetOne, enableDefaultGetOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getGetAll() {
		if (getAll != null && getAll.eIsProxy()) {
			InternalEObject oldGetAll = (InternalEObject)getAll;
			getAll = (Selection)eResolveProxy(oldGetAll);
			if (getAll != oldGetAll) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiPackage.RESOURCE__GET_ALL, oldGetAll, getAll));
			}
		}
		return getAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetGetAll() {
		return getAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAll(Selection newGetAll) {
		Selection oldGetAll = getAll;
		getAll = newGetAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__GET_ALL, oldGetAll, getAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getGetOne() {
		if (getOne != null && getOne.eIsProxy()) {
			InternalEObject oldGetOne = (InternalEObject)getOne;
			getOne = (Selection)eResolveProxy(oldGetOne);
			if (getOne != oldGetOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiPackage.RESOURCE__GET_ONE, oldGetOne, getOne));
			}
		}
		return getOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetGetOne() {
		return getOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetOne(Selection newGetOne) {
		Selection oldGetOne = getOne;
		getOne = newGetOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__GET_ONE, oldGetOne, getOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceSelection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentWithInverseEList<ResourceSelection>(ResourceSelection.class, this, ApiPackage.RESOURCE__SELECTIONS, ApiPackage.RESOURCE_SELECTION__PARENT_RESOURCE);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializationGroup> getDefaultSerializationGroups() {
		if (defaultSerializationGroups == null) {
			defaultSerializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, ApiPackage.RESOURCE__DEFAULT_SERIALIZATION_GROUPS);
		}
		return defaultSerializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getChildResources() {
		if (childResources == null) {
			childResources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, ApiPackage.RESOURCE__CHILD_RESOURCES, ApiPackage.RESOURCE__PARENT_RESOURCE);
		}
		return childResources;
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentResource((Resource)otherEnd, msgs);
			case ApiPackage.RESOURCE__SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelections()).basicAdd(otherEnd, msgs);
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildResources()).basicAdd(otherEnd, msgs);
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				return basicSetParentResource(null, msgs);
			case ApiPackage.RESOURCE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				return ((InternalEList<?>)getChildResources()).basicRemove(otherEnd, msgs);
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				return eInternalContainer().eInverseRemove(this, ApiPackage.RESOURCE__CHILD_RESOURCES, Resource.class, msgs);
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				return getParentResource();
			case ApiPackage.RESOURCE__NAME:
				return getName();
			case ApiPackage.RESOURCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ApiPackage.RESOURCE__URI_ELEMENT:
				return getUriElement();
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL:
				return isEnableDefaultGetAll();
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE:
				return isEnableDefaultGetOne();
			case ApiPackage.RESOURCE__GET_ALL:
				if (resolve) return getGetAll();
				return basicGetGetAll();
			case ApiPackage.RESOURCE__GET_ONE:
				if (resolve) return getGetOne();
				return basicGetGetOne();
			case ApiPackage.RESOURCE__SELECTIONS:
				return getSelections();
			case ApiPackage.RESOURCE__DEFAULT_SERIALIZATION_GROUPS:
				return getDefaultSerializationGroups();
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				return getChildResources();
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				setParentResource((Resource)newValue);
				return;
			case ApiPackage.RESOURCE__SERVICE:
				setService((Service)newValue);
				return;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL:
				setEnableDefaultGetAll((Boolean)newValue);
				return;
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE:
				setEnableDefaultGetOne((Boolean)newValue);
				return;
			case ApiPackage.RESOURCE__GET_ALL:
				setGetAll((Selection)newValue);
				return;
			case ApiPackage.RESOURCE__GET_ONE:
				setGetOne((Selection)newValue);
				return;
			case ApiPackage.RESOURCE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends ResourceSelection>)newValue);
				return;
			case ApiPackage.RESOURCE__DEFAULT_SERIALIZATION_GROUPS:
				getDefaultSerializationGroups().clear();
				getDefaultSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
				return;
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				getChildResources().clear();
				getChildResources().addAll((Collection<? extends Resource>)newValue);
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				setParentResource((Resource)null);
				return;
			case ApiPackage.RESOURCE__SERVICE:
				setService((Service)null);
				return;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL:
				setEnableDefaultGetAll(ENABLE_DEFAULT_GET_ALL_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE:
				setEnableDefaultGetOne(ENABLE_DEFAULT_GET_ONE_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__GET_ALL:
				setGetAll((Selection)null);
				return;
			case ApiPackage.RESOURCE__GET_ONE:
				setGetOne((Selection)null);
				return;
			case ApiPackage.RESOURCE__SELECTIONS:
				getSelections().clear();
				return;
			case ApiPackage.RESOURCE__DEFAULT_SERIALIZATION_GROUPS:
				getDefaultSerializationGroups().clear();
				return;
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				getChildResources().clear();
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
			case ApiPackage.RESOURCE__PARENT_RESOURCE:
				return getParentResource() != null;
			case ApiPackage.RESOURCE__NAME:
				return isSetName();
			case ApiPackage.RESOURCE__SERVICE:
				return service != null;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ALL:
				return enableDefaultGetAll != ENABLE_DEFAULT_GET_ALL_EDEFAULT;
			case ApiPackage.RESOURCE__ENABLE_DEFAULT_GET_ONE:
				return enableDefaultGetOne != ENABLE_DEFAULT_GET_ONE_EDEFAULT;
			case ApiPackage.RESOURCE__GET_ALL:
				return getAll != null;
			case ApiPackage.RESOURCE__GET_ONE:
				return getOne != null;
			case ApiPackage.RESOURCE__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case ApiPackage.RESOURCE__DEFAULT_SERIALIZATION_GROUPS:
				return defaultSerializationGroups != null && !defaultSerializationGroups.isEmpty();
			case ApiPackage.RESOURCE__CHILD_RESOURCES:
				return childResources != null && !childResources.isEmpty();
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
		result.append(", enableDefaultGetAll: ");
		result.append(enableDefaultGetAll);
		result.append(", enableDefaultGetOne: ");
		result.append(enableDefaultGetOne);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
