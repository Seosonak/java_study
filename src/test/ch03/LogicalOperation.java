package test.ch03;

public class LogicalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리 연산자
		int charCode = 'A';
		
		if ((65<=charCode) & (charCode<=90)) { //65~90
			System.out.println("대문자다.");
		} // &는 앞이 flase면 뒤의 식도 실행
		
		if ((97<=charCode) && (charCode<=122)) { //97~122
			System.out.println("소문자다.");	
		} //&& 앞이 flase면 뒤의 식은 실행X
		
		if ((48<=charCode) && (charCode<=57)) { //48~57
			System.out.println("0-9 숫자다.");
		}
		
		int value = 6;
		
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		} // | 앞이 ture면 뒤의 식도 비교함
		
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		} // || 앞이 ture면 뒤의 식은 비교안함
		
		
		
		
		
	}

}
