package test.ch06.que;

public class MemberService {
	
	public String id;
	String password;
	boolean login(String id, String password) {
		if (id == "반냠헤" && password == "12345") {
			this.id = id;
		 return true;
		} else {
			return false;
		}			
		
	};
	
	void logout(String id) {
		if (id == "반냠헤") {	
			this.id = id;
			System.out.println(this.id + "님이 로그아웃하셨습니다.\n");
			return;
		}
	}
	

	
	
}
