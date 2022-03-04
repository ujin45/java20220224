package chap05.lecture.reftype;

public class C07PrimitiveType {
	public static void main(String[] args) {
		
		int i1 = 3;
		method1(i1);
		System.out.println(i1);  // 3
		
	}
	
	public static void method1(int i) {
		
		i = 300; // i1이 아니라 i가 바껴서 i1의 값은 3
	}
}
