package test.ch12;

public class GenericEx {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "졸려";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 123;
		int val = box2.content;
		System.out.println(val);
	}

}
