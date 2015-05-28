/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingletonAssociation.java,v 1.5 2011/03/31 18:12:22 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#getAssociationRelationship <em>Association Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAssociation()
 * @model
 * @generated
 */
public interface SingletonAssociation extends Association {
	/**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAssociation_Required()
   * @model unique="false"
   * @generated
   */
	boolean isRequired();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
	void setRequired(boolean value);

	/**
   * Returns the value of the '<em><b>Association Relationship</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Association Relationship</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships
   * @see #setAssociationRelationship(SingletonAssociationRelationships)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAssociation_AssociationRelationship()
   * @model unique="false"
   * @generated
   */
	SingletonAssociationRelationships getAssociationRelationship();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonAssociation#getAssociationRelationship <em>Association Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association Relationship</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.SingletonAssociationRelationships
   * @see #getAssociationRelationship()
   * @generated
   */
	void setAssociationRelationship(SingletonAssociationRelationships value);

} // SingletonAssociation
