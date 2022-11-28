package Musical;

public class Wed implements Base {

	@Override
	public void mainActor1() {
		System.out.println("주연1");

	}

	@Override
	public void mainActor2() {
		System.out.println("주연2");

	}

	@Override
	public void subActor1() {
		System.out.println("조연1");
		
	}

	@Override
	public void subActor2() {
		System.out.println("조연2");

	}

	@Override
	public void subActor3() {
		System.out.println("조연3");

	}

	@Override
	public int amTicket() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pmTicket() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ticketDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
