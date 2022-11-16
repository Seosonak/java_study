package test.ch06.que;

public class Member {
	
	//챕터6_클래스 : 13번 문제(회원의 데이터를 Member클래스로 선언하기)
	//필드(속성)
	String name;
	String id;
	String password;
	int age;
	
	//챕터6_클래스 : 14번 문제(Member클래스의 name과 id를 외부에서 받은 값으로 초기화하도록 생성자 선언)
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
}
