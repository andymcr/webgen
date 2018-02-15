/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsiteEditorPlugin.java,v 1.2 2014/02/04 15:41:31 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.presentation;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import uk.ac.man.cs.mdsd.webgen.api.provider.ApiEditPlugin;
import uk.ac.man.cs.mdsd.webgen.base.provider.BaseEditPlugin;
import uk.ac.man.cs.mdsd.webgen.expression.provider.ExpressionEditPlugin;
import uk.ac.man.cs.mdsd.webgen.image.provider.ImageEditPlugin;
import uk.ac.man.cs.mdsd.webgen.persistence.provider.PersistenceEditPlugin;
import uk.ac.man.cs.mdsd.webgen.security.provider.SecurityEditPlugin;
import uk.ac.man.cs.mdsd.webgen.service.provider.ServiceEditPlugin;
import uk.ac.man.cs.mdsd.webgen.webui.provider.WebuiEditPlugin;

/**
 * This is the central singleton for the Website editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WebsiteEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WebsiteEditorPlugin INSTANCE = new WebsiteEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteEditorPlugin() {
		super
			(new ResourceLocator [] {
				ApiEditPlugin.INSTANCE,
				BaseEditPlugin.INSTANCE,
				ExpressionEditPlugin.INSTANCE,
				ImageEditPlugin.INSTANCE,
				PersistenceEditPlugin.INSTANCE,
				SecurityEditPlugin.INSTANCE,
				ServiceEditPlugin.INSTANCE,
				WebuiEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
