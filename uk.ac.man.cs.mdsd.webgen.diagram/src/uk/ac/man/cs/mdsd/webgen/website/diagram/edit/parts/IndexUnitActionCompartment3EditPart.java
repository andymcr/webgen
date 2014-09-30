package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.CompartmentRepositionLayoutEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.IndexUnitActionCompartment3CanonicalEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies.IndexUnitActionCompartment3ItemSemanticEditPolicy;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.website.diagram.part.WebsiteVisualIDRegistry;

/**
 * @generated
 */
public class IndexUnitActionCompartment3EditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7086;

	/**
	 * @generated
	 */
	public IndexUnitActionCompartment3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.IndexUnitActionCompartment3EditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IndexUnitActionCompartment3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						WebsiteVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new IndexUnitActionCompartment3CanonicalEditPolicy());
		installEditPolicy(
				EditPolicy.LAYOUT_ROLE,
				new CompartmentRepositionLayoutEditPolicy(
						WebsitePackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS));
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as ratio
		// super.setRatio(ratio); 
	}

}
