package test.ch09;

public class AEx {

	public static void main(String[] args) {
		/*
		// 외부에서 B클래스 사용하기 (중첩이되기때문에 경우에 따라 내부,외부에서 사용)
		// 중첩클래스는 바로 B로 접근 불가능 A에 접근 후에 B로 접근이 가능하다
		A a = new A();
		
		//A. a.을 붙여줘야함 (타입 a.~~)
		A.B b = a.new B();
		*/
		A a = new A();
		a.useB();
	}

}
