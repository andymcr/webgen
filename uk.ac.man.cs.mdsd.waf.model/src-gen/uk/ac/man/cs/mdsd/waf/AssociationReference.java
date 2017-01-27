/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.Association;
import uk.ac.man.cs.mdsd.orm.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAssociationReference()
 * @model abstract="true"
 * @generated
 */
public interface AssociationReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAssociationReference_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _xifexpression = null;\n<%uk.ac.man.cs.mdsd.orm.Association%> _association = this.getAssociation();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_association, null));\nif (_notEquals)\n{\n\t<%uk.ac.man.cs.mdsd.orm.Association%> _association_1 = this.getAssociation();\n\t_xifexpression = _association_1.getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAssociationReference_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Display</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Display</em>' reference.
	 * @see #setValueDisplay(Label)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAssociationReference_ValueDisplay()
	 * @model
	 * @generated
	 */
	Label getValueDisplay();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(Label value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildPath)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getAssociationReference_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	ChildPath getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.AssociationReference#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildPath value);

} // AssociationReference
