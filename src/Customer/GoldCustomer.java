package Customer;

public class GoldCustomer extends Customer {
	//필드
	//부모에는 없는 할인율 필드에서 작성
	double saleRatio; //할인율
	
	
	//생성자
	//상속받은 코드 재정의(부모에게 생성자 두번째 Customer실행) 
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		//등급과 보너스적립비율은 기본(실버)와 다르기때문에 값을 초기화(재정의)해주기
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02; 
		this.saleRatio = 0.1;
	}
	
	//메소드
	//오버라이드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio); // 실버와는 달리 할인율이 있기때문에 가격에 할인율을 곱해준 후 기존 가격에서 뺀 값을 리턴한다
		
		
	}

}
