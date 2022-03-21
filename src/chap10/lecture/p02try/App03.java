package chap10.lecture.p02try;

public class App03 {
	public static void main(String[] args) {
		
		int i = 3;
		int j = 0;
		
		
		try {
		
			int k = i / j; //ArithmeticException-RuntimeException-Exception-Throwable
			               // 다형성의 의해서 다 가능함. 하위클래스로  상속받고 있어서.. 
			System.out.println("몫: " + k);
		
		} catch(ArithmeticException e) {
			// () : 발생한 exception 객체의 타입과 변수명 맞춰서 잘 기입하기 !!
			System.out.println("잘못된 연산입니다.");
		}
		
		System.out.println("프로그램 실행 계속...");
		
		
		
	}
}
