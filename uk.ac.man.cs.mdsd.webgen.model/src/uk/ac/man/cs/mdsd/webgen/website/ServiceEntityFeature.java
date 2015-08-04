/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityFeature#getAlias <em>Alias</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityFeature#getViewColumnName <em>View Column Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityFeature()
 * @model abstract="true"
 * @generated
 */
public interface ServiceEntityFeature extends IncludedFeature, ServiceFeature {

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityFeature_Alias()
	 * @model ordered="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityFeature#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>View Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Column Name</em>' attribute.
	 * @see #setViewColumnName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityFeature_ViewColumnName()
	 * @model ordered="false"
	 * @generated
	 */
	String getViewColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityFeature#getViewColumnName <em>View Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Column Name</em>' attribute.
	 * @see #getViewColumnName()
	 * @generated
	 */
	void setViewColumnName(String value);
} // ServiceEntityFeature
