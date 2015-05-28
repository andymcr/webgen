/**
 * <copyright>
 * </copyright>
 *
 * $Id: Feature.java,v 1.8 2012/01/20 10:43:33 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getInputField <em>Input Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Feature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends NamedDisplayElement {

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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_ColumnName()
   * @model unique="false" required="true"
   * @generated
   */
	String getColumnName();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getColumnName <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' attribute.
   * @see #getColumnName()
   * @generated
   */
	void setColumnName(String value);

	/**
   * Returns the value of the '<em><b>Parent Entity</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Entity</em>' container reference.
   * @see #setParentEntity(Entity)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_ParentEntity()
   * @see uk.ac.man.cs.mdsd.orm.Entity#getFeatures
   * @model opposite="features" required="true" transient="false"
   * @generated
   */
	Entity getParentEntity();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getParentEntity <em>Parent Entity</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Entity</em>' container reference.
   * @see #getParentEntity()
   * @generated
   */
	void setParentEntity(Entity value);

	/**
   * Returns the value of the '<em><b>Input Field</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Input Field</em>' attribute.
   * @see #setInputField(Boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_InputField()
   * @model unique="false"
   * @generated
   */
	Boolean getInputField();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getInputField <em>Input Field</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Field</em>' attribute.
   * @see #getInputField()
   * @generated
   */
	void setInputField(Boolean value);

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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_HeaderClass()
   * @model unique="false"
   * @generated
   */
	String getHeaderClass();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getHeaderClass <em>Header Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header Class</em>' attribute.
   * @see #getHeaderClass()
   * @generated
   */
	void setHeaderClass(String value);

	/**
   * Returns the value of the '<em><b>Input Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Input Class</em>' attribute.
   * @see #setInputClass(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_InputClass()
   * @model unique="false"
   * @generated
   */
	String getInputClass();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getInputClass <em>Input Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Class</em>' attribute.
   * @see #getInputClass()
   * @generated
   */
	void setInputClass(String value);

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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_DisplayClass()
   * @model unique="false"
   * @generated
   */
	String getDisplayClass();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getDisplayClass <em>Display Class</em>}' attribute.
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getFeature_FooterClass()
   * @model unique="false"
   * @generated
   */
	String getFooterClass();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Feature#getFooterClass <em>Footer Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Footer Class</em>' attribute.
   * @see #getFooterClass()
   * @generated
   */
	void setFooterClass(String value);
} // Feature
