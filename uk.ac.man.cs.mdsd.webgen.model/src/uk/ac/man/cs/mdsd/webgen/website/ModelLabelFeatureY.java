/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Feature Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeatureY#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelFeatureY()
 * @model abstract="true"
 * @generated
 */
public interface ModelLabelFeatureY extends EObject {

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(ModelLabelY)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelFeatureY_PartOf()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	ModelLabelY getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeatureY#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(ModelLabelY value);
} // ModelLabelFeatureY
