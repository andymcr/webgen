
package uk.ac.man.cs.mdsd.webgen.service.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uk.ac.man.cs.mdsd.webgen.service.diagram.providers.ServiceElementTypes;

/**
 * @generated
 */
public class ServicePaletteFactory {

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
		paletteContainer.add(createBusinessOperation1CreationTool());
		paletteContainer.add(createService2CreationTool());
		paletteContainer.add(createSelection3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBusinessOperation1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BusinessOperation1CreationTool_title, null,
				Collections.singletonList(ServiceElementTypes.BusinessOperation_3002));
		entry.setId("createBusinessOperation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceElementTypes.getImageDescriptor(ServiceElementTypes.BusinessOperation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createService2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Service2CreationTool_title, null,
				Collections.singletonList(ServiceElementTypes.Service_2001));
		entry.setId("createService2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceElementTypes.getImageDescriptor(ServiceElementTypes.Service_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelection3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Selection3CreationTool_title, null,
				Collections.singletonList(ServiceElementTypes.Selection_3001));
		entry.setId("createSelection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ServiceElementTypes.getImageDescriptor(ServiceElementTypes.Selection_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
