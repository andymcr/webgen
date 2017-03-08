package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.EncapsulatedAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.EncapsulatedAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.ViewAssociationCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class ViewAttributeCompartmentItemSemanticEditPolicy extends PersistenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ViewAttributeCompartmentItemSemanticEditPolicy() {
		super(PersistenceElementTypes.View_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PersistenceElementTypes.EncapsulatedAttribute_3009 == req.getElementType()) {
			return getGEFWrapper(new EncapsulatedAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.EncapsulatedAssociation_3010 == req.getElementType()) {
			return getGEFWrapper(new EncapsulatedAssociationCreateCommand(req));
		}
		if (PersistenceElementTypes.ViewAssociation_3011 == req.getElementType()) {
			return getGEFWrapper(new ViewAssociationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
