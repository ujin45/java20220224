package chap05.lecture;

public class C02EnhacedFor {
	public static void main(String[] args) {
		
		int[] arr = {-1,2,10,13};
		
		int sum = 0;

		// 예전 for문
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
		// 향상된 for 사용해서 arr의 모든 값 더해서 출력
		for(int item : arr) {
			sum += item; 
		}
		System.out.println(sum);
	}
}
