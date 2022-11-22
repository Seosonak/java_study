package test.ch09;

public class AStaticEx {

	public static void main(String[] args) {
		// 외부에서 접근
		// 인스턴스(객체) 생성하지 않아도 접근 가능
		AStatic.B b = new AStatic.B();  //new AStatic는 객체가 아니라 클래스 자체
		
		System.out.println(b.field1);
		b.method1();

	}

}
