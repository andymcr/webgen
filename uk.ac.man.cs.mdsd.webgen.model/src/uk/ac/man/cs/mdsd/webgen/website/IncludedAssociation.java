/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedAssociation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyForceSingletonValues'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='not association.oclIsUndefined() implies\r\n\tif association.oclIsTypeOf(ViewAssociation) then\r\n\t\tassociation.oclAsType(ViewAssociation).cardinality = Cardinality::Required implies required\r\n\telse if useAssociationSource then\r\n\t\tassociation.oclAsType(EntityAssociation).cardinality = Cardinality::Required implies required\r\n\telse if association.oclIsTypeOf(AssociationWithContainment) then\r\n\t\trequired\r\n\telse\r\n\t\tassociation.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required implies required\r\n\tendif endif endif' canOnlyForceSingletonValues='not association.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n\tif association.oclIsTypeOf(ViewAssociation) then\r\n\t\tassociation.oclAsType(ViewAssociation).cardinality <> Cardinality::Many\r\n\telse if useAssociationSource then\r\n\t\tassociation.oclAsType(EntityAssociation).cardinality <> Cardinality::Many\r\n\telse if association.oclIsTypeOf(AssociationWithContainment) then\r\n\t\ttrue\r\n\telse\r\n\t\tassociation.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n\tendif endif endif'"
 * @generated
 */
public interface IncludedAssociation extends IncludedFeature {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedAssociation_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#getAssociation <em>Association</em>}' reference.
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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getIncludedAssociation_UseAssociationSource()
	 * @model
	 * @generated
	 */
	boolean isUseAssociationSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.IncludedAssociation#isUseAssociationSource <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Association Source</em>' attribute.
	 * @see #isUseAssociationSource()
	 * @generated
	 */
	void setUseAssociationSource(boolean value);

} // IncludedAssociation
