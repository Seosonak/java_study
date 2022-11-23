package test.ch10.makeExeption;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account(); //계좌생성

		
		//저축
		account.deposit(10000); //만원저축
		System.out.println("예금액: " + account.getBalance());
		
		//출금
		try {
			account.withdraw(30000); //3만원출금
		} catch (InsuffException e) {
			String message = e.getMessage(); //에러메세지받기
			System.out.println(message);
		} 
	}

}
