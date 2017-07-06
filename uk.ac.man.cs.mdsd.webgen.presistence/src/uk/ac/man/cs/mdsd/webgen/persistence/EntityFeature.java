/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryKeyRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL primaryKeyRequired='primaryKey implies cardinality <> Cardinality::Optional'"
 * @generated
 */
public interface EntityFeature extends NamedDisplayElement, Feature {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.Entity#getEntityFeatures <em>Entity Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_PartOf()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Entity#getEntityFeatures
	 * @model opposite="entityFeatures" required="true" transient="false"
	 * @generated
	 */
	Entity getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"Optional"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_Cardinality()
	 * @model default="Optional" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_Unique()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isUnique <em>Unique</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_Ordered()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Is Has Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Is Has Choice</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices
	 * @see #setBooleanIsHasChoice(isHasChoices)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_BooleanIsHasChoice()
	 * @model
	 * @generated
	 */
	isHasChoices getBooleanIsHasChoice();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Is Has Choice</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.isHasChoices
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 */
	void setBooleanIsHasChoice(isHasChoices value);

	/**
	 * Returns the value of the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Name</em>' attribute.
	 * @see #setSingletonName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getSingletonName <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Name</em>' attribute.
	 * @see #getSingletonName()
	 * @generated
	 */
	void setSingletonName(String value);

	/**
	 * Returns the value of the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluralised Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluralised Name</em>' attribute.
	 * @see #setPluralisedName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getPluralisedName <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralised Name</em>' attribute.
	 * @see #getPluralisedName()
	 * @generated
	 */
	void setPluralisedName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityFeature_ColumnName()
	 * @model ordered="false"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

} // EntityFeature
