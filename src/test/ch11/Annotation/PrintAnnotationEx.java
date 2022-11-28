package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods()
				for(Method method: declaredMethods) {
					PrintAnnotation printAno = method.getAnnotation(PrintAnnotation.class);
					printLine(printAno);
				}
	}
public static void printLine(PrintAnnotation printAno) {
	if (printAno != null) {
		int number = printAno.number();
		
		String value =printAno.value();
	}
}
}
