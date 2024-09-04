package fr.snipertvmc.schedulerapi.infrastructure.utilities.places;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.Address;

import java.util.UUID;

public class School {


	// -------------------------------------------------- //


	private final UUID uuid;

	private String displayName;
	private String description;
	private Address address;


	public School(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUuid() {
		return uuid;
	}


	// -------------------------------------------------- //


	public String getDisplayName() {
		return displayName;
	}


	public School setDisplayName(String displayName) {
		this.displayName = displayName;
        return this;
	}


	// -------------------------------------------------- //


	public String getDescription() {
		return description;
	}


	public School setDescription(String description) {
        this.description = description;
        return this;
    }


	// -------------------------------------------------- //


	public Address getAddress() {
		return address;
	}


	public School setAddress(Address address) {
        this.address = address;
        return this;
    }


	// -------------------------------------------------- //
}
