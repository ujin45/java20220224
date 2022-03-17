package chap07.lecture.book.exercise.p06;

public class Child extends Parent{
	
	private String name;
	
	// 자식 생성자 1
	public Child() {
//		super();
		this("홍길동");
		System.out.println("Child() call");
	}
	
	// 자식 생성자 2
	public Child(String name) {
		super();  // (매개값, ...) 매개값의 타입과 일치하는 부모 생성자 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
