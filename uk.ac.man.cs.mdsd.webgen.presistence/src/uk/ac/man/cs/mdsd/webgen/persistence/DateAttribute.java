/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getDetails <em>Details</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getDateAttribute()
 * @model
 * @generated
 */
public interface DateAttribute extends EntityAttribute {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * The default value is <code>"DateOnly"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.DateDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateDetails
	 * @see #setDetails(DateDetails)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getDateAttribute_Details()
	 * @model default="DateOnly" required="true" ordered="false"
	 * @generated
	 */
	DateDetails getDetails();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.DateDetails
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(DateDetails value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getDateAttribute_Format()
	 * @model ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.DateAttribute#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DateAttribute
