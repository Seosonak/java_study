package test.ch06;

public class Korea {
 
	//final이 붙으면 파이널필드라고 부름
	// : 처음이자 최종값 . 저장된 값 절대로 변경불가 , 초기값을 무조건 줘야함(필드 선언시 주거나 생성자에서 줘야한다)
	final String nation = "대한민국"; 
	final String ssn; //주민번호
	
	//인스턴스 필드
	String name;
	
	
	//생성자
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
