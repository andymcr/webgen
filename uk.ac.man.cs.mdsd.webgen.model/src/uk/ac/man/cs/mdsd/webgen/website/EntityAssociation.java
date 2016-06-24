/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation()
 * @model abstract="true"
 * @generated
 */
public interface EntityAssociation extends EntityFeature, Association {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKeyFor <em>Key For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_Keys()
	 * @see uk.ac.man.cs.mdsd.webgen.website.AssociationKey#getKeyFor
	 * @model opposite="keyFor" containment="true"
	 * @generated
	 */
	List<AssociationKey> getKeys();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetEntity()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Entity#getAssociationEnds
	 * @model opposite="associationEnds" required="true"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetEntity <em>Target Entity</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_Bidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getBidirectional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getBidirectional <em>Bidirectional</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_PivotTableName()
	 * @model
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getPivotTableName <em>Pivot Table Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetFeatureName()
	 * @model
	 * @generated
	 */
	String getTargetFeatureName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetFeatureName <em>Target Feature Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetDisplayLabel()
	 * @model
	 * @generated
	 */
	String getTargetDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetDisplayLabel <em>Target Display Label</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetHeaderClass()
	 * @model
	 * @generated
	 */
	String getTargetHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetHeaderClass <em>Target Header Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetInputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getTargetInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetInputClass <em>Target Input Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetDisplayClass()
	 * @model
	 * @generated
	 */
	String getTargetDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetDisplayClass <em>Target Display Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityAssociation_TargetFooterClass()
	 * @model
	 * @generated
	 */
	String getTargetFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetFooterClass <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Footer Class</em>' attribute.
	 * @see #getTargetFooterClass()
	 * @generated
	 */
	void setTargetFooterClass(String value);

} // EntityAssociation
