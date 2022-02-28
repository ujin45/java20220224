package chap04.lecture.ifelse;

public class C03elseif {
	public static void main(String[] args) {
		
		// true true : 1,2,4,5,6,7,8,9
		// false true : 1,3,4,5,6,7,8,9
		// true false : 1,2,4,5,6,7,8,9
		System.out.println("statement 1");
		if (true) {
			
		System.out.println("statement 2");
		} else if (false) {
		System.out.println("statement 3");
		} 
		System.out.println("statement 4");
		System.out.println("statement 5");
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
		System.out.println("statement 9");
		
	}
}
