package chap03.lecture.binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		int n1 = 2000000000;
		int n2 = 1000000000;
		
		System.out.println(n1 + n2); // int의 최대값 21억이 넘어서 다른 값이 나옴 (overflow)
		
		int n3 = -2000000000;
		int n4 = -1000000000;
		
		System.out.println(n3 + n4); // underflow 표현할 수 없는 범위
		
		long n5 = 2000000000;
		long n6 = 1000000000;
		 
		System.out.println(n5 + n6); 
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		
		System.out.println(n7 + n8);
		
	}
}
