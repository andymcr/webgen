/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Reference Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference <em>Child Reference</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PathReferenceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(Path)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement_Actual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Path getActual();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(Path value);

	/**
	 * Returns the value of the '<em><b>Child Reference</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Reference</em>' containment reference.
	 * @see #setChildReference(ChildPathReference)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement_ChildReference()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ChildPathReference#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ChildPathReference getChildReference();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getChildReference <em>Child Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Reference</em>' containment reference.
	 * @see #getChildReference()
	 * @generated
	 */
	void setChildReference(ChildPathReference value);

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #isSetEntityType()
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getPathReferenceElement_EntityType()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if actual.oclIsUndefined() then\r\n\tnull\r\nelse if actual.oclIsKindOf(CurrentUserReference) then\r\n\tactual.oclAsType(CurrentUserReference).userModel\r\nelse if actual.oclIsTypeOf(FeatureReference) then\r\n\tlet ref : FeatureReference = actual.oclAsType(FeatureReference)\r\n\t\tin if ref.feature.oclIsUndefined() or ref.feature.oclIsKindOf(Attribute) then\r\n\t\t\t\tnull\r\n\t\t\telse\r\n\t\t\t\tlet parent : PathReferenceElement\r\n\t\t\t\t\t= self.oclAsType((ChildPathReference) ).parent\r\n\t\t\t\t\tin if parent.entityType.oclIsUndefined() then\r\n\t\t\t\t\t\t\tnull\r\n\t\t\t\t\t\telse if parent.entityType.features->includes(ref.feature) then\r\n\t\t\t\t\t\t\tref.feature.oclAsType(Association).targetEntityX\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tref.feature.oclAsType(Association).sourceEntityX\r\n\t\t\t\t\t\tendif endif\r\n\t\t\tendif\r\nelse\r\n\tnull\r\nendif endif endif\r\n'"
	 * @generated
	 */
	EntityOrView getEntityType();

	/**
	 * Returns whether the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement#getEntityType <em>Entity Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entity Type</em>' reference is set.
	 * @see #getEntityType()
	 * @generated
	 */
	boolean isSetEntityType();

} // PathReferenceElement
