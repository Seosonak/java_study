package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123"; // 주민번호 (인덱스번호) 예: 9=0 5=1...
		char sex = ssn.charAt(6); // charAt(인덱스번호)
		int length = ssn.length();

		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;

		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// replace : 문자열 바꾸기 ("바꾸고싶은문자열", "바꿀문자열")
		String oldStr = "자바 문자열";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

		// substring : 문자열을 잘라줌
		// (0, 6): 0번 인덱스부터 6번 인덱스전까지 , (7) : 7번인덱스부터 끝자리까지
		String ssn1 = "950624-1230123";
		String firstName = ssn1.substring(0, 6);
		System.out.println(firstName);

		String secondName = ssn1.substring(7);
		System.out.println(secondName);

		// subject : () 안의 문자열 시작 인덱스를 찍어준다
		// 만약 존재하지않는 문자열일시 -1
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		//
		String substring = subject.substring(location);
		System.out.println(substring);
		// 위의 형식이 사용되는 예시
		if (location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}

		// contains : 문자열이 있는지 없는지 확인 ( 해당문자열이 포함되어있으면 ture 없으면 false)
		boolean result = subject.contains("자바");

		if (result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}

		// [] <<배열
		// split("") :""안에 분리하고싶은 문구 작성 문자열을 원하는 곳에서 분리 가능
		String board = "1,자바 학습,참조 타입 String 공부중";

		String[] tokens = board.split(",");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
