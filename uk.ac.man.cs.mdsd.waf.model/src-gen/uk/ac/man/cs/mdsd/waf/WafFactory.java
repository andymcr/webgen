/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.waf.WafPackage
 * @generated
 */
public interface WafFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WafFactory eINSTANCE = uk.ac.man.cs.mdsd.waf.impl.WafFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	WafModel createWafModel();

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
	 * Returns a new object of class '<em>Select Entity Or View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Entity Or View</em>'.
	 * @generated
	 */
	SelectEntityOrView createSelectEntityOrView();

	/**
	 * Returns a new object of class '<em>Select Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Attribute</em>'.
	 * @generated
	 */
	SelectAttribute createSelectAttribute();

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
	 * Returns a new object of class '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Menu</em>'.
	 * @generated
	 */
	StaticMenu createStaticMenu();

	/**
	 * Returns a new object of class '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Menu</em>'.
	 * @generated
	 */
	DynamicMenu createDynamicMenu();

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
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

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
	 * Returns a new object of class '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Unit</em>'.
	 * @generated
	 */
	StaticUnit createStaticUnit();

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
	 * Returns a new object of class '<em>Child Path Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Path Reference</em>'.
	 * @generated
	 */
	ChildPathReference createChildPathReference();

	/**
	 * Returns a new object of class '<em>Unit Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Attribute</em>'.
	 * @generated
	 */
	UnitAttribute createUnitAttribute();

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
	 * Returns a new object of class '<em>Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Captcha Field</em>'.
	 * @generated
	 */
	CaptchaField createCaptchaField();

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
	 * Returns a new object of class '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Unit</em>'.
	 * @generated
	 */
	MapUnit createMapUnit();

	/**
	 * Returns a new object of class '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Unit</em>'.
	 * @generated
	 */
	UpdateUnit createUpdateUnit();

	/**
	 * Returns a new object of class '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Unit</em>'.
	 * @generated
	 */
	DetailsUnit createDetailsUnit();

	/**
	 * Returns a new object of class '<em>Index Grid Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Grid Unit</em>'.
	 * @generated
	 */
	IndexGridUnit createIndexGridUnit();

	/**
	 * Returns a new object of class '<em>Index Page Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Page Direction Unit</em>'.
	 * @generated
	 */
	IndexPageDirectionUnit createIndexPageDirectionUnit();

	/**
	 * Returns a new object of class '<em>Index Line Direction Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Line Direction Unit</em>'.
	 * @generated
	 */
	IndexLineDirectionUnit createIndexLineDirectionUnit();

	/**
	 * Returns a new object of class '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Unit</em>'.
	 * @generated
	 */
	SearchUnit createSearchUnit();

	/**
	 * Returns a new object of class '<em>Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Unit</em>'.
	 * @generated
	 */
	ActionUnit createActionUnit();

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
	 * Returns a new object of class '<em>Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Reference</em>'.
	 * @generated
	 */
	ParameterReference createParameterReference();

	/**
	 * Returns a new object of class '<em>Route Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Parameter Reference</em>'.
	 * @generated
	 */
	RouteParameterReference createRouteParameterReference();

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
	WafPackage getWafPackage();

} //WafFactory
