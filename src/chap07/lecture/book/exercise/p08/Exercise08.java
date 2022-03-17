package chap07.lecture.book.exercise.p08;

public class Exercise08 {
	
	void execute() {
		B b1 = new B();
		B b2 = new D();
		B b3 = new E();
		B b4 =(B)new A(); // 문법 오류는 없지는 실행이 되지 않음.
		
		method(new B());
		method(new D());
		method(new E());
//		method(new B() new A()); // XXX
		
		A a1 = new D();
		method((B) a1); // ? -> 실행됨
		
	}
	
	public static void method(B b) {
		
	}
}
class A {
	
}
class B extends A {
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends B{

	
}