/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageImpl.java,v 1.21 2013/12/12 14:19:29 andy Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.PageLink;
import uk.ac.man.cs.mdsd.webgen.website.PageTopMenuOptions;
import uk.ac.man.cs.mdsd.webgen.website.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getTopMenuOption <em>Top Menu Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getTopMenuRank <em>Top Menu Rank</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getNavigationLabel <em>Navigation Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.PageImpl#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends NamedDisplayElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentUnit> units;

	/**
	 * The cached value of the '{@link #getParentPage() <em>Parent Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPage()
	 * @generated
	 * @ordered
	 */
	protected PageLink parentPage;

	/**
	 * The cached value of the '{@link #getChildPages() <em>Child Pages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildPages()
	 * @generated
	 * @ordered
	 */
	protected EList<PageLink> childPages;

	/**
	 * The default value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected boolean authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMenuOption() <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuOption()
	 * @generated
	 * @ordered
	 */
	protected static final PageTopMenuOptions TOP_MENU_OPTION_EDEFAULT = PageTopMenuOptions.NEVER_INCLUDE;

	/**
	 * The cached value of the '{@link #getTopMenuOption() <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuOption()
	 * @generated
	 * @ordered
	 */
	protected PageTopMenuOptions topMenuOption = TOP_MENU_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMenuRank() <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuRank()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_MENU_RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTopMenuRank() <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMenuRank()
	 * @generated
	 * @ordered
	 */
	protected int topMenuRank = TOP_MENU_RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavigationLabel() <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVIGATION_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavigationLabel() <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLabel()
	 * @generated
	 * @ordered
	 */
	protected String navigationLabel = NAVIGATION_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSideMenu() <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu sideMenu;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLink getParentPage() {
		return parentPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPage(PageLink newParentPage, NotificationChain msgs) {
		PageLink oldParentPage = parentPage;
		parentPage = newParentPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__PARENT_PAGE, oldParentPage, newParentPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPage(PageLink newParentPage) {
		if (newParentPage != parentPage) {
			NotificationChain msgs = null;
			if (parentPage != null)
				msgs = ((InternalEObject)parentPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.PAGE__PARENT_PAGE, null, msgs);
			if (newParentPage != null)
				msgs = ((InternalEObject)newParentPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebsitePackage.PAGE__PARENT_PAGE, null, msgs);
			msgs = basicSetParentPage(newParentPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__PARENT_PAGE, newParentPage, newParentPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PageLink> getChildPages() {
		if (childPages == null) {
			childPages = new EObjectWithInverseResolvingEList<PageLink>(PageLink.class, this, WebsitePackage.PAGE__CHILD_PAGES, WebsitePackage.PAGE_LINK__TARGET_PAGE);
		}
		return childPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ContentUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentWithInverseEList<ContentUnit>(ContentUnit.class, this, WebsitePackage.PAGE__UNITS, WebsitePackage.CONTENT_UNIT__DISPLAYED_ON);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavigationLabel() {
		return navigationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLabel(String newNavigationLabel) {
		String oldNavigationLabel = navigationLabel;
		navigationLabel = newNavigationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__NAVIGATION_LABEL, oldNavigationLabel, navigationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getSideMenu() {
		if (sideMenu != null && sideMenu.eIsProxy()) {
			InternalEObject oldSideMenu = (InternalEObject)sideMenu;
			sideMenu = (Menu)eResolveProxy(oldSideMenu);
			if (sideMenu != oldSideMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.PAGE__SIDE_MENU, oldSideMenu, sideMenu));
			}
		}
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu basicGetSideMenu() {
		return sideMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideMenu(Menu newSideMenu) {
		Menu oldSideMenu = sideMenu;
		sideMenu = newSideMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__SIDE_MENU, oldSideMenu, sideMenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticated(boolean newAuthenticated) {
		boolean oldAuthenticated = authenticated;
		authenticated = newAuthenticated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__AUTHENTICATED, oldAuthenticated, authenticated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageTopMenuOptions getTopMenuOption() {
		return topMenuOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMenuOption(PageTopMenuOptions newTopMenuOption) {
		PageTopMenuOptions oldTopMenuOption = topMenuOption;
		topMenuOption = newTopMenuOption == null ? TOP_MENU_OPTION_EDEFAULT : newTopMenuOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__TOP_MENU_OPTION, oldTopMenuOption, topMenuOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTopMenuRank() {
		return topMenuRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMenuRank(int newTopMenuRank) {
		int oldTopMenuRank = topMenuRank;
		topMenuRank = newTopMenuRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.PAGE__TOP_MENU_RANK, oldTopMenuRank, topMenuRank));
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
			case WebsitePackage.PAGE__UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUnits()).basicAdd(otherEnd, msgs);
			case WebsitePackage.PAGE__CHILD_PAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildPages()).basicAdd(otherEnd, msgs);
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
			case WebsitePackage.PAGE__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case WebsitePackage.PAGE__PARENT_PAGE:
				return basicSetParentPage(null, msgs);
			case WebsitePackage.PAGE__CHILD_PAGES:
				return ((InternalEList<?>)getChildPages()).basicRemove(otherEnd, msgs);
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
			case WebsitePackage.PAGE__UNITS:
				return getUnits();
			case WebsitePackage.PAGE__PARENT_PAGE:
				return getParentPage();
			case WebsitePackage.PAGE__CHILD_PAGES:
				return getChildPages();
			case WebsitePackage.PAGE__AUTHENTICATED:
				return isAuthenticated();
			case WebsitePackage.PAGE__TOP_MENU_OPTION:
				return getTopMenuOption();
			case WebsitePackage.PAGE__TOP_MENU_RANK:
				return getTopMenuRank();
			case WebsitePackage.PAGE__NAVIGATION_LABEL:
				return getNavigationLabel();
			case WebsitePackage.PAGE__SIDE_MENU:
				if (resolve) return getSideMenu();
				return basicGetSideMenu();
			case WebsitePackage.PAGE__STYLE_CLASS:
				return getStyleClass();
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
			case WebsitePackage.PAGE__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends ContentUnit>)newValue);
				return;
			case WebsitePackage.PAGE__PARENT_PAGE:
				setParentPage((PageLink)newValue);
				return;
			case WebsitePackage.PAGE__CHILD_PAGES:
				getChildPages().clear();
				getChildPages().addAll((Collection<? extends PageLink>)newValue);
				return;
			case WebsitePackage.PAGE__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
				return;
			case WebsitePackage.PAGE__TOP_MENU_OPTION:
				setTopMenuOption((PageTopMenuOptions)newValue);
				return;
			case WebsitePackage.PAGE__TOP_MENU_RANK:
				setTopMenuRank((Integer)newValue);
				return;
			case WebsitePackage.PAGE__NAVIGATION_LABEL:
				setNavigationLabel((String)newValue);
				return;
			case WebsitePackage.PAGE__SIDE_MENU:
				setSideMenu((Menu)newValue);
				return;
			case WebsitePackage.PAGE__STYLE_CLASS:
				setStyleClass((String)newValue);
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
			case WebsitePackage.PAGE__UNITS:
				getUnits().clear();
				return;
			case WebsitePackage.PAGE__PARENT_PAGE:
				setParentPage((PageLink)null);
				return;
			case WebsitePackage.PAGE__CHILD_PAGES:
				getChildPages().clear();
				return;
			case WebsitePackage.PAGE__AUTHENTICATED:
				setAuthenticated(AUTHENTICATED_EDEFAULT);
				return;
			case WebsitePackage.PAGE__TOP_MENU_OPTION:
				setTopMenuOption(TOP_MENU_OPTION_EDEFAULT);
				return;
			case WebsitePackage.PAGE__TOP_MENU_RANK:
				setTopMenuRank(TOP_MENU_RANK_EDEFAULT);
				return;
			case WebsitePackage.PAGE__NAVIGATION_LABEL:
				setNavigationLabel(NAVIGATION_LABEL_EDEFAULT);
				return;
			case WebsitePackage.PAGE__SIDE_MENU:
				setSideMenu((Menu)null);
				return;
			case WebsitePackage.PAGE__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
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
			case WebsitePackage.PAGE__UNITS:
				return units != null && !units.isEmpty();
			case WebsitePackage.PAGE__PARENT_PAGE:
				return parentPage != null;
			case WebsitePackage.PAGE__CHILD_PAGES:
				return childPages != null && !childPages.isEmpty();
			case WebsitePackage.PAGE__AUTHENTICATED:
				return authenticated != AUTHENTICATED_EDEFAULT;
			case WebsitePackage.PAGE__TOP_MENU_OPTION:
				return topMenuOption != TOP_MENU_OPTION_EDEFAULT;
			case WebsitePackage.PAGE__TOP_MENU_RANK:
				return topMenuRank != TOP_MENU_RANK_EDEFAULT;
			case WebsitePackage.PAGE__NAVIGATION_LABEL:
				return NAVIGATION_LABEL_EDEFAULT == null ? navigationLabel != null : !NAVIGATION_LABEL_EDEFAULT.equals(navigationLabel);
			case WebsitePackage.PAGE__SIDE_MENU:
				return sideMenu != null;
			case WebsitePackage.PAGE__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
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
		if (baseClass == UnitContainer.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.PAGE__UNITS: return WebsitePackage.UNIT_CONTAINER__UNITS;
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
		if (baseClass == UnitContainer.class) {
			switch (baseFeatureID) {
				case WebsitePackage.UNIT_CONTAINER__UNITS: return WebsitePackage.PAGE__UNITS;
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
		result.append(" (authenticated: ");
		result.append(authenticated);
		result.append(", topMenuOption: ");
		result.append(topMenuOption);
		result.append(", topMenuRank: ");
		result.append(topMenuRank);
		result.append(", navigationLabel: ");
		result.append(navigationLabel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //PageImpl
