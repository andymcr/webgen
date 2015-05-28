/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.8 2012/01/09 23:19:05 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isOwningEnd <em>Owning End</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isContainment <em>Containment</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#getPivotTableName <em>Pivot Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneOwningEnd'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL onlyOneOwningEnd='owningEnd xor opposite.owningEnd'"
 * @generated
 */
public interface Association extends Feature {
	/**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Association)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_Opposite()
   * @model required="true"
   * @generated
   */
	Association getOpposite();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
	void setOpposite(Association value);

	/**
   * Returns the value of the '<em><b>Owning End</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Owning End</em>' attribute.
   * @see #setOwningEnd(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_OwningEnd()
   * @model unique="false" required="true"
   * @generated
   */
	boolean isOwningEnd();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#isOwningEnd <em>Owning End</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning End</em>' attribute.
   * @see #isOwningEnd()
   * @generated
   */
	void setOwningEnd(boolean value);

	/**
   * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bidirectional</em>' attribute.
   * @see #setBidirectional(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_Bidirectional()
   * @model unique="false" required="true"
   * @generated
   */
	boolean isBidirectional();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#isBidirectional <em>Bidirectional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bidirectional</em>' attribute.
   * @see #isBidirectional()
   * @generated
   */
	void setBidirectional(boolean value);

	/**
   * Returns the value of the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Containment</em>' attribute.
   * @see #setContainment(boolean)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_Containment()
   * @model unique="false" required="true"
   * @generated
   */
	boolean isContainment();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#isContainment <em>Containment</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containment</em>' attribute.
   * @see #isContainment()
   * @generated
   */
	void setContainment(boolean value);

	/**
   * Returns the value of the '<em><b>Pivot Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pivot Table Name</em>' attribute.
   * @see #setPivotTableName(String)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_PivotTableName()
   * @model unique="false"
   * @generated
   */
	String getPivotTableName();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#getPivotTableName <em>Pivot Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pivot Table Name</em>' attribute.
   * @see #getPivotTableName()
   * @generated
   */
	void setPivotTableName(String value);

} // Association
