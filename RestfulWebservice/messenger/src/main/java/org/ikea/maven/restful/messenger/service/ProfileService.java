package org.ikea.maven.restful.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ikea.maven.restful.messenger.database.DatabaseClass;
import org.ikea.maven.restful.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("rhl08120", new Profile(1L, "rhl08120", "Rahul", "Pandey"));
	}
    
	
	public List<Profile> getAllProfile(){
    	return new ArrayList<Profile>(profiles.values());
    }
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getId()<=0){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removedProfile(String profileName){
		return profiles.remove(profileName);
	}
	
	
}