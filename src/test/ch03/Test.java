package test.ch03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		int z = (++x) + (y--); 
		System.out.println(z);
		
		int score = 85; 
		String result = (!(score>90))? "가":"나"; 
		System.out.println(result);
		
	/*
		        char ch = 'A'; //65
		        char lowerCase = (    ); //a:97
		        System.out.println("ch:"+ch); //ch+a A
		        System.out.println("ch to lowerCase:"+lowerCase);
		     }
		}

*/
	}

}
