package test.ch08;

public class RemoteControlEx {
 //자동형변환 오버라이드 된것만 호출함 
//
	public static void main(String[] args) {
		/*방법1
		RemoteControl rc = new Television();
		rc.turnOn();
		
		RemoteControl ra = new Audio();
		ra.turnOn();
		*/
		
		//인터페이스가 장점으로 나타나는 출력법
		//방법2
		
		
		//부모
		RemoteControl rc;
		
		rc = new Television();  //tv객체를 rc에 받는다
		rc.turnOn(); //tv에 있던 on.set을 실행한다
		rc.setVolume(5); 
		//디폴트메소드 
		rc.setMute(true); //tv에 오버라이드된 setvol을 실행
		rc.setMute(false);
		rc.turnOff();
		
		
		System.out.println("===============");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);		
		rc.turnOff();
		
		RemoteControl.ChangeBattery();
		
		//스태틱 특성을 가져서 객체를 생성하지 않고도 호출이 가능하다
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
	}

}
