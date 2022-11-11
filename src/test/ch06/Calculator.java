package test.ch06;

public class Calculator {
	//리턴값이 없는 메소드 선언
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
	}
	
	//double형 리턴값
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
}
