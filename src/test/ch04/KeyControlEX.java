package test.ch04;

import java.util.Scanner;

public class KeyControlEX {

	public static void main(String[] args) {
		// 1,2를 입력했을 때 속도를 증가, 감속시키고, 3입력시 종료시키는 프로그램
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("--------------");
			System.out.println("1.증속, 2.감소, 3.중지");
			System.out.println("--------------");
			System.out.println("선택: ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("현재속도: " + speed);
			} else if (strNum.equals("3")) {
				// run = false;
				// System.out.println("프로그램 종료");
				// break; // > 반복문 끝냄
				continue; // 반복문 시작으로 돌아감

			}
		}
	}

}
