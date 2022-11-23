package test.ch09;

public class ALocalEx {

	public static void main(String[] args) {
		ALocal a = new ALocal();
		
		//메소드 호출을 통해서 객체 생성
		//useB안에 클래스B 클래스B안에 객체생성
		a.useB();

	}

}
