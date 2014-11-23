/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmSwitch.java,v 1.15 2014/06/27 07:51:35 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import uk.ac.man.cs.mdsd.orm.*;

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
 * @see uk.ac.man.cs.mdsd.orm.OrmPackage
 * @generated
 */
public class OrmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmSwitch() {
		if (modelPackage == null) {
			modelPackage = OrmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case OrmPackage.ORM_MODEL: {
				OrmModel ormModel = (OrmModel)theEObject;
				T result = caseOrmModel(ormModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.NAMED_DISPLAY_ELEMENT: {
				NamedDisplayElement namedDisplayElement = (NamedDisplayElement)theEObject;
				T result = caseNamedDisplayElement(namedDisplayElement);
				if (result == null) result = caseNamedElement(namedDisplayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseNamedDisplayElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseNamedElement(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseNamedDisplayElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseDataType(enumerationType);
				if (result == null) result = caseClassifier(enumerationType);
				if (result == null) result = caseNamedDisplayElement(enumerationType);
				if (result == null) result = caseNamedElement(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseNamedDisplayElement(enumerationLiteral);
				if (result == null) result = caseNamedElement(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseClassifier(entity);
				if (result == null) result = caseNamedDisplayElement(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseNamedDisplayElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseNamedDisplayElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_ATTRIBUTE: {
				SingletonAttribute singletonAttribute = (SingletonAttribute)theEObject;
				T result = caseSingletonAttribute(singletonAttribute);
				if (result == null) result = caseAttribute(singletonAttribute);
				if (result == null) result = caseFeature(singletonAttribute);
				if (result == null) result = caseNamedDisplayElement(singletonAttribute);
				if (result == null) result = caseNamedElement(singletonAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.COLLECTION_ATTRIBUTE: {
				CollectionAttribute collectionAttribute = (CollectionAttribute)theEObject;
				T result = caseCollectionAttribute(collectionAttribute);
				if (result == null) result = caseAttribute(collectionAttribute);
				if (result == null) result = caseFeature(collectionAttribute);
				if (result == null) result = caseNamedDisplayElement(collectionAttribute);
				if (result == null) result = caseNamedElement(collectionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_ELEMENT: {
				SingletonElement singletonElement = (SingletonElement)theEObject;
				T result = caseSingletonElement(singletonElement);
				if (result == null) result = caseSingletonAttribute(singletonElement);
				if (result == null) result = caseAttribute(singletonElement);
				if (result == null) result = caseFeature(singletonElement);
				if (result == null) result = caseNamedDisplayElement(singletonElement);
				if (result == null) result = caseNamedElement(singletonElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.COLLECTION_ELEMENT: {
				CollectionElement collectionElement = (CollectionElement)theEObject;
				T result = caseCollectionElement(collectionElement);
				if (result == null) result = caseCollectionAttribute(collectionElement);
				if (result == null) result = caseAttribute(collectionElement);
				if (result == null) result = caseFeature(collectionElement);
				if (result == null) result = caseNamedDisplayElement(collectionElement);
				if (result == null) result = caseNamedElement(collectionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.DATE_ATTRIBUTE: {
				DateAttribute dateAttribute = (DateAttribute)theEObject;
				T result = caseDateAttribute(dateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_DATE: {
				SingletonDate singletonDate = (SingletonDate)theEObject;
				T result = caseSingletonDate(singletonDate);
				if (result == null) result = caseSingletonAttribute(singletonDate);
				if (result == null) result = caseDateAttribute(singletonDate);
				if (result == null) result = caseAttribute(singletonDate);
				if (result == null) result = caseFeature(singletonDate);
				if (result == null) result = caseNamedDisplayElement(singletonDate);
				if (result == null) result = caseNamedElement(singletonDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.COLLECTION_DATE: {
				CollectionDate collectionDate = (CollectionDate)theEObject;
				T result = caseCollectionDate(collectionDate);
				if (result == null) result = caseCollectionAttribute(collectionDate);
				if (result == null) result = caseDateAttribute(collectionDate);
				if (result == null) result = caseAttribute(collectionDate);
				if (result == null) result = caseFeature(collectionDate);
				if (result == null) result = caseNamedDisplayElement(collectionDate);
				if (result == null) result = caseNamedElement(collectionDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_RESOURCE: {
				SingletonResource singletonResource = (SingletonResource)theEObject;
				T result = caseSingletonResource(singletonResource);
				if (result == null) result = caseSingletonAttribute(singletonResource);
				if (result == null) result = caseAttribute(singletonResource);
				if (result == null) result = caseFeature(singletonResource);
				if (result == null) result = caseNamedDisplayElement(singletonResource);
				if (result == null) result = caseNamedElement(singletonResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_FILE: {
				SingletonFile singletonFile = (SingletonFile)theEObject;
				T result = caseSingletonFile(singletonFile);
				if (result == null) result = caseSingletonResource(singletonFile);
				if (result == null) result = caseSingletonAttribute(singletonFile);
				if (result == null) result = caseAttribute(singletonFile);
				if (result == null) result = caseFeature(singletonFile);
				if (result == null) result = caseNamedDisplayElement(singletonFile);
				if (result == null) result = caseNamedElement(singletonFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_IMAGE: {
				SingletonImage singletonImage = (SingletonImage)theEObject;
				T result = caseSingletonImage(singletonImage);
				if (result == null) result = caseSingletonResource(singletonImage);
				if (result == null) result = caseSingletonAttribute(singletonImage);
				if (result == null) result = caseAttribute(singletonImage);
				if (result == null) result = caseFeature(singletonImage);
				if (result == null) result = caseNamedDisplayElement(singletonImage);
				if (result == null) result = caseNamedElement(singletonImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_LOCATION: {
				SingletonLocation singletonLocation = (SingletonLocation)theEObject;
				T result = caseSingletonLocation(singletonLocation);
				if (result == null) result = caseSingletonAttribute(singletonLocation);
				if (result == null) result = caseAttribute(singletonLocation);
				if (result == null) result = caseFeature(singletonLocation);
				if (result == null) result = caseNamedDisplayElement(singletonLocation);
				if (result == null) result = caseNamedElement(singletonLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseFeature(association);
				if (result == null) result = caseNamedDisplayElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.SINGLETON_ASSOCIATION: {
				SingletonAssociation singletonAssociation = (SingletonAssociation)theEObject;
				T result = caseSingletonAssociation(singletonAssociation);
				if (result == null) result = caseAssociation(singletonAssociation);
				if (result == null) result = caseFeature(singletonAssociation);
				if (result == null) result = caseNamedDisplayElement(singletonAssociation);
				if (result == null) result = caseNamedElement(singletonAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrmPackage.COLLECTION_ASSOCIATION: {
				CollectionAssociation collectionAssociation = (CollectionAssociation)theEObject;
				T result = caseCollectionAssociation(collectionAssociation);
				if (result == null) result = caseAssociation(collectionAssociation);
				if (result == null) result = caseFeature(collectionAssociation);
				if (result == null) result = caseNamedDisplayElement(collectionAssociation);
				if (result == null) result = caseNamedElement(collectionAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrmModel(OrmModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonAttribute(SingletonAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionAttribute(CollectionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonElement(SingletonElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionElement(CollectionElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonDate(SingletonDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionDate(CollectionDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonResource(SingletonResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonFile(SingletonFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonImage(SingletonImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonLocation(SingletonLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonAssociation(SingletonAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionAssociation(CollectionAssociation object) {
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

} //OrmSwitch
