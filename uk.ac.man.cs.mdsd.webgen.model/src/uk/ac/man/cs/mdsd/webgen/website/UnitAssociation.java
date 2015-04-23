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
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyForceSingletonValues serviceFeatureMustBeConsistent selectionFromCorrectService entityAssociationsRequireFeature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='let featureRequired : Boolean\r\n= if feature.oclIsUndefined() then\r\n\t\tfalse\r\n\telse\r\n\t\tlet entities : OrderedSet(Entity)\r\n\t\t= if displayedOn.source.oclIsUndefined() then\r\n\t\t\t\tOrderedSet{}\r\n\t\t\telse if displayedOn.source.oclIsTypeOf(Entity) then\r\n\t\t\t\tOrderedSet{displayedOn.source.oclAsType(Entity)}\r\n\t\t\telse\r\n\t\t\t\tdisplayedOn.source.oclAsType(Service).encapsulates\r\n\t\t\tendif endif\r\n\t\tin if entities->includes(feature.parentEntity) then\r\n\t\t\t\tfeature.cardinality = Cardinality::Required\r\n\t\t\telse\r\n\t\t\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\t\t\ttrue\r\n\t\t\t\telse\r\n\t\t\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required\r\n\t\t\t\tendif\r\n\t\t\tendif\r\n\t\tendif\r\nin if serviceFeature.oclIsUndefined() then\r\n\t\ttrue\r\n\telse if serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n\t\tfeatureRequired implies serviceFeature.oclAsType(ServiceEntityAssociation).required\r\n\telse\r\n\t\tfeatureRequired implies true -- serviceFeature.oclAsType(ServiceViewAssociation).cardinality = Cardinality::Required\r\n\tendif endif\r\n' canOnlyForceSingletonValues='not feature.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n\tlet entities : OrderedSet(Entity)\r\n\t\t= if displayedOn.source.oclIsTypeOf(Entity) then\r\n\t\t\t\tOrderedSet{displayedOn.source.oclAsType(Entity)}\r\n\t\t\telse\r\n\t\t\t\tdisplayedOn.source.oclAsType(Service).encapsulates\r\n\t\t\tendif\r\n\t\tin if entities->includes(feature.parentEntity) then\r\n\t\t\t\tfeature.cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\t\t\ttrue\r\n\t\t\t\telse\r\n\t\t\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n\t\t\t\tendif\r\n\t\t\tendif' serviceFeatureMustBeConsistent='not feature.oclIsUndefined() and not serviceFeature.oclIsUndefined()\r\nimplies if serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n\t\tfeature = serviceFeature.oclAsType(ServiceEntityAssociation).feature\r\n\telse\r\n\t\ttrue\r\n\tendif' selectionFromCorrectService='if selection.oclIsUndefined() then\r\n\ttrue\r\nelse if serviceFeature.oclIsUndefined() then\r\n\ttrue\r\nelse if not serviceFeature.oclIsTypeOf(ServiceEntityAssociation) then\r\n\ttrue\r\nelse if serviceFeature.oclAsType(ServiceEntityAssociation).feature.oclIsUndefined() then\r\n\ttrue\r\nelse\r\n\tlet target : Entity\r\n\t= if serviceFeature.partOf.encapsulates->includes(serviceFeature.oclAsType(ServiceEntityAssociation).feature.parentEntity) then\r\n\t\t\tserviceFeature.oclAsType(ServiceEntityAssociation).feature.targetEntity\r\n\t\telse\r\n\t\t\tserviceFeature.oclAsType(ServiceEntityAssociation).feature.parentEntity\r\n\t\tendif\r\n\tin target.servedBy->collect(s | s.selections)->includes(selection)\r\nendif endif endif endif' entityAssociationsRequireFeature='not serviceFeature.oclIsUndefined() implies\r\n\tserviceFeature.oclIsTypeOf(ServiceEntityAssociation) implies\r\n\t\tnot feature.oclIsUndefined()'"
 * @generated
 */
public interface UnitAssociation extends UnitFeature, IncludedAssociation, UnitContainer {
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if serviceFeature.oclIsUndefined() then\r\n\tif feature.oclIsUndefined() then\r\n\t\t\'\'\r\n\telse\r\n\t\tfeature.name\r\n\tendif\r\nelse\r\n\tif serviceFeature.oclIsKindOf(ServiceEntityAssociation) then\r\n\t\tserviceFeature.oclAsType(ServiceEntityAssociation).name\r\n\telse\r\n\t\tserviceFeature.oclAsType(ServiceViewAssociation).name\r\n\tendif\r\nendif'"
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
	 * @see #setChildFeature(UnitChildFeature)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	UnitChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(UnitChildFeature value);

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
	 * Returns the value of the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Label</em>' reference.
	 * @see #setDynamicLabel(ModelLabel)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getUnitAssociation_DynamicLabel()
	 * @model ordered="false"
	 * @generated
	 */
	ModelLabel getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.UnitAssociation#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.webgen.website.UnitTitle}.
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
	List<UnitTitle> getFilters();

} // UnitAssociation
