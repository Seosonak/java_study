package test.ch10.makeExeption;

public class Account {
	//피ㅣㄹ드
	private long balance;
	
	//생성자
	public Account() {}
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//예금
	public void deposit(int money) { //money : 저축
		balance += money; //잔고에 돈을 누적합산
	}
	
	//출금
	public void withdraw(int money) throws InsuffException { //money :출금하려는 돈
		//잔고보다 내가 출금하려는 돈이 더 크면 예외발생
		if (balance < money) {
			throw new InsuffException("잔고부족: " + (money - balance) + "원이 모자람"); //객체를생성하는것
		}
		balance -= money; //잔고에서 출금하려는 돈을 빼줌
	}
}
