package fr.snipertvmc.schedulerapi.infrastructure.utilities.peoples;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;

import java.util.UUID;

public class Student {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private String firstName;
	private String lastName;
	private byte grade;


	public Student(UUID uuid) {
		this.uuid = uuid;
	}


	// -------------------------------------------------- //


	public UUID getUuid() {
		return uuid;
	}


	// -------------------------------------------------- //


	public School getSchool() {
		return school;
	}


	public Student setSchool(School school) {
		this.school = school;
		return this;
	}


	// -------------------------------------------------- //



	public String getFirstName() {
		return firstName;
	}


	public Student setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}


	// -------------------------------------------------- //


	public String getLastName() {
		return lastName;
	}


	public Student setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}


	// -------------------------------------------------- //


	public byte getGrade() {
        return grade;
    }


	public Student setGrade(byte grade) {
        this.grade = grade;
        return this;
    }


	// -------------------------------------------------- //
}
