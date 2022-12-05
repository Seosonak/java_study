package test.ch16.stream;

import java.io.FileInputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		//
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while (true) {
				int num = is.read(data); // 최대 100byte를 읽는다 읽은 수는 리턴
				
				
				//읽을게없으면 -1을뱉는다 = 파일의끝에도달했을때
				if (num == -1) break;
				
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
				
//				System.out.println(data);
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

