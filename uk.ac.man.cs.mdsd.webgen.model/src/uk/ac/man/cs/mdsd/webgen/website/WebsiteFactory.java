/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteFactory.java,v 1.46 2014/08/22 14:32:53 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage
 * @generated
 */
public interface WebsiteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsiteFactory eINSTANCE = uk.ac.man.cs.mdsd.webgen.website.impl.WebsiteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Gen Model</em>'.
	 * @generated
	 */
	WebGenModel createWebGenModel();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	WebsiteProperties createWebsiteProperties();

	/**
	 * Returns a new object of class '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Authentication System</em>'.
	 * @generated
	 */
	LocalAuthenticationSystem createLocalAuthenticationSystem();

	/**
	 * Returns a new object of class '<em>Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cas Authentication</em>'.
	 * @generated
	 */
	CasAuthentication createCasAuthentication();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type</em>'.
	 * @generated
	 */
	EnumerationType createEnumerationType();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Association Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Key</em>'.
	 * @generated
	 */
	AssociationKey createAssociationKey();

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
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter</em>'.
	 * @generated
	 */
	QueryParameter createQueryParameter();

	/**
	 * Returns a new object of class '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Menu</em>'.
	 * @generated
	 */
	StaticMenu createStaticMenu();

	/**
	 * Returns a new object of class '<em>Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Menu Entry</em>'.
	 * @generated
	 */
	ActionMenuEntry createActionMenuEntry();

	/**
	 * Returns a new object of class '<em>Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Static Text Menu Entry</em>'.
	 * @generated
	 */
	EditStaticTextMenuEntry createEditStaticTextMenuEntry();

	/**
	 * Returns a new object of class '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Menu</em>'.
	 * @generated
	 */
	DynamicMenu createDynamicMenu();

	/**
	 * Returns a new object of class '<em>Menu Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Feature</em>'.
	 * @generated
	 */
	MenuFeature createMenuFeature();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Filter Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Parameter</em>'.
	 * @generated
	 */
	FilterParameter createFilterParameter();

	/**
	 * Returns a new object of class '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Link</em>'.
	 * @generated
	 */
	PageLink createPageLink();

	/**
	 * Returns a new object of class '<em>Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Captcha Field</em>'.
	 * @generated
	 */
	CaptchaField createCaptchaField();

	/**
	 * Returns a new object of class '<em>Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Support Action</em>'.
	 * @generated
	 */
	UnitSupportAction createUnitSupportAction();

	/**
	 * Returns a new object of class '<em>Key Actual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Actual</em>'.
	 * @generated
	 */
	KeyActual createKeyActual();

	/**
	 * Returns a new object of class '<em>Singleton Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Unit</em>'.
	 * @generated
	 */
	SingletonUnit createSingletonUnit();

	/**
	 * Returns a new object of class '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Unit</em>'.
	 * @generated
	 */
	CollectionUnit createCollectionUnit();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Selection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Parameter</em>'.
	 * @generated
	 */
	SelectionParameter createSelectionParameter();

	/**
	 * Returns a new object of class '<em>Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Operation</em>'.
	 * @generated
	 */
	BusinessOperation createBusinessOperation();

	/**
	 * Returns a new object of class '<em>Image Manipulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Manipulation</em>'.
	 * @generated
	 */
	ImageManipulation createImageManipulation();

	/**
	 * Returns a new object of class '<em>Thumbnail Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thumbnail Filter</em>'.
	 * @generated
	 */
	ThumbnailFilter createThumbnailFilter();

	/**
	 * Returns a new object of class '<em>Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Unit</em>'.
	 * @generated
	 */
	CreateUnit createCreateUnit();

	/**
	 * Returns a new object of class '<em>Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Update Unit</em>'.
	 * @generated
	 */
	CreateUpdateUnit createCreateUpdateUnit();

	/**
	 * Returns a new object of class '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Unit</em>'.
	 * @generated
	 */
	UpdateUnit createUpdateUnit();

	/**
	 * Returns a new object of class '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Unit</em>'.
	 * @generated
	 */
	MapUnit createMapUnit();

	/**
	 * Returns a new object of class '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Unit</em>'.
	 * @generated
	 */
	StaticUnit createStaticUnit();

	/**
	 * Returns a new object of class '<em>Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Sitemap Unit</em>'.
	 * @generated
	 */
	CreateSitemapUnit createCreateSitemapUnit();

	/**
	 * Returns a new object of class '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Element</em>'.
	 * @generated
	 */
	UnitElement createUnitElement();

	/**
	 * Returns a new object of class '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Association</em>'.
	 * @generated
	 */
	UnitAssociation createUnitAssociation();

	/**
	 * Returns a new object of class '<em>Child Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Attribute</em>'.
	 * @generated
	 */
	ChildAttribute createChildAttribute();

	/**
	 * Returns a new object of class '<em>Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Association</em>'.
	 * @generated
	 */
	ChildAssociation createChildAssociation();

	/**
	 * Returns a new object of class '<em>Image Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Index Unit</em>'.
	 * @generated
	 */
	ImageIndexUnit createImageIndexUnit();

	/**
	 * Returns a new object of class '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Field</em>'.
	 * @generated
	 */
	DataTypeField createDataTypeField();

	/**
	 * Returns a new object of class '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Field</em>'.
	 * @generated
	 */
	DateField createDateField();

	/**
	 * Returns a new object of class '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Unit</em>'.
	 * @generated
	 */
	DetailsUnit createDetailsUnit();

	/**
	 * Returns a new object of class '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Unit</em>'.
	 * @generated
	 */
	IndexUnit createIndexUnit();

	/**
	 * Returns a new object of class '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Unit</em>'.
	 * @generated
	 */
	SearchUnit createSearchUnit();

	/**
	 * Returns a new object of class '<em>Feature Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Path Attribute</em>'.
	 * @generated
	 */
	FeaturePathAttribute createFeaturePathAttribute();

	/**
	 * Returns a new object of class '<em>Feature Path Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Path Association</em>'.
	 * @generated
	 */
	FeaturePathAssociation createFeaturePathAssociation();

	/**
	 * Returns a new object of class '<em>Slider Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slider Unit</em>'.
	 * @generated
	 */
	SliderUnit createSliderUnit();

	/**
	 * Returns a new object of class '<em>Gallery Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gallery Unit</em>'.
	 * @generated
	 */
	GalleryUnit createGalleryUnit();

	/**
	 * Returns a new object of class '<em>Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registration Unit</em>'.
	 * @generated
	 */
	RegistrationUnit createRegistrationUnit();

	/**
	 * Returns a new object of class '<em>Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Unit</em>'.
	 * @generated
	 */
	LoginUnit createLoginUnit();

	/**
	 * Returns a new object of class '<em>Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forgotten Password Unit</em>'.
	 * @generated
	 */
	ForgottenPasswordUnit createForgottenPasswordUnit();

	/**
	 * Returns a new object of class '<em>Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Action</em>'.
	 * @generated
	 */
	SelectAction createSelectAction();

	/**
	 * Returns a new object of class '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Action</em>'.
	 * @generated
	 */
	DeleteAction createDeleteAction();

	/**
	 * Returns a new object of class '<em>Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Support Action</em>'.
	 * @generated
	 */
	FeatureSupportAction createFeatureSupportAction();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	ModelReference createModelReference();

	/**
	 * Returns a new object of class '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Reference</em>'.
	 * @generated
	 */
	FeatureReference createFeatureReference();

	/**
	 * Returns a new object of class '<em>Route Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Parameter Reference</em>'.
	 * @generated
	 */
	RouteParameterReference createRouteParameterReference();

	/**
	 * Returns a new object of class '<em>Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Reference</em>'.
	 * @generated
	 */
	ParameterReference createParameterReference();

	/**
	 * Returns a new object of class '<em>Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current User Reference</em>'.
	 * @generated
	 */
	CurrentUserReference createCurrentUserReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebsitePackage getWebsitePackage();

} //WebsiteFactory
