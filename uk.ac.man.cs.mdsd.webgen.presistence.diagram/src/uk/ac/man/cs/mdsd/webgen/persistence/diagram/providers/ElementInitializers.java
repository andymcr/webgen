package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceDiagramEditorPlugin;

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
		ElementInitializers cached = PersistenceDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PersistenceDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
