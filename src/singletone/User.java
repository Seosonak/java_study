package singletone;

public class User {
//사용자 이름필드
	private String name;
	
	//생성자
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		System.out.println(this.name + "사용자가 사용하는 프린트: " + printer.toString());
		//오브젝트에서쓰는거~~ toString 객체주소를 toString으로 알려줭
	}
}
