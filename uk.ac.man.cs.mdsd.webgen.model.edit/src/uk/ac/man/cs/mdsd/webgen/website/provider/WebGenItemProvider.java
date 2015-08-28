package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.website.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.QueryInstance;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;

public abstract class WebGenItemProvider extends ItemProviderAdapter {
	public WebGenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected List<Attribute> getAttributes(final EntityOrView entityOrView) {
		final List<Attribute> attributes = new LinkedList<Attribute>();
		if (entityOrView instanceof Entity) {
			for (EntityFeature feature : ((Entity) entityOrView).getAllFeatures()) {
				if (feature instanceof Attribute) {
					attributes.add((Attribute) feature);
				}
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Attribute) {
					attributes.add((Attribute) feature);
				}
			}
		}

		return attributes;
	}

	protected List<Association> getAssociations(final EntityOrView entityOrView) {
		final List<Association> associations = new LinkedList<Association>();
		if (entityOrView instanceof Entity) {
			for (EntityFeature feature : ((Entity) entityOrView).getAllFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		}

		return associations;
	}

	protected Entity getType(final ServiceAssociation association) {
		if (association instanceof ServiceEntityAssociation) {
			final ServiceEntityAssociation entityAssociation = (ServiceEntityAssociation) association;
			final Service localService = entityAssociation.getPartOf();
			final EntityAssociation feature = entityAssociation.getFeature();
			if (localService.getEncapsulates().contains(feature.getParentEntity())) {
				return feature.getTargetEntity();
			} else {
				return feature.getParentEntity();
			}
		}

		return null;
	}

	protected List<Service> getAllServices(final ServiceAssociation association) {
		final Service parentService = association.getPartOf();
		if (parentService.eContainer() instanceof WebGenModel) {
			WebGenModel model = (WebGenModel) parentService.eContainer();
			return model.getServices();
		} else {
			return Collections.emptyList();
		}
	}

	protected Service getSourceService(final ServiceAssociation association) {
		if (association instanceof ServiceEntityAssociation) {
			final ServiceEntityAssociation entityAssociation = (ServiceEntityAssociation) association;
			if (entityAssociation.getFeature() != null) {
				final Entity targetEntity = entityAssociation.isUseFeatureSource()
						? entityAssociation.getFeature().getParentEntity()
						: entityAssociation.getFeature().getTargetEntity();
				final Service localService = entityAssociation.getPartOf();
				if (localService.getEncapsulates().contains(targetEntity)) {
					return localService;
				}
				final List<Service> remoteServices = targetEntity.getServedBy();
				if (remoteServices.size() > 0) {
					return remoteServices.get(0);
				}
			}
		}

		return null;
	}

	protected List<Service> getTargetServices(final ServiceEntityAssociation association) {
		if (association.getFeature() != null) {
			final Entity targetEntity = association.isUseFeatureSource()
				? association.getFeature().getTargetEntity()
				: association.getFeature().getParentEntity();
			return targetEntity.getServedBy();
		}

		return null;
	}

	protected Service getSourceService(final UnitAssociation association) {
		if (association.getServiceFeature() != null) {
			return getSourceService(association.getServiceFeature());
		}

		return null;
	}

	protected List<ServiceAssociation> getAssociationsMatchingService(final Service service,
			final Service targetService) {
		final List<ServiceAssociation> associations = new LinkedList<ServiceAssociation>();
		for (ServiceAssociation association : getAssociations(service)) {
			if ( association.getOppositeService() != null) {
				if (targetService.equals(association.getOppositeService())) {
					associations.add(association);
				}
			} else {
				if (association instanceof ServiceEntityAssociation) {
					if (targetService.getEncapsulates().contains(
							getType(association))) {
						associations.add(association);
					}
				}
			}
		}

		return associations;
	}

	protected Collection<ServiceAssociation> getAssociations(final Service service) {
		final List<ServiceAssociation> associations = new LinkedList<ServiceAssociation>();
		for (ServiceFeature feature : service.getFeatures()) {
			if (feature instanceof ServiceAssociation) {
				associations.add((ServiceAssociation) feature);
			}
		}

		return associations;
	}

	protected List<Query> getQueries(final QueryInstance query) {
		if (query.eContainer() instanceof ActionMenuEntry) {
			final ActionMenuEntry entry
				= (ActionMenuEntry) query.eContainer();
			final List<Query> queries = new LinkedList<Query>();
			if (entry.getDestination() != null) {
				queries.addAll(entry.getDestination().getQueries());
			}
			return queries;
		}

		return Collections.emptyList();
	}

	protected List<Selection> getSourceSelections(final DynamicUnit unit) {
		if (unit.getSource() instanceof Service) {
			final Service service = (Service) unit.getSource();
			final List<Selection> selections
				= new LinkedList<Selection>(service.getSelections());
			return selections;
		}

		return Collections.emptyList();
	}

	protected List<Attribute> getSourceElements(final DynamicUnit unit) {
		final List<Attribute> features = new LinkedList<Attribute>();
		if (unit.getSource() != null) {
			if (unit.getSource() instanceof Service) {
				final Service service = (Service) unit.getSource();
				if (service.getFeatures().size() > 0) {
					for (ServiceFeature feature : service.getFeatures()) {
						if (feature instanceof ServiceEntityElement) {
							features.add(((ServiceEntityElement) feature).getFeature());
						}
					}
				} else {
					for (EntityOrView entityOrView : service.getEncapsulates()) {
						features.addAll(getAttributes(entityOrView));
					}
				}
			} else {
				features.addAll(getAttributes((Entity) unit.getSource()));
			}
		}

		return features;
	}

	protected Object getCriteriaContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

	protected Service getCriteriaServiceContext(final Object object) {
		Object container = getCriteriaContext(object);
		while (container != null) {
			container = getCriteriaContext(container);
			if (container instanceof Service) {
				return (Service) container;
			} else if (container instanceof DynamicUnit) {
				final DynamicUnit containingUnit = (DynamicUnit) container;
				if (containingUnit.getSource() instanceof Service) {
					return (Service) containingUnit.getSource();
				}
			}
		}

		return null;
	}

	protected Selection getCriteriaSelectionContext(final Object object) {
		Object container = getCriteriaContext(object);
		while (container != null) {
			container = getCriteriaContext(container);
			if (container instanceof Selection) {
				return (Selection) container;
			}
		}

		return null;
	}

}
