package fr.snipertvmc.schedulerapi.infrastructure.utilities.places;

import fr.snipertvmc.schedulerapi.infrastructure.enums.ClassroomType;

import java.util.UUID;

public class Classroom {


	// -------------------------------------------------- //


	private final UUID uuid;

	private Building building;
	private byte floor;

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


	public Building getBuilding() {
		return building;
	}


	public Classroom setBuilding(Building building) {
        this.building = building;
        return this;
    }


	// -------------------------------------------------- //


    public byte getFloor() {
        return floor;
    }


    public Classroom setFloor(byte floor) {
        this.floor = floor;
        return this;
    }


	// -------------------------------------------------- //


    public String getDisplayName() {
        return displayName;
    }


    public Classroom setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }


	// -------------------------------------------------- //


	public byte getMaxCapacity() {
        return maxCapacity;
    }


	public Classroom setMaxCapacity(byte maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }


	// -------------------------------------------------- //


	public ClassroomType getType() {
        return type;
    }


	public Classroom setType(ClassroomType type) {
        this.type = type;
        return this;
    }


    // -------------------------------------------------- //
}
