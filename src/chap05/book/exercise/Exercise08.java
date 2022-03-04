package chap05.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		
		int[][] array = { {95,86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		
		// 배열의 전체 항목의 합과 평균값을 구하세요 (for문)
		int nums = 0;
		for (int i=0; i < array.length; i++) {
		  for (int j=0; j < array[i].length; i++) {
			  sum += array[i][j];
		  }
		  nums += array[i].length;  
		}
		avg = (double)sum / nums;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
