package test.ch08.Interface;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; //자동형변환
		
		ia.methodA();
		
		InterfaceB ib = impl; 
		ib.methodB();
		
		InterfaceC ic = impl;
		// C는 인터페이스 A,B를 상속받아서 ABC 다 사용 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
