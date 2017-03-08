package uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PersistenceNavigatorItem extends PersistenceAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator.PersistenceNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator.PersistenceNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator.PersistenceNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public PersistenceNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator.PersistenceNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(EcoreUtil.getURI(
					((uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator.PersistenceNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
