package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;

/**
 * @generated
 */
public class PersistenceEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PersistenceVisualIDRegistry.getVisualID(view)) {

			case PersistenceEditPart.VISUAL_ID:
				return new PersistenceEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case ViewEditPart.VISUAL_ID:
				return new ViewEditPart(view);

			case ViewNameEditPart.VISUAL_ID:
				return new ViewNameEditPart(view);

			case ModelLabelEditPart.VISUAL_ID:
				return new ModelLabelEditPart(view);

			case ModelLabelNameEditPart.VISUAL_ID:
				return new ModelLabelNameEditPart(view);

			case DataTypeAttributeEditPart.VISUAL_ID:
				return new DataTypeAttributeEditPart(view);

			case DataTypeAttributeNameEditPart.VISUAL_ID:
				return new DataTypeAttributeNameEditPart(view);

			case DateAttributeEditPart.VISUAL_ID:
				return new DateAttributeEditPart(view);

			case DateAttributeNameEditPart.VISUAL_ID:
				return new DateAttributeNameEditPart(view);

			case FileAttributeEditPart.VISUAL_ID:
				return new FileAttributeEditPart(view);

			case FileAttributeNameEditPart.VISUAL_ID:
				return new FileAttributeNameEditPart(view);

			case ImageAttributeEditPart.VISUAL_ID:
				return new ImageAttributeEditPart(view);

			case ImageAttributeNameEditPart.VISUAL_ID:
				return new ImageAttributeNameEditPart(view);

			case LocationAttributeEditPart.VISUAL_ID:
				return new LocationAttributeEditPart(view);

			case LocationAttributeNameEditPart.VISUAL_ID:
				return new LocationAttributeNameEditPart(view);

			case UrlAttributeEditPart.VISUAL_ID:
				return new UrlAttributeEditPart(view);

			case UrlAttributeNameEditPart.VISUAL_ID:
				return new UrlAttributeNameEditPart(view);

			case ModelLabel2EditPart.VISUAL_ID:
				return new ModelLabel2EditPart(view);

			case ModelLabelName2EditPart.VISUAL_ID:
				return new ModelLabelName2EditPart(view);

			case EncapsulatedAttributeEditPart.VISUAL_ID:
				return new EncapsulatedAttributeEditPart(view);

			case EncapsulatedAttributeNameEditPart.VISUAL_ID:
				return new EncapsulatedAttributeNameEditPart(view);

			case EncapsulatedAssociationEditPart.VISUAL_ID:
				return new EncapsulatedAssociationEditPart(view);

			case EncapsulatedAssociationNameEditPart.VISUAL_ID:
				return new EncapsulatedAssociationNameEditPart(view);

			case ViewAssociationEditPart.VISUAL_ID:
				return new ViewAssociationEditPart(view);

			case ViewAssociationNameEditPart.VISUAL_ID:
				return new ViewAssociationNameEditPart(view);

			case EntityModelLabelCompartmentEditPart.VISUAL_ID:
				return new EntityModelLabelCompartmentEditPart(view);

			case EntityAttributeCompartmentEditPart.VISUAL_ID:
				return new EntityAttributeCompartmentEditPart(view);

			case ViewModelLabelCompartmentEditPart.VISUAL_ID:
				return new ViewModelLabelCompartmentEditPart(view);

			case ViewAttributeCompartmentEditPart.VISUAL_ID:
				return new ViewAttributeCompartmentEditPart(view);

			case AssociationWithoutContainmentEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentEditPart(view);

			case AssociationWithoutContainmentNameEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentNameEditPart(view);

			case AssociationWithoutContainmentCardinalityEditPart.VISUAL_ID:
				return new AssociationWithoutContainmentCardinalityEditPart(view);

			case AssociationWithContainmentEditPart.VISUAL_ID:
				return new AssociationWithContainmentEditPart(view);

			case AssociationWithContainmentNameEditPart.VISUAL_ID:
				return new AssociationWithContainmentNameEditPart(view);

			case AssociationWithContainmentCardinalityEditPart.VISUAL_ID:
				return new AssociationWithContainmentCardinalityEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
