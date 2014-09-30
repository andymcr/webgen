/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationWithoutContainment.java,v 1.4 2013/04/23 10:31:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Without Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment#getTargetUnique <em>Target Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationWithoutContainment()
 * @model
 * @generated
 */
public interface AssociationWithoutContainment extends Association {

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The default value is <code>"Required"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #setTargetCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationWithoutContainment_TargetCardinality()
	 * @model default="Required" required="true"
	 * @generated
	 */
	Cardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Target Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Unique</em>' attribute.
	 * @see #setTargetUnique(Boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getAssociationWithoutContainment_TargetUnique()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getTargetUnique();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment#getTargetUnique <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Unique</em>' attribute.
	 * @see #getTargetUnique()
	 * @generated
	 */
	void setTargetUnique(Boolean value);
} // AssociationWithoutContainment
