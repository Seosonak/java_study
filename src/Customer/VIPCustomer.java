package Customer;

public class VIPCustomer extends Customer {
	//필드
	private int agentID; //상담원ID, 골드에 없기때문에 필드에 생성해줌
	double saleRatio; //등급별로 할인율이 다르기때문에 따로 줘야함
	
	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	
	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 아이디" + agentID;
	}


	public int getAgentID() {
		return agentID;
	}

}
