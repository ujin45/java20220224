package chap07.lecture.book.exercise.s070701;

public class PromotionExample {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;   // 메소드가 자식 클래스에 오버라이딩 되었다면
		A a2 = c;   // 자식 클래스의 메소드가 대신 호출 된다.
		A a3 = d;   // 다형성과 관련이 있기 때문에 매우 중요한 성질!!! 
		A a4 = e;
		
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;  상속관계에 있지 않음
//		C c2 = d;  상속관계에 있지 않음
		
	}
}

class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
class D extends B {
	
}
class E extends C {
	
}