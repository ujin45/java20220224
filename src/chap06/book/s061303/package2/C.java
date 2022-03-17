package chap06.book.s061303.package2;

import chap06.book.s061303.package1.A;

public class C {
	public c() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;  // default 필드 접근 불가
		a.field3 = 1;  // private 필드 접근 불가
		
		a.method1();
		a.method2();  // default
		a.method3();  // private
	}
}
