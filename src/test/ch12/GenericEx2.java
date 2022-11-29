package test.ch12;

public class GenericEx2 {

	public static void main(String[] args) {
		//제너릭을 통해 다양한 제품을 생산가능
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv t = product1.getKind();
		String tModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("전기자동차");
		
		Car c = product2.getKind();
		String cModel = product2.getModel();
	}

}
