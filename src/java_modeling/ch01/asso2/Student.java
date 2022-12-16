package java_modeling.ch01.asso2;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Course> courses; //배열에객체저장
	
	
	//생성자
	public Student (String name) {
		this.name = name;
	courses = new Vector <Course>();
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		courses.remove(course);
	}
}
