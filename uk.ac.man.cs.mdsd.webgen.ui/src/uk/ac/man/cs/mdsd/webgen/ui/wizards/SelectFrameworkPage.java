package uk.ac.man.cs.mdsd.webgen.ui.wizards;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


public class SelectFrameworkPage extends WizardPage {

	private Frameworks framework;
	private Set<Button> buttons = new HashSet<Button>();


	protected SelectFrameworkPage(String pageName) {
		super(pageName);
		setTitle("Select Implementation Framework");
		setDescription("Select the implmentation framework for the generated web site");
	}

	@Override
	public void createControl(Composite parent) {
		final Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		final RowLayout layout = new RowLayout();
		container.setLayout(layout);
		layout.type = SWT.VERTICAL;
		for (Frameworks framework : Frameworks.values()) {
			final Button button =  new Button(container, SWT.RADIO);
			buttons.add(button);
			button.setText(framework.toString());
			button.setData(framework);
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					setFramework((Frameworks) ((Button) e.getSource()).getData());
		    	    setPageComplete(true);
				}
			});
		}
		setPageComplete(false);
	}

	public Frameworks getFramework() {
		return framework;
	}

	protected void setFramework(final Frameworks framework) {
		this.framework = framework;
	}

}
