package test.ch11.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String data = "자바";
		
		byte[] arr1 = data.getBytes(); //utf-8로 인코딩
		System.out.println(Arrays.toString(arr1)); //배열을 문자열로변경
		
		String str1 = new String(arr1, "UTF-8"); //utf-8로인코딩
		System.out.println(str1); 
	}

}
