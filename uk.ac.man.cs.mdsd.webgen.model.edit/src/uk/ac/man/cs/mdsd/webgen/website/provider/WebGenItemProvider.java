package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.persistence.Association;
import uk.ac.man.cs.mdsd.webgen.persistence.Attribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EncapsulatedAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.persistence.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.persistence.Feature;
import uk.ac.man.cs.mdsd.webgen.service.Selection;
import uk.ac.man.cs.mdsd.webgen.service.Service;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;

public abstract class WebGenItemProvider extends ItemProviderAdapter {
	public WebGenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected EntityOrView getUser(final Object object) {
		return getModel(object).getWebsiteProperties().getAuthentication().getUser();
	}

	protected EntityOrView getParentType(final Attribute attribute) {
		if (attribute instanceof EntityAttribute) {
			return ((EntityAttribute) attribute).getPartOf();
		} else {
			return getParentType(
				((EncapsulatedAttribute) attribute).getAttribute());
		}
	}

	protected EntityOrView getSourceType(final Association association) {
		if (association instanceof EntityAssociation) {
			return ((EntityAssociation) association).getPartOf();
		} else if (association instanceof EncapsulatedAssociation) {
			return ((EncapsulatedAssociation) association).getSourceEntity();
		} else {
			// TODO handle view
			return null;
		}
	}

	protected EntityOrView getTargetType(final Association association) {
		if (association instanceof EntityAssociation) {
			return ((EntityAssociation) association).getTargetEntity();
		} else if (association instanceof EncapsulatedAssociation) {
			return ((EncapsulatedAssociation) association).getTargetEntity();
		} else {
			// TODO handle view
			return null;
		}
	}

	protected List<Feature> getFeatures(final Service service) {
		if (service.getServes() != null) {
			return service.getServes().getFeatures();
		}

		return Collections.emptyList();
	}

	protected List<Association> getAssociations(final Service service) {
		return service.getServes().getAllAssociations();
	}

	protected Set<EntityOrView> getEntitiesAndViews(final InlineActionContainer container) {
		final Set<EntityOrView> entitiesAndViews = new HashSet<EntityOrView>();
		if (container instanceof IndexUnit) {
			entitiesAndViews.addAll(((IndexUnit) container).getEntities());
		} else if (container instanceof UnitElement) {
			entitiesAndViews.add(getParentType(
				((UnitElement) container).getAttribute()));
		} else if (container instanceof UnitAssociation) {
			entitiesAndViews.add(getSourceType(
				((UnitAssociation) container).getAssociation()));
		}

		return entitiesAndViews;
	}

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected WebGenModel getModel(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof WebGenModel) {
				return (WebGenModel) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected Selection getCriteriaSelectionContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof Selection) {
				return (Selection) container;
			}
			container = getContext(container);
		}

		return null;
	}

	protected InlineActionContainer getCriteriaActionContext(final Object object) {
		Object container = getContext(object);
		while (container != null) {
			if (container instanceof InlineActionContainer) {
				return (InlineActionContainer) container;
			}
			container = getContext(container);
		}

		return null;
	}

}
