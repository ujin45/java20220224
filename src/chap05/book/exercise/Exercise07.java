package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		// for문을 이용하여 최대값 구하기
		
//		for (int i=0; i < array.length; i++) {
//		    if(array[i] > max) {
//		    	max = array[i];
//		    }
//		}
//		
		for (int item : array) {
			if(item > max) {
				max = item;
			}
		}
		
		System.out.println("max: " + max);
	}
}
