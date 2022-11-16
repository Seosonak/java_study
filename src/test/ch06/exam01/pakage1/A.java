package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다
//public class A = public
//class A = default
public class A {
//	A a3 = new A("문자열");
//	
//	 public A(boolean b) {
//		 
//	 }
//	 
//	 A(int b) {
//		 
//	 }
//	 
//	 private A(String s) {
//		 
//	 }
	//private 해당클래스내 사용가능
	//default 동일패키지내 클래스 사용가능
	//public 패키지,클래스상관없이 사용가능
	//필드
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; //o
		field2 = 1; //o 
		field3 = 1; //o
		method1();  //o
		method2();  //o
		method3();  //o
	}
	
	
	//메소드
	public void method1() {}  //퍼블릭
	void method2 () {}  //디폴
	private void method3() {} //프라이빗
}
