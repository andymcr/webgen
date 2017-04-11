/**
 */
package uk.ac.man.cs.mdsd.webgen.api;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.api.ApiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ApiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "api";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/api";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-api";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiPackage eINSTANCE = uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.APIImpl
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getAPI()
	 * @generated
	 */
	int API = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Parent Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URI_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Enable Default Get All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENABLE_DEFAULT_GET_ALL = 4;

	/**
	 * The feature id for the '<em><b>Enable Default Get One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ENABLE_DEFAULT_GET_ONE = 5;

	/**
	 * The feature id for the '<em><b>Get All</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GET_ALL = 6;

	/**
	 * The feature id for the '<em><b>Get One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GET_ONE = 7;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SELECTIONS = 8;

	/**
	 * The feature id for the '<em><b>Default Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DEFAULT_SERIALIZATION_GROUPS = 9;

	/**
	 * The feature id for the '<em><b>Child Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CHILD_RESOURCES = 10;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl <em>Resource Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl
	 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getResourceSelection()
	 * @generated
	 */
	int RESOURCE_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Parent Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION__PARENT_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION__SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION__URI_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Default Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS = 4;

	/**
	 * The number of structural features of the '<em>Resource Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.api.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.api.API#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.API#getResources()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Resources();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.api.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getParentResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ParentResource();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getService()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Service();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getUriElement()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isEnableDefaultGetAll <em>Enable Default Get All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Default Get All</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#isEnableDefaultGetAll()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_EnableDefaultGetAll();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#isEnableDefaultGetOne <em>Enable Default Get One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Default Get One</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#isEnableDefaultGetOne()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_EnableDefaultGetOne();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getGetAll <em>Get All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get All</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getGetAll()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_GetAll();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getGetOne <em>Get One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Get One</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getGetOne()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_GetOne();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getSelections()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Selections();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getDefaultSerializationGroups <em>Default Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Serialization Groups</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getDefaultSerializationGroups()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_DefaultSerializationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.man.cs.mdsd.webgen.api.Resource#getChildResources <em>Child Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Resources</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.Resource#getChildResources()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ChildResources();

	/**
	 * Returns the meta object for class '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection <em>Resource Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection
	 * @generated
	 */
	EClass getResourceSelection();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getParentResource()
	 * @see #getResourceSelection()
	 * @generated
	 */
	EReference getResourceSelection_ParentResource();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getName()
	 * @see #getResourceSelection()
	 * @generated
	 */
	EAttribute getResourceSelection_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getSelection()
	 * @see #getResourceSelection()
	 * @generated
	 */
	EReference getResourceSelection_Selection();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getUriElement()
	 * @see #getResourceSelection()
	 * @generated
	 */
	EAttribute getResourceSelection_UriElement();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getDefaultSerializationGroups <em>Default Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Serialization Groups</em>'.
	 * @see uk.ac.man.cs.mdsd.webgen.api.ResourceSelection#getDefaultSerializationGroups()
	 * @see #getResourceSelection()
	 * @generated
	 */
	EReference getResourceSelection_DefaultSerializationGroups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApiFactory getApiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.APIImpl
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__RESOURCES = eINSTANCE.getAPI_Resources();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ResourceImpl
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Parent Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PARENT_RESOURCE = eINSTANCE.getResource_ParentResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SERVICE = eINSTANCE.getResource_Service();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__URI_ELEMENT = eINSTANCE.getResource_UriElement();

		/**
		 * The meta object literal for the '<em><b>Enable Default Get All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ENABLE_DEFAULT_GET_ALL = eINSTANCE.getResource_EnableDefaultGetAll();

		/**
		 * The meta object literal for the '<em><b>Enable Default Get One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ENABLE_DEFAULT_GET_ONE = eINSTANCE.getResource_EnableDefaultGetOne();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__GET_ALL = eINSTANCE.getResource_GetAll();

		/**
		 * The meta object literal for the '<em><b>Get One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__GET_ONE = eINSTANCE.getResource_GetOne();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SELECTIONS = eINSTANCE.getResource_Selections();

		/**
		 * The meta object literal for the '<em><b>Default Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DEFAULT_SERIALIZATION_GROUPS = eINSTANCE.getResource_DefaultSerializationGroups();

		/**
		 * The meta object literal for the '<em><b>Child Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CHILD_RESOURCES = eINSTANCE.getResource_ChildResources();

		/**
		 * The meta object literal for the '{@link uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl <em>Resource Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ResourceSelectionImpl
		 * @see uk.ac.man.cs.mdsd.webgen.api.impl.ApiPackageImpl#getResourceSelection()
		 * @generated
		 */
		EClass RESOURCE_SELECTION = eINSTANCE.getResourceSelection();

		/**
		 * The meta object literal for the '<em><b>Parent Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SELECTION__PARENT_RESOURCE = eINSTANCE.getResourceSelection_ParentResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SELECTION__NAME = eINSTANCE.getResourceSelection_Name();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SELECTION__SELECTION = eINSTANCE.getResourceSelection_Selection();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_SELECTION__URI_ELEMENT = eINSTANCE.getResourceSelection_UriElement();

		/**
		 * The meta object literal for the '<em><b>Default Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SELECTION__DEFAULT_SERIALIZATION_GROUPS = eINSTANCE.getResourceSelection_DefaultSerializationGroups();

	}

} //ApiPackage
