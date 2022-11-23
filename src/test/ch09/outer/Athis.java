package test.ch09.outer;

public class Athis {
	//Athis 클래스의 인스턴스 필드
	String field = "A-field";
	
	//Athis 클래스의 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//B의 인스턴스 필드
		//변수이름이 똒같아도 다른클래스이기때문에 에러가나진않는다
		
		String field = "B-field";
		
		//B의 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		//B의 인스턴스메소드
		void print() {
			//B객체의 필드와 메소드
			System.out.println(this.field);
			this.method();
			
			//A객체의 필드와 메소드(이름이 같을때 불러오는 방식)
			//밖의 클래스이름.this.~~로 불러온다
			System.out.println(Athis.this.field);
			Athis.this.method();
			
		}
	}
	//A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
