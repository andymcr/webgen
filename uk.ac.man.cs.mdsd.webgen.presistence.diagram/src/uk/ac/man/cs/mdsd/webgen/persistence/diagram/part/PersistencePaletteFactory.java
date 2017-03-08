
package uk.ac.man.cs.mdsd.webgen.persistence.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.providers.PersistenceElementTypes;

/**
 * @generated
 */
public class PersistencePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	* Creates "Default" palette tool group
	* @generated
	*/
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createEntity1CreationTool());
		paletteContainer.add(createDataTypeAttribute2CreationTool());
		paletteContainer.add(createDateAttribute3CreationTool());
		paletteContainer.add(createFileAttribute4CreationTool());
		paletteContainer.add(createImageAttribute5CreationTool());
		paletteContainer.add(createLocationAttribute6CreationTool());
		paletteContainer.add(createURLAttribute7CreationTool());
		paletteContainer.add(createUncontainedAssociation8CreationTool());
		paletteContainer.add(createContainedAssociation9CreationTool());
		paletteContainer.add(createView10CreationTool());
		paletteContainer.add(createEncapsulatedAttribute11CreationTool());
		paletteContainer.add(createEncapsulatedAssociation12CreationTool());
		paletteContainer.add(createViewAssociation13CreationTool());
		paletteContainer.add(createModelLabel14CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entity1CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.Entity_2001));
		entry.setId("createEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.Entity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataTypeAttribute2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DataTypeAttribute2CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.DataTypeAttribute_3001));
		entry.setId("createDataTypeAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.DataTypeAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDateAttribute3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DateAttribute3CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.DateAttribute_3002));
		entry.setId("createDateAttribute3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.DateAttribute_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFileAttribute4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FileAttribute4CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.FileAttribute_3003));
		entry.setId("createFileAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.FileAttribute_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageAttribute5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImageAttribute5CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.ImageAttribute_3005));
		entry.setId("createImageAttribute5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.ImageAttribute_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLocationAttribute6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LocationAttribute6CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.LocationAttribute_3006));
		entry.setId("createLocationAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.LocationAttribute_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createURLAttribute7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.URLAttribute7CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.UrlAttribute_3007));
		entry.setId("createURLAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.UrlAttribute_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUncontainedAssociation8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.UncontainedAssociation8CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.AssociationWithoutContainment_4001));
		entry.setId("createUncontainedAssociation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.AssociationWithoutContainment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContainedAssociation9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ContainedAssociation9CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.AssociationWithContainment_4002));
		entry.setId("createContainedAssociation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.AssociationWithContainment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createView10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.View10CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.View_2002));
		entry.setId("createView10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.View_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAttribute11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAttribute11CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.EncapsulatedAttribute_3009));
		entry.setId("createEncapsulatedAttribute11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.EncapsulatedAttribute_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncapsulatedAssociation12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EncapsulatedAssociation12CreationTool_title,
				null, Collections.singletonList(PersistenceElementTypes.EncapsulatedAssociation_3010));
		entry.setId("createEncapsulatedAssociation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.EncapsulatedAssociation_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createViewAssociation13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ViewAssociation13CreationTool_title, null,
				Collections.singletonList(PersistenceElementTypes.ViewAssociation_3011));
		entry.setId("createViewAssociation13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.ViewAssociation_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModelLabel14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PersistenceElementTypes.ModelLabel_3004);
		types.add(PersistenceElementTypes.ModelLabel_3008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModelLabel14CreationTool_title, null, types);
		entry.setId("createModelLabel14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PersistenceElementTypes.getImageDescriptor(PersistenceElementTypes.ModelLabel_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
