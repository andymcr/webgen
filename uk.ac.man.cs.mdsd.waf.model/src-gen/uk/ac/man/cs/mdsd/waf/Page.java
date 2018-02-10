/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Page#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Page#getParentPage <em>Parent Page</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Page#getChildPages <em>Child Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Page#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Page#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedDisplayElement, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.WafModel#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(WafModel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage_PartOf()
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getPages
	 * @model opposite="pages" transient="false"
	 * @generated
	 */
	WafModel getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Page#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(WafModel value);

	/**
	 * Returns the value of the '<em><b>Parent Page</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Page#getChildPages <em>Child Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Page</em>' reference.
	 * @see #setParentPage(Page)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage_ParentPage()
	 * @see uk.ac.man.cs.mdsd.waf.Page#getChildPages
	 * @model opposite="childPages"
	 * @generated
	 */
	Page getParentPage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Page#getParentPage <em>Parent Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Page</em>' reference.
	 * @see #getParentPage()
	 * @generated
	 */
	void setParentPage(Page value);

	/**
	 * Returns the value of the '<em><b>Child Pages</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Page#getParentPage <em>Parent Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Pages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Pages</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage_ChildPages()
	 * @see uk.ac.man.cs.mdsd.waf.Page#getParentPage
	 * @model opposite="parentPage"
	 * @generated
	 */
	EList<Page> getChildPages();

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage_UriElement()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Page#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getPage_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Page#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // Page
