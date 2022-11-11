//패키지 : 코드를 묶어주는 애.이클립스 프로젝트 만들시 제일 처음 만들어야함
//클래스 : 네임의 시작은 대문자로 / public static 체크

//[C + f11:코드실행] [] 
//주석(C + /) : [//:한줄] [/* */:여러줄] [/** */:api도큐먼트 작성시(설명을 길게 달아야할때)] 

//vs코드에서 콘솔같은 것 = System.out.println("");
//이클립스는 코드가 끝날때마다 ;를 필수로 달아줘야함 : 안그럼오류
//메인안의 코드가 제일 먼저 실행됨(실행시키고 싶은 코드는 메인안에 작성)

package test.ch01;

public class Hello {

	public static void main(String[] args) {
		//진수		
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		
		System.out.println("결과1=" + var1 + ":" + var2 + ":" + var3 + ":" + var4);
		
		
		//lon.g
		long var5 = 100000L; //롱타입작성시 끝에 L표기 (대소문자구분X)
		float var6 = 0.123412521431f; //float작성시 끝에 F표기 (대소문자구분x)
		double var7 = 0.123412521431;
		double var8 = 3e6; //3.0 * 10^6
		double var9 = 2e-3; //2.0 *1-^-3
		
		System.out.println("결과2=" + var5);
		System.out.println("결과3=" + var6 + ", " + var7);
		System.out.println("결과4=" + var8);
		System.out.println("결과5=" + var9);
		
		
		//문자열
		char c1 = 'A'; //한글자만 가능 ,작은따옴표
		char c2 = 65; //65는 유니코드로 A
		String name="\n김봄\n보구싶따"; //긴문자열 or 한문자열 ,큰따옴표, 
		String one="V"; //문자열하나
		//:  \\이스케이프
		//ex1. \'봄\' = 'A'
		//ex2. \"봄\" = "A"
		//ex3. \\봄\\ = \A\
		//ex4. \n봄\n = 줄바꿈
		//ex5. \t봄\t = 띄어쓰기
		
		System.out.println("결과6=" + c1 + ", " + c2);
		System.out.println("결과7=" + name + one);
				
		
		//boolean과 if문 (true,false)
		boolean stop = true;
		int x = 10;
		boolean result1 = (x == 20);
		System.out.println("결과8=" + result1);
		
		if (stop) {
			System.out.println("결과9=" + "정지합니다");
		}
				

	}
	
	

}
