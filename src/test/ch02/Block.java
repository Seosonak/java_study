package test.ch02;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//v2는 블럭안에 있어서 오류가 남 , 안에서 밖 : 접근가능/밖에서 안 : 불러오기안됨
		int v1 = 15;
			
		if (v1 > 10) {
			@SuppressWarnings("unused")
			int v2 = v1 - 10;
		}
		//i.nt v3 = v1 + v2 + 5;
		
		
		
	}

}
