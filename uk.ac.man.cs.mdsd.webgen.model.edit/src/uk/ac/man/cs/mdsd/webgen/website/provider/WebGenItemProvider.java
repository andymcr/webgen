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
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociation;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.View;

public abstract class WebGenItemProvider extends ItemProviderAdapter {
	public WebGenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected Set<Label> getLabels(final EntityOrView entityOrView) {
		final Set<Label> labels = new HashSet<Label>();
		labels.addAll(entityOrView.getAttributes());

		return labels;
	}

	protected Set<Attribute> getSourceAttributes(final Association association) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			attributes.addAll(entityAssociation.getPartOf().getAttributes());
		}

		return attributes;
	}

	protected Set<Association> getSourceAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(entityAssociation.getPartOf().getAssociations());
		}

		return associations;
	}

	protected Set<Association> getAllSourceAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(entityAssociation.getPartOf().getAllAssociations());
		}

		return associations;
	}

	protected Set<Attribute> getTargetAttributes(final Association association) {
		final Set<Attribute> attributes = new HashSet<Attribute>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			attributes.addAll(entityAssociation.getTargetEntity().getAttributes());
		}

		return attributes;
	}

	protected Set<Association> getTargetAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(entityAssociation.getTargetEntity().getAssociations());
		}

		return associations;
	}

	protected Set<Association> getAllTargetAssociations(final Association association) {
		final Set<Association> associations = new HashSet<Association>();
		if (association instanceof EntityAssociation) {
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			associations.addAll(entityAssociation.getTargetEntity().getAllAssociations());
		}

		return associations;
	}

	protected List<Feature> getTargetFeatures(final Association association,
			final EntityOrView entityOrView) {
		if (entityOrView instanceof Entity) {
			final Entity entity = (Entity) entityOrView;
			final EntityAssociation entityAssociation = (EntityAssociation) association;
			if (entity.getFeatures().contains(association)) {
				return entityAssociation.getTargetEntity().getFeatures();
			} else {
				return entityAssociation.getPartOf().getFeatures();
			}
// TODO handle view
		}
		return Collections.emptyList();
	}

	protected EntityOrView getSourceType(final Association association) {
		if (association instanceof EntityAssociation) {
			return ((EntityAssociation) association).getPartOf();
		} else if (association instanceof EncapsulatedAssociation) {
			return getSourceType(((EncapsulatedAssociation) association).getAssociation());
		} else {
			// TODO handle view
			return null;
		}
	}

	protected EntityOrView getTargetType(final Association association) {
		if (association instanceof EntityAssociation) {
			return ((EntityAssociation) association).getTargetEntity();
		} else if (association instanceof EncapsulatedAssociation) {
			return getTargetType(((EncapsulatedAssociation) association).getAssociation());
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

	protected Boolean isSourceAssociation(final ModelLabelAssociation label) {
		if (label.getAssociation() != null) {
			if (label.getPartOf() instanceof Entity) {
				return ((Entity) label.getPartOf()).getFeatures().contains(label.getAssociation());
			} else {
				return ((View) label.getPartOf()).getFeatures().contains(label.getAssociation());
			}
		}

		return false;
	}

	protected Boolean isSourceAssociation(final UnitAssociation association) {
		for (EntityOrView entityOrView : association.getDisplayedOn().getEntities()) {
			if (entityOrView.getAssociations().contains(association.getAssociation())) {
				return true;
			}
		}

		return false;
	}

	protected Boolean isSourceAssociation(final ChildAssociation association) {
		if (association.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = (UnitAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAssociations(parent.getAssociation()).contains(association.getAssociation());
				} else {
					return getSourceAssociations(parent.getAssociation()).contains(association.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAssociations(parent.getAssociation()).contains(association.getAssociation());
				} else {
					return getSourceAssociations(parent.getAssociation()).contains(association.getAssociation());
				}
			}
		}

		return false;
	}

	protected Set<Attribute> getAttributes(final ChildAttribute attribute) {
		if (attribute.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) attribute.eContainer());
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAttributes(parent.getAssociation());
				} else {
					return getSourceAttributes(parent.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) attribute.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getTargetAttributes(parent.getAssociation());
				} else {
					return getSourceAttributes(parent.getAssociation());
				}
			}
		}

		return Collections.emptySet();
	}

	protected Set<Association> getAssociations(final ChildAssociation association) {
		if (association.eContainer() instanceof UnitAssociation) {
			final UnitAssociation parent = ((UnitAssociation) association.eContainer());
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getAllTargetAssociations(parent.getAssociation());
				} else {
					return getAllSourceAssociations(parent.getAssociation());
				}
			}
		} else {
			final ChildAssociation parent = (ChildAssociation) association.eContainer();
			if (parent.getAssociation() != null) {
				if (isSourceAssociation(parent)) {
					return getAllTargetAssociations(parent.getAssociation());
				} else {
					return getAllSourceAssociations(parent.getAssociation());
				}
			}
		}

		return Collections.emptySet();
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

	protected Object getCriteriaContext(final Object object) {
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
		Object container = getCriteriaContext(object);
		while (container != null) {
			if (container instanceof Selection) {
				return (Selection) container;
			}
			container = getCriteriaContext(container);
		}

		return null;
	}

}
