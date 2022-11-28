package test.ch11.Annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD})
public @interface PrintAnnotation {

	String value();
	int number();
}
