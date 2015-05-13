package uk.ac.man.cs.mdsd.webgen.pim2psms;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
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
	private Metamodel wafMetamodel;
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
				URI.createURI("http://www.cs.man.ac.uk/mdsd/2010/ObjectRelationalMapping"), true));
		}

		return ormMetamodel;
	}

	protected Metamodel getWafMetamodel() {
		if (wafMetamodel == null) {
			wafMetamodel = EmftvmFactory.eINSTANCE.createMetamodel();
			wafMetamodel.setResource(resourceSet.getResource(
				URI.createURI("http://www.cs.man.ac.uk/mdsd/2015/WebApplicationFramework"), true));
		}

		return wafMetamodel;
	}

	public Model getWebsiteModel() {
		return websiteModel;
	}

protected IFile yyy;
protected String xxx;
	public void setWebsiteModel(final IFile websiteModelFile) {
yyy = websiteModelFile;
xxx = websiteModelFile.getFullPath().toString();
		websiteModel = EmftvmFactory.eINSTANCE.createModel();
		websiteModel.setResource(resourceSet.getResource(
			URI.createFileURI(websiteModelFile.getFullPath().toString()), true));
	}

	protected ModuleResolver getModuleResolver() {
		if (moduleResolver == null) {
			moduleResolver = new DefaultModuleResolver(
				"platform:/plugin/uk.ac.man.cs.mdsd.webgen.pim2psms/transformations/",
				resourceSet);
		}

		return moduleResolver;
	}

	protected Model createModel(final String modelFileExtension) {
		final Model model = EmftvmFactory.eINSTANCE.createModel();
		model.setResource(resourceSet.createResource(URI.createFileURI(xxx.concat(modelFileExtension))));
		return model;
	}

	protected ExecEnv createEnvironment() {
		final ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		env.registerMetaModel("Website", getWebsiteMetamodel());
		env.registerMetaModel("ORM", getOrmMetamodel());
		env.registerMetaModel("WAF", getWafMetamodel());

		return env;
		
	}

	protected Model executePass(final ExecEnv env, final String moduleName,
			final String modelName, final String modelFileExtension,
			final Model traceModel) {
		if (traceModel != null) {
			env.registerInOutModel("trace", traceModel);
		}

		final Model passModel = createModel(modelFileExtension);
		env.registerOutputModel(modelName, passModel);

		env.loadModule(getModuleResolver(), moduleName);

		final TimingData timingData = new TimingData();
		env.run(timingData);
		timingData.finish();

		return passModel;
	}

	protected Model executeOrmPass(final String moduleName,
			final String modelFileExtension, final Model partialModel,
			final Model traceModel) {
		final ExecEnv env = createEnvironment();
		env.registerInputModel("website", getWebsiteModel());

		if (partialModel != null) {
			env.registerInputModel("partialOrm", partialModel);
		}
		return executePass(env, moduleName, "orm", modelFileExtension,
				traceModel);
	}

	protected Model executeWafPass(final String moduleName,
			final String modelFileExtension, final Model partialModel,
			final Model ormModel, final Model traceModel) {
		final ExecEnv env = createEnvironment();
		env.registerInputModel("website", getWebsiteModel());
		env.registerInputModel("orm", ormModel);

		if (partialModel != null) {
			env.registerInputModel("partialWaf", partialModel);
		}

		return executePass(env, moduleName, "waf", modelFileExtension,
				traceModel);
	}

	public void execute() throws IOException {
		final Model ormModelP1 = executeOrmPass("PassExplicitPersistence",
			"_orm_p1", null, null);
		final Model ormModelP2 = executeOrmPass("PassCollectionTypes",
			"_orm_p2", ormModelP1, null);
		final Model ormModelP3 = executeOrmPass(
				"PassImplicitStaticPersistence", "_orm_p3", ormModelP2, null);
		final Model ormModel = executeOrmPass(
			"PassImplicitAuthenticationPersistence", "_orm", ormModelP3, null);
		ormModel.getResource().save(Collections.emptyMap());

		final Model traceModelP1 = createModel("_trace_p1");
		final Model wafModelP1 = executeWafPass("PassExplicitInterface",
			"_waf_p1", null, ormModel, traceModelP1);

		final Model traceModelP2 = createModel("_trace_p2");
		final Model wafModelP2 = executeWafPass("PassImplicitService",
			"_waf_p2", wafModelP1, ormModel, traceModelP2);

		final Model traceModelP3 = createModel("_trace_p3");
		final Model wafModelP3 = executeWafPass(
			"PassImplicitServiceEntityFeatures", "_waf_p3", wafModelP2,
			ormModel, traceModelP3);

		final Model traceModelP4 = createModel("_trace_p4");
		final Model wafModelP4 = executeWafPass("PassImplicitServiceUse",
			"_waf_p4", wafModelP3, ormModel, traceModelP4);

		final Model traceModelP5 = createModel("_trace_p5");
		final Model wafModelP5 = executeWafPass("PassImplicitStaticInterface",
			"_waf_p5", wafModelP4, ormModel, traceModelP5);

		final Model traceModelP6 = createModel("_trace_p6");
		final Model wafModelP6 = executeWafPass("PassImplicitUnitFields",
			"_waf_p6", wafModelP5, ormModel, traceModelP6);

		final Model traceModelP7 = createModel("_trace_p7");
		final Model wafModelP7 = executeWafPass("PassAuthentication",
			"_waf_p7", wafModelP6, ormModel, traceModelP7);

		final Model traceModelP8 = createModel("_trace_p8");
		final Model wafModel = executeWafPass("PassAuthentication2",
			"_waf", wafModelP7, ormModel, traceModelP8);
		wafModel.getResource().save(Collections.emptyMap());
	}

}
