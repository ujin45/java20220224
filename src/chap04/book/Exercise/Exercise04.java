package chap04.book.Exercise;

public class Exercise04 {
	public static void main(String[] args) {
		
		boolean more = true;
		while(more) {
			int num1 = (int)(Math.random()*6 + 1);
			int num2 = (int)(Math.random()*6 + 1);
			
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if ((num1 + num2) == 5) {
				more = false;
			}
		}
		
//		int num1 = 0;
//		int num2 = 0;
//		while (num1 + num2 != 5) {
//			num1 = (int)(Math.random()*6 + 1);
//			num2 = (int)(Math.random()*6 + 1);
//		}
//		System.out.println("(" + num1 + "," + num2 + ")");
	}
	
}
