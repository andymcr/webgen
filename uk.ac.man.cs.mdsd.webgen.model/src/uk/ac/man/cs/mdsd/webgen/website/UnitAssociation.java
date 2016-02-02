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
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='serviceFeatureMustBeConsistent selectionFromCorrectService'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL serviceFeatureMustBeConsistent='not association.oclIsUndefined() and not serviceFeature.oclIsUndefined() implies\r\n\tassociation = serviceFeature.association\r\n' selectionFromCorrectService='not selection.oclIsUndefined() and not association.oclIsUndefined() implies\r\n\tlet entityOrView : EntityOrView\r\n\t\t= if association.oclIsTypeOf(ViewAssociation) then\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).partOf\r\n\t\t\telse if useAssociationSource then\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\t\tendif endif\r\n\tin entityOrView.servedBy->collect(s | s.selections)->includes(selection)'"
 * @generated
 */
public interface UnitAssociation extends IncludedAssociation, UnitFeature, UnitContainer {
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not serviceFeature.oclIsUndefined() then\r\n\tserviceFeature.name\r\nelse\r\n\tif association.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\telse if association.oclIsTypeOf(ViewAssociation) then\r\n\t\tlet viewAssociation : ViewAssociation = association.oclAsType(ViewAssociation)\r\n\t\tin if useAssociationSource then\r\n\t\t\t\tviewAssociation.name\r\n\t\t\telse\r\n\t\t\t\tviewAssociation.opposite.name\r\n\t\t\tendif\r\n\telse\r\n\t\tlet entityAssociation : EntityAssociation = association.oclAsType(EntityAssociation)\r\n\t\tin if useAssociationSource then\r\n\t\t\t\tentityAssociation.name\r\n\t\t\telse\r\n\t\t\t\tif entityAssociation.targetFeatureName.oclIsUndefined() then\r\n\t\t\t\t\tlet prefix : String\r\n\t\t\t\t\t\t= \'inv\'.concat(entityAssociation.name.substring(1, 1).toUpper())\r\n\t\t\t\t\t\tin if entityAssociation.name.size() > 1 then\r\n\t\t\t\t\t\t\t\tprefix.concat(entityAssociation.name.substring(2, entityAssociation.name.size()))\r\n\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\tprefix\r\n\t\t\t\t\t\t\tendif\r\n\t\t\t\telse\r\n\t\t\t\t\tentityAssociation.targetFeatureName\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\tendif endif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Feature</em>' reference.
	 * @see #setServiceFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_ServiceFeature()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceAssociation getServiceFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getServiceFeature <em>Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Feature</em>' reference.
	 * @see #getServiceFeature()
	 * @generated
	 */
	void setServiceFeature(ServiceAssociation value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ServiceFeatureReference)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	ServiceFeatureReference getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ServiceFeatureReference value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(Label)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_Label()
	 * @model
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

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
