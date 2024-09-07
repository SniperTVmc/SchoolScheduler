package fr.snipertvmc.schedulerapi.infrastructure.utilities.schedules;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Schedule {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private final List<Day> days = new ArrayList<>();


	public Schedule(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUUID() {
		return uuid;
	}


	// -------------------------------------------------- //


	public List<Day> getDays() {
		return this.days;
	}


	public List<Day> addDay(Day day) {
		this.days.add(day);
		return days;
	}


	public boolean removeDay(int index) {
		Day returned = this.days.remove(index);
		return returned != null;
	}


	// -------------------------------------------------- //
}
