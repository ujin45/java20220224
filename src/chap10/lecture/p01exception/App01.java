package chap10.lecture.p01exception;

public class App01 {
	public static void main(String[] args) {
		
		//NullPointException
		
		String s = "java";
		System.out.println(s.length());
		
		String t = null;
		System.out.println(t.length());  //NullPointException
		
		System.out.println("프로그램 계속 실행.....");
		
		
	}
}
