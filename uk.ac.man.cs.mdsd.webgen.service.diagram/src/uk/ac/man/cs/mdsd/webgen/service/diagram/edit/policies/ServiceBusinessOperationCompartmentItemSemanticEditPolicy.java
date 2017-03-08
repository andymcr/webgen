package uk.ac.man.cs.mdsd.webgen.service.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.commands.BusinessOperationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes;

/**
 * @generated
 */
public class ServiceBusinessOperationCompartmentItemSemanticEditPolicy extends ServiceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServiceBusinessOperationCompartmentItemSemanticEditPolicy() {
		super(ServiceElementTypes.Service_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ServiceElementTypes.BusinessOperation_3002 == req.getElementType()) {
			return getGEFWrapper(new BusinessOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
