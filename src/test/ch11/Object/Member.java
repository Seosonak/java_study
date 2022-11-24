package test.ch11.Object;

public class Member { // 적혀 있지 않을 뿐 ,extends Object가 있다

	//필드
	public String id;
	
	//생성자
	public Member (String id) {
		this.id = id;
	}

	//논리적 동등 만들기(값으로 비교하게 만들기)
	@Override
	public boolean equals(Object obj) {
		// obj가 Member 객체를 가지고있니?
		if (obj instanceof Member) {  // 강제 형변환을 위해 검사
			Member target = (Member)obj; //강제 형변환 : 자식객체에 있는필드가져오기위해서
			
			if (id.equals(target.id)) { //여기의 eq는 스트링의eq.문자값비교
				return true;
			}
		}
		return false;
	}
	
}





/*
 public static void main(String[] args) { *오브젝트도 클래스이기때문에 객체로 생성가능! //
 * stack에서 obj1,obj2는 같은 주소를 갖는다 Object obj1 = new Object(); Object obj2 = obj1;
* 
* 번지수 비교. 같은주소를 가지고있기때문에 ture로 나온다! System.out.println(obj1.equals(obj2));
  System.out.println(obj1 == obj2);
  
  
  if (a == b) :X 주소를 비교 
  if (a.eqials(b)) :O 값을비교 
  String a = "1"; 
  String b = "2";
  
  
 * 논리적 동등 : 같은 객체,다른 객체여도 객체 저장 데이터가 동일
  
 */
