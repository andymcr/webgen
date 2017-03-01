/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label</em>'.
	 * @generated
	 */
	ModelLabel createModelLabel();

	/**
	 * Returns a new object of class '<em>Model Label Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label Attribute</em>'.
	 * @generated
	 */
	ModelLabelAttribute createModelLabelAttribute();

	/**
	 * Returns a new object of class '<em>Model Label Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label Association</em>'.
	 * @generated
	 */
	ModelLabelAssociation createModelLabelAssociation();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Attribute</em>'.
	 * @generated
	 */
	DataTypeAttribute createDataTypeAttribute();

	/**
	 * Returns a new object of class '<em>Date Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Attribute</em>'.
	 * @generated
	 */
	DateAttribute createDateAttribute();

	/**
	 * Returns a new object of class '<em>Url Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url Attribute</em>'.
	 * @generated
	 */
	UrlAttribute createUrlAttribute();

	/**
	 * Returns a new object of class '<em>Static Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Path Element</em>'.
	 * @generated
	 */
	StaticPathElement createStaticPathElement();

	/**
	 * Returns a new object of class '<em>Date Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Path Element</em>'.
	 * @generated
	 */
	DatePathElement createDatePathElement();

	/**
	 * Returns a new object of class '<em>File Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Attribute</em>'.
	 * @generated
	 */
	FileAttribute createFileAttribute();

	/**
	 * Returns a new object of class '<em>Image Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Attribute</em>'.
	 * @generated
	 */
	ImageAttribute createImageAttribute();

	/**
	 * Returns a new object of class '<em>Location Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Attribute</em>'.
	 * @generated
	 */
	LocationAttribute createLocationAttribute();

	/**
	 * Returns a new object of class '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Without Containment</em>'.
	 * @generated
	 */
	AssociationWithoutContainment createAssociationWithoutContainment();

	/**
	 * Returns a new object of class '<em>Association With Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association With Containment</em>'.
	 * @generated
	 */
	AssociationWithContainment createAssociationWithContainment();

	/**
	 * Returns a new object of class '<em>Association Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Key</em>'.
	 * @generated
	 */
	AssociationKey createAssociationKey();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Encapsulated Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encapsulated Feature</em>'.
	 * @generated
	 */
	EncapsulatedFeature createEncapsulatedFeature();

	/**
	 * Returns a new object of class '<em>Encapsulated Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encapsulated Attribute</em>'.
	 * @generated
	 */
	EncapsulatedAttribute createEncapsulatedAttribute();

	/**
	 * Returns a new object of class '<em>Encapsulated Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encapsulated Association</em>'.
	 * @generated
	 */
	EncapsulatedAssociation createEncapsulatedAssociation();

	/**
	 * Returns a new object of class '<em>View Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Association</em>'.
	 * @generated
	 */
	ViewAssociation createViewAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory
