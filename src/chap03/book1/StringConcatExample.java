package chap03.book1;

public class StringConcatExample {
	public static void main(String[] args) {
		
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		
		System.out.println(str2);
		
		// 어떤 것이 먼저 연산되느냐에 따라 결과가 다르다.
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + " JDK";
		
		System.out.println(str3);  // JDK33.0
		System.out.println(str4);  // 6.0JDK
		
	}
}
