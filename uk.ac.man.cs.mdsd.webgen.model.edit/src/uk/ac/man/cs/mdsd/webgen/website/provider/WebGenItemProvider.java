package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.website.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.ChildPathAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ChildPathAttribute;
import uk.ac.man.cs.mdsd.webgen.website.CollectionUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAttribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.FeaturePathAssociation;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.SingletonUnit;
import uk.ac.man.cs.mdsd.webgen.website.UnitElement;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
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

	protected Set<Label> getLabels(final EntityOrView entityOrView) {
		final Set<Label> labels = new HashSet<Label>();
		labels.addAll(entityOrView.getAttributes());
		labels.addAll(entityOrView.getLabels());

		return labels;
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

	protected Set<EntityOrView> getEntitiesAndViews(final Selection selection) {
		final Set<EntityOrView> entitiesAndViews = new HashSet<EntityOrView>();
		entitiesAndViews.add(((Service) selection.eContainer()).getServes());
		final Set<Association> joins = new HashSet<Association>(selection.getJoins());
		while (!joins.isEmpty()) {
			final Set<Association> handled = new HashSet<Association>();
			for (Association join : joins) {
				if (entitiesAndViews.contains(join.getSourceEntityX())) {
					entitiesAndViews.add(join.getTargetEntityX());
					handled.add(join);
				} else if (entitiesAndViews.contains(join.getTargetEntityX())) {
					entitiesAndViews.add(join.getSourceEntityX());
					handled.add(join);
				}
			}
			joins.removeAll(handled);
		}

		return entitiesAndViews;
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

	protected Set<Attribute> getAttributes(final DynamicUnit unit) {
		final Set<Attribute> attributes = new HashSet<Attribute>();

		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				attributes.addAll(singleton.getContentType().getAttributes());
				return attributes;
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			if (collection.getContentType().size() > 0) {
				for (EntityOrView entityOrView : collection.getContentType()) {
					attributes.addAll(entityOrView.getAttributes());
				}
				return attributes;
			}
		}

		for (EntityOrView entityOrView : unit.getEntities()) {
			attributes.addAll(entityOrView.getAttributes());
		}
		return attributes;
	}

	protected Set<Association> getAssociations(final DynamicUnit unit) {
		final Set<Association> associations = new HashSet<Association>();

		if (unit instanceof SingletonUnit) {
			final SingletonUnit singleton = (SingletonUnit) unit;
			if (singleton.getContentType() != null) {
				associations.addAll(singleton.getContentType().getAllAssociations());
				return associations;
			}
		}

		if (unit instanceof CollectionUnit) {
			final CollectionUnit collection = (CollectionUnit) unit;
			if (collection.getContentType().size() > 0) {
				for (EntityOrView entityOrView : collection.getContentType()) {
					associations.addAll(entityOrView.getAllAssociations());
				}
				return associations;
			}
		}

		for (EntityOrView entityOrView : unit.getEntities()) {
			associations.addAll(entityOrView.getAllAssociations());
		}
		return associations;
	}

	protected List<Attribute> getAttributes(final ChildPathAttribute attribute) {
		if (attribute.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) attribute.eContainer());
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		} else if (attribute.eContainer() instanceof FeaturePathAssociation) {
				final FeaturePathAssociation parent = ((FeaturePathAssociation) attribute.eContainer());
				if (parent.getAssociation() != null) {
					return parent.getTargetEntity().getAttributes();
				}
		} else {
			final ChildPathAssociation parent = (ChildPathAssociation) attribute.eContainer();
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		}

		return Collections.emptyList();
	}

	protected List<Association> getAssociations(final ChildPathAssociation association) {
		if (association.getPartOf().getAssociation() != null) {
			if (association.getPartOf() instanceof FeaturePathAssociation) {
				return ((FeaturePathAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			} else if (association.getPartOf() instanceof ChildPathAssociation) {
				return ((ChildPathAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			} else {
				return ((UnitAssociation) association.getPartOf()).getTargetEntity().getAllAssociations();
			}
		}

		return Collections.emptyList();
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

	protected Set<Selection> getSelections(final EntityOrView entityOrView) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (Service service : entityOrView.getServedBy()) {
			selections.addAll(service.getSelections());
		}

		return selections;
	}
	protected Set<Selection> getSelections(final DynamicMenu menu) {
		if (menu.getEntityOrView() != null) {
			return getSelections(menu.getEntityOrView());
		}

		return Collections.emptySet();
	}

	protected Set<Selection> getSelections(final DynamicUnit unit) {
		final Set<Selection> selections = new HashSet<Selection>();
		for (EntityOrView entityOrView : unit.getEntities()) {
			selections.addAll(getSelections(entityOrView));
		}

		return selections;
	}

	protected Set<Selection> getSelections(final CollectionUnit unit) {
		if (unit.getContentType().size() > 0) {
			return getSelections(unit.getContentType().get(0));
		}

		return Collections.emptySet();
	}

	protected Set<Selection> getSelections(final IndexUnit unit) {
		final Set<Selection> selections = new HashSet<Selection>();
		if (unit.getContentType().size() > 0) {
			selections.addAll(getSelections(unit.getContentType().get(0)));
		}
		if (unit.getSelectionType() != null) {
			selections.addAll(getSelections(unit.getSelectionType()));
		}

		return selections;
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
