package test.ch15.lamda;

public class lamdaEx2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
	
		person.action((x, y) -> x - y);
		person.action((x, y) -> x * y);		
	}
}

