package Customer;

public class Customer {
	// 필드
		// protected : 상속,같은패키지안에서만 사용가능
		protected int customerID; // 고객아이디
		protected String customerName; // 고객이름
		protected String customerGrade; // 고객등급
		int bonusPoint; // 보너스 포인트 적립
		double bonusRatio; // 보너스 포인트 적립 비율

		// 셍성자
		public Customer() {
			initCustomer();
		}

		public Customer(int customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			initCustomer();
		}

		// 메소드

		// 고객 등급 초기화
		// private : 해당패키지안에서만쓸수잇게
		private void initCustomer() {
			this.customerGrade = "SILVER"; // 기본실버등급
			bonusRatio = 0.01; // 기본실버등급의 포인트적립액
		}

		// 보너스 포인트 계산, 가격 리턴
		public int calcPrice(int price) { // price : 지불금액
			bonusPoint += (price * bonusRatio); // 포인트는 항상 누적되기때문에 +=로 합산해준다 , 보너스비율을 계산해서 보너스포인트를 적립
			return price; // 기본등급(실버)는 할인율이 없기때문에 단순히 지불금액값 그대로 리턴해주면된다
		}

		// 고객정보 보여주기
		public String showCustomerInfo() {
			return customerName + "님의 등급:" + customerGrade + ", 보너스 포인트: " + bonusPoint + "점";
		}

		
		//get,set 메소드 특별히 건들것은없다
		//get 해당객체에서 값 얻어올때
		//set 해당객체의 값을 수정할때
		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerGrade() {
			return customerGrade;
		}

		public void setCustomerGrade(String customerGrade) {
			this.customerGrade = customerGrade;
		}
		
		//get,set끝

}
