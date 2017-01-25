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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.website.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getPagination <em>Pagination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.CollectionUnitImpl#getLastPageLabel <em>Last Page Label</em>}</li>
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
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The default value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected String emptyMessage = EMPTY_MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPagination() <em>Pagination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagination()
	 * @generated
	 * @ordered
	 */
	protected Filter pagination;

	/**
	 * The default value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_PAGINATION_SIZE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultPaginationSize = DEFAULT_PAGINATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_NPAGES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected int nextNpages = NEXT_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int PREVIOUS_NPAGES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected int previousNpages = PREVIOUS_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_LABEL_EDEFAULT = "&gt;";

	/**
	 * The cached value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String nextPageLabel = NEXT_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_PAGE_LABEL_EDEFAULT = "&lt;";

	/**
	 * The cached value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String previousPageLabel = PREVIOUS_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DISABLED_PAGE_LINKS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useDisabledPageLinks = USE_DISABLED_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FIRST_LAST_PAGE_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useFirstLastPageLinks = USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_LABEL_EDEFAULT = "<<";

	/**
	 * The cached value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String firstPageLabel = FIRST_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_LABEL_EDEFAULT = ">>";

	/**
	 * The cached value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String lastPageLabel = LAST_PAGE_LABEL_EDEFAULT;

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
	public List<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, WebsitePackage.COLLECTION_UNIT__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmptyMessage() {
		return emptyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyMessage(String newEmptyMessage) {
		String oldEmptyMessage = emptyMessage;
		emptyMessage = newEmptyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__EMPTY_MESSAGE, oldEmptyMessage, emptyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter getPagination() {
		if (pagination != null && pagination.eIsProxy()) {
			InternalEObject oldPagination = (InternalEObject)pagination;
			pagination = (Filter)eResolveProxy(oldPagination);
			if (pagination != oldPagination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.COLLECTION_UNIT__PAGINATION, oldPagination, pagination));
			}
		}
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter basicGetPagination() {
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagination(Filter newPagination) {
		Filter oldPagination = pagination;
		pagination = newPagination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__PAGINATION, oldPagination, pagination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultPaginationSize() {
		return defaultPaginationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPaginationSize(int newDefaultPaginationSize) {
		int oldDefaultPaginationSize = defaultPaginationSize;
		defaultPaginationSize = newDefaultPaginationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE, oldDefaultPaginationSize, defaultPaginationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextNpages() {
		return nextNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextNpages(int newNextNpages) {
		int oldNextNpages = nextNpages;
		nextNpages = newNextNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__NEXT_NPAGES, oldNextNpages, nextNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPreviousNpages() {
		return previousNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousNpages(int newPreviousNpages) {
		int oldPreviousNpages = previousNpages;
		previousNpages = newPreviousNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__PREVIOUS_NPAGES, oldPreviousNpages, previousNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextPageLabel() {
		return nextPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPageLabel(String newNextPageLabel) {
		String oldNextPageLabel = nextPageLabel;
		nextPageLabel = newNextPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__NEXT_PAGE_LABEL, oldNextPageLabel, nextPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousPageLabel() {
		return previousPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPageLabel(String newPreviousPageLabel) {
		String oldPreviousPageLabel = previousPageLabel;
		previousPageLabel = newPreviousPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL, oldPreviousPageLabel, previousPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDisabledPageLinks() {
		return useDisabledPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDisabledPageLinks(boolean newUseDisabledPageLinks) {
		boolean oldUseDisabledPageLinks = useDisabledPageLinks;
		useDisabledPageLinks = newUseDisabledPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS, oldUseDisabledPageLinks, useDisabledPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFirstLastPageLinks() {
		return useFirstLastPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFirstLastPageLinks(boolean newUseFirstLastPageLinks) {
		boolean oldUseFirstLastPageLinks = useFirstLastPageLinks;
		useFirstLastPageLinks = newUseFirstLastPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS, oldUseFirstLastPageLinks, useFirstLastPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstPageLabel() {
		return firstPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPageLabel(String newFirstPageLabel) {
		String oldFirstPageLabel = firstPageLabel;
		firstPageLabel = newFirstPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__FIRST_PAGE_LABEL, oldFirstPageLabel, firstPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastPageLabel() {
		return lastPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPageLabel(String newLastPageLabel) {
		String oldLastPageLabel = lastPageLabel;
		lastPageLabel = newLastPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.COLLECTION_UNIT__LAST_PAGE_LABEL, oldLastPageLabel, lastPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.COLLECTION_UNIT__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.COLLECTION_UNIT__CONTENT_TYPE:
				return getContentType();
			case WebsitePackage.COLLECTION_UNIT__CONTAINING_FEATURE:
				if (resolve) return getContainingFeature();
				return basicGetContainingFeature();
			case WebsitePackage.COLLECTION_UNIT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebsitePackage.COLLECTION_UNIT__FILTERS:
				return getFilters();
			case WebsitePackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return getEmptyMessage();
			case WebsitePackage.COLLECTION_UNIT__PAGINATION:
				if (resolve) return getPagination();
				return basicGetPagination();
			case WebsitePackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return getDefaultPaginationSize();
			case WebsitePackage.COLLECTION_UNIT__NEXT_NPAGES:
				return getNextNpages();
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				return getPreviousNpages();
			case WebsitePackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				return getNextPageLabel();
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				return getPreviousPageLabel();
			case WebsitePackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				return isUseDisabledPageLinks();
			case WebsitePackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return isUseFirstLastPageLinks();
			case WebsitePackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				return getFirstPageLabel();
			case WebsitePackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				return getLastPageLabel();
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
			case WebsitePackage.COLLECTION_UNIT__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage((String)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__PAGINATION:
				setPagination((Filter)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize((Integer)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__NEXT_NPAGES:
				setNextNpages((Integer)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages((Integer)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel((String)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel((String)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks((Boolean)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks((Boolean)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel((String)newValue);
				return;
			case WebsitePackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel((String)newValue);
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
			case WebsitePackage.COLLECTION_UNIT__FILTERS:
				getFilters().clear();
				return;
			case WebsitePackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage(EMPTY_MESSAGE_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__PAGINATION:
				setPagination((Filter)null);
				return;
			case WebsitePackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize(DEFAULT_PAGINATION_SIZE_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__NEXT_NPAGES:
				setNextNpages(NEXT_NPAGES_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages(PREVIOUS_NPAGES_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel(NEXT_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel(PREVIOUS_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks(USE_DISABLED_PAGE_LINKS_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks(USE_FIRST_LAST_PAGE_LINKS_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel(FIRST_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel(LAST_PAGE_LABEL_EDEFAULT);
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
			case WebsitePackage.COLLECTION_UNIT__FILTERS:
				return filters != null && !filters.isEmpty();
			case WebsitePackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return EMPTY_MESSAGE_EDEFAULT == null ? emptyMessage != null : !EMPTY_MESSAGE_EDEFAULT.equals(emptyMessage);
			case WebsitePackage.COLLECTION_UNIT__PAGINATION:
				return pagination != null;
			case WebsitePackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return defaultPaginationSize != DEFAULT_PAGINATION_SIZE_EDEFAULT;
			case WebsitePackage.COLLECTION_UNIT__NEXT_NPAGES:
				return nextNpages != NEXT_NPAGES_EDEFAULT;
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				return previousNpages != PREVIOUS_NPAGES_EDEFAULT;
			case WebsitePackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				return NEXT_PAGE_LABEL_EDEFAULT == null ? nextPageLabel != null : !NEXT_PAGE_LABEL_EDEFAULT.equals(nextPageLabel);
			case WebsitePackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				return PREVIOUS_PAGE_LABEL_EDEFAULT == null ? previousPageLabel != null : !PREVIOUS_PAGE_LABEL_EDEFAULT.equals(previousPageLabel);
			case WebsitePackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				return useDisabledPageLinks != USE_DISABLED_PAGE_LINKS_EDEFAULT;
			case WebsitePackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return useFirstLastPageLinks != USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;
			case WebsitePackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				return FIRST_PAGE_LABEL_EDEFAULT == null ? firstPageLabel != null : !FIRST_PAGE_LABEL_EDEFAULT.equals(firstPageLabel);
			case WebsitePackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				return LAST_PAGE_LABEL_EDEFAULT == null ? lastPageLabel != null : !LAST_PAGE_LABEL_EDEFAULT.equals(lastPageLabel);
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
		result.append(" (emptyMessage: ");
		result.append(emptyMessage);
		result.append(", defaultPaginationSize: ");
		result.append(defaultPaginationSize);
		result.append(", nextNpages: ");
		result.append(nextNpages);
		result.append(", previousNpages: ");
		result.append(previousNpages);
		result.append(", nextPageLabel: ");
		result.append(nextPageLabel);
		result.append(", previousPageLabel: ");
		result.append(previousPageLabel);
		result.append(", useDisabledPageLinks: ");
		result.append(useDisabledPageLinks);
		result.append(", useFirstLastPageLinks: ");
		result.append(useFirstLastPageLinks);
		result.append(", firstPageLabel: ");
		result.append(firstPageLabel);
		result.append(", lastPageLabel: ");
		result.append(lastPageLabel);
		result.append(')');
		return result.toString();
	}

} //CollectionUnitImpl
