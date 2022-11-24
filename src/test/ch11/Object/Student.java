package test.ch11.Object;

public class Student {
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no; //필드에 초기값 할당
		this.name = name;
		
	//메소드
		
	}

	public int getNo() {
		return no;
	}


	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode(); //번호,이름같을시 동일 해시코드생성
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student)	{
			Student target = (Student)obj;
			
			//no , name같은지 비교
			 if (no == target.getNo() && name.equals(target.getName()))
		}		return true;
		return false;
	}

	
}
