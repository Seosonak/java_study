package test.ch07;
//자식 클래스
public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("자식 생성자 실행");
//		this.model = model; //부모필드에 접근 가능
//		this.color = color; //부모필드에 초기값을 준다
	}
	
	// 오버로딩(overloading)은 새로운 메소드를 정의
	// 오버라이딩(overriding)은 상속받은 기존의 메소드를 재정의
	// 다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것(같은 자료형에 여러가지 객체를 대입하여 다양한 결과를 얻어내는 성질)
	//  >효과 : 하나의 타입으로 다양한 실행결과를 얻음. 객체를 부품화하여 유지보수를용이하게한다
	//
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
