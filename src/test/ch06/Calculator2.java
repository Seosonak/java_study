package test.ch06;

public class Calculator2 {
	
	
	//1. static 필드
	//static 을 붙이면 정적멤버 붙이기전엔 인스턴스 멤버 
	//static RUN 을 누르는 순간 메모리에 올려줌(적재) , static이 없으면 new로 생성할때 메모리에 올라간다
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	
	//static 필드에 대한 초기화 작업이 필요할때 사용
	//스타틱블록(this를 쓰면 오류 :클래스에 귀속된 아이들이 아니고 메모리에 바로 올라가기때문에)
	//ex.계산기에다 모델 이름을 붙여줄때 info에 모델과 넘버를 넣는다
	static {
		info = model + "_" + number; //calc1_1 가 info에 들어간다
	}
	
	//2. static 메소드 (static변수만 사용가능하고 인스턴스변수는 사용할수없다! 반대는 가능)
	//
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
