/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import org.eclipse.emf.common.util.EList;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.service.Filter;
import uk.ac.man.cs.mdsd.webgen.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isOmitContainerLoad <em>Omit Container Load</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getSupportedFilters <em>Supported Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getBadges <em>Badges</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPaginationClass <em>Pagination Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionMustNotBeSingleton'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionMustNotBeSingleton='not selection.oclIsUndefined() implies\r\n\tselection.limit &lt;&gt; 1'"
 * @generated
 */
public interface CollectionUnit extends SelectableUnit {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	EList<EntityOrView> getContentType();

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_FindContainerSelection()
	 * @model
	 * @generated
	 */
	Selection getFindContainerSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Container Selection</em>' reference.
	 * @see #getFindContainerSelection()
	 * @generated
	 */
	void setFindContainerSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Omit Container Load</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Container Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Container Load</em>' attribute.
	 * @see #setOmitContainerLoad(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_OmitContainerLoad()
	 * @model default="false"
	 * @generated
	 */
	boolean isOmitContainerLoad();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isOmitContainerLoad <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Container Load</em>' attribute.
	 * @see #isOmitContainerLoad()
	 * @generated
	 */
	void setOmitContainerLoad(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_FindElementSelection()
	 * @model
	 * @generated
	 */
	Selection getFindElementSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_Filter()
	 * @model
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Supported Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.service.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Filters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_SupportedFilters()
	 * @model
	 * @generated
	 */
	EList<Filter> getSupportedFilters();

	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.webui.Badge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_Badges()
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_EmptyMessage()
	 * @model
	 * @generated
	 */
	String getEmptyMessage();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Message</em>' attribute.
	 * @see #getEmptyMessage()
	 * @generated
	 */
	void setEmptyMessage(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_DefaultPaginationSize()
	 * @model default="10" ordered="false"
	 * @generated
	 */
	int getDefaultPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #getDefaultPaginationSize()
	 * @generated
	 */
	void setDefaultPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #setMaximumPaginationSize(int)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_MaximumPaginationSize()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getMaximumPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #getMaximumPaginationSize()
	 * @generated
	 */
	void setMaximumPaginationSize(int value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_NextNpages()
	 * @model default="2"
	 * @generated
	 */
	int getNextNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_PreviousNpages()
	 * @model default="2"
	 * @generated
	 */
	int getPreviousNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_NextPageLabel()
	 * @model default="&amp;gt;" ordered="false"
	 * @generated
	 */
	String getNextPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Label</em>' attribute.
	 * @see #getNextPageLabel()
	 * @generated
	 */
	void setNextPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * The default value is <code>"chevron_right"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #setNextPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_NextPageIconName()
	 * @model default="chevron_right"
	 * @generated
	 */
	String getNextPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #getNextPageIconName()
	 * @generated
	 */
	void setNextPageIconName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_PreviousPageLabel()
	 * @model default="&amp;lt;" ordered="false"
	 * @generated
	 */
	String getPreviousPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Label</em>' attribute.
	 * @see #getPreviousPageLabel()
	 * @generated
	 */
	void setPreviousPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * The default value is <code>"chevron_left"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #setPreviousPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_PreviousPageIconName()
	 * @model default="chevron_left"
	 * @generated
	 */
	String getPreviousPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #getPreviousPageIconName()
	 * @generated
	 */
	void setPreviousPageIconName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_UseDisabledPageLinks()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseDisabledPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_UseFirstLastPageLinks()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isUseFirstLastPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_FirstPageLabel()
	 * @model default="&lt;&lt;" ordered="false"
	 * @generated
	 */
	String getFirstPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Label</em>' attribute.
	 * @see #getFirstPageLabel()
	 * @generated
	 */
	void setFirstPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>First Page Icon Name</b></em>' attribute.
	 * The default value is <code>"first_page"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Icon Name</em>' attribute.
	 * @see #setFirstPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_FirstPageIconName()
	 * @model default="first_page"
	 * @generated
	 */
	String getFirstPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_LastPageLabel()
	 * @model default="&gt;&gt;" ordered="false"
	 * @generated
	 */
	String getLastPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Label</em>' attribute.
	 * @see #getLastPageLabel()
	 * @generated
	 */
	void setLastPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * The default value is <code>"last_page"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #setLastPageIconName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_LastPageIconName()
	 * @model default="last_page"
	 * @generated
	 */
	String getLastPageIconName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #getLastPageIconName()
	 * @generated
	 */
	void setLastPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Class</b></em>' attribute.
	 * The default value is <code>"pagination"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Class</em>' attribute.
	 * @see #setPaginationClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_PaginationClass()
	 * @model default="pagination"
	 * @generated
	 */
	String getPaginationClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPaginationClass <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Class</em>' attribute.
	 * @see #getPaginationClass()
	 * @generated
	 */
	void setPaginationClass(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Element Class</b></em>' attribute.
	 * The default value is <code>"waves_effect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Element Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #setPaginationElementClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getCollectionUnit_PaginationElementClass()
	 * @model default="waves_effect"
	 * @generated
	 */
	String getPaginationElementClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #getPaginationElementClass()
	 * @generated
	 */
	void setPaginationElementClass(String value);

} // CollectionUnit
