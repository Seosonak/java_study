package test.ch11.String;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder data = new StringBuilder()
				.append("DEF");
				.insert(0, "abc");
				
		System.out.print(data);
		

	}

}
