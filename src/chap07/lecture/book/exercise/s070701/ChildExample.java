package chap07.lecture.book.exercise.s070701;

public class ChildExample {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		Parent parent = child;
		parent.method1(); // 자동타입변환
		parent.method2(); // 재정의된 메소드 호출됨.
//		parent.method3(); 호출 불가능 정의된 적 없음.
	}
}
