package test.ch05;

public class MainStringArrayArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//arg : 프로그램실행시 값을 미리 넣을수있음

		if (args.length != 2) {
			System.out.println("입력값 부족");
			System.exit(0); // 프로그램 강제종료
		}

		String strNum1 = args[0];
		String StrNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(StrNum2);

		int result = num1 + num2;
		System.out.println("결과: " + result);

	}

}
