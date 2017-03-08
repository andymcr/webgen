package uk.ac.man.cs.mdsd.webgen.service.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uk.ac.man.cs.mdsd.webgen.service.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.service.Services;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.BusinessOperationEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.SelectionEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceBusinessOperationCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceSelectionCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServicesEditPart;

/**
 * @generated
 */
public class ServiceDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ServiceNodeDescriptor> getSemanticChildren(View view) {
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServicesEditPart.VISUAL_ID:
			return getServices_1000SemanticChildren(view);
		case ServiceSelectionCompartmentEditPart.VISUAL_ID:
			return getServiceSelectionCompartment_7001SemanticChildren(view);
		case ServiceBusinessOperationCompartmentEditPart.VISUAL_ID:
			return getServiceBusinessOperationCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ServiceNodeDescriptor> getServices_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Services modelElement = (Services) view.getElement();
		LinkedList<ServiceNodeDescriptor> result = new LinkedList<ServiceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getServices().iterator(); it.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = ServiceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
				result.add(new ServiceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ServiceNodeDescriptor> getServiceSelectionCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Service modelElement = (Service) containerView.getElement();
		LinkedList<ServiceNodeDescriptor> result = new LinkedList<ServiceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSelections().iterator(); it.hasNext();) {
			Selection childElement = (Selection) it.next();
			int visualID = ServiceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SelectionEditPart.VISUAL_ID) {
				result.add(new ServiceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ServiceNodeDescriptor> getServiceBusinessOperationCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Service modelElement = (Service) containerView.getElement();
		LinkedList<ServiceNodeDescriptor> result = new LinkedList<ServiceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			BusinessOperation childElement = (BusinessOperation) it.next();
			int visualID = ServiceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BusinessOperationEditPart.VISUAL_ID) {
				result.add(new ServiceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ServiceLinkDescriptor> getContainedLinks(View view) {
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServicesEditPart.VISUAL_ID:
			return getServices_1000ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001ContainedLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3001ContainedLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ServiceLinkDescriptor> getIncomingLinks(View view) {
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2001IncomingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3001IncomingLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ServiceLinkDescriptor> getOutgoingLinks(View view) {
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2001OutgoingLinks(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3001OutgoingLinks(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getServices_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getService_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getSelection_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getBusinessOperation_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getService_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getSelection_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getBusinessOperation_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getService_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getSelection_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ServiceLinkDescriptor> getBusinessOperation_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ServiceNodeDescriptor> getSemanticChildren(View view) {
			return ServiceDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ServiceLinkDescriptor> getContainedLinks(View view) {
			return ServiceDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ServiceLinkDescriptor> getIncomingLinks(View view) {
			return ServiceDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ServiceLinkDescriptor> getOutgoingLinks(View view) {
			return ServiceDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
