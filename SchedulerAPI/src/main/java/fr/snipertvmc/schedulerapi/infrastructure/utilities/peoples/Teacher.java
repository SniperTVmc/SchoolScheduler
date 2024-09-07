package fr.snipertvmc.schedulerapi.infrastructure.utilities.peoples;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;

import java.util.UUID;

public class Teacher {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private String firstName;
	private String lastName;
	private String subjectTeach;


	public Teacher(UUID uuid) {
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


	public Teacher setSchool(School school) {
        this.school = school;
        return this;
    }


	// -------------------------------------------------- //



    public String getFirstName() {
        return firstName;
    }


    public Teacher setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }


	// -------------------------------------------------- //


    public String getLastName() {
        return lastName;
    }


    public Teacher setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


	// -------------------------------------------------- //


    public String getSubjectTeach() {
        return subjectTeach;
    }


    public Teacher setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
        return this;
    }


	// -------------------------------------------------- //
}
