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
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isSourceEnd <em>Source End</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#isContainment <em>Containment</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.Association#getPivotTableName <em>Pivot Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneSourceEnd'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL onlyOneSourceEnd='sourceEnd xor opposite.sourceEnd'"
 * @generated
 */
public interface Association extends Feature {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.orm.Association#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Association)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_Opposite()
	 * @see uk.ac.man.cs.mdsd.orm.Association#getOpposite
	 * @model opposite="opposite" required="true"
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
	 * Returns the value of the '<em><b>Source End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End</em>' attribute.
	 * @see #setSourceEnd(boolean)
	 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getAssociation_SourceEnd()
	 * @model required="true"
	 * @generated
	 */
	boolean isSourceEnd();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.Association#isSourceEnd <em>Source End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End</em>' attribute.
	 * @see #isSourceEnd()
	 * @generated
	 */
	void setSourceEnd(boolean value);

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
	 * @model required="true"
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
	 * @model required="true"
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
	 * @model
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
