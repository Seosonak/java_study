package test.ch03;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 부호 연산자
		int x = -100; // 기본값
		x = -x; // -가 +로 변환
		System.out.println(x);

		// 증강 연산자
		int a = 10;
		int b = 10;
		int c;

		a++; // 10에서 +1
		++a; // 10에서 +1된 11에서 +1 되어 12
		System.out.println("a= " + a);

		System.out.println("#############");

		b--;
		--b;
		System.out.println("y= " + b);

		System.out.println("#############");

		c = a++;
		System.out.println("c= " + c);
		System.out.println("a= " + a);

		System.out.println("#############");

		c = ++a;
		System.out.println("c= " + c);
		System.out.println("a= " + a);

		System.out.println("###########");
		
		c = ++a;
	}

}
