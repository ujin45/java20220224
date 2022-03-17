package chap06.book.s061302.package1;

public class A {
	
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) { } // public 접근제한   : 모두 접근 가능
	A(int b) { }            // default 접근제한   : 내에서 접근 가능
	private A(String s) { } // private 접근제한 : 클래스 내에서만 가능 
}
