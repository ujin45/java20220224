package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
//		myMethod1();  // x
//		myMethod1(2); // x 
		myMethod1(3,5);  // 파라미터에서 두 개를 작성했으면 꼭 2개를 명시해야함!
		myMethod1(33, 55);
		myMethod1('가', 33);
		
		myMethod2(999,888);
		
	}
	
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void myMethod2(int age, int old) {
		System.out.println(age * 2);
		System.out.println(old * 2);
		
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
		// 다 가능함. 각 값에 맞게 명시하기 
	}
}
