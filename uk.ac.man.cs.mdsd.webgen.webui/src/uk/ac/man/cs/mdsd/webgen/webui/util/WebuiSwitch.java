/**
 */
package uk.ac.man.cs.mdsd.webgen.webui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.man.cs.mdsd.webgen.base.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.base.NamedElement;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;
import uk.ac.man.cs.mdsd.webgen.expression.Variable;
import uk.ac.man.cs.mdsd.webgen.webui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage
 * @generated
 */
public class WebuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebuiSwitch() {
		if (modelPackage == null) {
			modelPackage = WebuiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebuiPackage.WEB_UI: {
				WebUI webUI = (WebUI)theEObject;
				T result = caseWebUI(webUI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseNamedDisplayElement(menu);
				if (result == null) result = caseNamedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SUBMENU_ENTRY: {
				SubmenuEntry submenuEntry = (SubmenuEntry)theEObject;
				T result = caseSubmenuEntry(submenuEntry);
				if (result == null) result = caseMenu(submenuEntry);
				if (result == null) result = caseMenuEntry(submenuEntry);
				if (result == null) result = caseNamedDisplayElement(submenuEntry);
				if (result == null) result = caseNamedElement(submenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ACTION_MENU_ENTRY: {
				ActionMenuEntry actionMenuEntry = (ActionMenuEntry)theEObject;
				T result = caseActionMenuEntry(actionMenuEntry);
				if (result == null) result = caseMenuEntry(actionMenuEntry);
				if (result == null) result = caseNamedDisplayElement(actionMenuEntry);
				if (result == null) result = caseNamedElement(actionMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.EDIT_STATIC_TEXT_MENU_ENTRY: {
				EditStaticTextMenuEntry editStaticTextMenuEntry = (EditStaticTextMenuEntry)theEObject;
				T result = caseEditStaticTextMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseNamedDisplayElement(editStaticTextMenuEntry);
				if (result == null) result = caseNamedElement(editStaticTextMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MENU_FEATURE: {
				MenuFeature menuFeature = (MenuFeature)theEObject;
				T result = caseMenuFeature(menuFeature);
				if (result == null) result = caseMenuEntry(menuFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.QUERY_PARAMETER: {
				QueryParameter queryParameter = (QueryParameter)theEObject;
				T result = caseQueryParameter(queryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseNamedDisplayElement(page);
				if (result == null) result = caseUnitContainer(page);
				if (result == null) result = caseNamedElement(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.PAGE_LINK: {
				PageLink pageLink = (PageLink)theEObject;
				T result = casePageLink(pageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_CONTAINER: {
				UnitContainer unitContainer = (UnitContainer)theEObject;
				T result = caseUnitContainer(unitContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTENT_UNIT: {
				ContentUnit contentUnit = (ContentUnit)theEObject;
				T result = caseContentUnit(contentUnit);
				if (result == null) result = caseNamedDisplayElement(contentUnit);
				if (result == null) result = caseNamedElement(contentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ROUTE_ACTUAL: {
				RouteActual routeActual = (RouteActual)theEObject;
				T result = caseRouteActual(routeActual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.STATIC_UNIT: {
				StaticUnit staticUnit = (StaticUnit)theEObject;
				T result = caseStaticUnit(staticUnit);
				if (result == null) result = caseContentUnit(staticUnit);
				if (result == null) result = caseNamedDisplayElement(staticUnit);
				if (result == null) result = caseNamedElement(staticUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_SITEMAP_UNIT: {
				CreateSitemapUnit createSitemapUnit = (CreateSitemapUnit)theEObject;
				T result = caseCreateSitemapUnit(createSitemapUnit);
				if (result == null) result = caseContentUnit(createSitemapUnit);
				if (result == null) result = caseNamedDisplayElement(createSitemapUnit);
				if (result == null) result = caseNamedElement(createSitemapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DYNAMIC_UNIT: {
				DynamicUnit dynamicUnit = (DynamicUnit)theEObject;
				T result = caseDynamicUnit(dynamicUnit);
				if (result == null) result = caseContentUnit(dynamicUnit);
				if (result == null) result = caseNamedDisplayElement(dynamicUnit);
				if (result == null) result = caseNamedElement(dynamicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_FIELD: {
				UnitField unitField = (UnitField)theEObject;
				T result = caseUnitField(unitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_FEATURE: {
				UnitFeature unitFeature = (UnitFeature)theEObject;
				T result = caseUnitFeature(unitFeature);
				if (result == null) result = caseUnitField(unitFeature);
				if (result == null) result = caseInlineActionContainer(unitFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_ELEMENT: {
				UnitElement unitElement = (UnitElement)theEObject;
				T result = caseUnitElement(unitElement);
				if (result == null) result = caseUnitFeature(unitElement);
				if (result == null) result = caseUnitField(unitElement);
				if (result == null) result = caseInlineActionContainer(unitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_ASSOCIATION: {
				UnitAssociation unitAssociation = (UnitAssociation)theEObject;
				T result = caseUnitAssociation(unitAssociation);
				if (result == null) result = caseUnitFeature(unitAssociation);
				if (result == null) result = caseUnitContainer(unitAssociation);
				if (result == null) result = caseAssociationReference(unitAssociation);
				if (result == null) result = caseUnitField(unitAssociation);
				if (result == null) result = caseInlineActionContainer(unitAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.ASSOCIATION_REFERENCE: {
				AssociationReference associationReference = (AssociationReference)theEObject;
				T result = caseAssociationReference(associationReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CHILD_PATH: {
				ChildPath childPath = (ChildPath)theEObject;
				T result = caseChildPath(childPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CHILD_PATH_ATTRIBUTE: {
				ChildPathAttribute childPathAttribute = (ChildPathAttribute)theEObject;
				T result = caseChildPathAttribute(childPathAttribute);
				if (result == null) result = caseChildPath(childPathAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CHILD_PATH_ASSOCIATION: {
				ChildPathAssociation childPathAssociation = (ChildPathAssociation)theEObject;
				T result = caseChildPathAssociation(childPathAssociation);
				if (result == null) result = caseChildPath(childPathAssociation);
				if (result == null) result = caseAssociationReference(childPathAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH: {
				FeaturePath featurePath = (FeaturePath)theEObject;
				T result = caseFeaturePath(featurePath);
				if (result == null) result = caseVariable(featurePath);
				if (result == null) result = caseExpression(featurePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_ATTRIBUTE: {
				FeaturePathAttribute featurePathAttribute = (FeaturePathAttribute)theEObject;
				T result = caseFeaturePathAttribute(featurePathAttribute);
				if (result == null) result = caseFeaturePath(featurePathAttribute);
				if (result == null) result = caseVariable(featurePathAttribute);
				if (result == null) result = caseExpression(featurePathAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_ASSOCIATION: {
				FeaturePathAssociation featurePathAssociation = (FeaturePathAssociation)theEObject;
				T result = caseFeaturePathAssociation(featurePathAssociation);
				if (result == null) result = caseFeaturePath(featurePathAssociation);
				if (result == null) result = caseAssociationReference(featurePathAssociation);
				if (result == null) result = caseVariable(featurePathAssociation);
				if (result == null) result = caseExpression(featurePathAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_PATH_LABEL: {
				FeaturePathLabel featurePathLabel = (FeaturePathLabel)theEObject;
				T result = caseFeaturePathLabel(featurePathLabel);
				if (result == null) result = caseFeaturePath(featurePathLabel);
				if (result == null) result = caseVariable(featurePathLabel);
				if (result == null) result = caseExpression(featurePathLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INTERFACE_FIELD: {
				InterfaceField interfaceField = (InterfaceField)theEObject;
				T result = caseInterfaceField(interfaceField);
				if (result == null) result = caseNamedDisplayElement(interfaceField);
				if (result == null) result = caseUnitField(interfaceField);
				if (result == null) result = caseNamedElement(interfaceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATA_TYPE_FIELD: {
				DataTypeField dataTypeField = (DataTypeField)theEObject;
				T result = caseDataTypeField(dataTypeField);
				if (result == null) result = caseInterfaceField(dataTypeField);
				if (result == null) result = caseNamedDisplayElement(dataTypeField);
				if (result == null) result = caseUnitField(dataTypeField);
				if (result == null) result = caseNamedElement(dataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseInterfaceField(dateField);
				if (result == null) result = caseNamedDisplayElement(dateField);
				if (result == null) result = caseUnitField(dateField);
				if (result == null) result = caseNamedElement(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CAPTCHA_FIELD: {
				CaptchaField captchaField = (CaptchaField)theEObject;
				T result = caseCaptchaField(captchaField);
				if (result == null) result = caseInterfaceField(captchaField);
				if (result == null) result = caseNamedDisplayElement(captchaField);
				if (result == null) result = caseUnitField(captchaField);
				if (result == null) result = caseNamedElement(captchaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UNIT_SUPPORT_ACTION: {
				UnitSupportAction unitSupportAction = (UnitSupportAction)theEObject;
				T result = caseUnitSupportAction(unitSupportAction);
				if (result == null) result = caseNamedDisplayElement(unitSupportAction);
				if (result == null) result = caseNamedElement(unitSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SELECTABLE_UNIT: {
				SelectableUnit selectableUnit = (SelectableUnit)theEObject;
				T result = caseSelectableUnit(selectableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SINGLETON_UNIT: {
				SingletonUnit singletonUnit = (SingletonUnit)theEObject;
				T result = caseSingletonUnit(singletonUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.COLLECTION_UNIT: {
				CollectionUnit collectionUnit = (CollectionUnit)theEObject;
				T result = caseCollectionUnit(collectionUnit);
				if (result == null) result = caseSelectableUnit(collectionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.EDIT_UNIT: {
				EditUnit editUnit = (EditUnit)theEObject;
				T result = caseEditUnit(editUnit);
				if (result == null) result = caseDynamicUnit(editUnit);
				if (result == null) result = caseSingletonUnit(editUnit);
				if (result == null) result = caseContentUnit(editUnit);
				if (result == null) result = caseNamedDisplayElement(editUnit);
				if (result == null) result = caseNamedElement(editUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_UNIT: {
				CreateUnit createUnit = (CreateUnit)theEObject;
				T result = caseCreateUnit(createUnit);
				if (result == null) result = caseEditUnit(createUnit);
				if (result == null) result = caseDynamicUnit(createUnit);
				if (result == null) result = caseSingletonUnit(createUnit);
				if (result == null) result = caseContentUnit(createUnit);
				if (result == null) result = caseNamedDisplayElement(createUnit);
				if (result == null) result = caseNamedElement(createUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CREATE_UPDATE_UNIT: {
				CreateUpdateUnit createUpdateUnit = (CreateUpdateUnit)theEObject;
				T result = caseCreateUpdateUnit(createUpdateUnit);
				if (result == null) result = caseEditUnit(createUpdateUnit);
				if (result == null) result = caseSelectableUnit(createUpdateUnit);
				if (result == null) result = caseDynamicUnit(createUpdateUnit);
				if (result == null) result = caseSingletonUnit(createUpdateUnit);
				if (result == null) result = caseContentUnit(createUpdateUnit);
				if (result == null) result = caseNamedDisplayElement(createUpdateUnit);
				if (result == null) result = caseNamedElement(createUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.UPDATE_UNIT: {
				UpdateUnit updateUnit = (UpdateUnit)theEObject;
				T result = caseUpdateUnit(updateUnit);
				if (result == null) result = caseEditUnit(updateUnit);
				if (result == null) result = caseSelectableUnit(updateUnit);
				if (result == null) result = caseDynamicUnit(updateUnit);
				if (result == null) result = caseSingletonUnit(updateUnit);
				if (result == null) result = caseContentUnit(updateUnit);
				if (result == null) result = caseNamedDisplayElement(updateUnit);
				if (result == null) result = caseNamedElement(updateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.MAP_UNIT: {
				MapUnit mapUnit = (MapUnit)theEObject;
				T result = caseMapUnit(mapUnit);
				if (result == null) result = caseEditUnit(mapUnit);
				if (result == null) result = caseSelectableUnit(mapUnit);
				if (result == null) result = caseDynamicUnit(mapUnit);
				if (result == null) result = caseSingletonUnit(mapUnit);
				if (result == null) result = caseContentUnit(mapUnit);
				if (result == null) result = caseNamedDisplayElement(mapUnit);
				if (result == null) result = caseNamedElement(mapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DATA_UNIT: {
				DataUnit dataUnit = (DataUnit)theEObject;
				T result = caseDataUnit(dataUnit);
				if (result == null) result = caseDynamicUnit(dataUnit);
				if (result == null) result = caseContentUnit(dataUnit);
				if (result == null) result = caseNamedDisplayElement(dataUnit);
				if (result == null) result = caseNamedElement(dataUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DETAILS_UNIT: {
				DetailsUnit detailsUnit = (DetailsUnit)theEObject;
				T result = caseDetailsUnit(detailsUnit);
				if (result == null) result = caseDataUnit(detailsUnit);
				if (result == null) result = caseSingletonUnit(detailsUnit);
				if (result == null) result = caseSelectableUnit(detailsUnit);
				if (result == null) result = caseDynamicUnit(detailsUnit);
				if (result == null) result = caseContentUnit(detailsUnit);
				if (result == null) result = caseNamedDisplayElement(detailsUnit);
				if (result == null) result = caseNamedElement(detailsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INDEX_UNIT: {
				IndexUnit indexUnit = (IndexUnit)theEObject;
				T result = caseIndexUnit(indexUnit);
				if (result == null) result = caseDataUnit(indexUnit);
				if (result == null) result = caseCollectionUnit(indexUnit);
				if (result == null) result = caseInlineActionContainer(indexUnit);
				if (result == null) result = caseDynamicUnit(indexUnit);
				if (result == null) result = caseSelectableUnit(indexUnit);
				if (result == null) result = caseContentUnit(indexUnit);
				if (result == null) result = caseNamedDisplayElement(indexUnit);
				if (result == null) result = caseNamedElement(indexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.CONTROL_UNIT: {
				ControlUnit controlUnit = (ControlUnit)theEObject;
				T result = caseControlUnit(controlUnit);
				if (result == null) result = caseDynamicUnit(controlUnit);
				if (result == null) result = caseContentUnit(controlUnit);
				if (result == null) result = caseNamedDisplayElement(controlUnit);
				if (result == null) result = caseNamedElement(controlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SEARCH_UNIT: {
				SearchUnit searchUnit = (SearchUnit)theEObject;
				T result = caseSearchUnit(searchUnit);
				if (result == null) result = caseControlUnit(searchUnit);
				if (result == null) result = caseDynamicUnit(searchUnit);
				if (result == null) result = caseContentUnit(searchUnit);
				if (result == null) result = caseNamedDisplayElement(searchUnit);
				if (result == null) result = caseNamedElement(searchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.IMAGE_UNIT: {
				ImageUnit imageUnit = (ImageUnit)theEObject;
				T result = caseImageUnit(imageUnit);
				if (result == null) result = caseDynamicUnit(imageUnit);
				if (result == null) result = caseCollectionUnit(imageUnit);
				if (result == null) result = caseContentUnit(imageUnit);
				if (result == null) result = caseSelectableUnit(imageUnit);
				if (result == null) result = caseNamedDisplayElement(imageUnit);
				if (result == null) result = caseNamedElement(imageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.IMAGE_INDEX_UNIT: {
				ImageIndexUnit imageIndexUnit = (ImageIndexUnit)theEObject;
				T result = caseImageIndexUnit(imageIndexUnit);
				if (result == null) result = caseImageUnit(imageIndexUnit);
				if (result == null) result = caseInlineActionContainer(imageIndexUnit);
				if (result == null) result = caseDynamicUnit(imageIndexUnit);
				if (result == null) result = caseCollectionUnit(imageIndexUnit);
				if (result == null) result = caseContentUnit(imageIndexUnit);
				if (result == null) result = caseSelectableUnit(imageIndexUnit);
				if (result == null) result = caseNamedDisplayElement(imageIndexUnit);
				if (result == null) result = caseNamedElement(imageIndexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SLIDER_UNIT: {
				SliderUnit sliderUnit = (SliderUnit)theEObject;
				T result = caseSliderUnit(sliderUnit);
				if (result == null) result = caseImageUnit(sliderUnit);
				if (result == null) result = caseDynamicUnit(sliderUnit);
				if (result == null) result = caseCollectionUnit(sliderUnit);
				if (result == null) result = caseContentUnit(sliderUnit);
				if (result == null) result = caseSelectableUnit(sliderUnit);
				if (result == null) result = caseNamedDisplayElement(sliderUnit);
				if (result == null) result = caseNamedElement(sliderUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.GALLERY_UNIT: {
				GalleryUnit galleryUnit = (GalleryUnit)theEObject;
				T result = caseGalleryUnit(galleryUnit);
				if (result == null) result = caseImageUnit(galleryUnit);
				if (result == null) result = caseDynamicUnit(galleryUnit);
				if (result == null) result = caseCollectionUnit(galleryUnit);
				if (result == null) result = caseContentUnit(galleryUnit);
				if (result == null) result = caseSelectableUnit(galleryUnit);
				if (result == null) result = caseNamedDisplayElement(galleryUnit);
				if (result == null) result = caseNamedElement(galleryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.AUTHENTICATION_UNIT: {
				AuthenticationUnit authenticationUnit = (AuthenticationUnit)theEObject;
				T result = caseAuthenticationUnit(authenticationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.REGISTRATION_UNIT: {
				RegistrationUnit registrationUnit = (RegistrationUnit)theEObject;
				T result = caseRegistrationUnit(registrationUnit);
				if (result == null) result = caseAuthenticationUnit(registrationUnit);
				if (result == null) result = caseControlUnit(registrationUnit);
				if (result == null) result = caseDynamicUnit(registrationUnit);
				if (result == null) result = caseContentUnit(registrationUnit);
				if (result == null) result = caseNamedDisplayElement(registrationUnit);
				if (result == null) result = caseNamedElement(registrationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.LOGIN_UNIT: {
				LoginUnit loginUnit = (LoginUnit)theEObject;
				T result = caseLoginUnit(loginUnit);
				if (result == null) result = caseAuthenticationUnit(loginUnit);
				if (result == null) result = caseControlUnit(loginUnit);
				if (result == null) result = caseDynamicUnit(loginUnit);
				if (result == null) result = caseContentUnit(loginUnit);
				if (result == null) result = caseNamedDisplayElement(loginUnit);
				if (result == null) result = caseNamedElement(loginUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FORGOTTEN_PASSWORD_UNIT: {
				ForgottenPasswordUnit forgottenPasswordUnit = (ForgottenPasswordUnit)theEObject;
				T result = caseForgottenPasswordUnit(forgottenPasswordUnit);
				if (result == null) result = caseAuthenticationUnit(forgottenPasswordUnit);
				if (result == null) result = caseControlUnit(forgottenPasswordUnit);
				if (result == null) result = caseDynamicUnit(forgottenPasswordUnit);
				if (result == null) result = caseContentUnit(forgottenPasswordUnit);
				if (result == null) result = caseNamedDisplayElement(forgottenPasswordUnit);
				if (result == null) result = caseNamedElement(forgottenPasswordUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INLINE_ACTION_CONTAINER: {
				InlineActionContainer inlineActionContainer = (InlineActionContainer)theEObject;
				T result = caseInlineActionContainer(inlineActionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.INLINE_ACTION: {
				InlineAction inlineAction = (InlineAction)theEObject;
				T result = caseInlineAction(inlineAction);
				if (result == null) result = caseNamedDisplayElement(inlineAction);
				if (result == null) result = caseNamedElement(inlineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.SELECT_ACTION: {
				SelectAction selectAction = (SelectAction)theEObject;
				T result = caseSelectAction(selectAction);
				if (result == null) result = caseInlineAction(selectAction);
				if (result == null) result = caseNamedDisplayElement(selectAction);
				if (result == null) result = caseNamedElement(selectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.DELETE_ACTION: {
				DeleteAction deleteAction = (DeleteAction)theEObject;
				T result = caseDeleteAction(deleteAction);
				if (result == null) result = caseInlineAction(deleteAction);
				if (result == null) result = caseNamedDisplayElement(deleteAction);
				if (result == null) result = caseNamedElement(deleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.FEATURE_SUPPORT_ACTION: {
				FeatureSupportAction featureSupportAction = (FeatureSupportAction)theEObject;
				T result = caseFeatureSupportAction(featureSupportAction);
				if (result == null) result = caseInlineAction(featureSupportAction);
				if (result == null) result = caseNamedDisplayElement(featureSupportAction);
				if (result == null) result = caseNamedElement(featureSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebuiPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebUI(WebUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submenu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submenu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmenuEntry(SubmenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMenuEntry(ActionMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Static Text Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuFeature(MenuFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParameter(QueryParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageLink(PageLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitContainer(UnitContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentUnit(ContentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Actual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Actual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteActual(RouteActual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticUnit(StaticUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Sitemap Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateSitemapUnit(CreateSitemapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicUnit(DynamicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitField(UnitField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitFeature(UnitFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitElement(UnitElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitAssociation(UnitAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationReference(AssociationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceField(InterfaceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeField(DataTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Captcha Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Captcha Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptchaField(CaptchaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitSupportAction(UnitSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selectable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selectable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectableUnit(SelectableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonUnit(SingletonUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionUnit(CollectionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditUnit(EditUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUnit(CreateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateUpdateUnit(CreateUpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateUnit(UpdateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapUnit(MapUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataUnit(DataUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsUnit(DetailsUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexUnit(IndexUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlUnit(ControlUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchUnit(SearchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageUnit(ImageUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePath(FeaturePath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathAttribute(FeaturePathAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathAssociation(FeaturePathAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathLabel(FeaturePathLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPath(ChildPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPathAttribute(ChildPathAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPathAssociation(ChildPathAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Index Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Index Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageIndexUnit(ImageIndexUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliderUnit(SliderUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gallery Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gallery Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalleryUnit(GalleryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationUnit(AuthenticationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registration Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistrationUnit(RegistrationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginUnit(LoginUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forgotten Password Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Action Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Action Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineActionContainer(InlineActionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineAction(InlineAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectAction(SelectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Support Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Support Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSupportAction(FeatureSupportAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDisplayElement(NamedDisplayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebuiSwitch
