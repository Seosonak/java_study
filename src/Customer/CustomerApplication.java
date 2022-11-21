package Customer;

import java.util.ArrayList;

public class CustomerApplication {

		//Customer 객체(고객)을 저장할 ArrayList를 생성
		private static ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//일반고객 (실버)
			Customer customerLee = new Customer(10010, "이순신"); // ID는 유일한값.중복X
			Customer customerShin = new Customer(10020, "신사임당");
			
			//골드고객
			Customer customerHong = new GoldCustomer(10030, "홍길동");
			Customer customerYul = new GoldCustomer(10040, "정약용");
			
			
			//VIP고객
			Customer customerKim = new VIPCustomer(10050, "이율곡", 12345);
			
			customerList.add(customerLee);
			customerList.add(customerShin);
			customerList.add(customerHong);
			customerList.add(customerYul);
			customerList.add(customerKim);
			
			//모든고객정보
			showAllCustomer();
			
			
			
		
			//id로 고객찾기
			//customer객체를받는다
			//Customer customer = findCustomer(10040);
			
			Customer customer = findCustomer(10040);
			
			//id로 찾은 고객의 실제 지불금액,보너스포인트 출력
			if (customer == null) { //null일경우의 출력
				System.out.println("존재하지 않는 회원입니다.");
			} else { //고객의 실제 지불금액,보너스 포인트
				showPriceBonus(customer, 300000);
			}
			
			
		}
		
		
		//메소드 (모든 고객정보 출력)
		public static void showAllCustomer() {
			System.out.println("======== 모든 고객 정보 출력 ========");
			for (Customer customer : customerList) {
				System.out.println(customer.showCustomerInfo());
			}
		}

		//id로 고객 객체를 찾아주는 메소드
		//return타입이 Customer . 
		public static Customer findCustomer(int customerID) {
			Customer ResultCustomer = null; //기본:아무것도X
		//Customer >  데이터타입		
			
			for (Customer customer : customerList) {
				// 해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교
				if (customer.getCustomerID() == customerID){
					ResultCustomer = customer;
					break;
				}
			
			}
			return ResultCustomer; //해당객체를 찾지못하면 null을 리턴해준다
		}
		public static void showPriceBonus(Customer customer, int price) { //price : 물건살때지불한금액
			System.out.println("======= 해당 고객의 할인율과 보너스 포인트 계산 ======");
			int cost = customer.calcPrice(price);  //지불할비용출력
			System.out.println(customer.getCustomerName() + "님의 지불금액 : " + cost + "원");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트" + customer.bonusPoint + "점");
		

	}

}
