package chap10.book.exercise;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0]: " + data1);
//		System.out.println("args[1]: " + data2);
		
		if(args.length == 2) {
			
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java  ArrayIndexOutOfBoundsExceptionExample  ");
			System.out.println("값1   값2");
		}
	}
}
