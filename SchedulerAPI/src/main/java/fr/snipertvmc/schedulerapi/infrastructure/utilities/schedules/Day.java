package fr.snipertvmc.schedulerapi.infrastructure.utilities.schedules;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Day {


	// -------------------------------------------------- //


	private final UUID uuid;

	private DayOfWeek dayOfWeek;
	private final List<Hour> hours = new ArrayList<>();


	public Day(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUUID() {
		return uuid;
	}


	// -------------------------------------------------- //


	public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


	public Day setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }


	// -------------------------------------------------- //


	public List<Hour> getHours() {
        return this.hours;
    }


	public List<Hour> addHour(Hour hour) {
		this.hours.add(hour);
        return hours;
    }


	public boolean removeHour(int index) {
		Hour returned = this.hours.remove(index);
		return returned != null;
	}


	// -------------------------------------------------- //
}
