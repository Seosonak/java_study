package test.ch08;

public class Television implements RemoteControl {

	private int volume;
	
	//Tv에 빨간줄이 뜨는이유는 오버라이드로 메소드 구현해달라는 뜻
	// -> 인터페이스에 정의된 추상메소드는 반드시 구현해줘야함
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + volume);
	}
}
