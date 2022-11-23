package test.ch10.resource;

//AutoCloseable:리소스자동으로닫아주는기능을 사용하기위해 쓴다(인터페이스)
public class MyResource implements AutoCloseable{ 
	//필드
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource" + name +  "열기");
	}
	
	//메소드
	public String read1() {
		System.out.println("MyResource" + name +  "읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource" + name +  "읽기");
		return "abc";
	}

	//닫아주는기능 . ! ! 인터페이스이기때문에 추상메소드구현해줘야함 ! !
	@Override
	public void close() throws Exception {
		//파일을 닫을때 실행하고 싶은 코드 작성
		System.out.println("MyResource" + name + "닫기");
	}
}
