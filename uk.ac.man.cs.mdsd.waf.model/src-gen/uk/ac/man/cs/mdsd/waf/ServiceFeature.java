/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Cardinality;
import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature()
 * @model
 * @generated
 */
public interface ServiceFeature extends NamedDisplayElement, IncludedFeature {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Service#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_PartOf()
	 * @see uk.ac.man.cs.mdsd.waf.Service#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Service getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Service value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.orm.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceFeature_Cardinality()
	 * @model unique="false"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.orm.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // ServiceFeature
