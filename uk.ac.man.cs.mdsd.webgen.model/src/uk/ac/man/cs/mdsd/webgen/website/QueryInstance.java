/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.QueryInstance#getQuery <em>Query</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.QueryInstance#getActuals <em>Actuals</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getQueryInstance()
 * @model
 * @generated
 */
public interface QueryInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(Query)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getQueryInstance_Query()
	 * @model required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.QueryInstance#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Actuals</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.QueryActual}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuals</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getQueryInstance_Actuals()
	 * @model containment="true"
	 * @generated
	 */
	List<QueryActual> getActuals();

} // QueryInstance
