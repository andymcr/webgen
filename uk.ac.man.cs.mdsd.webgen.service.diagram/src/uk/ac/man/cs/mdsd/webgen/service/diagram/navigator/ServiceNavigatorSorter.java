package uk.ac.man.cs.mdsd.webgen.service.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceVisualIDRegistry;

/**
 * @generated
 */
public class ServiceNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ServiceNavigatorItem) {
			ServiceNavigatorItem item = (ServiceNavigatorItem) element;
			return ServiceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
