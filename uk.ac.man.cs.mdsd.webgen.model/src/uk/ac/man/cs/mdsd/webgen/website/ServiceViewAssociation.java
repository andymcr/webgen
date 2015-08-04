/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceViewAssociation#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceViewAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oppositeMustBeInView'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oppositeMustBeInView='not oppositeFeature.oclIsUndefined() implies oppositeFeature.partOf.view'"
 * @generated
 */
public interface ServiceViewAssociation extends NamedElement, ServiceAssociation, IncludedFeature {

	/**
	 * Returns the value of the '<em><b>Opposite Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Feature</em>' reference.
	 * @see #setOppositeFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceViewAssociation_OppositeFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceAssociation getOppositeFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceViewAssociation#getOppositeFeature <em>Opposite Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Feature</em>' reference.
	 * @see #getOppositeFeature()
	 * @generated
	 */
	void setOppositeFeature(ServiceAssociation value);

} // ServiceViewAssociation
