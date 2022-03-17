package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);
		
//		MyInterface2.field1 = 33;  XX 개념이라서 인스턴스를 만들 수 없음
//		MyInterface2.field2 = 99;  XX  
		
		MyInterface o1 = new MyInterface2(); // 개념이라 인스턴스 만들 수 없음
		
		
		
	}
}
