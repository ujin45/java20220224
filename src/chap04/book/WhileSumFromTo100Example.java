package chap04.book;

public class WhileSumFromTo100Example {
	public static void main(String[] args) {
		 
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		 
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}                             // 101인 false일때 빠져나오니까 -1 
}
