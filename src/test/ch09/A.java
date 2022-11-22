package test.ch09;

public class A {
	// (중첩클래스)인스턴스 멤버 클래스
	// 접근제한자 (public, default, private) 사용가능
	// 선언해서 필드,생성자,메소드에서 불러서 사용가능
	// 내부에서 사용(장점):중첩클래스사용시 접근하기가 서로 편하다,외부에서 볼 때 불필요한 클래스를감출수있다
	class B {
		// B도 클래스이기 때문에 필드작성
		// B클래스의 필드
		int field1 = 1;

		// B클래스의 생성자
		B() {
			System.out.println("B생성자 실행!");
		}

		// B클래스의 메소드
		void method1() {
			System.out.println("B의 메소드1 실행!");
		}
	}

	// 1. 필드로 만들기
	//B field = new B();

	// 2. A클래스 생성자로 만들기
	/*A() {
		B b = new B();
	}

	// 3. 메소드에서 사용 가능(A클래스에 정의된 메소드)
	void method() {
		B b = new B();
	}
	*/
	
	//A클래스의 메이드
	void useB() {
		B b = new B(); //생성자 실행
		System.out.println(b.field1);
		b.method1();
	}
}
