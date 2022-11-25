package Bank;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				AccountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	
	
	private static void AccountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for (int i=0; i<accountArray.length; i++) {	
		Account account = accountArray[i];
		if (account != null) {
			System.out.println("계좌번호 :" + account.getAno());
			System.out.println("계좌주 :" + account.getOwner());
			System.out.println("잔액:" + account.getBalance());
		}
	}
		System.out.println("계좌 입력완료");
	
}
	
	
	
	
	public static void deposit() {

		System.out.println("계좌번호를 입력해주세요.");
		String ano = scanner.next();
		System.out.println("입금받을 금액을 입력해주세요.");
		int balance = scanner.nextInt(); 
		
		Account account = findAccount(ano);
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("잔액은" + account.getBalance() + "원 입니다.");		
	}
	
	public static void withdraw() {
		

		System.out.println("계좌번호를 입력해주세요.");
		String ano = scanner.next();
		System.out.println("출금하실 금액을 입력해주세요.");
		int balance = scanner.nextInt(); 
		
		
		
		Account account = findAccount(ano);
		
		
		
		
		account.setBalance(account.getBalance() - balance);
		System.out.println("잔액은" + account.getBalance() + "원 입니다.");
	}
	
	private static Account findAccount(String ano) { 
		Account account = null;
		
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
				
				
			}
		}
			
		return account;
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
