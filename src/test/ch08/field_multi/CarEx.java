package test.ch08.field_multi;

public class CarEx {
	public static void main(String[] args) {
	Car myCar = new Car();
	myCar.run();
	
	//타이어교체
	myCar.tire1 = new KumhoTire();
	myCar.tire2 = new KumhoTire();
	}
	
}
