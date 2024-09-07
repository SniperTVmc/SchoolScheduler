package fr.snipertvmc.schedulerapi.infrastructure.utilities.schedules;

import fr.snipertvmc.schedulerapi.infrastructure.enums.Subject;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.SchoolClass;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.peoples.Teacher;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.Classroom;

import java.util.UUID;

public class Hour {


	// -------------------------------------------------- //


	private final UUID uuid;

	private float startHour;
	private float endHour;

	private Teacher teacher;
	private Classroom classroom;
	private Subject subject;
	private SchoolClass schoolClass;


	public Hour(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUUID() {
		return uuid;
	}


	// -------------------------------------------------- //


	public float getStartHour() {
        return startHour;
    }


	public Hour setStartHour(float startHour) {
        this.startHour = startHour;
        return this;
    }


	// -------------------------------------------------- //


    public float getEndHour() {
        return endHour;
    }


	public Hour setEndHour(float endHour) {
        this.endHour = endHour;
        return this;
    }


	// -------------------------------------------------- //


    public Teacher getTeacher() {
        return teacher;
    }


	public Hour setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }


	// -------------------------------------------------- //


    public Classroom getClassroom() {
        return classroom;
    }


	public Hour setClassroom(Classroom classroom) {
        this.classroom = classroom;
        return this;
    }


	// -------------------------------------------------- //


    public Subject getSubject() {
        return subject;
    }


    public Hour setSubject(Subject subject) {
        this.subject = subject;
        return this;
    }


    // -------------------------------------------------- //


	public SchoolClass getSchoolClass() {
        return schoolClass;
    }


    public Hour setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
        return this;
    }


	// -------------------------------------------------- //
}
