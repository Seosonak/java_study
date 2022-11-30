package test.ch12.wlid;

public class GenericEx {

	public static void main(String[] args) {
		//All
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		System.out.println();
		//학생만
//		Course.registerCourse2(new Applicant<Person>(new Person()));
	//	Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		System.out.println();
		//직장 일반
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		System.out.println();

	}

}
