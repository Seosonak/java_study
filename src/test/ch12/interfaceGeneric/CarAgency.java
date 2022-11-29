package test.ch12.interfaceGeneric;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
