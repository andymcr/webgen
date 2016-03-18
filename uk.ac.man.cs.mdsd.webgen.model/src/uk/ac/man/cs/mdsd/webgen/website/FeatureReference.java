/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import uk.ac.man.cs.mdsd.criteria.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField <em>Field</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField2 <em>Field2</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends Path {

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(IncludedFeature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Field()
	 * @model ordered="false"
	 * @generated
	 */
	IncludedFeature getField();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(IncludedFeature value);

	/**
	 * Returns the value of the '<em><b>Field2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field2</em>' reference.
	 * @see #setField2(Feature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Field2()
	 * @model
	 * @generated
	 */
	Feature getField2();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getField2 <em>Field2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field2</em>' reference.
	 * @see #getField2()
	 * @generated
	 */
	void setField2(Feature value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getFeatureReference_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.FeatureReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureReference
