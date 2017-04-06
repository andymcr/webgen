/**
 */
package uk.ac.man.cs.mdsd.webgen.api.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isSupportFindAll <em>Support Find All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#isSupportFindOne <em>Support Find One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl#getChildResources <em>Child Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
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
	 * The default value of the '{@link #isSupportFindAll() <em>Support Find All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFindAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORT_FIND_ALL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportFindAll() <em>Support Find All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFindAll()
	 * @generated
	 * @ordered
	 */
	protected boolean supportFindAll = SUPPORT_FIND_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSupportFindOne() <em>Support Find One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFindOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORT_FIND_ONE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSupportFindOne() <em>Support Find One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportFindOne()
	 * @generated
	 * @ordered
	 */
	protected boolean supportFindOne = SUPPORT_FIND_ONE_EDEFAULT;

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
	public boolean isSupportFindAll() {
		return supportFindAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportFindAll(boolean newSupportFindAll) {
		boolean oldSupportFindAll = supportFindAll;
		supportFindAll = newSupportFindAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__SUPPORT_FIND_ALL, oldSupportFindAll, supportFindAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSupportFindOne() {
		return supportFindOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportFindOne(boolean newSupportFindOne) {
		boolean oldSupportFindOne = supportFindOne;
		supportFindOne = newSupportFindOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiPackage.RESOURCE__SUPPORT_FIND_ONE, oldSupportFindOne, supportFindOne));
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
			case ApiPackage.RESOURCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ApiPackage.RESOURCE__SUPPORT_FIND_ALL:
				return isSupportFindAll();
			case ApiPackage.RESOURCE__SUPPORT_FIND_ONE:
				return isSupportFindOne();
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
			case ApiPackage.RESOURCE__SUPPORT_FIND_ALL:
				setSupportFindAll((Boolean)newValue);
				return;
			case ApiPackage.RESOURCE__SUPPORT_FIND_ONE:
				setSupportFindOne((Boolean)newValue);
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
			case ApiPackage.RESOURCE__SUPPORT_FIND_ALL:
				setSupportFindAll(SUPPORT_FIND_ALL_EDEFAULT);
				return;
			case ApiPackage.RESOURCE__SUPPORT_FIND_ONE:
				setSupportFindOne(SUPPORT_FIND_ONE_EDEFAULT);
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
			case ApiPackage.RESOURCE__SERVICE:
				return service != null;
			case ApiPackage.RESOURCE__SUPPORT_FIND_ALL:
				return supportFindAll != SUPPORT_FIND_ALL_EDEFAULT;
			case ApiPackage.RESOURCE__SUPPORT_FIND_ONE:
				return supportFindOne != SUPPORT_FIND_ONE_EDEFAULT;
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
		result.append(" (supportFindAll: ");
		result.append(supportFindAll);
		result.append(", supportFindOne: ");
		result.append(supportFindOne);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
