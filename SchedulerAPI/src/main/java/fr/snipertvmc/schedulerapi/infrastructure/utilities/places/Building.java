package fr.snipertvmc.schedulerapi.infrastructure.utilities.places;

import java.util.UUID;

public class Building {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private String displayName;


	public Building(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUUID() {
		return uuid;
	}


	// -------------------------------------------------- //


	public School getSchool() {
        return school;
    }


    public Building setSchool(School school) {
        this.school = school;
        return this;
    }


	// -------------------------------------------------- //


    public String getDisplayName() {
        return displayName;
    }


    public Building setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }


	// -------------------------------------------------- //
}
