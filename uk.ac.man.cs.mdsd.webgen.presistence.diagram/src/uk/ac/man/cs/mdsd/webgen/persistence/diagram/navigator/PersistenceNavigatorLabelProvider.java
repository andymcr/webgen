package uk.ac.man.cs.mdsd.webgen.persistence.diagram.navigator;

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

import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.persistence.Persistence;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentNameEditPart;
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
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityEditPart;
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
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceDiagramEditorPlugin;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceParserProvider;

/**
 * @generated
 */
public class PersistenceNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PersistenceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PersistenceDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PersistenceNavigatorItem && !isOwnView(((PersistenceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PersistenceNavigatorGroup) {
			PersistenceNavigatorGroup group = (PersistenceNavigatorGroup) element;
			return PersistenceDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PersistenceNavigatorItem) {
			PersistenceNavigatorItem navigatorItem = (PersistenceNavigatorItem) element;
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
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case PersistenceEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://cs.man.ac.uk/mdsd/webgen/persistence?Persistence", //$NON-NLS-1$
					PersistenceElementTypes.Persistence_1000);
		case EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/persistence?Entity", //$NON-NLS-1$
					PersistenceElementTypes.Entity_2001);
		case ViewEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://cs.man.ac.uk/mdsd/webgen/persistence?View", //$NON-NLS-1$
					PersistenceElementTypes.View_2002);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?DataTypeAttribute", //$NON-NLS-1$
					PersistenceElementTypes.DataTypeAttribute_3001);
		case DateAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?DateAttribute", //$NON-NLS-1$
					PersistenceElementTypes.DateAttribute_3002);
		case FileAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?FileAttribute", //$NON-NLS-1$
					PersistenceElementTypes.FileAttribute_3003);
		case ModelLabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ModelLabel", //$NON-NLS-1$
					PersistenceElementTypes.ModelLabel_3004);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ImageAttribute", //$NON-NLS-1$
					PersistenceElementTypes.ImageAttribute_3005);
		case LocationAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?LocationAttribute", //$NON-NLS-1$
					PersistenceElementTypes.LocationAttribute_3006);
		case UrlAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?UrlAttribute", //$NON-NLS-1$
					PersistenceElementTypes.UrlAttribute_3007);
		case ModelLabel2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ModelLabel", //$NON-NLS-1$
					PersistenceElementTypes.ModelLabel_3008);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?EncapsulatedAttribute", //$NON-NLS-1$
					PersistenceElementTypes.EncapsulatedAttribute_3009);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?EncapsulatedAssociation", //$NON-NLS-1$
					PersistenceElementTypes.EncapsulatedAssociation_3010);
		case ViewAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://cs.man.ac.uk/mdsd/webgen/persistence?ViewAssociation", //$NON-NLS-1$
					PersistenceElementTypes.ViewAssociation_3011);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/persistence?AssociationWithoutContainment", //$NON-NLS-1$
					PersistenceElementTypes.AssociationWithoutContainment_4001);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://cs.man.ac.uk/mdsd/webgen/persistence?AssociationWithContainment", //$NON-NLS-1$
					PersistenceElementTypes.AssociationWithContainment_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PersistenceDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PersistenceElementTypes.isKnownElementType(elementType)) {
			image = PersistenceElementTypes.getImage(elementType);
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
		if (element instanceof PersistenceNavigatorGroup) {
			PersistenceNavigatorGroup group = (PersistenceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PersistenceNavigatorItem) {
			PersistenceNavigatorItem navigatorItem = (PersistenceNavigatorItem) element;
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
		switch (PersistenceVisualIDRegistry.getVisualID(view)) {
		case PersistenceEditPart.VISUAL_ID:
			return getPersistence_1000Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001Text(view);
		case ViewEditPart.VISUAL_ID:
			return getView_2002Text(view);
		case DataTypeAttributeEditPart.VISUAL_ID:
			return getDataTypeAttribute_3001Text(view);
		case DateAttributeEditPart.VISUAL_ID:
			return getDateAttribute_3002Text(view);
		case FileAttributeEditPart.VISUAL_ID:
			return getFileAttribute_3003Text(view);
		case ModelLabelEditPart.VISUAL_ID:
			return getModelLabel_3004Text(view);
		case ImageAttributeEditPart.VISUAL_ID:
			return getImageAttribute_3005Text(view);
		case LocationAttributeEditPart.VISUAL_ID:
			return getLocationAttribute_3006Text(view);
		case UrlAttributeEditPart.VISUAL_ID:
			return getUrlAttribute_3007Text(view);
		case ModelLabel2EditPart.VISUAL_ID:
			return getModelLabel_3008Text(view);
		case EncapsulatedAttributeEditPart.VISUAL_ID:
			return getEncapsulatedAttribute_3009Text(view);
		case EncapsulatedAssociationEditPart.VISUAL_ID:
			return getEncapsulatedAssociation_3010Text(view);
		case ViewAssociationEditPart.VISUAL_ID:
			return getViewAssociation_3011Text(view);
		case AssociationWithoutContainmentEditPart.VISUAL_ID:
			return getAssociationWithoutContainment_4001Text(view);
		case AssociationWithContainmentEditPart.VISUAL_ID:
			return getAssociationWithContainment_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPersistence_1000Text(View view) {
		Persistence domainModelElement = (Persistence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDatabaseName();
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2001Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.Entity_2001,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getView_2002Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.View_2002,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(ViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataTypeAttribute_3001Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.DataTypeAttribute_3001,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(DataTypeAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDateAttribute_3002Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.DateAttribute_3002,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(DateAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFileAttribute_3003Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.FileAttribute_3003,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(FileAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3004Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.ModelLabel_3004,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(ModelLabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImageAttribute_3005Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.ImageAttribute_3005,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(ImageAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLocationAttribute_3006Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.LocationAttribute_3006,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(LocationAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUrlAttribute_3007Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.UrlAttribute_3007,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(UrlAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getModelLabel_3008Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.ModelLabel_3008,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(ModelLabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAttribute_3009Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.EncapsulatedAttribute_3009,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(EncapsulatedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncapsulatedAssociation_3010Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.EncapsulatedAssociation_3010,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(EncapsulatedAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewAssociation_3011Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.ViewAssociation_3011,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(ViewAssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationWithoutContainment_4001Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.AssociationWithoutContainment_4001,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(AssociationWithoutContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssociationWithContainment_4002Text(View view) {
		IParser parser = PersistenceParserProvider.getParser(PersistenceElementTypes.AssociationWithContainment_4002,
				view.getElement() != null ? view.getElement() : view,
				PersistenceVisualIDRegistry.getType(AssociationWithContainmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PersistenceDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
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
		return PersistenceEditPart.MODEL_ID.equals(PersistenceVisualIDRegistry.getModelID(view));
	}

}
