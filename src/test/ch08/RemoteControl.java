package test.ch08;

public interface RemoteControl {
	//변수(상수)를 보통쓸땐 퍼블릭 스태틱파이널을 많이 붙여주는데 인터페이스는 타입과 변수명만 붙여줘도 문제가 없다
	//인터페이스에 선언된 필드는 모두 퍼블릭 스태틱 파이널 특성을 가지고 있기때문이다
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	 //public추상 메소드
	 //퍼블릭이 없어도 컴파일 과정에서 퍼블릭(public abstract)이 자동으로 붙는다ㅣ
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 : 인터페이스에서 실행메소드를 구현하고 싶을때 사용.
	//(자식클래스에서 재정의(오버라이드)가능 단, 반드시 public 접근제한자를 붙여줘야함)
	default void setMute(boolean mute) {
		if (mute) {
		System.out.println("음소거 처리 합니다.");
		setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거해제");
		}
	
	}
	
	//정적메소드   
	// 1.구현코드를 쓸수있다(디폴트처럼 코드구현가능)
	// 2. 퍼블릭이 없어도 컴파일과정에서 생성해줌
	// 3. 객체생성이 필수가 아님
	static void ChangeBattery() {
		System.out.println("건전지 교체");
	}
	
}
