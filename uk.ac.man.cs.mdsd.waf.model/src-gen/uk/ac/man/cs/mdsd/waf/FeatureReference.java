/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(ServiceEntityFeature)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeatureReference_Feature()
   * @model
   * @generated
   */
  ServiceEntityFeature getFeature();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FeatureReference#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(ServiceEntityFeature value);

} // FeatureReference
