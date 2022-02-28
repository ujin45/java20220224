package chap04.lecture.ifelse;

public class C01If {
	public static void main(String[] args) {
		System.out.println("statement 1");
		
		// if 조건의 값이 true이면 값은 statement 1,2,3,4
		//            false이면 값은 statement 1,4
		if(false) {
			System.out.println("statement 2");
			System.out.println("statement 3");
		}
		System.out.println("statement 4");
		
	}
}