package test.ch06;

public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This > 설계도
		//ThisEx > 자동차생성될때
		This myCar = new This("포르쉐");
		This yourCar =new This("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
