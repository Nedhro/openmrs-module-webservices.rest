package org.openmrs.module.webservices.rest.deletebeforerelease;

import org.openmrs.OpenmrsMetadata;
import org.openmrs.annotation.Handler;
import org.openmrs.module.webservices.rest.RequestContext;
import org.openmrs.module.webservices.rest.annotation.Resource;
import org.openmrs.module.webservices.rest.resource.DelegateConverter;
import org.openmrs.module.webservices.rest.resource.MetadataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.resource.ResourceDeletionException;

/**
 * This class is a temporary hack, to be removed before the first release of the module. It allows
 * the framework to generate resource representations that refer to metadata properties that don't
 * have their own {@link DelegateConverter} defined yet without getting the 'Conflicting getter
 * definitions for property "retired"' you would otherwise get from Jackson JSON.
 */
@Resource("temp hack")
@Handler(supports=OpenmrsMetadata.class)
public class TempHackMetadataConverter extends MetadataDelegatingCrudResource<OpenmrsMetadata> {
	
	public TempHackMetadataConverter() {
		super(null);
	}
	
	public TempHackMetadataConverter(OpenmrsMetadata metadata) {
	    super(metadata);
    }

	@Override
	public OpenmrsMetadata fromString(String string) {
		throw new RuntimeException("Not Implemented");
	}
	
	@Override
	public void purge(RequestContext context) throws ResourceDeletionException {
		throw new RuntimeException("Not Implemented");
	}
	
	@Override
	protected OpenmrsMetadata saveDelegate() {
		throw new RuntimeException("Not Implemented");
	}
	
	@Override
	protected OpenmrsMetadata newDelegate() {
		throw new RuntimeException("Not Implemented");
	}
	
}