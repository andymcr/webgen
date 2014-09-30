/**
 * <copyright>
 * </copyright>
 *
 * $Id: Entity.java,v 1.14 2013/06/08 06:31:28 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getContains <em>Contains</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getContainer <em>Container</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getDisplayFeatures <em>Display Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Entity#getDisplayFormat <em>Display Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Classifier {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.OrmModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(OrmModel)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_PartOf()
	 * @see uk.ac.man.cs.mdsd.orm.OrmModel#getEntities
	 * @model opposite="entities" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OrmModel getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Entity#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(OrmModel value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Entity}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Entity#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_Contains()
	 * @see uk.ac.man.cs.mdsd.orm.Entity#getContainer
	 * @model opposite="container"
	 * @generated
	 */
	EList<Entity> getContains();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Entity#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Entity)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_Container()
	 * @see uk.ac.man.cs.mdsd.orm.Entity#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	Entity getContainer();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Entity#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Entity value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Feature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Feature#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_Features()
	 * @see uk.ac.man.cs.mdsd.orm.Feature#getParentEntity
	 * @model opposite="parentEntity" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Display Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_DisplayFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getDisplayFeatures();

	/**
	 * Returns the value of the '<em><b>Display Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Format</em>' attribute.
	 * @see #setDisplayFormat(String)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getEntity_DisplayFormat()
	 * @model
	 * @generated
	 */
	String getDisplayFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Entity#getDisplayFormat <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Format</em>' attribute.
	 * @see #getDisplayFormat()
	 * @generated
	 */
	void setDisplayFormat(String value);

} // Entity
