package chap06.book.s061303.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;  // private 접근 불가
		
		a.method1();
		a.method2();
		a.method3();  // private 접근 불가 
	}
}
