/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Y</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getLabelFor <em>Label For</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getFormat <em>Format</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelY()
 * @model
 * @generated
 */
public interface ModelLabelY extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getDisplayLabels <em>Display Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label For</em>' container reference.
	 * @see #setLabelFor(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelY_LabelFor()
	 * @see uk.ac.man.cs.mdsd.webgen.website.EntityOrView#getDisplayLabels
	 * @model opposite="displayLabels" required="true" transient="false"
	 * @generated
	 */
	EntityOrView getLabelFor();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getLabelFor <em>Label For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label For</em>' container reference.
	 * @see #getLabelFor()
	 * @generated
	 */
	void setLabelFor(EntityOrView value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelY_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelY#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeatureY}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeatureY#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getModelLabelY_Features()
	 * @see uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeatureY#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	List<ModelLabelFeatureY> getFeatures();

} // ModelLabelY
