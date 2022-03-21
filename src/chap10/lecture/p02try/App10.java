package chap10.lecture.p02try;

public class App10 {
	public static void main(String[] args) {
		
		//return 명령문 실행되어도 finally block 실행됨.
		
		String s = null;
		
		try {
			System.out.println(s.length());
			
			System.out.println("try block 실행");
			return;
			
		} catch (NullPointerException e){
			System.out.println("널포인터익세셥 발생");
		} finally {
			//꼭 실행하고 싶은 것 할때 사용.
			System.out.println("리턴실행되어도 무조건 실행");
		}
		
		System.out.println("프로그램 실행 계속..");
	}
}
