/**
 */
package uk.ac.man.cs.mdsd.webgen.persistence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.man.cs.mdsd.webgen.core.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.core.NamedElement;
import uk.ac.man.cs.mdsd.webgen.persistence.*;

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
 * @see uk.ac.man.cs.mdsd.webgen.persistence.WebGenPersistencePackage
 * @generated
 */
public class WebGenPersistenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebGenPersistencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenPersistenceSwitch() {
		if (modelPackage == null) {
			modelPackage = WebGenPersistencePackage.eINSTANCE;
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
			case WebGenPersistencePackage.PERSISTENCE: {
				Persistence persistence = (Persistence)theEObject;
				T result = casePersistence(persistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamedDisplayElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamedDisplayElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseDataType(enumerationType);
				if (result == null) result = caseClassifier(enumerationType);
				if (result == null) result = caseNamedDisplayElement(enumerationType);
				if (result == null) result = caseNamedElement(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedDisplayElement(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENTITY_OR_VIEW: {
				EntityOrView entityOrView = (EntityOrView)theEObject;
				T result = caseEntityOrView(entityOrView);
				if (result == null) result = caseClassifier(entityOrView);
				if (result == null) result = caseNamedDisplayElement(entityOrView);
				if (result == null) result = caseNamedElement(entityOrView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseLabel(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseFeature(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.MODEL_LABEL: {
				ModelLabel modelLabel = (ModelLabel)theEObject;
				T result = caseModelLabel(modelLabel);
				if (result == null) result = caseNamedElement(modelLabel);
				if (result == null) result = caseLabel(modelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.MODEL_LABEL_FEATURE: {
				ModelLabelFeature modelLabelFeature = (ModelLabelFeature)theEObject;
				T result = caseModelLabelFeature(modelLabelFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.MODEL_LABEL_ATTRIBUTE: {
				ModelLabelAttribute modelLabelAttribute = (ModelLabelAttribute)theEObject;
				T result = caseModelLabelAttribute(modelLabelAttribute);
				if (result == null) result = caseModelLabelFeature(modelLabelAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.MODEL_LABEL_ASSOCIATION: {
				ModelLabelAssociation modelLabelAssociation = (ModelLabelAssociation)theEObject;
				T result = caseModelLabelAssociation(modelLabelAssociation);
				if (result == null) result = caseModelLabelFeature(modelLabelAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseEntityOrView(entity);
				if (result == null) result = caseClassifier(entity);
				if (result == null) result = caseNamedDisplayElement(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENTITY_FEATURE: {
				EntityFeature entityFeature = (EntityFeature)theEObject;
				T result = caseEntityFeature(entityFeature);
				if (result == null) result = caseNamedDisplayElement(entityFeature);
				if (result == null) result = caseFeature(entityFeature);
				if (result == null) result = caseNamedElement(entityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENTITY_ATTRIBUTE: {
				EntityAttribute entityAttribute = (EntityAttribute)theEObject;
				T result = caseEntityAttribute(entityAttribute);
				if (result == null) result = caseEntityFeature(entityAttribute);
				if (result == null) result = caseAttribute(entityAttribute);
				if (result == null) result = caseNamedDisplayElement(entityAttribute);
				if (result == null) result = caseFeature(entityAttribute);
				if (result == null) result = caseLabel(entityAttribute);
				if (result == null) result = caseNamedElement(entityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.DATA_TYPE_ATTRIBUTE: {
				DataTypeAttribute dataTypeAttribute = (DataTypeAttribute)theEObject;
				T result = caseDataTypeAttribute(dataTypeAttribute);
				if (result == null) result = caseEntityAttribute(dataTypeAttribute);
				if (result == null) result = caseEntityFeature(dataTypeAttribute);
				if (result == null) result = caseAttribute(dataTypeAttribute);
				if (result == null) result = caseNamedDisplayElement(dataTypeAttribute);
				if (result == null) result = caseFeature(dataTypeAttribute);
				if (result == null) result = caseLabel(dataTypeAttribute);
				if (result == null) result = caseNamedElement(dataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.DATE_ATTRIBUTE: {
				DateAttribute dateAttribute = (DateAttribute)theEObject;
				T result = caseDateAttribute(dateAttribute);
				if (result == null) result = caseEntityAttribute(dateAttribute);
				if (result == null) result = caseEntityFeature(dateAttribute);
				if (result == null) result = caseAttribute(dateAttribute);
				if (result == null) result = caseNamedDisplayElement(dateAttribute);
				if (result == null) result = caseFeature(dateAttribute);
				if (result == null) result = caseLabel(dateAttribute);
				if (result == null) result = caseNamedElement(dateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.URL_ATTRIBUTE: {
				UrlAttribute urlAttribute = (UrlAttribute)theEObject;
				T result = caseUrlAttribute(urlAttribute);
				if (result == null) result = caseEntityAttribute(urlAttribute);
				if (result == null) result = caseEntityFeature(urlAttribute);
				if (result == null) result = caseAttribute(urlAttribute);
				if (result == null) result = caseNamedDisplayElement(urlAttribute);
				if (result == null) result = caseFeature(urlAttribute);
				if (result == null) result = caseLabel(urlAttribute);
				if (result == null) result = caseNamedElement(urlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.RESOURCE_ATTRIBUTE: {
				ResourceAttribute resourceAttribute = (ResourceAttribute)theEObject;
				T result = caseResourceAttribute(resourceAttribute);
				if (result == null) result = caseEntityAttribute(resourceAttribute);
				if (result == null) result = caseEntityFeature(resourceAttribute);
				if (result == null) result = caseAttribute(resourceAttribute);
				if (result == null) result = caseNamedDisplayElement(resourceAttribute);
				if (result == null) result = caseFeature(resourceAttribute);
				if (result == null) result = caseLabel(resourceAttribute);
				if (result == null) result = caseNamedElement(resourceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.PATH_ELEMENT: {
				PathElement pathElement = (PathElement)theEObject;
				T result = casePathElement(pathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.STATIC_PATH_ELEMENT: {
				StaticPathElement staticPathElement = (StaticPathElement)theEObject;
				T result = caseStaticPathElement(staticPathElement);
				if (result == null) result = casePathElement(staticPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.DATE_PATH_ELEMENT: {
				DatePathElement datePathElement = (DatePathElement)theEObject;
				T result = caseDatePathElement(datePathElement);
				if (result == null) result = casePathElement(datePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.FILE_ATTRIBUTE: {
				FileAttribute fileAttribute = (FileAttribute)theEObject;
				T result = caseFileAttribute(fileAttribute);
				if (result == null) result = caseResourceAttribute(fileAttribute);
				if (result == null) result = caseEntityAttribute(fileAttribute);
				if (result == null) result = caseEntityFeature(fileAttribute);
				if (result == null) result = caseAttribute(fileAttribute);
				if (result == null) result = caseNamedDisplayElement(fileAttribute);
				if (result == null) result = caseFeature(fileAttribute);
				if (result == null) result = caseLabel(fileAttribute);
				if (result == null) result = caseNamedElement(fileAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.IMAGE_ATTRIBUTE: {
				ImageAttribute imageAttribute = (ImageAttribute)theEObject;
				T result = caseImageAttribute(imageAttribute);
				if (result == null) result = caseResourceAttribute(imageAttribute);
				if (result == null) result = caseEntityAttribute(imageAttribute);
				if (result == null) result = caseEntityFeature(imageAttribute);
				if (result == null) result = caseAttribute(imageAttribute);
				if (result == null) result = caseNamedDisplayElement(imageAttribute);
				if (result == null) result = caseFeature(imageAttribute);
				if (result == null) result = caseLabel(imageAttribute);
				if (result == null) result = caseNamedElement(imageAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.LOCATION_ATTRIBUTE: {
				LocationAttribute locationAttribute = (LocationAttribute)theEObject;
				T result = caseLocationAttribute(locationAttribute);
				if (result == null) result = caseEntityAttribute(locationAttribute);
				if (result == null) result = caseEntityFeature(locationAttribute);
				if (result == null) result = caseAttribute(locationAttribute);
				if (result == null) result = caseNamedDisplayElement(locationAttribute);
				if (result == null) result = caseFeature(locationAttribute);
				if (result == null) result = caseLabel(locationAttribute);
				if (result == null) result = caseNamedElement(locationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENTITY_ASSOCIATION: {
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
			case WebGenPersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT: {
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
			case WebGenPersistencePackage.ASSOCIATION_WITH_CONTAINMENT: {
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
			case WebGenPersistencePackage.ASSOCIATION_KEY: {
				AssociationKey associationKey = (AssociationKey)theEObject;
				T result = caseAssociationKey(associationKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseEntityOrView(view);
				if (result == null) result = caseClassifier(view);
				if (result == null) result = caseNamedDisplayElement(view);
				if (result == null) result = caseNamedElement(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.VIEW_FEATURE: {
				ViewFeature viewFeature = (ViewFeature)theEObject;
				T result = caseViewFeature(viewFeature);
				if (result == null) result = caseFeature(viewFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENCAPSULATED_FEATURE: {
				EncapsulatedFeature encapsulatedFeature = (EncapsulatedFeature)theEObject;
				T result = caseEncapsulatedFeature(encapsulatedFeature);
				if (result == null) result = caseViewFeature(encapsulatedFeature);
				if (result == null) result = caseFeature(encapsulatedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENCAPSULATED_ATTRIBUTE: {
				EncapsulatedAttribute encapsulatedAttribute = (EncapsulatedAttribute)theEObject;
				T result = caseEncapsulatedAttribute(encapsulatedAttribute);
				if (result == null) result = caseEncapsulatedFeature(encapsulatedAttribute);
				if (result == null) result = caseAttribute(encapsulatedAttribute);
				if (result == null) result = caseViewFeature(encapsulatedAttribute);
				if (result == null) result = caseLabel(encapsulatedAttribute);
				if (result == null) result = caseFeature(encapsulatedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.ENCAPSULATED_ASSOCIATION: {
				EncapsulatedAssociation encapsulatedAssociation = (EncapsulatedAssociation)theEObject;
				T result = caseEncapsulatedAssociation(encapsulatedAssociation);
				if (result == null) result = caseEncapsulatedFeature(encapsulatedAssociation);
				if (result == null) result = caseAssociation(encapsulatedAssociation);
				if (result == null) result = caseViewFeature(encapsulatedAssociation);
				if (result == null) result = caseFeature(encapsulatedAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebGenPersistencePackage.VIEW_ASSOCIATION: {
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
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistence(Persistence object) {
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

} //WebGenPersistenceSwitch
