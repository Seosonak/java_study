package test.ch11.wrapper;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj = 100; //박싱 : 기본타입(primitive type)의 값을 포장객체로 만드는것
		int value = obj; //언박싱 : 포장객체를 기본타입으로 만드는것
		
		int value2 = obj + 5; //obj는 5와 연산되기전에 언박싱이된다
		
		System.out.println("value: " + obj.intValue());
		System.out.println("value2: " + value2);
		
	}

}
