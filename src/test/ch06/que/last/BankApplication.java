package test.ch06.que.last;

import java.util.Scanner;

public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); //스캐너 객체생성
	public static void main(String[] args) {
		boolean run = true;
		while (run) = true;
		
		System.out.println("-------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------");
		System.out.println("선택>");
		int selectNo= scanner.nextInt();

		if (selectNo == 1) creatAccount();
		else if (selectNo == 2) accountList();
		else if (selectNo == 3) deposit();
		else if (selectNo == 4) withdraw();
	}
	//1. 계좌 생성
	public static void createAccount() {
		System.out.println("------")
		System.out.println("계좌새엇")
	}
	
	//2. 계좌 목록
	public static void accountList() {}

}
