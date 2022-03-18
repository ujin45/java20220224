package chap09.lecture.p02anonymous;

public class App09 {
	
	public static void main(String[] args) {
		
		MyInterface1 o1 = new MyInterface1() {
			
			@Override
			public void method1() {
				System.out.println("추상 메소드 재정의!!");
				method2();
			}
			
			public void method2() {
				System.out.println("필요해서 만든 메소드 ");
			}
		};
		
		o1.method1();
		o1.method2();  // MyInterface1 에 method2 정의가 없어서 사용 불가능 
		               // but 디폴트로 정의하면 사용가능.   
	}
}
