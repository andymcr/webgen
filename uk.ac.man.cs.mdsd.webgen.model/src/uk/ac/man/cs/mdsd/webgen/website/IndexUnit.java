/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexUnit.java,v 1.25 2013/12/31 23:14:39 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getFilters <em>Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPagination <em>Pagination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionMustNotBeSingleton'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionMustNotBeSingleton='not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit <> 1'"
 * @generated
 */
public interface IndexUnit extends DataUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Display Option</b></em>' attribute.
	 * The default value is <code>"Grid"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.IndexDisplayOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.IndexDisplayOption
	 * @see #setDisplayOption(IndexDisplayOption)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_DisplayOption()
	 * @model default="Grid" ordered="false"
	 * @generated
	 */
	IndexDisplayOption getDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getDisplayOption <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.IndexDisplayOption
	 * @see #getDisplayOption()
	 * @generated
	 */
	void setDisplayOption(IndexDisplayOption value);

	/**
	 * Returns the value of the '<em><b>Omit Column Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Column Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #setOmitColumnLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_OmitColumnLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitColumnLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #isOmitColumnLabels()
	 * @generated
	 */
	void setOmitColumnLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_Filters()
	 * @model containment="true"
	 * @generated
	 */
	List<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination</em>' reference.
	 * @see #setPagination(Filter)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_Pagination()
	 * @model
	 * @generated
	 */
	Filter getPagination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPagination <em>Pagination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination</em>' reference.
	 * @see #getPagination()
	 * @generated
	 */
	void setPagination(Filter value);

	/**
	 * Returns the value of the '<em><b>Default Pagination Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #setDefaultPaginationSize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_DefaultPaginationSize()
	 * @model default="10" ordered="false"
	 * @generated
	 */
	int getDefaultPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #getDefaultPaginationSize()
	 * @generated
	 */
	void setDefaultPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Next Npages</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Npages</em>' attribute.
	 * @see #setNextNpages(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_NextNpages()
	 * @model default="2"
	 * @generated
	 */
	int getNextNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getNextNpages <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Npages</em>' attribute.
	 * @see #getNextNpages()
	 * @generated
	 */
	void setNextNpages(int value);

	/**
	 * Returns the value of the '<em><b>Previous Npages</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Npages</em>' attribute.
	 * @see #setPreviousNpages(int)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_PreviousNpages()
	 * @model default="2"
	 * @generated
	 */
	int getPreviousNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPreviousNpages <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Npages</em>' attribute.
	 * @see #getPreviousNpages()
	 * @generated
	 */
	void setPreviousNpages(int value);

	/**
	 * Returns the value of the '<em><b>Next Page Label</b></em>' attribute.
	 * The default value is <code>"&gt;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Label</em>' attribute.
	 * @see #setNextPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_NextPageLabel()
	 * @model default="&gt;" ordered="false"
	 * @generated
	 */
	String getNextPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getNextPageLabel <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Label</em>' attribute.
	 * @see #getNextPageLabel()
	 * @generated
	 */
	void setNextPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Label</b></em>' attribute.
	 * The default value is <code>"&lt;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Label</em>' attribute.
	 * @see #setPreviousPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_PreviousPageLabel()
	 * @model default="&lt;" ordered="false"
	 * @generated
	 */
	String getPreviousPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getPreviousPageLabel <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Label</em>' attribute.
	 * @see #getPreviousPageLabel()
	 * @generated
	 */
	void setPreviousPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Disabled Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #setUseDisabledPageLinks(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_UseDisabledPageLinks()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseDisabledPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 */
	void setUseDisabledPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use First Last Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #setUseFirstLastPageLinks(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_UseFirstLastPageLinks()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isUseFirstLastPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 */
	void setUseFirstLastPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>First Page Label</b></em>' attribute.
	 * The default value is <code>"<<"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Label</em>' attribute.
	 * @see #setFirstPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_FirstPageLabel()
	 * @model default="<<" ordered="false"
	 * @generated
	 */
	String getFirstPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getFirstPageLabel <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Label</em>' attribute.
	 * @see #getFirstPageLabel()
	 * @generated
	 */
	void setFirstPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Label</b></em>' attribute.
	 * The default value is <code>">>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Label</em>' attribute.
	 * @see #setLastPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_LastPageLabel()
	 * @model default=">>" ordered="false"
	 * @generated
	 */
	String getLastPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getLastPageLabel <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Label</em>' attribute.
	 * @see #getLastPageLabel()
	 * @generated
	 */
	void setLastPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,index_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_StyleClass()
	 * @model default="unit,index_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"index_content,framed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_ContentClass()
	 * @model default="index_content,framed" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

	/**
	 * Returns the value of the '<em><b>Row Classes</b></em>' attribute.
	 * The default value is <code>"odd_row,even_row"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Classes</em>' attribute.
	 * @see #setRowClasses(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIndexUnit_RowClasses()
	 * @model default="odd_row,even_row" ordered="false"
	 * @generated
	 */
	String getRowClasses();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IndexUnit#getRowClasses <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Classes</em>' attribute.
	 * @see #getRowClasses()
	 * @generated
	 */
	void setRowClasses(String value);

} // IndexUnit
