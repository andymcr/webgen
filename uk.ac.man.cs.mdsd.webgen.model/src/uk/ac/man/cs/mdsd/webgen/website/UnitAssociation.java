/**
 */
package uk.ac.man.cs.mdsd.webgen.website;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionValidChoice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selectionValidChoice='not selection.oclIsUndefined() implies\r\n\ttargetEntity->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(selection)'"
 * @generated
 */
public interface UnitAssociation extends UnitFeature, UnitContainer, FeaturePathAssociation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).name\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).targetFeatureName\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	String getName();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_ValueDisplay()
	 * @model
	 * @generated
	 */
	Label getValueDisplay();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(Label value);

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_Filters()
	 * @model
	 * @generated
	 */
	List<Label> getFilters();

} // UnitAssociation
