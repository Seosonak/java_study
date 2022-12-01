package singletone;

//싱글톤!!!!!!!!!!!!
//프린터 객체는 무조건 하나만 생성되어야한다
public class Printer {
	//필드
	//객체할당안된상태
	private static Printer printer = null;
	
	
	//private : 해당클래스내에서만생성가능
	// 1. 생성자를private로! 외부에서 객체를 생성 못함!
	private Printer() {}
	
	//메소드
	//            ▼리턴타입은 프린터
	public static Printer getPrinter() {
		//프린터 객체가 null이면 printer객체 생성
		if (printer == null) {
			printer = new Printer();
		} 
		// 이미 프린터 객체가 생성이 되어있으면 나중에는 이미 생성된 프린터가 리턴된다
		return printer;
		}
	}

