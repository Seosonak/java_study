package test.ch15.lamda;

//컴파일과정에서 추상메소드하나인지검사
@FunctionalInterface
public interface Calculable2 {
	double calc(double x, double y);
}
