package uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DataTypeAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DateAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityAttributeCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityModelLabelCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.FileAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ImageAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.LocationAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabel2EditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.PersistenceEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.UrlAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAttributeCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewModelLabelCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.Messages;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;

/**
 * @generated
 */
public class PersistenceNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PersistenceNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<PersistenceNavigatorItem> result = new ArrayList<PersistenceNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, PersistenceEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof PersistenceNavigatorGroup) {
			PersistenceNavigatorGroup group = (PersistenceNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PersistenceNavigatorItem) {
			PersistenceNavigatorItem navigatorItem = (PersistenceNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {

		case PersistenceEditPart.VISUAL_ID: {
			LinkedList<PersistenceAbstractNavigatorItem> result = new LinkedList<PersistenceAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			PersistenceNavigatorGroup links = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_Persistence_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(ViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case EntityEditPart.VISUAL_ID: {
			LinkedList<PersistenceAbstractNavigatorItem> result = new LinkedList<PersistenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			PersistenceNavigatorGroup incominglinks = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PersistenceNavigatorGroup outgoinglinks = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_Entity_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityModelLabelCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(ModelLabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(DataTypeAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(DateAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(FileAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(ImageAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(LocationAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(UrlAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithoutContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(AssociationWithContainmentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ViewEditPart.VISUAL_ID: {
			LinkedList<PersistenceAbstractNavigatorItem> result = new LinkedList<PersistenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(ViewModelLabelCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(ModelLabel2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(ViewAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(EncapsulatedAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(ViewAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(EncapsulatedAssociationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(ViewAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PersistenceVisualIDRegistry.getType(ViewAssociationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AssociationWithoutContainmentEditPart.VISUAL_ID: {
			LinkedList<PersistenceAbstractNavigatorItem> result = new LinkedList<PersistenceAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PersistenceNavigatorGroup target = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithoutContainment_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PersistenceNavigatorGroup source = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithoutContainment_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AssociationWithContainmentEditPart.VISUAL_ID: {
			LinkedList<PersistenceAbstractNavigatorItem> result = new LinkedList<PersistenceAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PersistenceNavigatorGroup target = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithContainment_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PersistenceNavigatorGroup source = new PersistenceNavigatorGroup(
					Messages.NavigatorGroupName_AssociationWithContainment_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PersistenceVisualIDRegistry.getType(EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PersistenceEditPart.MODEL_ID.equals(PersistenceVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PersistenceNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<PersistenceNavigatorItem> result = new ArrayList<PersistenceNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new PersistenceNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof PersistenceAbstractNavigatorItem) {
			PersistenceAbstractNavigatorItem abstractNavigatorItem = (PersistenceAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}