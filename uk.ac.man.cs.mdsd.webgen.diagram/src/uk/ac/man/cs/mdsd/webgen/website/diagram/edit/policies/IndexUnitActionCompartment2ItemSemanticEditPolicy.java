package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DeleteAction3CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.FeatureSupportAction2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.SelectAction7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitActionCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitActionCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3341);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.SelectAction_3354 == req.getElementType()) {
			return getGEFWrapper(new SelectAction7CreateCommand(req));
		}
		if (WebsiteElementTypes.DeleteAction_3355 == req.getElementType()) {
			return getGEFWrapper(new DeleteAction3CreateCommand(req));
		}
		if (WebsiteElementTypes.FeatureSupportAction_3356 == req.getElementType()) {
			return getGEFWrapper(new FeatureSupportAction2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
