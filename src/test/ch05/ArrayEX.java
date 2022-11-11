package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] * 또는 String *[] 로 작성 가능
		String season[] = { "Spring", "Summer", "Fall", "Winter" };
		@SuppressWarnings("unused")
		String season2[]; // 배열 없이선언만

		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);

		// 값 번경
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();

		// 총합, 평균
		int[] scores = { 83, 90, 87 };
		int sum = 0;

		// 총합
		for (int i = 0; i < 3; i++) {
			sum += scores[1];
		}
		// 평균
		double avg = (double) sum / 3;

		System.out.println("총합= " + "평균= " + avg);

		// 수의 초기값
		// int, short, byte : 0
		// long : 0L
		// char : '\u0000'
		// float : 0.0f
		// double : 0.0
		// boolean : false

		/*
		 * int[] arr1 = new int[3];
		 * 
		 * for (int i = 0; i <3; i++) { System.out.println(arr1[i]); }
		 * 
		 * for (int i = 0; i <3; i++) { System.out.println(arr1[i]); }
		 * 
		 * double[] arr2 = new double[3];
		 * 
		 * for (int i = 0; i <3; i++); System.out.println(arr2[]);
		 * 
		 */

	}

}
