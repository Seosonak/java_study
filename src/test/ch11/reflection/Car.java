package test.ch11.reflection;

public class Car {
 public static void main(String[] args) throws ClassNotFoundException {
	
	 //Class clazz = Car.class;
	 Class clazz = Class.forName("test.ch11.reflection.Car");
	 
	 System.out.println("패키지이름:" + clazz.getPackage().getName());
	 System.out.println("클래스이름" + clazz.getSimpleName());
	 
}
}
