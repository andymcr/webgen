/**
 */
package uk.ac.man.cs.mdsd.webgen.service.impl;

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

import uk.ac.man.cs.mdsd.webgen.base.impl.NamedElementImpl;

import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;

import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.service.Constant;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getServes <em>Serves</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getFindAll <em>Find All</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getFindOne <em>Find One</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.service.impl.ServiceImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getServes() <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServes()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView serves;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

	/**
	 * The cached value of the '{@link #getFindAll() <em>Find All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindAll()
	 * @generated
	 * @ordered
	 */
	protected Selection findAll;

	/**
	 * The cached value of the '{@link #getFindOne() <em>Find One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindOne()
	 * @generated
	 * @ordered
	 */
	protected Selection findOne;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessOperation> operations;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentWithInverseEList<Constant>(Constant.class, this, ServicePackage.SERVICE__CONSTANTS, ServicePackage.CONSTANT__DEFINED_BY);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getServes() {
		if (serves != null && serves.eIsProxy()) {
			InternalEObject oldServes = (InternalEObject)serves;
			serves = (EntityOrView)eResolveProxy(oldServes);
			if (serves != oldServes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__SERVES, oldServes, serves));
			}
		}
		return serves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetServes() {
		return serves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServes(EntityOrView newServes) {
		EntityOrView oldServes = serves;
		serves = newServes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SERVES, oldServes, serves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentWithInverseEList<Selection>(Selection.class, this, ServicePackage.SERVICE__SELECTIONS, ServicePackage.SELECTION__USED_BY);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getFindAll() {
		if (findAll != null && findAll.eIsProxy()) {
			InternalEObject oldFindAll = (InternalEObject)findAll;
			findAll = (Selection)eResolveProxy(oldFindAll);
			if (findAll != oldFindAll) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__FIND_ALL, oldFindAll, findAll));
			}
		}
		return findAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindAll() {
		return findAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindAll(Selection newFindAll) {
		Selection oldFindAll = findAll;
		findAll = newFindAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__FIND_ALL, oldFindAll, findAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getFindOne() {
		if (findOne != null && findOne.eIsProxy()) {
			InternalEObject oldFindOne = (InternalEObject)findOne;
			findOne = (Selection)eResolveProxy(oldFindOne);
			if (findOne != oldFindOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE__FIND_ONE, oldFindOne, findOne));
			}
		}
		return findOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindOne() {
		return findOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindOne(Selection newFindOne) {
		Selection oldFindOne = findOne;
		findOne = newFindOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__FIND_ONE, oldFindOne, findOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<BusinessOperation>(BusinessOperation.class, this, ServicePackage.SERVICE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.SERVICE__USES);
		}
		return uses;
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
			case ServicePackage.SERVICE__CONSTANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstants()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE__SELECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelections()).basicAdd(otherEnd, msgs);
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
			case ServicePackage.SERVICE__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE__CONSTANTS:
				return getConstants();
			case ServicePackage.SERVICE__SERVES:
				if (resolve) return getServes();
				return basicGetServes();
			case ServicePackage.SERVICE__SELECTIONS:
				return getSelections();
			case ServicePackage.SERVICE__FIND_ALL:
				if (resolve) return getFindAll();
				return basicGetFindAll();
			case ServicePackage.SERVICE__FIND_ONE:
				if (resolve) return getFindOne();
				return basicGetFindOne();
			case ServicePackage.SERVICE__OPERATIONS:
				return getOperations();
			case ServicePackage.SERVICE__USES:
				return getUses();
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
			case ServicePackage.SERVICE__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case ServicePackage.SERVICE__SERVES:
				setServes((EntityOrView)newValue);
				return;
			case ServicePackage.SERVICE__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case ServicePackage.SERVICE__FIND_ALL:
				setFindAll((Selection)newValue);
				return;
			case ServicePackage.SERVICE__FIND_ONE:
				setFindOne((Selection)newValue);
				return;
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BusinessOperation>)newValue);
				return;
			case ServicePackage.SERVICE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Service>)newValue);
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
			case ServicePackage.SERVICE__CONSTANTS:
				getConstants().clear();
				return;
			case ServicePackage.SERVICE__SERVES:
				setServes((EntityOrView)null);
				return;
			case ServicePackage.SERVICE__SELECTIONS:
				getSelections().clear();
				return;
			case ServicePackage.SERVICE__FIND_ALL:
				setFindAll((Selection)null);
				return;
			case ServicePackage.SERVICE__FIND_ONE:
				setFindOne((Selection)null);
				return;
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.SERVICE__USES:
				getUses().clear();
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
			case ServicePackage.SERVICE__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case ServicePackage.SERVICE__SERVES:
				return serves != null;
			case ServicePackage.SERVICE__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case ServicePackage.SERVICE__FIND_ALL:
				return findAll != null;
			case ServicePackage.SERVICE__FIND_ONE:
				return findOne != null;
			case ServicePackage.SERVICE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.SERVICE__USES:
				return uses != null && !uses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
