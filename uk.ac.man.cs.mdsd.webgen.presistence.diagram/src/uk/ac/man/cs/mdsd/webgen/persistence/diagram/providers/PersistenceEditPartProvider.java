package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.PersistenceEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.PersistenceEditPartFactory;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;

/**
 * @generated
 */
public class PersistenceEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PersistenceEditPartProvider() {
		super(new PersistenceEditPartFactory(), PersistenceVisualIDRegistry.TYPED_INSTANCE,
				PersistenceEditPart.MODEL_ID);
	}

}
