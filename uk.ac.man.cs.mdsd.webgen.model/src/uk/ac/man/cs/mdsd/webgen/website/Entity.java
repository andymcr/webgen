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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.Entity#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featureNameUniqueWithinEntity keysFromLocalFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featureNameUniqueWithinEntity='features->isUnique(name)' keysFromLocalFeatures='features->union(associationEnds)->includesAll(keys)'"
 * @generated
 */
public interface Entity extends EntityOrView, UnitSource {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityAttribute}.
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
	List<EntityAttribute> getKeys();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityFeature#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityFeature#getParentEntity
	 * @model opposite="parentEntity" containment="true"
	 * @generated
	 */
	List<EntityFeature> getFeatures();

	/**
	 * @generated NOT
	 */
	List<EntityFeature> getAllFeatures();

	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEntity_AssociationEnds()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityAssociation#getTargetEntity
	 * @model opposite="targetEntity"
	 * @generated
	 */
	List<EntityAssociation> getAssociationEnds();

} // Entity
