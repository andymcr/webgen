/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#isUseAssociationSource <em>Use Association Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getEncapsulatedTarget <em>Encapsulated Target</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation()
 * @model
 * @generated
 */
public interface EncapsulatedAssociation extends EncapsulatedFeature, Association {
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tlet associationName : String\r\n\t\t= if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\t\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\t\t\telse if association.oclIsTypeOf(ViewAssociation) then\r\n\t\t\t\tif useAssociationSource then\r\n\t\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\t\telse\r\n\t\t\t\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\t\t\t\tendif\r\n\t\t\telse\r\n\t\t\t\tif useAssociationSource then\r\n\t\t\t\t\tassociation.oclAsType(EntityAssociation).name\r\n\t\t\t\telse\r\n\t\t\t\t\tassociation.oclAsType(EntityAssociation).targetFeatureName \r\n\t\t\t\tendif\r\n\t\t\tendif endif\r\n\tin if self.alias.oclIsUndefined() then\r\n\t\t\tassociationName\r\n\t\telse if alias <> \'\' then\r\n\t\t\talias\r\n\t\telse\r\n\t\t\tassociationName\r\n\t\tendif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.Association#getEncapsulatedBy <em>Encapsulated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_Association()
	 * @see uk.ac.man.cs.mdsd.webgen.website.Association#getEncapsulatedBy
	 * @model opposite="encapsulatedBy" required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Use Association Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Association Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Association Source</em>' attribute.
	 * @see #setUseAssociationSource(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_UseAssociationSource()
	 * @model
	 * @generated
	 */
	boolean isUseAssociationSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#isUseAssociationSource <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Association Source</em>' attribute.
	 * @see #isUseAssociationSource()
	 * @generated
	 */
	void setUseAssociationSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.webgen.website.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_Cardinality()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tCardinality::Optional\r\nelse \r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality\r\n\telse if association.oclIsTypeOf(ViewAssociation) then\r\n\t\tif useAssociationSource then\r\n\t\t\tassociation.oclAsType(ViewAssociation).cardinality\r\n\t\telse\r\n\t\t\tassociation.oclAsType(ViewAssociation).opposite.cardinality\r\n\t\tendif\r\n\telse\r\n\t\tif useAssociationSource then\r\n\t\t\tassociation.oclAsType(EntityAssociation).cardinality\r\n\t\telse if association.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\tCardinality::Required\r\n\t\telse\r\n\t\t\tassociation.oclAsType(AssociationWithoutContainment).targetCardinality \r\n\t\tendif endif\r\n\tendif endif\r\nendif'"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Encapsulated Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulated Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Target</em>' reference.
	 * @see #setEncapsulatedTarget(EncapsulatedAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_EncapsulatedTarget()
	 * @model
	 * @generated
	 */
	EncapsulatedAssociation getEncapsulatedTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getEncapsulatedTarget <em>Encapsulated Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Target</em>' reference.
	 * @see #getEncapsulatedTarget()
	 * @generated
	 */
	void setEncapsulatedTarget(EncapsulatedAssociation value);

} // EncapsulatedAssociation