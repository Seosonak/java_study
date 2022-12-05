package ch13.threadSynchro;

public class User1Thread extends Thread{
	private Calculator calculator;
	
	
	//생성자.
	public User1Thread() {
		setName("user1Thread"); //Thread를 상속받아서 (setName을)바로 사용가능. Thread의 이름을 변경함.
	};
	
	public void setCalculator (Calculator calculator) {
		this.calculator = calculator;
	}

	
	//실제로 쓰레드가 실행될 때 실행되는 코드 입니다.
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
	
	
	
	
}
