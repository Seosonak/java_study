package test.ch02;

import java.util.Scanner; //자바에서 제공하는 유틸.불러와야 사용 가능

public class ScnnerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); // 스캐너작성시 ()안에 System.in넣어줘야함

		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); // 엔터키 누르면 문자열을 읽음
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력: ");
		String strY = scanner.nextLine(); // 엔터키 누르면 문자열을 읽음
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		while (true) { //반복문
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();

			if (data.equals("q")) { // equals : 문자열 비교시 필수입력(입력받은 데이터가q인가?) JS에선 if (data === "q")
				break; //입력받은 데이터와 일치할시 while반복을 멈추는 기능
			}

			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");

	}

}
