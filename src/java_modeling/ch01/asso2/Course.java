package java_modeling.ch01.asso2;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Student> students;

	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}

	public String getNamer() {
		return name;
	}

	public void addStudent(Student student) {
		students.remove(student);
	}
}
