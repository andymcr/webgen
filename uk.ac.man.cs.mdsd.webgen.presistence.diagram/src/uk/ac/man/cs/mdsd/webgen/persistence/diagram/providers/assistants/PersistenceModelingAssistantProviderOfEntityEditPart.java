package uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts.EntityEditPart;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceModelingAssistantProvider;

/**
 * @generated
 */
public class PersistenceModelingAssistantProviderOfEntityEditPart extends PersistenceModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(PersistenceElementTypes.ModelLabel_3004);
		types.add(PersistenceElementTypes.DataTypeAttribute_3001);
		types.add(PersistenceElementTypes.DateAttribute_3002);
		types.add(PersistenceElementTypes.FileAttribute_3003);
		types.add(PersistenceElementTypes.ImageAttribute_3005);
		types.add(PersistenceElementTypes.LocationAttribute_3006);
		types.add(PersistenceElementTypes.UrlAttribute_3007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EntityEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PersistenceElementTypes.AssociationWithoutContainment_4001);
		types.add(PersistenceElementTypes.AssociationWithContainment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EntityEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(EntityEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EntityEditPart) {
			types.add(PersistenceElementTypes.AssociationWithoutContainment_4001);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(PersistenceElementTypes.AssociationWithContainment_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EntityEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(EntityEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PersistenceElementTypes.AssociationWithoutContainment_4001) {
			types.add(PersistenceElementTypes.Entity_2001);
		} else if (relationshipType == PersistenceElementTypes.AssociationWithContainment_4002) {
			types.add(PersistenceElementTypes.Entity_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EntityEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PersistenceElementTypes.AssociationWithoutContainment_4001);
		types.add(PersistenceElementTypes.AssociationWithContainment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EntityEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EntityEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PersistenceElementTypes.AssociationWithoutContainment_4001) {
			types.add(PersistenceElementTypes.Entity_2001);
		} else if (relationshipType == PersistenceElementTypes.AssociationWithContainment_4002) {
			types.add(PersistenceElementTypes.Entity_2001);
		}
		return types;
	}

}
