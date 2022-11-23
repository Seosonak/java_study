package test.ch10;

public class ExceptionEx1 {
	
	//메소드
	
	
	public static void printLength(String data) {
		//실행예외
		try { // try : 실행시킬 코드를 작성해준다
			int result = data.length(); //length : 스트링의 글자갯수뽑아온다
			System.out.println("문자 수 : " + result);
		} catch(NullPointerException e) { //어떤 에러를 잡을지 ()안에[잡고싶은 에러이름] 넣어준다
			//에러가 났을때 실행시킬 코드를 작성
			
			//예외처리정보를 얻는 세가지 방법
			
			/* 1.getM : 예외가 발생한 이유만 출력
			System.out.println(e.getMessage());
			*/
			
			/* 2.toS :예외가 발생한 이유 + 예외종류를 출력
			System.out.println(e.toString());
			*/
			
			// 3.printST : 예외 발생 이유 + 예외 종류 리턴 + 예외 발생한 곳 출력
			e.printStackTrace();
			
		} finally { //옵션, 예외처리구문에서 없어도 됨, 에러여부와 상관없이 마지막에 무조건적으로 실행됨
			System.out.println("마무리실행\n");
		}
		int result = data.length(); //length : 스트링의 글자갯수뽑아온다
				System.out.println("문자 수 : " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisisJava");
		
		//오류내용
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
		//at test.ch10.ExceptionEx1.printLength(ExceptionEx1.java:6)
		//at test.ch10.ExceptionEx1.main(ExceptionEx1.java:13)
		//NullPointerException는 클래스

		printLength(null); 
		System.out.println("프로그램종료");

	}

}

