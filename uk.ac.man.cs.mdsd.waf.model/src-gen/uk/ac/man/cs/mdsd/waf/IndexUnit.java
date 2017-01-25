/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit()
 * @model abstract="true"
 * @generated
 */
public interface IndexUnit extends DataUnit, CollectionUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Column Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #setOmitColumnLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_OmitColumnLabels()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitColumnLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #isOmitColumnLabels()
	 * @generated
	 */
	void setOmitColumnLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Targetting Searches</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetting Searches</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetting Searches</em>' reference.
	 * @see #setTargettingSearches(SearchUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_TargettingSearches()
	 * @see uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination
	 * @model opposite="resultsDestination"
	 * @generated
	 */
	SearchUnit getTargettingSearches();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetting Searches</em>' reference.
	 * @see #getTargettingSearches()
	 * @generated
	 */
	void setTargettingSearches(SearchUnit value);

	/**
	 * Returns the value of the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Classes</em>' attribute.
	 * @see #setRowClasses(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_RowClasses()
	 * @model unique="false"
	 * @generated
	 */
	String getRowClasses();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Classes</em>' attribute.
	 * @see #getRowClasses()
	 * @generated
	 */
	void setRowClasses(String value);

} // IndexUnit
