package test.ch12;


// 제너릭사용
// 1. class 클래스명<A~Z>
// 해당 클래스에서 제네릭 타입을 이용한다 선언
// 제너릭 : 클래스, 인터페이스, 메소드에 사옹가능
// 

public class Box<T> {
	
	// 콘텐츠 필드 타입으로 어떤것이 올지 모른다
	public T content;
	
}
