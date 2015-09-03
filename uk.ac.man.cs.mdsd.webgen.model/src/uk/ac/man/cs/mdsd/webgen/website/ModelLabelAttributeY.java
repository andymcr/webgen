/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Attribute Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAttributeY#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAttributeY#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAttributeY()
 * @model
 * @generated
 */
public interface ModelLabelAttributeY extends ModelLabelFeatureY {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAttributeY_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EntityAttribute) then\r\n\tattribute.oclAsType(EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(ViewAttribute).name\r\nendif endif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAttributeY#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelAttributeY_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelAttributeY#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // ModelLabelAttributeY
