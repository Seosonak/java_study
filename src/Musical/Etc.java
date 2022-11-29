package Musical;
//티켓가격과 평일할인율,재관람할인율
public class Etc {

	//필드
	int price;
	double reDiscount;  //재관람30퍼
	double weekDiscount;  //평일10퍼
	
	//메소드 '-'..음
	public Etc() {}
	
	//생성자
	
	//티켓기본가격 
	int price() {
		return price = 50000;
	}
	     
	
	//재관람할인
	double reDiscount() {
		return reDiscount = 30.0;
	}
	
	//평일할인
	double weekDiscount() {
		return weekDiscount = 15.0;
		
	}
	
	//평일할인계산
	public int weekPrice(int Price) {
		return Price - (int)(price * weekDiscount);
		
	}
	
	//재관람할인계산
	public int endPrice(int Price) {
		return Price - (int)(price * reDiscount);
		
	}
}
