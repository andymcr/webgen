package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.ModelLabelCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class EntityModelLabelCompartmentItemSemanticEditPolicy extends PersistenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityModelLabelCompartmentItemSemanticEditPolicy() {
		super(PersistenceElementTypes.Entity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PersistenceElementTypes.ModelLabel_3004 == req.getElementType()) {
			return getGEFWrapper(new ModelLabelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
