/**
 * <copyright>
 * </copyright>
 *
 * $Id: Entity.java,v 1.16 2014/01/30 16:43:49 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getTableName <em>Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getServedBy <em>Served By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getDisplayFeatures <em>Display Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getDisplayFormat <em>Display Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featureNameUniqueWithinEntity displayOnlyLocalFeatures keysFromLocalFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featureNameUniqueWithinEntity='features->isUnique(name)' displayOnlyLocalFeatures='features->union(associationEnds)->includesAll(displayFeatures)' keysFromLocalFeatures='features->union(associationEnds)->includesAll(keys)'"
 * @generated
 */
public interface Entity extends Classifier, UnitSource {
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_Keys()
	 * @model
	 * @generated
	 */
	List<Feature> getKeys();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Feature#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Feature#getParentEntity
	 * @model opposite="parentEntity" containment="true"
	 * @generated
	 */
	List<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Association}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_AssociationEnds()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Association#getTargetEntity
	 * @model opposite="targetEntity"
	 * @generated
	 */
	List<Association> getAssociationEnds();

	/**
	 * Returns the value of the '<em><b>Served By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Service}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Served By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Served By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_ServedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Service#getEncapsulates
	 * @model opposite="encapsulates"
	 * @generated
	 */
	List<Service> getServedBy();

	/**
	 * Returns the value of the '<em><b>Display Features</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Features</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_DisplayFeatures()
	 * @model
	 * @generated
	 */
	List<Feature> getDisplayFeatures();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_DisplayFormat()
	 * @model
	 * @generated
	 */
	String getDisplayFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getDisplayFormat <em>Display Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Format</em>' attribute.
	 * @see #getDisplayFormat()
	 * @generated
	 */
	void setDisplayFormat(String value);

} // Entity
