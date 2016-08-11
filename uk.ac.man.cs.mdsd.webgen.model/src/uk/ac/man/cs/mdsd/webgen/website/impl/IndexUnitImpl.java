/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexUnitImpl.java,v 1.22 2013/12/31 23:14:39 andy Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexDisplayOption;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.InlineAction;
import uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#isOmitColumnLabels <em>Omit Column Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getPagination <em>Pagination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.IndexUnitImpl#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexUnitImpl extends DataUnitImpl implements IndexUnit {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final IndexDisplayOption DISPLAY_OPTION_EDEFAULT = IndexDisplayOption.GRID;

	/**
	 * The cached value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected IndexDisplayOption displayOption = DISPLAY_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitColumnLabels() <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitColumnLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_COLUMN_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitColumnLabels() <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitColumnLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitColumnLabels = OMIT_COLUMN_LABELS_EDEFAULT;

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
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,index_unit";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "index_content,framed";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowClasses() <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClasses()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_CLASSES_EDEFAULT = "odd_row,even_row";

	/**
	 * The cached value of the '{@link #getRowClasses() <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClasses()
	 * @generated
	 * @ordered
	 */
	protected String rowClasses = ROW_CLASSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.INDEX_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE, oldDefaultPaginationSize, defaultPaginationSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__EMPTY_MESSAGE, oldEmptyMessage, emptyMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__NEXT_NPAGES, oldNextNpages, nextNpages));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__PREVIOUS_NPAGES, oldPreviousNpages, previousNpages));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__NEXT_PAGE_LABEL, oldNextPageLabel, nextPageLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL, oldPreviousPageLabel, previousPageLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS, oldUseDisabledPageLinks, useDisabledPageLinks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS, oldUseFirstLastPageLinks, useFirstLastPageLinks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__FIRST_PAGE_LABEL, oldFirstPageLabel, firstPageLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__LAST_PAGE_LABEL, oldLastPageLabel, lastPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebsitePackage.INDEX_UNIT__ACTIONS, WebsitePackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexDisplayOption getDisplayOption() {
		return displayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayOption(IndexDisplayOption newDisplayOption) {
		IndexDisplayOption oldDisplayOption = displayOption;
		displayOption = newDisplayOption == null ? DISPLAY_OPTION_EDEFAULT : newDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__DISPLAY_OPTION, oldDisplayOption, displayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitColumnLabels() {
		return omitColumnLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitColumnLabels(boolean newOmitColumnLabels) {
		boolean oldOmitColumnLabels = omitColumnLabels;
		omitColumnLabels = newOmitColumnLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__OMIT_COLUMN_LABELS, oldOmitColumnLabels, omitColumnLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, WebsitePackage.INDEX_UNIT__FILTERS);
		}
		return filters;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.INDEX_UNIT__PAGINATION, oldPagination, pagination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__PAGINATION, oldPagination, pagination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowClasses() {
		return rowClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowClasses(String newRowClasses) {
		String oldRowClasses = rowClasses;
		rowClasses = newRowClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.INDEX_UNIT__ROW_CLASSES, oldRowClasses, rowClasses));
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WebsitePackage.INDEX_UNIT__FILTERS:
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				return getActions();
			case WebsitePackage.INDEX_UNIT__DISPLAY_OPTION:
				return getDisplayOption();
			case WebsitePackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
				return isOmitColumnLabels();
			case WebsitePackage.INDEX_UNIT__FILTERS:
				return getFilters();
			case WebsitePackage.INDEX_UNIT__PAGINATION:
				if (resolve) return getPagination();
				return basicGetPagination();
			case WebsitePackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE:
				return getDefaultPaginationSize();
			case WebsitePackage.INDEX_UNIT__EMPTY_MESSAGE:
				return getEmptyMessage();
			case WebsitePackage.INDEX_UNIT__NEXT_NPAGES:
				return getNextNpages();
			case WebsitePackage.INDEX_UNIT__PREVIOUS_NPAGES:
				return getPreviousNpages();
			case WebsitePackage.INDEX_UNIT__NEXT_PAGE_LABEL:
				return getNextPageLabel();
			case WebsitePackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL:
				return getPreviousPageLabel();
			case WebsitePackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS:
				return isUseDisabledPageLinks();
			case WebsitePackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return isUseFirstLastPageLinks();
			case WebsitePackage.INDEX_UNIT__FIRST_PAGE_LABEL:
				return getFirstPageLabel();
			case WebsitePackage.INDEX_UNIT__LAST_PAGE_LABEL:
				return getLastPageLabel();
			case WebsitePackage.INDEX_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebsitePackage.INDEX_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebsitePackage.INDEX_UNIT__ROW_CLASSES:
				return getRowClasses();
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__DISPLAY_OPTION:
				setDisplayOption((IndexDisplayOption)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
				setOmitColumnLabels((Boolean)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__PAGINATION:
				setPagination((Filter)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize((Integer)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__EMPTY_MESSAGE:
				setEmptyMessage((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__NEXT_NPAGES:
				setNextNpages((Integer)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages((Integer)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks((Boolean)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks((Boolean)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
				return;
			case WebsitePackage.INDEX_UNIT__ROW_CLASSES:
				setRowClasses((String)newValue);
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				getActions().clear();
				return;
			case WebsitePackage.INDEX_UNIT__DISPLAY_OPTION:
				setDisplayOption(DISPLAY_OPTION_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
				setOmitColumnLabels(OMIT_COLUMN_LABELS_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__FILTERS:
				getFilters().clear();
				return;
			case WebsitePackage.INDEX_UNIT__PAGINATION:
				setPagination((Filter)null);
				return;
			case WebsitePackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize(DEFAULT_PAGINATION_SIZE_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__EMPTY_MESSAGE:
				setEmptyMessage(EMPTY_MESSAGE_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__NEXT_NPAGES:
				setNextNpages(NEXT_NPAGES_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages(PREVIOUS_NPAGES_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel(NEXT_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel(PREVIOUS_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks(USE_DISABLED_PAGE_LINKS_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks(USE_FIRST_LAST_PAGE_LINKS_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel(FIRST_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel(LAST_PAGE_LABEL_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.INDEX_UNIT__ROW_CLASSES:
				setRowClasses(ROW_CLASSES_EDEFAULT);
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
			case WebsitePackage.INDEX_UNIT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebsitePackage.INDEX_UNIT__DISPLAY_OPTION:
				return displayOption != DISPLAY_OPTION_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
				return omitColumnLabels != OMIT_COLUMN_LABELS_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__FILTERS:
				return filters != null && !filters.isEmpty();
			case WebsitePackage.INDEX_UNIT__PAGINATION:
				return pagination != null;
			case WebsitePackage.INDEX_UNIT__DEFAULT_PAGINATION_SIZE:
				return defaultPaginationSize != DEFAULT_PAGINATION_SIZE_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__EMPTY_MESSAGE:
				return EMPTY_MESSAGE_EDEFAULT == null ? emptyMessage != null : !EMPTY_MESSAGE_EDEFAULT.equals(emptyMessage);
			case WebsitePackage.INDEX_UNIT__NEXT_NPAGES:
				return nextNpages != NEXT_NPAGES_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__PREVIOUS_NPAGES:
				return previousNpages != PREVIOUS_NPAGES_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__NEXT_PAGE_LABEL:
				return NEXT_PAGE_LABEL_EDEFAULT == null ? nextPageLabel != null : !NEXT_PAGE_LABEL_EDEFAULT.equals(nextPageLabel);
			case WebsitePackage.INDEX_UNIT__PREVIOUS_PAGE_LABEL:
				return PREVIOUS_PAGE_LABEL_EDEFAULT == null ? previousPageLabel != null : !PREVIOUS_PAGE_LABEL_EDEFAULT.equals(previousPageLabel);
			case WebsitePackage.INDEX_UNIT__USE_DISABLED_PAGE_LINKS:
				return useDisabledPageLinks != USE_DISABLED_PAGE_LINKS_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return useFirstLastPageLinks != USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;
			case WebsitePackage.INDEX_UNIT__FIRST_PAGE_LABEL:
				return FIRST_PAGE_LABEL_EDEFAULT == null ? firstPageLabel != null : !FIRST_PAGE_LABEL_EDEFAULT.equals(firstPageLabel);
			case WebsitePackage.INDEX_UNIT__LAST_PAGE_LABEL:
				return LAST_PAGE_LABEL_EDEFAULT == null ? lastPageLabel != null : !LAST_PAGE_LABEL_EDEFAULT.equals(lastPageLabel);
			case WebsitePackage.INDEX_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebsitePackage.INDEX_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebsitePackage.INDEX_UNIT__ROW_CLASSES:
				return ROW_CLASSES_EDEFAULT == null ? rowClasses != null : !ROW_CLASSES_EDEFAULT.equals(rowClasses);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.INDEX_UNIT__ACTIONS: return WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebsitePackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebsitePackage.INDEX_UNIT__ACTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (displayOption: ");
		result.append(displayOption);
		result.append(", omitColumnLabels: ");
		result.append(omitColumnLabels);
		result.append(", defaultPaginationSize: ");
		result.append(defaultPaginationSize);
		result.append(", emptyMessage: ");
		result.append(emptyMessage);
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
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(", rowClasses: ");
		result.append(rowClasses);
		result.append(')');
		return result.toString();
	}

} //IndexUnitImpl
