package test.ch16.file;

import java.io.File;
import java.io.IOException;
public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images"); //파일 경로 객체 생성
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:/Temp/file3.txt");
		
		//exists : 해당파일이 존재하는지 
		if(dir.exists() == false) { dir.mkdir(); } //dir.mkdir : 디렉토리 생성 
		if(file1.exists() == false) { file1.createNewFile();} 
		
		//temp폴더의 파일 폴더리스트 출력
		File temp = new File("C:/Temp");
		File[] content = temp.listFilses();  //
		
		
		for (Fils file : Contents) {
			if(file.isDirectory()) { //폴더에있늩지판단
				System.out.println(file.getName());
			} else  
			{
				System.out.println(file.getName());
			}
		}
	}

}
