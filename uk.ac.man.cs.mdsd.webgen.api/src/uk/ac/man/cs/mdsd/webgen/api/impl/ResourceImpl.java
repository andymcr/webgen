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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.api.ApiPackage;
import uk.ac.man.cs.mdsd.webgen.api.Resource;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isSupportGetAll <em>Support Get All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isSupportGetOne <em>Support Get One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getSelections <em>Selections</em>}</li>
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
	 * The default value of the '{@link #isSupportGetAll() <em>Support Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportGetAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORT_GET_ALL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportGetAll() <em>Support Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportGetAll()
	 * @generated
	 * @ordered
	 */
	protected boolean supportGetAll = SUPPORT_GET_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportGetOne() <em>Support Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportGetOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORT_GET_ONE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportGetOne() <em>Support Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportGetOne()
	 * @generated
	 * @ordered
	 */
	protected boolean supportGetOne = SUPPORT_GET_ONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

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
	public boolean isSupportGetAll() {
		return supportGetAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportGetAll(boolean newSupportGetAll) {
		boolean oldSupportGetAll = supportGetAll;
		supportGetAll = newSupportGetAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__SUPPORT_GET_ALL, oldSupportGetAll, supportGetAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportGetOne() {
		return supportGetOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportGetOne(boolean newSupportGetOne) {
		boolean oldSupportGetOne = supportGetOne;
		supportGetOne = newSupportGetOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__SUPPORT_GET_ONE, oldSupportGetOne, supportGetOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectResolvingEList<Selection>(Selection.class, this, ApiPackage.RESOURCE__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getChildResources() {
		if (childResources == null) {
			childResources = new EObjectContainmentEList<Resource>(Resource.class, this, ApiPackage.RESOURCE__CHILD_RESOURCES);
		}
		return childResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApiPackage.RESOURCE__NAME:
				return getName();
			case ApiPackage.RESOURCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ApiPackage.RESOURCE__URI_ELEMENT:
				return getUriElement();
			case ApiPackage.RESOURCE__SUPPORT_GET_ALL:
				return isSupportGetAll();
			case ApiPackage.RESOURCE__SUPPORT_GET_ONE:
				return isSupportGetOne();
			case ApiPackage.RESOURCE__SELECTIONS:
				return getSelections();
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
			case ApiPackage.RESOURCE__SERVICE:
				setService((Service)newValue);
				return;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case ApiPackage.RESOURCE__SUPPORT_GET_ALL:
				setSupportGetAll((Boolean)newValue);
				return;
			case ApiPackage.RESOURCE__SUPPORT_GET_ONE:
				setSupportGetOne((Boolean)newValue);
				return;
			case ApiPackage.RESOURCE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
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
			case ApiPackage.RESOURCE__SERVICE:
				setService((Service)null);
				return;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__SUPPORT_GET_ALL:
				setSupportGetAll(SUPPORT_GET_ALL_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__SUPPORT_GET_ONE:
				setSupportGetOne(SUPPORT_GET_ONE_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__SELECTIONS:
				getSelections().clear();
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
			case ApiPackage.RESOURCE__NAME:
				return isSetName();
			case ApiPackage.RESOURCE__SERVICE:
				return service != null;
			case ApiPackage.RESOURCE__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case ApiPackage.RESOURCE__SUPPORT_GET_ALL:
				return supportGetAll != SUPPORT_GET_ALL_EDEFAULT;
			case ApiPackage.RESOURCE__SUPPORT_GET_ONE:
				return supportGetOne != SUPPORT_GET_ONE_EDEFAULT;
			case ApiPackage.RESOURCE__SELECTIONS:
				return selections != null && !selections.isEmpty();
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
		result.append(", supportGetAll: ");
		result.append(supportGetAll);
		result.append(", supportGetOne: ");
		result.append(supportGetOne);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
