package test.ch11.Object;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			// 엔터키를 읽지 않앗을때 실행
			if(keycode != 13 && keycode!= 10) { //13 10은 엔터
				if(keycode == 49) { //49는 숫자1
					speed++;
				}else if(keycode == 50) { //50 = 숫자2
					speed--;
				}else if(keycode == 51) {//숫자3
					break; //while문나옴
				}
				System.out.println("---------------");
				System.out.println("1.증속     2.감속     3.중지");
				System.out.println("---------------");
				System.out.println("현재속도=" + speed);
				
				System.out.println("선택: ") ;
		
			}
			keycode = System.in.read(); //키를 하나씩 읽음
		}
		System.out.println("프로그램빠이빠이");
	}

}
