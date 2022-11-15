package test.ch06;

public class Car2 {

	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed + "으로 달립니다.");  //this를 붙여도되고 안붙여도됨
	}
	
	void run2() {
		run(); //메소드간 호출가능 .this 넣어도되고 안넣어도됨
		System.out.println(this.speed + "으로 달립니다.");  //this를 붙여도되고 안붙여도됨
	}
	
	//정적 블록
	//정적블록에서도 인스턴스에 대해 직접적인 접근불가
	/*
	static {
		this.speed = 150; X
	}
	*/
	
	//정적 메소드
	static void simulate() {
		// this.speed = 200; 인스턴스 필드를 정적메소드에서 사용시 이렇게는 접근이 불가능하고 아래처럼 작성해야 접근할수있다
		Car2 myCar = new Car2(); //자기자신(클래스)안에서도 메소드로 본인인스턴스 생성가능
		
		myCar.speed = 200;
		myCar.run();
	}
	
	
	
	public static void main(String[] args) {
		//실행을 하면 클래스안의 메인메소드가 제일 먼저 실행됨
		//메인 메소드가 이미 Car2클래스안에 있어서 Car2.simulate로 적지않아도 실행이 됨.붙여도 문제가 생기진 않음
		simulate();
	
		Car2 myCar = new Car2();
				
		myCar.speed = 60;
		myCar.run();

	}

}
