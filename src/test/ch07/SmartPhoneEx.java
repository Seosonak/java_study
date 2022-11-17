package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//phone에서 상속받은 필드 읽기
		System.out.println(myPhone.model + "," + myPhone.color);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("네 누구세요?");
		myPhone.hangUp();
			
	}

}
