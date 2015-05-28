/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionAssociation.java,v 1.5 2011/03/31 18:12:22 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getAssociationRelationship <em>Association Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='x'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL x='collectionType.elementType = opposite.parentEntity'"
 * @generated
 */
public interface CollectionAssociation extends Association {
	/**
   * Returns the value of the '<em><b>Collection Type</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Type</em>' reference.
   * @see #setCollectionType(CollectionType)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionAssociation_CollectionType()
   * @model required="true"
   * @generated
   */
	CollectionType getCollectionType();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getCollectionType <em>Collection Type</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Type</em>' reference.
   * @see #getCollectionType()
   * @generated
   */
	void setCollectionType(CollectionType value);

	/**
   * Returns the value of the '<em><b>Association Relationship</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Association Relationship</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships
   * @see #setAssociationRelationship(CollectionAssociationRelationships)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getCollectionAssociation_AssociationRelationship()
   * @model unique="false"
   * @generated
   */
	CollectionAssociationRelationships getAssociationRelationship();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.CollectionAssociation#getAssociationRelationship <em>Association Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association Relationship</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.CollectionAssociationRelationships
   * @see #getAssociationRelationship()
   * @generated
   */
	void setAssociationRelationship(CollectionAssociationRelationships value);

} // CollectionAssociation
