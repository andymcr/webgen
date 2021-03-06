/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.Entity;

import uk.ac.man.cs.mdsd.service.Filter;
import uk.ac.man.cs.mdsd.service.Selection;
import uk.ac.man.cs.mdsd.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isOmitContainerLoad <em>Omit Container Load</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContainerService <em>Container Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getSupportedFilters <em>Supported Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getBadges <em>Badges</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationClass <em>Pagination Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CollectionUnit extends SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getContentType();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Omit Container Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Container Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Container Load</em>' attribute.
	 * @see #setOmitContainerLoad(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_OmitContainerLoad()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitContainerLoad();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isOmitContainerLoad <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Container Load</em>' attribute.
	 * @see #isOmitContainerLoad()
	 * @generated
	 */
	void setOmitContainerLoad(boolean value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' reference.
	 * @see #setContainerType(Entity)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_ContainerType()
	 * @model
	 * @generated
	 */
	Entity getContainerType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContainerType <em>Container Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' reference.
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(Entity value);

	/**
	 * Returns the value of the '<em><b>Container Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Service</em>' reference.
	 * @see #setContainerService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_ContainerService()
	 * @model
	 * @generated
	 */
	Service getContainerService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getContainerService <em>Container Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Service</em>' reference.
	 * @see #getContainerService()
	 * @generated
	 */
	void setContainerService(Service value);

	/**
	 * Returns the value of the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Container Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Container Selection</em>' reference.
	 * @see #setFindContainerSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_FindContainerSelection()
	 * @model
	 * @generated
	 */
	Selection getFindContainerSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Container Selection</em>' reference.
	 * @see #getFindContainerSelection()
	 * @generated
	 */
	void setFindContainerSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Element Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Element Selection</em>' reference.
	 * @see #setFindElementSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_FindElementSelection()
	 * @model
	 * @generated
	 */
	Selection getFindElementSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Element Selection</em>' reference.
	 * @see #getFindElementSelection()
	 * @generated
	 */
	void setFindElementSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_Filter()
	 * @model
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Supported Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.service.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Filters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_SupportedFilters()
	 * @model
	 * @generated
	 */
	EList<Filter> getSupportedFilters();

	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Badge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_Badges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Badge> getBadges();

	/**
	 * Returns the value of the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Message</em>' attribute.
	 * @see #setEmptyMessage(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_EmptyMessage()
	 * @model unique="false"
	 * @generated
	 */
	String getEmptyMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getEmptyMessage <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Message</em>' attribute.
	 * @see #getEmptyMessage()
	 * @generated
	 */
	void setEmptyMessage(String value);

	/**
	 * Returns the value of the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #setDefaultPaginationSize(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_DefaultPaginationSize()
	 * @model unique="false"
	 * @generated
	 */
	int getDefaultPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #getDefaultPaginationSize()
	 * @generated
	 */
	void setDefaultPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #setMaximumPaginationSize(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_MaximumPaginationSize()
	 * @model unique="false"
	 * @generated
	 */
	int getMaximumPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #getMaximumPaginationSize()
	 * @generated
	 */
	void setMaximumPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Npages</em>' attribute.
	 * @see #setNextNpages(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_NextNpages()
	 * @model unique="false"
	 * @generated
	 */
	int getNextNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextNpages <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Npages</em>' attribute.
	 * @see #getNextNpages()
	 * @generated
	 */
	void setNextNpages(int value);

	/**
	 * Returns the value of the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Npages</em>' attribute.
	 * @see #setPreviousNpages(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_PreviousNpages()
	 * @model unique="false"
	 * @generated
	 */
	int getPreviousNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Npages</em>' attribute.
	 * @see #getPreviousNpages()
	 * @generated
	 */
	void setPreviousNpages(int value);

	/**
	 * Returns the value of the '<em><b>Next Page Label</b></em>' attribute.
	 * The default value is <code>">"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Label</em>' attribute.
	 * @see #setNextPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_NextPageLabel()
	 * @model default="&gt;" unique="false"
	 * @generated
	 */
	String getNextPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Label</em>' attribute.
	 * @see #getNextPageLabel()
	 * @generated
	 */
	void setNextPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #setNextPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_NextPageIconName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getNextPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #getNextPageIconName()
	 * @generated
	 */
	void setNextPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Label</b></em>' attribute.
	 * The default value is <code>"<"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Label</em>' attribute.
	 * @see #setPreviousPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_PreviousPageLabel()
	 * @model default="&lt;" unique="false"
	 * @generated
	 */
	String getPreviousPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Label</em>' attribute.
	 * @see #getPreviousPageLabel()
	 * @generated
	 */
	void setPreviousPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #setPreviousPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_PreviousPageIconName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPreviousPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #getPreviousPageIconName()
	 * @generated
	 */
	void setPreviousPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Disabled Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #setUseDisabledPageLinks(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_UseDisabledPageLinks()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseDisabledPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 */
	void setUseDisabledPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use First Last Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #setUseFirstLastPageLinks(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_UseFirstLastPageLinks()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseFirstLastPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_FirstPageLabel()
	 * @model default="&lt;&lt;" unique="false"
	 * @generated
	 */
	String getFirstPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Label</em>' attribute.
	 * @see #getFirstPageLabel()
	 * @generated
	 */
	void setFirstPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>First Page Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Icon Name</em>' attribute.
	 * @see #setFirstPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_FirstPageIconName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFirstPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Icon Name</em>' attribute.
	 * @see #getFirstPageIconName()
	 * @generated
	 */
	void setFirstPageIconName(String value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_LastPageLabel()
	 * @model default="&gt;&gt;" unique="false"
	 * @generated
	 */
	String getLastPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Label</em>' attribute.
	 * @see #getLastPageLabel()
	 * @generated
	 */
	void setLastPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #setLastPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_LastPageIconName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getLastPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #getLastPageIconName()
	 * @generated
	 */
	void setLastPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Class</em>' attribute.
	 * @see #setPaginationClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_PaginationClass()
	 * @model unique="false"
	 * @generated
	 */
	String getPaginationClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationClass <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Class</em>' attribute.
	 * @see #getPaginationClass()
	 * @generated
	 */
	void setPaginationClass(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Element Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Element Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #setPaginationElementClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getCollectionUnit_PaginationElementClass()
	 * @model unique="false"
	 * @generated
	 */
	String getPaginationElementClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #getPaginationElementClass()
	 * @generated
	 */
	void setPaginationElementClass(String value);

} // CollectionUnit
