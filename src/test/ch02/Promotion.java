package test.ch02;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//크기
		
		//형변환
		//자동형변환 (Upcasting) : 자바는 데이터 타입이 다르면 자동형변환을 해줌 (작은 범위를 큰 위로 자동변환)
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("출력1:" + intValue);
		
		
		//가라는 문자열을 유니코드로 자동변환
		char charValue = '가';
		intValue = charValue;
		System.out.println("출력2:" + intValue);

		//롱이 인트보다 크기때문에 50을 그대로 변환하여 출력
		intValue = 50;
		long longValue = intValue;
		System.out.println("출력3:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("출력4:" + longValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("출력5:" + doubleValue);
		
		
		//예외 : 바이트를 차에 자동형변환은 불가능(차=음수허용X / 바이트=음수허용O)
		/*
		byte test = 65;
		char charValue = test;
		System.out.println(test);
		*/
		
		
		//short와 char는 같은 범위이나 음수허용의 차이때문에 변환불가능
		/*
		short a = 1;
		char b = a;
		*/
		
		
		
		
		
		//강제형변환(Downcasting): (큰 범위를 작은 범위로 강제적 변환시키는것,출력은 되나 잘릴수있음)
		
		/*
		int a = 10;
		byte b = a;
		라고 입력시 a앞에 (byte)를 붙이라는 수정문구가뜸
		*/
		int a = 10;
		byte b = (byte) a;
		
		System.out.println("출력6:" + b);
		
		//허용범위초과로 int var1가 모두 출력되지않음
		int var1 = 1030;
		byte var2 = (byte) var1;
		System.out.println("출력7:" + var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println("출력8:" + var4);
		
		int var5 =65;
		char var6 = (char)var5;
		System.out.println("출력9:" + var6);
		
		//int로 출력하면 소수점이 잘림
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println("출력10:" + var8);
	
		//컴파일단계에서 미리 합쳐놓음(자동형변환으로 인해 byte가 int로 변환되기때문에 byte result로 출력할수없음
		/*
		 출력방법두가지 1.int result = x + y  2.byte result = (byte) x + y
		 */
		byte x = 10;
		byte y = 20;		
		int result = x + y;
		System.out.println("출력11:" + result);
		
		//여러개의 타입을 합칠땐 가장 큰 타입으로 출력해야함
		byte v9 = 10;
		int v10 = 100;
		long v11 = 1000L;
		long result3 = v9 + v10 + v11;
		System.out.println("출력12:" + result3);
		
		char v14 = 'B'; //A=65 B=66
		char v15 = 1;
		int result4 = v14 + v15;
		System.out.println("출력13:" + result4);
		//char를 붙이면 강제적으로 문자열로 찍음
		System.out.println("출력14:" + (char)result4);
		
		int v16 = 10;
		int result5 =  v16 / 4;
		System.out.println("값1=" + result5);
		//2.5가 나와야하는데 인트는 소수점을 찍을수없어서 2로 출력 (정수형은 항상 정수형으로 출력됨) 
		//뒤를 4.0으로 찍으면 2.5출력
	
		int v17 = 10;
		double result6 = v17 / 4; // 더블타입으로 변환되어 2.0 
		System.out.println("값2=" + result6);
		
		int v18 = 1;
		int v19 = 2;
		double result7 = v18 / v19;
		System.out.println("출력15:" + result7);
		
		
		//문자열이 하나라도 있으면 문자로 인식
		String str = "안녕하세요";
		int val = 1;
		String val2 = "3";
		System.out.println("출력16:" + str + val);
		System.out.println("출력17:" + val + val2); //문자열이기때문에 4가아닌 13으로 출력
		System.out.println("출력18:" + 2 + val + val2); //33 2는숫자 val도 숫자이기에 둘을 먼저 합쳐서 3으로 출력 val2는 문자열이라 최종적으로 33으로 출력됨
		
		//타입별로 변환하기
		byte value = Byte.parseByte(val2); //문자형을 byte로 변환
		int value2 = Integer.parseInt(val2); //문자형을 int형으로		
		double value3 = Double.parseDouble(val2); //문자형을 double로
		
		String str2 = String.valueOf(val); //기본형(primitive)을 String으로
	
		System.out.println("출력19:" + value);
		System.out.println("출력20:" + value2);
		System.out.println("출력21:" + value3);
		System.out.println("출력22:" + str2);
		
		//print.f 출력법
		System.out.printf("이름: %s\n","김봄"); //문자열
		System.out.printf("정수: %d\n",25); //정수
		System.out.printf("실수: %f\n",39.1); //실수
		System.out.printf("정수출력1: %6d\n",123); //%숫자d,s :해당숫자만큼 출력,빈문자는 공백 -를붙이면 반대쪽에 공백
	}
	

}
