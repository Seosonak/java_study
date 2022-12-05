package test.ch16.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteEx2 {

	public static void main(String[] args) {
		try {
			// 출력스트림
			// 파일에쓴게아니라 버퍼에쓴것
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db"); // 파일을 만든다
			byte[] array = {10, 20, 30};
			
			fo.write(array); // 1byte씩 버퍼에 모아놓음 :
			
			fo.flush(); // 버퍼에있는 바이트를 출력하고 버퍼를 비움 :
			
			fo.close(); //출력스트림은 반드시 닫아서 샤용한 메모리를 해체해야한다
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
