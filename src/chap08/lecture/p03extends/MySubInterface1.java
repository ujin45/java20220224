package chap08.lecture.p03extends;

public interface MySubInterface1 extends MySuperInterface1, MySuperInterface2 {

	void subMethod1();
	
	// MySuperInterface1의 요소
	// MySuperInterface2의 요소
	
	default void superDefaultMethod1() {
		System.out.println("서브 인터페이스에서 superDefaultMethod 재정의");
	}
}
