package bank;

public class Account {
	//계좌번호, 계좌주, 초기입금액 결과를 실행하는 것들을 넣어줘야 한다.
	
		//필드!!!! -> 개인정보이기 때문에 private로 묶어줬음
		private String ano; //계좌번호
		private String owner; // 계좌주
		private int balance; //잔고
		
		//생성자 -> 계좌번호, 계좌주, 잔고의 값을 넣어야하기 때문에 생성자를 생성해준다.
		//-> 객체를 생성할 때 실행이 되는것들, 할당되는것을 생성자 안에 써준다.
		//초기화 시키고 싶은 값을 생성해준다.
		//-> 매개변수와 같을 때 this를 붙여준다.
		public Account(String ano, String owner, int balance) {
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
		}
		
		//메소드!!!!!! -> 오른쪽 마우스 클릭 -> 소스 -> getters setters and setters..
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
	}

