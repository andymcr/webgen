/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.webgen.base.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getLabels <em>Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAssociations <em>Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isImplementsUserInterface <em>Implements User Interface</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='keysFromLocalFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL keysFromLocalFeatures='allFeatures->includesAll(keys)'"
 * @generated
 */
public interface EntityOrView extends Classifier {
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_SingletonName()
	 * @model
	 * @generated
	 */
	String getSingletonName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getSingletonName <em>Singleton Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_PluralisedName()
	 * @model
	 * @generated
	 */
	String getPluralisedName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getPluralisedName <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluralised Name</em>' attribute.
	 * @see #getPluralisedName()
	 * @generated
	 */
	void setPluralisedName(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Keys()
	 * @model
	 * @generated
	 */
	EList<Feature> getKeys();

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Name</b></em>' attribute.
	 * The default value is <code>"id"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Name</em>' attribute.
	 * @see #setAutoKeyName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_AutoKeyName()
	 * @model default="id"
	 * @generated
	 */
	String getAutoKeyName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyName <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Name</em>' attribute.
	 * @see #getAutoKeyName()
	 * @generated
	 */
	void setAutoKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * The default value is <code>"integer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Persistent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Persistent Type</em>' attribute.
	 * @see #setAutoKeyPersistentType(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_AutoKeyPersistentType()
	 * @model default="integer"
	 * @generated
	 */
	String getAutoKeyPersistentType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Persistent Type</em>' attribute.
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 */
	void setAutoKeyPersistentType(String value);

	/**
	 * Returns the value of the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Key Generation Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Key Generation Strategy</em>' attribute.
	 * @see #setAutoKeyGenerationStrategy(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_AutoKeyGenerationStrategy()
	 * @model
	 * @generated
	 */
	String getAutoKeyGenerationStrategy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Generation Strategy</em>' attribute.
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 */
	void setAutoKeyGenerationStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Unique()
	 * @model
	 * @generated
	 */
	EList<Feature> getUnique();

	/**
	 * Returns the value of the '<em><b>Container Unique</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Unique</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Unique</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_ContainerUnique()
	 * @model
	 * @generated
	 */
	EList<Feature> getContainerUnique();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Labels()
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	EList<ModelLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Features()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif'"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>All Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_AllFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures->union(self.oclAsType(Entity).associationEnds->select(e | e.bidirectional))->asOrderedSet()\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif'"
	 * @generated
	 */
	EList<Feature> getAllFeatures();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Attributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features->select(f | f.oclIsKindOf(Attribute)).oclAsType(Attribute)->asOrderedSet()'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_Associations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()'"
	 * @generated
	 */
	EList<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>All Associations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Associations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_AllAssociations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='allFeatures->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()'"
	 * @generated
	 */
	EList<Association> getAllAssociations();

	/**
	 * Returns the value of the '<em><b>Implements User Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements User Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements User Interface</em>' attribute.
	 * @see #setImplementsUserInterface(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEntityOrView_ImplementsUserInterface()
	 * @model default="false"
	 * @generated
	 */
	boolean isImplementsUserInterface();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView#isImplementsUserInterface <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements User Interface</em>' attribute.
	 * @see #isImplementsUserInterface()
	 * @generated
	 */
	void setImplementsUserInterface(boolean value);

} // EntityOrView
