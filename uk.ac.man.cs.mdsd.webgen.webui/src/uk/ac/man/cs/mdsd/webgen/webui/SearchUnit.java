/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSearchUnit()
 * @model
 * @generated
 */
public interface SearchUnit extends ControlUnit {
	/**
	 * Returns the value of the '<em><b>Results Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Destination</em>' reference.
	 * @see #setResultsDestination(IndexUnit)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSearchUnit_ResultsDestination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IndexUnit getResultsDestination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getResultsDestination <em>Results Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Destination</em>' reference.
	 * @see #getResultsDestination()
	 * @generated
	 */
	void setResultsDestination(IndexUnit value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,search_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getSearchUnit_StyleClass()
	 * @model default="unit,search_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.webui.SearchUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // SearchUnit
