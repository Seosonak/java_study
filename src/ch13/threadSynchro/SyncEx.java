package ch13.threadSynchro;

public class SyncEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator(); 
		
		User1Thread user1 = new User1Thread();
		user1.setCalculator(calc);
		user1.start();
		
		User2Thread user2 = new User2Thread();
		user2.setCalculator(calc);
		user2.start();
		
	}

}
