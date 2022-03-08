package chap05.lecture.string;

public class C02String {
	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("hello");
		
		String s3 = "java"; // new String 생략가능
		String s4 = "hello";
		
		// s1,s2, s3, s4 각각의 참조가 다름.  각각의 값과 기능이 있음.
		// 4개의 객체가 String class의 정의된 매소드를 가지고 있음.
		// length라는 메소드 
		
		System.out.println(s1.length()); // 4 
		System.out.println(s2.length()); // 5
		System.out.println(s3.length()); // 4
		System.out.println(s4.length()); // 5
		
		
		
		
		
	}
}
