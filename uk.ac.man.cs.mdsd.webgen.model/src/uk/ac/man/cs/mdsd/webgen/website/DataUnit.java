/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataUnit.java,v 1.13 2014/08/05 15:59:21 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DataUnit#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.DataUnit#getDynamicTitle <em>Dynamic Title</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDataUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyTitleWithSingletonElement selectionFromSource'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyTitleWithSingletonElement='not dynamicTitle.oclIsUndefined() implies \r\nif dynamicTitle.oclIsKindOf(Feature) then\r\n\tdynamicTitle.oclAsType(Feature).cardinality <> Cardinality::Many\r\nelse\r\n\ttrue\r\nendif' selectionFromSource='not selection.oclIsUndefined() implies\r\n\tif source.oclIsUndefined() then\r\n\t\ttrue\r\n\telse if source.oclIsTypeOf(Service) then\r\n\t\tsource.oclAsType(Service).selections->includes(selection)\r\n\telse\r\n\t\tfalse\r\n\tendif endif'"
 * @generated
 */
public interface DataUnit extends DynamicUnit {

	/**
	 * Returns the value of the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Selection</em>' reference.
	 * @see #setDefaultSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDataUnit_DefaultSelection()
	 * @model
	 * @generated
	 */
	Selection getDefaultSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DataUnit#getDefaultSelection <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' reference.
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Dynamic Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Title</em>' reference.
	 * @see #setDynamicTitle(UnitTitle)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getDataUnit_DynamicTitle()
	 * @model ordered="false"
	 * @generated
	 */
	UnitTitle getDynamicTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.DataUnit#getDynamicTitle <em>Dynamic Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Title</em>' reference.
	 * @see #getDynamicTitle()
	 * @generated
	 */
	void setDynamicTitle(UnitTitle value);

} // DataUnit
