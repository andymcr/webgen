/**
 */
package uk.ac.man.cs.mdsd.webgen.service.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage;

import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;

import uk.ac.man.cs.mdsd.webgen.service.Asc;
import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.service.CurrentUserReference;
import uk.ac.man.cs.mdsd.webgen.service.Desc;
import uk.ac.man.cs.mdsd.webgen.service.FeatureReference;
import uk.ac.man.cs.mdsd.webgen.service.OperationResultTypes;
import uk.ac.man.cs.mdsd.webgen.service.Order;
import uk.ac.man.cs.mdsd.webgen.service.ParameterReference;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.SelectionParameter;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.service.WebGenServiceFactory;
import uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage;

import uk.ac.man.cs.mdsd.webgen.service.util.WebGenServiceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebGenServicePackageImpl extends EPackageImpl implements WebGenServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ascEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentUserReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationResultTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebGenServicePackageImpl() {
		super(eNS_URI, WebGenServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebGenServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebGenServicePackage init() {
		if (isInited) return (WebGenServicePackage)EPackage.Registry.INSTANCE.getEPackage(WebGenServicePackage.eNS_URI);

		// Obtain or create and register package
		WebGenServicePackageImpl theWebGenServicePackage = (WebGenServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebGenServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebGenServicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PersistencePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebGenServicePackage.createPackageContents();

		// Initialize created meta-data
		theWebGenServicePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebGenServicePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebGenServiceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebGenServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebGenServicePackage.eNS_URI, theWebGenServicePackage);
		return theWebGenServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServices_Services() {
		return (EReference)servicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Serves() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Selections() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Operations() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_UsedBy() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Distinct() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Fields() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Parameters() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Joins() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Filter() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Ordering() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Limit() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Selected() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionParameter() {
		return selectionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionParameter_FormalFor() {
		return (EReference)selectionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionParameter_Optional() {
		return (EAttribute)selectionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionParameter_DefaultValue() {
		return (EAttribute)selectionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessOperation() {
		return businessOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessOperation_Uses() {
		return (EReference)businessOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessOperation_ResultType() {
		return (EAttribute)businessOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessOperation_ResultMimeType() {
		return (EAttribute)businessOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Path() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsc() {
		return ascEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesc() {
		return descEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureReference() {
		return featureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureReference_Name() {
		return (EAttribute)featureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureReference_Feature() {
		return (EReference)featureReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterReference() {
		return parameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterReference_Name() {
		return (EAttribute)parameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterReference_Parameter() {
		return (EReference)parameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentUserReference() {
		return currentUserReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationResultTypes() {
		return operationResultTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenServiceFactory getWebGenServiceFactory() {
		return (WebGenServiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		servicesEClass = createEClass(SERVICES);
		createEReference(servicesEClass, SERVICES__SERVICES);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SERVES);
		createEReference(serviceEClass, SERVICE__SELECTIONS);
		createEReference(serviceEClass, SERVICE__OPERATIONS);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__USED_BY);
		createEAttribute(selectionEClass, SELECTION__DISTINCT);
		createEReference(selectionEClass, SELECTION__FIELDS);
		createEReference(selectionEClass, SELECTION__PARAMETERS);
		createEReference(selectionEClass, SELECTION__JOINS);
		createEReference(selectionEClass, SELECTION__FILTER);
		createEReference(selectionEClass, SELECTION__ORDERING);
		createEAttribute(selectionEClass, SELECTION__LIMIT);
		createEAttribute(selectionEClass, SELECTION__SELECTED);

		selectionParameterEClass = createEClass(SELECTION_PARAMETER);
		createEReference(selectionParameterEClass, SELECTION_PARAMETER__FORMAL_FOR);
		createEAttribute(selectionParameterEClass, SELECTION_PARAMETER__OPTIONAL);
		createEAttribute(selectionParameterEClass, SELECTION_PARAMETER__DEFAULT_VALUE);

		businessOperationEClass = createEClass(BUSINESS_OPERATION);
		createEReference(businessOperationEClass, BUSINESS_OPERATION__USES);
		createEAttribute(businessOperationEClass, BUSINESS_OPERATION__RESULT_TYPE);
		createEAttribute(businessOperationEClass, BUSINESS_OPERATION__RESULT_MIME_TYPE);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__PATH);

		ascEClass = createEClass(ASC);

		descEClass = createEClass(DESC);

		featureReferenceEClass = createEClass(FEATURE_REFERENCE);
		createEAttribute(featureReferenceEClass, FEATURE_REFERENCE__NAME);
		createEReference(featureReferenceEClass, FEATURE_REFERENCE__FEATURE);

		parameterReferenceEClass = createEClass(PARAMETER_REFERENCE);
		createEAttribute(parameterReferenceEClass, PARAMETER_REFERENCE__NAME);
		createEReference(parameterReferenceEClass, PARAMETER_REFERENCE__PARAMETER);

		currentUserReferenceEClass = createEClass(CURRENT_USER_REFERENCE);

		// Create enums
		operationResultTypesEEnum = createEEnum(OPERATION_RESULT_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PersistencePackage thePersistencePackage = (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);
		WebGenExpressionPackage theWebGenExpressionPackage = (WebGenExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(WebGenExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ascEClass.getESuperTypes().add(this.getOrder());
		descEClass.getESuperTypes().add(this.getOrder());
		featureReferenceEClass.getESuperTypes().add(theWebGenExpressionPackage.getPath());
		parameterReferenceEClass.getESuperTypes().add(theWebGenExpressionPackage.getPath());
		currentUserReferenceEClass.getESuperTypes().add(theWebGenExpressionPackage.getPath());

		// Initialize classes, features, and operations; add parameters
		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServices_Services(), this.getService(), null, "services", null, 0, -1, Services.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Serves(), ecorePackage.getEObject(), null, "serves", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Selections(), this.getSelection(), this.getSelection_UsedBy(), "selections", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Operations(), this.getBusinessOperation(), null, "operations", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_UsedBy(), this.getService(), this.getService_Selections(), "usedBy", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Fields(), thePersistencePackage.getFeature(), null, "fields", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Parameters(), this.getSelectionParameter(), this.getSelectionParameter_FormalFor(), "parameters", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Joins(), thePersistencePackage.getAssociation(), null, "joins", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Filter(), this.getParameterReference(), null, "filter", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelection_Ordering(), this.getOrder(), null, "ordering", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Limit(), ecorePackage.getEInt(), "limit", "0", 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSelection_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionParameterEClass, SelectionParameter.class, "SelectionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectionParameter_FormalFor(), this.getSelection(), this.getSelection_Parameters(), "formalFor", null, 1, 1, SelectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionParameter_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, SelectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, SelectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessOperationEClass, BusinessOperation.class, "BusinessOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessOperation_Uses(), this.getService(), null, "uses", null, 0, -1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessOperation_ResultType(), this.getOperationResultTypes(), "resultType", null, 1, 1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessOperation_ResultMimeType(), ecorePackage.getEString(), "resultMimeType", null, 0, 1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Path(), theWebGenExpressionPackage.getPath(), null, "path", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ascEClass, Asc.class, "Asc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureReferenceEClass, FeatureReference.class, "FeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureReference_Feature(), thePersistencePackage.getFeature(), null, "feature", null, 1, 1, FeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterReferenceEClass, ParameterReference.class, "ParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterReference_Parameter(), this.getSelectionParameter(), null, "parameter", null, 1, 1, ParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentUserReferenceEClass, CurrentUserReference.class, "CurrentUserReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operationResultTypesEEnum, OperationResultTypes.class, "OperationResultTypes");
		addEEnumLiteral(operationResultTypesEEnum, OperationResultTypes.NONE);
		addEEnumLiteral(operationResultTypesEEnum, OperationResultTypes.FILE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (servicesEClass, 
		   source, 
		   new String[] {
			 "constraints", "servieNameUnique"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (servicesEClass, 
		   source, 
		   new String[] {
			 "servieNameUnique", "services->isUnique(name)"
		   });	
		addAnnotation
		  (getFeatureReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if feature.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif feature.oclIsKindOf(EntityFeature) then\r\n\t\tfeature.oclAsType(EntityFeature).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\tfeature.oclAsType(EncapsulatedAttribute).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\tfeature.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tfeature.oclAsType(ViewAssociation).name\r\n\tendif endif endif\r\nendif"
		   });	
		addAnnotation
		  (getParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tparameter.name\r\nendif"
		   });
	}

} //WebGenServicePackageImpl
