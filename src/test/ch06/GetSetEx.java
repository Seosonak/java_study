package test.ch06;

public class GetSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet getset = new GetSet();
		getset.setSpeed(10);
		System.out.println(getset.getSpeed());
		
		if(!getset.isStop()) { // 달리고 있을때 
			getset.setStop(true); //멈춤
		}
		System.out.println(getset.getSpeed());
	}

}
