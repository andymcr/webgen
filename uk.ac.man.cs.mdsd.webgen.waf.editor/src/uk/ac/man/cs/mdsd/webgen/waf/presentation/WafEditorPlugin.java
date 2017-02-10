/**
 */
package uk.ac.man.cs.mdsd.webgen.waf.presentation;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import uk.ac.man.cs.mdsd.webgen.core.provider.CoreEditPlugin;

import uk.ac.man.cs.mdsd.webgen.expression.provider.ExpressionEditPlugin;

import uk.ac.man.cs.mdsd.webgen.image.provider.ImageEditPlugin;

import uk.ac.man.cs.mdsd.webgen.interface_.provider.InterfaceEditPlugin;

import uk.ac.man.cs.mdsd.webgen.persistence.provider.PersistenceEditPlugin;

import uk.ac.man.cs.mdsd.webgen.rest.provider.RestEditPlugin;

import uk.ac.man.cs.mdsd.webgen.security.provider.SecurityEditPlugin;

import uk.ac.man.cs.mdsd.webgen.service.provider.ServiceEditPlugin;

/**
 * This is the central singleton for the Waf editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WafEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WafEditorPlugin INSTANCE = new WafEditorPlugin();
	
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
	public WafEditorPlugin() {
		super
			(new ResourceLocator [] {
				CoreEditPlugin.INSTANCE,
				ExpressionEditPlugin.INSTANCE,
				ImageEditPlugin.INSTANCE,
				InterfaceEditPlugin.INSTANCE,
				PersistenceEditPlugin.INSTANCE,
				RestEditPlugin.INSTANCE,
				SecurityEditPlugin.INSTANCE,
				ServiceEditPlugin.INSTANCE,
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
