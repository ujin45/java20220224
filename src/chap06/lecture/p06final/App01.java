package chap06.lecture.p06final;

public class App01 {
	
	public static void main(String[] args) {
		
		
		// final : 변수 선언시 값을 작성하면 한번만 할당할  수 있음.
		int i = 0;
		i = 3;
		
		final int j = 0;  // 한번만 가능
//		j = 1;  XXX 
		
		final int k;
		k = 9;  // 딱 한번만 할당 가능
//		k = 10;  XXX 
		
		method1(3);
		method1(10);
		
	}
	
	public static void method1(final int i) {
//		i = 30;  XXX  위에 선언 되어서 할당이 안 됨. 
	}
}
