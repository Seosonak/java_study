package test.ch06.que;


public class Marine {
	//챕터6_클래스 : 16번 문제(병사의 공격력,방어력이 같아야한다)
	int x = 0, y = 0; //marine의 위치좌표(x,y)
	int hp = 60; //현재체력
	static int weapon = 6; //공격력
	static int armor = 0; //방어력

	
	
	static void weaponUp() {
		weapon++;
		
		
	}
	static void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
