/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import uk.ac.man.cs.mdsd.orm.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getPath <em>Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation()
 * @model
 * @generated
 */
public interface UnitAssociation extends UnitFeature, UnitContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Name()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _xifexpression = null;\n<%uk.ac.man.cs.mdsd.waf.FeaturePathAssociation%> _path = this.getPath();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_path, null));\nif (_notEquals)\n{\n\t<%uk.ac.man.cs.mdsd.waf.FeaturePathAssociation%> _path_1 = this.getPath();\n\t_xifexpression = _path_1.getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(FeaturePathAssociation)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePathAssociation getPath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(FeaturePathAssociation value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

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
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_ValueDisplay()
	 * @model
	 * @generated
	 */
	Label getValueDisplay();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitAssociation#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(Label value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.orm.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitAssociation_Filters()
	 * @model
	 * @generated
	 */
	EList<Label> getFilters();

} // UnitAssociation
