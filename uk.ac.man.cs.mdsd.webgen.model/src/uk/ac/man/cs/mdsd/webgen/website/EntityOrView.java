/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Or View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getLabels <em>Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAssociations <em>Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#isSerializationExcludeAll <em>Serialization Exclude All</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='keysFromLocalFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL keysFromLocalFeatures='allFeatures->includesAll(keys)'"
 * @generated
 */
public interface EntityOrView extends Classifier, SelectionField {
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getTableName <em>Table Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_AutoKeyName()
	 * @model default="id"
	 * @generated
	 */
	String getAutoKeyName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyName <em>Auto Key Name</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_AutoKeyPersistentType()
	 * @model default="integer"
	 * @generated
	 */
	String getAutoKeyPersistentType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}' attribute.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_AutoKeyGenerationStrategy()
	 * @model
	 * @generated
	 */
	String getAutoKeyGenerationStrategy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Key Generation Strategy</em>' attribute.
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 */
	void setAutoKeyGenerationStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Served By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Service}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getServes <em>Serves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Served By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Served By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_ServedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Service#getServes
	 * @model opposite="serves"
	 * @generated
	 */
	List<Service> getServedBy();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ModelLabel}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_Labels()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ModelLabel#getLabelFor
	 * @model opposite="labelFor" containment="true"
	 * @generated
	 */
	List<ModelLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_Features()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif'"
	 * @generated
	 */
	List<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>All Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_AllFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures->union(self.oclAsType(Entity).associationEnds->select(e | e.bidirectional))->asOrderedSet()\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif'"
	 * @generated
	 */
	List<Feature> getAllFeatures();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_Attributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features->select(f | f.oclIsKindOf(Attribute)).oclAsType(Attribute)->asOrderedSet()'"
	 * @generated
	 */
	List<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_Associations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='features->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()'"
	 * @generated
	 */
	List<Association> getAssociations();

	/**
	 * Returns the value of the '<em><b>All Associations</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Associations</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_AllAssociations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='allFeatures->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()'"
	 * @generated
	 */
	List<Association> getAllAssociations();

	/**
	 * Returns the value of the '<em><b>Serialization Exclude All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Exclude All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Exclude All</em>' attribute.
	 * @see #setSerializationExcludeAll(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_SerializationExcludeAll()
	 * @model default="false"
	 * @generated
	 */
	boolean isSerializationExcludeAll();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#isSerializationExcludeAll <em>Serialization Exclude All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialization Exclude All</em>' attribute.
	 * @see #isSerializationExcludeAll()
	 * @generated
	 */
	void setSerializationExcludeAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntityOrView_Keys()
	 * @model
	 * @generated
	 */
	List<Feature> getKeys();

} // EntityOrView
