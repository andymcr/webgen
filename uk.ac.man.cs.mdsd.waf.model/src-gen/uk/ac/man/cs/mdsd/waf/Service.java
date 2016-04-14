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
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getServes <em>Serves</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.Service#getSelections <em>Selections</em>}</li>
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
	 * Returns the value of the '<em><b>Serves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' reference.
	 * @see #setServes(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Serves()
	 * @model required="true"
	 * @generated
	 */
	EntityOrView getServes();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.Service#getServes <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' reference.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(EntityOrView value);

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Selection}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Selection#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getService_Selections()
	 * @see uk.ac.man.cs.mdsd.waf.Selection#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Selection> getSelections();

} // Service
