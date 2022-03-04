package chap05.lecture.reftype;

public class C05ReferenceType {
	public static void main(String[] args) {
		
		int i1 = 3;
		method1(i1);
		
		System.out.println("main");
		System.out.println(i1);
		
		int[] arr1 = new int[] {3, 2, 1};  // 첫번째 실행
		method2(arr1);
		System.out.println("main");        // 다섯번째
		System.out.println(arr1[0]);       // 여섯번째  
	}
	
	public static void method2(int[] arr) {
		arr[0] =30;   //인스턴스                              // 두번째 실행  
		System.out.println("method2");     // 세번째
		System.out.println(arr[0]);        // 네번째   
	}
	public static void method1(int i) {
		
		i = 5;
		System.out.println("method1");
		System.out.println(i);
		
		
	}
}
