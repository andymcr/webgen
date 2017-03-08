package uk.ac.man.cs.mdsd.webgen.service.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.commands.SelectionCreateCommand;
import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes;

/**
 * @generated
 */
public class ServiceSelectionCompartmentItemSemanticEditPolicy extends ServiceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServiceSelectionCompartmentItemSemanticEditPolicy() {
		super(ServiceElementTypes.Service_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceElementTypes.Selection_3001 == req.getElementType()) {
			return getGEFWrapper(new SelectionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
