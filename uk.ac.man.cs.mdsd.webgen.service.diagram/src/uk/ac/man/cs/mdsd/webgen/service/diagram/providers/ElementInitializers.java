package uk.ac.man.cs.mdsd.webgen.service.diagram.providers;

import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ServiceDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ServiceDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
