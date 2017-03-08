package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DataTypeAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DateAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.FileAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ImageAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.LocationAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabel2EditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.PersistenceEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.UrlAttributeEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAssociationEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceDiagramEditorPlugin;

/**
 * @generated
 */
public class PersistenceElementTypes {

	/**
	* @generated
	*/
	private PersistenceElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PersistenceDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Persistence_1000 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.Persistence_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_2001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.Entity_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType View_2002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.View_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3004 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.ModelLabel_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType DataTypeAttribute_3001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.DataTypeAttribute_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DateAttribute_3002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.DateAttribute_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FileAttribute_3003 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.FileAttribute_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ImageAttribute_3005 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.ImageAttribute_3005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType LocationAttribute_3006 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.LocationAttribute_3006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UrlAttribute_3007 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.UrlAttribute_3007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ModelLabel_3008 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.ModelLabel_3008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAttribute_3009 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.EncapsulatedAttribute_3009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType EncapsulatedAssociation_3010 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.EncapsulatedAssociation_3010"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ViewAssociation_3011 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.ViewAssociation_3011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AssociationWithoutContainment_4001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.AssociationWithoutContainment_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AssociationWithContainment_4002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.presistence.diagram.AssociationWithContainment_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Persistence_1000, PersistencePackage.eINSTANCE.getPersistence());

			elements.put(Entity_2001, PersistencePackage.eINSTANCE.getEntity());

			elements.put(View_2002, PersistencePackage.eINSTANCE.getView());

			elements.put(ModelLabel_3004, PersistencePackage.eINSTANCE.getModelLabel());

			elements.put(DataTypeAttribute_3001, PersistencePackage.eINSTANCE.getDataTypeAttribute());

			elements.put(DateAttribute_3002, PersistencePackage.eINSTANCE.getDateAttribute());

			elements.put(FileAttribute_3003, PersistencePackage.eINSTANCE.getFileAttribute());

			elements.put(ImageAttribute_3005, PersistencePackage.eINSTANCE.getImageAttribute());

			elements.put(LocationAttribute_3006, PersistencePackage.eINSTANCE.getLocationAttribute());

			elements.put(UrlAttribute_3007, PersistencePackage.eINSTANCE.getUrlAttribute());

			elements.put(ModelLabel_3008, PersistencePackage.eINSTANCE.getModelLabel());

			elements.put(EncapsulatedAttribute_3009, PersistencePackage.eINSTANCE.getEncapsulatedAttribute());

			elements.put(EncapsulatedAssociation_3010, PersistencePackage.eINSTANCE.getEncapsulatedAssociation());

			elements.put(ViewAssociation_3011, PersistencePackage.eINSTANCE.getViewAssociation());

			elements.put(AssociationWithoutContainment_4001,
					PersistencePackage.eINSTANCE.getAssociationWithoutContainment());

			elements.put(AssociationWithContainment_4002, PersistencePackage.eINSTANCE.getAssociationWithContainment());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Persistence_1000);
			KNOWN_ELEMENT_TYPES.add(Entity_2001);
			KNOWN_ELEMENT_TYPES.add(View_2002);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3004);
			KNOWN_ELEMENT_TYPES.add(DataTypeAttribute_3001);
			KNOWN_ELEMENT_TYPES.add(DateAttribute_3002);
			KNOWN_ELEMENT_TYPES.add(FileAttribute_3003);
			KNOWN_ELEMENT_TYPES.add(ImageAttribute_3005);
			KNOWN_ELEMENT_TYPES.add(LocationAttribute_3006);
			KNOWN_ELEMENT_TYPES.add(UrlAttribute_3007);
			KNOWN_ELEMENT_TYPES.add(ModelLabel_3008);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAttribute_3009);
			KNOWN_ELEMENT_TYPES.add(EncapsulatedAssociation_3010);
			KNOWN_ELEMENT_TYPES.add(ViewAssociation_3011);
			KNOWN_ELEMENT_TYPES.add(AssociationWithoutContainment_4001);
			KNOWN_ELEMENT_TYPES.add(AssociationWithContainment_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PersistenceEditPart.VISUAL_ID:
			return Persistence_1000;
		case EntityEditPart.VISUAL_ID:
			return Entity_2001;
		case ViewEditPart.VISUAL_ID:
			return View_2002;
		case ModelLabelEditPart.VISUAL_ID:
			return ModelLabel_3004;
		case DataTypeAttributeEditPart.VISUAL_ID:
			return DataTypeAttribute_3001;
		case DateAttributeEditPart.VISUAL_ID:
			return DateAttribute_3002;
		case FileAttributeEditPart.VISUAL_ID:
			return FileAttribute_3003;
		case ImageAttributeEditPart.VISUAL_ID:
			return ImageAttribute_3005;
		case LocationAttributeEditPart.VISUAL_ID:
			return LocationAttribute_3006;
		case UrlAttributeEditPart.VISUAL_ID:
			return UrlAttribute_3007;
		case ModelLabel2EditPart.VISUAL_ID:
			return ModelLabel_3008;
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return EncapsulatedAttribute_3009;
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return EncapsulatedAssociation_3010;
		case ViewAssociationEditPart.VISUAL_ID:
			return ViewAssociation_3011;
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return AssociationWithoutContainment_4001;
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return AssociationWithContainment_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
