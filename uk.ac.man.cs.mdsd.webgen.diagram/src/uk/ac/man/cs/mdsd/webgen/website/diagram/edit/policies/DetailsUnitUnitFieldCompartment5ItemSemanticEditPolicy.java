package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation7CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement9CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class DetailsUnitUnitFieldCompartment5ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DetailsUnitUnitFieldCompartment5ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.DetailsUnit_3129);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3183 == req.getElementType()) {
			return getGEFWrapper(new UnitElement9CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3184 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
