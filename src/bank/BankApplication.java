package bank;

import java.util.Scanner;

public class BankApplication {
	static Scanner scanner = new Scanner(System.in);
	//-> 스캐너는 여기저기서 다 사용해야 하기 때문에 static을 붙였음
	//스캐너 객체 생성 -> 누군가 만들어놓은 라이브러리를 사용함
	private static Account[] accountArray = new Account[100];
	//객체를 담을 배열 : 초기값은 0
	//개인정보라서 private로 묶어주고, 모든 클래스에서 서로 공유해야 하기 때문에 static을 붙여준다.
	// Account 사용 이유 : 문제에 써있음
	
	public static void main(String[] args) {
		
	
	
			boolean run = true;
			while (run) {
				System.out.println("-------------------------------------------------");
				System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
				System.out.println("-------------------------------------------------");
				System.out.println("선택>");
				//스캐너를 사용하기 위한 변수 선언함.
				int selectNo = scanner.nextInt();
				//함수 사용 -> 아무거나 사용하면 되지만 지금은 if 사용했는데
				//실행이 반복되어야해서 while문을 사용해야해서 while문으로 묶어줬다. 밑에 ==으로 써줬기 때문에 변수타입은 boolean으로 쓰고 변수명 run 일때 true로 저장해줌.
				if (selectNo == 1) createAccount();
				else if (selectNo == 2) AccountList();
				else if (selectNo == 3) deposit();
				else if (selectNo == 4) withdraw();
				else if (selectNo == 5) run = false; //-> run = true이면 다시 while문으로 반복되는데 false로 찍어서 종료된다. 
		}
			
			System.out.println("프로그램 종료.");
			
		}
		
		//static이 있어야 main 메소드에서 바로 호출 가능
		//없으면 객체를 생성해서 접근해야 한다.

		//1. 계좌 생성
		public static void createAccount() {
			System.out.println("-------");
			System.out.println("계좌생성");
			System.out.println("-------");
			
			System.out.println("계좌번호:");
			String ano = Scanner.next();
			
			System.out.println("계좌주:");
			String owner = scanner.next();
			
			System.out.println("초기입금액:");
			int balance = scanner.nextInt();
			
			Account newAccount = new Account(ano, owner, balance);
			//위에 입력값을 받았고, 결론적으로 계좌를 만들어줘야 한다.
			//매개변수 값 ()안에 Account 클래스에 선언한 값인 세가지를 넣어줌.
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] == null) { //배열, 방이 100개가 있는데 null인곳에 들어가야하기 때문에 null을 붙여준다.
					// 배열 Account에 static을 붙여줬기 때문에 한번 쓰면 계속 쓸 수 있어서 1번째 방에 계좌가 한개 들어가있고 비어있는 null배열 자리에 계좌가 들어감.
					accountArray[i] = newAccount; //생성한 계좌를 배열에 넣어준다.
					System.out.println("결과: 계좌가 생성되었습니다.");
					break; //계좌를 넣고 for 반복문을 끝낸다.
				}
			}
			
		}
		
		//2. 계좌 목록
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
		
		//3. 예금
		public static void deposit() {
			//계좌번호, 예금액 입력받기(scanner 이용)
			System.out.println("계좌번호를 입력해주세요.");
			String ano = scanner.next();
			System.out.println("입금받을 금액을 입력해주세요.");
			int balance = scanner.nextInt(); 
			//계좌번호로 계좌를 찾아야 한다.
			Account account = findAccount(ano);
			//찾은 계좌에 예금을 해준다.
			account.setBalance(account.getBalance() + balance);
			System.out.println("잔액은" + account.getBalance() + "원 입니다.");		
		}
		
		//4. 출금
		public static void withdraw() {
			//계좌번호, 예금액 입력받기(scanner 이용)
			System.out.println("계좌번호를 입력해주세요.");
			String ano = scanner.next();
			System.out.println("출금하실 금액을 입력해주세요.");
			int balance = scanner.nextInt(); 
			//계좌번호로 계좌를 찾아야 한다.
			Account account = findAccount(ano);
			//찾은 계좌에 출금을 해준다.
			account.setBalance(account.getBalance() - balance);
			System.out.println("잔액은" + account.getBalance() + "원 입니다.");
		}
		
		//5. accountArray 배열에서 ano가 동일한 Account객체를 찾는 역할을 한다.
		private static Account findAccount(String ano) { //계좌번호는 ano에 들어있음
			Account account = null;
			
			for (int i=0; i<accountArray.length; i++) {
				if (accountArray[i] != null) {//null이 아니면 계좌가 있다.
					//불러온 계좌안에 있는 계좌 번호와 배개변수로 받아온 계좌번호 ano가 같은지 체크
					//<- 계좌번호를 배열 안에 넣어놔서 배열을 가져옴.
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
