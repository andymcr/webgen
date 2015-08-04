/**
 * <copyright>
 * </copyright>
 *
 * $Id: Feature.java,v 1.13 2013/04/23 10:31:56 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' container reference.
	 * @see #setParentEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_ParentEntity()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Entity#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Entity getParentEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getParentEntity <em>Parent Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Entity</em>' container reference.
	 * @see #getParentEntity()
	 * @generated
	 */
	void setParentEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_ColumnName()
	 * @model ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"Optional"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_Unique()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_Ordered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_HeaderClass()
	 * @model
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_DisplayClass()
	 * @model
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeature_FooterClass()
	 * @model
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // Feature
