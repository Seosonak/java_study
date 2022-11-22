package test.ch09;

public class AStatic {
	// 접근제한자 (public, private, default) 사용 가능
	// 현재는 default
	static class B {
		//B클래스의 필드
		int field1 = 1;
		// B클래스의 생성자
		B() {
			System.out.println("B 생성자 실행!!");
		}
		// B클래스의 메소드
		void method1() {
			System.out.println("B메소드 실행 ! !");
		}
	}
	// 1.필드로 사용
	// B 클래스의 필드(인스턴스 필드 : 객체를 생성해야만 사용가능)
	B field = new B();
	
	// 1.필드
	// 정적 필드 값으로 사용 가능(static이기때문에)
	static B field2 = new B();
	
	// 2.생성자에서 사용
	// B 클래스의 생성자
	AStatic() {
		B b = new B();
	}
	
	// 3.메소드에서 사용
	// B 클래스의 메소드(인스턴스 메소드 : 객체를 생성해야만 사용가능)
	void method1() {
		B b = new B();
	}
	
	// 3.메소드
	// 정적 메소드로 사용 가능
	static void method2() {
		B b = new B();
	}
}
