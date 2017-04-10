package uk.ac.man.cs.mdsd.webgen.pim2psms;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;


public class TransformUsingEmftVm {
	private ResourceSet resourceSet = new ResourceSetImpl();
	private Metamodel websiteMetamodel;
	private Metamodel ormMetamodel;
	private Metamodel serviceMetamodel;
	private Metamodel apiMetamodel;
	private Metamodel wafMetamodel;
	private IPath websiteModelPath;
	private Model websiteModel;
	private ModuleResolver moduleResolver;

	protected Metamodel getWebsiteMetamodel() {
		if (websiteMetamodel == null) {
			websiteMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			websiteMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://www.cs.man.ac.uk/mdsd/2010/Website"), true));
		}

		return websiteMetamodel;
	}

	protected Metamodel getOrmMetamodel() {
		if (ormMetamodel == null) {
			ormMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			ormMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://cs.manchester.ac.uk/mdsd/ObjectRelationalMapping"), true));
		}

		return ormMetamodel;
	}

	protected Metamodel getServiceMetamodel() {
		if (serviceMetamodel == null) {
			serviceMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			serviceMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://cs.manchester.ac.uk/mdsd/service"), true));
		}

		return serviceMetamodel;
	}

	protected Metamodel getApiMetamodel() {
		if (apiMetamodel == null) {
			apiMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			apiMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://cs.manchester.ac.uk/mdsd/API"), true));
		}

		return apiMetamodel;
	}

	protected Metamodel getWafMetamodel() {
		if (wafMetamodel == null) {
			wafMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			wafMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://cs.manchester.ac.uk/mdsd/WebApplicationFramework"), true));
		}

		return wafMetamodel;
	}

	public Model getWebsiteModel() {
		return websiteModel;
	}

	public void setWebsiteModel(final IFile websiteModelFile) {
		websiteModelPath = websiteModelFile.getFullPath();
		websiteModel = EmftvmFactory.eINSTANCE.createModel();
		websiteModel.setResource(resourceSet.getResource(
			URI.createFileURI(websiteModelPath.toString()), true));
	}

	protected ModuleResolver getModuleResolver() {
		if (moduleResolver == null) {
			moduleResolver = new DefaultModuleResolver(
				"platform:/plugin/uk.ac.man.cs.mdsd.webgen.pim2psms/transformations/",
				resourceSet);
		}

		return moduleResolver;
	}

	protected URI createModelURI(final String fileExtension) {
		return URI.createFileURI(websiteModelPath
			.removeFileExtension()
			.addFileExtension(fileExtension)
			.toString());
	}

	protected Model createModel(final String modelFileExtension) {
		final Model model = EmftvmFactory.eINSTANCE.createModel();
		model.setResource(resourceSet.createResource(
			createModelURI(modelFileExtension)));
		return model;
	}

	protected ExecEnv createEnvironment() {
		final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.registerMetaModel("Website", getWebsiteMetamodel());
		env.registerMetaModel("ORM", getOrmMetamodel());
		env.registerMetaModel("Service", getServiceMetamodel());
		env.registerMetaModel("API", getApiMetamodel());
		env.registerMetaModel("WAF", getWafMetamodel());

		return env;
		
	}

	protected void executePass(final ExecEnv env, final String moduleName,
			final Map<String, Model> inputModels, final Model traceModel) {
		for (String inputName : inputModels.keySet()) {
			env.registerInputModel(inputName, inputModels.get(inputName));
		}

		if (traceModel != null) {
			env.registerInOutModel("trace", traceModel);
		}

		env.loadModule(getModuleResolver(), moduleName);

		final TimingData timingData = new TimingData();
		env.run(timingData);
		timingData.finish();
	}

	protected Model executePassCreatingOutputModel(final String moduleName,
			final String modelName, final String modelFileExtension,
			final Map<String, Model> inputModels, final Model traceModel) {
		final ExecEnv env = createEnvironment();

		Model passModel = createModel(modelFileExtension);
		env.registerOutputModel(modelName, passModel);

		executePass(env, moduleName, inputModels, traceModel);

		return passModel;
	}

	protected void executeRefiningPass(final String moduleName,
			final String modelName, final Model model,
			final Map<String, Model> inputModels, final Model traceModel) {
		final ExecEnv env = createEnvironment();
		env.registerInOutModel(modelName, model);

		executePass(env, moduleName, inputModels, traceModel);
	}

	public void execute() throws IOException {
		final Map<String, Model> ormInputModels = new HashMap<String, Model>();
		ormInputModels.put("website", getWebsiteModel());
		final String ormModelName = "orm";
		final Model ormModel = executePassCreatingOutputModel("PersistenceTypes",
			ormModelName, "orm", ormInputModels, null);
		executeRefiningPass("PersistenceEntityFeatures", ormModelName, ormModel,
			ormInputModels, null);
		executeRefiningPass("PersistenceEntityLabels", ormModelName, ormModel,
			ormInputModels, null);
		executeRefiningPass("PersistenceKeys",
			ormModelName, ormModel, ormInputModels, null);
		executeRefiningPass("PersistenceImplicitStatic", ormModelName,
			ormModel, ormInputModels, null);
		executeRefiningPass("PersistenceImplicitAuthentication",
			ormModelName, ormModel, ormInputModels, null);
		executeRefiningPass("PersistenceImplicitAuthentication2",
			ormModelName, ormModel, ormInputModels, null);
		ormModel.getResource().save(Collections.emptyMap());

		final Map<String, Model> serviceInputModels = new HashMap<String, Model>();
		serviceInputModels.put("website", getWebsiteModel());
		serviceInputModels.put("orm", ormModel);
		final String serviceModelName = "service";
		final Model serviceModel = executePassCreatingOutputModel("ServiceExplicit",
			serviceModelName, "business", serviceInputModels, null);
		executeRefiningPass("ServiceImplicit", serviceModelName, serviceModel,
			serviceInputModels, null);
		serviceModel.getResource().save(Collections.emptyMap());

		final Map<String, Model> apiInputModels = new HashMap<String, Model>();
		apiInputModels.put("website", getWebsiteModel());
		apiInputModels.put("service", serviceModel);
		final String apiModelName = "api";
		final Model apiModel = executePassCreatingOutputModel("API",
			apiModelName, "api", apiInputModels, null);
		apiModel.getResource().save(Collections.emptyMap());

		final Map<String, Model> wafInputModels = new HashMap<String, Model>();
		wafInputModels.put("website", getWebsiteModel());
		wafInputModels.put("orm", ormModel);
		wafInputModels.put("service", serviceModel);
		wafInputModels.put("api", apiModel);
		final String wafModelName = "waf";

		final Model wafTraceModelP1 = createModel("trace_waf_p1");
		final Model wafModel = executePassCreatingOutputModel("PassExplicitInterface",
			wafModelName, "waf", wafInputModels, wafTraceModelP1);

		final Model wafTraceModelP5 = createModel("trace_waf_p5");
		executeRefiningPass("PassImplicitStaticInterface", wafModelName,
			wafModel, wafInputModels, wafTraceModelP5);

		final Model wafTraceModelP6 = createModel("trace_waf_p6");
		executeRefiningPass("PassImplicitUnitFields", wafModelName, wafModel,
			wafInputModels, wafTraceModelP6);

		final Model wafTraceModelP7 = createModel("trace_waf_p7");
		executeRefiningPass("PassAuthentication", wafModelName, wafModel,
			wafInputModels, wafTraceModelP7);

		final Model wafTraceModelP8 = createModel("trace_waf_p8");
		executeRefiningPass("PassAuthentication2", wafModelName, wafModel,
			wafInputModels, wafTraceModelP8);
		wafModel.getResource().save(Collections.emptyMap());
	}

}
