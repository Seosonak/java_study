package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//비트 논리 연산자
		
		System.out.println("45 & 25= " + (45 & 25) );
		System.out.println("45 | 25= " + (45 | 25));
		System.out.println("45 ^ 25= " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("##############");
		
		
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);
	}

}
