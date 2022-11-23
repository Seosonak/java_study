package test.ch09.noname;

public class Car {
	//필드에 tire객체 대입
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { //상속을받은일종의클래스
		
		
		@Override
		public void roll() {
			System.out.println("한국타이어 떼굴떼굴");
		}
	};
	//메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		//로컬변수에 익명자식객체사용
		Tire tire = new Tire() {

			@Override
			public void roll() {
				System.out.println("금호타이어 굴러간다 하..");
			}
			
		};
		tire.roll();
	}
	public void run3(Tire tire) {
		tire.roll();
	}
}
