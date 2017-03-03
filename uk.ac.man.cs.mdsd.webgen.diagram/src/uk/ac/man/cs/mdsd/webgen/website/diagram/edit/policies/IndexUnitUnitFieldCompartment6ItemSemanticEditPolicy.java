package uk.ac.man.cs.mdsd.webgen.website.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DataTypeField4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.DateField4CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitAssociation12CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.edit.commands.UnitElement15CreateCommand;
import uk.ac.man.cs.mdsd.webgen.website.diagram.providers.WebsiteElementTypes;

/**
 * @generated
 */
public class IndexUnitUnitFieldCompartment6ItemSemanticEditPolicy extends WebsiteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IndexUnitUnitFieldCompartment6ItemSemanticEditPolicy() {
		super(WebsiteElementTypes.IndexUnit_3341);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WebsiteElementTypes.UnitElement_3342 == req.getElementType()) {
			return getGEFWrapper(new UnitElement15CreateCommand(req));
		}
		if (WebsiteElementTypes.UnitAssociation_3344 == req.getElementType()) {
			return getGEFWrapper(new UnitAssociation12CreateCommand(req));
		}
		if (WebsiteElementTypes.DataTypeField_3352 == req.getElementType()) {
			return getGEFWrapper(new DataTypeField4CreateCommand(req));
		}
		if (WebsiteElementTypes.DateField_3353 == req.getElementType()) {
			return getGEFWrapper(new DateField4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
