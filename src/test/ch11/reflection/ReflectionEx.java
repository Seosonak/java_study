package test.ch11.reflection;

import java.lang.reflect.*;

public class ReflectionEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			
		}
		
		System.out.println("[필드정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("[메소드정보]");
		Method[] method = clazz.getDeclaredMethods();
	}
private static void printParameteres(Class[] parameters) {
	for (int i=0; i<parameters.length; i++) {
		System.out.println(parameters[i].getName());
		if  (i<(parameters.length-1)) {
			System.out.println();
		}
	}
}
}
