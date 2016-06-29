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
import uk.ac.man.cs.mdsd.webgen.website.ChildAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ChildAttribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;

public abstract class WebGenItemProvider extends ItemProviderAdapter {
	public WebGenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
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

	protected Set<Attribute> getAttributes(final DynamicUnit unit) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		for (EntityOrView entityOrView : unit.getEntities()) {
			attributes.addAll(entityOrView.getAttributes());
		}

		return attributes;
	}

	protected Set<Association> getAssociations(final DynamicUnit unit) {
		final Set<Association> associations = new HashSet<Association>();
		for (EntityOrView entityOrView : unit.getEntities()) {
			associations.addAll(entityOrView.getAllAssociations());
		}

		return associations;
	}

	protected List<Attribute> getAttributes(final ChildAttribute attribute) {
		if (attribute.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) attribute.eContainer());
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) attribute.eContainer();
			if (parent.getAssociation() != null) {
				return parent.getTargetEntity().getAttributes();
			}
		}

		return Collections.emptyList();
	}

	protected List<Association> getAssociations(final ChildAssociation association) {
		if (association.getPartOf().getAssociation() != null) {
			return association.getPartOf().getTargetEntity().getAllAssociations();
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

	protected Object getContext(final Object object) {
		if (object instanceof EObject) {
			return ((EObject) object).eContainer();
		} else {
			return null;
		}
	}

//	protected Service getCriteriaServiceContext(final Object object) {
//		Object container = getCriteriaContext(object);
//		while (container != null) {
//			container = getCriteriaContext(container);
//			if (container instanceof Service) {
//				return (Service) container;
//			} else if (container instanceof DynamicUnit) {
//				final DynamicUnit containingUnit = (DynamicUnit) container;
////				if (containingUnit.getSource() instanceof Service) {
////					return (Service) containingUnit.getSource();
////				}
//			}
//		}
//
//		return null;
//	}

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

}
