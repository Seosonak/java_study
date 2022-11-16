package test.ch06;

public class This {
 
	//필드
	String model;
	int speed;
	
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에 this를 붙인다
	//this 생략불가능함(
	This(String model) {
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//         )
	
	
	
	
	void run() {
		this.setSpeed(100);  //같은 클래스간의 메소드를 호출시 this생략가능
		System.out.println(this.model + "," + this.speed); 
		//this생략가능 , 
	}
}
