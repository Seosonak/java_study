package java_modeling.ch01.gip;

public class Main {

	public static void main(String[] args) {
		//1. 합성관계
		//컴퓨터만 생성해도 컴퓨터부품이 생성됨
		//Computer c = new Computer();
		//컴퓨터가 사라지면 컴퓨터 부품도사라짐
		// c = null;
		 
		 //2. 집약관계
		 MainBoard mb = new MainBoard();
		 CPU c = new CPU();
		 Memory m = new Memory();
		 PowerSupply ps = new PowerSupply();
		 Computer2 c2 = new Computer2(mb, c, m ,ps);

	}

}
