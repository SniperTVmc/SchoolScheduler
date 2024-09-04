package fr.snipertvmc.schedulerapi.infrastructure.utilities.places;

import fr.snipertvmc.schedulerapi.infrastructure.enums.ClassroomType;

import java.util.UUID;

public class Classroom {


	// -------------------------------------------------- //


	private final UUID uuid;

	private Building building;
	private String displayName;
	private byte maxCapacity;
	private ClassroomType type;


	public Classroom(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUuid() {
		return uuid;
	}


	// -------------------------------------------------- //
}
