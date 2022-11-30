package test.ch12.method;

public class GenericEx {
	// 제네릭 메소드
	public static <T> Box <T> boxing(T t) {
		//타입파라메터  //박스클래스의T    //매개변수도 적용되기때문에 
		// Box앞의 T가 스트링이라면 t로 된 것들은 다 스트링타입
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		
		//T가 integer일때
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("김봄");

	}

}
