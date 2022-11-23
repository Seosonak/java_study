package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};

		for (int i=0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); // int형 데이터로 변경해줌
				System.out.print("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

}
