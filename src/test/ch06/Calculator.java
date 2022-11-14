package test.ch06;

public class Calculator {
	//클래스는 설계도이며 없으면 자바가 자동으로 생성해준다	
	//리턴값이 없는 메소드 선언
	//요기는 설계도 / 필드없이 다 메소드 , 메소드도 여러개 가능
	//메소드 = 함수,기능 . 
	//JS와의 차이점 JS는 타입이 없음 , 자바는 타입명시를 꼭 해줘야함
	//void : 리턴 시킬 값이 없을시 사용 , 만약 void에 리턴사용시 값없이 return;만 작성
	//return; < 리턴은 무조건 코드를 종료시키는 녀석이당
	
	
	
	//주석처리
	/*
	void powerOn() {
		System.out.println("전원을 켠다");
	
		
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끈다");
	
	}
	
	//리턴값이 있는 메소드 

	//int형 리턴값
	int plus(int x, int y) {
		int result = x + y;
		return result;
		// 리턴시킬 result값을 꼭 붙여줘야함
	}
	
	//double형 리턴값
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	
	}
	*/
	
	
	//메소드 오버로딩 : 같은 이름의 메소드를 여러개 만든다
	// 매개변수의 순서, 갯수, 타입중 하나가 달라져야함
	double areaRectangle(double width) {
		return width * width; //더블이기때문에 실수형으로 리턴
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
	
	
	
	
}
