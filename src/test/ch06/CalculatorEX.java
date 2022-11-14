package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실행을위해선 객체생성
		//객체를 가져와서 .하고 원하는 함수(매개변수작성시 갯수 타입 맞춰주기 필수)작성
		/*
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,  6);
		System.out.println(result1);
		
		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		*/
		
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		System.out.println(result1);
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println(result2);
		
	}

}
