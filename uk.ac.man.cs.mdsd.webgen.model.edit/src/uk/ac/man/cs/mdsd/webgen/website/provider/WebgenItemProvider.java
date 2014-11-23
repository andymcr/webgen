package uk.ac.man.cs.mdsd.webgen.website.provider;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ServiceEntityElement;
import uk.ac.man.cs.mdsd.webgen.website.ServiceFeature;

public abstract class WebgenItemProvider extends ItemProviderAdapter {
	public WebgenItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected Entity getType(final ServiceAssociation association) {
		if (association instanceof ServiceEntityAssociation) {
			final ServiceEntityAssociation entityAssociation = (ServiceEntityAssociation) association;
			final Service localService = entityAssociation.getPartOf();
			final Association feature = entityAssociation.getFeature();
			if (localService.getEncapsulates().contains(feature.getParentEntity())) {
				return feature.getTargetEntity();
			} else {
				return feature.getParentEntity();
			}
		}

		return null;
	}

	protected List<Feature> getSourceFeatures(final DynamicUnit unit) {
		final List<Feature> features = new LinkedList<Feature>();
		if (unit.getSource() != null) {
			if (unit.getSource() instanceof Service) {
				final Service service = (Service) unit.getSource();
				for (ServiceFeature feature : service.getFeatures()) {
					if (feature instanceof ServiceEntityElement) {
						features.add(((ServiceEntityElement) feature).getFeature());
					}
				}
			} else {
				final Entity entity = (Entity) unit.getSource();
				for (Feature feature : entity.getFeatures()) {
					if (feature instanceof Attribute) {
						features.add((Attribute) feature);
					}
				}
			}
		}

		return features;
	}

	protected Object getCriteriaContext(final Object object) {
		Object current = object;
		while ((current != null)
				&& !((current instanceof Service) || (current instanceof DynamicUnit)) ) {
			if (!(current instanceof EObject)) {
				break;
			}
			current = ((EObject) current).eContainer();
		}

		return current;
	}

	protected Service getCriteriaServiceContext(final Object object) {
		final Object container = getCriteriaContext(object);
		if (container instanceof Service) {
			return (Service) container;
		} else if (container instanceof DynamicUnit) {
			final DynamicUnit containingUnit = (DynamicUnit) container;
			if (containingUnit.getSource() instanceof Service) {
				return (Service) containingUnit.getSource();
			}
		}

		return null;
	}

}
