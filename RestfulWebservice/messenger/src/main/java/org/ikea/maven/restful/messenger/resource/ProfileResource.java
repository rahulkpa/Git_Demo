package org.ikea.maven.restful.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ikea.maven.restful.messenger.model.Profile;
import org.ikea.maven.restful.messenger.service.ProfileService;

@Path("/prpfiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	private ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfiles(){
		return profileService.getAllProfile();
	}

}
