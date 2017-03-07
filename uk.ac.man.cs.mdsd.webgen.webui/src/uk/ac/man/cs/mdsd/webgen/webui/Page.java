/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI <em>Web UI</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuOption <em>Top Menu Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuRank <em>Top Menu Rank</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getNavigationLabel <em>Navigation Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contentUnitNameUniqueWithinPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL contentUnitNameUniqueWithinPage='units->isUnique(name)'"
 * @generated
 */
public interface Page extends NamedDisplayElement, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Web UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web UI</em>' container reference.
	 * @see #setWebUI(WebUI)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_WebUI()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebUI#getPages
	 * @model opposite="pages" required="true" transient="false"
	 * @generated
	 */
	WebUI getWebUI();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getWebUI <em>Web UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web UI</em>' container reference.
	 * @see #getWebUI()
	 * @generated
	 */
	void setWebUI(WebUI value);

	/**
	 * Returns the value of the '<em><b>Parent Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Page</em>' containment reference.
	 * @see #setParentPage(PageLink)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_ParentPage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PageLink getParentPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getParentPage <em>Parent Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Page</em>' containment reference.
	 * @see #getParentPage()
	 * @generated
	 */
	void setParentPage(PageLink value);

	/**
	 * Returns the value of the '<em><b>Child Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.PageLink}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_ChildPages()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageLink#getTargetPage
	 * @model opposite="targetPage"
	 * @generated
	 */
	EList<PageLink> getChildPages();

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_Authenticated()
	 * @model default="true" ordered="false"
	 * @generated
	 */
	boolean isAuthenticated();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#isAuthenticated <em>Authenticated</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getUriElement <em>Uri Element</em>}' attribute.
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
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Menu Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions
	 * @see #setTopMenuOption(PageTopMenuOptions)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_TopMenuOption()
	 * @model default="NeverInclude" ordered="false"
	 * @generated
	 */
	PageTopMenuOptions getTopMenuOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuOption <em>Top Menu Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.PageTopMenuOptions
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_TopMenuRank()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getTopMenuRank();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getTopMenuRank <em>Top Menu Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Menu Rank</em>' attribute.
	 * @see #getTopMenuRank()
	 * @generated
	 */
	void setTopMenuRank(int value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_NavigationLabel()
	 * @model ordered="false"
	 * @generated
	 */
	String getNavigationLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getNavigationLabel <em>Navigation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Label</em>' attribute.
	 * @see #getNavigationLabel()
	 * @generated
	 */
	void setNavigationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(ContextMenu)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_SideMenu()
	 * @see uk.ac.man.cs.mdsd.webgen.webui.ContextMenu#getContext
	 * @model opposite="context" ordered="false"
	 * @generated
	 */
	ContextMenu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(ContextMenu value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getPage_StyleClass()
	 * @model ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.Page#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // Page
