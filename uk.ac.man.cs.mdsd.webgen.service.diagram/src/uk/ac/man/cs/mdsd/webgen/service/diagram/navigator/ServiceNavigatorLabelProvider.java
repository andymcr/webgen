package uk.ac.man.cs.mdsd.webgen.service.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.BusinessOperationEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.BusinessOperationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.SelectionEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.SelectionNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServicesEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes;
import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceParserProvider;

/**
 * @generated
 */
public class ServiceNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ServiceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ServiceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ServiceNavigatorItem && !isOwnView(((ServiceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ServiceNavigatorGroup) {
			ServiceNavigatorGroup group = (ServiceNavigatorGroup) element;
			return ServiceDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ServiceNavigatorItem) {
			ServiceNavigatorItem navigatorItem = (ServiceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServicesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://cs.man.ac.uk/mdsd/webgen/service?Services", //$NON-NLS-1$
					ServiceElementTypes.Services_1000);
		case ServiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/service?Service", //$NON-NLS-1$
					ServiceElementTypes.Service_2001);
		case SelectionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/service?Selection", //$NON-NLS-1$
					ServiceElementTypes.Selection_3001);
		case BusinessOperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/service?BusinessOperation", //$NON-NLS-1$
					ServiceElementTypes.BusinessOperation_3002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ServiceDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ServiceElementTypes.isKnownElementType(elementType)) {
			image = ServiceElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ServiceNavigatorGroup) {
			ServiceNavigatorGroup group = (ServiceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ServiceNavigatorItem) {
			ServiceNavigatorItem navigatorItem = (ServiceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ServiceVisualIDRegistry.getVisualID(view)) {
		case ServicesEditPart.VISUAL_ID:
			return getServices_1000Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001Text(view);
		case SelectionEditPart.VISUAL_ID:
			return getSelection_3001Text(view);
		case BusinessOperationEditPart.VISUAL_ID:
			return getBusinessOperation_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getServices_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getService_2001Text(View view) {
		IParser parser = ServiceParserProvider.getParser(ServiceElementTypes.Service_2001,
				view.getElement() != null ? view.getElement() : view,
				ServiceVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ServiceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSelection_3001Text(View view) {
		IParser parser = ServiceParserProvider.getParser(ServiceElementTypes.Selection_3001,
				view.getElement() != null ? view.getElement() : view,
				ServiceVisualIDRegistry.getType(SelectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ServiceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBusinessOperation_3002Text(View view) {
		IParser parser = ServiceParserProvider.getParser(ServiceElementTypes.BusinessOperation_3002,
				view.getElement() != null ? view.getElement() : view,
				ServiceVisualIDRegistry.getType(BusinessOperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ServiceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ServicesEditPart.MODEL_ID.equals(ServiceVisualIDRegistry.getModelID(view));
	}

}
