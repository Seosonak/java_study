package T;

public class Customer {
	// 필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	// 생성자
	public Customer() {
		initCustomer();  //초기값 init
	}
	
	public Customer(customerID, customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//메소드
	
	//고객등급초기화
	private void initCustomer() {
		this.customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	// 보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
	}
 }
