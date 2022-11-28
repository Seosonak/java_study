package test.ch11.Format;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; //패ㅓ턴을 ㅓㅇ넣을 문자여르,전화번호채ㅔ크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		//패턴,검증하고싶은데이터  t/f
		
		regExp = "\\w+@\\w+\\.";

	}

}
