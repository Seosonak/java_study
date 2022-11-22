package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		//상속을 하는 이유 : 코드가 줄어들어서  
		Vehicle vehicle = new Bus(); //자동 타입변환(형변환)
		//여기에선 checkFare를 쓸 수 없다 이유는 오버라이드로 받은게아니라서!
		vehicle.run();
		
		
		//강제형변환 - 자동타입변환을 하면 버스안에 있는 것중 오버라이드된것만 사용할수있다
		// 자식이 가지고있는필드나 메소드를 부모에서 사용하고싶을때 쓴다!
		//강제는 ()하고 타입을 다시 써준다
		//자동 변환 후 강제변환이 된다!
	
		/*
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		*/
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		ride(bus);
		
		
	}
	
	public static void ride(Vehicle vehicle) {
		// vehicle이 버스객체를 가지고있나>
		//Vehicle= new bus();
		//강제 는 한번변환후 instanceof로 확인해야함
		if (vehicle instanceof Bus) { 
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	}
}
