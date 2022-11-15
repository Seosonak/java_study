package test.ch06.exam01.pakage1;

public class B {
	//A a = new A(); //defualt로 된 A클래스접근가능(같은패키지에 있어서)
	A a1 = new A(true); //o
	A a2 = new A(1); //o
	A a3 = new A("문자열"); //X
}
