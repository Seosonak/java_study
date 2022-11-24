package test.ch11.System;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "홍길동&이수홍, 박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2,"/");
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
