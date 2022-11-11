package test.ch03;

public class OverflowUnderflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//오버플로우
		//: 타입이 허용하는 최대값을 벗어나는 것. 가장 작은 값으로 돌아가 실행
		byte var1 = 125; // byte의 범위는 -128~127

		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("\"오버 플로우\"" + "var1: " + var1);
			
		}
		
		System.out.println("--------------");
		
		
		//언더플로우
		//:타입이 허용하는 최소값을 벗어나는 것.가장 큰 값으로 돌아가 실행
		
	byte var2 = -125;
		
		for (int i=0; i<5; i++) {
			var2--;
			System.out.println("\"언더 플로우\"" +"var2: " + var2);
		}
	}

}
