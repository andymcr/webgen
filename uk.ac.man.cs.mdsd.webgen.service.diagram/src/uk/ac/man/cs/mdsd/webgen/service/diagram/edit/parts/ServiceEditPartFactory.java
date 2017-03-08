package uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceVisualIDRegistry;

/**
 * @generated
 */
public class ServiceEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ServiceVisualIDRegistry.getVisualID(view)) {

			case ServicesEditPart.VISUAL_ID:
				return new ServicesEditPart(view);

			case ServiceEditPart.VISUAL_ID:
				return new ServiceEditPart(view);

			case ServiceNameEditPart.VISUAL_ID:
				return new ServiceNameEditPart(view);

			case SelectionEditPart.VISUAL_ID:
				return new SelectionEditPart(view);

			case SelectionNameEditPart.VISUAL_ID:
				return new SelectionNameEditPart(view);

			case BusinessOperationEditPart.VISUAL_ID:
				return new BusinessOperationEditPart(view);

			case BusinessOperationNameEditPart.VISUAL_ID:
				return new BusinessOperationNameEditPart(view);

			case ServiceSelectionCompartmentEditPart.VISUAL_ID:
				return new ServiceSelectionCompartmentEditPart(view);

			case ServiceBusinessOperationCompartmentEditPart.VISUAL_ID:
				return new ServiceBusinessOperationCompartmentEditPart(view);
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
