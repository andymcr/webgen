/**
 * <copyright>
 * </copyright>
 *
 * $Id: DateAttribute.java,v 1.6 2013/12/17 13:57:24 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.orm.DateAttribute#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getDateAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DateAttribute extends EObject {
	/**
   * Returns the value of the '<em><b>Details</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.DateDetails}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.DateDetails
   * @see #setDetails(DateDetails)
   * @see uk.ac.man.cs.mdsd.orm.OrmPackage#getDateAttribute_Details()
   * @model unique="false"
   * @generated
   */
	DateDetails getDetails();

	/**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.orm.DateAttribute#getDetails <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' attribute.
   * @see uk.ac.man.cs.mdsd.orm.DateDetails
   * @see #getDetails()
   * @generated
   */
	void setDetails(DateDetails value);

} // DateAttribute
