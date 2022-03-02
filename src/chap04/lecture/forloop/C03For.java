package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		int i; // for 문 종료 후에도 사용하기 원할 때 for문 이전에 선언하면 됨. 
		for ( i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);  // 코드블럭 안에서만 가능함. 선언을 하고 하면 가능함.
		
		
	}
}
