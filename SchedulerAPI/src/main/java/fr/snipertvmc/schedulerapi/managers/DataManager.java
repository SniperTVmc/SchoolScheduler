package fr.snipertvmc.schedulerapi.managers;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.Address;
import fr.snipertvmc.schedulerapi.utilities.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class DataManager {


	// -------------------------------------------------- //


	private static DataManager instance;


	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}


	// -------------------------------------------------- //


	private HashMap<UUID, Address> addresses = new HashMap<>();


	public List<Address> getAddresses() {
		return (List<Address>) MapUtils.getValues(addresses);
	}


	public Address getAddress(UUID uuid) {
		return addresses.get(uuid);
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

		addresses.put(address.getUUID(), address);
		return address;
	}


	// -------------------------------------------------- //
}
