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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.QueryActual;
import uk.ac.man.cs.mdsd.webgen.website.QueryInstance;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.QueryInstanceImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.QueryInstanceImpl#getActuals <em>Actuals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryInstanceImpl extends EObjectImpl implements QueryInstance {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * The cached value of the '{@link #getActuals() <em>Actuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuals()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryActual> actuals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.QUERY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (Query)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.QUERY_INSTANCE__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.QUERY_INSTANCE__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QueryActual> getActuals() {
		if (actuals == null) {
			actuals = new EObjectContainmentEList<QueryActual>(QueryActual.class, this, WebsitePackage.QUERY_INSTANCE__ACTUALS);
		}
		return actuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.QUERY_INSTANCE__ACTUALS:
				return ((InternalEList<?>)getActuals()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.QUERY_INSTANCE__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
			case WebsitePackage.QUERY_INSTANCE__ACTUALS:
				return getActuals();
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
			case WebsitePackage.QUERY_INSTANCE__QUERY:
				setQuery((Query)newValue);
				return;
			case WebsitePackage.QUERY_INSTANCE__ACTUALS:
				getActuals().clear();
				getActuals().addAll((Collection<? extends QueryActual>)newValue);
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
			case WebsitePackage.QUERY_INSTANCE__QUERY:
				setQuery((Query)null);
				return;
			case WebsitePackage.QUERY_INSTANCE__ACTUALS:
				getActuals().clear();
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
			case WebsitePackage.QUERY_INSTANCE__QUERY:
				return query != null;
			case WebsitePackage.QUERY_INSTANCE__ACTUALS:
				return actuals != null && !actuals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryInstanceImpl
