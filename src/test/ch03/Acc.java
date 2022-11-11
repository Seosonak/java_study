package test.ch03;

public class Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산자
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		//정확한 계산은 정수로 해야함
		double result = apple - number * pieceUnit; //곱셈먼저 계산해서 0.7, 
		//0.7에서 1을 빼면 0.3이 나와야하는데 
		System.out.println("사과 1개에서 남은 양: " + result);
		
		int melon = 1;
		int totalPiece = melon * 10;
		int number2 =7;
		
		int result2 = totalPiece - number2;
		System.out.println("멜론 1개에서 남은 양: " + result2/10.0);
		
		int x = 5;
		int y = 0;
		int result3 = 5 / 0;
		System.out.println(x);
		System.out.println(result3);
		/*  > 출력시 에러 (Exception in thread "main" java.lang.ArithmeticException: / by zero
		at test.ch03.Acc.main(Acc.java:25)
		*/
		
		int a = 5;
		double b = 0.0;
		double c = a / y;  // Infinity (무한대라고뜸)
		//double c = a % b;  //NaN (숫자가 아니라고 뜸
		
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(c + 2);
		
//		if (Double.isInfinite(c) || Double.isNaN(c)) 
//			System.out.println{c}
//		};

		
		
		
		
	}

}
