package chap06.book.s061303.package1;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;
	protected int field4;
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	
	public void method1() {}  // public 접근제한
	void method2() {}         // default 접근제한   
	private void method3() {} // private 접근제한
}
