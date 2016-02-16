package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.website.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitSource;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
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

	protected Set<Association> getAssociations(final EntityOrView entityOrView) {
		final Set<Association> associations = new HashSet<Association>();
		if (entityOrView instanceof Entity) {
			final Entity entity = (Entity) entityOrView;
			for (EntityFeature feature : entity.getAllFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
			associations.addAll(entity.getAssociationEnds());
		} else {
			for (ViewFeature feature : ((View) entityOrView).getFeatures()) {
				if (feature instanceof Association) {
					associations.add((Association) feature);
				}
			}
		}

		return associations;
	}

	protected List<Attribute> getFeatureAttributes(final Service service) {
		final List<Attribute> attributes = new LinkedList<Attribute>();
		for (EntityOrView entityOrView : service.getEncapsulates()) {
			attributes.addAll(getAttributes(entityOrView));
		}

		return attributes;
	}

	protected List<Association> getFeatureAssociations(final Service service) {
		final List<Association> associations = new LinkedList<Association>();
		for (EntityOrView entityOrView : service.getEncapsulates()) {
			associations.addAll(getAssociations(entityOrView));
		}

		return associations;
	}

	protected List<ServiceAttribute> getAttributes(final Service service) {
		final List<ServiceAttribute> attributes = new LinkedList<ServiceAttribute>();
		for (ServiceFeature feature : service.getFeatures()) {
			if (feature instanceof ServiceAttribute) {
				attributes.add((ServiceAttribute) feature);
			}
		}

		return attributes;
	}

	protected List<ServiceAssociation> getAssociations(final Service service) {
		final List<ServiceAssociation> associations = new LinkedList<ServiceAssociation>();
		for (ServiceFeature feature : service.getFeatures()) {
			if (feature instanceof ServiceAssociation
					&&!associations.contains((ServiceAssociation) feature)) {
				associations.add((ServiceAssociation) feature);
			}
		}

		return associations;
	}

	protected List<Attribute> getSourceAttributes(final DynamicUnit unit) {
		final List<Attribute> attributes = new LinkedList<Attribute>();
		for (UnitSource source : unit.getSource()) {
			if (source instanceof EntityOrView) {
				attributes.addAll(getAttributes((EntityOrView) source));
			} else {
				attributes.addAll(getFeatureAttributes((Service) source));
			}
		}

		return attributes;
	}

	protected List<Association> getSourceAssociations(final DynamicUnit unit) {
		final List<Association> associations = new LinkedList<Association>();
		for (UnitSource source : unit.getSource()) {
			if (source instanceof EntityOrView) {
				associations.addAll(getAssociations((EntityOrView) source));
			} else {
				associations.addAll(getFeatureAssociations((Service) source));
			}
		}

		return associations;
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

	protected EntityOrView getSourceType(final ServiceAssociation association) {
		final ServiceAssociation serviceAssociation = (ServiceAssociation) association;
		if (serviceAssociation.getAssociation() instanceof ViewAssociation) {
			return ((ViewAssociation) serviceAssociation.getAssociation()).getPartOf();
		} else if (serviceAssociation.getAssociation() instanceof EncapsulatedAssociation) {
			final EncapsulatedAssociation encapsulatedAssociation
				= (EncapsulatedAssociation) serviceAssociation.getAssociation();
			if (encapsulatedAssociation.isUseAssociationSource()) {
	//			return encapsulatedAssociation.getAssociation().getTargetEntity();
			} else {
	//			return encapsulatedAssociation.getAssociation().getPartOf();
			}
		} else {
			final EntityAssociation entityAssociation
				= (EntityAssociation) serviceAssociation.getAssociation();
			if (serviceAssociation.isUseAssociationSource()) {
				return entityAssociation.getTargetEntity();
			} else {
				return entityAssociation.getPartOf();
			}
		}

		return null;
	}

	protected EntityOrView getTargetType(final ServiceAssociation association) {
		final ServiceAssociation serviceAssociation = (ServiceAssociation) association;
		if (serviceAssociation.getAssociation() instanceof ViewAssociation) {
				
		} else if (serviceAssociation.getAssociation() instanceof EncapsulatedAssociation) {
			final EncapsulatedAssociation encapsulatedAssociation
				= (EncapsulatedAssociation) serviceAssociation.getAssociation();
			if (encapsulatedAssociation.isUseAssociationSource()) {
//				return encapsulatedAssociation.getAssociation().getTargetEntity();
			} else {
//				return encapsulatedAssociation.getAssociation().getPartOf();
			}
		} else {
			final EntityAssociation entityAssociation
				= (EntityAssociation) serviceAssociation.getAssociation();
			if (serviceAssociation.isUseAssociationSource()) {
				return entityAssociation.getTargetEntity();
			} else {
				return entityAssociation.getPartOf();
			}
		}

		return null;
	}

	protected List<Service> getSourceServices(final ServiceAssociation association) {
		return getSourceType(association).getServedBy();
	}

	protected List<Service> getTargetServices(final ServiceAssociation association) {
		return getTargetType(association).getServedBy();
	}

	protected List<Service> getSourceServices(final UnitAssociation association) {
		if (association.getServiceFeature() != null) {
			return getSourceServices(association.getServiceFeature());
		}

		return null;
	}

	protected List<Filter> getFilters(final Query query) {
		if (query.eContainer() instanceof ActionMenuEntry) {
			final ActionMenuEntry entry
				= (ActionMenuEntry) query.eContainer();
			if (entry.getDestination() instanceof IndexUnit) {
				return ((IndexUnit) entry.getDestination()).getFilters();
			}
		}

		return Collections.emptyList();
	}

	protected Set<Selection> getSelections(final ServiceAssociation association) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (Service service : getTargetType(association).getServedBy()) {
			selections.addAll(service.getSelections());
		}
			
		return selections;
	}

	protected Set<Selection> getSourceSelections(final DynamicUnit unit) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (UnitSource source : unit.getSource() ) {
			if (source instanceof Service) {
				selections.addAll(((Service) source).getSelections());
			}
		}

		return selections;
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
