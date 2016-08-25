package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement5CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment2ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment2ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3112);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3177 == req.getElementType()) {
			return getGEFWrapper(new UnitElement5CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3176 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
