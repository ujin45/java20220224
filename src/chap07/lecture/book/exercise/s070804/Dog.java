package chap07.lecture.book.exercise.s070804;

public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	
	@Override
	public void sound() {
		System.out.println("멍멍");  // 추상메소드 재정의
		
	}
}
