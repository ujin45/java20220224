package chap02.lecture;

public class C03LiteralValue {
	public static void main(String[] args) {
		
		//정수 literal
		System.out.println(10);
		
		//실수 
		System.out.println(3.14);
		System.out.println(0.1);
		System.out.println(1.123445);
		
		//문자 (하나의 문자  '' 작은따옴표사용)
		System.out.println('a');
		System.out.println('b');
//		System.out.println('AB'); // x
//		System.out.println('');   // x
		System.out.println(' ');  // space 사용 가능
		System.out.println('가');
		System.out.println('0');
		System.out.println(); // 빈 줄 출력
		System.out.println();
		
		//문자열 ( 0개 이상의 문자나열  " " 큰 따옴표 사용)
		System.out.println("");
		System.out.println("A");
		System.out.println("ABC");
		System.out.println("👍👍");  // 이모티콘 가능
		System.out.println("hello world@#$%");
		System.out.println("hello\tworld");  // \t 탭
		System.out.println("hello\nworld");  // \n 다음줄
		System.out.println("I am \"ironman\"");  // \"
		System.out.println("backslash \\");     
		
		// 논리(boolean) true, false
		System.out.println(true);
		System.out.println(false);
	}
}	
