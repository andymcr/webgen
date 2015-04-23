package uk.ac.man.cs.mdsd.webgen.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import uk.ac.man.cs.mdsd.webgen.ui.WebgenUiPlugin;


public class NewWebgenProjectWizard extends Wizard implements INewWizard {
	@SuppressWarnings("unused")
	private IWorkbench workbench;
	@SuppressWarnings("unused")
	private IStructuredSelection selection;

	private WizardNewProjectCreationPage projectPage;
	private SelectFrameworkPage frameworkPage;
 

    public NewWebgenProjectWizard() {
        setWindowTitle("New Webgen Project");
    }

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	@Override
	public void addPages() {
		super.addPages();

		projectPage = new WizardNewProjectCreationPage("From Scratch Project Wizard");
		projectPage.setTitle("Create Webgen project");
		projectPage.setDescription("Create a new Webgen project");
		addPage(projectPage);

		frameworkPage = new SelectFrameworkPage("Implementation Framework");
		addPage(frameworkPage);
	}

	@Override
	public boolean performFinish() {
		final WorkspaceModifyOperation operation
			= new NewWebgenProjectOperation(projectPage.getProjectHandle(), 
				frameworkPage.getFramework(),
				projectPage.useDefaults() ? null : projectPage.getLocationURI());
		try {
			getContainer().run(false, true, operation);
		} catch (InterruptedException | InvocationTargetException exception ) {
			WebgenUiPlugin.log(exception);
			return false;
		}

		return true;
	}

}