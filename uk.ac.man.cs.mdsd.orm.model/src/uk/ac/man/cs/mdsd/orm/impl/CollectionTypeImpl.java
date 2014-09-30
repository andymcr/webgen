/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionTypeImpl.java,v 1.4 2011/03/23 13:05:50 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.Classifier;
import uk.ac.man.cs.mdsd.orm.CollectionType;
import uk.ac.man.cs.mdsd.orm.CollectionTypes;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl#getJavaInterfaceType <em>Java Interface Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.impl.CollectionTypeImpl#getJavaImplementationType <em>Java Implementation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionTypeImpl extends NamedElementImpl implements CollectionType {
	/**
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionTypes COLLECTION_TYPE_EDEFAULT = CollectionTypes.BAG;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected CollectionTypes collectionType = COLLECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Classifier elementType;

	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected String persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaInterfaceType() <em>Java Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_INTERFACE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaInterfaceType() <em>Java Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected String javaInterfaceType = JAVA_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaImplementationType() <em>Java Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaImplementationType()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_IMPLEMENTATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaImplementationType() <em>Java Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaImplementationType()
	 * @generated
	 * @ordered
	 */
	protected String javaImplementationType = JAVA_IMPLEMENTATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypes getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(CollectionTypes newCollectionType) {
		CollectionTypes oldCollectionType = collectionType;
		collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_TYPE__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (Classifier)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Classifier newElementType) {
		Classifier oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(String newPersistenceType) {
		String oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_TYPE__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaInterfaceType() {
		return javaInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaInterfaceType(String newJavaInterfaceType) {
		String oldJavaInterfaceType = javaInterfaceType;
		javaInterfaceType = newJavaInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_TYPE__JAVA_INTERFACE_TYPE, oldJavaInterfaceType, javaInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaImplementationType() {
		return javaImplementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaImplementationType(String newJavaImplementationType) {
		String oldJavaImplementationType = javaImplementationType;
		javaImplementationType = newJavaImplementationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE, oldJavaImplementationType, javaImplementationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.COLLECTION_TYPE__COLLECTION_TYPE:
				return getCollectionType();
			case OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
			case OrmPackage.COLLECTION_TYPE__PERSISTENCE_TYPE:
				return getPersistenceType();
			case OrmPackage.COLLECTION_TYPE__JAVA_INTERFACE_TYPE:
				return getJavaInterfaceType();
			case OrmPackage.COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE:
				return getJavaImplementationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.COLLECTION_TYPE__COLLECTION_TYPE:
				setCollectionType((CollectionTypes)newValue);
				return;
			case OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE:
				setElementType((Classifier)newValue);
				return;
			case OrmPackage.COLLECTION_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((String)newValue);
				return;
			case OrmPackage.COLLECTION_TYPE__JAVA_INTERFACE_TYPE:
				setJavaInterfaceType((String)newValue);
				return;
			case OrmPackage.COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE:
				setJavaImplementationType((String)newValue);
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
			case OrmPackage.COLLECTION_TYPE__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE:
				setElementType((Classifier)null);
				return;
			case OrmPackage.COLLECTION_TYPE__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case OrmPackage.COLLECTION_TYPE__JAVA_INTERFACE_TYPE:
				setJavaInterfaceType(JAVA_INTERFACE_TYPE_EDEFAULT);
				return;
			case OrmPackage.COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE:
				setJavaImplementationType(JAVA_IMPLEMENTATION_TYPE_EDEFAULT);
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
			case OrmPackage.COLLECTION_TYPE__COLLECTION_TYPE:
				return collectionType != COLLECTION_TYPE_EDEFAULT;
			case OrmPackage.COLLECTION_TYPE__ELEMENT_TYPE:
				return elementType != null;
			case OrmPackage.COLLECTION_TYPE__PERSISTENCE_TYPE:
				return PERSISTENCE_TYPE_EDEFAULT == null ? persistenceType != null : !PERSISTENCE_TYPE_EDEFAULT.equals(persistenceType);
			case OrmPackage.COLLECTION_TYPE__JAVA_INTERFACE_TYPE:
				return JAVA_INTERFACE_TYPE_EDEFAULT == null ? javaInterfaceType != null : !JAVA_INTERFACE_TYPE_EDEFAULT.equals(javaInterfaceType);
			case OrmPackage.COLLECTION_TYPE__JAVA_IMPLEMENTATION_TYPE:
				return JAVA_IMPLEMENTATION_TYPE_EDEFAULT == null ? javaImplementationType != null : !JAVA_IMPLEMENTATION_TYPE_EDEFAULT.equals(javaImplementationType);
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
		result.append(" (collectionType: ");
		result.append(collectionType);
		result.append(", persistenceType: ");
		result.append(persistenceType);
		result.append(", javaInterfaceType: ");
		result.append(javaInterfaceType);
		result.append(", javaImplementationType: ");
		result.append(javaImplementationType);
		result.append(')');
		return result.toString();
	}

} //CollectionTypeImpl
