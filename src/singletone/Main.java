package singletone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//유저객체를 담을 배열을 정의! (유저열명!)
		User[] user = new User[10];
		
		
		for(int i=0; i<user.length; i++) {
			//배열에 유저를 담기! user + i 하면 유저0번1번 ~~~9번까지 새엇ㅇ됨 인덱스가증가하니까
			//        ▼유저객체 생성 
			user[i] = new User("user" + i);
			user[i].print();  //생성한 객체에서 프린트메소드실행
		}
		
		
		
		
		
		
		
	}
}
