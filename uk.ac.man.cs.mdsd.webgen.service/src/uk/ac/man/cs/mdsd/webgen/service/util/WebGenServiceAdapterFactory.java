/**
 */
package uk.ac.man.cs.mdsd.webgen.service.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.webgen.expression.Expression;
import uk.ac.man.cs.mdsd.webgen.expression.Path;

import uk.ac.man.cs.mdsd.webgen.service.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.service.WebGenServicePackage
 * @generated
 */
public class WebGenServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebGenServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebGenServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WebGenServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebGenServiceSwitch<Adapter> modelSwitch =
		new WebGenServiceSwitch<Adapter>() {
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseBusinessOperation(BusinessOperation object) {
				return createBusinessOperationAdapter();
			}
			@Override
			public Adapter caseFormalParameterList(FormalParameterList object) {
				return createFormalParameterListAdapter();
			}
			@Override
			public Adapter caseFormalParameter(FormalParameter object) {
				return createFormalParameterAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseAsc(Asc object) {
				return createAscAdapter();
			}
			@Override
			public Adapter caseDesc(Desc object) {
				return createDescAdapter();
			}
			@Override
			public Adapter caseFeatureReference(FeatureReference object) {
				return createFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseParameterReference(ParameterReference object) {
				return createParameterReferenceAdapter();
			}
			@Override
			public Adapter caseCurrentUserReference(CurrentUserReference object) {
				return createCurrentUserReferenceAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.BusinessOperation <em>Business Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.BusinessOperation
	 * @generated
	 */
	public Adapter createBusinessOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.FormalParameterList
	 * @generated
	 */
	public Adapter createFormalParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.FormalParameter
	 * @generated
	 */
	public Adapter createFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Asc <em>Asc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Asc
	 * @generated
	 */
	public Adapter createAscAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.Desc
	 * @generated
	 */
	public Adapter createDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.FeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.FeatureReference
	 * @generated
	 */
	public Adapter createFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.ParameterReference
	 * @generated
	 */
	public Adapter createParameterReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.service.CurrentUserReference <em>Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.service.CurrentUserReference
	 * @generated
	 */
	public Adapter createCurrentUserReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.webgen.expression.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.webgen.expression.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WebGenServiceAdapterFactory
