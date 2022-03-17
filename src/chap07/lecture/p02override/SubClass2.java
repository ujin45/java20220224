package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {
	
	@Override
	public void method1() {
		// super : 상위클래스 멤버에 접근하기 위해 사용
		System.out.println("서브클래스2의 메소드1이 하는 일..");
		super.method1(); // 순서는 상관 없음.
		
		System.out.println("또 다른 일..");
	}
}
