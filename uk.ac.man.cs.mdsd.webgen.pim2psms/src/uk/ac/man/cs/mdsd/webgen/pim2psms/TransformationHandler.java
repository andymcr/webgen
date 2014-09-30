package uk.ac.man.cs.mdsd.webgen.pim2psms;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;


public class TransformationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final TransformUsingEmftVm transformer = new TransformUsingEmftVm();

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("rawtypes")
			Iterator i = ((IStructuredSelection) selection).iterator();
			while (i.hasNext()) {
				Object element = i.next();
				IFile file = null;
				if (element instanceof IFile) {
					file = (IFile) element;
				} else if (element instanceof IAdaptable) {
					file = (IFile) ((IAdaptable) element)
						.getAdapter(IFile.class);
				}
				if (file != null) {
					transformer.setWebsiteModel(file);
					try {
						transformer.execute();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//					if (!transformer.isSyntaxValid()) {
//						IWorkbenchWindow window
//							= HandlerUtil.getActiveWorkbenchWindowChecked(event);
//						MessageDialog.openInformation(window.getShell(),
//							"Invalid model", file.getName());
//					} else {
//						transformer.performTransformation();
//					}
				}
			}
		}
		return null;
	}

}
