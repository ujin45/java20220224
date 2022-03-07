package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		
		int[] a = {-1, 9,2,3,10};
		System.out.println(a);
		System.out.println(Arrays.toString(a)); // 내용을 바로 출력함
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));  // 내용의 순서대로 배열해서 출력
		
		int[] b = new int[0];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = 5;
//		}
//		
		Arrays.fill(b,5);
		System.out.println(Arrays.toString(b));
		
	}
}
