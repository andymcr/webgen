/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetView <em>Target View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetUnique <em>Target Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation()
 * @model
 * @generated
 */
public interface ViewAssociation extends NamedDisplayElement, ViewFeature, Association {
	/**
	 * Returns the value of the '<em><b>Target View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target View</em>' reference.
	 * @see #setTargetView(View)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetView()
	 * @model required="true"
	 * @generated
	 */
	View getTargetView();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetView <em>Target View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target View</em>' reference.
	 * @see #getTargetView()
	 * @generated
	 */
	void setTargetView(View value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_Bidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getBidirectional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getBidirectional <em>Bidirectional</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_PivotTableName()
	 * @model
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getPivotTableName <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pivot Table Name</em>' attribute.
	 * @see #getPivotTableName()
	 * @generated
	 */
	void setPivotTableName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetFeatureName()
	 * @model
	 * @generated
	 */
	String getTargetFeatureName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetFeatureName <em>Target Feature Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetDisplayLabel()
	 * @model
	 * @generated
	 */
	String getTargetDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetDisplayLabel <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Display Label</em>' attribute.
	 * @see #getTargetDisplayLabel()
	 * @generated
	 */
	void setTargetDisplayLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The default value is <code>"Required"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #setTargetCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetCardinality()
	 * @model default="Required" required="true"
	 * @generated
	 */
	Cardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Unique</em>' attribute.
	 * @see #setTargetUnique(Boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetUnique()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getTargetUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetUnique <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Unique</em>' attribute.
	 * @see #getTargetUnique()
	 * @generated
	 */
	void setTargetUnique(Boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetHeaderClass()
	 * @model
	 * @generated
	 */
	String getTargetHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetHeaderClass <em>Target Header Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetInputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getTargetInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetInputClass <em>Target Input Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetDisplayClass()
	 * @model
	 * @generated
	 */
	String getTargetDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetDisplayClass <em>Target Display Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_TargetFooterClass()
	 * @model
	 * @generated
	 */
	String getTargetFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getTargetFooterClass <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Footer Class</em>' attribute.
	 * @see #getTargetFooterClass()
	 * @generated
	 */
	void setTargetFooterClass(String value);

} // ViewAssociation
