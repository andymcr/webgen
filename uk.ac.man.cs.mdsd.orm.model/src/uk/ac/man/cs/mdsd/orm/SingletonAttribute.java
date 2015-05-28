/**
 */
package uk.ac.man.cs.mdsd.orm;

import uk.ac.man.cs.mdsd.criteria.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAttribute()
 * @model abstract="true"
 * @generated
 */
public interface SingletonAttribute extends Attribute {
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
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAttribute_Required()
   * @model unique="false" ordered="false"
   * @generated
   */
	boolean isRequired();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #isRequired()
   * @generated
   */
	void setRequired(boolean value);

	/**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAttribute_Unique()
   * @model unique="false" ordered="false"
   * @generated
   */
	boolean isUnique();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
	void setUnique(boolean value);

	/**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getSingletonAttribute_DefaultValue()
   * @model containment="true" ordered="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel createChild='false'"
   * @generated
   */
	Expression getDefaultValue();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.SingletonAttribute#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
	void setDefaultValue(Expression value);

} // SingletonAttribute
