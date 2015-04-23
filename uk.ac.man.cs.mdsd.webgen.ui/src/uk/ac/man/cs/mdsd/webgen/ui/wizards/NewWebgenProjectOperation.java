package uk.ac.man.cs.mdsd.webgen.ui.wizards;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
//import org.eclipse.jdt.core.IClasspathEntry;
//import org.eclipse.jdt.core.IJavaProject;
//import org.eclipse.jdt.core.JavaCore;
//import org.eclipse.jdt.launching.JavaRuntime;
//import org.eclipse.pde.core.plugin.IMatchRules;
//import org.eclipse.pde.core.plugin.IPluginBase;
//import org.eclipse.pde.core.plugin.IPluginImport;
//import org.eclipse.pde.core.plugin.IPluginReference;
//import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModel;
//import org.eclipse.pde.internal.core.ibundle.IBundlePluginBase;
//import org.eclipse.pde.internal.core.ibundle.IBundlePluginModelBase;
//import org.eclipse.pde.internal.core.natures.PDE;
//import org.eclipse.pde.internal.core.project.PDEProject;
//import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;

import uk.ac.man.cs.mdsd.webgen.ui.WebgenUiPlugin;


public class NewWebgenProjectOperation extends WorkspaceModifyOperation {
	private static String[] folders = new String[] {
		"model"};

	private IProject projectHandle;
	private Frameworks framework;
	private URI locationURI;


	public NewWebgenProjectOperation(
			final IProject projectHandle, final Frameworks framework,
			final URI locationURI) {
		this.projectHandle = projectHandle;
		this.framework = framework;
		this.locationURI = locationURI;
	}

	@Override
	public void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		projectHandle.create(descriptionConfiguration(), null);
		projectHandle.open(null);

		createFolders(projectHandle, folders);

		final Bundle bundle = Platform.getBundle("uk.ac.man.cs.mdsd.webgen.ui");
		switch (framework) {
			case CODE_IGNITER :
				resourcesCodeIgniter(bundle);
				break;
			case KOHANA :
				resourcesKohana(bundle);
				break;
			case SYMFONY :
				resourcesSymfony(bundle);
				break;
		}

//		URL casFile = bundle.getEntry("resources/CAS-1.3.2.tgz");
//		final Map<IPath, IPath> casRenames = new HashMap<IPath, IPath>();
//		extractTGZ(casFile, new Path("application/libraries/cas/"), 1, new IPath[] {
//				new Path("docs/")
//			}, casRenames);
	}

	private IProjectDescription descriptionConfiguration() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription projectDescription
			= workspace.newProjectDescription(projectHandle.getName());
		projectDescription.setLocationURI(locationURI);
		projectDescription.setBuildSpec(
			buildspecConfiguration(projectDescription));
		projectDescription.setNatureIds(naturesConfiguration());
		return projectDescription;
	}

	private static ICommand[] buildspecConfiguration(
			final IProjectDescription description) {
		final ICommand javaBuilder = description.newCommand();
//		javaBuilder.setBuilderName(JavaCore.BUILDER_ID);

		final ICommand manifestBuilder = description.newCommand();
		manifestBuilder.setBuilderName("org.eclipse.pde.ManifestBuilder");

		return new ICommand[] {
			javaBuilder,
			manifestBuilder
		};
	}

	private static String[] naturesConfiguration() {
		return new String[] {
			"org.eclipse.php.core.PHPNature"
		};
	}

	private static void createFolders(final IProject project,
			final String[] folders) throws CoreException {
		for (String path : folders) {
			final IFolder folder = project.getFolder(path);
			folder.create(false, true, null);
		}
	}

	private void resourcesCodeIgniter(final Bundle bundle) {
		URL codeigniterFile = bundle.getEntry("resources/CodeIgniter_2.1.3.zip");
		final Map<IPath, IPath> codeigniterRenames = new HashMap<IPath, IPath>();
		codeigniterRenames.put(new Path("license.txt"), new Path("codeigniter_license.txt"));
		extractZip(codeigniterFile, null, 1, new IPath[] {
				new Path("user_guide/")
			}, codeigniterRenames);

		URL datamapperOrmFile = bundle.getEntry("resources/wanwizard-datamapper-a58c1b0c9927.zip");
		final Map<IPath, IPath> datamapperRenames = new HashMap<IPath, IPath>();
		datamapperRenames.put(new Path("license.txt"), new Path("datamapper_license.txt"));
		extractZip(datamapperOrmFile, null, 1, new IPath[] {
				new Path(".hg_archival.txt"),
				new Path(".hgtags"),
				new Path("examples/"),
				new Path("manual/")
			}, datamapperRenames);

		URL gasOrmFile = bundle.getEntry("resources/GasORM-2.1.zip");
		final Map<IPath, IPath> gasRenames = new HashMap<IPath, IPath>();
		gasRenames.put(new Path("README.markdown"), new Path("GasORM_README.markdown"));
		extractZip(gasOrmFile, new Path("application/"), 1, new IPath[] {
				new Path("config/testing/"),
				new Path("third_party/gas/template/"),
				new Path("third_party/gas/tests/")
			}, gasRenames);
  	}

	private void resourcesKohana(final Bundle bundle) {
		URL kohanaFile = bundle.getEntry("resources/kohana-v3.3.1.zip");
		final Map<IPath, IPath> kohanaRenames = new HashMap<IPath, IPath>();
		extractZip(kohanaFile, null, 0, new IPath[] {
				new Path("install.php"),
				new Path("application/classes/Controller/Welcome.php"),
				new Path("modules/cache/tests/"),
				new Path("modules/image/tests/"),
				new Path("modules/minion/tests/"),
				new Path("modules/unittest/"),
				new Path("vendor/phpunit/")
			}, kohanaRenames);
		URL paginationFile = bundle.getEntry("resources/kohana-pagination-3.3-master.zip");
		extractZip(paginationFile, new Path("modules/pagination/"), 1, new IPath[] {
				new Path(".gitignore")
			}, kohanaRenames);
  	}

	private void resourcesSymfony(final Bundle bundle) {
		URL symfonyFile = bundle.getEntry("resources/Symfony_Standard_Vendors_2.4.1.zip");
		final Map<IPath, IPath> kohanaRenames = new HashMap<IPath, IPath>();
		extractZip(symfonyFile, null, 1, new IPath[] {
				new Path("vendor/doctrine/annotations/test"),
				new Path("vendor/cache/test"),
			}, kohanaRenames);
  	}

	private void extractZip(final URL sourceURL, final IPath rootPath,
			final int removeSegemntsCount, final IPath[] ignoreFilter,
			final Map<IPath, IPath> renames) {
		try {
			final File zipPath = new File(FileLocator.resolve(sourceURL).toURI());
			final ZipFile zipFile = new ZipFile(zipPath);
			final Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) { 
				final ZipEntry entry = entries.nextElement();
				IPath path = new Path(entry.getName()).removeFirstSegments(removeSegemntsCount);
				if (renames.containsKey(path)) {
					path = renames.get(path);
				}
				if (rootPath != null) {
					path = new Path(rootPath.toString() + path.toString());
				}
				if (!path.isEmpty() && !ignoreEntry(path, ignoreFilter)) {
					if(entry.isDirectory()) {
						final IFolder folder = projectHandle.getFolder(path);
						if (!folder.exists()) {
							folder.create(false, true, null);
						}
					} else {
						final IPath parent = path.removeLastSegments(1);
						if (!parent.isEmpty()) {
							final IFolder folder = projectHandle.getFolder(parent);
							if (!folder.exists()) {
								folder.create(false, true, null);
							}
						}
						final BufferedInputStream inputStream
							= new BufferedInputStream(zipFile.getInputStream(entry));
						final IFile file = projectHandle.getFile(path);
						file.create(inputStream, false, null);
						inputStream.close();
					}
				}
			}
			zipFile.close();
 		} catch (URISyntaxException | IOException | CoreException e) {
			WebgenUiPlugin.log(e);
		}
	}

	@SuppressWarnings("unused")
	private void extractTGZ(final URL sourceURL, final IPath rootPath,
			final int removeSegemntsCount, final IPath[] ignoreFilter,
			final Map<IPath, IPath> renames) {
		
		try {
			final File tgzPath = new File(FileLocator.resolve(sourceURL).toURI());
			final TarArchiveInputStream tarIn = new TarArchiveInputStream(
				new GzipCompressorInputStream(new BufferedInputStream(
					new FileInputStream(tgzPath))));  
			TarArchiveEntry entry = (TarArchiveEntry) tarIn.getNextEntry();  
			while (entry != null) {
				IPath path = new Path(entry.getName()).removeFirstSegments(removeSegemntsCount);
				if (renames.containsKey(path)) {
					path = renames.get(path);
				}
				if (rootPath != null) {
					path = new Path(rootPath.toString() + path.toString());
				}
				if (!path.isEmpty() && !ignoreEntry(path, ignoreFilter)) {
					if(entry.isDirectory()) {
						final IFolder folder = projectHandle.getFolder(path);
						if (!folder.exists()) {
							folder.create(false, true, null);
						}
					} else {
						byte[] contents = new byte[(int) entry.getSize()];
						tarIn.read(contents);
						final IFile file = projectHandle.getFile(path);
						file.create(new ByteArrayInputStream(contents), false, null);
					}
				}
				entry = (TarArchiveEntry) tarIn.getNextEntry();
			}
			tarIn.close();
 		} catch (URISyntaxException | IOException | CoreException e) {
			WebgenUiPlugin.log(e);
		}
	}

	private boolean ignoreEntry(final IPath entry, final IPath[] ignoreFilter) {
		for (IPath ignore : ignoreFilter) {
			if (ignore.matchingFirstSegments(entry) == ignore.segmentCount()) {
				return true;
			}
		}
		return false;
	}
}
