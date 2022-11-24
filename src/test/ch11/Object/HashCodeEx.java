package test.ch11.Object;

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "길동");
		Student s2 = new Student(1, "길동");

		/*
		System.out.println(s1.hashCode() + "," + s2.hashCode());
		
		if(s1.hashCode() == s2.hashCode()) {
			System.out.println("같다");
		}
		*/
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("논리적 동등입니다");
			} else {
				System.out.println("no하고 name 데이터가 다르므로 논리적 동등이 아닙니다.");				
			}
		
	}

	}
