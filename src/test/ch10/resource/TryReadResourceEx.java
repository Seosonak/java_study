package test.ch10.resource;

public class TryReadResourceEx {

	public static void main(String[] args) {
		//try안에 열고싶은 리소스 객체 생성
		// 객체를 try안에 생성 res를 통해
		try(MyResource res = new MyResource("A")) { 
			String data = res.read1();
			int value = Integer.parseInt(data); //int형 변환
		} catch(Exception e) {
			 System.out.println(e.getMessage());
		}

		//read2 return값 abc
		try(MyResource res = new MyResource("B")) { 
			String data = res.read2(); //NumberFormatException 에러 발생 : abc이기때문에~
			int value = Integer.parseInt(data); //int형 변환
		} catch(Exception e) {
			 System.out.println(e.getMessage());
		}
	}

}
