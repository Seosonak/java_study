package test.ch06;

public class Earth {
	//상수(변수명대문자로선언)
	//변경X 전역변수(어디서든사용가능)
	static final double EARTH_RADIUS = 6400; //ㅈ;ㅣ구드ㅜㄹ레
	static final double EARTH_SURFACE_AREA;
	
	//스태틱블록 : 스태틱필드초기화해줄때
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
