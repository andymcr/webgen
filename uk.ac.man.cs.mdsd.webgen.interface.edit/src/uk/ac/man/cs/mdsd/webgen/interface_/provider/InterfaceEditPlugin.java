/**
 */
package uk.ac.man.cs.mdsd.webgen.interface_.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import uk.ac.man.cs.mdsd.webgen.core.provider.CoreEditPlugin;
import uk.ac.man.cs.mdsd.webgen.expression.provider.ExpressionEditPlugin;

import uk.ac.man.cs.mdsd.webgen.image.provider.ImageEditPlugin;

import uk.ac.man.cs.mdsd.webgen.persistence.provider.PersistenceEditPlugin;

import uk.ac.man.cs.mdsd.webgen.service.provider.ServiceEditPlugin;

/**
 * This is the central singleton for the Interface edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class InterfaceEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InterfaceEditPlugin INSTANCE = new InterfaceEditPlugin();

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
	public InterfaceEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ExpressionEditPlugin.INSTANCE,
		     ImageEditPlugin.INSTANCE,
		     PersistenceEditPlugin.INSTANCE,
		     ServiceEditPlugin.INSTANCE,
		     CoreEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipsePlugin {
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
