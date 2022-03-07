package chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		// 참조 변수
		String s1 = new String("java");
		String s2 = new String("java"); //인스턴스(객체)
		
		System.out.println(s1 == s2); // false 참조값을 비교 각각의 지정된 곳이 다르기 때문
		
		System.out.println(s1.equals(s2)); // true 내용물 비교 
		
		String s3 = "java";
		String s4 = "java";
		System.out.println(s3 == s4); // 참조값 비교 
		
		
	}
}
