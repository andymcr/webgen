/**
 * <copyright>
 * </copyright>
 *
 * $Id: DateAttribute.java,v 1.8 2013/12/17 13:57:27 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DateAttribute#getDetails <em>Details</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DateAttribute#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDateAttribute()
 * @model
 * @generated
 */
public interface DateAttribute extends EntityAttribute {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * The default value is <code>"DateOnly"</code>.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.DateDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.DateDetails
	 * @see #setDetails(DateDetails)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDateAttribute_Details()
	 * @model default="DateOnly" required="true" ordered="false"
	 * @generated
	 */
	DateDetails getDetails();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DateAttribute#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.DateDetails
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDateAttribute_Format()
	 * @model ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DateAttribute#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DateAttribute
