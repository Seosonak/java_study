package test.ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//주어진 클래스를 찾는 코드 : Class.forName("")	;
		//일반예외 try, catch 필수
		try {
			Class.forName("java.long.String");
			System.out.println("java.long.String 클래스가 존재합니다");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
