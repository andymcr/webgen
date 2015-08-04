/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.11 2013/04/23 10:31:56 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation()
 * @model abstract="true"
 * @generated
 */
public interface Association extends Feature {
	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetEntity()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Entity#getAssociationEnds
	 * @model opposite="associationEnds" required="true"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(Boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_Bidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getBidirectional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #getBidirectional()
	 * @generated
	 */
	void setBidirectional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #setPivotTableName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_PivotTableName()
	 * @model
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getPivotTableName <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #getPivotTableName()
	 * @generated
	 */
	void setPivotTableName(String value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * The default value is <code>"input_association"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_InputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature Name</em>' attribute.
	 * @see #setTargetFeatureName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetFeatureName()
	 * @model
	 * @generated
	 */
	String getTargetFeatureName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetFeatureName <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature Name</em>' attribute.
	 * @see #getTargetFeatureName()
	 * @generated
	 */
	void setTargetFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Display Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Display Label</em>' attribute.
	 * @see #setTargetDisplayLabel(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetDisplayLabel()
	 * @model
	 * @generated
	 */
	String getTargetDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetDisplayLabel <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Display Label</em>' attribute.
	 * @see #getTargetDisplayLabel()
	 * @generated
	 */
	void setTargetDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Header Class</em>' attribute.
	 * @see #setTargetHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetHeaderClass()
	 * @model
	 * @generated
	 */
	String getTargetHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetHeaderClass <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Header Class</em>' attribute.
	 * @see #getTargetHeaderClass()
	 * @generated
	 */
	void setTargetHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Input Class</b></em>' attribute.
	 * The default value is <code>"input_association"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Input Class</em>' attribute.
	 * @see #setTargetInputClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetInputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getTargetInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetInputClass <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Input Class</em>' attribute.
	 * @see #getTargetInputClass()
	 * @generated
	 */
	void setTargetInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Display Class</em>' attribute.
	 * @see #setTargetDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetDisplayClass()
	 * @model
	 * @generated
	 */
	String getTargetDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetDisplayClass <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Display Class</em>' attribute.
	 * @see #getTargetDisplayClass()
	 * @generated
	 */
	void setTargetDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Footer Class</em>' attribute.
	 * @see #setTargetFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociation_TargetFooterClass()
	 * @model
	 * @generated
	 */
	String getTargetFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetFooterClass <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Footer Class</em>' attribute.
	 * @see #getTargetFooterClass()
	 * @generated
	 */
	void setTargetFooterClass(String value);

} // Association
