package chap09.book.exercise.p090301;

import chap06.book.s061301.package1.B;
import chap06.book.s061301.package2.C;

public class A {
	
	//인스턴스
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
		
	}
	
	//정적 필드 초기화
	//static B field3 = new B(); X
	static C field4 = new C();
	
	
	//정적 메소드
	static void mehtod2() {
		//B var1 = new B();   X
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B{
		
	}
	
	//정적 멤버 클래스
	static class C {
		
	}
	
}
