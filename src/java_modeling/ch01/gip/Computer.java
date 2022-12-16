package java_modeling.ch01.gip;

//합성
public class Computer {

	//필드
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	//생
	
	public Computer() {
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
		
	}
	
	
}
