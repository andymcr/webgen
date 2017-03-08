package uk.ac.man.cs.mdsd.webgen.service.diagram.providers;

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

import uk.ac.man.cs.mdsd.webgen.base.BasePackage;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.BusinessOperationNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.SelectionNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.edit.parts.ServiceNameEditPart;
import uk.ac.man.cs.mdsd.webgen.service.diagram.parsers.MessageFormatParser;
import uk.ac.man.cs.mdsd.webgen.service.diagram.part.ServiceVisualIDRegistry;

/**
 * @generated
 */
public class ServiceParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser serviceName_5003Parser;

	/**
	* @generated
	*/
	private IParser getServiceName_5003Parser() {
		if (serviceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_5003Parser = parser;
		}
		return serviceName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser selectionName_5001Parser;

	/**
	* @generated
	*/
	private IParser getSelectionName_5001Parser() {
		if (selectionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selectionName_5001Parser = parser;
		}
		return selectionName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser businessOperationName_5002Parser;

	/**
	* @generated
	*/
	private IParser getBusinessOperationName_5002Parser() {
		if (businessOperationName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BasePackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessOperationName_5002Parser = parser;
		}
		return businessOperationName_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5003Parser();
		case SelectionNameEditPart.VISUAL_ID:
			return getSelectionName_5001Parser();
		case BusinessOperationNameEditPart.VISUAL_ID:
			return getBusinessOperationName_5002Parser();
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
			return getParser(ServiceVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ServiceVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ServiceElementTypes.getElement(hint) == null) {
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
