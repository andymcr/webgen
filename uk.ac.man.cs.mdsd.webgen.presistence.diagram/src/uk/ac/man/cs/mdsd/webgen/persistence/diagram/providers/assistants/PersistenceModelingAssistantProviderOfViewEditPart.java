package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceModelingAssistantProvider;

/**
 * @generated
 */
public class PersistenceModelingAssistantProviderOfViewEditPart extends PersistenceModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(PersistenceElementTypes.ModelLabel_3008);
		types.add(PersistenceElementTypes.EncapsulatedAttribute_3009);
		types.add(PersistenceElementTypes.EncapsulatedAssociation_3010);
		types.add(PersistenceElementTypes.ViewAssociation_3011);
		return types;
	}

}
