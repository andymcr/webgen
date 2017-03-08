package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.DataTypeAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.DateAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.FileAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.ImageAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.LocationAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands.UrlAttributeCreateCommand;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class EntityAttributeCompartmentItemSemanticEditPolicy extends PersistenceBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityAttributeCompartmentItemSemanticEditPolicy() {
		super(PersistenceElementTypes.Entity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PersistenceElementTypes.DataTypeAttribute_3001 == req.getElementType()) {
			return getGEFWrapper(new DataTypeAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.DateAttribute_3002 == req.getElementType()) {
			return getGEFWrapper(new DateAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.FileAttribute_3003 == req.getElementType()) {
			return getGEFWrapper(new FileAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.ImageAttribute_3005 == req.getElementType()) {
			return getGEFWrapper(new ImageAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.LocationAttribute_3006 == req.getElementType()) {
			return getGEFWrapper(new LocationAttributeCreateCommand(req));
		}
		if (PersistenceElementTypes.UrlAttribute_3007 == req.getElementType()) {
			return getGEFWrapper(new UrlAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
