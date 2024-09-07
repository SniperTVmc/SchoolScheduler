package fr.snipertvmc.schedulerapi.infrastructure.utilities;

import fr.snipertvmc.schedulerapi.infrastructure.utilities.peoples.Student;
import fr.snipertvmc.schedulerapi.infrastructure.utilities.places.School;

import java.util.List;
import java.util.UUID;

public class SchoolClass {


	// -------------------------------------------------- //


	private final UUID uuid;

	private School school;

	private String name;
	private String headTeacher;
	private List<Student> students;


	public SchoolClass(UUID uuid) {
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


	public SchoolClass setSchool(School school) {
        this.school = school;
        return this;
    }


	// -------------------------------------------------- //


	public String getName() {
		return name;
	}


	public SchoolClass setName(String name) {
		this.name = name;
		return this;
	}


	// -------------------------------------------------- //


	public String getHeadTeacher() {
        return headTeacher;
    }


	public SchoolClass setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
        return this;
    }


	// -------------------------------------------------- //


	public List<Student> getStudents() {
        return students;
    }


	public SchoolClass addStudent(Student student) {
		List<Student> students = this.students;
		students.add(student);
        this.students = students;
        return this;
    }


	public SchoolClass removeStudent(Student student) {
		List<Student> students = this.students;
		students.remove(student);
		this.students = students;
		return this;
	}


	// -------------------------------------------------- //
}
