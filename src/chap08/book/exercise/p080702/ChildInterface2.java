package chap08.book.exercise.p080702;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() { /*실행문*/ }  // 재정의
	
	public void method3();
}
