package uk.ac.man.cs.mdsd.webgen.service.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceEditPartFactory;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServicesEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceVisualIDRegistry;

/**
 * @generated
 */
public class ServiceEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ServiceEditPartProvider() {
		super(new ServiceEditPartFactory(), ServiceVisualIDRegistry.TYPED_INSTANCE, ServicesEditPart.MODEL_ID);
	}

}
