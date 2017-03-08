package uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;

/**
 * @generated
 */
public class PersistenceNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7006;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PersistenceNavigatorItem) {
			PersistenceNavigatorItem item = (PersistenceNavigatorItem) element;
			return PersistenceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
