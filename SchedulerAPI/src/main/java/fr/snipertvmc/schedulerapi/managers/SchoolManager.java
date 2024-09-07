package fr.snipertvmc.schedulerapi.managers;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.Address;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;
import fr.snipertvmc.schedulerapi.utilities.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SchoolManager {


	// -------------------------------------------------- //


	private static SchoolManager instance;


	public static SchoolManager getInstance() {
		if (instance == null) {
			instance = new SchoolManager();
		}
		return instance;
	}


	// -------------------------------------------------- //


	private Map<UUID, School> schools = new HashMap<>();


	public List<School> getSchools() {
		return (List<School>) MapUtils.getValues(schools);
	}


	public School getSchool(UUID uuid) {
		return schools.get(uuid);
	}


	// -------------------------------------------------- //


	public School newSchool(Address address, String displayName, String description) {

		School school = new School(UUID.randomUUID())
				.setDisplayName(displayName)
				.setDescription(description)
				.setAddress(address);

		schools.put(school.getUUID(), school);
		return school;
	}


	// -------------------------------------------------- //
}
