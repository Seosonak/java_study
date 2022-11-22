package test.ch08.type;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a; //인터페이스 변수 선언 
		
		//최상위는 인터페이스 A. 상속관계로 연결이 되어있으면 자동형변환이 되어
		// a = b,c,d,e를 모두 사용가능!
		a = b;
		a = c;
		a = d;
		a = e;

	}

}
