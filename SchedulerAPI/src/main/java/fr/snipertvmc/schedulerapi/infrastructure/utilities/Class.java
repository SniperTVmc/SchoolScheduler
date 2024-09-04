package fr.snipertvmc.schedulerapi.infrastructure.utilities;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.peoples.Student;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;

import java.util.List;
import java.util.UUID;

public class Class {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private String headTeacher;
	private List<Student> students;


	public Class(UUID uuid) {
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


	public Class setSchool(School school) {
        this.school = school;
        return this;
    }


	// -------------------------------------------------- //


	public String getHeadTeacher() {
        return headTeacher;
    }


	public Class setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
        return this;
    }


	// -------------------------------------------------- //


	public List<Student> getStudents() {
        return students;
    }


	public Class addStudent(Student student) {
		List<Student> students = this.students;
		students.add(student);
        this.students = students;
        return this;
    }


	public Class removeStudent(Student student) {
		List<Student> students = this.students;
		students.remove(student);
		this.students = students;
		return this;
	}


	// -------------------------------------------------- //
}
