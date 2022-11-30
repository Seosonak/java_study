package test.ch12.wlid;

public class Applicant<T> {
	public T kind;
	//생성자
	public Applicant(T kind) {
		this.kind = kind;
	}

}
