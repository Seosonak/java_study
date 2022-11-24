package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		//toString : 문자의 객체정보 리턴
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		//test.ch11.Object.SmartPhone@6f2b958e
		//@6f2b958e : 객체를 나타내는 16진수코드
		//오버라이드를해서 사용을할때 특별하게 나타내고싶은 문자정보를리턴

		try {
			int value = Integer.parseInt("1oo");
		} catch{}
		System.err.println("에러"); //에러메시지!! err
	}

}
