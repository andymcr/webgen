/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteSwitch.java,v 1.59 2014/08/22 14:32:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.criteria.Path;
import uk.ac.man.cs.mdsd.webgen.website.*;

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
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage
 * @generated
 */
public class WebsiteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebsitePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteSwitch() {
		if (modelPackage == null) {
			modelPackage = WebsitePackage.eINSTANCE;
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
			case WebsitePackage.WEB_GEN_MODEL: {
				WebGenModel webGenModel = (WebGenModel)theEObject;
				T result = caseWebGenModel(webGenModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.WEBSITE_PROPERTIES: {
				WebsiteProperties websiteProperties = (WebsiteProperties)theEObject;
				T result = caseWebsiteProperties(websiteProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.AUTHENTICATION: {
				Authentication authentication = (Authentication)theEObject;
				T result = caseAuthentication(authentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.LOCAL_AUTHENTICATION_SYSTEM: {
				LocalAuthenticationSystem localAuthenticationSystem = (LocalAuthenticationSystem)theEObject;
				T result = caseLocalAuthenticationSystem(localAuthenticationSystem);
				if (result == null) result = caseAuthentication(localAuthenticationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CAS_AUTHENTICATION: {
				CasAuthentication casAuthentication = (CasAuthentication)theEObject;
				T result = caseCasAuthentication(casAuthentication);
				if (result == null) result = caseAuthentication(casAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.NAMED_DISPLAY_ELEMENT: {
				NamedDisplayElement namedDisplayElement = (NamedDisplayElement)theEObject;
				T result = caseNamedDisplayElement(namedDisplayElement);
				if (result == null) result = caseNamedElement(namedDisplayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamedDisplayElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamedDisplayElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseDataType(enumerationType);
				if (result == null) result = caseClassifier(enumerationType);
				if (result == null) result = caseNamedDisplayElement(enumerationType);
				if (result == null) result = caseNamedElement(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedDisplayElement(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENTITY_OR_VIEW: {
				EntityOrView entityOrView = (EntityOrView)theEObject;
				T result = caseEntityOrView(entityOrView);
				if (result == null) result = caseClassifier(entityOrView);
				if (result == null) result = caseSelectionField(entityOrView);
				if (result == null) result = caseNamedDisplayElement(entityOrView);
				if (result == null) result = caseNamedElement(entityOrView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseLabel(attribute);
				if (result == null) result = caseSelectionField(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseFeature(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MODEL_LABEL: {
				ModelLabel modelLabel = (ModelLabel)theEObject;
				T result = caseModelLabel(modelLabel);
				if (result == null) result = caseNamedElement(modelLabel);
				if (result == null) result = caseLabel(modelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MODEL_LABEL_FEATURE: {
				ModelLabelFeature modelLabelFeature = (ModelLabelFeature)theEObject;
				T result = caseModelLabelFeature(modelLabelFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MODEL_LABEL_ATTRIBUTE: {
				ModelLabelAttribute modelLabelAttribute = (ModelLabelAttribute)theEObject;
				T result = caseModelLabelAttribute(modelLabelAttribute);
				if (result == null) result = caseModelLabelFeature(modelLabelAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MODEL_LABEL_ASSOCIATION: {
				ModelLabelAssociation modelLabelAssociation = (ModelLabelAssociation)theEObject;
				T result = caseModelLabelAssociation(modelLabelAssociation);
				if (result == null) result = caseModelLabelFeature(modelLabelAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseEntityOrView(entity);
				if (result == null) result = caseClassifier(entity);
				if (result == null) result = caseSelectionField(entity);
				if (result == null) result = caseNamedDisplayElement(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENTITY_FEATURE: {
				EntityFeature entityFeature = (EntityFeature)theEObject;
				T result = caseEntityFeature(entityFeature);
				if (result == null) result = caseNamedDisplayElement(entityFeature);
				if (result == null) result = caseFeature(entityFeature);
				if (result == null) result = caseNamedElement(entityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENTITY_ATTRIBUTE: {
				EntityAttribute entityAttribute = (EntityAttribute)theEObject;
				T result = caseEntityAttribute(entityAttribute);
				if (result == null) result = caseEntityFeature(entityAttribute);
				if (result == null) result = caseAttribute(entityAttribute);
				if (result == null) result = caseNamedDisplayElement(entityAttribute);
				if (result == null) result = caseFeature(entityAttribute);
				if (result == null) result = caseLabel(entityAttribute);
				if (result == null) result = caseSelectionField(entityAttribute);
				if (result == null) result = caseNamedElement(entityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATA_TYPE_ATTRIBUTE: {
				DataTypeAttribute dataTypeAttribute = (DataTypeAttribute)theEObject;
				T result = caseDataTypeAttribute(dataTypeAttribute);
				if (result == null) result = caseEntityAttribute(dataTypeAttribute);
				if (result == null) result = caseEntityFeature(dataTypeAttribute);
				if (result == null) result = caseAttribute(dataTypeAttribute);
				if (result == null) result = caseNamedDisplayElement(dataTypeAttribute);
				if (result == null) result = caseFeature(dataTypeAttribute);
				if (result == null) result = caseLabel(dataTypeAttribute);
				if (result == null) result = caseSelectionField(dataTypeAttribute);
				if (result == null) result = caseNamedElement(dataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATE_ATTRIBUTE: {
				DateAttribute dateAttribute = (DateAttribute)theEObject;
				T result = caseDateAttribute(dateAttribute);
				if (result == null) result = caseEntityAttribute(dateAttribute);
				if (result == null) result = caseEntityFeature(dateAttribute);
				if (result == null) result = caseAttribute(dateAttribute);
				if (result == null) result = caseNamedDisplayElement(dateAttribute);
				if (result == null) result = caseFeature(dateAttribute);
				if (result == null) result = caseLabel(dateAttribute);
				if (result == null) result = caseSelectionField(dateAttribute);
				if (result == null) result = caseNamedElement(dateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.URL_ATTRIBUTE: {
				UrlAttribute urlAttribute = (UrlAttribute)theEObject;
				T result = caseUrlAttribute(urlAttribute);
				if (result == null) result = caseEntityAttribute(urlAttribute);
				if (result == null) result = caseEntityFeature(urlAttribute);
				if (result == null) result = caseAttribute(urlAttribute);
				if (result == null) result = caseNamedDisplayElement(urlAttribute);
				if (result == null) result = caseFeature(urlAttribute);
				if (result == null) result = caseLabel(urlAttribute);
				if (result == null) result = caseSelectionField(urlAttribute);
				if (result == null) result = caseNamedElement(urlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.RESOURCE_ATTRIBUTE: {
				ResourceAttribute resourceAttribute = (ResourceAttribute)theEObject;
				T result = caseResourceAttribute(resourceAttribute);
				if (result == null) result = caseEntityAttribute(resourceAttribute);
				if (result == null) result = caseEntityFeature(resourceAttribute);
				if (result == null) result = caseAttribute(resourceAttribute);
				if (result == null) result = caseNamedDisplayElement(resourceAttribute);
				if (result == null) result = caseFeature(resourceAttribute);
				if (result == null) result = caseLabel(resourceAttribute);
				if (result == null) result = caseSelectionField(resourceAttribute);
				if (result == null) result = caseNamedElement(resourceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PATH_ELEMENT: {
				PathElement pathElement = (PathElement)theEObject;
				T result = casePathElement(pathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.STATIC_PATH_ELEMENT: {
				StaticPathElement staticPathElement = (StaticPathElement)theEObject;
				T result = caseStaticPathElement(staticPathElement);
				if (result == null) result = casePathElement(staticPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATE_PATH_ELEMENT: {
				DatePathElement datePathElement = (DatePathElement)theEObject;
				T result = caseDatePathElement(datePathElement);
				if (result == null) result = casePathElement(datePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FILE_ATTRIBUTE: {
				FileAttribute fileAttribute = (FileAttribute)theEObject;
				T result = caseFileAttribute(fileAttribute);
				if (result == null) result = caseResourceAttribute(fileAttribute);
				if (result == null) result = caseEntityAttribute(fileAttribute);
				if (result == null) result = caseEntityFeature(fileAttribute);
				if (result == null) result = caseAttribute(fileAttribute);
				if (result == null) result = caseNamedDisplayElement(fileAttribute);
				if (result == null) result = caseFeature(fileAttribute);
				if (result == null) result = caseLabel(fileAttribute);
				if (result == null) result = caseSelectionField(fileAttribute);
				if (result == null) result = caseNamedElement(fileAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.IMAGE_ATTRIBUTE: {
				ImageAttribute imageAttribute = (ImageAttribute)theEObject;
				T result = caseImageAttribute(imageAttribute);
				if (result == null) result = caseResourceAttribute(imageAttribute);
				if (result == null) result = caseEntityAttribute(imageAttribute);
				if (result == null) result = caseEntityFeature(imageAttribute);
				if (result == null) result = caseAttribute(imageAttribute);
				if (result == null) result = caseNamedDisplayElement(imageAttribute);
				if (result == null) result = caseFeature(imageAttribute);
				if (result == null) result = caseLabel(imageAttribute);
				if (result == null) result = caseSelectionField(imageAttribute);
				if (result == null) result = caseNamedElement(imageAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.LOCATION_ATTRIBUTE: {
				LocationAttribute locationAttribute = (LocationAttribute)theEObject;
				T result = caseLocationAttribute(locationAttribute);
				if (result == null) result = caseEntityAttribute(locationAttribute);
				if (result == null) result = caseEntityFeature(locationAttribute);
				if (result == null) result = caseAttribute(locationAttribute);
				if (result == null) result = caseNamedDisplayElement(locationAttribute);
				if (result == null) result = caseFeature(locationAttribute);
				if (result == null) result = caseLabel(locationAttribute);
				if (result == null) result = caseSelectionField(locationAttribute);
				if (result == null) result = caseNamedElement(locationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENTITY_ASSOCIATION: {
				EntityAssociation entityAssociation = (EntityAssociation)theEObject;
				T result = caseEntityAssociation(entityAssociation);
				if (result == null) result = caseEntityFeature(entityAssociation);
				if (result == null) result = caseAssociation(entityAssociation);
				if (result == null) result = caseNamedDisplayElement(entityAssociation);
				if (result == null) result = caseFeature(entityAssociation);
				if (result == null) result = caseNamedElement(entityAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ASSOCIATION_WITHOUT_CONTAINMENT: {
				AssociationWithoutContainment associationWithoutContainment = (AssociationWithoutContainment)theEObject;
				T result = caseAssociationWithoutContainment(associationWithoutContainment);
				if (result == null) result = caseEntityAssociation(associationWithoutContainment);
				if (result == null) result = caseEntityFeature(associationWithoutContainment);
				if (result == null) result = caseAssociation(associationWithoutContainment);
				if (result == null) result = caseNamedDisplayElement(associationWithoutContainment);
				if (result == null) result = caseFeature(associationWithoutContainment);
				if (result == null) result = caseNamedElement(associationWithoutContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ASSOCIATION_WITH_CONTAINMENT: {
				AssociationWithContainment associationWithContainment = (AssociationWithContainment)theEObject;
				T result = caseAssociationWithContainment(associationWithContainment);
				if (result == null) result = caseEntityAssociation(associationWithContainment);
				if (result == null) result = caseEntityFeature(associationWithContainment);
				if (result == null) result = caseAssociation(associationWithContainment);
				if (result == null) result = caseNamedDisplayElement(associationWithContainment);
				if (result == null) result = caseFeature(associationWithContainment);
				if (result == null) result = caseNamedElement(associationWithContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ASSOCIATION_KEY: {
				AssociationKey associationKey = (AssociationKey)theEObject;
				T result = caseAssociationKey(associationKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseEntityOrView(view);
				if (result == null) result = caseClassifier(view);
				if (result == null) result = caseSelectionField(view);
				if (result == null) result = caseNamedDisplayElement(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.VIEW_FEATURE: {
				ViewFeature viewFeature = (ViewFeature)theEObject;
				T result = caseViewFeature(viewFeature);
				if (result == null) result = caseFeature(viewFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENCAPSULATED_FEATURE: {
				EncapsulatedFeature encapsulatedFeature = (EncapsulatedFeature)theEObject;
				T result = caseEncapsulatedFeature(encapsulatedFeature);
				if (result == null) result = caseViewFeature(encapsulatedFeature);
				if (result == null) result = caseFeature(encapsulatedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENCAPSULATED_ATTRIBUTE: {
				EncapsulatedAttribute encapsulatedAttribute = (EncapsulatedAttribute)theEObject;
				T result = caseEncapsulatedAttribute(encapsulatedAttribute);
				if (result == null) result = caseEncapsulatedFeature(encapsulatedAttribute);
				if (result == null) result = caseAttribute(encapsulatedAttribute);
				if (result == null) result = caseViewFeature(encapsulatedAttribute);
				if (result == null) result = caseLabel(encapsulatedAttribute);
				if (result == null) result = caseSelectionField(encapsulatedAttribute);
				if (result == null) result = caseFeature(encapsulatedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ENCAPSULATED_ASSOCIATION: {
				EncapsulatedAssociation encapsulatedAssociation = (EncapsulatedAssociation)theEObject;
				T result = caseEncapsulatedAssociation(encapsulatedAssociation);
				if (result == null) result = caseEncapsulatedFeature(encapsulatedAssociation);
				if (result == null) result = caseAssociation(encapsulatedAssociation);
				if (result == null) result = caseViewFeature(encapsulatedAssociation);
				if (result == null) result = caseFeature(encapsulatedAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.VIEW_ASSOCIATION: {
				ViewAssociation viewAssociation = (ViewAssociation)theEObject;
				T result = caseViewAssociation(viewAssociation);
				if (result == null) result = caseNamedDisplayElement(viewAssociation);
				if (result == null) result = caseViewFeature(viewAssociation);
				if (result == null) result = caseAssociation(viewAssociation);
				if (result == null) result = caseNamedElement(viewAssociation);
				if (result == null) result = caseFeature(viewAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseNamedElement(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SELECTION_FIELD: {
				SelectionField selectionField = (SelectionField)theEObject;
				T result = caseSelectionField(selectionField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SELECTION_PARAMETER: {
				SelectionParameter selectionParameter = (SelectionParameter)theEObject;
				T result = caseSelectionParameter(selectionParameter);
				if (result == null) result = caseNamedElement(selectionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.BUSINESS_OPERATION: {
				BusinessOperation businessOperation = (BusinessOperation)theEObject;
				T result = caseBusinessOperation(businessOperation);
				if (result == null) result = caseNamedElement(businessOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseNamedDisplayElement(page);
				if (result == null) result = caseUnitContainer(page);
				if (result == null) result = caseNamedElement(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PAGE_LINK: {
				PageLink pageLink = (PageLink)theEObject;
				T result = casePageLink(pageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseNamedDisplayElement(menu);
				if (result == null) result = caseNamedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.STATIC_MENU: {
				StaticMenu staticMenu = (StaticMenu)theEObject;
				T result = caseStaticMenu(staticMenu);
				if (result == null) result = caseMenu(staticMenu);
				if (result == null) result = caseNamedDisplayElement(staticMenu);
				if (result == null) result = caseNamedElement(staticMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ACTION_MENU_ENTRY: {
				ActionMenuEntry actionMenuEntry = (ActionMenuEntry)theEObject;
				T result = caseActionMenuEntry(actionMenuEntry);
				if (result == null) result = caseMenuEntry(actionMenuEntry);
				if (result == null) result = caseNamedDisplayElement(actionMenuEntry);
				if (result == null) result = caseNamedElement(actionMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.EDIT_STATIC_TEXT_MENU_ENTRY: {
				EditStaticTextMenuEntry editStaticTextMenuEntry = (EditStaticTextMenuEntry)theEObject;
				T result = caseEditStaticTextMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseMenuEntry(editStaticTextMenuEntry);
				if (result == null) result = caseNamedDisplayElement(editStaticTextMenuEntry);
				if (result == null) result = caseNamedElement(editStaticTextMenuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DYNAMIC_MENU: {
				DynamicMenu dynamicMenu = (DynamicMenu)theEObject;
				T result = caseDynamicMenu(dynamicMenu);
				if (result == null) result = caseMenu(dynamicMenu);
				if (result == null) result = caseNamedDisplayElement(dynamicMenu);
				if (result == null) result = caseNamedElement(dynamicMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MENU_FEATURE: {
				MenuFeature menuFeature = (MenuFeature)theEObject;
				T result = caseMenuFeature(menuFeature);
				if (result == null) result = caseMenuEntry(menuFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseNamedDisplayElement(filter);
				if (result == null) result = caseNamedElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FILTER_PARAMETER: {
				FilterParameter filterParameter = (FilterParameter)theEObject;
				T result = caseFilterParameter(filterParameter);
				if (result == null) result = caseNamedElement(filterParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.QUERY_PARAMETER: {
				QueryParameter queryParameter = (QueryParameter)theEObject;
				T result = caseQueryParameter(queryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SELECTABLE: {
				Selectable selectable = (Selectable)theEObject;
				T result = caseSelectable(selectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_CONTAINER: {
				UnitContainer unitContainer = (UnitContainer)theEObject;
				T result = caseUnitContainer(unitContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CONTENT_UNIT: {
				ContentUnit contentUnit = (ContentUnit)theEObject;
				T result = caseContentUnit(contentUnit);
				if (result == null) result = caseNamedDisplayElement(contentUnit);
				if (result == null) result = caseNamedElement(contentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.STATIC_UNIT: {
				StaticUnit staticUnit = (StaticUnit)theEObject;
				T result = caseStaticUnit(staticUnit);
				if (result == null) result = caseContentUnit(staticUnit);
				if (result == null) result = caseNamedDisplayElement(staticUnit);
				if (result == null) result = caseNamedElement(staticUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CREATE_SITEMAP_UNIT: {
				CreateSitemapUnit createSitemapUnit = (CreateSitemapUnit)theEObject;
				T result = caseCreateSitemapUnit(createSitemapUnit);
				if (result == null) result = caseContentUnit(createSitemapUnit);
				if (result == null) result = caseNamedDisplayElement(createSitemapUnit);
				if (result == null) result = caseNamedElement(createSitemapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DYNAMIC_UNIT: {
				DynamicUnit dynamicUnit = (DynamicUnit)theEObject;
				T result = caseDynamicUnit(dynamicUnit);
				if (result == null) result = caseContentUnit(dynamicUnit);
				if (result == null) result = caseNamedDisplayElement(dynamicUnit);
				if (result == null) result = caseNamedElement(dynamicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_FIELD: {
				UnitField unitField = (UnitField)theEObject;
				T result = caseUnitField(unitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_FEATURE: {
				UnitFeature unitFeature = (UnitFeature)theEObject;
				T result = caseUnitFeature(unitFeature);
				if (result == null) result = caseUnitField(unitFeature);
				if (result == null) result = caseInlineActionContainer(unitFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_ELEMENT: {
				UnitElement unitElement = (UnitElement)theEObject;
				T result = caseUnitElement(unitElement);
				if (result == null) result = caseUnitFeature(unitElement);
				if (result == null) result = caseUnitField(unitElement);
				if (result == null) result = caseInlineActionContainer(unitElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PATH_ASSOCIATION_ELEMENT: {
				PathAssociationElement pathAssociationElement = (PathAssociationElement)theEObject;
				T result = casePathAssociationElement(pathAssociationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_ASSOCIATION: {
				UnitAssociation unitAssociation = (UnitAssociation)theEObject;
				T result = caseUnitAssociation(unitAssociation);
				if (result == null) result = caseUnitFeature(unitAssociation);
				if (result == null) result = caseUnitContainer(unitAssociation);
				if (result == null) result = casePathAssociationElement(unitAssociation);
				if (result == null) result = caseUnitField(unitAssociation);
				if (result == null) result = caseInlineActionContainer(unitAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CHILD_FEATURE: {
				ChildFeature childFeature = (ChildFeature)theEObject;
				T result = caseChildFeature(childFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CHILD_ATTRIBUTE: {
				ChildAttribute childAttribute = (ChildAttribute)theEObject;
				T result = caseChildAttribute(childAttribute);
				if (result == null) result = caseChildFeature(childAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CHILD_ASSOCIATION: {
				ChildAssociation childAssociation = (ChildAssociation)theEObject;
				T result = caseChildAssociation(childAssociation);
				if (result == null) result = caseChildFeature(childAssociation);
				if (result == null) result = casePathAssociationElement(childAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.INTERFACE_FIELD: {
				InterfaceField interfaceField = (InterfaceField)theEObject;
				T result = caseInterfaceField(interfaceField);
				if (result == null) result = caseNamedDisplayElement(interfaceField);
				if (result == null) result = caseUnitField(interfaceField);
				if (result == null) result = caseNamedElement(interfaceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATA_TYPE_FIELD: {
				DataTypeField dataTypeField = (DataTypeField)theEObject;
				T result = caseDataTypeField(dataTypeField);
				if (result == null) result = caseInterfaceField(dataTypeField);
				if (result == null) result = caseNamedDisplayElement(dataTypeField);
				if (result == null) result = caseUnitField(dataTypeField);
				if (result == null) result = caseNamedElement(dataTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseInterfaceField(dateField);
				if (result == null) result = caseNamedDisplayElement(dateField);
				if (result == null) result = caseUnitField(dateField);
				if (result == null) result = caseNamedElement(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CAPTCHA_FIELD: {
				CaptchaField captchaField = (CaptchaField)theEObject;
				T result = caseCaptchaField(captchaField);
				if (result == null) result = caseInterfaceField(captchaField);
				if (result == null) result = caseNamedDisplayElement(captchaField);
				if (result == null) result = caseUnitField(captchaField);
				if (result == null) result = caseNamedElement(captchaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UNIT_SUPPORT_ACTION: {
				UnitSupportAction unitSupportAction = (UnitSupportAction)theEObject;
				T result = caseUnitSupportAction(unitSupportAction);
				if (result == null) result = caseNamedDisplayElement(unitSupportAction);
				if (result == null) result = caseNamedElement(unitSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PATH_REFERENCE_ELEMENT: {
				PathReferenceElement pathReferenceElement = (PathReferenceElement)theEObject;
				T result = casePathReferenceElement(pathReferenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.KEY_ACTUAL: {
				KeyActual keyActual = (KeyActual)theEObject;
				T result = caseKeyActual(keyActual);
				if (result == null) result = casePathReferenceElement(keyActual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CHILD_PATH_REFERENCE: {
				ChildPathReference childPathReference = (ChildPathReference)theEObject;
				T result = caseChildPathReference(childPathReference);
				if (result == null) result = casePathReferenceElement(childPathReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.EDIT_UNIT: {
				EditUnit editUnit = (EditUnit)theEObject;
				T result = caseEditUnit(editUnit);
				if (result == null) result = caseDynamicUnit(editUnit);
				if (result == null) result = caseContentUnit(editUnit);
				if (result == null) result = caseNamedDisplayElement(editUnit);
				if (result == null) result = caseNamedElement(editUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CREATE_UNIT: {
				CreateUnit createUnit = (CreateUnit)theEObject;
				T result = caseCreateUnit(createUnit);
				if (result == null) result = caseEditUnit(createUnit);
				if (result == null) result = caseDynamicUnit(createUnit);
				if (result == null) result = caseContentUnit(createUnit);
				if (result == null) result = caseNamedDisplayElement(createUnit);
				if (result == null) result = caseNamedElement(createUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CREATE_UPDATE_UNIT: {
				CreateUpdateUnit createUpdateUnit = (CreateUpdateUnit)theEObject;
				T result = caseCreateUpdateUnit(createUpdateUnit);
				if (result == null) result = caseEditUnit(createUpdateUnit);
				if (result == null) result = caseSelectable(createUpdateUnit);
				if (result == null) result = caseDynamicUnit(createUpdateUnit);
				if (result == null) result = caseContentUnit(createUpdateUnit);
				if (result == null) result = caseNamedDisplayElement(createUpdateUnit);
				if (result == null) result = caseNamedElement(createUpdateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.UPDATE_UNIT: {
				UpdateUnit updateUnit = (UpdateUnit)theEObject;
				T result = caseUpdateUnit(updateUnit);
				if (result == null) result = caseEditUnit(updateUnit);
				if (result == null) result = caseSelectable(updateUnit);
				if (result == null) result = caseDynamicUnit(updateUnit);
				if (result == null) result = caseContentUnit(updateUnit);
				if (result == null) result = caseNamedDisplayElement(updateUnit);
				if (result == null) result = caseNamedElement(updateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MAP_UNIT: {
				MapUnit mapUnit = (MapUnit)theEObject;
				T result = caseMapUnit(mapUnit);
				if (result == null) result = caseEditUnit(mapUnit);
				if (result == null) result = caseSelectable(mapUnit);
				if (result == null) result = caseDynamicUnit(mapUnit);
				if (result == null) result = caseContentUnit(mapUnit);
				if (result == null) result = caseNamedDisplayElement(mapUnit);
				if (result == null) result = caseNamedElement(mapUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DATA_UNIT: {
				DataUnit dataUnit = (DataUnit)theEObject;
				T result = caseDataUnit(dataUnit);
				if (result == null) result = caseDynamicUnit(dataUnit);
				if (result == null) result = caseContentUnit(dataUnit);
				if (result == null) result = caseNamedDisplayElement(dataUnit);
				if (result == null) result = caseNamedElement(dataUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DETAILS_UNIT: {
				DetailsUnit detailsUnit = (DetailsUnit)theEObject;
				T result = caseDetailsUnit(detailsUnit);
				if (result == null) result = caseDataUnit(detailsUnit);
				if (result == null) result = caseSelectable(detailsUnit);
				if (result == null) result = caseDynamicUnit(detailsUnit);
				if (result == null) result = caseContentUnit(detailsUnit);
				if (result == null) result = caseNamedDisplayElement(detailsUnit);
				if (result == null) result = caseNamedElement(detailsUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.INDEX_UNIT: {
				IndexUnit indexUnit = (IndexUnit)theEObject;
				T result = caseIndexUnit(indexUnit);
				if (result == null) result = caseDataUnit(indexUnit);
				if (result == null) result = caseInlineActionContainer(indexUnit);
				if (result == null) result = caseDynamicUnit(indexUnit);
				if (result == null) result = caseContentUnit(indexUnit);
				if (result == null) result = caseNamedDisplayElement(indexUnit);
				if (result == null) result = caseNamedElement(indexUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CONTROL_UNIT: {
				ControlUnit controlUnit = (ControlUnit)theEObject;
				T result = caseControlUnit(controlUnit);
				if (result == null) result = caseDynamicUnit(controlUnit);
				if (result == null) result = caseContentUnit(controlUnit);
				if (result == null) result = caseNamedDisplayElement(controlUnit);
				if (result == null) result = caseNamedElement(controlUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SEARCH_UNIT: {
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
			case WebsitePackage.ACTION_UNIT: {
				ActionUnit actionUnit = (ActionUnit)theEObject;
				T result = caseActionUnit(actionUnit);
				if (result == null) result = caseControlUnit(actionUnit);
				if (result == null) result = caseDynamicUnit(actionUnit);
				if (result == null) result = caseContentUnit(actionUnit);
				if (result == null) result = caseNamedDisplayElement(actionUnit);
				if (result == null) result = caseNamedElement(actionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.IMAGE_UNIT: {
				ImageUnit imageUnit = (ImageUnit)theEObject;
				T result = caseImageUnit(imageUnit);
				if (result == null) result = caseDynamicUnit(imageUnit);
				if (result == null) result = caseContentUnit(imageUnit);
				if (result == null) result = caseNamedDisplayElement(imageUnit);
				if (result == null) result = caseNamedElement(imageUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE_PATH: {
				FeaturePath featurePath = (FeaturePath)theEObject;
				T result = caseFeaturePath(featurePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE_PATH_ATTRIBUTE: {
				FeaturePathAttribute featurePathAttribute = (FeaturePathAttribute)theEObject;
				T result = caseFeaturePathAttribute(featurePathAttribute);
				if (result == null) result = caseFeaturePath(featurePathAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE_PATH_ASSOCIATION: {
				FeaturePathAssociation featurePathAssociation = (FeaturePathAssociation)theEObject;
				T result = caseFeaturePathAssociation(featurePathAssociation);
				if (result == null) result = caseFeaturePath(featurePathAssociation);
				if (result == null) result = casePathAssociationElement(featurePathAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SLIDER_UNIT: {
				SliderUnit sliderUnit = (SliderUnit)theEObject;
				T result = caseSliderUnit(sliderUnit);
				if (result == null) result = caseImageUnit(sliderUnit);
				if (result == null) result = caseDynamicUnit(sliderUnit);
				if (result == null) result = caseContentUnit(sliderUnit);
				if (result == null) result = caseNamedDisplayElement(sliderUnit);
				if (result == null) result = caseNamedElement(sliderUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.GALLERY_UNIT: {
				GalleryUnit galleryUnit = (GalleryUnit)theEObject;
				T result = caseGalleryUnit(galleryUnit);
				if (result == null) result = caseImageUnit(galleryUnit);
				if (result == null) result = caseInlineActionContainer(galleryUnit);
				if (result == null) result = caseDynamicUnit(galleryUnit);
				if (result == null) result = caseContentUnit(galleryUnit);
				if (result == null) result = caseNamedDisplayElement(galleryUnit);
				if (result == null) result = caseNamedElement(galleryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.AUTHENTICATION_UNIT: {
				AuthenticationUnit authenticationUnit = (AuthenticationUnit)theEObject;
				T result = caseAuthenticationUnit(authenticationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.REGISTRATION_UNIT: {
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
			case WebsitePackage.LOGIN_UNIT: {
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
			case WebsitePackage.FORGOTTEN_PASSWORD_UNIT: {
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
			case WebsitePackage.INLINE_ACTION_CONTAINER: {
				InlineActionContainer inlineActionContainer = (InlineActionContainer)theEObject;
				T result = caseInlineActionContainer(inlineActionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.INLINE_ACTION: {
				InlineAction inlineAction = (InlineAction)theEObject;
				T result = caseInlineAction(inlineAction);
				if (result == null) result = caseNamedDisplayElement(inlineAction);
				if (result == null) result = caseNamedElement(inlineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.SELECT_ACTION: {
				SelectAction selectAction = (SelectAction)theEObject;
				T result = caseSelectAction(selectAction);
				if (result == null) result = caseInlineAction(selectAction);
				if (result == null) result = caseNamedDisplayElement(selectAction);
				if (result == null) result = caseNamedElement(selectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.DELETE_ACTION: {
				DeleteAction deleteAction = (DeleteAction)theEObject;
				T result = caseDeleteAction(deleteAction);
				if (result == null) result = caseInlineAction(deleteAction);
				if (result == null) result = caseNamedDisplayElement(deleteAction);
				if (result == null) result = caseNamedElement(deleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE_SUPPORT_ACTION: {
				FeatureSupportAction featureSupportAction = (FeatureSupportAction)theEObject;
				T result = caseFeatureSupportAction(featureSupportAction);
				if (result == null) result = caseInlineAction(featureSupportAction);
				if (result == null) result = caseNamedDisplayElement(featureSupportAction);
				if (result == null) result = caseNamedElement(featureSupportAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = casePath(modelReference);
				if (result == null) result = caseExpression(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.FEATURE_REFERENCE: {
				FeatureReference featureReference = (FeatureReference)theEObject;
				T result = caseFeatureReference(featureReference);
				if (result == null) result = casePath(featureReference);
				if (result == null) result = caseExpression(featureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.ROUTE_PARAMETER_REFERENCE: {
				RouteParameterReference routeParameterReference = (RouteParameterReference)theEObject;
				T result = caseRouteParameterReference(routeParameterReference);
				if (result == null) result = casePath(routeParameterReference);
				if (result == null) result = caseExpression(routeParameterReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.PARAMETER_REFERENCE: {
				ParameterReference parameterReference = (ParameterReference)theEObject;
				T result = caseParameterReference(parameterReference);
				if (result == null) result = casePath(parameterReference);
				if (result == null) result = caseExpression(parameterReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebsitePackage.CURRENT_USER_REFERENCE: {
				CurrentUserReference currentUserReference = (CurrentUserReference)theEObject;
				T result = caseCurrentUserReference(currentUserReference);
				if (result == null) result = casePath(currentUserReference);
				if (result == null) result = caseExpression(currentUserReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Gen Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebGenModel(WebGenModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebsiteProperties(WebsiteProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Authentication System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Authentication System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAuthenticationSystem(LocalAuthenticationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cas Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cas Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasAuthentication(CasAuthentication object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Or View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Or View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityOrView(EntityOrView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityFeature(EntityFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewFeature(ViewFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedFeature(EncapsulatedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedAttribute(EncapsulatedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedAssociation(EncapsulatedAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewAssociation(ViewAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeAttribute(DataTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateAttribute(DateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlAttribute(UrlAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAttribute(ResourceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElement(PathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticPathElement(StaticPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePathElement(DatePathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAttribute(FileAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAttribute(ImageAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationAttribute(LocationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAssociation(EntityAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationKey(AssociationKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabel(ModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelFeature(ModelLabelFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelAttribute(ModelLabelAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelAssociation(ModelLabelAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Without Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationWithoutContainment(AssociationWithoutContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association With Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association With Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationWithContainment(AssociationWithContainment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Selectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectable(Selectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMenu(StaticMenu object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicMenu(DynamicMenu object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterParameter(FilterParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path Association Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Association Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathAssociationElement(PathAssociationElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Child Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildFeature(ChildFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildAttribute(ChildAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildAssociation(ChildAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionField(SelectionField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionParameter(SelectionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessOperation(BusinessOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path Reference Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Reference Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathReferenceElement(PathReferenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Actual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Actual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyActual(KeyActual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Path Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Path Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildPathReference(ChildPathReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionUnit(ActionUnit object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureReference(FeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteParameterReference(RouteParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterReference(ParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current User Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentUserReference(CurrentUserReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
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

} //WebsiteSwitch
