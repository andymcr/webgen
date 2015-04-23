package uk.ac.man.cs.mdsd.webgen.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class WebgenUiPlugin {
	public static WebgenUiPlugin INSTANCE = new WebgenUiPlugin();
	private static Activator plugin;


	public static Activator getPlugin() {
		return plugin;
	}

	public static IDialogSettings getDialogSettings() {
		return plugin.getDialogSettings();
	}

	public static String getSymbolicName() {
		return plugin.getSymbolicName();
	}

	public static void log(final IStatus entry) {
		plugin.log(entry);
	}

	public static void log(final String entry) {
		plugin.log(IStatus.INFO, entry);
	}

	public static void log(final Throwable entry) {
		plugin.log(IStatus.ERROR, entry);
	}

	public static void log(final int severity, final String entry) {
		plugin.log(severity, entry);
	}

	public static void log(final int severity, final Throwable entry) {
		plugin.log(severity, entry);
	}

	public static class Activator extends AbstractUIPlugin {
		public Activator() {
			plugin = this;
		}
	
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
		}
	
		@Override
		public void stop(BundleContext context) throws Exception {
			plugin = null;
			super.stop(context);
		}
	
		public String getSymbolicName() {
			return getBundle().getSymbolicName();
		}

		public void log(final IStatus entry) {
			getLog().log((IStatus) entry);
		}

		public void log(final int severity, final String entry) {
			getLog().log(new Status(severity, getBundle().getSymbolicName(),
				0, entry, null));
		}

		public void log(final int severity, final Throwable entry) {
			getLog().log(new Status(severity, getBundle().getSymbolicName(),
				0, entry.getLocalizedMessage(), entry));
		}

	}
}
