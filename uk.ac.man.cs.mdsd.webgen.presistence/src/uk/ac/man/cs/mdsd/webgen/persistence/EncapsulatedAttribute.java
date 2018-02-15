/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEncapsulatedAttribute()
 * @model
 * @generated
 */
public interface EncapsulatedAttribute extends EncapsulatedFeature, Attribute {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEncapsulatedAttribute_Name()
	 * @model default="" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.alias.oclIsUndefined() then\r\n\tif self.alias &lt;&gt; \'\' then\r\n\t\tself.alias\r\n\telse\r\n\t\t\'empty alias\'\r\n\tendif\r\nelse if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).name\r\n\telse\r\n\t\tattribute.oclAsType(EncapsulatedAttribute).name\r\n\tendif\r\nendif endif'"
	 * @generated
	 */
	String getName();

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
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEncapsulatedAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.persistence.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage#getEncapsulatedAttribute_Cardinality()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if attribute.oclIsUndefined() then\r\n\tCardinality::Optional\r\nelse \r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).cardinality\r\n\telse\r\n\t\tattribute.oclAsType(EncapsulatedAttribute).cardinality\r\n\tendif\r\nendif'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.persistence.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // EncapsulatedAttribute
