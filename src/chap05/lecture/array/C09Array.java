package chap05.lecture.array;

public class C09Array {
	public static void main(String[] args) {
		
		int[][] a = {{10,2,1},{3,3,3},{9,8,7}};
		method1(a);
		System.out.println(a[2][2]);
		
		int[][] b = {{1,1,1},{2,3,4}};
		method1(b);
		System.out.println(b[1][2]);  // 16
		
		int[][] c= {{3,2},{2,3,4,5,6,7,8}};
		method1(c);
		System.out.println(c[1][6]); 
		
		int[][] d = {{3,1}};
		method1(d);
		System.out.println(d[0][1]);
		
		int[][] e = {{10}};
		method1(e);
		System.out.println(e[0][0]); 
		
	}
	
	public static void method1(int[][]s) {
		s[s.length-1][s[s.length-1].length-1] *= 
				s[s.length-1][s[s.length-1].length-1];  
	}
}
