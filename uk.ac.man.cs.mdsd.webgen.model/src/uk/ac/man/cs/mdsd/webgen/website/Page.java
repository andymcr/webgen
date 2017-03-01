/**
 * <copyright>
 * </copyright>
 *
 * $Id: Page.java,v 1.24 2013/12/16 10:37:30 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;
import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getTopMenuOption <em>Top Menu Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getTopMenuRank <em>Top Menu Rank</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getNavigationLabel <em>Navigation Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Page#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contentUnitNameUniqueWithinPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL contentUnitNameUniqueWithinPage='units->isUnique(name)'"
 * @generated
 */
public interface Page extends NamedDisplayElement, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Parent Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Page</em>' containment reference.
	 * @see #setParentPage(PageLink)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_ParentPage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PageLink getParentPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getParentPage <em>Parent Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Page</em>' containment reference.
	 * @see #getParentPage()
	 * @generated
	 */
	void setParentPage(PageLink value);

	/**
	 * Returns the value of the '<em><b>Child Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.PageLink}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.PageLink#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_ChildPages()
	 * @see uk.ac.man.cs.mdsd.webgen.website.PageLink#getTargetPage
	 * @model opposite="targetPage"
	 * @generated
	 */
	List<PageLink> getChildPages();

	/**
	 * Returns the value of the '<em><b>Navigation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Label</em>' attribute.
	 * @see #setNavigationLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_NavigationLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getNavigationLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getNavigationLabel <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Label</em>' attribute.
	 * @see #getNavigationLabel()
	 * @generated
	 */
	void setNavigationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_SideMenu()
	 * @model ordered="false"
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_StyleClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Authenticated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticated</em>' attribute.
	 * @see #setAuthenticated(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_Authenticated()
	 * @model default="true" ordered="false"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#isAuthenticated <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticated</em>' attribute.
	 * @see #isAuthenticated()
	 * @generated
	 */
	void setAuthenticated(boolean value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Top Menu Option</b></em>' attribute.
	 * The default value is <code>"NeverInclude"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.PageTopMenuOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Menu Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.PageTopMenuOptions
	 * @see #setTopMenuOption(PageTopMenuOptions)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_TopMenuOption()
	 * @model default="NeverInclude" ordered="false"
	 * @generated
	 */
	PageTopMenuOptions getTopMenuOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getTopMenuOption <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.PageTopMenuOptions
	 * @see #getTopMenuOption()
	 * @generated
	 */
	void setTopMenuOption(PageTopMenuOptions value);

	/**
	 * Returns the value of the '<em><b>Top Menu Rank</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Menu Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Menu Rank</em>' attribute.
	 * @see #setTopMenuRank(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPage_TopMenuRank()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getTopMenuRank();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Page#getTopMenuRank <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Rank</em>' attribute.
	 * @see #getTopMenuRank()
	 * @generated
	 */
	void setTopMenuRank(int value);

} // Page
