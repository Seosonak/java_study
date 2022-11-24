package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();
		//값을 비교하는 타입 [Byte . Short . Integer : -128 ~127]
		// Boolean . Character
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
