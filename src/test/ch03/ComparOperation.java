package test.ch03;

public class ComparOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비교연산자
			int num1 = 10;
			int num2 = 10;
			
			boolean result1 = (num1 == num2);
			System.out.println("result1: " + result1); //false
			
			boolean result2 = (num1<= num2);
			System.out.println("result2: " + result2);
			
			char char1 = 'A'; //65
			char char2 = 'B'; //66
			boolean result3 = (char1 < char2);
			System.out.println("result3: " + result3);
			
			int num3 = 1;
			double num4 = 1.0;
			boolean result4 = (num3 == num4);
			System.out.println("result4: " + result4);
			
			float num5 = 0.1f;
			double num6 = 0.1;
			//float와 double는 정밀도가 다르므로 비교시 강제형변환필수
			boolean result5 = (num5 == num6);
			boolean result6 = (num5 == (float)num6);
			System.out.println("result5: " + result5);
			System.out.println("result6: " + result6);
			
			
			
			//문자열비교시 equals필수
			String str1 = "자바";
			String str2 = "java";
			
			boolean result7 = (str1.equals(str2));
			boolean result8 = (!str1.equals(str2));
			System.out.println(result7);
			System.out.println(result8);
	}

}
