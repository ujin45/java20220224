package chap05.lecture.string;

public class C06RegEx {
	public static void main(String[] args) {
		// regular expression 
		// 정규식(정규표현식)
		// 문자열의 패턴을 표현한 문자
		
		// 한 문자
		System.out.println("a".matches("a")); // true
		System.out.println("b".matches("a")); // false
		System.out.println("aa".matches("a")); // false
		System.out.println("abe".matches("a")); // false
		
		// 여러문자 중 하나 
		System.out.println("a".matches("[abc]")); // a 또는 b 또는 c true
		System.out.println("b".matches("[abc]")); // true
		System.out.println("c".matches("[abc]")); // true
		System.out.println("abc".matches("[abc][abc][abc]")); //true
		System.out.println("bbb".matches("[abc][abc][abc]")); //true
		
		//예제1
		// 전화번호 : 010-9999-9999
//		String pattern1 = "010-\\d\\d\\d\\d-\\d\\d\\d\\d";
		
	}
}
