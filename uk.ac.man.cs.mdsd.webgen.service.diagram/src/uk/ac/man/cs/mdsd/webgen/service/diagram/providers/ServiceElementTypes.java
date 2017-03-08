package uk.ac.man.cs.mdsd.webgen.service.diagram.providers;

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

import uk.ac.man.cs.mdsd.webgen.service.ServicePackage;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.BusinessOperationEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.SelectionEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServicesEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceDiagramEditorPlugin;

/**
 * @generated
 */
public class ServiceElementTypes {

	/**
	* @generated
	*/
	private ServiceElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ServiceDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Services_1000 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.service.diagram.Services_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Service_2001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.service.diagram.Service_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Selection_3001 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.service.diagram.Selection_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BusinessOperation_3002 = getElementType(
			"uk.ac.man.cs.mdsd.webgen.service.diagram.BusinessOperation_3002"); //$NON-NLS-1$

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

			elements.put(Services_1000, ServicePackage.eINSTANCE.getServices());

			elements.put(Service_2001, ServicePackage.eINSTANCE.getService());

			elements.put(Selection_3001, ServicePackage.eINSTANCE.getSelection());

			elements.put(BusinessOperation_3002, ServicePackage.eINSTANCE.getBusinessOperation());
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
			KNOWN_ELEMENT_TYPES.add(Services_1000);
			KNOWN_ELEMENT_TYPES.add(Service_2001);
			KNOWN_ELEMENT_TYPES.add(Selection_3001);
			KNOWN_ELEMENT_TYPES.add(BusinessOperation_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ServicesEditPart.VISUAL_ID:
			return Services_1000;
		case ServiceEditPart.VISUAL_ID:
			return Service_2001;
		case SelectionEditPart.VISUAL_ID:
			return Selection_3001;
		case BusinessOperationEditPart.VISUAL_ID:
			return BusinessOperation_3002;
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
			return uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
