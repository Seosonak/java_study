package ch14.Collection.List;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector<Board> list2 = new Vector<>(); //List는 vector의 부모 인터페이스(자동형변환)
		// list2.add(null);

		//Vector<Board> list = new Vector<>();		 //동기화 O, 잠금으로하여 2000개 정상생산.
		ArrayList<Board> list = new ArrayList<>();   //동기화 X (동기화 지원 X). 잠금을 못함. 부를때마다 값이 바뀜

		Thread threadA = new Thread() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) { 
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}

		};

		Thread threadB = new Thread() {

			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}

		};
		
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 종료될 때 까지 아래의 메인(main)스레드를 기다리게 하는 코드를 작성해야 한다.
		//미작성시 작업종료전에 밑의 메인 스레드가 먼저 끝나버려서 객체 수를 제대로 읽지 못하기 때문( 객체수 표기 : 0)
		
		try {
			threadA.join(); //join(); Waits for this thread to die. 
			threadB.join();
		} catch (Exception e) {
			
		}
		
		
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println("");

	}

}
