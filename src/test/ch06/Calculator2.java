package test.ch06;

public class Calculator2 {
	
	//static 을 붙이면 정적멤버 붙이기전엔 인스턴스 멤버 
	
	//1. 필드
	static double pi = 3.14159;
	
	//2. 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
