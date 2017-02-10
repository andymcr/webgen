/**
 */
package uk.ac.man.cs.mdsd.webgen.expression.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator;
import uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionFactory;
import uk.ac.man.cs.mdsd.webgen.expression.WebGenExpressionPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.webgen.expression.PredicateLikeOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicateLikeOperatorItemProvider extends PredicateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateLikeOperatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT);
			childrenFeatures.add(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PredicateLikeOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PredicateLikeOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PredicateLikeOperator predicateLikeOperator = (PredicateLikeOperator)object;
		return getString("_UI_PredicateLikeOperator_type") + " " + predicateLikeOperator.isNegated();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PredicateLikeOperator.class)) {
			case WebGenExpressionPackage.PREDICATE_LIKE_OPERATOR__LEFT:
			case WebGenExpressionPackage.PREDICATE_LIKE_OPERATOR__RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
				 WebGenExpressionFactory.eINSTANCE.createPredicateIsNull()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT ||
			childFeature == WebGenExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
