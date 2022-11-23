package test.ch09;

public class ALocal {
	// Local : 메소드 안에다 넣는 클래스
	// 1. 내부에서 호출하는 방법
	// A클래스메소드
	void useB() { // final static
		// useB안에 로컬변수,함수내에서 쓰이는 로컬변수
		// final int var (자바8부터는 붙이지않아도 붙은걸로간주.변경불가능)
		//중첩했을때 클래스안에서 변경불가int var = 1;

		class B { // 메소드안에 class B
			// B클래스의 필드
			int field1 = 1;

			// B클래스의 생성자
			B() {
				System.out.println("B클래스의 생성자 실행~!");
			}

			// B클래스의 인스턴스 메소드
			void method1() {
				System.out.println("B클래스의 메소드 실행~~");
			}

			void method2() {
				arg = 2;
			}
		}
		// 메소드 안에서 객체 생성(A클래스{메인메소드} 메소드안에서 B)
		B b = new B(); // 생성자실행
		// 필드와 메소드 실행
		System.out.println(b.field1);
		b.method1();
	}

}
