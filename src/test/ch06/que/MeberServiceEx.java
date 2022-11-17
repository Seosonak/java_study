package test.ch06.que;

public class MeberServiceEx {

	public static void main(String[] args) {
		
		 MemberService idpwd = new MemberService();
		 
		 
		 boolean result = idpwd.login("반냠헤", "12345");
		 
		 if(result) { 
			 System.out.println("반냠헤" + "님이 로그인 했습니다.");
			 idpwd.logout("반냠헤");
		 } else {
			 System.out.println("id 또는 password가 올바르지 않습니다.");
		 }
		
//		 MemberService.logout() {
//			 System.out.println("" + "님이 로그아웃 되었습니다.")
//		 }
		 
//		 void logout() {
//			 if(id == "hong" ) {
//				 System.out.println(this.id + "님이 로그아웃 되었습니다.");
//			 }
//		 }
		 
	}

}
