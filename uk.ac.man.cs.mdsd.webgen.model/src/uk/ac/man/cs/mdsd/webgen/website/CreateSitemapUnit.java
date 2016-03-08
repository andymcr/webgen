/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Sitemap Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getFilename <em>Filename</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateSitemapUnit()
 * @model
 * @generated
 */
public interface CreateSitemapUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Deployed URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed URL</em>' attribute.
	 * @see #setDeployedURL(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateSitemapUnit_DeployedURL()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDeployedURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getDeployedURL <em>Deployed URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed URL</em>' attribute.
	 * @see #getDeployedURL()
	 * @generated
	 */
	void setDeployedURL(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * The default value is <code>"sitemap.xml"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateSitemapUnit_Filename()
	 * @model default="sitemap.xml" required="true" ordered="false"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,create_sitemap_unit,framed"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateSitemapUnit_StyleClass()
	 * @model default="unit,create_sitemap_unit,framed" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"create_sitemap_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getCreateSitemapUnit_ContentClass()
	 * @model default="create_sitemap_content" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // CreateSitemapUnit
