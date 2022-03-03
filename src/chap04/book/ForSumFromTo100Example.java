package chap04.book;

public class ForSumFromTo100Example {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum);
		System.out.println("1~" + " 합 : " + sum);
	}
}
