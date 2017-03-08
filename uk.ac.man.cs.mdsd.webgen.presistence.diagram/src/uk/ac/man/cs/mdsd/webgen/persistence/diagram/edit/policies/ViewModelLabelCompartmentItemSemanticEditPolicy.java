package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.ModelLabel2CreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class ViewModelLabelCompartmentItemSemanticEditPolicy extends PersistenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ViewModelLabelCompartmentItemSemanticEditPolicy() {
		super(PersistenceElementTypes.View_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PersistenceElementTypes.ModelLabel_3008 == req.getElementType()) {
			return getGEFWrapper(new ModelLabel2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
