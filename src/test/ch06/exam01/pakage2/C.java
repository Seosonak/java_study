package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
//	A a = new A(); //A클래스(default) 접근 불가
//	B b = new B();
	
//	A a1 = new A(true); //o
//	A a2 = new A(1); //x
//	A a3 = new A("문자열"); // x
	public C() {
		A a = new A();
		
		a.field1 = 1; //o
	//	a.field2 = 1; //x 
	//	a.field3 = 1; //x
		a.method1();  //o
	//	a.method2();  //x
	//	a.method3();  //x

	}
}
