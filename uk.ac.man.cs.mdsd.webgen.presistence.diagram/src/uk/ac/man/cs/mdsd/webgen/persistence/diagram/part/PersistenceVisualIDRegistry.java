package uk.ac.man.cs.mdsd.webgen.persistence.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentCardinalityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentCardinalityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DataTypeAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DataTypeAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DateAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DateAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityAttributeCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityModelLabelCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.FileAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.FileAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ImageAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ImageAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.LocationAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.LocationAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabel2EditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelName2EditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.PersistenceEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.UrlAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.UrlAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAttributeCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewModelLabelCompartmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PersistenceVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uk.ac.man.cs.mdsd.webgen.presistence.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PersistenceEditPart.MODEL_ID.equals(view.getType())) {
				return PersistenceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PersistenceDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PersistencePackage.eINSTANCE.getPersistence().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Persistence) domainElement)) {
			return PersistenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
				.getModelID(containerView);
		if (!PersistenceEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PersistenceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PersistenceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PersistenceEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getView().isSuperTypeOf(domainElement.eClass())) {
				return ViewEditPart.VISUAL_ID;
			}
			break;
		case EntityModelLabelCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getModelLabel().isSuperTypeOf(domainElement.eClass())) {
				return ModelLabelEditPart.VISUAL_ID;
			}
			break;
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getDataTypeAttribute().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getDateAttribute().isSuperTypeOf(domainElement.eClass())) {
				return DateAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getFileAttribute().isSuperTypeOf(domainElement.eClass())) {
				return FileAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getImageAttribute().isSuperTypeOf(domainElement.eClass())) {
				return ImageAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getLocationAttribute().isSuperTypeOf(domainElement.eClass())) {
				return LocationAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getUrlAttribute().isSuperTypeOf(domainElement.eClass())) {
				return UrlAttributeEditPart.VISUAL_ID;
			}
			break;
		case ViewModelLabelCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getModelLabel().isSuperTypeOf(domainElement.eClass())) {
				return ModelLabel2EditPart.VISUAL_ID;
			}
			break;
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			if (PersistencePackage.eINSTANCE.getEncapsulatedAttribute().isSuperTypeOf(domainElement.eClass())) {
				return EncapsulatedAttributeEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getEncapsulatedAssociation().isSuperTypeOf(domainElement.eClass())) {
				return EncapsulatedAssociationEditPart.VISUAL_ID;
			}
			if (PersistencePackage.eINSTANCE.getViewAssociation().isSuperTypeOf(domainElement.eClass())) {
				return ViewAssociationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
				.getModelID(containerView);
		if (!PersistenceEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PersistenceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PersistenceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PersistenceEditPart.VISUAL_ID:
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityModelLabelCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewEditPart.VISUAL_ID:
			if (ViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewModelLabelCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelLabelEditPart.VISUAL_ID:
			if (ModelLabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeAttributeEditPart.VISUAL_ID:
			if (DataTypeAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateAttributeEditPart.VISUAL_ID:
			if (DateAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileAttributeEditPart.VISUAL_ID:
			if (FileAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImageAttributeEditPart.VISUAL_ID:
			if (ImageAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocationAttributeEditPart.VISUAL_ID:
			if (LocationAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UrlAttributeEditPart.VISUAL_ID:
			if (UrlAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelLabel2EditPart.VISUAL_ID:
			if (ModelLabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			if (EncapsulatedAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			if (EncapsulatedAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewAssociationEditPart.VISUAL_ID:
			if (ViewAssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityModelLabelCompartmentEditPart.VISUAL_ID:
			if (ModelLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
			if (DataTypeAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ImageAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocationAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UrlAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewModelLabelCompartmentEditPart.VISUAL_ID:
			if (ModelLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			if (EncapsulatedAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EncapsulatedAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewAssociationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			if (AssociationWithoutContainmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationWithoutContainmentCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationWithContainmentEditPart.VISUAL_ID:
			if (AssociationWithContainmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationWithContainmentCardinalityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PersistencePackage.eINSTANCE.getAssociationWithoutContainment().isSuperTypeOf(domainElement.eClass())) {
			return AssociationWithoutContainmentEditPart.VISUAL_ID;
		}
		if (PersistencePackage.eINSTANCE.getAssociationWithContainment().isSuperTypeOf(domainElement.eClass())) {
			return AssociationWithContainmentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Persistence element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EntityModelLabelCompartmentEditPart.VISUAL_ID:
		case EntityAttributeCompartmentEditPart.VISUAL_ID:
		case ViewModelLabelCompartmentEditPart.VISUAL_ID:
		case ViewAttributeCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PersistenceEditPart.VISUAL_ID:
			return false;
		case DataTypeAttributeEditPart.VISUAL_ID:
		case DateAttributeEditPart.VISUAL_ID:
		case FileAttributeEditPart.VISUAL_ID:
		case ModelLabelEditPart.VISUAL_ID:
		case ImageAttributeEditPart.VISUAL_ID:
		case LocationAttributeEditPart.VISUAL_ID:
		case UrlAttributeEditPart.VISUAL_ID:
		case ModelLabel2EditPart.VISUAL_ID:
		case EncapsulatedAttributeEditPart.VISUAL_ID:
		case EncapsulatedAssociationEditPart.VISUAL_ID:
		case ViewAssociationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
