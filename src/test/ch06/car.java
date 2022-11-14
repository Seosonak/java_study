package test.ch06;

public class Car {
	//1. 필드: 객체의 데이터를 저장!!!!
		//주석 추가
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
		int speed;
//		boolean start; //시동여부

		
		
		
		Car() {} //생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다. 여러개사용가능 = 오버로딩
		// !!!!!! 생성자 오버로딩 : 매개변수의 타입,개수, 순서중 하나가 달라야함 !!!!!
		//생성자오버로딩 this() : 생성자가 여러개있을때 값이 많은것을 실행 / this.과 같은 순서로 입력해줘야함
		Car(String model) {
//			this.model = model;
			this(model, "은색", 250);
		}
		
		Car(String model, String color) {
//			this.model = model;
//			this.color = color;
			this(model, color, 250);
		}
		
		Car(String model, String color, int maxSpeed) {
			this.model = model; //this가 붙으면필드라고 생각 객체생성하는 순간 필드값할당이됨
			this.color = color; //객체가 생성되면 무조건 실행되는 코드(this)
			this.maxSpeed = maxSpeed;
		}
		
		
		/*
		  int, short, byte: 0
		  long: 0L
		  char: '\u0000'
		  float: 0.0f
		  double: 0.0
		  boolean: false
		  
		  String: null(클래스는 초기값이 null)
		 */
}
