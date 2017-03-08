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
public class PersistenceModelingAssistantProviderOfPersistenceEditPart extends PersistenceModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PersistenceElementTypes.Entity_2001);
		types.add(PersistenceElementTypes.View_2002);
		return types;
	}

}
