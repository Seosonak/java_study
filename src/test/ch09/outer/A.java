package test.ch09.outer;

public class A {
	//A클래스으 ㅣ인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적필드와 메소드
	static int field2;
	static void method2() {}
	
   //인스턴스 멤버 클래스
	class B {
		void method() {
			//A클래스의필드 메소드 접근가능
			field1 = 10; //o
			method1(); //o
			
			//A클래스의 정적필드와 메소드도 접근가능
			field2 = 10; 
			method2();
		}
	}

	// 정적멤버 클래스
	static class C {
		void method() {
			//A클래스의필드 메소드 접근불가능
			//정적멤버 클래스에서는 바깥클래스의 인스턴스 필드.,메소드 접근불가능
			//단! 정적필드와 메소드는 접근이 가능하다!
			field1 = 10; //x
			method1(); //x
			
			//A클래스의 정적필드와 메소드도 접근가능
			field2 = 10; 
			method2();
		}
	}
}
