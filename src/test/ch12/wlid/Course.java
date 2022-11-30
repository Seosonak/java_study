package test.ch12.wlid;

public class Course {
    // 모든사람이 수강신청가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "1을 등록");
	}
	
	// 학생만수강신청가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "2를 등록");
	}
	
	// 직장인 및 일반인만 수강신청가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "3을 등록");
	}
}
