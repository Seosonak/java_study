package test.ch06.que;

public class Account {
	private int balance;
	public static final int MIN_BLANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	Account account = new Account();
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		
		this.balance = balance; 
	
	}
	
}
