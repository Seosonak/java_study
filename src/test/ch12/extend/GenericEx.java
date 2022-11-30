package test.ch12.extend;

public class GenericEx {

	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		//리턴타입은 boolean
		return (v1 == v2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		
		boolean result2 = compare (4.5, 4.5);
		System.out.println(result2);
	}

}
