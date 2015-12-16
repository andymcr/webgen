/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.EntityOrView;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getFeatures <em>Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getKeys <em>Keys</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getSelections <em>Selections</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getAccessedBy <em>Accessed By</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.WafModel#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' container reference.
	 * @see #setPartOf(WafModel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_PartOf()
	 * @see uk.ac.man.cs.mdsd.waf.WafModel#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	WafModel getPartOf();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Service#getPartOf <em>Part Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' container reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(WafModel value);

	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Encapsulates()
	 * @model required="true"
	 * @generated
	 */
	EList<EntityOrView> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ServiceFeature}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Features()
	 * @see uk.ac.man.cs.mdsd.waf.ServiceFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<ServiceFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.ServiceFeatureReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Keys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceFeatureReference> getKeys();

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Selection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Selections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Accessed By</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.DynamicUnit}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed By</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_AccessedBy()
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getService
	 * @model opposite="service"
	 * @generated
	 */
	EList<DynamicUnit> getAccessedBy();

} // Service
