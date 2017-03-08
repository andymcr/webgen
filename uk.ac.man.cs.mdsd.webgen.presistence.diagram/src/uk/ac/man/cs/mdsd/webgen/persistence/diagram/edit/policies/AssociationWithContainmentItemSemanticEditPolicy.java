package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class AssociationWithContainmentItemSemanticEditPolicy extends PersistenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AssociationWithContainmentItemSemanticEditPolicy() {
		super(PersistenceElementTypes.AssociationWithContainment_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
