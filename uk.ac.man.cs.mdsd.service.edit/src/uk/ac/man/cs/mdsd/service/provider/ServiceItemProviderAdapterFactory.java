/**
 */
package uk.ac.man.cs.mdsd.service.provider;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.man.cs.mdsd.expression.ExpressionPackage;
import uk.ac.man.cs.mdsd.expression.PredicateComparisonOperator;
import uk.ac.man.cs.mdsd.expression.PredicateEqualityOperator;
import uk.ac.man.cs.mdsd.expression.PredicateIsEmpty;
import uk.ac.man.cs.mdsd.expression.PredicateIsNull;
import uk.ac.man.cs.mdsd.expression.PredicateIsOperator;
import uk.ac.man.cs.mdsd.expression.PredicateLikeOperator;
import uk.ac.man.cs.mdsd.expression.util.ExpressionSwitch;
import uk.ac.man.cs.mdsd.orm.Attribute;
import uk.ac.man.cs.mdsd.orm.OrmPackage;
import uk.ac.man.cs.mdsd.orm.util.OrmSwitch;
import uk.ac.man.cs.mdsd.service.ServiceFactory;
import uk.ac.man.cs.mdsd.service.util.ServiceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProviderAdapterFactory extends ServiceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.ServiceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceModelItemProvider serviceModelItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.ServiceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceModelAdapter() {
		if (serviceModelItemProvider == null) {
			serviceModelItemProvider = new ServiceModelItemProvider(this);
		}

		return serviceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.Selection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemProvider selectionItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionAdapter() {
		if (selectionItemProvider == null) {
			selectionItemProvider = new SelectionItemProvider(this);
		}

		return selectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.Asc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AscItemProvider ascItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.Asc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAscAdapter() {
		if (ascItemProvider == null) {
			ascItemProvider = new AscItemProvider(this);
		}

		return ascItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.Desc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescItemProvider descItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.Desc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescAdapter() {
		if (descItemProvider == null) {
			descItemProvider = new DescItemProvider(this);
		}

		return descItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.FeatureReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureReferenceItemProvider featureReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.FeatureReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureReferenceAdapter() {
		if (featureReferenceItemProvider == null) {
			featureReferenceItemProvider = new FeatureReferenceItemProvider(this);
		}

		return featureReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.ParameterReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterReferenceItemProvider parameterReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.ParameterReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterReferenceAdapter() {
		if (parameterReferenceItemProvider == null) {
			parameterReferenceItemProvider = new ParameterReferenceItemProvider(this);
		}

		return parameterReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.CurrentUserReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentUserReferenceItemProvider currentUserReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.CurrentUserReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentUserReferenceAdapter() {
		if (currentUserReferenceItemProvider == null) {
			currentUserReferenceItemProvider = new CurrentUserReferenceItemProvider(this);
		}

		return currentUserReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.BusinessOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessOperationItemProvider businessOperationItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.BusinessOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusinessOperationAdapter() {
		if (businessOperationItemProvider == null) {
			businessOperationItemProvider = new BusinessOperationItemProvider(this);
		}

		return businessOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.service.FormalParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterItemProvider formalParameterItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.man.cs.mdsd.service.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormalParameterAdapter() {
		if (formalParameterItemProvider == null) {
			formalParameterItemProvider = new FormalParameterItemProvider(this);
		}

		return formalParameterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (serviceModelItemProvider != null) serviceModelItemProvider.dispose();
		if (serviceItemProvider != null) serviceItemProvider.dispose();
		if (selectionItemProvider != null) selectionItemProvider.dispose();
		if (businessOperationItemProvider != null) businessOperationItemProvider.dispose();
		if (formalParameterItemProvider != null) formalParameterItemProvider.dispose();
		if (ascItemProvider != null) ascItemProvider.dispose();
		if (descItemProvider != null) descItemProvider.dispose();
		if (featureReferenceItemProvider != null) featureReferenceItemProvider.dispose();
		if (parameterReferenceItemProvider != null) parameterReferenceItemProvider.dispose();
		if (currentUserReferenceItemProvider != null) currentUserReferenceItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link OrmPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class OrmChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends OrmSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAttribute(Attribute object) {
				newChildDescriptors.add
					(createChildParameter
						(OrmPackage.Literals.ATTRIBUTE__DEFAULT_VALUE,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(OrmPackage.Literals.ATTRIBUTE__DEFAULT_VALUE,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(OrmPackage.Literals.ATTRIBUTE__DEFAULT_VALUE,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ServiceEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ExpressionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ExpressionChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ExpressionSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateEqualityOperator(PredicateEqualityOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateComparisonOperator(PredicateComparisonOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsOperator(PredicateIsOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateLikeOperator(PredicateLikeOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsEmpty(PredicateIsEmpty object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__FEATURE,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__FEATURE,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__FEATURE,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsNull(PredicateIsNull object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__FEATURE,
						 ServiceFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__FEATURE,
						 ServiceFactory.eINSTANCE.createParameterReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__FEATURE,
						 ServiceFactory.eINSTANCE.createCurrentUserReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ServiceEditPlugin.INSTANCE;
		}
	}

}
