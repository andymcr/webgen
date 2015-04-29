/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getDynamicLabel <em>Dynamic Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#isUseFeatureSource <em>Use Feature Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getOppositeFeature <em>Opposite Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotReduceCardinality canOnlyForceSingletonValues selectionFromCorrectService implicitOppositeServiceMustBeUnambiguous featureRequired'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannotReduceCardinality='not feature.oclIsUndefined() implies\r\n\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\tfeature.cardinality = Cardinality::Required implies required\r\n\telse\r\n\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\trequired\r\n\t\telse\r\n\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality = Cardinality::Required implies required\r\n\t\tendif\r\n\tendif' canOnlyForceSingletonValues='not feature.oclIsUndefined() and not forcedValue.oclIsUndefined() implies\r\n\tif partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\tfeature.cardinality <> Cardinality::Many\r\n\telse\r\n\t\tif feature.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\ttrue\r\n\t\telse\r\n\t\t\tfeature.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n\t\tendif\r\n\tendif' selectionFromCorrectService='if selection.oclIsUndefined() then\r\n\ttrue\r\nelse if feature.oclIsUndefined() then\r\n\ttrue\r\nelse\r\n\tlet target : Entity\r\n\t\t= if partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\t\t\tfeature.targetEntity\r\n\t\t\telse\r\n\t\t\t\tfeature.parentEntity\r\n\t\t\tendif\r\n\tin target.servedBy->collect(s | s.selections)->includes(selection)\r\nendif endif' implicitOppositeServiceMustBeUnambiguous='oppositeService.oclIsUndefined() and not feature.oclIsUndefined() implies\r\n\tlet entity: Entity\r\n\t\t= if partOf.encapsulates->includes(feature.parentEntity) then\r\n\t\t\t\tfeature.targetEntity\r\n\t\t\telse\r\n\t\t\t\tfeature.parentEntity\r\n\t\t\tendif\r\n\tin entity.servedBy->size() < 2' featureRequired='not feature.oclIsUndefined()'"
 * @generated
 */
public interface ServiceEntityAssociation extends ServiceEntityFeature, ServiceAssociation, IncludedAssociation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_Name()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if feature.oclIsUndefined() or partOf.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tlet featureName : String\r\n\t\t= if self.useFeatureSource then\r\n\t\t\t\tfeature.name\r\n\t\t\telse\r\n\t\t\t\tfeature.targetFeatureName \r\n\t\t\tendif\r\n\tin if self.alias.oclIsUndefined() then\r\n\t\t\tfeatureName\r\n\t\telse if self.alias <> \'\' then\r\n\t\t\tself.alias\r\n\t\telse\r\n\t\t\tfeatureName\r\n\t\tendif endif\r\nendif'"
	 * @generated
	 */
	String getName();

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
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_DynamicLabel()
	 * @model
	 * @generated
	 */
	ModelLabel getDynamicLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getDynamicLabel <em>Dynamic Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Label</em>' reference.
	 * @see #getDynamicLabel()
	 * @generated
	 */
	void setDynamicLabel(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Use Feature Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Feature Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Feature Source</em>' attribute.
	 * @see #setUseFeatureSource(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_UseFeatureSource()
	 * @model
	 * @generated
	 */
	boolean isUseFeatureSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#isUseFeatureSource <em>Use Feature Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Feature Source</em>' attribute.
	 * @see #isUseFeatureSource()
	 * @generated
	 */
	void setUseFeatureSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Feature</em>' reference.
	 * @see #setOppositeFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceEntityAssociation_OppositeFeature()
	 * @model ordered="false"
	 * @generated
	 */
	ServiceAssociation getOppositeFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation#getOppositeFeature <em>Opposite Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Feature</em>' reference.
	 * @see #getOppositeFeature()
	 * @generated
	 */
	void setOppositeFeature(ServiceAssociation value);

} // ServiceEntityAssociation
