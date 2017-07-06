/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isTargetPrimaryKey <em>Target Primary Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetColumnName <em>Target Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation()
 * @model abstract="true"
 * @generated
 */
public interface EntityAssociation extends EntityFeature, Association {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getKeyFor <em>Key For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_Keys()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.AssociationKey#getKeyFor
	 * @model opposite="keyFor" containment="true"
	 * @generated
	 */
	EList<AssociationKey> getKeys();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.Entity#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetEntity()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Entity#getAssociationEnds
	 * @model opposite="associationEnds" required="true"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetEntity <em>Target Entity</em>}' reference.
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
	 * @see #setBidirectional(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_Bidirectional()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_PivotTableName()
	 * @model
	 * @generated
	 */
	String getPivotTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getPivotTableName <em>Pivot Table Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetFeatureName()
	 * @model
	 * @generated
	 */
	String getTargetFeatureName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFeatureName <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature Name</em>' attribute.
	 * @see #getTargetFeatureName()
	 * @generated
	 */
	void setTargetFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Target Primary Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Primary Key</em>' attribute.
	 * @see #setTargetPrimaryKey(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetPrimaryKey()
	 * @model default="false"
	 * @generated
	 */
	boolean isTargetPrimaryKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#isTargetPrimaryKey <em>Target Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Primary Key</em>' attribute.
	 * @see #isTargetPrimaryKey()
	 * @generated
	 */
	void setTargetPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column Name</em>' attribute.
	 * @see #setTargetColumnName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetColumnName()
	 * @model
	 * @generated
	 */
	String getTargetColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetColumnName <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column Name</em>' attribute.
	 * @see #getTargetColumnName()
	 * @generated
	 */
	void setTargetColumnName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetDisplayLabel()
	 * @model
	 * @generated
	 */
	String getTargetDisplayLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayLabel <em>Target Display Label</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetHeaderClass()
	 * @model
	 * @generated
	 */
	String getTargetHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetHeaderClass <em>Target Header Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetInputClass()
	 * @model default="input_association"
	 * @generated
	 */
	String getTargetInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetInputClass <em>Target Input Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetDisplayClass()
	 * @model
	 * @generated
	 */
	String getTargetDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetDisplayClass <em>Target Display Class</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityAssociation_TargetFooterClass()
	 * @model
	 * @generated
	 */
	String getTargetFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation#getTargetFooterClass <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Footer Class</em>' attribute.
	 * @see #getTargetFooterClass()
	 * @generated
	 */
	void setTargetFooterClass(String value);

} // EntityAssociation
