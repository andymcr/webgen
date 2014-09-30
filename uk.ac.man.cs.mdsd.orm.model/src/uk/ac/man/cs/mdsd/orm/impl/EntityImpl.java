/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.16 2013/07/02 22:59:44 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.orm.Entity;
import uk.ac.man.cs.mdsd.orm.Feature;
import uk.ac.man.cs.mdsd.orm.OrmModel;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getDisplayFeatures <em>Display Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.EntityImpl#getDisplayFormat <em>Display Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ClassifierImpl implements Entity {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> contains;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected Entity container;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getDisplayFeatures() <em>Display Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> displayFeatures;

	/**
	 * The default value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayFormat() <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFormat()
	 * @generated
	 * @ordered
	 */
	protected String displayFormat = DISPLAY_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModel getPartOf() {
		if (eContainerFeatureID() != OrmPackage.ENTITY__PART_OF) return null;
		return (OrmModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(OrmModel newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, OrmPackage.ENTITY__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(OrmModel newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ENTITY__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, OrmPackage.ORM_MODEL__ENTITIES, OrmModel.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Entity>(Entity.class, this, OrmPackage.ENTITY__CONTAINS, OrmPackage.ENTITY__CONTAINER);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (Entity)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ENTITY__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Entity newContainer, NotificationChain msgs) {
		Entity oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Entity newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, OrmPackage.ENTITY__CONTAINS, Entity.class, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, OrmPackage.ENTITY__CONTAINS, Entity.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, OrmPackage.ENTITY__FEATURES, OrmPackage.FEATURE__PARENT_ENTITY);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDisplayFeatures() {
		if (displayFeatures == null) {
			displayFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, OrmPackage.ENTITY__DISPLAY_FEATURES);
		}
		return displayFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayFormat() {
		return displayFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFormat(String newDisplayFormat) {
		String oldDisplayFormat = displayFormat;
		displayFormat = newDisplayFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISPLAY_FORMAT, oldDisplayFormat, displayFormat));
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
			case OrmPackage.ENTITY__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((OrmModel)otherEnd, msgs);
			case OrmPackage.ENTITY__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case OrmPackage.ENTITY__CONTAINER:
				if (container != null)
					msgs = ((InternalEObject)container).eInverseRemove(this, OrmPackage.ENTITY__CONTAINS, Entity.class, msgs);
				return basicSetContainer((Entity)otherEnd, msgs);
			case OrmPackage.ENTITY__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case OrmPackage.ENTITY__PART_OF:
				return basicSetPartOf(null, msgs);
			case OrmPackage.ENTITY__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__CONTAINER:
				return basicSetContainer(null, msgs);
			case OrmPackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ENTITY__PART_OF:
				return eInternalContainer().eInverseRemove(this, OrmPackage.ORM_MODEL__ENTITIES, OrmModel.class, msgs);
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
			case OrmPackage.ENTITY__PART_OF:
				return getPartOf();
			case OrmPackage.ENTITY__CONTAINS:
				return getContains();
			case OrmPackage.ENTITY__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case OrmPackage.ENTITY__FEATURES:
				return getFeatures();
			case OrmPackage.ENTITY__DISPLAY_FEATURES:
				return getDisplayFeatures();
			case OrmPackage.ENTITY__DISPLAY_FORMAT:
				return getDisplayFormat();
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
			case OrmPackage.ENTITY__PART_OF:
				setPartOf((OrmModel)newValue);
				return;
			case OrmPackage.ENTITY__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Entity>)newValue);
				return;
			case OrmPackage.ENTITY__CONTAINER:
				setContainer((Entity)newValue);
				return;
			case OrmPackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case OrmPackage.ENTITY__DISPLAY_FEATURES:
				getDisplayFeatures().clear();
				getDisplayFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case OrmPackage.ENTITY__DISPLAY_FORMAT:
				setDisplayFormat((String)newValue);
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
			case OrmPackage.ENTITY__PART_OF:
				setPartOf((OrmModel)null);
				return;
			case OrmPackage.ENTITY__CONTAINS:
				getContains().clear();
				return;
			case OrmPackage.ENTITY__CONTAINER:
				setContainer((Entity)null);
				return;
			case OrmPackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case OrmPackage.ENTITY__DISPLAY_FEATURES:
				getDisplayFeatures().clear();
				return;
			case OrmPackage.ENTITY__DISPLAY_FORMAT:
				setDisplayFormat(DISPLAY_FORMAT_EDEFAULT);
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
			case OrmPackage.ENTITY__PART_OF:
				return getPartOf() != null;
			case OrmPackage.ENTITY__CONTAINS:
				return contains != null && !contains.isEmpty();
			case OrmPackage.ENTITY__CONTAINER:
				return container != null;
			case OrmPackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case OrmPackage.ENTITY__DISPLAY_FEATURES:
				return displayFeatures != null && !displayFeatures.isEmpty();
			case OrmPackage.ENTITY__DISPLAY_FORMAT:
				return DISPLAY_FORMAT_EDEFAULT == null ? displayFormat != null : !DISPLAY_FORMAT_EDEFAULT.equals(displayFormat);
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
		result.append(" (displayFormat: ");
		result.append(displayFormat);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
