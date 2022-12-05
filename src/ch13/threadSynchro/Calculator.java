package ch13.threadSynchro;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
//메소드에 동기화 걸기. synchronized
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초간 정지.
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + "의" + this.memory);
	}
//코드 블록에 동기화를 걸기. (내가 동기화를 걸기 원하는 코드 범위를 선택 후 동기화를 적용합니다.)
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000); // 2초간 정지.
			} catch (InterruptedException e) {

			}
			System.out.println(Thread.currentThread().getName() + "의" + this.memory);
			
		}
	}

}



/*동기화 이전 상태.
	calc1 메모리 100으로 해줘 -> 2초 대기중                  calc1   메모리 출력해줘

																						    50
																				----> 메모리는   을 출력한다.
																						    50

						calc2 메모리 50으로 해줘 -> 2초 대기중    calc2 메모리 출력해줘



유저1 쓰레드 생성 -> set메모리 100해줘 + 2초간 정지																		(2초끝)   메모리 출력해줘 : 50
						(2초간 정지 사이에 쓰레드 2가 치고 들어옴)     ---> 100이었지만 2초 쉬는동안 유저2가 50으로 바꿈.	==>메모리 50됌.
						유저2 생성 -> set메모리 50해줘 + 2초간 정지																(2초끝)   메모리 출력해줘 : 50

 */




