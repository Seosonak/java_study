package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	//A a = new A(); // A클래스 접근불가
	//B b = new B();
	A a1 = new A(true); //o
	A a2 = new A(1); //o
	A a3 = new A("문자열"); //X
	/*
	 클래스 : public, default
	 필드
	 생성자
	 
	 */
}
