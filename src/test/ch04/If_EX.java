package test.ch04;

public class If_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;

		if (score >= 90) {
			System.out.println("90점 이상입니다");
		} else {
			System.out.println("90점 이상이 아닙니다");
		}

		int score2 = 75;
		String name = "봄이";

		// if가 한 줄일때 {} 생략 가능
		if (score2 >= 90) {
			System.out.println("90점 이상입니다");
			if (name.equals(name)) {
				System.out.println(name + "입니다");
			}
		} else if (score2 >= 80) {
			System.out.println("80점 이상입니다");
		} else if (score2 >= 70) {
			System.out.println("70점 이상입니다");
		} else {
			System.out.println("70점 미만입니다");
		}

		int num = (int) (Math.random() * 6) + 1; // 랜덤함수자체는 0.0~1.0 사이의 값만 출력

		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}

		// 위의 if else if를 switch로 쓰기 (사용가능한것)
		// byte, char, short, int, long
		// String

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("1번");
		case 'B':
			System.out.println("2번");
		case 'C':
			System.out.println("3번");
		}

		switch (num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}

	}

}
