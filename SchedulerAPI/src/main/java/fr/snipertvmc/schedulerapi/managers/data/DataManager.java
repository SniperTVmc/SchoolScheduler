package fr.snipertvmc.schedulerapi.managers.data;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.Address;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;
import fr.snipertvmc.schedulerapi.utilities.JsonUtils;
import fr.snipertvmc.schedulerapi.utilities.MapUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DataManager {


	private HashMap<UUID, School> schoolsMap = new HashMap<>();
	private HashMap<UUID, Address> addressesMap = new HashMap<>();


	// -------------------------------------------------- //


	private static DataManager instance;


	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}


	// -------------------------------------------------- //


	public School newSchool(Address address, String displayName, String description) {

		School school = new School(UUID.randomUUID())
				.setDisplayName(displayName)
				.setDescription(description)
				.setAddress(address);

		schoolsMap.put(school.getUUID(), school);
		return school;
	}


	public void loadSchools() {

		Map<String, Object> schools = JsonUtils.loadJson("schools.json");
		Map<String, Object> addresses = JsonUtils.loadJson("addresses.json");

		for (Object schoolUUID : MapUtils.getKeys(schools)) {

			Map<String, Object> school = (Map<String, Object>) schools.get(schoolUUID);

			String addressUUID = (String) school.get("address");
			Address address = addressesMap.get(addressUUID);

			String displayName = (String) school.get("displayName");
			String description = (String) school.get("description");

			newSchool(address,  displayName, description);
		}
	}


	// -------------------------------------------------- //


	public Address newAddress(String street, String city, int zipCode, String province, String country) {

		Address address = new Address(
				UUID.randomUUID(),
				street,
				city,
				zipCode,
				province,
				country
		);

		addressesMap.put(address.getUUID(), address);
		return address;
	}


	public void loadAddresses() {

		Map<String, Object> addresses = JsonUtils.loadJson("addresses.json");

		for (Object addressUUID : MapUtils.getKeys(addresses)) {

			Map<String, Object> address = (Map<String, Object>) addresses.get(addressUUID);

			String street = (String) address.get("address");
			String city = (String) address.get("city");
			int zipCode = (int) address.get("zipCode");
			String province = (String) address.get("province");
			String country = (String) address.get("country");

			newAddress(street, city, zipCode, province, country);
		}
	}


	// -------------------------------------------------- //
}
