package chap05.lecture.array;

import java.util.Arrays;

public class C15ArrayCopy {
	public static void main(String[] args) {
		
		// 그림 : 참조타입 08.png
		int[][] a = {{9,10},{3,4}};
		int[][] b = Arrays.copyOf(a,a.length);
		b[0][0] = 999;
		System.out.println(a[0][0]); // 999
		
	}
}
