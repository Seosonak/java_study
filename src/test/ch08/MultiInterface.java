package test.ch08;

public class MultiInterface {

	public static void main(String[] args) {
		RemoteControl2 rc = new SmartTelevison();  //자동형변환 자식클래스를 RC2에 넣어줌 오버라이드된것만사용가능
		rc.turnOn();
		rc.turnOff();

		Searchable searchable = new SmartTelevison();
		searchable.search("www.naver.com");
	}

}
