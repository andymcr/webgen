package uk.ac.man.cs.mdsd.webgen.persistence.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.ViewFeature;
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
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class PersistenceDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getSemanticChildren(View view) {
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case PersistenceEditPart.VISUAL_ID:
			return getPersistence_1000SemanticChildren(view);
		case EntityModelLabelCompartmentEditPart.VISUAL_ID:
			return getEntityModelLabelCompartment_7001SemanticChildren(view);
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			return getEntityAttributeCompartment_7002SemanticChildren(view);
		case ViewModelLabelCompartmentEditPart.VISUAL_ID:
			return getViewModelLabelCompartment_7003SemanticChildren(view);
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			return getViewAttributeCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getPersistence_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Persistence modelElement = (Persistence) view.getElement();
		LinkedList<PersistenceNodeDescriptor> result = new LinkedList<PersistenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntities().iterator(); it.hasNext();) {
			EntityOrView childElement = (EntityOrView) it.next();
			int visualID = PersistenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getEntityModelLabelCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<PersistenceNodeDescriptor> result = new LinkedList<PersistenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLabels().iterator(); it.hasNext();) {
			ModelLabel childElement = (ModelLabel) it.next();
			int visualID = PersistenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelLabelEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getEntityAttributeCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Entity modelElement = (Entity) containerView.getElement();
		LinkedList<PersistenceNodeDescriptor> result = new LinkedList<PersistenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntityFeatures().iterator(); it.hasNext();) {
			EntityFeature childElement = (EntityFeature) it.next();
			int visualID = PersistenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataTypeAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FileAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LocationAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UrlAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getViewModelLabelCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) containerView
				.getElement();
		LinkedList<PersistenceNodeDescriptor> result = new LinkedList<PersistenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLabels().iterator(); it.hasNext();) {
			ModelLabel childElement = (ModelLabel) it.next();
			int visualID = PersistenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModelLabel2EditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceNodeDescriptor> getViewAttributeCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		uk.ac.man.cs.mdsd.webgen.persistence.View modelElement = (uk.ac.man.cs.mdsd.webgen.persistence.View) containerView
				.getElement();
		LinkedList<PersistenceNodeDescriptor> result = new LinkedList<PersistenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getViewFeatures().iterator(); it.hasNext();) {
			ViewFeature childElement = (ViewFeature) it.next();
			int visualID = PersistenceVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EncapsulatedAttributeEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EncapsulatedAssociationEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewAssociationEditPart.VISUAL_ID) {
				result.add(new PersistenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getContainedLinks(View view) {
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case PersistenceEditPart.VISUAL_ID:
			return getPersistence_1000ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001ContainedLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2002ContainedLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3004ContainedLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3001ContainedLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3002ContainedLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3003ContainedLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3005ContainedLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3006ContainedLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3007ContainedLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3008ContainedLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3009ContainedLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3010ContainedLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_3011ContainedLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001ContainedLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getIncomingLinks(View view) {
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001IncomingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2002IncomingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3004IncomingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3001IncomingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3002IncomingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3003IncomingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3005IncomingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3006IncomingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3007IncomingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3008IncomingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3009IncomingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3010IncomingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_3011IncomingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001IncomingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getOutgoingLinks(View view) {
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001OutgoingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2002OutgoingLinks(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3004OutgoingLinks(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3001OutgoingLinks(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3002OutgoingLinks(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3003OutgoingLinks(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3005OutgoingLinks(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3006OutgoingLinks(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3007OutgoingLinks(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3008OutgoingLinks(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3009OutgoingLinks(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3010OutgoingLinks(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_3011OutgoingLinks(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001OutgoingLinks(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getPersistence_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getEntity_2001ContainedLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getView_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDataTypeAttribute_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDateAttribute_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getFileAttribute_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getImageAttribute_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getLocationAttribute_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getUrlAttribute_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAttribute_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAssociation_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getViewAssociation_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithoutContainment_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithContainment_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getEntity_2001IncomingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AssociationWithContainment_4002(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getView_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDataTypeAttribute_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDateAttribute_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getFileAttribute_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getImageAttribute_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getLocationAttribute_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getUrlAttribute_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAttribute_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAssociation_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getViewAssociation_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithoutContainment_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithContainment_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getEntity_2001OutgoingLinks(View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AssociationWithContainment_4002(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getView_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDataTypeAttribute_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getDateAttribute_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PersistenceLinkDescriptor> getFileAttribute_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getImageAttribute_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getLocationAttribute_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getUrlAttribute_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getModelLabel_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAttribute_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getEncapsulatedAssociation_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getViewAssociation_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithoutContainment_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PersistenceLinkDescriptor> getAssociationWithContainment_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PersistenceLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithoutContainment_4001(
			Entity container) {
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		for (Iterator<?> links = container.getEntityFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationWithoutContainment) {
				continue;
			}
			AssociationWithoutContainment link = (AssociationWithoutContainment) linkObject;
			if (AssociationWithoutContainmentEditPart.VISUAL_ID != PersistenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTargetEntity();
			result.add(new PersistenceLinkDescriptor(container, dst, link,
					PersistenceElementTypes.AssociationWithoutContainment_4001,
					AssociationWithoutContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PersistenceLinkDescriptor> getContainedTypeModelFacetLinks_AssociationWithContainment_4002(
			Entity container) {
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		for (Iterator<?> links = container.getEntityFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationWithContainment) {
				continue;
			}
			AssociationWithContainment link = (AssociationWithContainment) linkObject;
			if (AssociationWithContainmentEditPart.VISUAL_ID != PersistenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Entity dst = link.getTargetEntity();
			result.add(new PersistenceLinkDescriptor(container, dst, link,
					PersistenceElementTypes.AssociationWithContainment_4002,
					AssociationWithContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PersistenceLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithoutContainment_4001(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PersistencePackage.eINSTANCE.getEntityAssociation_TargetEntity()
					|| false == setting.getEObject() instanceof AssociationWithoutContainment) {
				continue;
			}
			AssociationWithoutContainment link = (AssociationWithoutContainment) setting.getEObject();
			if (AssociationWithoutContainmentEditPart.VISUAL_ID != PersistenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Entity) {
				continue;
			}
			Entity container = (Entity) link.eContainer();
			result.add(new PersistenceLinkDescriptor(container, target, link,
					PersistenceElementTypes.AssociationWithoutContainment_4001,
					AssociationWithoutContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PersistenceLinkDescriptor> getIncomingTypeModelFacetLinks_AssociationWithContainment_4002(
			Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PersistenceLinkDescriptor> result = new LinkedList<PersistenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PersistencePackage.eINSTANCE.getEntityAssociation_TargetEntity()
					|| false == setting.getEObject() instanceof AssociationWithContainment) {
				continue;
			}
			AssociationWithContainment link = (AssociationWithContainment) setting.getEObject();
			if (AssociationWithContainmentEditPart.VISUAL_ID != PersistenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Entity) {
				continue;
			}
			Entity container = (Entity) link.eContainer();
			result.add(new PersistenceLinkDescriptor(container, target, link,
					PersistenceElementTypes.AssociationWithContainment_4002,
					AssociationWithContainmentEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PersistenceNodeDescriptor> getSemanticChildren(View view) {
			return PersistenceDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PersistenceLinkDescriptor> getContainedLinks(View view) {
			return PersistenceDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PersistenceLinkDescriptor> getIncomingLinks(View view) {
			return PersistenceDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PersistenceLinkDescriptor> getOutgoingLinks(View view) {
			return PersistenceDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
