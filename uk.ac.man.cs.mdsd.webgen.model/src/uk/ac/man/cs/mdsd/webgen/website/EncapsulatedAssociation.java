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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getEncapsulatedTarget <em>Encapsulated Target</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getTargetEntity <em>Target Entity</em>}</li>
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not alias.oclIsUndefined() then\r\n\tif alias <> \'\' then\r\n\t\talias\r\n\telse\r\n\t\t\'empty alias\'\r\n\tendif\r\nelse if association.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).name\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).targetFeatureName\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif endif'"
	 * @generated
	 */
	String getName();

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tCardinality::Optional\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality\r\n\telse if association.oclIsTypeOf(ViewAssociation) then\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(ViewAssociation).cardinality\r\n\t\telse\r\n\t\t\tassociation.oclAsType(ViewAssociation).opposite.cardinality\r\n\t\tendif\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).cardinality\r\n\t\telse if association.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\tCardinality::Required\r\n\t\telse\r\n\t\t\tassociation.oclAsType(AssociationWithoutContainment).targetCardinality \r\n\t\tendif endif\r\n\tendif endif\r\nendif'"
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

	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\r\n\tpartOf.encapsulates->collect(eov | eov.features)->includes(association)'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see #setSourceEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_SourceEntity()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity \r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getSourceEntity <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity</em>' reference.
	 * @see #getSourceEntity()
	 * @generated
	 */
	void setSourceEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getEncapsulatedAssociation_TargetEntity()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity \r\n\t\telse\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(Entity value);

} // EncapsulatedAssociation
