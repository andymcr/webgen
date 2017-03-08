package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;
import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.PersistencePackage;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentCardinalityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentCardinalityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.AssociationWithoutContainmentNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DataTypeAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.DateAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EncapsulatedAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.FileAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ImageAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.LocationAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelName2EditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ModelLabelNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.UrlAttributeNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewAssociationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.ViewNameEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.parsers.MessageFormatParser;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.part.PersistenceVisualIDRegistry;

/**
 * @generated
 */
public class PersistenceParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser entityName_5004Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5004Parser() {
		if (entityName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityName_5004Parser = parser;
		}
		return entityName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser viewName_5013Parser;

	/**
	* @generated
	*/
	private IParser getViewName_5013Parser() {
		if (viewName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewName_5013Parser = parser;
		}
		return viewName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser modelLabelName_5008Parser;

	/**
	* @generated
	*/
	private IParser getModelLabelName_5008Parser() {
		if (modelLabelName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelLabelName_5008Parser = parser;
		}
		return modelLabelName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeAttributeName_5001Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeAttributeName_5001Parser() {
		if (dataTypeAttributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataTypeAttributeName_5001Parser = parser;
		}
		return dataTypeAttributeName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser dateAttributeName_5002Parser;

	/**
	* @generated
	*/
	private IParser getDateAttributeName_5002Parser() {
		if (dateAttributeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateAttributeName_5002Parser = parser;
		}
		return dateAttributeName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser fileAttributeName_5003Parser;

	/**
	* @generated
	*/
	private IParser getFileAttributeName_5003Parser() {
		if (fileAttributeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileAttributeName_5003Parser = parser;
		}
		return fileAttributeName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser imageAttributeName_5005Parser;

	/**
	* @generated
	*/
	private IParser getImageAttributeName_5005Parser() {
		if (imageAttributeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			imageAttributeName_5005Parser = parser;
		}
		return imageAttributeName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser locationAttributeName_5006Parser;

	/**
	* @generated
	*/
	private IParser getLocationAttributeName_5006Parser() {
		if (locationAttributeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			locationAttributeName_5006Parser = parser;
		}
		return locationAttributeName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser urlAttributeName_5007Parser;

	/**
	* @generated
	*/
	private IParser getUrlAttributeName_5007Parser() {
		if (urlAttributeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			urlAttributeName_5007Parser = parser;
		}
		return urlAttributeName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser modelLabelName_5009Parser;

	/**
	* @generated
	*/
	private IParser getModelLabelName_5009Parser() {
		if (modelLabelName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelLabelName_5009Parser = parser;
		}
		return modelLabelName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser encapsulatedAttributeName_5010Parser;

	/**
	* @generated
	*/
	private IParser getEncapsulatedAttributeName_5010Parser() {
		if (encapsulatedAttributeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { PersistencePackage.eINSTANCE.getEncapsulatedAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			encapsulatedAttributeName_5010Parser = parser;
		}
		return encapsulatedAttributeName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser encapsulatedAssociationName_5011Parser;

	/**
	* @generated
	*/
	private IParser getEncapsulatedAssociationName_5011Parser() {
		if (encapsulatedAssociationName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { PersistencePackage.eINSTANCE.getEncapsulatedAssociation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			encapsulatedAssociationName_5011Parser = parser;
		}
		return encapsulatedAssociationName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser viewAssociationName_5012Parser;

	/**
	* @generated
	*/
	private IParser getViewAssociationName_5012Parser() {
		if (viewAssociationName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewAssociationName_5012Parser = parser;
		}
		return viewAssociationName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithoutContainmentName_6001Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithoutContainmentName_6001Parser() {
		if (associationWithoutContainmentName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithoutContainmentName_6001Parser = parser;
		}
		return associationWithoutContainmentName_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithoutContainmentCardinality_6002Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithoutContainmentCardinality_6002Parser() {
		if (associationWithoutContainmentCardinality_6002Parser == null) {
			EAttribute editableFeature = PersistencePackage.eINSTANCE.getEntityFeature_Cardinality();
			EnumParser parser = new EnumParser(editableFeature);
			associationWithoutContainmentCardinality_6002Parser = parser;
		}
		return associationWithoutContainmentCardinality_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithContainmentName_6003Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithContainmentName_6003Parser() {
		if (associationWithContainmentName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationWithContainmentName_6003Parser = parser;
		}
		return associationWithContainmentName_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser associationWithContainmentCardinality_6004Parser;

	/**
	* @generated
	*/
	private IParser getAssociationWithContainmentCardinality_6004Parser() {
		if (associationWithContainmentCardinality_6004Parser == null) {
			EAttribute editableFeature = PersistencePackage.eINSTANCE.getEntityFeature_Cardinality();
			EnumParser parser = new EnumParser(editableFeature);
			associationWithContainmentCardinality_6004Parser = parser;
		}
		return associationWithContainmentCardinality_6004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EntityNameEditPart.VISUAL_ID:
			return getEntityName_5004Parser();
		case ViewNameEditPart.VISUAL_ID:
			return getViewName_5013Parser();
		case ModelLabelNameEditPart.VISUAL_ID:
			return getModelLabelName_5008Parser();
		case DataTypeAttributeNameEditPart.VISUAL_ID:
			return getDataTypeAttributeName_5001Parser();
		case DateAttributeNameEditPart.VISUAL_ID:
			return getDateAttributeName_5002Parser();
		case FileAttributeNameEditPart.VISUAL_ID:
			return getFileAttributeName_5003Parser();
		case ImageAttributeNameEditPart.VISUAL_ID:
			return getImageAttributeName_5005Parser();
		case LocationAttributeNameEditPart.VISUAL_ID:
			return getLocationAttributeName_5006Parser();
		case UrlAttributeNameEditPart.VISUAL_ID:
			return getUrlAttributeName_5007Parser();
		case ModelLabelName2EditPart.VISUAL_ID:
			return getModelLabelName_5009Parser();
		case EncapsulatedAttributeNameEditPart.VISUAL_ID:
			return getEncapsulatedAttributeName_5010Parser();
		case EncapsulatedAssociationNameEditPart.VISUAL_ID:
			return getEncapsulatedAssociationName_5011Parser();
		case ViewAssociationNameEditPart.VISUAL_ID:
			return getViewAssociationName_5012Parser();
		case AssociationWithoutContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentName_6001Parser();

		case AssociationWithoutContainmentCardinalityEditPart.VISUAL_ID:
			return getAssociationWithoutContainmentCardinality_6002Parser();
		case AssociationWithContainmentNameEditPart.VISUAL_ID:
			return getAssociationWithContainmentName_6003Parser();

		case AssociationWithContainmentCardinalityEditPart.VISUAL_ID:
			return getAssociationWithContainmentCardinality_6004Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PersistenceVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PersistenceVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PersistenceElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
