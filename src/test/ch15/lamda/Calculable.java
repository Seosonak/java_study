package test.ch15.lamda;

//추상메소드가하나만잇는ㄴ지검사
@FunctionalInterface
public interface Calculable {
	void caculate(int x, int y);
}
